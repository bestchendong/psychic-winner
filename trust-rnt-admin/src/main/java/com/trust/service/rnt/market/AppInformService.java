package com.trust.service.rnt.market;

import com.github.pagehelper.PageInfo;
import com.trust.entity.market.AppInformContent;
import com.trust.service.rnt.market.impl.AppInformServiceImpl;
import com.trust.utils.Result;
import com.trust.utils.ResultData;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@FeignClient(name="trust-market-service",fallback = AppInformServiceImpl.class)
public interface AppInformService {

    @RequestMapping(value="/market/appinform/query/param", method = RequestMethod.GET)
    PageInfo<AppInformContent> findByParam(@RequestParam("pageNum")Integer pageNum, @RequestParam("pageSize") Integer pageSize, @RequestParam("title")String title, @RequestParam("type")String type, @RequestParam("startDate")Date startDate, @RequestParam("endDate")Date endDate);

    @RequestMapping(value = "/market/appinform/query/id",method = RequestMethod.GET)
    AppInformContent findById(@RequestParam("id")Long id);

    @RequestMapping(value = "/market/appinform/add",method = RequestMethod.POST)
    Result add(@RequestBody AppInformContent appInformContent);

    @RequestMapping(value = "/market/appinform/delete",method = RequestMethod.POST)
    Result delete(@RequestBody List<Long> ids);

    @RequestMapping(value = "/market/appinform/edit",method = RequestMethod.POST)
    Result edit(@RequestBody AppInformContent appInformContent);
}
