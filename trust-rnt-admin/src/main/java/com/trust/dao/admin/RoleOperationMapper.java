package com.trust.dao.admin;

import com.trust.entity.admin.RoleOperation;
import com.trust.entity.admin.RoleOperationExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface RoleOperationMapper {
    int countByExample(RoleOperationExample example);

    int deleteByExample(RoleOperationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoleOperation record);

    int insertSelective(RoleOperation record);

    List<RoleOperation> selectByExample(RoleOperationExample example);

    RoleOperation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleOperation record, @Param("example") RoleOperationExample example);

    int updateByExample(@Param("record") RoleOperation record, @Param("example") RoleOperationExample example);

    int updateByPrimaryKeySelective(RoleOperation record);

    int updateByPrimaryKey(RoleOperation record);

    List<Integer> getOperationsIdsByRoleId(int roleId);
}