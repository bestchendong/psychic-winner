package com.trust.service.impl;

import com.github.pagehelper.PageInfo;
import com.trust.entity.CmsArticleInfo;
import com.trust.service.ArticleService;
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
    public ResultData getArticleApiByPage(Integer pageNum, Integer pageSize, String categoryCode)
    {
        System.out.printf("调用服务失败");
        return null;
    }

    @Override
    public Result getArticleApiByTitlePage(Integer pageNum, Integer pageSize, String categoryCode, String title) {
        System.out.printf("调用服务失败");
        return null;
    }

    @Override
    public ResultData findArticleDetailById(Long id, String sourceType) {
        System.out.printf("调用服务失败");
        return null;
    }



}
