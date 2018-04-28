package com.trust.service.rnt.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trust.common.annotation.CacheAnnotation;
import com.trust.common.constant.cache.CacheConstants;
import com.trust.dao.rnt.RntSysVersionMapper;
import com.trust.entity.rnt.RntSysVersion;
import com.trust.entity.rnt.RntSysVersionExample;
import com.trust.service.rnt.RntSysVersionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author tangl
 * @Descrintion
 * @Date create 2017-12-20 13:42
 * @Version 1.0
 */
@Service
public class RntSysVersionServiceImpl implements RntSysVersionService {

    @Resource
    private RntSysVersionMapper rntSysVersionMapper;

    /**
     * @Descrintion: 分页查询版本信息
     * @param: pageNum pageSize
     * @return: pageInfo
     */
    @Override
    @CacheAnnotation(operationType = CacheConstants.operationType_query,moduleName = "rntSysVersion")
    public PageInfo<RntSysVersion> findVersionByPage(int pageNum, int pageSize) {
        try {
            PageHelper.startPage(pageNum, pageSize);
            RntSysVersionExample rntSysVersionExample = new RntSysVersionExample();
            rntSysVersionExample.setOrderByClause("sys_code desc");
            List<RntSysVersion> list= rntSysVersionMapper.selectByExample(rntSysVersionExample);
            PageInfo<RntSysVersion> pageInfo = new PageInfo<>(list);
            return pageInfo;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 根据ID查找版本信息
     * @param id
     * @return
     */
    @Override
    @CacheAnnotation(operationType = CacheConstants.operationType_query,moduleName = "rntSysVersion")
    public RntSysVersion findPriceQuotesById(long id) {
        try {
           return  rntSysVersionMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     *新增版本信息
     * @param rntSysVersion
     */
    @Override
    @Transactional
    @CacheAnnotation(operationType = CacheConstants.operationType_remove,moduleName = "rntSysVersion")
    public Integer save(RntSysVersion rntSysVersion) {
        try {
            if (rntSysVersion!=null && rntSysVersion.getSysName()!=null){
                Integer maxNum = this.getMaxNum(rntSysVersion);
                String sysCode = this.getSysCode();
                if (maxNum!=null && sysCode!=null){
                    rntSysVersion.setNum(maxNum);
                    rntSysVersion.setSysCode(sysCode);
                    int saveResult = rntSysVersionMapper.insertSelective(rntSysVersion);
                    return saveResult;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
        return null;
    }

    /**
     *修改版本信息
     * @param rntSysVersion
     */
    @Override
    @Transactional
    @CacheAnnotation(operationType = CacheConstants.operationType_remove,moduleName = "rntSysVersion")
    public Integer edit(RntSysVersion rntSysVersion) {
        try{
            if (rntSysVersion!=null){
                Integer maxNum = this.getMaxNum(rntSysVersion);
                String sysCode = this.getSysCode();
                if (maxNum!=null && sysCode!=null){
                    rntSysVersion.setNum(maxNum);
                    rntSysVersion.setSysCode(sysCode);
                    int editResult = rntSysVersionMapper.updateByPrimaryKeySelective(rntSysVersion);
                    return editResult;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return null;
    }

    /**
     * 根据ID删除版本信息
     * @param id
     */
    @Override
    @Transactional
    @CacheAnnotation(operationType = CacheConstants.operationType_remove,moduleName = "rntSysVersion")
    public Integer delete(Long id) {
        try{
            if (id!=null){
                int deleteResult = rntSysVersionMapper.deleteByPrimaryKey(id);
                return deleteResult;
            }
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
        return null;
    }

    /**
     * 根据系统名称查询
     * @param sysName
     * @return
     */
    @Override
    @CacheAnnotation(operationType = CacheConstants.operationType_query,moduleName = "rntSysVersion")
    public List<RntSysVersion> findSysVersionBySysnameAndVersionnum(String sysName,String versionNum) {
        try {
            if (sysName!=null && versionNum!=null){
                RntSysVersionExample rntSysVersionExample = new RntSysVersionExample();
                RntSysVersionExample.Criteria criteria = rntSysVersionExample.createCriteria();
                criteria.andSysNameEqualTo(sysName);
                criteria.andVersionNumEqualTo(versionNum);
                List<RntSysVersion> rntSysVersions = rntSysVersionMapper.selectByExample(rntSysVersionExample);
                if (rntSysVersions!=null){
                    return rntSysVersions;
                }
                return new ArrayList<>();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取当前最大（最新）版本号：Num
     * @param rntSysVersion
     * @return
     */
    public Integer getMaxNum(RntSysVersion rntSysVersion){
        if (rntSysVersion!=null && rntSysVersion.getSysName()!=null){
            RntSysVersionExample rntSysVersionExample = new RntSysVersionExample();
            RntSysVersionExample.Criteria criteria = rntSysVersionExample.createCriteria();
            criteria.andSysNameEqualTo(rntSysVersion.getSysName());
            List<RntSysVersion> rntSysVersions = rntSysVersionMapper.selectByExample(rntSysVersionExample);
            Integer maxNum = 0;
            if (rntSysVersions!=null && rntSysVersions.size()!=0){
                for (RntSysVersion sysVersion : rntSysVersions) {
                    if (sysVersion.getNum() > maxNum){
                        maxNum = sysVersion.getNum();
                    }
                }
            }
            return maxNum+1;
        }
        return null;
    }

    /**
     * 获取当前最大（最新）sysCode
     * @return
     */
    public String getSysCode(){
        String sysCode = "1";
        RntSysVersionExample rntSysVersionExample = new RntSysVersionExample();
        List<RntSysVersion> rntSysVersions = rntSysVersionMapper.selectByExample(rntSysVersionExample);
        if (rntSysVersions!=null && rntSysVersions.size()!=0){
            Integer integer = 0;
            for (RntSysVersion sysVersion : rntSysVersions) {
                if (sysVersion!=null && sysVersion.getSysCode()!=null){
                    if (Integer.valueOf(sysVersion.getSysCode())>integer){
                        integer = Integer.valueOf(sysVersion.getSysCode());
                    }
                }
            }
            integer += 1;
            sysCode = integer.toString();
        }
        return sysCode;
    }
}
