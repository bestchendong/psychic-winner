package com.trust.gateway.service.ucenter;

import com.trust.gateway.service.ucenter.impl.UcUserServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name="trust-ucenter",fallback = UcUserServiceImpl.class)
public interface UcUserService {

    @RequestMapping(value="/user/getUserIdByLoginName",method = RequestMethod.GET)
    Integer getUserIdByLoginName(@RequestParam("loginName") String loginName);

}
