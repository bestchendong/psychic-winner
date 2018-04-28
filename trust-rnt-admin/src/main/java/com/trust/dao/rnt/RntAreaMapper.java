package com.trust.dao.rnt;

import com.trust.entity.rnt.RntArea;
import com.trust.entity.rnt.RntAreaExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface RntAreaMapper {
    int countByExample(RntAreaExample example);

    int deleteByExample(RntAreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RntArea record);

    int insertSelective(RntArea record);

    List<RntArea> selectByExample(RntAreaExample example);

    RntArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RntArea record, @Param("example") RntAreaExample example);

    int updateByExample(@Param("record") RntArea record, @Param("example") RntAreaExample example);

    int updateByPrimaryKeySelective(RntArea record);

    int updateByPrimaryKey(RntArea record);
}