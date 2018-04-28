package com.trust.dao;

import com.trust.entity.cms.CmsUser;
import com.trust.entity.cms.CmsUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface CmsUserMapper {
    int countByExample(CmsUserExample example);

    int deleteByExample(CmsUserExample example);

    int deleteByPrimaryKey(Long cUserId);

    int insert(CmsUser record);

    int insertSelective(CmsUser record);

    List<CmsUser> selectByExample(CmsUserExample example);

    CmsUser selectByPrimaryKey(Long cUserId);

    int updateByExampleSelective(@Param("record") CmsUser record, @Param("example") CmsUserExample example);

    int updateByExample(@Param("record") CmsUser record, @Param("example") CmsUserExample example);

    int updateByPrimaryKeySelective(CmsUser record);

    int updateByPrimaryKey(CmsUser record);
}