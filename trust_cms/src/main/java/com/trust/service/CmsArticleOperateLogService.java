package com.trust.service;

import com.github.pagehelper.PageInfo;
import com.trust.entity.cms.CmsArticleOperateLog;

import java.util.Date;
import java.util.List;

/**
 * 文章操作日志接口
 */
public interface CmsArticleOperateLogService {

     PageInfo<CmsArticleOperateLog> getCmsArticleOperateLogListByPage(Long articleId,int pageNumber, int pageSize, Date startDate, Date endDate);

     List<CmsArticleOperateLog> getCmsCmsArticleOperateLogListArticelId(Long articleId);

     CmsArticleOperateLog findCmsArticleOperateLogById(long id);

     int save(CmsArticleOperateLog cmsArticleOperateLog);

     int delete(long id);
}
