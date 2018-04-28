package com.trust.dao;

import com.trust.entity.cms.CmsTemplateResources;
import com.trust.entity.cms.CmsTemplateResourcesExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface CmsTemplateResourcesMapper {
    int countByExample(CmsTemplateResourcesExample example);

    int deleteByExample(CmsTemplateResourcesExample example);

    int deleteByPrimaryKey(Long cTemplateResourceId);

    int insert(CmsTemplateResources record);

    int insertSelective(CmsTemplateResources record);

    List<CmsTemplateResources> selectByExample(CmsTemplateResourcesExample example);

    CmsTemplateResources selectByPrimaryKey(Long cTemplateResourceId);

    int updateByExampleSelective(@Param("record") CmsTemplateResources record, @Param("example") CmsTemplateResourcesExample example);

    int updateByExample(@Param("record") CmsTemplateResources record, @Param("example") CmsTemplateResourcesExample example);

    int updateByPrimaryKeySelective(CmsTemplateResources record);

    int updateByPrimaryKey(CmsTemplateResources record);

    List<CmsTemplateResources> findCmsTemplateResourcesByType(String type);

    List<CmsTemplateResources> getCmsTemplateResourcesListByTempId(Long templateId);
}