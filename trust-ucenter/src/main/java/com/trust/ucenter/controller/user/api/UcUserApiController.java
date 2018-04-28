package com.trust.ucenter.controller.user.api;

import com.github.pagehelper.PageInfo;
import com.trust.ucenter.entity.UcUserQuery;
import com.trust.ucenter.service.UcUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user/api")
public class UcUserApiController {

    @Autowired
    private UcUserService ucUserService;
    /**
     * 分页查询接口
     */
    @ApiOperation(value="用户分页接口",notes="用户分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public PageInfo getUserPage(@RequestBody UcUserQuery ucUserQuery, @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize){
        System.out.println("ucUserQuery："+ucUserQuery);
        return ucUserService.getUserPage(ucUserQuery,pageNum,pageSize);
    }

    /**
     * 停用启用用户接口
     */
    @ApiOperation(value="停用启用用户接口",notes = "停用启用用户接口")
    @RequestMapping(value = "/up/userstatus",method = RequestMethod.POST)
    int upUserStatus(@RequestBody Map map){
        return ucUserService.upUserStatus(map);
    }

    /**
     * 批量启/停用用户
     */
    @ApiOperation(value="批量启/停用用户",notes = "批量启/停用用户接口")
    @RequestMapping(value = "/batchup/userstatus",method = RequestMethod.POST)
    int batchupUserStatus(@RequestBody List<Integer> list, @RequestParam(value="userStatus") Integer userStatus,@RequestParam(value = "productId") int productId){
        return ucUserService.batchupUserStatus(list,userStatus,productId);
    }


    /**
     * 用户相关统计数据
     */
    @RequestMapping(value = "/indexUserStatistics",method = RequestMethod.GET)
    public Map indexUserStatistics(@RequestParam(value = "productId") int productId){
        return ucUserService.indexUserStatistics(productId);
    }

    /**
     * 单个用户详情页面
     *
     */
    @RequestMapping(value = "/detail" ,method = RequestMethod.POST)
    public Map userDetail(@RequestBody UcUserQuery ucUserQuery){
        return ucUserService.userDetail(ucUserQuery);
    }
}
