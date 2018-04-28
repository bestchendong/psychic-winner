package com.trust.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trust.dao.CmsArticleOperateLogMapper;
import com.trust.entity.cms.CmsArticleOperateLog;
import com.trust.entity.cms.CmsArticleOperateLogExample;
import com.trust.service.CmsArticleOperateLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author Yangcb
 * @Descrintion  文章操作日志
 * @Date create 2017-11-23 11:38
 * @Version 1.0
 */
@Service("cmsArticleOperateLogServiceImpl")
public class CmsArticleOperateLogServiceImpl implements CmsArticleOperateLogService {
    @Resource
    private CmsArticleOperateLogMapper cmsArticleOperateLogMapper;

    /**
     * 根据时间范围分页查询操作日志信息
     * @param pageNumber
     * @param pageSize
     * @param startTime
     * @param endTime
     * @return
     */
    @Override
    public PageInfo<CmsArticleOperateLog> getCmsArticleOperateLogListByPage(Long articleId,int pageNumber, int pageSize, Date startTime, Date endTime) {
        try {
            PageHelper.startPage(pageNumber, pageSize);
            List<CmsArticleOperateLog> list= cmsArticleOperateLogMapper.selectByExample(null);
            PageInfo<CmsArticleOperateLog> pageInfo = new PageInfo<>(list);
            return pageInfo;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 根据文章内容ID查询所有操作日志
     * @param articleId
     * @return
     */
    @Override
    public List<CmsArticleOperateLog> getCmsCmsArticleOperateLogListArticelId(Long articleId) {
        CmsArticleOperateLogExample cmsArticleOperateLogExample = new CmsArticleOperateLogExample();
        CmsArticleOperateLogExample.Criteria criteria = cmsArticleOperateLogExample.createCriteria();
        criteria.andCmsArticleIdEqualTo(articleId);
        return   cmsArticleOperateLogMapper.selectByExample(cmsArticleOperateLogExample);
    }

    /**
     * 根据ID查询操作日志详情
     * @param id
     * @return
     */
    @Override
    public CmsArticleOperateLog findCmsArticleOperateLogById(long id) {
        try {
            if(id>0){
                return cmsArticleOperateLogMapper.selectByPrimaryKey(id);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 添加操作日志
     * @param cmsArticleOperateLog
     * @return
     */
    @Override
    public int save(CmsArticleOperateLog cmsArticleOperateLog) {
        try {
            if(cmsArticleOperateLog!=null){
                cmsArticleOperateLogMapper.insertSelective(cmsArticleOperateLog);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 根据ID删除日志信息
     * @param id
     * @return
     */
    @Override
    public int delete(long id) {
        try {
            if(id>0){
                cmsArticleOperateLogMapper.deleteByPrimaryKey(id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
