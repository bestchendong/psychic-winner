package com.trust.controller.admin;

import com.trust.common.PageInfo;
import com.trust.common.annotation.OperationLogDes;
import com.trust.constant.log.RntOperationLogModule;
import com.trust.constant.log.RntOperationLogType;
import com.trust.controller.rnt.system.BaseController;
import com.trust.entity.admin.Department;
import com.trust.entity.admin.Manager;
import com.trust.entity.admin.Role;
import com.trust.service.admin.DepartmentService;
import com.trust.service.admin.ManagerService;
import com.trust.service.admin.RoleService;
import com.trust.service.rnt.RntOperationLogService;
import com.trust.utils.MD5Util;
import com.trust.utils.Result;
import com.trust.utils.ValidatorUtil;
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
@RequestMapping("/admin/manager")
public class ManagerController extends BaseController{

    @Autowired
    private ManagerService managerService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private RntOperationLogService rntOperationLogService;


    @RequestMapping(value = "/manage/list")
    @RequiresPermissions("admin:manager:manage:list")
    public String managerManagePage(Model model,
                                    @RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
                                    @RequestParam(value = "pageSize", defaultValue = "10") int pageSize){
        PageInfo pageInfo = managerService.getManagerByPage(pageNo,pageSize);
        model.addAttribute("pageInfo",pageInfo);
        return "/admin/manager/manager_list";
    }

    @RequestMapping(value = "/manage/add")
    @RequiresPermissions("admin:manager:add")
    public String managerAddPage(Model model){
        List<Role> roleList = roleService.getActiveRoleList();
        List<Department> departmentTree = departmentService.getDepartmentTree();
        model.addAttribute("roleList",roleList);
        model.addAttribute("departmentTree",departmentTree);
        return "/admin/manager/manager_add";
    }

    @RequestMapping(value = "/manage/detail")
    @RequiresPermissions("admin:manager:detail")
    public String manageDetailPage(Model model, @RequestParam("managerId") int managerId){
        Manager manager = managerService.getManagerById(managerId);
        model.addAttribute("manager",manager);
        return "/admin/manager/manager_detail";
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
        return "/admin/manager/manager_edit";
    }

    @RequestMapping(value = "/manage/self")
    public String managerSelfPage(Model model){
        Manager manager = this.getUser();
        model.addAttribute("manager",manager);
        return "/admin/manager/manager_self";
    }

    @OperationLogDes(moduleName = RntOperationLogModule.manager)
    @RequestMapping(value = "/password")
    @ResponseBody
    public Result updatePassword(@RequestParam("oldPwd") String oldPwd,
                                 @RequestParam("newPwd") String newPwd){
        Manager manager = this.getUser();
        try {
            rntOperationLogService.addLog( RntOperationLogType.edit,this.getClass().getMethod("updatePassword", String.class,String.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            System.out.println("========== Log not logged! ==========");
        }
        if(manager.getPassword().equals(MD5Util.md5Encrypt(oldPwd))){
            manager.setPassword(MD5Util.md5Encrypt(newPwd));
            managerService.edit(manager);
            return new Result();
        } else {
            return Result.error();
        }
    }

    @OperationLogDes(moduleName = RntOperationLogModule.manager)
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
                try {
                    rntOperationLogService.addLog( RntOperationLogType.add,this.getClass().getMethod("addManager", Manager.class),manager.getManagerId());
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                    System.out.println("========== Log not logged! ==========");
                }
            }
        } else {
            result = Result.error("手机或邮箱格式不正确。");
        }
        return result;
    }

    @OperationLogDes(moduleName = RntOperationLogModule.manager)
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
                Manager oldManager = managerService.getManagerById(manager.getManagerId());
                managerService.edit(manager);
                try {
                    rntOperationLogService.addLog( RntOperationLogType.edit,this.getClass().getMethod("editManager", Manager.class),oldManager,manager);
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                    System.out.println("========== Log not logged! ==========");
                }
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

    @OperationLogDes(moduleName = RntOperationLogModule.manager)
    @RequestMapping(value = "/delete")
    @ResponseBody
    @RequiresPermissions("admin:manager:delete")
    public Result deleteManager(@RequestParam("managerId") int managerId){
        Result result = new Result();
        managerService.delete(managerId);
        try {
            rntOperationLogService.addLog( RntOperationLogType.delete,this.getClass().getMethod("deleteManager", int.class),managerId);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            System.out.println("========== Log not logged! ==========");
        }
        return result;
    }

}
