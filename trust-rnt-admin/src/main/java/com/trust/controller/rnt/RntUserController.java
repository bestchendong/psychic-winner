package com.trust.controller.rnt;

import com.github.pagehelper.PageInfo;
import com.trust.entity.rnt.RntUserGag;
import com.trust.entity.rnt.RntUserQuery;
import com.trust.service.rnt.RntUserGagRecordService;
import com.trust.service.rnt.RntUserGagService;
import com.trust.service.ucenter.UcUserService;
import com.trust.utils.Result;
import com.trust.utils.ResultData;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/rntadmin/user")
public class RntUserController {

    private final int productId =1;//rnt产品标识

    @Autowired
    RntUserGagService rntUserGagService;

    @Autowired
    UcUserService ucUserService;

    @Autowired
    RntUserGagRecordService rntUserGagRecordService;

    @RequestMapping(value = "/page",method = RequestMethod.GET)
    public String getRntUserPage(Model model, RntUserQuery rntUserQuery, @RequestParam(value = "pageNum", required = false,defaultValue = "1") Integer pageNum,
                                 @RequestParam(value = "pageSize", required = false,defaultValue = "10") Integer pageSize){
        System.out.println("rntUserQuery："+rntUserQuery);
//        rntUserQuery.setProductId(productId);
        PageInfo pageInfo = ucUserService.getRntUserPage(rntUserQuery,pageNum,pageSize);
        model.addAttribute("rntUser",rntUserQuery);
        model.addAttribute("pageNum",pageNum);
        model.addAttribute("pageSize",pageSize);
        model.addAttribute("pageInfo",pageInfo);
        System.out.println("getRntUserPage pageInfo:"+pageInfo);
        return "/rnt/user/user";
    }
    @RequestMapping(value = "/up/userstatus",method = RequestMethod.POST)
    @ResponseBody
    public Result upUserStatus(@RequestParam(value = "userId",required =  true)Integer userId, Integer userStatus){
        Map paramMap = new HashMap();
        paramMap.put("userId",userId);
        paramMap.put("userStatus",userStatus);
        paramMap.put("productId",productId);
        int up = ucUserService.upUserStatus(paramMap);
        if(up==1){
            return new ResultData("200","success");
        }else{
            return new ResultData("500","error");
        }
    }
    @RequestMapping(value = "/batchup/userstatus",method = RequestMethod.POST)
    @ResponseBody
    public Result batchupUserStatus(@RequestParam(value = "userIds[]",required =  true)List<Integer> list, Integer userStatus){
        int up = ucUserService.batchupUserStatus(list,userStatus,productId);
        System.out.println("batchupUserStatus up:"+up);
        if(list.size()>0 && list.size()==up){
            return new ResultData("200","success");
        }else{
            return new ResultData("500","error");
        }
    }

    /**
     * 禁言
     */
    @ApiOperation(value="禁言",notes="私信、评论、供需禁言")
    @RequestMapping(value = "/gag",method = RequestMethod.GET)
    @ResponseBody
    public Result gag(@RequestParam(value = "gags[]",required =  true) List<Integer> gagList,@RequestParam(value = "userId") Integer userId,
                      @RequestParam(value = "gagReason") String gagReason){
        if(gagList!=null && gagList.size()>0 && userId != null ){
            rntUserGagService.gagUser(gagList,userId,gagReason);
        }else{
            return new Result("200","参数传入错误!");
        }
        return new Result("","");
    }
    /**
     * 单个用户详情  基本信息+实名认证+禁言
     */
    @RequestMapping(value = "detail",method = RequestMethod.GET)
    public String userDetail(Model model,@RequestParam(value = "userId" , required = true) Integer userId){
        RntUserQuery rntUserQuery = new RntUserQuery();
        rntUserQuery.setProductId(1);
        rntUserQuery.setUserId(userId);
        Map userMap = ucUserService.userDetail(rntUserQuery);
        String gagItemS = "";
        //禁言项
        List<Integer> gagItemList = rntUserGagService.selectByUserId(userId);
        if(gagItemList != null && gagItemList.size()>0){
            for(Integer gagItem : gagItemList){
                if("".equals(gagItemS)){
                    gagItemS = gagItem.toString();
                }else{
                    gagItemS = gagItemS + "," +gagItem;
                }
            }
        }
        userMap.put("gagItemS",gagItemS);
        // 禁言项 最新操作记录
        List gagRecordList = new ArrayList();
        if(!"".equals(gagItemS)){
            gagRecordList = rntUserGagRecordService.getLastGagRecord(userId);
        }
        userMap.put("gagRecordList",gagRecordList);
        model.addAttribute("userMap",userMap);
        return "";
    }
}
