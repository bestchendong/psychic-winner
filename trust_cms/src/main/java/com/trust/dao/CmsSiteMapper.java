package com.trust.dao;

import com.trust.entity.cms.CmsSite;
import com.trust.entity.cms.CmsSiteExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface CmsSiteMapper {
    int countByExample(CmsSiteExample example);

    int deleteByExample(CmsSiteExample example);

    int deleteByPrimaryKey(Long cSiteId);

    int insert(CmsSite record);

    int insertSelective(CmsSite record);

    List<CmsSite> selectByExample(CmsSiteExample example);

    CmsSite selectByPrimaryKey(Long cSiteId);

    int updateByExampleSelective(@Param("record") CmsSite record, @Param("example") CmsSiteExample example);

    int updateByExample(@Param("record") CmsSite record, @Param("example") CmsSiteExample example);

    int updateByPrimaryKeySelective(CmsSite record);

    int updateByPrimaryKey(CmsSite record);
}