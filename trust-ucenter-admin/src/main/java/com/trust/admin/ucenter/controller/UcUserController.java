package com.trust.admin.ucenter.controller;

import com.github.pagehelper.PageInfo;
import com.trust.admin.ucenter.service.UcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ucadmin/user")
public class UcUserController {

    @Autowired
    private UcUserService ucUserService;

    @RequestMapping({"/list"})
    public String managerManagePage(Model model, @RequestParam(value = "pageNo",defaultValue = "1") int pageNo, @RequestParam(value = "pageSize",defaultValue = "10") int pageSize) {

        PageInfo pageInfo = ucUserService.getUcUserByPage(pageNo,pageSize);
        System.out.println("pageInfo:"+pageInfo);
        model.addAttribute("pageInfo", pageInfo);

        return "/user_list";
    }
}
