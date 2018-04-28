package com.trust.service.rnt.cms.impl;

import com.github.pagehelper.PageInfo;
import com.trust.entity.rnt.CmsArticleCategory;
import com.trust.entity.rnt.Category;
import com.trust.service.rnt.cms.CategoryService;
import com.trust.utils.Result;
import com.trust.utils.ResultData;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author Yangcb
 * @Descrintion
 * @Date create 2018-01-17 9:14
 * @Version 1.0
 */
@Component
public class CategoryServiceImpl implements CategoryService {

    @Override
    public List<Category> getChildrenApiCategoryListByCode(String categoryCode) {
        System.out.printf("调用服务失败");
        return null;
    }

    @Override
    public ResultData getApiCategoryListByCode(String categoryCode) {
        System.out.printf("调用服务失败");
        return null;
    }

    @Override
    public PageInfo<CmsArticleCategory> getCmsArticleCategoryAllByLevel(Integer level, Integer page, Integer size) {
        System.out.printf("调用服务失败");
        return null;
    }

    @Override
    public PageInfo<CmsArticleCategory> getCmsnsectpestscategoryAllByLevel(Integer level, Integer page, Integer size) {
        return null;
    }

    @Override
    public List<Category> getChildrenCategoryListByLevel(Integer level) {
        System.out.printf("调用服务失败");
        return null;
    }

    @Override
    public List<CmsArticleCategory> getCmsArticleCategoryByCategoryName(String categoryName) {
        System.out.printf("调用服务失败");
        return null;
    }

    @Override
    public Result addCmsArticleCategory(CmsArticleCategory cmsArticleCategory) {
        System.out.printf("调用服务失败");
        return null;
    }

    @Override
    public CmsArticleCategory getCmsArticleCategoryById(Long id) {
        System.out.printf("调用服务失败");
        return null;
    }

    @Override
    public List<Category> getArticleCategoryByCode(String categoryCode) {
        System.out.printf("调用服务失败");
        return null;
    }

    @Override
    public Result editArticleCategory(CmsArticleCategory cmsArticleCategory) {
        System.out.printf("调用服务失败");
        return null;
    }

}
