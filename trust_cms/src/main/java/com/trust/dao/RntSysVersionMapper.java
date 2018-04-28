package com.trust.dao;

import com.trust.entity.api.RntVersion;
import com.trust.entity.cms.RntSysVersion;
import com.trust.entity.cms.RntSysVersionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface RntSysVersionMapper {
    int countByExample(RntSysVersionExample example);

    int deleteByExample(RntSysVersionExample example);

    int deleteByPrimaryKey(Long versionId);

    int insert(RntSysVersion record);

    int insertSelective(RntSysVersion record);

    List<RntSysVersion> selectByExample(RntSysVersionExample example);

    RntSysVersion selectByPrimaryKey(Long versionId);

    int updateByExampleSelective(@Param("record") RntSysVersion record, @Param("example") RntSysVersionExample example);

    int updateByExample(@Param("record") RntSysVersion record, @Param("example") RntSysVersionExample example);

    int updateByPrimaryKeySelective(RntSysVersion record);

    int updateByPrimaryKey(RntSysVersion record);

    RntVersion findRntVersionBySysName(String sysName);
}