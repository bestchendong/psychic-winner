package com.trust.dao;

import com.trust.entity.api.Category;
import com.trust.entity.cms.CmsArticleCategory;
import com.trust.entity.cms.CmsArticleCategoryExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
@Mapper
public interface CmsArticleCategoryMapper {

    int countByExample(CmsArticleCategoryExample example);

    int deleteByExample(CmsArticleCategoryExample example);

    int deleteByPrimaryKey(Long cCategoryId);

    int insert(CmsArticleCategory record);

    int insertSelective(CmsArticleCategory record);

    List<CmsArticleCategory> selectByExample(CmsArticleCategoryExample example);

    CmsArticleCategory selectByPrimaryKey(Long cCategoryId);

    int updateByExampleSelective(@Param("record") CmsArticleCategory record, @Param("example") CmsArticleCategoryExample example);

    int updateByExample(@Param("record") CmsArticleCategory record, @Param("example") CmsArticleCategoryExample example);

    int updateByPrimaryKeySelective(CmsArticleCategory record);

    int updateByPrimaryKey(CmsArticleCategory record);

    CmsArticleCategory getCategoryByCode(String code);

    List<Category> getApiCategoryByCode(String code);

    List<Category> getApiCategoryByInsectpests(String code);

    List<CmsArticleCategory> getCmsCategoryByCode(String code);

    CmsArticleCategory getCmsCategoryByCategoryByCode(String code);

    List<Category> selectChildrenCategoryById(long id);

    List<Category> selectChildrenCategoryByLevel(Integer level);

}