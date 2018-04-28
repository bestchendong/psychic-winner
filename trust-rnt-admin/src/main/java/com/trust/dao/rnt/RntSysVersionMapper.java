package com.trust.dao.rnt;

import com.trust.entity.rnt.RntSysVersion;
import com.trust.entity.rnt.RntSysVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}