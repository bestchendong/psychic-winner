package com.trust.dao.rnt;

import com.trust.entity.rnt.RntOperationDetail;
import com.trust.entity.rnt.RntOperationDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface RntOperationDetailMapper {
    int countByExample(RntOperationDetailExample example);

    int deleteByExample(RntOperationDetailExample example);

    int deleteByPrimaryKey(Long operationlogDetailsId);

    int insert(RntOperationDetail record);

    int insertSelective(RntOperationDetail record);

    List<RntOperationDetail> selectByExample(RntOperationDetailExample example);

    RntOperationDetail selectByPrimaryKey(Long operationlogDetailsId);

    int updateByExampleSelective(@Param("record") RntOperationDetail record, @Param("example") RntOperationDetailExample example);

    int updateByExample(@Param("record") RntOperationDetail record, @Param("example") RntOperationDetailExample example);

    int updateByPrimaryKeySelective(RntOperationDetail record);

    int updateByPrimaryKey(RntOperationDetail record);
}