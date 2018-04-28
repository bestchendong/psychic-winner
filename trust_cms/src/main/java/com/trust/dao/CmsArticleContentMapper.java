package com.trust.dao;

import com.trust.entity.api.ArticleDetailArticleContents;
import com.trust.entity.cms.CmsArticleContent;
import com.trust.entity.cms.CmsArticleContentExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface CmsArticleContentMapper {
    int countByExample(CmsArticleContentExample example);

    int deleteByExample(CmsArticleContentExample example);

    int deleteByPrimaryKey(Long cArticleContentId);

    int insert(CmsArticleContent record);

    int insertSelective(CmsArticleContent record);

    List<CmsArticleContent> selectByExample(CmsArticleContentExample example);

    CmsArticleContent selectByPrimaryKey(Long cArticleContentId);

    int updateByExampleSelective(@Param("record") CmsArticleContent record, @Param("example") CmsArticleContentExample example);

    int updateByExample(@Param("record") CmsArticleContent record, @Param("example") CmsArticleContentExample example);

    int updateByPrimaryKeySelective(CmsArticleContent record);

    int updateByPrimaryKey(CmsArticleContent record);

    List<CmsArticleContent> selectArticleContentsByArticleId(long articleId);

    List<ArticleDetailArticleContents> selectCmsArticleContentsByArticleId(long articleId);

    CmsArticleContent findCmsArticleContentByType(long articleId, int type);
}