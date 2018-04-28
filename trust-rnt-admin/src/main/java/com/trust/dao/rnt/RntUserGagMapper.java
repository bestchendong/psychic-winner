package com.trust.dao.rnt;

import com.trust.entity.rnt.RntUserGag;
import com.trust.entity.rnt.RntUserGagExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RntUserGagMapper {
    int countByExample(RntUserGagExample example);

    int deleteByExample(RntUserGagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RntUserGag record);

    int insertSelective(RntUserGag record);

    List<RntUserGag> selectByExample(RntUserGagExample example);

    RntUserGag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RntUserGag record, @Param("example") RntUserGagExample example);

    int updateByExample(@Param("record") RntUserGag record, @Param("example") RntUserGagExample example);

    int updateByPrimaryKeySelective(RntUserGag record);

    int updateByPrimaryKey(RntUserGag record);

    List<Integer> selectByUserId(Integer userId);
}