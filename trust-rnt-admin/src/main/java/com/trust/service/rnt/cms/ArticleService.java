package com.trust.service.rnt.cms;

import com.github.pagehelper.PageInfo;
import com.trust.entity.rnt.CmsArticleInfo;
import com.trust.service.rnt.cms.impl.ArticleServiceImpl;
import com.trust.utils.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;
/**
*@Author Yangcb
*@Descrintion CMS内容服务调用
*@Date create 2018/3/21 17:08
*@Version 1.0
*/
@FeignClient(name="trust-cms-service",fallback = ArticleServiceImpl.class)
public interface ArticleService {
    /**
     * 文章详情查询
     * @param articleId
     * @return
     */
    @RequestMapping(value="/cms/article/details",method = RequestMethod.POST)
    CmsArticleInfo getArticleById(@RequestParam("articleId") Long articleId);

    /**
     * 文章分页查询服务调用
     * @param cmsArticleInfo
     * @param pageNum
     * @param pageSize
     * @param startTime
     * @param endTime
     * @return
     */
    @RequestMapping(value="/cms/article/page", method = RequestMethod.POST)
    PageInfo getArticleByPage(@RequestBody(required = true) CmsArticleInfo cmsArticleInfo, @RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, @RequestParam(value = "startTime") Date startTime,
                              @RequestParam(value = "endTime") Date endTime);

    /**
     * 新增保存文章
     * @param cmsArticleInfo
     * @param userId
     * @param userName
     * @return
     */
    @RequestMapping(value="/cms/article/save", method = RequestMethod.POST)
    Result saveArticle(@RequestBody(required = true) CmsArticleInfo cmsArticleInfo, @RequestParam("userId") Long userId, @RequestParam("userName") String userName);

    /**
     * 根据文章ID删除文章
     * @param articleId
     * @return
     */
    @RequestMapping(value="/cms/article/delete", method = RequestMethod.POST)
    Result deleteArticle(@RequestParam(value = "articleId", required = true) Long articleId);
    /**
     * 批量修改文章状态、发布、下架
     * @param list
     * @param categoryCode
     * @param status
     * @param userId
     * @param userName
     * @return
     */
    @RequestMapping(value="/cms/article/batch/release", method = RequestMethod.POST)
    Result batchRelease(@RequestParam(value = "listPoliciesRegulations", required = true) List<Long> list, @RequestParam(value = "categoryCode", required = true) String categoryCode,
                        @RequestParam(value = "status", required = true) int status, @RequestParam("userId") Long userId, @RequestParam("userName") String userName);

    /**
     * 批量删除文章
     * @param list
     * @param categoryCode
     * @return
     */
    @RequestMapping(value="/cms/article/batch/delete", method = RequestMethod.POST)
    Result batchDelete(@RequestParam(value = "listPoliciesRegulations", required = true) List<Long> list, @RequestParam(value = "categoryCode", required = true) String categoryCode);

    /**
     * 爬虫库新增统计
     * @return
     */
    @RequestMapping(value = "/cms/article/statistics",method = RequestMethod.POST)
    Result spiderNewAddStatistics();
}
