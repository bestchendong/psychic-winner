package com.trust.service.rnt.impl;

import com.trust.dao.rnt.RntUserGagMapper;
import com.trust.dao.rnt.RntUserGagRecordMapper;
import com.trust.entity.rnt.RntUserGag;
import com.trust.entity.rnt.RntUserGagRecord;
import com.trust.service.rnt.RntUserGagService;
import com.trust.shiro.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RntUserGagServiceImpl implements RntUserGagService {

    @Autowired
    RntUserGagMapper rntUserGagMapper;

    @Autowired
    RntUserGagRecordMapper rntUserGagRecordMapper;

    @Transactional
    public int gagUser(List<Integer> gagList, Integer userId,String gagReason) {
        int retInt = 0;
        for (Integer gagItem : gagList){
            RntUserGag rntUserGag = new RntUserGag();
            rntUserGag.setGagItem(gagItem);
            rntUserGag.setUserId(userId);
            retInt += rntUserGagMapper.insertSelective(rntUserGag);
            RntUserGagRecord rntUserGagRecord = new RntUserGagRecord();
            rntUserGagRecord.setUserId(userId);
            rntUserGagRecord.setGagItem(gagItem);
            rntUserGagRecord.setGagReason(gagReason);
            rntUserGagRecord.setOperatorId(0);
            rntUserGagRecord.setOperatorUserId(ShiroUtils.getUserId());
            rntUserGagRecordMapper.insertSelective(rntUserGagRecord);
        }
        return retInt;
    }

    @Override
    public List<Integer> selectByUserId(Integer userId) {
        return rntUserGagMapper.selectByUserId(userId);
    }
}
