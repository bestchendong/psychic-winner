package com.trust.admin.mgt.controller;

import com.trust.admin.mgt.common.PageInfo;
import com.trust.admin.mgt.entity.Department;
import com.trust.admin.mgt.entity.Manager;
import com.trust.admin.mgt.service.DepartmentService;
import com.trust.admin.mgt.service.ManagerService;
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
 * @author 董华聪
 * @createTime 2017/12
 */
@Controller
@RequestMapping("/mgt/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private ManagerService managerService;

    @RequestMapping(value = "/manage/list")
    @RequiresPermissions("admin:department:manage:list")
    public String departmentManagePage(Model model, @RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
                                       @RequestParam(value = "pageSize", defaultValue = "10") int pageSize){
        PageInfo pageInfo = departmentService.getDepartmentByPage(pageNo, pageSize);
        model.addAttribute("pageInfo",pageInfo);
        return "/mgt/department/department_list";
    }

    @RequestMapping(value = "/manage/add")
    @RequiresPermissions("admin:dep:add")
    public String departmentAddPage(Model model){
        List<Department> departmentTree = departmentService.getDepartmentTree();
        model.addAttribute("departmentTree",departmentTree);
        return "/mgt/department/department_add";
    }

    @RequestMapping(value = "/manage/edit")
    @RequiresPermissions("admin:dep:edit")
    public String departmentEditPage(Model model, @RequestParam("departmentId") int departmentId){
        Department department = departmentService.getDepartmentById(departmentId);
        model.addAttribute("department",department);
        return "/mgt/department/department_edit";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<Department> getDepartmentList(){
        return departmentService.getDepartmentList();
    }

    @RequestMapping(value = "/tree", method = RequestMethod.GET)
    @ResponseBody
    public  List<Department> getDepartmentTree(){
        return departmentService.getDepartmentTree();
    }

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    @ResponseBody
    public Department getDepartmentById(@RequestParam("departmentId") int departmentId){
        return departmentService.getDepartmentById(departmentId);
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    @RequiresPermissions("admin:dep:add")
    public Result addDepartment(Department department){
        Result result = new Result();
        Department departmentData = departmentService.getDepartmentByName(department.getName());
        if(departmentData != null ){
            result = Result.error("the name has been used");
        } else {
            departmentService.add(department);
        }
        return result;
    }

    @RequestMapping(value = "/edit")
    @ResponseBody
    @RequiresPermissions("admin:dep:edit")
    public Result editDepartment(Department department) {
        Result result = new Result();
        Department departmentData = departmentService.getDepartmentByName(department.getName());
        if(departmentData != null && departmentData.getDepartmentId() != department.getDepartmentId()){
            result = Result.error("the name has been used");
        } else {
            departmentService.edit(department);
        }
        return result;
    }

    @RequestMapping(value = "/delete")
    @ResponseBody
    @RequiresPermissions("admin:dep:delete")
    public Result deleteDepartment(@RequestParam("departmentId") int departmentId){
        Result result = new Result();
        List<Manager> managerList = managerService.getManagerByDepartmentId(departmentId);
        List<Department> children = departmentService.getDepartmentChildren(departmentId);
        if((managerList != null && managerList.size() > 0)
                || (children != null && children.size() > 0)){
            result = Result.error("the manager or children of department is not null");
        } else {
            departmentService.delete(departmentId);
        }
        return result;
    }

}
