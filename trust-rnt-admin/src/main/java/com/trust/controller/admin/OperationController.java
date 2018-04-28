package com.trust.controller.admin;

import com.trust.common.PageInfo;
import com.trust.common.annotation.OperationLogDes;
import com.trust.constant.log.RntOperationLogModule;
import com.trust.constant.log.RntOperationLogType;
import com.trust.entity.admin.Menu;
import com.trust.entity.admin.Operation;
import com.trust.entity.admin.RoleOperation;
import com.trust.service.admin.MenuService;
import com.trust.service.admin.OperationService;
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
@RequestMapping("/admin/operation")
public class OperationController {

    @Autowired
    private OperationService operationService;
    @Autowired
    private MenuService menuService;
    @Autowired
    private RntOperationLogService rntOperationLogService;

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
        return "/admin/operation/operation_list";
    }

    @RequestMapping(value = "/manage/add")
    @RequiresPermissions("admin:opn:add")
    public String operationManageAddPage(Model model){
        List<Menu> level4Menu = operationService.getLevelFourMenu();
        model.addAttribute("menuList",level4Menu);
        return "/admin/operation/operation_add";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<Operation> getOperationList(){
        return operationService.getOperationList();
    }

    @OperationLogDes(moduleName = RntOperationLogModule.operation)
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
            try {
                rntOperationLogService.addLog( RntOperationLogType.add,this.getClass().getMethod("addOperation", Operation.class),operation.getId());
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                System.out.println("========== Log not logged! ==========");
            }
        }
        return result;
    }

    @OperationLogDes(moduleName = RntOperationLogModule.operation)
    @RequestMapping(value = "/edit")
    @ResponseBody
    public Result editOperation(Operation operation){
        Result result = new Result();
        if(operationService.getOperationByName(operation.getMenuId(), operation.getName()) != null){
            result = Result.error();
        } else {
            Operation oldOperation = operationService.getOperationById(operation.getId());
            operationService.edit(operation);
            try {
                rntOperationLogService.addLog( RntOperationLogType.edit,this.getClass().getMethod("editOperation", Operation.class),oldOperation,operation);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                System.out.println("========== Log not logged! ==========");
            }
        }
        return result;
    }

    @OperationLogDes(moduleName = RntOperationLogModule.operation)
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
            try {
                rntOperationLogService.addLog( RntOperationLogType.delete,this.getClass().getMethod("deleteOperation", int.class),id);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                System.out.println("========== Log not logged! ==========");
            }
        }
        return result;
    }
}
