package com.trust.controller.rnt;

import com.github.pagehelper.PageInfo;
import com.trust.entity.rnt.Category;
import com.trust.entity.rnt.CmsArticleCategory;
import com.trust.service.rnt.cms.CategoryService;
import com.trust.utils.Result;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * @author tangliang
 * @create 2018-01-15 19:53
 * @desc 农作物分类展示接口
 **/
@Controller
@RequestMapping("/rnt/crops")
public class CropsCategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/query/page")
    @RequiresPermissions("rnt:crops:query:page")
    public String queryArticleCategoryByPage(Model model, @RequestParam(value="level",defaultValue = "1")int level,@RequestParam(value="page",defaultValue = "1")int page ,@RequestParam(value="size",defaultValue = "10")int size){
        try {
            PageInfo<CmsArticleCategory> pageInfo = categoryService.getCmsArticleCategoryAllByLevel(level, page, size);
            if (pageInfo!=null){
                model.addAttribute("pageInfo",pageInfo);
                return "/rnt/crops/crops";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "/rnt/sys/500";
    }

    @RequiresPermissions("rnt:crop:insectpestscategory:page")
    @RequestMapping("/insectpestscategory/page")
    public String insectpestsCategoryByPage(Model model, @RequestParam(value="level",defaultValue = "1")int level,@RequestParam(value="page",defaultValue = "1")int page ,@RequestParam(value="size",defaultValue = "5")int size){
        PageInfo<CmsArticleCategory> pageInfo = categoryService.getCmsnsectpestscategoryAllByLevel(level, page, size);
        if (pageInfo!=null && pageInfo.getList()!=null && pageInfo.getList().size()!=0){
            model.addAttribute("pageInfo",pageInfo);
            return "/rnt/insectpests/insectpestscategory";
        }
        return "/rnt/sys/readypage";
    }


    @RequestMapping("/toAdd")
    @RequiresPermissions("rnt:crops:add")
    public String toAdd(Model model,@RequestParam(value="level",defaultValue = "1")Integer level){
        try {
            List<Category> childrenCategoryListByLevel = categoryService.getChildrenCategoryListByLevel(level);
            if(childrenCategoryListByLevel!=null){
                model.addAttribute("childrenListByLevel",childrenCategoryListByLevel);
                return "/rnt/crops/crops_add";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "/rnt/sys/500";
    }

    @RequestMapping("/add")
    @RequiresPermissions("rnt:crops:add")
    public String addArticleCategory(CmsArticleCategory cmsArticleCategory){
        if(cmsArticleCategory!=null && cmsArticleCategory.getcCategoryName()!=null && cmsArticleCategory.getcCategoryStatus()!=null
                && cmsArticleCategory.getcPid()!=null && cmsArticleCategory.getcCategoryCode()!=null){
            Result result1 = this.queryArticleCategoryByCategoryName(null, cmsArticleCategory.getcCategoryName(), "add");
            Result result2 = this.queryArticleCategoryByCategoryCode(null, cmsArticleCategory.getcCategoryCode(), "add");
            if (result1!=null && result2!=null && result1.get("code")!=null && result2.get("code")!=null){
                if ("200".equals(result1.get("code")) && "200".equals(result2.get("code"))){
                    CmsArticleCategory cmsArticleCategoryById = categoryService.getCmsArticleCategoryById(cmsArticleCategory.getcPid());
                    if(cmsArticleCategoryById!=null && cmsArticleCategoryById.getcCategoryLevel()!=null){
                        if (cmsArticleCategoryById.getcCategoryLevel()<=1){
                            cmsArticleCategory.setcCategoryImage(null);
                            cmsArticleCategory.setcCategoryLevel(cmsArticleCategoryById.getcCategoryLevel()+1);
                            //设置属性默认值(允许拓展字段)
                            cmsArticleCategory.setcCategoryDescribe(cmsArticleCategory.getcCategoryName());
                            cmsArticleCategory.setcSiteId((long)1);
                            Result result = categoryService.addCmsArticleCategory(cmsArticleCategory);
                            if (result!=null && "200".equals(result.get("code"))){
                                return "redirect:/rnt/crops/query/page";
                            }
                        }else{
                            if (cmsArticleCategory.getcCategoryImage()!=null){
                                cmsArticleCategory.setcCategoryLevel(cmsArticleCategoryById.getcCategoryLevel()+1);
                                //设置属性默认值(允许拓展字段)
                                cmsArticleCategory.setcCategoryDescribe(cmsArticleCategory.getcCategoryName());
                                cmsArticleCategory.setcSiteId((long)1);
                                Result result = categoryService.addCmsArticleCategory(cmsArticleCategory);
                                if (result!=null && "200".equals(result.get("code"))){
                                    return "redirect:/rnt/crops/query/page";
                                }
                            }
                        }
                    }
                }
            }
        }
        return "/rnt/sys/500";
    }

    @ResponseBody
    @RequestMapping(value = "/verify/name")
    public Result queryArticleCategoryByCategoryName(Long categoryId,String categoryName,String operationSort){
        if (operationSort!=null){
            if ("add".equals(operationSort)){
                if(categoryName!=null){
                    List<CmsArticleCategory> cmsArticleCategoryByCategoryName = categoryService.getCmsArticleCategoryByCategoryName(categoryName);
                    if (cmsArticleCategoryByCategoryName!=null && cmsArticleCategoryByCategoryName.size()!=0){
                        return new Result("500","分类名称已存在");
                    }
                    return new Result("200","success");
                }
                return new Result("400","分类名称为空");
            }else if("edit".equals(operationSort)){
                if (categoryId!=null && categoryName!=null){
                    List<CmsArticleCategory> cmsArticleCategoryByCategoryName = categoryService.getCmsArticleCategoryByCategoryName(categoryName);
                    if (cmsArticleCategoryByCategoryName!=null && cmsArticleCategoryByCategoryName.size()!=0){
                        if (cmsArticleCategoryByCategoryName.size()==1){
                            if (cmsArticleCategoryByCategoryName.get(0).getcCategoryId()!=null){
                                if (cmsArticleCategoryByCategoryName.get(0).getcCategoryId().equals(categoryId)){
                                    return new Result("200","success");
                                }
                                return new Result("500","分类名称已存在");
                            }
                            return  new Result("500","error");
                        }
                        return new Result("500","分类名称已存在");
                    }
                    return new Result("200","success");
                }
                return new Result("400","分类名称或分类ID为空");
            }else{
                return new Result("400","参数错误");
            }
        }
        return new Result("400","操作类型为空");
    }

    @ResponseBody
    @RequestMapping(value = "/verify/code")
    public Result queryArticleCategoryByCategoryCode(Long categoryId,String categoryCode,String operationSort){
        if (operationSort!=null){
            if ("add".equals(operationSort)){
                if (categoryCode!=null){
                    List<Category> articleCategoryByCode = categoryService.getArticleCategoryByCode(categoryCode);
                    if (articleCategoryByCode!=null && articleCategoryByCode.size()!=0){
                        return new Result("500","分类编号已存在");
                    }
                    return new Result("200","success");
                }
                return new Result("400","分类编号为空");
            }else if("edit".equals(operationSort)){
                if (categoryId!=null && categoryCode!=null){
                    List<Category> articleCategoryByCode = categoryService.getArticleCategoryByCode(categoryCode);
                    if (articleCategoryByCode!=null && articleCategoryByCode.size()!=0){
                        if (articleCategoryByCode.size()==1){
                            if (articleCategoryByCode.get(0).getCategoryId()!=null){
                                if (articleCategoryByCode.get(0).getCategoryId().equals(categoryId)){
                                    return new Result("200","success");
                                }
                                return new Result("500","分类编号已存在");
                            }
                            return  new Result("500","error");
                        }
                        return new Result("500","分类编号已存在");
                    }
                    return new Result("200","success");
                }
                return new Result("400","分类ID或分类编号为空");
            }else{
                return new Result("400","参数错误");
            }
        }
        return new Result("400","操作类型为空");
    }

    @RequestMapping("/toEdit")
    @RequiresPermissions("rnt:crops:edit")
    public String queryArticleCategoryById(Long id,Model model,@RequestParam(value = "level", defaultValue = "1")Integer level){
        if (id!=null){
            CmsArticleCategory cmsArticleCategoryById = categoryService.getCmsArticleCategoryById(id);
            List<Category> childrenCategoryListByLevel = categoryService.getChildrenCategoryListByLevel(level);
            if (cmsArticleCategoryById!=null && childrenCategoryListByLevel!=null){
                model.addAttribute("childrenListByLevel",childrenCategoryListByLevel);
                model.addAttribute("cmsArticleCategory",cmsArticleCategoryById);
                return "/rnt/crops/crops_edit";
            }
        }
        return "/rnt/sys/500";
    }

    @RequestMapping("/edit")
    @RequiresPermissions("rnt:crops:edit")
    public String editArticleCategory(CmsArticleCategory cmsArticleCategory){
        if (cmsArticleCategory!=null && cmsArticleCategory.getcCategoryId()!=null && cmsArticleCategory.getcCategoryCode()!=null &&
                cmsArticleCategory.getcCategoryName()!=null && cmsArticleCategory.getcPid()!=null && cmsArticleCategory.getcCategoryStatus()!=null){
            Result result1 = this.queryArticleCategoryByCategoryName(cmsArticleCategory.getcCategoryId(), cmsArticleCategory.getcCategoryName(), "edit");
            Result result2 = this.queryArticleCategoryByCategoryCode(cmsArticleCategory.getcCategoryId(), cmsArticleCategory.getcCategoryCode(), "edit");
            if (result1!=null && result2!=null && result1.get("code")!=null && result2.get("code")!=null){
                if ("200".equals(result1.get("code")) && "200".equals(result2.get("code"))){
                    CmsArticleCategory cmsArticleCategoryById = categoryService.getCmsArticleCategoryById(cmsArticleCategory.getcPid());
                    if(cmsArticleCategoryById!=null && cmsArticleCategoryById.getcCategoryLevel()!=null){
                        if (cmsArticleCategoryById.getcCategoryLevel()<=1){
                            cmsArticleCategory.setcCategoryImage(null);
                            cmsArticleCategory.setcCategoryLevel(cmsArticleCategoryById.getcCategoryLevel()+1);
                            //设置属性默认值(允许拓展字段)
                            cmsArticleCategory.setcCategoryDescribe(cmsArticleCategory.getcCategoryName());
                            Result result = categoryService.editArticleCategory(cmsArticleCategory);
                            if ("200".equals(result.get("code"))){
                                return "redirect:/rnt/crops/query/page";
                            }
                        }else{
                            if (cmsArticleCategory.getcCategoryImage()!=null){
                                cmsArticleCategory.setcCategoryLevel(cmsArticleCategoryById.getcCategoryLevel()+1);
                                //设置属性默认值(允许拓展字段)
                                cmsArticleCategory.setcCategoryDescribe(cmsArticleCategory.getcCategoryName());
                                Result result = categoryService.editArticleCategory(cmsArticleCategory);
                                if ("200".equals(result.get("code"))){
                                    return "redirect:/rnt/crops/query/page";
                                }
                            }
                        }
                    }
                }
            }
        }
        return "/rnt/sys/500";
    }
}
