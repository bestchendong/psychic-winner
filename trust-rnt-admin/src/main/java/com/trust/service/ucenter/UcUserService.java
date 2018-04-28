package com.trust.service.ucenter;

import com.github.pagehelper.PageInfo;
import com.trust.entity.rnt.RntUserQuery;
import com.trust.service.ucenter.impl.UcUserServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * RNT 用户service
 */
@FeignClient(name = "trust-ucenter",fallback= UcUserServiceImpl.class)
public interface UcUserService {

    @RequestMapping(value = "/user/api/page", method = RequestMethod.POST)
    PageInfo getRntUserPage(@RequestBody  RntUserQuery rntUserQuery, @RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize);

    @RequestMapping(value="/user/api/up/userstatus",method = RequestMethod.POST)
    int upUserStatus(@RequestBody Map map);

    @RequestMapping(value="/user/api/batchup/userstatus",method = RequestMethod.POST)
    int batchupUserStatus(@RequestBody List<Integer> list,@RequestParam("userStatus") Integer userStatus,@RequestParam("productId") int productId);

    @RequestMapping(value="/user/api/indexUserStatistics",method = RequestMethod.GET)
    Map indexUserStatistics(@RequestParam("productId") int productId);

    @RequestMapping(value = "/user/api/detail", method = RequestMethod.POST)
    Map userDetail(@RequestBody RntUserQuery rntUserQuery);
}
