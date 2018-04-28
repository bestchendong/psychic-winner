package com.trust.dao;

import com.trust.entity.cms.CmsArticleOperateLog;
import com.trust.entity.cms.CmsArticleOperateLogExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface CmsArticleOperateLogMapper {

    int countByExample(CmsArticleOperateLogExample example);

    int deleteByExample(CmsArticleOperateLogExample example);

    int deleteByPrimaryKey(Long cmsOperateLogId);

    int insert(CmsArticleOperateLog record);

    int insertSelective(CmsArticleOperateLog record);

    List<CmsArticleOperateLog> selectByExample(CmsArticleOperateLogExample example);

    List<CmsArticleOperateLog> selectCmsArticleOperateLogByArticleId(Long articleId);

    CmsArticleOperateLog selectByPrimaryKey(Long cmsOperateLogId);

    int updateByExampleSelective(@Param("record") CmsArticleOperateLog record, @Param("example") CmsArticleOperateLogExample example);

    int updateByExample(@Param("record") CmsArticleOperateLog record, @Param("example") CmsArticleOperateLogExample example);

    int updateByPrimaryKeySelective(CmsArticleOperateLog record);

    int updateByPrimaryKey(CmsArticleOperateLog record);
}