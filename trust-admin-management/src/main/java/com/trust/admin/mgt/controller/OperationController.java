package com.trust.admin.mgt.controller;

import com.trust.admin.mgt.common.PageInfo;
import com.trust.admin.mgt.entity.Menu;
import com.trust.admin.mgt.entity.Operation;
import com.trust.admin.mgt.entity.RoleOperation;
import com.trust.admin.mgt.service.MenuService;
import com.trust.admin.mgt.service.OperationService;
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
@RequestMapping("/mgt/operation")
public class OperationController {

    @Autowired
    private OperationService operationService;
    @Autowired
    private MenuService menuService;

    /**
     * @param pageNo
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/manage/list")
    @RequiresPermissions("admin:operation:manage:list")
    public String operationManageListPage(Model model, @RequestParam(value = "pageNo", defaultValue = "1")int pageNo,
                                          @RequestParam(value = "pageSize", defaultValue = "10")int pageSize){
        PageInfo pageInfo = operationService.geOperationByPage(pageNo,pageSize);
        model.addAttribute("pageInfo",pageInfo);
        return "/mgt/operation/operation_list";
    }

    @RequestMapping(value = "/manage/add")
    @RequiresPermissions("admin:opn:add")
    public String operationManageAddPage(Model model){
        List<Menu> level4Menu = operationService.getLevelFourMenu();
        model.addAttribute("menuList",level4Menu);
        return "/mgt/operation/operation_add";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<Operation> getOperationList(){
        return operationService.getOperationList();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions("admin:opn:add")
    public Result addOperation(Operation operation){
        Result result = new Result();
        if(operationService.getOperationByName(operation.getMenuId(), operation.getName()) != null
                || operationService.getOperationByKey( operation.getOperationId()) != null){
            result = Result.error();
        } else {
            operationService.add(operation);
        }
        return result;
    }

    @RequestMapping(value = "/edit")
    @ResponseBody
    public Result editOperation(Operation operation){
        Result result = new Result();
        if(operationService.getOperationByName(operation.getMenuId(), operation.getName()) != null){
            result = Result.error();
        } else {
            operationService.edit(operation);
        }
        return result;
    }

    @RequestMapping(value = "/delete")
    @ResponseBody
    @RequiresPermissions("admin:opn:delete")
    public Result deleteOperation(@RequestParam("id")int id){
        Result result = new Result();
        List<RoleOperation> roleOperationList = operationService.getRoleOperationByOperationId(id);
        System.out.println(roleOperationList);
        if( roleOperationList != null && roleOperationList.size() > 0){
            result = Result.error();
        } else {
            operationService.delete(id);
        }
        return result;
    }
}
