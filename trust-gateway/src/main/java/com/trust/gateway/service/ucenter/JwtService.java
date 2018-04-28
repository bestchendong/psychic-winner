package com.trust.gateway.service.ucenter;

import com.trust.gateway.service.ucenter.impl.JwtServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name="trust-ucenter",fallback = JwtServiceImpl.class)
public interface JwtService {

    @RequestMapping(value="/user/jwt/verity",method = RequestMethod.POST)
    String verity(@RequestParam("jwt") String jwt);

}
