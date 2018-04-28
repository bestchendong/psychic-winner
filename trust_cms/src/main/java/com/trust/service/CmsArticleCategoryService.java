package com.trust.service;

import com.github.pagehelper.PageInfo;
import com.trust.entity.api.Category;
import com.trust.entity.cms.CmsArticleCategory;
import java.util.List;


public interface CmsArticleCategoryService{

     List<CmsArticleCategory> getCmsArticleCategoryList();

     List<CmsArticleCategory> getChildrenCategoryListByCode(String code);

     List<Category> getChildrenCategoryListByInsectpests(String code);

     List<Category> getChildrenApiCategoryListByCode(String code);

     CmsArticleCategory findCmsArticleCategoryById(long id);

     int save(CmsArticleCategory cmsArticleCategory);

     int edit(CmsArticleCategory cmsArticleCategory);

     int delete(long id);

     CmsArticleCategory getCategoryByCode(String code);

     PageInfo findByPageAndParams(CmsArticleCategory param, int pageNumber, int pageSize);

     //查询所有，按照指定父id
     PageInfo<CmsArticleCategory> getCmsArticleCategoryAllByLevel(Integer level,int pageNumber,int pageSize);

     //查询level='指定值'的农作物分类列表，默认值为1（查询一级及其子类）
     List<Category> getChildrenCategoryListByLevel(Integer level);

     //按照分类名称查询
     List<CmsArticleCategory> findCmsArticleCategoryByCategoryName(String categoryName);
}