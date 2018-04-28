package com.trust.controller.api;

import com.github.pagehelper.PageInfo;
import com.trust.entity.api.ArticleDetail;
import com.trust.service.CmsArticleInfoService;
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
   private CmsArticleInfoService cmsArticleInfoService;

    /**
     * 分页查询内容列表信息
     * @param pageNum
     * @param pageSize
     * @param categoryCode
     * @return
     */
    public ResultData getArticleByPage(@NotNull@ApiParam(value = "页码", required = true) @RequestParam(value = "pageNum", required = true) Integer pageNum,
                                       @NotNull@ApiParam(value = "每页显示条数", required = true) @RequestParam(value = "pageSize", required = true) Integer pageSize,
                                       @NotNull@ApiParam(value = "分类编码 通知公告：trust_notice  政策法规：trust_policie_regulations 农业要闻：agricultural_news 病虫害集根据病虫害子类编码获取", required = true) @RequestParam(value = "categoryCode", required = true) String categoryCode) {
        PageInfo pageInfo = cmsArticleInfoService.getArticleByPage(pageNum,pageSize,categoryCode);
        return  new  ResultData("200","success",pageInfo);
    }

    /**
     * 根据内容ID获取内容详信息
     * @param id
     * @param sourceType
     * @return
     */
    public ResultData getArticleInfoById(@NotNull@ApiParam(value = "文章id", required = true) @RequestParam(value = "id", required = true) Long id,
                                     @NotNull@ApiParam(value = "访问端类型: 电脑端:PC/移动APP端：Mobile/移动大屏端：Bigscreen", required = true) @RequestParam(value = "sourceType", required = true) String sourceType, Model model) {
        ArticleDetail articleDetail = cmsArticleInfoService.findArticleDetailById(id, sourceType);
        if (articleDetail != null && articleDetail.getctemplatePath() != null) {
            return new ResultData("200", "",articleDetail);
        } else {
            return new ResultData("200", "");
        }
    }

}
