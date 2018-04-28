package com.trust.controller.rnt.system;

import com.google.code.kaptcha.Producer;
import com.trust.entity.admin.Manager;
import com.trust.entity.admin.Menu;
import com.trust.service.admin.ManagerService;
import com.trust.shiro.ShiroUtils;
import com.trust.utils.MD5Util;
import com.trust.utils.ResultData;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.Date;
import java.util.List;

/**
 * @Author Yangcb
 * @Descrintion
 * @Date create 2018-01-05 14:37
 * @Version 1.0
 */
@Controller
@RequestMapping("/rntadmin")
public class LoginController extends BaseController {

    @Autowired
    private Producer captchaProducer;

    @Autowired
    private ManagerService managerService;

    public void setCaptchaProducer(Producer captchaProducer) {
        this.captchaProducer = captchaProducer;
    }
    /**
     * 登录跳转
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String toLogin(HttpServletRequest request,
                          HttpServletResponse response)throws Exception {
        return "/rnt/login/login";
    }

    /**
     * 无权限
     * @return
     */
    @RequestMapping(value = "/403",method = RequestMethod.GET)
    public String noPermission(){
        return "/rnt/sys/403";
    }

    /**
     * 用户登录
     * @param request
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    @ResponseBody
    public ResultData login(HttpServletRequest request, @RequestParam(value = "userName",required = true)String userName, @RequestParam(value = "password",required = true)String password){
        String captchaId = (String) request.getSession().getAttribute("vrifyCode");
        String parameter = request.getParameter("vrifyCode");
        if (!captchaId.equals(parameter.toLowerCase())) {
            return new ResultData("500","验证码错误!");
        }
        password = MD5Util.md5Encrypt(password);
        System.out.printf("password==="+password);
        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
        System.out.printf("token==="+token);
        Subject subject = SecurityUtils.getSubject();
        System.out.printf("subject===="+subject);
        try {
            subject.login(token);
            System.out.printf("this.getUser()==="+this.getUser());
            request.getSession().setAttribute("user",this.getUser());
            Manager manager = this.getUser();
            System.out.printf("manager==="+manager);
            manager.setLastLoginTime(new Date());
            managerService.edit(manager);
            return new ResultData("200","登录成功");
        } catch (AuthenticationException e) {
            System.out.printf("用户名或者密码错误==="+e.getMessage());
            return new ResultData("500","用户名或者密码错误!");
        }
    }

    /**
     * 获取用户菜单按钮
     * @param request
     * @return
     */
    @RequestMapping(value = "/user/menu",method = RequestMethod.POST)
    @ResponseBody
    public ResultData getAllMenuByUserId(HttpServletRequest request){
        List<Menu> menuList = (List<Menu>) request.getSession().getAttribute("userMenu");
        if(menuList==null) {
            System.out.printf("登陆第一次============");
            menuList = managerService.getMenusOfManager(this.getUserId());
            request.getSession().setAttribute("userMenu",menuList);
        }
       return new ResultData("200","success",menuList);
    }

    /**
     * 登出
     * @return登陆首次获取
     */
    @GetMapping("/logout")
    String logout() {
        ShiroUtils.logout();
        return "/rnt/login/login";
    }

    /**
     * 验证码生成
     * @param httpServletRequest
     * @param httpServletResponse
     * @throws Exception
     */
    @RequestMapping(value = "/kaptcha/verifycode",method = RequestMethod.GET)
    public void verifyCodeKaptcha(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws Exception{
        byte[] captchaChallengeAsJpeg = null;
        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
        try {
            //生产验证码字符串并保存到session中
            String createText = captchaProducer.createText();
            httpServletRequest.getSession().setAttribute("vrifyCode", createText.toLowerCase());
            //使用生产的验证码字符串返回一个BufferedImage对象并转为byte写入到byte数组中
            BufferedImage challenge = captchaProducer.createImage(createText);
            ImageIO.write(challenge, "jpg", jpegOutputStream);
        } catch (IllegalArgumentException e) {
            httpServletResponse.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        //定义response输出类型为image/jpeg类型，使用response输出流输出图片的byte数组
        captchaChallengeAsJpeg = jpegOutputStream.toByteArray();
        httpServletResponse.setHeader("Cache-Control", "no-store");
        httpServletResponse.setHeader("Pragma", "no-cache");
        httpServletResponse.setDateHeader("Expires", 0);
        httpServletResponse.setContentType("image/jpeg");
        ServletOutputStream responseOutputStream =
                httpServletResponse.getOutputStream();
        responseOutputStream.write(captchaChallengeAsJpeg);
        responseOutputStream.flush();
        responseOutputStream.close();
    }

    public static void main(String[] args) {
        System.out.printf("=="+ MD5Util.md5Encrypt("111111"));
    }
}
