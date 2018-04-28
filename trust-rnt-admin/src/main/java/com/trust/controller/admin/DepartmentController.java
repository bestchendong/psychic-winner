package com.trust.controller.admin;

import com.trust.common.PageInfo;
import com.trust.common.annotation.OperationLogDes;
import com.trust.constant.log.RntOperationLogModule;
import com.trust.constant.log.RntOperationLogType;
import com.trust.entity.admin.Department;
import com.trust.entity.admin.Manager;
import com.trust.service.admin.DepartmentService;
import com.trust.service.admin.ManagerService;
import com.trust.service.rnt.RntOperationLogService;
import com.trust.utils.Result;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 董华聪
 * @createTime 2017/12
 */
@Controller
@RequestMapping("/admin/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private ManagerService managerService;
    @Autowired
    private RntOperationLogService rntOperationLogService;

    @RequestMapping(value = "/manage/list")
    @RequiresPermissions("admin:department:manage:list")
    public String departmentManagePage(Model model, Department department,
                                                    @RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
                                                    @RequestParam(value = "pageSize", defaultValue = "10") int pageSize){
        PageInfo pageInfo = departmentService.getDepartmentByPage(department, pageNo, pageSize);
        List<Department> departmentTree = new ArrayList<>();
        /*Department rootDepartment = new Department();
        rootDepartment.setParentDepartment("无");
        rootDepartment.setDepartmentId(0);
        rootDepartment.setName("全部");
        departmentTree.add(rootDepartment);*/
        departmentTree.addAll(departmentService.getDepartmentTree());
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("departmentTree",departmentTree);
        model.addAttribute("department",department);
        return "/admin/department/department_list";
    }

    @RequestMapping(value = "/manage/add")
    @RequiresPermissions("admin:dep:add")
    public String departmentAddPage(Model model){
        List<Department> departmentTree = departmentService.getDepartmentTree();
        model.addAttribute("departmentTree",departmentTree);
        return "/admin/department/department_add";
    }

    @RequestMapping(value = "/manage/edit")
    @RequiresPermissions("admin:dep:edit")
    public String departmentEditPage(Model model, @RequestParam("departmentId") int departmentId){
        Department department = departmentService.getDepartmentById(departmentId);
        model.addAttribute("department",department);
        return "/admin/department/department_edit";
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

    @OperationLogDes(moduleName = RntOperationLogModule.department)
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
            try {
                rntOperationLogService.addLog( RntOperationLogType.add,this.getClass().getMethod("addDepartment", Department.class),department.getDepartmentId());
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                System.out.println("========== Log not logged! ==========");
            }
        }
        return result;
    }

    @OperationLogDes(moduleName = RntOperationLogModule.department)
    @RequestMapping(value = "/edit")
    @ResponseBody
    @RequiresPermissions("admin:dep:edit")
    public Result editDepartment(Department department) {
        Result result = new Result();
        Department departmentData = departmentService.getDepartmentByName(department.getName());
        if(departmentData != null && departmentData.getDepartmentId() != department.getDepartmentId()){
            result = Result.error("the name has been used");
        } else {
            Department oldDepartment = departmentService.getDepartmentById(department.getDepartmentId());
            departmentService.edit(department);
            try {
                rntOperationLogService.addLog( RntOperationLogType.edit,this.getClass().getMethod("editDepartment", Department.class),oldDepartment,department);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                System.out.println("========== Log not logged! ==========");
            }
        }
        return result;
    }

    @OperationLogDes(moduleName = RntOperationLogModule.department)
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
            try {
                rntOperationLogService.addLog( RntOperationLogType.delete,this.getClass().getMethod("deleteDepartment", int.class),departmentId);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                System.out.println("========== Log not logged! ==========");
            }
        }
        return result;
    }

}
