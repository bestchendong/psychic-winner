package com.trust.ucenter.controller.user;

import com.trust.oss.service.FileService;
import com.trust.oss.service.SmsService;
import com.trust.oss.util.OssTools;
import com.trust.ucenter.Constants;
import com.trust.ucenter.entity.UcUser;
import com.trust.ucenter.service.UcUserService;
import com.trust.ucenter.utils.result.ResponseData;
import com.trust.ucenter.utils.result.ResultData;
import com.trust.ucenter.utils.special.JwtUtil;
import com.trust.ucenter.utils.special.MD5Util;
import com.trust.ucenter.utils.special.RandomString;
import io.jsonwebtoken.Claims;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/**
 *
 */
@Api(value = "/user",description = "用户相关接口")
@RestController
@RequestMapping("/user")
public class UcUserController {

    @Value("${oss.uploadpath}")
    private String uploadpath;

    //手机
    private String phoneReg = "^[1][3,4,5,7,8][0-9]{9}$";
    //昵称 数字字母中文
    private  String nicknameReg = "^[a-z0-9A-Z\u4e00-\u9fa5]{1,8}$";

    //手机短信验证码 存活时长 秒
    @Value("${phone.code.survival.time}")
    private String phoneCodeSurvival;

    //#登录失败次数
    @Value("${login.fail.count}")
    private String loginFailCount;

    //登录超过失败次数后，重新登录时长秒
    @Value("${login.fail.again.time}")
    private String loginFailAgainTime;

    //登录失败 redis 前缀
    @Value("${login.fail.count.redis.pre}")
    private String loginFailCountPre;

    //获取注册 修改密码 手机验证码  redis前缀
    @Value("${phone.code.redis.pre}")
    private String phoneCodeRedisPre;


    //发送短信
    @Autowired
    private SmsService smsService;

    @Autowired
    private UcUserService ucUserService;
    //redis缓存
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private FileService fileService;

    /**
     * 注册
     * @param user
     * @return
     */
    @ApiOperation(value="注册用户",notes="注册用户 实名状态1：已实名 2：未实名 3：审核中 0：审核不通过")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user", value = "用户", required = true,  paramType = "body",dataType = "user"),
    })
    @RequestMapping(value = "/registry",method = RequestMethod.POST)
    public ResponseData registry(@RequestBody UcUser user){
        System.out.println("registry user:"+user.toString());
        String phone = user.getPhone();
        if(phone==null || "".equals(phone)){
            return new ResponseData(Constants.UCENTER_5002_CODE,"手机号码为空",user);
        }
        //校验手机号
        Pattern p = Pattern.compile(phoneReg);
        if(!p.matcher(phone).matches()){
            return new ResponseData(Constants.UCENTER_5002_CODE,"手机号码输入格式错误",phone);
        }else{
            UcUser ucUser = ucUserService.selectByPhone(phone);
            if(ucUser!=null){
                return new ResponseData(Constants.UCENTER_5002_CODE,Constants.UCENTER_5002_MSG,ucUser);
            }
        }
        //昵称
        String nickname = user.getNickname();
        if(nickname==null || "".equals(nickname)){
            return new ResponseData(Constants.UCENTER_5001_CODE,"昵称为空",user);
        }
        p = Pattern.compile(nicknameReg);
        if(!p.matcher(nickname).matches()){
            return new ResponseData(Constants.UCENTER_5001_CODE,"昵称格式错误",nickname);
        }else{
            UcUser ucUser = ucUserService.selectByNickname(nickname);
            if(ucUser!=null){
                return new ResponseData(Constants.UCENTER_5001_CODE,Constants.UCENTER_5001_MSG,ucUser);
            }
        }
        String password = user.getPassword();
        if(password==null || "".equals(password)){
            return new ResponseData(Constants.UCENTER_5005_CODE,"密码为空",password);
        }
        if(!(password.matches("^.*[a-zA-Z]+.*$") && password.matches("^.*[0-9]+.*$") && password.matches("^.{8,16}$"))){
            return new ResponseData(Constants.UCENTER_5005_CODE,Constants.UCENTER_5005_MSG,password);
        }
        //密码md5
        user.setPassword(MD5Util.makeMD5(user.getPassword()));
        int insert = ucUserService.insertSelective(user);
        if(insert==1){
            /*//系统标识
            int platfromId = user.getPlatformId();
            //系统用户同步通道
            String chnnal = "";
            if(platfromId==1){
                chnnal = "rnt";
            }*/
            UcUser ucUser = ucUserService.selectByPhone(phone);
            Integer userId = ucUser.getUserId();
            Map userMap = ucUserService.myInfo(userId);
            //将注册成功的用户  同步到通道中
//            redisTemplate.convertAndSend(chnnal, JSON.toJSONString(ucUser));
            //返回结果
            userMap.put("jwt", JwtUtil.createJWT(ucUser.getNickname(),ucUser.getUserId(),ucUser.getPhone()));
            return new ResponseData(Constants.UCENTER_200_CODE,"success",userMap);
        }else{
            return new ResponseData(Constants.UCENTER_5006_CODE,Constants.UCENTER_5006_MSG,user);
        }
    }

    /**
     * 手机验证码
     * @param phone
     * @return
     */

    @ApiOperation(value="获取手机验证码",notes="获取手机验证码")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true,  paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "flag", value = "业务标识registry/login/uppassword", required = true,  paramType = "query",dataType = "String")
    })
    @RequestMapping(value = "/getcode",method =  RequestMethod.GET)
    public ResponseData getcode(@RequestParam(value = "phone",required = true) String phone,@RequestParam(value = "flag",required = true) String flag){
        //校验手机号
        Pattern p = Pattern.compile(phoneReg);
        if(!p.matcher(phone).matches()){
            return new ResponseData(Constants.UCENTER_5002_CODE,"手机号码输入格式错误","");
        }else{
            String key = flag+"_"+phoneCodeRedisPre+phone;
            ValueOperations<String, String> operations = redisTemplate.opsForValue();
            // 缓存存在
            boolean hasKey = redisTemplate.hasKey(key);
            System.out.println("has"+key+":"+hasKey);
            if (hasKey) {
                String code = operations.get(key);
                return new ResponseData(Constants.UCENTER_200_CODE,"success","");
            }
            String code = RandomString.generateRandomString(4);
            String ret = smsService.sendSms(phone,"睿农通","SMS_111710206","{'code':'"+code+"'}");
            System.out.println("短信测绘ret："+ret);

            try {
                JSONObject jsonObject  = new JSONObject(ret);
                Boolean success = jsonObject.getBoolean("success");
                if(success){
                    // 插入缓存
                    operations.set(key, code, Long.parseLong(phoneCodeSurvival), TimeUnit.SECONDS);
                    System.out.println("插入后has"+key+":"+ operations.get(key));
                    return new ResponseData(Constants.UCENTER_200_CODE,"success",null);
                }else{
                    String errorCode = jsonObject.getString("errorCode");
                    if("isv.BUSINESS_LIMIT_CONTROL".equals(errorCode)){//触发分钟级流控Permits

                    }
                    return new ResponseData(Constants.UCENTER_5003_CODE,"请过会再试","");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return new ResponseData(Constants.UCENTER_200_CODE,"success",null);
        }

    }

    @ApiOperation(value="手机验证码校验",notes="手机验证码是否输入正确")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true,  paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "code", value = "验证码", required = true,  paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "flag", value = "业务标识registry/login/uppassword", required = true,  paramType = "query",dataType = "String")
    })
    @RequestMapping(value = "/codecheck",method =  RequestMethod.GET)
    public ResponseData codecheck(@RequestParam(value = "phone",required = true) String phone,@RequestParam(value = "code",required = true) String code,
            @RequestParam(value = "flag",required = true) String flag){
        //校验手机号
        Pattern p = Pattern.compile(phoneReg);
        if(!p.matcher(phone).matches()){
            return new ResponseData(Constants.UCENTER_5002_CODE,"手机号码输入格式错误",phone);
        }else{
            String key = flag+"_"+phoneCodeRedisPre+phone;
            ValueOperations<String, String> operations = redisTemplate.opsForValue();
            // 缓存存在
            boolean hasKey = redisTemplate.hasKey(key);
            if (hasKey) {
                String catchCode = operations.get(key);
                if(code.equals(catchCode)){
                    return new ResponseData(Constants.UCENTER_200_CODE,"success",null);
                }else{
                    return new ResponseData(Constants.UCENTER_5003_CODE,Constants.UCENTER_5003_MSG,code);
                }

            }else{
                return new ResponseData(Constants.UCENTER_5004_CODE,Constants.UCENTER_5004_MSG,code);
            }

        }

    }
    /**
     * 登录名获取userid
     */
    @RequestMapping(value = "/getUserIdByLoginName",method = RequestMethod.GET)
    public Integer getUserIdByLoginName(@RequestParam(value = "loginName",required = true) String loginName){
        Map paraMap  = new HashMap();
        paraMap.put("loginName", loginName);
        UcUser ucUser = ucUserService.selectByLogin(paraMap);
        return ucUser.getUserId();
    }

    /**
     * 手机号码验证
     * @param phone
     * @return
     */
    @ApiOperation(value="手机号码验证",notes="手机号码验证")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号码", required = true,  paramType = "query",dataType = "String"),
    })
    @RequestMapping(value = "/phonecheck",method = RequestMethod.GET)
    public ResponseData phonecheck(@RequestParam(value = "phone",required = true) String phone){
        System.out.println("phone:"+phone);
        //校验手机号
        Pattern p = Pattern.compile(phoneReg);
        if(!p.matcher(phone).matches()){
            return new ResponseData(Constants.UCENTER_5002_CODE,"手机号码输入格式错误",phone);
        }else{
            UcUser ucUser = ucUserService.selectByPhone(phone);
            if(ucUser!=null){
                return new ResponseData(Constants.UCENTER_5002_CODE,Constants.UCENTER_5002_MSG,phone);
            }
            return new ResponseData(Constants.UCENTER_200_CODE,"success",null);
        }
    }

    /**
     * 昵称
     * @param nickname
     * @return
     */

    @ApiOperation(value="昵称验证",notes="昵称是否已存在")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "nickname", value = "昵称", required = true,  paramType = "query",dataType = "String"),
    })
    @RequestMapping(value = "/nickname",method = RequestMethod.GET)
    public ResponseData nickname(@RequestParam(value = "nickname",required = true) String nickname){
        //校验昵称
        Pattern p = Pattern.compile(nicknameReg);
        if(!p.matcher(nickname).matches()){
            return new ResponseData(Constants.UCENTER_5001_CODE,"昵称格式错误",nickname);
        }else{
            UcUser ucUser = ucUserService.selectByNickname(nickname);
            if(ucUser!=null){
                return new ResponseData(Constants.UCENTER_5001_CODE,Constants.UCENTER_5001_MSG,ucUser);
            }
            return new ResponseData(Constants.UCENTER_200_CODE,"success",null);
        }
    }

    /**
     * 密码
     * @param password
     * @return
     */

    @ApiOperation(value="密码验证",notes="密码要求数字和字母组合8-16位")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "password", value = "密码", required = true,  paramType = "query",dataType = "String")
    })
    @RequestMapping(value = "/password",method = RequestMethod.GET)
    public ResponseData password(@RequestParam(value = "password",required = true) String password){
        if(password==null || "".equals(password)){
            return new ResponseData(Constants.UCENTER_5005_CODE,"密码为空",password);
        }
        if(password.matches("^.*[a-zA-Z]+.*$") && password.matches("^.*[0-9]+.*$") && password.matches("^.{8,16}$")){
            return new ResponseData(Constants.UCENTER_200_CODE,"success",password);
        }else{
            return new ResponseData(Constants.UCENTER_5005_CODE,Constants.UCENTER_5005_MSG,password);
        }
    }

    /**
     * 登录
     * @param phone
     * @param code
     * @param request
     * @return
     */

    @ApiOperation(value="手机验证码登录",notes="手机验证码登录  实名状态1：已实名 2：未实名 3：审核中 0：审核不通过")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true,  paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "code", value = "验证码", required = true,  paramType = "query",dataType = "String")
    })
    @RequestMapping(value = "/loginbycode",method = RequestMethod.GET)
    public ResponseData loginByCode(@RequestParam(value = "phone",required = true) String phone, @RequestParam(value = "code",required = true) String code,
                              HttpServletRequest request){
        //校验手机号
        Pattern p = Pattern.compile(phoneReg);
        if(!p.matcher(phone).matches()){
            return new ResponseData(Constants.UCENTER_5002_CODE,"手机号码输入格式错误",phone);
        }else{
            UcUser ucUser = ucUserService.selectByPhone(phone);
            if(ucUser==null){
                return new ResponseData(Constants.UCENTER_5101_CODE,"当前手机号未注册,请先进行注册",phone);
            }
            String key = "login_"+phoneCodeRedisPre+phone;
            ValueOperations<String, String> operations = redisTemplate.opsForValue();
            // 缓存存在
            boolean hasKey = redisTemplate.hasKey(key);
            if (hasKey) {
                String catchCode = operations.get(key);
                //验证码正确
                if(code.equals(catchCode)){
                   /* //登录成功 设置session
                    System.out.println("ucUser:"+ucUser);
                    HttpSession httpSession = request.getSession(true);
                    UserInfoVo userInfoVo = new UserInfoVo();
                    userInfoVo.setLoginName(ucUser.getNickname());
                    userInfoVo.setNickName(ucUser.getNickname());
                    userInfoVo.setMemberId(String.valueOf(ucUser.getUserId()));
                    userInfoVo.setMobile(ucUser.getPhone());
                    httpSession.setAttribute("userInfo",userInfoVo);*/
                    //移除登录次数
                    //获取userId
                    int userId = ucUser.getUserId();
                    key = loginFailCountPre+userId;
                    //判断当前是否在锁定期  存在登录次数小于0
                    HashOperations<String, String, Integer> vo = redisTemplate.opsForHash();
                    // 缓存存在
                    hasKey = vo.hasKey(key,"count");
                    if (hasKey) {
                        vo.delete(key, "count");
                    }
                    //返回结果
                    Map userMap = ucUserService.myInfo(userId);
                    userMap.put("jwt", JwtUtil.createJWT(ucUser.getNickname(),ucUser.getUserId(),ucUser.getPhone()));
                    return new ResponseData(Constants.UCENTER_200_CODE,"登录成功",userMap);
                }else{//验证码错误
                    return new ResponseData(Constants.UCENTER_5003_CODE,Constants.UCENTER_5003_MSG,code);
                }

            }else{
                return new ResponseData(Constants.UCENTER_5004_CODE,Constants.UCENTER_5004_MSG,code);
            }

        }
    }

    @ApiOperation(value="密码登录",notes="账号密码登录 实名状态1：已实名 2：未实名 3：审核中 0：审核不通过")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "loginName", value = "手机号/昵称", required = true,  paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "password", value = "密码", required = true,  paramType = "query",dataType = "String"),
//            @ApiImplicitParam(name = "vrifyCode", value = "验证码", required = true,  paramType = "query",dataType = "String")
    })
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ResponseData login(@RequestParam(value = "loginName",required = true) String loginName, @RequestParam(value = "password",required = true) String password,
                              HttpServletRequest request){
        //校验密码
        if(password==null || "".equals(password)){
            return new ResponseData(Constants.UCENTER_5005_CODE,"密码为空",password);
        }
        /*if(!(password.matches("^.*[a-zA-Z]+.*$") && password.matches("^.*[0-9]+.*$") && password.matches("^.{8,16}$"))){
            return new ResponseData(Constants.UCENTER_5005_CODE,Constants.UCENTER_5005_MSG,password);
        }*/
        //帐号是否存在
        String md5password = MD5Util.makeMD5(password);
        Map paraMap  = new HashMap();
        paraMap.put("loginName", loginName);
        UcUser ucUser = ucUserService.selectByLogin(paraMap);
        if(ucUser==null){
            return new ResponseData(Constants.UCENTER_5101_CODE,Constants.UCENTER_5101_MSG,loginName);
        }
        //获取userId
        int userId = ucUser.getUserId();
        String key = loginFailCountPre+userId;
        //判断当前是否在锁定期  存在登录次数小于0
        HashOperations<String, String, Integer> vo = redisTemplate.opsForHash();
        // 缓存存在
        boolean hasKey = vo.hasKey(key,"count");
        if (hasKey) {
            int falseCount = vo.get(key, "count");
            if(falseCount<=0){//登录次数超多了
                //获取设置的剩余秒数
                BoundHashOperations<String ,String,Integer> bho = redisTemplate.boundHashOps(key);
                Long sySeconds = bho.getExpire();
                Long syMinutes = sySeconds/60+1;//转化为分钟  取余加1
                return new ResponseData(Constants.UCENTER_5103_CODE,"请过｛"+syMinutes+"｝分钟后尝试",loginName);
            }
        }
        /*//验证码是否正确
        HttpSession httpSession = request.getSession();
        String vrifyCodeSession = (String)httpSession.getAttribute("vrifyCode");
        if(!vrifyCode.equalsIgnoreCase(vrifyCodeSession)){
            return new ResponseData(Constants.UCENTER_5105_CODE,Constants.UCENTER_5105_MSG,vrifyCode);
        }*/
        //密码是否正确
        paraMap.put("password" , md5password);
        UcUser pwUser = ucUserService.selectByLogin(paraMap);
        //密码不对 记录一小时内登录失败次数 redis记录 设置失效时间1小时
        //redis hset类型更新后 过期时间不变 故使用该类型
        if(pwUser==null){
            if (hasKey) {
                int falseCount = vo.get(key,"count");
                --falseCount;//可登录次数减少
                System.out.println(falseCount);
                //更新缓存可登录次数
                vo.put(key, "count" ,falseCount);
                if(falseCount>0){//可登录次数大于0
                    return new ResponseData(Constants.UCENTER_5102_CODE,"密码错误，还可以尝试｛"+falseCount+"｝次",loginName);
                }else{//大于等于最大登录次数
                    //获取设置的剩余秒数
                    BoundHashOperations<String ,String,Integer> bho = redisTemplate.boundHashOps(key);
                    Long sySeconds = bho.getExpire();
                    Long syMinutes = sySeconds/60+1;//转化为分钟  取余加1
                    return new ResponseData(Constants.UCENTER_5103_CODE,"请过｛"+syMinutes+"｝分钟后尝试",loginName);
                }
            }else{//缓存不存在
                //设置缓存
                vo.put(key, "count" , Integer.parseInt(loginFailCount));
                //设置过期时间  60分钟 3600秒
                BoundHashOperations<String ,String,Integer> bho = redisTemplate.boundHashOps(key);
                bho.expire(Long.parseLong(loginFailAgainTime),TimeUnit.SECONDS);
                return new ResponseData(Constants.UCENTER_5102_CODE,"密码错误，还可以尝试｛"+(Integer.parseInt(loginFailCount))+"｝次",loginName);
            }
        }else{//密码正确  登录成功  缓存user对象
            /*ValueOperations<String, UcUser> operations = redisTemplate.opsForValue();
            //获得redis缓存key
            String redisKey = "user_"+userId;
            operations.set(redisKey, ucUser);*/
            //设置springsession
           /* HttpSession httpSession = request.getSession();
            UserInfoVo userInfoVo = new UserInfoVo();
            userInfoVo.setLoginName(ucUser.getNickname());
            userInfoVo.setNickName(ucUser.getNickname());
            userInfoVo.setMemberId(String.valueOf(ucUser.getUserId()));
            userInfoVo.setMobile(ucUser.getPhone());
            System.out.println("登录 userInfo:"+userInfoVo);
            httpSession.setAttribute("userInfo",userInfoVo);*/
            //移除登录失败次数
            if (hasKey) {
                vo.delete(key, "count");
            }
            //返回结果
            Map userMap = ucUserService.myInfo(userId);
            userMap.put("jwt", JwtUtil.createJWT(ucUser.getNickname(),ucUser.getUserId(),ucUser.getPhone()));
            return new ResponseData(Constants.UCENTER_200_CODE,"登陆成功",userMap);
        }
    }

    /**
     * 登出
     * @param userId
     * @param request
     * @return
     */
    @ApiOperation(value="登出",notes="登出")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户ID", required = true,  paramType = "query",dataType = "String")
    })
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public ResponseData logout(@RequestParam(value = "userId",required = true) String userId, HttpServletRequest request){
        if(userId==null || "".equals(userId)){
            return new ResponseData("500","用户ID为空",userId);
        }
       /* HttpSession httpSession = request.getSession(true);
        System.out.println("退出sessionId："+httpSession.getId());
        httpSession.removeAttribute("userInfo");*/
        return new ResponseData(Constants.UCENTER_200_CODE,"退出成功",userId);
    }

    /**
     * 修改密码
     * @param phone
     * @return
     */
    @ApiOperation(value="修改密码手机验证",notes="手机是否已注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true,  paramType = "query",dataType = "String")
    })
    @RequestMapping(value = "/phoneexists",method = RequestMethod.GET)
    public ResponseData phoneExists(@RequestParam(value = "phone",required = true) String phone){
        //校验手机号
        Pattern p = Pattern.compile(phoneReg);
        if(!p.matcher(phone).matches()){
            return new ResponseData(Constants.UCENTER_5002_CODE,"手机号码输入格式错误",phone);
        }else{
            UcUser ucUser = ucUserService.selectByPhone(phone);
            if(ucUser==null){
                return new ResponseData(Constants.UCENTER_5101_CODE,Constants.UCENTER_5101_MSG,phone);
            }else{
                return new ResponseData(Constants.UCENTER_200_CODE,"success",phone);
            }
        }
    }

    @ApiOperation(value="修改密码",notes="修改密码")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true,  paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "password", value = "密码", required = true,  paramType = "query",dataType = "String")
    })
    @RequestMapping(value = "/uppassword",method = RequestMethod.GET)
    public ResponseData uppassword(@RequestParam(value = "phone",required = true) String phone, @RequestParam(value = "password",required = true) String password,
                                   HttpServletRequest request){
        //校验手机号
        UcUser ucUser = null;
        Pattern p = Pattern.compile(phoneReg);
        if(!p.matcher(phone).matches()){
            return new ResponseData(Constants.UCENTER_5002_CODE,"手机号码输入格式错误",phone);
        }else{
            ucUser =  ucUserService.selectByPhone(phone);
            if(ucUser==null){
                return new ResponseData(Constants.UCENTER_5101_CODE,Constants.UCENTER_5101_MSG,phone);
            }
        }
        //校验密码
        if(password==null || "".equals(password)){
            return new ResponseData(Constants.UCENTER_5005_CODE,"密码为空",password);
        }
        password = MD5Util.makeMD5(password);
        Map paraMap = new HashMap();
        paraMap.put("phone",phone);
        paraMap.put("password",password);
        int update = ucUserService.uppassword(paraMap);
        if(update==1){
            /**
             * 只有存在jwt 且合法  才根据新的版本生成新的jwt
             */
            //是否生成新的jwt的标识
            Boolean newJwt = false;
            String jwt = request.getHeader("jwt");
            System.out.println("uppassword jwt:"+jwt);
            //如果存在jwt
            if(jwt!=null && !"".equals(jwt)){
                //判断jwt的合法性
                if(JwtUtil.parseJWT(jwt)!=null){
                    newJwt = true;
                }
            }
            //jwt 版本
            Integer userId = ucUser.getUserId();
            String key = "jwt_"+userId;
            boolean hasKey = redisTemplate.hasKey(key);
            ValueOperations<String, Integer> operations = redisTemplate.opsForValue();
            //如果redis中有该用户的jwt版本 加1  如果没有 设置成2（因为默认是1）
            if(hasKey){
                operations.increment(key,1);
            }else{
                operations.set(key,2);
            }
            //如果需要生成新的jwt
            if(newJwt){
                jwt = JwtUtil.createJWT(ucUser.getNickname(),userId,phone);
            }
            return new ResponseData(Constants.UCENTER_200_CODE,"success",jwt==null?"":jwt);
        }else{
            return new ResponseData(Constants.UCENTER_5201_CODE,Constants.UCENTER_5201_MSG,phone);
        }

    }
    /**
     * 我的查询
     */
    @ApiOperation(value="我的查询",notes="我的查询  实名状态1：已实名 2：未实名 3：审核中 0：审核不通过")
    @RequestMapping(value = "/myinfo",method = RequestMethod.GET)
    public ResponseData myInfo(HttpServletRequest request){
        String jwt = request.getHeader("jwt");
        if(jwt!=null && !"".equals(jwt)){
            //判断jwt的合法性
            if(JwtUtil.parseJWT(jwt)!=null){
                Claims claims = JwtUtil.parseJWT(jwt);
                Integer userId = (Integer) claims.get("userId");
                Map userMap = ucUserService.myInfo(userId);
                return  new ResponseData(Constants.UCENTER_200_CODE,"success",userMap);
            }
        }
        return  new ResponseData(Constants.UCENTER_200_CODE,"success","");
    }

    /**
     * 修改头像
     */
    @ApiOperation(value = "修改头像", notes = "修改头像")
    @RequestMapping(value = "/upHeadPhoto",method = RequestMethod.GET)
    public ResultData upHeadPhoto(@RequestParam( value = "userId",required = true) Integer userId, @RequestParam(value = "headPhoto") String headPhoto,
                                  @RequestParam("file") MultipartFile file){
        //如果存在头像 先删除
        if(headPhoto != null && !"".equals(headPhoto)){
            fileService.deleteFile(OssTools.Bucket.RNT,headPhoto.split("oss-cn-hangzhou.aliyuncs.com/")[1]);
        }
        try {
            String contentresult = fileService.uploadImage( OssTools.Bucket.RNT, uploadpath,file.getOriginalFilename(), file.getInputStream());
            JSONObject json = new JSONObject(contentresult);
            if (json.get("success").equals(true)) {
                String newHeadPhoto = json.get("filePath").toString();
                Map paraMap = new HashMap();
                paraMap.put("userId",userId);
                paraMap.put("headPhoto",newHeadPhoto);
                int up = ucUserService.upHeadPhoto(paraMap);
                if(up ==1){
                    return new ResultData("500","头像上传成功!",newHeadPhoto);
                }else{
                    return new ResultData("200","头像上传失败!","");
                }
            } else {
                return new ResultData("200","头像上传失败!","");
            }
        } catch (Exception e) {
            return new ResultData("200","头像上传失败!",e.getMessage());
        }

    }

}
