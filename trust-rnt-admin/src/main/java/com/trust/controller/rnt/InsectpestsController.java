package com.trust.controller.rnt;

import com.github.pagehelper.PageInfo;
import com.trust.controller.rnt.system.BaseController;
import com.trust.entity.rnt.Category;
import com.trust.entity.rnt.CmsArticleInfo;
import com.trust.service.rnt.cms.ArticleService;
import com.trust.service.rnt.cms.CategoryService;
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
 * @Descrintion 病虫害管理
 * @Date create 2018-01-05 14:34
 * @Version 1.0
 */
@Controller
@RequestMapping("/rntadmin/insectpests")
public class InsectpestsController extends BaseController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private CategoryService categoryService;

    /**
     * 分页查询内容列表信息
     * @param pageNum
     * @param pageSize
     * @param categoryCode
     * @return
     */
    @RequestMapping(value = "/page",method = RequestMethod.GET)
    @RequiresPermissions("rntadmin:insectpests:page")
    public String getArticleByPage(Model model, CmsArticleInfo cmsArticleInfo , @RequestParam(value = "pageNum", required = false,defaultValue = "1") Integer pageNum,
                                   @RequestParam(value = "pageSize", required = false,defaultValue = "5") Integer pageSize,
                                   @RequestParam(value = "categoryCode", required = false) String categoryCode, @RequestParam(value = "releaseDate",required = false) String releaseDate) {
        Date startDate = null;
        Date endDate = null;
        if(releaseDate!=null&&!"".equals(releaseDate)&&releaseDate.length()==23){
            String[] date = releaseDate.split(" - ");
            if(date.length==2){
                startDate = DateUtil.parseDate(date[0]);
                endDate = DateUtil.parseDate(date[1]);
            }
        }
        cmsArticleInfo.setcArticleCategoryCode("trust_insect_pests");
        cmsArticleInfo.setcArticleType(1);
        System.out.printf("pagenum===="+pageNum+"==pizgesize===="+pageSize);
        PageInfo pageInfo = articleService.getArticleByPage(cmsArticleInfo ,pageNum,pageSize,startDate,endDate);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("pageSize",pageSize);
        model.addAttribute("pageNum",pageNum);
        model.addAttribute("cmsArticleInfo",cmsArticleInfo);
        model.addAttribute("releaseDate",releaseDate);
        return "/rnt/insectpests/insectpests";
    }

    @RequiresPermissions("rntadmin:insectpests:detail")
    @RequestMapping(value = "/detail",method = RequestMethod.GET)
    public String getArticleDetail(Model model,@RequestParam("articleId")Long articleId){
        if(articleId!=null){
            CmsArticleInfo cmsArticleInfo = articleService.getArticleById(articleId);
            model.addAttribute("insectpests",cmsArticleInfo);
        }
        return "/rnt/insectpests/detail";
    }


    /**
     *跳转添加页面
     * @return
     */
    @RequiresPermissions("rntadmin:insectpests:add")
    @RequestMapping(value = "/toadd",method = RequestMethod.GET)
    public  String  toAdd(Model model){
        List<Category> categorylist = categoryService.getChildrenApiCategoryListByCode("trust_insect_pests");
        model.addAttribute("categoryList",categorylist);
        return "/rnt/insectpests/add";
    }

    /**
     * 新增内容信息
     * @param model
     * @param
     * @return
     */
    @RequiresPermissions("rntadmin:insectpests:add")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)// @ModelAttribute
    public  String  insertArticle(Model model, @ModelAttribute CmsArticleInfo cmsArticleInfo, HttpServletRequest request){
        if(cmsArticleInfo!=null&&cmsArticleInfo.getcArticleCategoryCode()!=null) {
             articleService.saveArticle(cmsArticleInfo,Long.valueOf(this.getUserId()),this.getUsername());
        }
        return "redirect:/rntadmin/insectpests/page";
    }
    /**
     *跳转添加页面
     * @return
     */
    @RequiresPermissions("rntadmin:insectpests:edit")
    @RequestMapping(value = "/edit",method = RequestMethod.GET)
    public  String  toEdit(Model model,@RequestParam("articleId")Long articleId){
        if(articleId!=null){
            CmsArticleInfo cmsArticleInfo = articleService.getArticleById(articleId);
            List<Category> categorylist = categoryService.getChildrenApiCategoryListByCode("trust_insect_pests");
            model.addAttribute("categoryList",categorylist);
            model.addAttribute("insectpests",cmsArticleInfo);
        }
        return "/rnt/insectpests/edit";
    }
    /**
     * 新增内容信息
     * @param model
     * @param cmsArticleInfo
     * @return
     */
    @RequiresPermissions("rntadmin:insectpests:edit")
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public  String  saveArticle(Model model,CmsArticleInfo cmsArticleInfo){
        if(cmsArticleInfo!=null) {
            articleService.saveArticle(cmsArticleInfo,Long.valueOf(this.getUserId()),this.getUsername());
        }
        return "redirect:/rntadmin/insectpests/page";
    }

    @RequiresPermissions("rntadmin:insectpests:delete")
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
    @RequiresPermissions("rntadmin:insectpests:batch:delete")
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
    @RequiresPermissions("rntadmin:insectpests:batch:release")
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
    @RequiresPermissions("rntadmin:insectpests:batch:undercarriage")
    @RequestMapping(value = "/batch/undercarriage",method = RequestMethod.POST)
    @ResponseBody
    public Result undercarriageArticle(@RequestParam(value = "articleIds[]",required = true)List<Long> list, @RequestParam(value = "categoryCode",required = true) String categoryCode){
        if(list!=null&&list.size()>0){
            return articleService.batchRelease(list,categoryCode,3,Long.valueOf(this.getUserId()),this.getUsername());
        }
        return new ResultData("500","内容不能为空");
    }
}
