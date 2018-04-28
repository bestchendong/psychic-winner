package com.trust.service.rnt.cms.impl;

import com.github.pagehelper.PageInfo;
import com.trust.entity.rnt.CmsArticleInfo;
import com.trust.service.rnt.cms.ArticleService;
import com.trust.utils.Result;
import com.trust.utils.ResultData;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

/**
 * @Author Yangcb
 * @Descrintion
 * @Date create 2018-01-17 8:50
 * @Version 1.0
 */
@Component
public class ArticleServiceImpl implements ArticleService {

    @Override
    public CmsArticleInfo getArticleById(Long articleId) {
        System.out.printf("调用服务失败");
        return null;
    }

    @Override
    public PageInfo getArticleByPage(CmsArticleInfo cmsArticleInfo, Integer pageNum, Integer pageSize, Date startTime, Date endTime) {
        System.out.printf("调用服务失败");
        return new PageInfo();
    }

    @Override
    public ResultData saveArticle(CmsArticleInfo cmsArticleInfo, @RequestParam("userId")Long userId, @RequestParam("userName")String username) {
        System.out.printf("调用服务失败");
        return null;
    }

    @Override
    public ResultData deleteArticle(Long articleId) {
        System.out.printf("调用服务失败");
        return null;
    }

    @Override
    public ResultData batchRelease(List<Long> list, String categoryCode, int status, @RequestParam("userId")Long userId, @RequestParam("userName")String username) {
        System.out.printf("调用服务失败");
        return null;
    }

    @Override
    public ResultData batchDelete(List<Long> list, String categoryCode) {
        System.out.printf("调用服务失败");
        return null;
    }

    @Override
    public Result spiderNewAddStatistics() {
        System.out.printf("调用失败");
        return null;
    }
}
