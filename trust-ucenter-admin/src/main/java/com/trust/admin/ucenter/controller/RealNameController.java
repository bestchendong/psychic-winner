package com.trust.admin.ucenter.controller;

import com.github.pagehelper.PageInfo;
import com.trust.admin.ucenter.entity.RealNameRecord;
import com.trust.admin.ucenter.service.RealNameService;
import com.trust.admin.ucenter.utils.result.ResultData;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

@Controller
@RequestMapping("/ucadmin/realname")
public class RealNameController{

    @Autowired
    RealNameService realNameService;

    @RequestMapping({"/page"})
    public String realNamePage(Model model, @RequestParam(value = "pageNo",defaultValue = "1") int pageNo, @RequestParam(value = "pageSize",defaultValue = "10") int pageSize) {

        PageInfo pageInfo = realNameService.getRealNameByPage(pageNo,pageSize);
        model.addAttribute("pageInfo", pageInfo);
        return "/user_list";
    }
    @ApiOperation(value="实名审核",notes="实名状态1：已实名 2：未实名 3：审核中 0：审核不通过")
    @RequestMapping("/audit")
    @ResponseBody
    public ResultData audit(@RequestParam(value="userId" , required = true) Integer userId, @RequestParam(value="status" , required = true) Integer status,
                            @RequestParam(value="opinion" , required = false) String opinion, HttpServletRequest request){
        Map paraMap = new HashMap<>();
        paraMap.put("userId",userId);
        paraMap.put("status",status);
        paraMap.put("opinion",opinion);
        Integer auditUserId = (Integer) request.getSession().getAttribute("userId");
        RealNameRecord realNameRecord = new RealNameRecord();
        realNameRecord.setUserId(userId);
        realNameRecord.setRealnameStatus(status);
        realNameRecord.setAuditUserId(auditUserId);
        realNameRecord.setAuditOpinion(opinion);
        paraMap.put("realNameRecord",realNameRecord);
        int ret = realNameService.audit(paraMap);
        if(ret == 1){
            return  new ResultData("200","success","");
        }else{
            return  new ResultData("500","fail","");
        }
    }
}
