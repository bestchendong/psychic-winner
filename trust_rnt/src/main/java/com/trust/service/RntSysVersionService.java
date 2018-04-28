package com.trust.service;

import com.github.pagehelper.PageInfo;
import com.trust.entity.RntVersion;
import com.trust.entity.RntSysVersion;

import java.util.List;


public interface RntSysVersionService {

    RntSysVersion findPriceQuotesById(long id);

    void save(RntSysVersion rntSysVersion);

    void edit(RntSysVersion rntSysVersion);

    void delete(long id);

    RntVersion findVersionBySysName(String SysCode, String sysName);

    List<RntSysVersion> findVersionAll();

    PageInfo<RntSysVersion> findVersionByPage(int pageNum, int pageSize);
}
