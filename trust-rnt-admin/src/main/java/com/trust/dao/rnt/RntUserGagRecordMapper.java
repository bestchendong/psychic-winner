package com.trust.dao.rnt;

import com.trust.entity.rnt.RntUserGagRecord;
import com.trust.entity.rnt.RntUserGagRecordExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RntUserGagRecordMapper {
    int countByExample(RntUserGagRecordExample example);

    int deleteByExample(RntUserGagRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RntUserGagRecord record);

    int insertSelective(RntUserGagRecord record);

    List<RntUserGagRecord> selectByExample(RntUserGagRecordExample example);

    RntUserGagRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RntUserGagRecord record, @Param("example") RntUserGagRecordExample example);

    int updateByExample(@Param("record") RntUserGagRecord record, @Param("example") RntUserGagRecordExample example);

    int updateByPrimaryKeySelective(RntUserGagRecord record);

    int updateByPrimaryKey(RntUserGagRecord record);

    List lastGagRecord(Integer userId);
}