package com.trust.service.impl;

import com.trust.dao.CmsArticleContentMapper;
import com.trust.entity.cms.CmsArticleContent;
import com.trust.service.CmsArticleContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Yangcb
 * @Descrintion 文章内容Service
 * @Date create 2017-11-23 13:36
 * @Version 1.0
 */
@Service("cmsArticleContentService")
public class CmsArticleContentServiceImpl implements CmsArticleContentService {
    @Resource
    private CmsArticleContentMapper cmsArticleContentMapper;
    @Override
    public CmsArticleContent findCmsArticleContentById(long id)
    {
        return cmsArticleContentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(CmsArticleContent cmsArticleContent) {
        try {
            cmsArticleContentMapper.insertSelective(cmsArticleContent);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    @Override
    public int edit(CmsArticleContent cmsArticleContent) {
        try {
            cmsArticleContentMapper.updateByPrimaryKeySelective(cmsArticleContent);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    @Override
    public int delete(long id) {
        try {
            cmsArticleContentMapper.deleteByPrimaryKey(id);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    /**
     * 根据文章ID获取排序文章List
     * @param articleId
     * @return
     */
    @Override
    public List<CmsArticleContent> findCmsArticleContentByArticleId(long articleId) {
        return cmsArticleContentMapper.selectArticleContentsByArticleId(articleId);
    }

    @Override
    public CmsArticleContent findCmsArticleContentByType(long articleId, int type) {
        return cmsArticleContentMapper.findCmsArticleContentByType(articleId,type);
    }
}
