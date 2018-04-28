package com.trust.controller.rnt.spider;

import com.github.pagehelper.PageInfo;
import com.trust.controller.rnt.system.BaseController;
import com.trust.entity.rnt.CmsArticleInfo;
import com.trust.service.rnt.cms.ArticleService;
import com.trust.utils.DateUtil;
import com.trust.utils.Result;
import com.trust.utils.ResultData;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @Author Yangcb
 * @Descrintion 爬虫库-公告通知管理
 * @Date create 2018-01-05 14:34
 * @Version 1.0
 */
@Controller
@RequestMapping("/rntadmin/spider/notice")
public class SpiderNoticeController extends BaseController {


    @Autowired
    private ArticleService articleService;

    /**
     * 分页查询内容列表信息
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequiresPermissions("rntadmin:spider:notice:page")
    @RequestMapping(value = "/page",method = RequestMethod.GET)
    public String getArticleByPage(Model model, CmsArticleInfo cmsArticleInfo , @RequestParam(value = "pageNum", required = false,defaultValue = "1") Integer pageNum,
                                   @RequestParam(value = "pageSize", required = false,defaultValue = "5") Integer pageSize,
                                   @RequestParam(value = "releaseDate",required = false) String releaseDate) {
        Date startDate = null;
        Date endDate = null;
        if(!"".equals(releaseDate)&&releaseDate!=null&&releaseDate.length()==23){
            String[] date = releaseDate.split(" - ");
            if(date.length==2){
                startDate = DateUtil.parseDate(date[0]);
                endDate = DateUtil.parseDate(date[1]);
            }
        }
        cmsArticleInfo.setcArticleStatus(0);
        cmsArticleInfo.setcArticleCategoryCode("trust_notice");
        cmsArticleInfo.setcArticleType(2);
        PageInfo pageInfo = articleService.getArticleByPage(cmsArticleInfo ,pageNum,pageSize,startDate,endDate);
        if(pageInfo!=null&&pageInfo.getList()!=null&&pageInfo.getList().size()>0){
            List<CmsArticleInfo> list = pageInfo.getList();
            pageInfo.setList(list);
        }
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("pageSize",pageSize);
        model.addAttribute("pageNum",pageNum);
        model.addAttribute("cmsArticleInfo",cmsArticleInfo);
        model.addAttribute("releaseDate",releaseDate);
        return "/rnt/spider/notice/notices";
    }
    @RequiresPermissions("rntadmin:spider:notice:detail")
    @RequestMapping(value = "/detail",method = RequestMethod.GET)
    public String getArticleDetail(Model model,@RequestParam("articleId")Long articleId){
        if(articleId!=null){
            CmsArticleInfo cmsArticleInfo = articleService.getArticleById(articleId);
            model.addAttribute("notices",cmsArticleInfo);
        }
        return "/rnt/spider/notice/detail";
    }

    @RequiresPermissions("rntadmin:spider:notice:delete")
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseBody
    public Result deleteContent(@RequestParam(value = "articleId",required =  true)Long articleId){
        try {
            return articleService.deleteArticle(articleId);
        } catch (Exception e) {
            e.printStackTrace();
            return  new ResultData("500","error");
        }
    }

    /**
     * 批量删除
     * @param
     * @return
     */
    @RequiresPermissions("rntadmin:spider:notice:batch:delete")
    @RequestMapping(value = "/batch/delete",method = RequestMethod.POST)
    @ResponseBody
    public Result batchDeteleArticle(@RequestParam(value = "articleIds[]",required = true)List<Long> list, @RequestParam(value = "categoryCode",required = true) String categoryCode){
        if(list!=null&&list.size()>0){
            return articleService.batchDelete(list,categoryCode);
        }
        return new ResultData("500","删除内容不能为空");
    }


    /**
     *
     * @param
     * @return
     */
    @RequiresPermissions("rntadmin:spider:notice:batch:release")
    @RequestMapping(value = "/batch/release",method = RequestMethod.POST)
    @ResponseBody
    public Result batchReleaseArticle(@RequestParam(value = "articleIds[]",required = true)List<Long> list, @RequestParam(value = "categoryCode",required = true) String categoryCode){
        if(list!=null&&list.size()>0){
            return articleService.batchRelease(list,categoryCode,1,Long.valueOf(this.getUserId()),this.getUsername());
        }
        return new ResultData("500","发布内容不能为空");
    }
}
