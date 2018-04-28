package com.trust.service.rnt.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trust.common.annotation.CacheAnnotation;
import com.trust.common.annotation.OperationLogAttr;
import com.trust.common.annotation.OperationLogDes;
import com.trust.common.constant.cache.CacheConstants;
import com.trust.constant.log.RntOperationLogType;
import com.trust.dao.rnt.RntOperationDetailMapper;
import com.trust.dao.rnt.RntOperationMapper;
import com.trust.entity.admin.Manager;
import com.trust.entity.rnt.*;
import com.trust.service.rnt.RntOperationLogService;
import com.trust.utils.Result;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @author 唐亮
 * @create 2018-01-31 8:52
 * @desc 用户操作日志
 * @Version 1.0
 **/
@Service
public class RntOperationLogServiceImpl implements RntOperationLogService {

    @Autowired
    private RntOperationDetailMapper rntOperationDetailMapper;

    @Autowired
    private RntOperationMapper rntOperationMapper;

    @Override
    @Transactional
    @CacheAnnotation(operationType = CacheConstants.operationType_remove,moduleName = "rntOperationLog")
    public Result addLog(RntOperationLogType operationType, Method method, Object... objects) {
        try {
            if (operationType!=null && method!=null){
                ServletRequestAttributes servletRequest = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
                HttpServletRequest request = servletRequest.getRequest();
                HttpSession session = request.getSession(true);
                Object user = session.getAttribute("user");
                if (user!=null && user instanceof Manager){
                    Manager manager = (Manager) user;
                    if (manager.getManagerId()!=null && manager.getRealName()!=null){
                        RntOperation rntOperation = new RntOperation();
                        rntOperation.setOperationlogUserid((long)manager.getManagerId());
                        rntOperation.setOperationlogUsername(manager.getRealName());
                        rntOperation.setOperationlogTime(new Date());
                        //获取用户ip
                        String ip = request.getHeader("X-Forwarded-For");
                        if(StringUtils.isNotEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)){
                            //多次反向代理后会有多个ip值，第一个ip才是真实ip
                            int index = ip.indexOf(",");
                            if(index != -1){
                                ip.substring(0,index);
                            }
                        }else{
                            ip = request.getHeader("X-Real-IP");
                            if(StringUtils.isNotEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)){
                            }else{
                                ip = request.getRemoteAddr();
                            }
                        }
                        rntOperation.setOperationlogIp(ip);
                        OperationLogDes operationLogDes = method.getAnnotation(OperationLogDes.class);
                        if (operationLogDes!=null){
                            rntOperation.setOperationlogModulename(operationLogDes.moduleName().toString());
                            rntOperation.setOperationlogChecklevel(operationLogDes.checkLevel().toString());
                            rntOperation.setOperationlogCode(operationLogDes.code().toString());
                            rntOperation.setOperationlogRemarks(operationLogDes.remarks().toString());
                            rntOperation.setOperationlogStatus(operationLogDes.status().toString());
                        }
                        //根据操作类型存储
                        if (operationType.toString().equals("add")){
                            rntOperation.setOperationlogCategory("新增");
                            if (objects!=null && objects.length==1){
                                rntOperation.setOperationlogRemarks("新增数据ID:"+objects[0]);
                            }
                            rntOperation.setOperationlogDes("新增一条数据");
                            rntOperation.setOperationlogResult("成功");
                            int addResult = rntOperationMapper.insert(rntOperation);
                            if (addResult == 1){
                                return new Result("200","success");
                            }
                        }else if (operationType.toString().equals("delete")){
                            rntOperation.setOperationlogCategory("删除");
                            if (objects!=null && objects.length==1){
                                rntOperation.setOperationlogRemarks("删除数据ID:"+objects[0]);
                            }
                            rntOperation.setOperationlogDes("删除一条数据");
                            rntOperation.setOperationlogResult("成功");
                            int addResult = rntOperationMapper.insert(rntOperation);
                            if (addResult==1){
                                return new Result("200","success");
                            }
                        }else if (operationType.toString().equals("edit")){
                            rntOperation.setOperationlogCategory("修改");
                            rntOperation.setOperationlogDes("修改一条数据");
                            if (objects!=null && objects.length==2){
                                if (objects[0].getClass()!=null){
                                    Field[] declaredFields = objects[0].getClass().getDeclaredFields();
                                    if (declaredFields!=null && declaredFields[0]!=null){
                                        declaredFields[0].setAccessible(true);
                                        Object operationId = declaredFields[0].get(objects[0]);
                                        rntOperation.setOperationlogRemarks("修改数据ID:"+operationId.toString());
                                    }
                                }
                            }
                            rntOperation.setOperationlogResult("成功");
                            int addResult = rntOperationMapper.insert(rntOperation);
                            if (addResult==1){
                                Long operationLogid = rntOperation.getOperationlogId();
                                if (operationLogid!=null){
                                    Result result = this.addDetail(operationLogid, objects);
                                    if (result.get("code").equals("200")){
                                        rntOperation.setOperationlogCode("true");
                                        rntOperationMapper.updateByPrimaryKey(rntOperation);
                                    }
                                }
                                return new Result("200","未比较新旧数据！");
                            }else{
                                return new Result("500","error");
                            }
                        }else{
                            rntOperation.setOperationlogCategory("get");
                            //查询记录暂不支持
                            return new Result("200","此功能暂未开放!");
                        }
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return new Result("500","error");
        }
        return new Result("500","error");
    }

    //分页查询全部
    @Override
    @CacheAnnotation(operationType = CacheConstants.operationType_query,moduleName = "rntOperationLog")
    public PageInfo<RntOperation> getRntOperationLogAllByPage(Integer pageNum, Integer pageSize) {
        try {
            if (pageNum!=null && pageSize!=null){
                //分页
                PageHelper.startPage(pageNum,pageSize);
                RntOperationExample rntOperationExample = new RntOperationExample();
                rntOperationExample.setOrderByClause("operationlog_time desc");
                List<RntOperation> rntOperations = rntOperationMapper.selectByExample(rntOperationExample);
                PageInfo<RntOperation> pageInfo = new PageInfo<>(rntOperations);
                return pageInfo;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //根据用户id查询指定用户的操作日志
    @Override
    @CacheAnnotation(operationType = CacheConstants.operationType_query,moduleName = "rntOperationLog")
    public PageInfo<RntOperation> getRntOperationLogByUserid(Long userid,Integer pageNum,Integer pageSize) {
        try {
            if (userid!=null && pageNum!=null && pageSize!=null){
                PageHelper.startPage(pageNum,pageSize);
                RntOperationExample rntOperationExample = new RntOperationExample();
                rntOperationExample.setOrderByClause("operationlog_time desc");
                RntOperationExample.Criteria criteria = rntOperationExample.createCriteria();
                criteria.andOperationlogUseridEqualTo(userid);
                List<RntOperation> rntOperations = rntOperationMapper.selectByExample(rntOperationExample);
                PageInfo<RntOperation> pageInfo = new PageInfo<>(rntOperations);
                return pageInfo;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //添加日志详情
    @Override
    @Transactional
    @CacheAnnotation(operationType = CacheConstants.operationType_remove,moduleName = "rntOperationLog")
    public Result addDetail(Long operationLogid,Object... objects){
        try {
            if (operationLogid!=null){
                if (objects!=null && objects.length==2){
                    //只有两个对象都是同一类型的才有可比性
                    if (objects[0].getClass()!=null && objects[1].getClass()!=null && objects[0].getClass()==objects[1].getClass()){
                        System.out.println(objects[0].getClass().equals(objects[1].getClass()));
                        RntOperationDetail rntOperationDetail = null;
                        //获取实体对象的所有属性
                        Field[] fields = objects[0].getClass().getDeclaredFields();
                        for (Field field : fields) {
                            if (field!=null){
                                field.setAccessible(true);
                                Object newValue = field.get(objects[1]);
                                Object oldValue = field.get(objects[0]);
                                if (newValue!=null && !newValue.equals(oldValue)){
                                    rntOperationDetail = new RntOperationDetail();
                                    rntOperationDetail.setOperationlogDetailsBefore(oldValue.toString());
                                    rntOperationDetail.setOperationlogDetailsAfter(newValue.toString());
                                    rntOperationDetail.setOperationlogDetailsAttributename(field.getName());
                                    OperationLogAttr fieldAnnotation = field.getAnnotation(OperationLogAttr.class);
                                    if (fieldAnnotation!=null){
                                        String attributeDes = fieldAnnotation.attributeDes();
                                        if (attributeDes!=null){
                                            rntOperationDetail.setOperationlogDetailsAttributedes(attributeDes);
                                        }
                                    }
                                }
                            }
                            if (rntOperationDetail!=null){
                                rntOperationDetail.setOperationlogDetailsLogid(operationLogid);
                                rntOperationDetailMapper.insert(rntOperationDetail);
                                rntOperationDetail = null;
                            }
                        }
                        RntOperationDetailExample rntOperationDetailExample = new RntOperationDetailExample();
                        RntOperationDetailExample.Criteria criteria = rntOperationDetailExample.createCriteria();
                        criteria.andOperationlogDetailsLogidEqualTo(operationLogid);
                        int i = rntOperationDetailMapper.countByExample(rntOperationDetailExample);
                        if (i > 0){
                            return new Result("200","success");
                        }
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            return new Result("500","error");
        }
        return new Result("500","error");
    }
}
