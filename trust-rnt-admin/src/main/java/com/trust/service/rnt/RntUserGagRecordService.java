package com.trust.service.rnt;

import java.util.List;

public interface RntUserGagRecordService {

    //最新禁言操作记录
    public List getLastGagRecord(Integer userId);
}
