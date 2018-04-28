package com.trust.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Bob Zhu
 * @date: 2017/12/1
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

    @RequestMapping("/{system}/{id}")
    public String index(ModelMap model
            ,@PathVariable String system
            ,@PathVariable Integer id){
        model.addAttribute("system",system);
        model.addAttribute("id",id);
        model.addAttribute("hello","hello world");
        return "index";
    }
}
