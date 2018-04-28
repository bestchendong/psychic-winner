package com.trust.admin.ucenter.dao;

import com.trust.admin.ucenter.entity.RealNameRecord;
import com.trust.admin.ucenter.entity.RealNameRecordExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface RealNameRecordMapper {
    int countByExample(RealNameRecordExample example);

    int deleteByExample(RealNameRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RealNameRecord record);

    int insertSelective(RealNameRecord record);

    List<RealNameRecord> selectByExample(RealNameRecordExample example);

    RealNameRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RealNameRecord record, @Param("example") RealNameRecordExample example);

    int updateByExample(@Param("record") RealNameRecord record, @Param("example") RealNameRecordExample example);

    int updateByPrimaryKeySelective(RealNameRecord record);

    int updateByPrimaryKey(RealNameRecord record);
}