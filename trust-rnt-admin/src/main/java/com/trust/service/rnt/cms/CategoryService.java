package com.trust.service.rnt.cms;

import com.github.pagehelper.PageInfo;
import com.trust.entity.rnt.Category;
import com.trust.entity.rnt.CmsArticleCategory;
import com.trust.service.rnt.cms.impl.CategoryServiceImpl;
import com.trust.utils.Result;
import com.trust.utils.ResultData;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
/**
*@Author Yangcb
*@Descrintion CMS类别服务调用
*@Date create 2018/3/21 17:09
*@Version 1.0
*/
@FeignClient(name = "trust-cms-service",fallback = CategoryServiceImpl.class)
public interface CategoryService {

    @RequestMapping(value = "/cms/category/insectpests",method = RequestMethod.POST)
    List<Category> getChildrenApiCategoryListByCode(@RequestParam(value = "categoryCode", required = true) String categoryCode);

    @RequestMapping(value = "/cms/api/category/list",method = RequestMethod.POST)
    ResultData getApiCategoryListByCode(@RequestParam(value = "categoryCode", required = true) String categoryCode);

    @RequestMapping(value = "/cms/all/level",method = RequestMethod.GET)
    PageInfo<CmsArticleCategory> getCmsArticleCategoryAllByLevel(@RequestParam(value = "level", defaultValue = "1") Integer level, @RequestParam(value = "page", defaultValue = "1") Integer page, @RequestParam(value = "size", defaultValue = "5") Integer size);

    @RequestMapping(value = "/cms/all/insectpestscategory",method = RequestMethod.GET)
    PageInfo<CmsArticleCategory> getCmsnsectpestscategoryAllByLevel(@RequestParam(value = "level", defaultValue = "1") Integer level, @RequestParam(value = "page", defaultValue = "1") Integer page, @RequestParam(value = "size", defaultValue = "5") Integer size);

    @RequestMapping(value = "/cms/children/level",method = RequestMethod.GET)
    List<Category> getChildrenCategoryListByLevel(@RequestParam(value = "level", defaultValue = "1") Integer level);

    @RequestMapping(value = "/cms/category/categoryName",method = RequestMethod.GET)
    List<CmsArticleCategory> getCmsArticleCategoryByCategoryName(@RequestParam(value = "categoryName") String categoryName);

    @RequestMapping(value = "/cms/category/add",method = RequestMethod.POST)
    Result addCmsArticleCategory(@RequestBody CmsArticleCategory cmsArticleCategory);

    @RequestMapping(value = "/cms/category/byId",method = RequestMethod.GET)
    CmsArticleCategory getCmsArticleCategoryById(@RequestParam(value = "id") Long id);

    @RequestMapping(value = "/cms/category/code",method = RequestMethod.GET)
    List<Category> getArticleCategoryByCode(@RequestParam(value = "categoryCode") String categoryCode);

    @RequestMapping(value = "/cms/category/edit",method = RequestMethod.POST)
    Result editArticleCategory(@RequestBody CmsArticleCategory cmsArticleCategory);
}
