package com.trust.dao.rnt;

import com.trust.entity.rnt.RntOperation;
import com.trust.entity.rnt.RntOperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RntOperationMapper {
    int countByExample(RntOperationExample example);

    int deleteByExample(RntOperationExample example);

    int deleteByPrimaryKey(Long operationlogId);

    int insert(RntOperation record);

    int insertSelective(RntOperation record);

    List<RntOperation> selectByExample(RntOperationExample example);

    RntOperation selectByPrimaryKey(Long operationlogId);

    int updateByExampleSelective(@Param("record") RntOperation record, @Param("example") RntOperationExample example);

    int updateByExample(@Param("record") RntOperation record, @Param("example") RntOperationExample example);

    int updateByPrimaryKeySelective(RntOperation record);

    int updateByPrimaryKey(RntOperation record);
}