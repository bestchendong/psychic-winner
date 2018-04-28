package com.trust.controller.rnt.system;

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
@RequestMapping("/rntadmin/sys")
public class RntSystemController {

    /**
     *首页跳转
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String toIndex(){
        return "/rnt/index";
    }

    /**
     * 跳转
     * @return
     */
    @RequestMapping("/403")
    public  String error403(){
        return "/rnt/sys/403";
    }

    /**
     * 跳转
     * @return
     */
    @RequestMapping("/404")
    public  String error404(){
        return "/rnt/sys/404";
    }

    /**
     * 跳转
     * @return
     */
    @RequestMapping("/500")
    public  String error500(){
        return "/rnt/sys/500";
    }

    /**
     * 跳转
     * @return
     */
    @RequestMapping("/error")
    public  String erro(){
        return "/rnt/sys/error";
    }

    /**
     * 跳转
     * @return
     */
    @RequestMapping("/readypage")
    public  String readyPage(){
        return "/rnt/sys/readypage";
    }
}
