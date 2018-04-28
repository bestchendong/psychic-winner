package com.trust.controller;

import com.trust.controller.api.ArticleApi;
import com.trust.service.ArticleService;
import com.trust.utils.Result;
import com.trust.utils.ResultData;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-15T03:06:26.991Z")

/**
 * 文章内容
 */
@RestController
public class ArticleApiController implements ArticleApi {

   @Autowired
   private ArticleService cmsArticleInfoService;

    /**
     * 分页查询内容列表信息
     * @param pageNum
     * @param pageSize
     * @param categoryCode
     * @return
     */
    public Result getArticleByPage(@NotNull@ApiParam(value = "页码", required = true) @RequestParam(value = "pageNum", required = true) Integer pageNum,
                                                        @NotNull@ApiParam(value = "每页显示条数", required = true) @RequestParam(value = "pageSize", required = true) Integer pageSize,
                                                        @NotNull@ApiParam(value = "分类编码 通知公告：trust_notice  政策法规：trust_policie_regulations 农业要闻：agricultural_news 病虫害集根据病虫害子类编码获取", required = true) @RequestParam(value = "categoryCode", required = true) String categoryCode) {
        Result resultData = cmsArticleInfoService.getArticleApiByPage(pageNum,pageSize,categoryCode);
       if(resultData!=null){
            if(resultData.get("code").equals("200")){
                return  resultData;
            }
        }
        return  new ResultData("200","success",null);
    }

    /**
     * 分页查询内容列表信息
     * @param pageNum
     * @param pageSize
     * @param categoryCode
     * @return
     */
    public Result getArticleByTitlePage(@NotNull@ApiParam(value = "页码", required = true) @RequestParam(value = "pageNum", required = true) Integer pageNum,
                                        @NotNull@ApiParam(value = "每页显示条数", required = true) @RequestParam(value = "pageSize", required = true) Integer pageSize,
                                        @NotNull@ApiParam(value = "分类编码 通知公告：trust_notice  政策法规：trust_policie_regulations 农业要闻：agricultural_news 病虫害集根据病虫害子类编码获取", required = true) @RequestParam(value = "categoryCode", required = true) String categoryCode,
                                        @NotNull@ApiParam(value = "页码", required = true) @RequestParam(value = "title", required = true) String title) {
        Result resultData = cmsArticleInfoService.getArticleApiByTitlePage(pageNum,pageSize,categoryCode,title);
        if(resultData!=null){
            if(resultData.get("code").equals("200")){
                return  resultData;
            }
        }
        return  new ResultData("200","success",null);
    }

    /**
     * 根据内容ID获取内容详信息
     * @param id
     * @param sourceType
     * @return
     */
    public Result getArticleInfoById(@NotNull@ApiParam(value = "文章id", required = true) @RequestParam(value = "id", required = true) Long id,
                                     @NotNull@ApiParam(value = "访问端类型: 电脑端:PC/移动APP端：Mobile/移动大屏端：Bigscreen", required = true) @RequestParam(value = "sourceType", required = true) String sourceType, Model model) {
        Result articleDetail = cmsArticleInfoService.findArticleDetailById(id,sourceType);
        if(articleDetail!=null){
            if(articleDetail.get("code").equals("200")){
                return  articleDetail;
            }
        }
        return  new ResultData("200","success",null);
    }

}
