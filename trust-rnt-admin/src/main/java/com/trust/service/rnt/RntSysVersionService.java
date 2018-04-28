package com.trust.service.rnt;

import com.github.pagehelper.PageInfo;
import com.trust.entity.rnt.RntSysVersion;

import java.util.List;

public interface RntSysVersionService {

    RntSysVersion findPriceQuotesById(long id);

    Integer save(RntSysVersion rntSysVersion);

    Integer edit(RntSysVersion rntSysVersion);

    Integer delete(Long id);

    PageInfo<RntSysVersion> findVersionByPage(int pageNum, int pageSize);

    List<RntSysVersion> findSysVersionBySysnameAndVersionnum(String sysName,String versionNum);
}
