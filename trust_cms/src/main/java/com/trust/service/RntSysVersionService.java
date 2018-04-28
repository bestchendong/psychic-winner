package com.trust.service;

import com.trust.entity.api.RntVersion;
import com.trust.entity.cms.RntSysVersion;

public interface RntSysVersionService {

    RntSysVersion findPriceQuotesById(long id);

    void save(RntSysVersion rntSysVersion);

    void edit(RntSysVersion rntSysVersion);

    void delete(long id);

    RntVersion findRntVersionBySysName(String SysCode,String  sysName);
}
