package com.trust.admin.ucenter.dao;

import com.trust.admin.ucenter.entity.UcUser;
import com.trust.admin.ucenter.entity.UcUserExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UcUserMapper {
    int countByExample(UcUserExample example);

    int deleteByExample(UcUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UcUser record);

    int insertSelective(UcUser record);

    List<UcUser> selectByExample(UcUserExample example);

    UcUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UcUser record, @Param("example") UcUserExample example);

    int updateByExample(@Param("record") UcUser record, @Param("example") UcUserExample example);

    int updateByPrimaryKeySelective(UcUser record);

    int updateByPrimaryKey(UcUser record);

    List getAllPlatform();

    List<Map> getAllUcUser();

    List selectPlatformByUserId(Integer userId);
}