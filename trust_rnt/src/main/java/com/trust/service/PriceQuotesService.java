package com.trust.service;

import com.trust.service.impl.PriceQuotesServiceImpl;
import com.trust.utils.Result;
import com.trust.utils.ResultData;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name = "trust-cms-service",fallback = PriceQuotesServiceImpl.class)
public interface PriceQuotesService {
    @RequestMapping(value="/cms/api/pricequotes/list", method = RequestMethod.GET)
    Result getPriceQuotesByparams(@RequestParam(value = "city",required = false) String city, @RequestParam(value = "sysCode",required = false) String sysCode);
}
