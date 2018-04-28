package com.trust.admin.ucenter.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trust.admin.ucenter.dao.UcUserMapper;
import com.trust.admin.ucenter.entity.UcUser;
import com.trust.admin.ucenter.service.UcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UcUserServiceImpl implements UcUserService{

    @Autowired
    private UcUserMapper ucUserMapper;
    @Override
    public PageInfo<UcUser> getUcUserByPage(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<Map> list = ucUserMapper.getAllUcUser();
        if(list!=null && list.size()>0){
            for(Map userMap : list){
                Integer userId = (Integer) userMap.get("user_id");
                String platformNames = "";
                List<Map> platformList = ucUserMapper.selectPlatformByUserId(userId);
                if(platformList != null && platformList.size()>0){
                    for(Map platformMap : platformList){
                        if("".equals(platformNames)){
                            platformNames = (String) platformMap.get("platform_name");
                        }else{
                            platformNames = platformNames+","+(String) platformMap.get("platform_name");;
                        }
                    }
                }
                userMap.put("platformNames",platformNames);
            }
        }
        return new PageInfo(list);
    }

    @Override
    public List getAllPlatform() {
        return ucUserMapper.getAllPlatform();
    }

    public List<Map> selectPlatformByUserId(Integer userId){
        return ucUserMapper.selectPlatformByUserId(userId);
    }
}
