package com.trust.controller.admin;

import com.trust.common.Tree;
import com.trust.common.annotation.OperationLogDes;
import com.trust.constant.log.RntOperationLogModule;
import com.trust.constant.log.RntOperationLogType;
import com.trust.entity.admin.Role;
import com.trust.service.admin.RoleService;
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

import java.util.List;

@Controller
@RequestMapping("/admin/role")
public class RoleController {

    @Autowired
    private RoleService roleService;
    @Autowired
    private RntOperationLogService rntOperationLogService;

    @RequestMapping(value = "/manage/list")
    @RequiresPermissions("admin:role:manage:list")
    public String roleManage(Model model){
        List<Role> roleList = roleService.getRoleList();
        model.addAttribute("roleList",roleList);
        return "/admin/role/role_list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<Role> getRoleList(){
        return roleService.getRoleList();
    }

    @OperationLogDes(moduleName = RntOperationLogModule.role)
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions("admin:role:add")
    public Result addRole(Role role){
        Result result = new Result();
        if( roleService.getRoleByName(role.getName()) != null){
            result = Result.error();
        } else {
            roleService.add(role);
            try {
                rntOperationLogService.addLog( RntOperationLogType.add,this.getClass().getMethod("addRole", Role.class),role.getRoleId());
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                System.out.println("========== Log not logged! ==========");
            }
        }
        return result;
    }

    @OperationLogDes(moduleName = RntOperationLogModule.role)
    @RequestMapping(value = "/edit")
    @ResponseBody
    @RequiresPermissions("admin:role:edit")
    public Result editRole(Role role){
        Result result = new Result();
        Role roleExist = roleService.getRoleByName(role.getName());
        if( roleExist != null && roleExist.getRoleId() != role.getRoleId()){
            result = Result.error();
        } else {
            Role oldRole = roleService.getRoleById(role.getRoleId());
            roleService.edit(role);
            try {
                rntOperationLogService.addLog( RntOperationLogType.edit,this.getClass().getMethod("editRole", Role.class),oldRole,role);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                System.out.println("========== Log not logged! ==========");
            }
        }
        return result;
    }

    @OperationLogDes(moduleName = RntOperationLogModule.role)
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Result deleteRole(@RequestParam("roleId") int roleId){
        Result result = new Result();
        try{
            roleService.delete(roleId);
            try {
                rntOperationLogService.addLog( RntOperationLogType.delete,this.getClass().getMethod("deleteRole", int.class),roleId);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                System.out.println("========== Log not logged! ==========");
            }
        } catch (Exception e){
            e.printStackTrace();
            result = Result.error();
        }
        return result;
    }

    @RequestMapping(value = "/tree/menu", method = RequestMethod.GET)
    @ResponseBody
    @RequiresPermissions("admin:role:authmenu")
    public List<Tree> getMenuTreeWithRole(@RequestParam("roleId") int roleId){
        return roleService.getMenuTreeWithRole(roleId);
    }

    @RequestMapping(value = "/tree/operation", method = RequestMethod.GET)
    @ResponseBody
    @RequiresPermissions("admin:role:authopn")
    public List<Tree> getOperationTreeWithRole(@RequestParam("roleId") int roleId){
        return roleService.getOperationTreeWithRole(roleId);
    }

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    @ResponseBody
    public Role getRoleByRoleId(@RequestParam("roleId") int roleId){
        Role role = roleService.getRoleById(roleId);
        return role;
    }

    @RequestMapping(value = "/set/menu")
    @ResponseBody
    @RequiresPermissions("admin:role:authmenu")
    public Result setRoleMenus(@RequestParam("menuIds") String menuIds,
                              @RequestParam("roleId") int roleId){
        Result result = new Result();
        if(!roleService.setRoleMenus(roleId, menuIds)){
            result = Result.error();
        }
        return result;
    }

    @RequestMapping(value = "/set/operation")
    @ResponseBody
    @RequiresPermissions("admin:role:authopn")
    public Result setRoleOperations(@RequestParam("operationIds") String operationIds,
                                    @RequestParam("roleId") int roleId){
        Result result = new Result();
        if(!roleService.setRoleOperations(roleId,operationIds)){
            result = Result.error();
        }
        return result;
    }

}
