package com.trust.service.rnt.impl;

import com.trust.dao.rnt.RntUserGagRecordMapper;
import com.trust.service.rnt.RntUserGagRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RntUserGagRecordServiceImpl implements RntUserGagRecordService {

    @Autowired
    RntUserGagRecordMapper rntUserGagRecordMapper;
    @Override
    public List getLastGagRecord(Integer userId) {
        return rntUserGagRecordMapper.lastGagRecord(userId);
    }
}
