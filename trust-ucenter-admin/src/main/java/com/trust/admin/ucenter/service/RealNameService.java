package com.trust.admin.ucenter.service;

import com.github.pagehelper.PageInfo;
import com.trust.admin.ucenter.entity.RealName;

import java.util.Map;

public interface RealNameService {

    PageInfo<RealName> getRealNameByPage(int pageNo,int pageSize);

    int audit(Map paraMap);
}
