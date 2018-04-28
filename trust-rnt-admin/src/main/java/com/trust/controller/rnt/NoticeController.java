package com.trust.controller.rnt;

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
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @Author Yangcb
 * @Descrintion 公告通知管理
 * @Date create 2018-01-05 14:34
 * @Version 1.0
 */
@Controller
@RequestMapping("/rntadmin/notice")
public class NoticeController extends BaseController {



    @Autowired
    private ArticleService articleService;

    /**
     * 分页查询内容列表信息
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequiresPermissions("rntadmin:notice:page")
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
        cmsArticleInfo.setcArticleCategoryCode("trust_notice");
        cmsArticleInfo.setcArticleType(1);
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
        return "/rnt/notice/notices";
    }
    @RequiresPermissions("rntadmin:notice:detail")
    @RequestMapping(value = "/detail",method = RequestMethod.GET)
    public String getArticleDetail(Model model,@RequestParam("articleId")Long articleId){
        if(articleId!=null){
            CmsArticleInfo cmsArticleInfo = articleService.getArticleById(articleId);
            model.addAttribute("notice",cmsArticleInfo);
        }
        return "/rnt/notice/detail";
    }


    /**
     *跳转添加页面
     * @return
     */
    @RequiresPermissions("rntadmin:notice:add")
    @RequestMapping(value = "/toadd",method = RequestMethod.GET)
    public  String  toAdd(){
        return "/rnt/notice/add";
    }

    /**
     * 新增内容信息
     * @param model
     * @param
     * @return
     */
    @RequiresPermissions("rntadmin:notice:add")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)// @ModelAttribute
    public  String  insertArticle(Model model, @ModelAttribute CmsArticleInfo cmsArticleInfo, HttpServletRequest request){
        if(cmsArticleInfo!=null) {
            cmsArticleInfo.setcArticleCategoryCode("trust_notice");
            articleService.saveArticle(cmsArticleInfo,Long.valueOf(this.getUserId()),this.getUsername());
        }
        return "redirect:/rntadmin/notice/page";
    }
    /**
     *跳转添加页面
     * @return
     */
    @RequiresPermissions("rntadmin:notice:edit")
    @RequestMapping(value = "/edit",method = RequestMethod.GET)
    public  String  toEdit(Model model,@RequestParam("articleId")Long articleId){
        if(articleId!=null){
            CmsArticleInfo cmsArticleInfo = articleService.getArticleById(articleId);
            model.addAttribute("notice",cmsArticleInfo);
        }
        return "/rnt/notice/edit";
    }

    /**
     * 新增内容信息
     * @param model
     * @param cmsArticleInfo
     * @return
     */
    @RequiresPermissions("rntadmin:notice:edit")
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public  String  saveArticle(Model model,CmsArticleInfo cmsArticleInfo){
        if(cmsArticleInfo!=null) {
            articleService.saveArticle(cmsArticleInfo,Long.valueOf(this.getUserId()),this.getUsername());
        }
        return "redirect:/rntadmin/notice/page";
    }
    @RequiresPermissions("rntadmin:notice:delete")
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseBody
    public Result deleteContent(@RequestParam(value = "articleId",required =  true)Long articleId){
        try {
            return  articleService.deleteArticle(articleId);
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
    @RequiresPermissions("rntadmin:notice:batch:delete")
    @RequestMapping(value = "/batch/delete",method = RequestMethod.POST)
    @ResponseBody
    public Result batchDeteleArticle(@RequestParam(value = "articleIds[]",required = true)List<Long> list, @RequestParam(value = "categoryCode",required = true) String categoryCode){
        if(list!=null&&list.size()>0){
           return  articleService.batchDelete(list,categoryCode);
        }
        return new ResultData("500","删除内容不能为空");
    }


    /**
     *
     * @param
     * @return
     */
    @RequiresPermissions("rntadmin:notice:batch:release")
    @RequestMapping(value = "/batch/release",method = RequestMethod.POST)
    @ResponseBody
    public Result batchReleaseArticle(@RequestParam(value = "articleIds[]",required = true)List<Long> list, @RequestParam(value = "categoryCode",required = true) String categoryCode){
        if(list!=null&&list.size()>0){
           return articleService.batchRelease(list,categoryCode,2,Long.valueOf(this.getUserId()),this.getUsername());
        }
        return new ResultData("500","发布内容不能为空");
    }

    /**
     *
     * @param
     * @return
     */
    @RequiresPermissions("rntadmin:notice:batch:undercarriage")
    @RequestMapping(value = "/batch/undercarriage",method = RequestMethod.POST)
    @ResponseBody
    public Result undercarriageArticle(@RequestParam(value = "articleIds[]",required = true)List<Long> list, @RequestParam(value = "categoryCode",required = true) String categoryCode){
        if(list!=null&&list.size()>0){
            return articleService.batchRelease(list,categoryCode,3,Long.valueOf(this.getUserId()),this.getUsername());
        }
        return new ResultData("500","内容不能为空");
    }
}