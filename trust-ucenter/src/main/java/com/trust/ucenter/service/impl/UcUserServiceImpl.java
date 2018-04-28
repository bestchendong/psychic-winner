package com.trust.ucenter.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trust.common.utils.DateUtil;
import com.trust.ucenter.dao.RealNameMapper;
import com.trust.ucenter.dao.UcUserMapper;
import com.trust.ucenter.entity.RealName;
import com.trust.ucenter.entity.UcUser;
import com.trust.ucenter.entity.UcUserExample;
import com.trust.ucenter.entity.UcUserQuery;
import com.trust.ucenter.service.UcUserService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class UcUserServiceImpl implements UcUserService {

    @Autowired
    private UcUserMapper ucUserMapper;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    private RealNameMapper realNameMapper;

    //注册用户
    public int registry(UcUser ucUser) {
        return 0;
    }

    @Override
    public UcUser selectByPrimaryKey(Integer userId) {
        return ucUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public UcUser selectByPhone(String phone) {
        return ucUserMapper.selectByPhone(phone);
    }

    @Override
    public UcUser selectByNickname(String nickname) {
        return ucUserMapper.selectByNickname(nickname);
    }


    @Override
    public UcUser selectByLogin(Map map) {
        return ucUserMapper.selectByLogin(map);
    }

    @Override
    @Transactional
    public int insertSelective(UcUser record) {
        int result =  ucUserMapper.insertSelective(record);
        String phone = record.getPhone();
        UcUser ucUser = ucUserMapper.selectByPhone(phone);
        int userId = ucUser.getUserId();
        int platformId = record.getPlatformId();
        Map platformMap = new HashMap();
        platformMap.put("userId",userId);
        platformMap.put("platformId",platformId);
        ucUserMapper.insertProductUser(platformMap);
        return result;
    }

    @Override
    public int uppassword(Map map) {
        return ucUserMapper.uppassword(map);
    }

    @Override
    public Map myInfo(Integer userId) {
        return ucUserMapper.myInfo(userId);
    }

    @Override
    public PageInfo getUserPage(UcUserQuery ucUserQuery, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List list = ucUserMapper.selectByUserQuery(ucUserQuery);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }

    @Override
    public int upUserStatus(Map map) {
        Integer userStatus = (Integer)map.get("userStatus");
        Integer userId = (Integer)map.get("userId");
        if(userStatus == 0){//停用   加到redis黑名单
            SetOperations<String,Integer> oper = redisTemplate.opsForSet();
            oper.add("blackSet",userId);
                /*Set<Integer> blackSet = new HashSet<Integer>();
                if(!redisTemplate.hasKey("blackSet")){
                    //没有黑名单key，则是第一次加到redis 黑名单，从mysql中所有黑名单加到redis
                    blackSet = rntUserService.selectBlackUser();
                    if(blackSet!=null && blackSet.size()>0){
                        for(Integer i : blackSet){
                            oper.add("blackSet",i);
                        }
                    }

                }else{
                    //存在黑名单 把停用的改用户加上
                    oper.add("blackSet",userId);
                }*/

        }else if(userStatus == 1){//启用  删除redis黑名单
            SetOperations<String,Integer> oper = redisTemplate.opsForSet();
            if(oper.isMember("blackSet",userId)){
                oper.remove("blackSet",userId);
            }
        }
        return ucUserMapper.upUserStatus(map);
    }

    @Override
    @Transactional
    public int batchupUserStatus(List list, Integer userStatus,int productId) {
        int result = 0;
        if(list !=null && list.size()>0){
            for(Object obj : list){
                Integer userId = (Integer) obj;
                Map paraMap = new HashMap();
                paraMap.put("userId",userId);
                paraMap.put("userStatus",userStatus);
                paraMap.put("productId",productId);
                if(userStatus == 0){//停用   加到redis黑名单
                    SetOperations<String,Integer> oper = redisTemplate.opsForSet();
                    oper.add("blackSet",userId);
                }else if(userStatus == 1){//启用  删除redis黑名单
                    SetOperations<String,Integer> oper = redisTemplate.opsForSet();
                    if(oper.isMember("blackSet",userId)){
                        oper.remove("blackSet",userId);
                    }
                }
                result += ucUserMapper.upUserStatus(paraMap);
            }
        }
        System.out.println("batchupUserStatus result:"+result);
        return result;
    }

    @Override
    public Map indexUserStatistics(int productId) {
        //今日
        String today = DateUtil.today();
        //昨日
        String yestDay = DateUtil.formatDate(DateUtil.getOffsiteDate(new Date(), Calendar.DATE,-1));
        //本月
        String curMonth = new SimpleDateFormat("yyyy-MM").format(new Date());
        Map paraMap  = new HashMap();
        paraMap.put("productId",productId);
        int all = ucUserMapper.countByDate(paraMap);
        paraMap.put("realNameStatus",3);//实名待审核
        int waitRealNameAudit = ucUserMapper.countByDate(paraMap);
        paraMap.clear();
        paraMap.put("productId",productId);
        paraMap.put("searchDate",today);
        paraMap.put("searchType","01");//天
        int todayNew = ucUserMapper.countByDate(paraMap);//今日新增
        paraMap.put("searchDate",yestDay);
        int yestDayNew = ucUserMapper.countByDate(paraMap);//昨日新增
        paraMap.put("searchDate",curMonth);
        paraMap.put("searchType","02");//月
        int curMonthNew = ucUserMapper.countByDate(paraMap);//本月新增
        Map retMap = new HashMap();
        retMap.put("todayNew",todayNew);
        retMap.put("yestDayNew",yestDayNew);
        retMap.put("curMonthNew",curMonthNew);
        retMap.put("all",all);
        retMap.put("waitRealNameAudit",waitRealNameAudit);
        return retMap;
    }

    @Override
    public int upHeadPhoto(Map map) {
        return ucUserMapper.upHeadPhoto(map);
    }

    @Override
    public Map userDetail(UcUserQuery ucUserQuery) {
        Map userMap = ucUserMapper.userDetail(ucUserQuery);
        //实名状态
        Integer realNameStatus = (Integer)userMap.get("realNameStatus");
        if(realNameStatus == 2){//未实名

        }else{
            RealName realName = realNameMapper.selectByUserId(ucUserQuery.getUserId());
            try {
                userMap.putAll(objectToMap(realName));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return userMap;
    }

    public static Map<String, Object> objectToMap(Object obj) throws Exception {
        if(obj == null){
            return null;
        }
        Map<String, Object> map = new HashMap<String, Object>();

        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            map.put(field.getName(), field.get(obj));
        }
        return map;
    }
}

