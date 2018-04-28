package com.trust.controller.rnt;

import com.github.pagehelper.PageInfo;
import com.trust.entity.admin.Manager;
import com.trust.entity.rnt.RntOperation;
import com.trust.service.rnt.RntOperationLogService;
import com.trust.utils.Result;
import com.trust.utils.ResultData;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author 唐亮
 * @create 2018-02-01 16:01
 * @desc 用户操作日志
 **/
@Controller
@RequestMapping("/rnt/operationlog")
public class OperationLogController {

    @Autowired
    private RntOperationLogService rntOperationLogService;

    @ApiOperation(value = "查询所有用户操作日志", notes = "分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页数", required = false,  paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "pageSize", value = "条数", required = false, paramType = "query",dataType = "int")
    })
    @RequestMapping(value = "/all/page",method = RequestMethod.GET)
    @ResponseBody
    public Result getRntOperationLogAllByPage(@RequestParam(value = "pageNum", defaultValue = "1")int pageNum, @RequestParam(value = "pageSize",defaultValue = "10") int pageSize){
        PageInfo<RntOperation> pageInfo = rntOperationLogService.getRntOperationLogAllByPage(pageNum, pageSize);
        if (pageInfo!=null){
            return new ResultData("200","success",pageInfo);
        }
        return new Result("500","error");
    }

    @ApiOperation(value = "查询个人操作日志", notes = "分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userid", value = "用户id", required = false,  paramType = "query",dataType = "long"),
            @ApiImplicitParam(name = "pageNum", value = "页数", required = false,  paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "pageSize", value = "条数", required = false, paramType = "query",dataType = "int")
    })
    @RequestMapping(value = "/oneself/userid",method = RequestMethod.GET)
    @ResponseBody
    public Result getRntOperationLogByUserid(@RequestParam(value = "userid")Long userid, @RequestParam(value = "pageNum", defaultValue = "1")int pageNum, @RequestParam(value = "pageSize",defaultValue = "10") int pageSize, HttpSession session){
        if (userid!=null){
            PageInfo<RntOperation> pageInfo = rntOperationLogService.getRntOperationLogByUserid(userid, pageNum, pageSize);
            if (pageInfo!=null){
                return new ResultData("200","success",pageInfo);
            }
            return new Result("500","error");
        }
        Manager manager = (Manager) (session.getAttribute("user"));
        if (manager!=null && manager.getManagerId()!=null){
            int managerId = manager.getManagerId();
            PageInfo<RntOperation> pageInfo = rntOperationLogService.getRntOperationLogByUserid((long)managerId, pageNum, pageSize);
            if (pageInfo!=null){
                return new ResultData("200","success",pageInfo);
            }
        }
        return new Result("500","error");
    }

    @RequestMapping("/toFind")
    public String toFind(){
       return "/admin/myaccount/operation_log";
    }

}
