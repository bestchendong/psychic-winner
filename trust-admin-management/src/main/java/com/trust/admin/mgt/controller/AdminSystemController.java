package com.trust.admin.mgt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author Yangcb
 * @Descrintion
 * @Date create 2018-01-22 14:43
 * @Version 1.0
 */
@Controller
@RequestMapping("/mgt/sys")
public class AdminSystemController {

    /**
     *首页跳转
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String toIndex(){
        return "/index";
    }

    /**
     * 跳转
     * @return
     */
    @RequestMapping("/readypage")
    public  String readyPage(){
        return "/mgt/sys/readypage";
    }
}
