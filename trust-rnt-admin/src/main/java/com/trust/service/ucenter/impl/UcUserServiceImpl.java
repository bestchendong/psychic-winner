package com.trust.service.ucenter.impl;

import com.github.pagehelper.PageInfo;
import com.trust.entity.rnt.RntUserQuery;
import com.trust.service.ucenter.UcUserService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class UcUserServiceImpl implements UcUserService {

    @Override
    public PageInfo getRntUserPage(RntUserQuery rntUserQuery, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public int upUserStatus(Map map) {
        return 0;
    }

    @Override
    public int batchupUserStatus(List<Integer> list, Integer userStatus,int productId) {
        return 0;
    }

    @Override
    public Map indexUserStatistics(int productId) {
        return null;
    }

    @Override
    public Map userDetail(RntUserQuery rntUserQuery) {
        return null;
    }
}
