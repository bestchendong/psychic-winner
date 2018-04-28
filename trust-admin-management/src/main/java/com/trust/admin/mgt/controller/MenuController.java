package com.trust.admin.mgt.controller;


import com.trust.admin.mgt.common.PageInfo;
import com.trust.admin.mgt.entity.Menu;
import com.trust.admin.mgt.service.MenuService;
import com.trust.core.common.Result;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: 董华聪
 * @date: 2017/12/1
 */
@Controller
@RequestMapping("/mgt/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/manage/list")
    @RequiresPermissions("admin:menu:manage:list")
    public String menuManagePage(Model model,
                                 @RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
                                 @RequestParam(value = "pageSize",defaultValue = "10") int pageSize){
        PageInfo pageInfo = menuService.getMenuByPage(pageNo, pageSize);
        model.addAttribute("pageInfo",pageInfo);
        return "/mgt/menu/menu_list";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions("admin:menu:add")
    public Result addMenu(@RequestParam("menu") Menu menu){
        Result result = new Result();
        if(menuService.getMenuByName(menu.getName()) != null){
            result = Result.error();
        } else {
            menuService.add(menu);
        }
        return result;
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public List<Menu> getMenuList(){
        return menuService.getMenuList();
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    @ResponseBody
    public Result editMenu(Menu menu){
        Result result = new Result();
        if(menuService.getMenuByName(menu.getName()) != null){
            result = Result.error();
        } else{
            menuService.edit(menu);
        }
        return result;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    @RequiresPermissions("admin:menu:delete")
    public Result deleteMenu(@RequestParam("menuId")int menuId){
        Result result = new Result();
        if(menuService.getRoleMenuByMenuId(menuId) != null){
            result = Result.error();
        } else {
            menuService.delete(menuId);
        }
        return result;
    }

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    @ResponseBody
    public PageInfo getMenuByPage(@RequestParam("pageNo")int pageNo,
                                  @RequestParam("pageSize")int  pageSize){
        return menuService.getMenuByPage(pageNo, pageSize);
    }
}
