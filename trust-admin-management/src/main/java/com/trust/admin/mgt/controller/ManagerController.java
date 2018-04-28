package com.trust.admin.mgt.controller;

import com.trust.admin.mgt.common.PageInfo;
import com.trust.admin.mgt.entity.Department;
import com.trust.admin.mgt.entity.Manager;
import com.trust.admin.mgt.entity.Menu;
import com.trust.admin.mgt.entity.Role;
import com.trust.admin.mgt.service.DepartmentService;
import com.trust.admin.mgt.service.ManagerService;
import com.trust.admin.mgt.service.RoleService;
import com.trust.admin.mgt.utils.ValidatorUtil;
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

@Controller
@RequestMapping("/mgt/manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/manage/list")
    @RequiresPermissions("admin:manager:manage:list")
    public String managerManagePage(Model model,
                             @RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
                             @RequestParam(value = "pageSize", defaultValue = "10") int pageSize){
        PageInfo pageInfo = managerService.getManagerByPage(pageNo,pageSize);
        model.addAttribute("pageInfo",pageInfo);
        return "/mgt/manager/manager_list";
    }

    @RequestMapping(value = "/manage/add")
    @RequiresPermissions("admin:manager:add")
    public String managerAddPage(Model model){
        List<Role> roleList = roleService.getActiveRoleList();
        List<Department> departmentTree = departmentService.getDepartmentTree();
        model.addAttribute("roleList",roleList);
        model.addAttribute("departmentTree",departmentTree);
        return "/mgt/manager/manager_add";
    }

    @RequestMapping(value = "/manage/detail")
    @RequiresPermissions("admin:manager:detail")
    public String manageDetailPage(Model model, @RequestParam("managerId") int managerId){
        Manager manager = managerService.getManagerById(managerId);
        model.addAttribute("manager",manager);
        return "/mgt/manager/manager_detail";
    }

    @RequestMapping(value = "/manage/edit")
    @RequiresPermissions("admin:manager:edit")
    public String manageEditPage(Model model, @RequestParam("managerId") int managerId){
        Manager manager = managerService.getManagerById(managerId);
        List<Role> roleList = roleService.getActiveRoleList();
        List<Department> departmentTree = departmentService.getDepartmentTree();
        model.addAttribute("manager",manager);
        model.addAttribute("roleList",roleList);
        model.addAttribute("departmentTree",departmentTree);
        return "/mgt/manager/manager_edit";
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    @RequiresPermissions("admin:manager:add")
    public Result addManager(Manager manager){
        Result result = new Result();
        boolean isPhone = ValidatorUtil.isMobile(manager.getPhoneNumber());
        boolean isEmail = true;
        if(manager.getEmail() != null && !manager.getEmail().equals("")){
            isEmail = ValidatorUtil.isEmail(manager.getEmail());
        }
        if(isPhone && isEmail){
            if(managerService.getManagerByManagerName(manager.getManagerName()) != null){
                result = Result.error("该名称已被使用");
            } else {
                managerService.add(manager);
            }
        } else {
            result = Result.error("手机或邮箱格式不正确。");
        }
        return result;
    }

    @RequestMapping(value = "/edit")
    @ResponseBody
    @RequiresPermissions("admin:manager:edit")
    public Result editManager(Manager manager){
        Result result = new Result();
        boolean isPhone = ValidatorUtil.isMobile(manager.getPhoneNumber());
        boolean isEmail = true;
        if(manager.getEmail() != null && !manager.getEmail().equals("")){
            isEmail = ValidatorUtil.isEmail(manager.getEmail());
        }
        if(isPhone && isEmail){
            Manager managerData = managerService.getManagerByManagerName(manager.getManagerName());
            if(managerData != null && managerData.getManagerId() != manager.getManagerId()){
                result = Result.error("该名称已被使用");
            } else {
                managerService.edit(manager);
            }
        } else {
            result = Result.error("手机或邮箱格式不正确");
        }
        return result;
    }

    @RequestMapping(value = "/verify",method = RequestMethod.GET)
    @ResponseBody
    public Result verifyManagerName(@RequestParam("managerName")String managerName){
        Result result = new Result();
        if(managerService.getManagerByManagerName(managerName) == null){
            result = Result.error();
        }
        return result;
    }

    @RequestMapping(value = "/delete")
    @ResponseBody
    @RequiresPermissions("admin:manager:delete")
    public Result deleteManager(@RequestParam("managerId") int managerId){
        Result result = new Result();
        managerService.delete(managerId);
        return result;
    }

}
