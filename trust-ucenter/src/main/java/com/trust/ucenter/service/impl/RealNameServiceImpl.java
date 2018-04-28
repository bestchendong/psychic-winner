package com.trust.ucenter.service.impl;

import com.trust.ucenter.dao.RealNameMapper;
import com.trust.ucenter.entity.RealName;
import com.trust.ucenter.service.RealNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RealNameServiceImpl implements RealNameService {
    @Autowired
    private RealNameMapper realNameMapper;

    @Override
    @Transactional
    public int insertRealName(RealName realName) {
        Integer userId = realName.getUserId();
        RealName selRealName = realNameMapper.selectByUserId(userId);
        if(selRealName!=null){
            Integer id = selRealName.getId();
            realNameMapper.deleteByPrimaryKey(id);
        }
        return realNameMapper.insertSelective(realName);
    }

    @Override
    public RealName selectByUserId(Integer userId) {
        return realNameMapper.selectByUserId(userId);
    }
}
