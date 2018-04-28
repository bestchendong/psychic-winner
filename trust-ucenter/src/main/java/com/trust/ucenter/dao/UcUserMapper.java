package com.trust.ucenter.dao;

import com.trust.ucenter.entity.UcUser;
import com.trust.ucenter.entity.UcUserExample;
import java.util.List;
import java.util.Map;

import com.trust.ucenter.entity.UcUserQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UcUserMapper {
    int countByExample(UcUserExample example);

    int deleteByExample(UcUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UcUser record);

    UcUser selectByPhone(String phone);

    UcUser selectByNickname(String nickname);

    UcUser selectByLogin(Map map);

    int insertSelective(UcUser record);

    int uppassword(Map map);

    List<UcUser> selectByExample(UcUserExample example);

    UcUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UcUser record, @Param("example") UcUserExample example);

    int updateByExample(@Param("record") UcUser record, @Param("example") UcUserExample example);

    int updateByPrimaryKeySelective(UcUser record);

    int updateByPrimaryKey(UcUser record);

    int insertProductUser(Map map);

    Map myInfo(Integer userId);

    List selectByUserQuery(UcUserQuery ucUserQuery);

    int upUserStatus(Map map);

    int countByDate(Map map);

    int upHeadPhoto(Map map);

    Map userDetail(UcUserQuery ucUserQuery);
}