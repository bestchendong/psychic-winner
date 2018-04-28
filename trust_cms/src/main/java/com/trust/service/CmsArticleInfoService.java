package com.trust.service;

import com.github.pagehelper.PageInfo;
import com.trust.entity.api.ArticleDetail;
import com.trust.entity.cms.CmsArticleInfo;

import java.util.Date;
import java.util.List;

/**
 * 文章类接口
 */
public interface CmsArticleInfoService {

     CmsArticleInfo findCmsArticleInfoById(long id);

     ArticleDetail findArticleDetailById(long id,String sourceType);

     int save(CmsArticleInfo cmsArticleInfo);

     int edit(CmsArticleInfo cmsArticleInfo);

     int delete(long id);

     PageInfo findByPageAndParams(CmsArticleInfo cmsArticleInfo, int page, int size, Date startTime, Date endTime);

     PageInfo getArticleByPage(Integer pageNum, Integer pageSize, String categoryCode);

     List<CmsArticleInfo> selectArticleByCategoryId(Long categoryId);

    int batchUpdateArticleStatus(List<Long> list,String categoryCode,int status);

    int batchDeleteArticleStatus(List<Long> list, String categoryCode);
}
