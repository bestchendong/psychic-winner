package com.trust.ucenter.controller.user;

import com.trust.ucenter.Constants;
import com.trust.ucenter.entity.RealName;
import com.trust.ucenter.service.RealNameService;
import com.trust.ucenter.utils.result.ResponseData;
import com.trust.ucenter.utils.special.JwtUtil;
import io.jsonwebtoken.Claims;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Pattern;

import static com.trust.ucenter.utils.special.IDCardUtil.isIDCard;

@Controller
@RequestMapping("/user/realname")
public class RealNameController {
    //姓名  汉字 10个汉字
    private String nameReg = "[\u4E00-\u9FA5]{1,10}$";

    //详细地址 数字字母中文
    private  String addressReg = "^[a-z0-9A-Z\u4e00-\u9fa5]{1,50}$";
    @Autowired
    private RealNameService realNameService;

    /**
     * 新增实名认证
     * @param realName
     * @param request
     * @return
     */
    @ApiOperation(value="实名提交",notes="实名状态1：已实名 2：未实名 3：审核中 0：审核不通过")
    @RequestMapping("/add")
    @ResponseBody
    public ResponseData add(@RequestBody RealName realName, HttpServletRequest request){
        String jwt = request.getHeader("jwt");
        Integer userId ;
        //如果存在jwt
        if(jwt!=null && !"".equals(jwt)){
            //判断jwt的合法性
            if(JwtUtil.parseJWT(jwt)!=null){
                Claims claims = JwtUtil.parseJWT(jwt);
                userId = (Integer)claims.get("userId");
            }
        }
        //校验姓名
        String name = realName.getName();
        Pattern p = Pattern.compile(nameReg);
        if(!p.matcher(name).matches()){
            return new ResponseData(Constants.UCENTER_5301_CODE,Constants.UCENTER_5301_MSG,name);
        }
        //校验身份证号
        String idCard = realName.getIdCard();
        if(!isIDCard(idCard)){
            return new ResponseData(Constants.UCENTER_5302_CODE,Constants.UCENTER_5302_MSG,idCard);
        }
        //所在地区
        String province = realName.getProvince();
        String city = realName.getCity();
        String district = realName.getDistrict();
        if(province == null || "".equals(province) || city == null || "".equals(city) || district ==null || "".equals(district)){
            return new ResponseData(Constants.UCENTER_5303_CODE,Constants.UCENTER_5303_MSG,idCard);
        }
        //详细地址
        String address = realName.getAddress();
        p = Pattern.compile(addressReg);
        if(!p.matcher(address).matches()){
            return new ResponseData(Constants.UCENTER_5304_CODE,Constants.UCENTER_5304_MSG,name);
        }
        realName.setRealnameStatus(3);
        int insert = realNameService.insertRealName(realName);
        if(insert == 1){
            return  new ResponseData(Constants.UCENTER_200_CODE,"success","");
        }else{
            return  new ResponseData("500","fail","");
        }
    }

    /**
     * 获取实名认证信息
     * @param request
     * @return
     */
    @RequestMapping("/info")
    @ResponseBody
    public ResponseData info(HttpServletRequest request){
        String jwt = request.getHeader("jwt");
        Integer userId = 0;
        //如果存在jwt
        if(jwt!=null && !"".equals(jwt)){
            //判断jwt的合法性
            if(JwtUtil.parseJWT(jwt)!=null){
                Claims claims = JwtUtil.parseJWT(jwt);
                userId = (Integer)claims.get("userId");
            }
        }
        RealName realName = realNameService.selectByUserId(userId);
        return  new ResponseData(Constants.UCENTER_200_CODE,"success",realName);
    }


}
