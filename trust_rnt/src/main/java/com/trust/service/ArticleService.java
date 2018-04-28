package com.trust.service;

import com.github.pagehelper.PageInfo;
import com.trust.entity.CmsArticleInfo;
import com.trust.service.impl.ArticleServiceImpl;
import com.trust.utils.Result;
import com.trust.utils.ResultData;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

/**
 * Article客户端
 * 方法的参数默认是使用@RequestBody进行交换的，
 * 所以如果我们希望使用普通的参数传参，
 * 还需要打上SpringMVC的@RequestParam annotation
 */

@FeignClient(name="trust-cms-service",fallback = ArticleServiceImpl.class)
public interface ArticleService {

    @RequestMapping(value="/cms/api/article/page", method = RequestMethod.GET)
    Result getArticleApiByPage(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, @RequestParam("categoryCode") String categoryCode);

    @RequestMapping(value="/cms/api/article/search/page", method = RequestMethod.POST)
    Result getArticleApiByTitlePage(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, @RequestParam("categoryCode") String categoryCode,@RequestParam("title")String title);

    @RequestMapping(value="/cms/api/article/details", method = RequestMethod.POST)
    Result findArticleDetailById(@RequestParam("id") Long id, @RequestParam("sourceType") String sourceType);

}
