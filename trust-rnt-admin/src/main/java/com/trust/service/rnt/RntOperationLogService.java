package com.trust.service.rnt;

import com.github.pagehelper.PageInfo;
import com.trust.constant.log.RntOperationLogType;
import com.trust.entity.rnt.RntOperation;
import com.trust.utils.Result;

import java.lang.reflect.Method;

//用户操作日志
public interface RntOperationLogService {

    //添加日志
    Result addLog(RntOperationLogType operationType, Method method, Object... object);

    //分页查询全部
    PageInfo<RntOperation> getRntOperationLogAllByPage(Integer pageNum, Integer pageSize);

    //根据userId查询
    PageInfo<RntOperation> getRntOperationLogByUserid(Long userid,Integer pageNum,Integer pageSize);

    //添加操作详情
    Result addDetail(Long RntOperationLogid,Object... objects) throws IllegalAccessException;

}
