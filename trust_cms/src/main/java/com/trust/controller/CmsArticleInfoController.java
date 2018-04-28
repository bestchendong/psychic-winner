package com.trust.controller;


import com.github.pagehelper.PageInfo;
import com.trust.entity.cms.CmsArticleInfo;
import com.trust.service.CmsArticleContentService;
import com.trust.service.CmsArticleInfoService;
import com.trust.utils.Result;
import com.trust.utils.ResultData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @Author Yangcb
 * @Descrintion内容管理
 * @Date create 2017-11-23 15:23
 * @Version 1.0
 */
@Api(value = "/article",description = "文章相关接口")
@RequestMapping("/cms")
@RestController
public class CmsArticleInfoController {
    @Autowired
    private CmsArticleContentService cmsArticleContentService;
    @Autowired
    private CmsArticleInfoService cmsArticleInfoService;

    /**
     * 查看文章详情
     * @param articleId
     * @return
     */
    @RequestMapping(value = "/article/details",produces = { "application/json" },method = RequestMethod.POST)
    public CmsArticleInfo getCmaArticleInfo(@RequestParam(value = "articleId",required = true) Long articleId){
        if(articleId!=null){
           CmsArticleInfo cmsArticleInfo = cmsArticleInfoService.findCmsArticleInfoById(articleId);
           return cmsArticleInfo;
        }
        return null;
    }


    @ApiOperation(value = "添加文章信息", notes = "添加文章信息",produces = "application/json")
    /**
     * 添加保存文章信息
     * @param cmsArticleInfo
     * @return
     */
    @RequestMapping(value = "/article/save",produces = { "application/json" },method = RequestMethod.POST)
    public Result insertCmaArticleInfo(@RequestBody CmsArticleInfo cmsArticleInfo){
           if(cmsArticleInfo!=null) {
            int result1 = cmsArticleInfoService.save(cmsArticleInfo);
            if (result1 == 1) {
                return Result.success();
            }
            return Result.error();
        }else{
            return Result.error(401,"paramerror");
        }
    }

    @RequestMapping(value = "/article/delete",produces = { "application/json" },method = RequestMethod.POST)
    public Result deleteCmaArticleInfo(@RequestParam(value = "articleId",required = true) Long articleId){
        if(articleId!=null&&articleId>0) {
            cmsArticleInfoService.delete(articleId);
            return Result.success();
        }
        return Result.success("400"," 参数错误");
    }

   @ApiOperation(value = "分页查询文章信息", notes = "根据参数查询分页信息",produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页数", required = false,  paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "size", value = "条数", required = false, paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "startTime", value = "开始时间", required = false, paramType = "query",dataType = "string"),
            @ApiImplicitParam(name = "endTime", value = "结束时间", required = false, paramType = "query",dataType = "string"),

    })
     @RequestMapping(value = "/article/page",produces = { "application/json" },method = RequestMethod.POST)
    public PageInfo findCmsArticleInfoPageBy(@RequestBody CmsArticleInfo cmsArticleInfo,
                                               @RequestParam(value = "pageNum",required =  false,defaultValue = "1")Integer pageNum,
                                               @RequestParam(value = "pageSize",required =  false,defaultValue = "10")Integer pageSize,
                                               @RequestParam(value = "startTime",required =  false)Date startTime,
                                               @RequestParam(value = "endTime",required = false) Date endTime){
        if(pageSize==null){
            pageSize=10;
        }
        if(pageNum==null){
            pageNum=1;
        }
        if(!"".equals(cmsArticleInfo.getcArticleCategoryCode())&&cmsArticleInfo.getcArticleCategoryCode()!=null) {
            PageInfo pageInfo = cmsArticleInfoService.findByPageAndParams(cmsArticleInfo, pageNum, pageSize, startTime, endTime);
          return pageInfo;
        }
        return null;
    }

    /**
     * 批量修改状态
     * @param list
     * @return
     */
    @RequestMapping(value = "/article/batch/release",produces = { "application/json" },method = RequestMethod.POST)
    public ResultData batchUpdatePoliciesRegulationsStatus (@RequestParam(value = "listPoliciesRegulations",required = true)List<Long>  list,@RequestParam(value = "categoryCode",required = true)String categoryCode,
                                                             @RequestParam(value = "status",required = true) int status){
        if(list!=null&&list.size()>0&&!"".equals(categoryCode)){
            cmsArticleInfoService.batchUpdateArticleStatus(list,categoryCode,status);
            return new ResultData("200","发布成功");
        }
        return new  ResultData("401","paramerror");
    }

    /**
     * 批量删除政策法规
     * @param list
     * @return
     */
    @RequestMapping(value = "/article/batch/delete",produces = { "application/json" },method = RequestMethod.POST)
    public ResultData batchDeletePoliciesRegulations (@RequestParam(value = "listPoliciesRegulations",required = true)List<Long>  list,@RequestParam(value = "categoryCode",required = true)String categoryCode){
        if(list!=null&&list.size()>0&&!"".equals(categoryCode)){
            cmsArticleInfoService.batchDeleteArticleStatus(list,categoryCode);
            return new ResultData("200","删除成功");
        }
        return new  ResultData("401","paramerror");
    }
}
