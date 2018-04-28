package com.trust.dao;

import com.trust.entity.api.Article;
import com.trust.entity.api.ArticleDetail;
import com.trust.entity.cms.CmsArticleInfo;
import com.trust.entity.cms.CmsArticleInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface CmsArticleInfoMapper {
    int countByExample(CmsArticleInfoExample example);

    int deleteByExample(CmsArticleInfoExample example);

    int deleteByPrimaryKey(Long cArticleId);

    int insert(CmsArticleInfo record);

    int insertSelective(CmsArticleInfo record);

    List<CmsArticleInfo> selectByExample(CmsArticleInfoExample example);

    CmsArticleInfo selectByPrimaryKey(Long cArticleId);

    ArticleDetail selectArticleDetailByPrimaryKey(@Param("cArticleId") long cArticleId,@Param("sourceType") String sourceType);

    int updateByExampleSelective(@Param("record") CmsArticleInfo record, @Param("example") CmsArticleInfoExample example);

    int updateByExample(@Param("record") CmsArticleInfo record, @Param("example") CmsArticleInfoExample example);

    int updateByPrimaryKeySelective(CmsArticleInfo record);

    int updateByPrimaryKey(CmsArticleInfo record);

    List<CmsArticleInfo> findAllByPage();

    List<Article> selectArticleByCategoryCode(String categoryCode);

    List<CmsArticleInfo>  selectArticleByCategoryId(Long categoryId);

    int releaseArticle(Map params);
}