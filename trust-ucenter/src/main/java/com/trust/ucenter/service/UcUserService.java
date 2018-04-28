package com.trust.ucenter.service;

import com.github.pagehelper.PageInfo;
import com.trust.ucenter.entity.UcUser;
import com.trust.ucenter.entity.UcUserQuery;

import java.util.List;
import java.util.Map;


public interface UcUserService {
    //注册用户
    int registry(UcUser ucUser);

    UcUser selectByPrimaryKey(Integer userId);

    UcUser selectByPhone(String phone);

    UcUser selectByNickname(String nickname);

    UcUser selectByLogin(Map map);

    int insertSelective(UcUser record);

    int uppassword(Map map);

    Map myInfo(Integer userId);

    PageInfo getUserPage(UcUserQuery ucUserQuery, Integer pageNum, Integer pageSize);

    int upUserStatus(Map map);

    int batchupUserStatus(List list, Integer userStatus,int productId);

    Map indexUserStatistics(int productId);

    int upHeadPhoto(Map map);

    Map userDetail(UcUserQuery ucUserQuery);
}