package com.trust.admin.ucenter.service;

import com.github.pagehelper.PageInfo;
import com.trust.admin.ucenter.entity.UcUser;

import java.util.List;
import java.util.Map;

public interface UcUserService {

    PageInfo<UcUser> getUcUserByPage(int pageNo, int pageSize);

    List getAllPlatform();

    public List<Map> selectPlatformByUserId(Integer userId);
}
