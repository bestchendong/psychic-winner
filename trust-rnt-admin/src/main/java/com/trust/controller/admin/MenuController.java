package com.trust.controller.admin;


import com.trust.common.PageInfo;
import com.trust.common.annotation.OperationLogDes;
import com.trust.constant.log.RntOperationLogModule;
import com.trust.constant.log.RntOperationLogType;
import com.trust.entity.admin.Menu;
import com.trust.service.admin.MenuService;
import com.trust.service.rnt.RntOperationLogService;
import com.trust.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@RequestMapping("/admin/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @Autowired
    private RntOperationLogService rntOperationLogService;

    @OperationLogDes(moduleName = RntOperationLogModule.menu)
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Result addMenu(@RequestParam("menu") Menu menu){
        Result result = new Result();
        if(menuService.getMenuByName(menu.getName()) != null){
            result = Result.error();
        } else {
            menuService.add(menu);
            try {
                rntOperationLogService.addLog( RntOperationLogType.add,this.getClass().getMethod("addMenu", Menu.class),menu.getMenuId());
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                System.out.println("========== Log not logged! ==========");
            }
        }
        return result;
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public List<Menu> getMenuList(){
        return menuService.getMenuList();
    }

    @OperationLogDes(moduleName = RntOperationLogModule.menu)
    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    @ResponseBody
    public Result editMenu(Menu menu){
        Result result = new Result();
        if(menuService.getMenuByName(menu.getName()) != null){
            result = Result.error();
        } else{
            Menu oldMenu = menuService.getMenuById(menu.getMenuId());
            menuService.edit(menu);
            try {
                rntOperationLogService.addLog( RntOperationLogType.edit,this.getClass().getMethod("editMenu", Menu.class),oldMenu,menu);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                System.out.println("========== Log not logged! ==========");
            }
        }
        return result;
    }

    @OperationLogDes(moduleName = RntOperationLogModule.menu)
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteMenu(@RequestParam("menuId")int menuId){
        Result result = new Result();
        if(menuService.getRoleMenuByMenuId(menuId) != null){
            result = Result.error();
        } else {
            menuService.delete(menuId);
            try {
                rntOperationLogService.addLog( RntOperationLogType.delete,this.getClass().getMethod("deleteMenu", int.class),menuId);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                System.out.println("========== Log not logged! ==========");
            }
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
