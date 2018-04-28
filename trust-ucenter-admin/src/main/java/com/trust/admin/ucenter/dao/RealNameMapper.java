package com.trust.admin.ucenter.dao;

import com.trust.admin.ucenter.entity.RealName;
import com.trust.admin.ucenter.entity.RealNameExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface RealNameMapper {
    int countByExample(RealNameExample example);

    int deleteByExample(RealNameExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RealName record);

    int insertSelective(RealName record);

    List<RealName> selectByExample(RealNameExample example);

    RealName selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RealName record, @Param("example") RealNameExample example);

    int updateByExample(@Param("record") RealName record, @Param("example") RealNameExample example);

    int updateByPrimaryKeySelective(RealName record);

    int updateByPrimaryKey(RealName record);

    List<RealName> getAllRealName();

    int upRealNameStatus(Map paraMap);
}