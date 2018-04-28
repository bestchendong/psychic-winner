package com.trust.service.rnt.market;

import com.github.pagehelper.PageInfo;
import com.trust.entity.market.BackInformContent;
import com.trust.service.rnt.market.impl.BackInformServiceImpl;
import com.trust.utils.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@FeignClient(name="trust-market-service",fallback = BackInformServiceImpl.class)
public interface BackInformService {

    @RequestMapping(value = "/market/backinform/query/param",method = RequestMethod.GET)
    PageInfo<BackInformContent> findByParam(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, @RequestParam("title")String title, @RequestParam("type")String type, @RequestParam("startDate")Date startDate, @RequestParam("endDate")Date endDate);

    @RequestMapping(value = "/market/backinform/query/id",method = RequestMethod.GET)
    BackInformContent findById(@RequestParam("id")Long id);

    @RequestMapping(value = "/market/backinform/add",method = RequestMethod.POST)
    Result add(@RequestBody BackInformContent backInformContent);

    @RequestMapping(value = "/market/backinform/delete",method = RequestMethod.POST)
    Result delete(@RequestBody List<Long> ids);

    @RequestMapping(value = "/market/backinform/edit",method = RequestMethod.POST)
    Result edit(@RequestBody BackInformContent backInformContent);

    @RequestMapping(value = "/market/api/backInform/editState",method = RequestMethod.POST)
    Result editState(@RequestParam("userid") Long userid,@RequestParam("backinformid") Long backinformid);

    @RequestMapping(value = "/market/api/backInform/list",method = RequestMethod.GET)
    Result getBackInformAll(@RequestParam("userid") Long userid);

}
