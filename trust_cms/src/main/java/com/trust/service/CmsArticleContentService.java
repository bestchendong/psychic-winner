package com.trust.service;

import com.trust.entity.cms.CmsArticleContent;

import java.util.List;

/**
 * 文章正文内容接口
 */
public interface CmsArticleContentService {

     CmsArticleContent findCmsArticleContentById(long id);

     int save(CmsArticleContent cmsArticleContent);

     int edit(CmsArticleContent cmsArticleContent);

     int delete(long id);

     List<CmsArticleContent> findCmsArticleContentByArticleId(long articleId);

     CmsArticleContent findCmsArticleContentByType(long articleId,int type);
}
