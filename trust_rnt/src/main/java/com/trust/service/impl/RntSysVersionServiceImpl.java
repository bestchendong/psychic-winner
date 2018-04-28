package com.trust.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trust.dao.RntSysVersionMapper;
import com.trust.entity.RntVersion;
import com.trust.entity.RntSysVersion;
import com.trust.entity.RntSysVersionExample;
import com.trust.service.RntSysVersionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Yangcb
 * @Descrintion
 * @Date create 2017-12-20 13:42
 * @Version 1.0
 */
@Service("rntSysVersionService")
public class RntSysVersionServiceImpl implements RntSysVersionService {

    @Resource
    private RntSysVersionMapper rntSysVersionMapper;

    /**
     * 根据ID查找版本信息
     * @param id
     * @return
     */
    @Override
    public RntSysVersion findPriceQuotesById(long id) {
        try {
           return  rntSysVersionMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *新增版本信息
     * @param rntSysVersion
     */
    @Override
    public void save(RntSysVersion rntSysVersion) {
        int saveResult = rntSysVersionMapper.insertSelective(rntSysVersion);
    }

    /**
     *修改版本信息
     * @param rntSysVersion
     */
    @Override
    public void edit(RntSysVersion rntSysVersion) {
         rntSysVersionMapper.updateByPrimaryKeySelective(rntSysVersion);
    }

    /**
     * 根据ID删除版本信息
     * @param id
     */
    @Override
    public void delete(long id) {
        rntSysVersionMapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据名称查找版本信息
     * @param sysCode
     * @param sysName
     * @return
     */
    @Override
    public RntVersion findVersionBySysName(String sysCode, String sysName) {
       return  rntSysVersionMapper.findVersionBySysName(sysName);
    }

    /**
     * @Descrintion: 查询所有版本信息
     * @param:
     * @return:
     */
    @Override
    public List<RntSysVersion> findVersionAll() {
        return rntSysVersionMapper.selectByExample(null);
    }

    /**
     * @Descrintion: 分页查询版本信息
     * @param:
     * @return:
     */
    @Override
    public PageInfo<RntSysVersion> findVersionByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        RntSysVersionExample rntSysVersionExample = new RntSysVersionExample();
        rntSysVersionExample.setOrderByClause("version_id desc");
        List<RntSysVersion> list= rntSysVersionMapper.selectByExample(rntSysVersionExample);
        PageInfo<RntSysVersion> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
