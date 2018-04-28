package com.trust.dao;

import com.trust.entity.cms.CmsContentTemplate;
import com.trust.entity.cms.CmsContentTemplateExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface CmsContentTemplateMapper {
    int countByExample(CmsContentTemplateExample example);

    int deleteByExample(CmsContentTemplateExample example);

    int deleteByPrimaryKey(Long cContentTemplateId);

    int insert(CmsContentTemplate record);

    int insertSelective(CmsContentTemplate record);

    List<CmsContentTemplate> selectByExample(CmsContentTemplateExample example);

    CmsContentTemplate selectByPrimaryKey(Long cContentTemplateId);

    int updateByExampleSelective(@Param("record") CmsContentTemplate record, @Param("example") CmsContentTemplateExample example);

    int updateByExample(@Param("record") CmsContentTemplate record, @Param("example") CmsContentTemplateExample example);

    int updateByPrimaryKeySelective(CmsContentTemplate record);

    int updateByPrimaryKey(CmsContentTemplate record);
}