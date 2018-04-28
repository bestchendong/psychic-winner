package com.trust.service.rnt.market.impl;

import com.github.pagehelper.PageInfo;
import com.trust.entity.market.AppInformContent;
import com.trust.service.rnt.market.AppInformService;
import com.trust.utils.Result;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @author 唐亮
 * @create 2018-04-10 13:44
 * @desc app推送消息服务调用
 **/
@Component
public class AppInformServiceImpl implements AppInformService {

    @Override
    public PageInfo<AppInformContent> findByParam(Integer pageNum, Integer pageSize, String title, String type, Date startDate, Date endDate) {
        System.out.println("调用服务失败");
        return null;
    }

    @Override
    public AppInformContent findById(Long id) {
        System.out.println("调用服务失败");
        return null;
    }

    @Override
    public Result add(AppInformContent appInformContent) {
        System.out.println("调用服务失败");
        return null;
    }

    @Override
    public Result delete(List<Long> ids) {
        System.out.println("调用服务失败");
        return null;
    }

    @Override
    public Result edit(AppInformContent appInformContent) {
        System.out.println("调用服务失败");
        return null;
    }
}
