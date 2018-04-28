package com.trust.ucenter.controller.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    private final static Logger logger = LoggerFactory.getLogger(LoginController.class);
    @RequestMapping("/user/tologin")
    public String toLogin(HttpServletRequest req){
        String uri = req.getRequestURI();
        logger.info("请求uri："+uri);
        HttpSession httpSession = req.getSession();
        System.out.println("请求 sessionId:"+httpSession.getId());
        return "login";
    }
}
