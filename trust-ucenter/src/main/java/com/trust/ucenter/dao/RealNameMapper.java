package com.trust.ucenter.dao;

import com.trust.ucenter.entity.RealName;
import com.trust.ucenter.entity.RealNameExample;
import java.util.List;

import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
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

    RealName selectByUserId(Integer userId);
}