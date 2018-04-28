package com.trust.admin.ucenter.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trust.admin.ucenter.dao.RealNameMapper;
import com.trust.admin.ucenter.dao.RealNameRecordMapper;
import com.trust.admin.ucenter.dao.UcUserMapper;
import com.trust.admin.ucenter.entity.RealName;
import com.trust.admin.ucenter.entity.RealNameRecord;
import com.trust.admin.ucenter.service.RealNameService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springfox.documentation.spring.web.json.Json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RealNameServiceImpl implements RealNameService {
    @Autowired
    RealNameMapper realNameMapper;
    @Autowired
    RealNameRecordMapper realNameRecordMapper;
    @Autowired
    UcUserMapper ucUserMapper;
    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    public PageInfo<RealName> getRealNameByPage(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<RealName> list = realNameMapper.getAllRealName();
        return new PageInfo(list);
    }

    @Override
    @Transactional
    public int audit(Map paraMap) {
        realNameMapper.upRealNameStatus(paraMap);
        RealNameRecord realNameRecord = (RealNameRecord)paraMap.get("realNameRecord");
        int ret = realNameRecordMapper.insertSelective(realNameRecord);
        Integer userId = (Integer) paraMap.get("userId");
        //审核状态
        Integer status = (Integer) paraMap.get("status");
        List<Map> platformList = ucUserMapper.selectPlatformByUserId(userId);
        if(platformList !=null && platformList.size()>0){
            for(Map platformMap : platformList){
                String chnnal = (String) platformMap.get("redis_chnnal");
                try {
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("userId",platformMap.get("user_id"));
                    jsonObject.put("nickname",platformMap.get("nickname"));
                    jsonObject.put("phone",platformMap.get("phone"));
                    jsonObject.put("realnameStatus",platformMap.get("realname_status"));
                    //审核用户  同步到通道中
                    redisTemplate.convertAndSend(chnnal, jsonObject.toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return ret;
    }
}
