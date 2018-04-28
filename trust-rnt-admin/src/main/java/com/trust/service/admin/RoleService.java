package com.trust.service.admin;


import com.trust.common.PageInfo;
import com.trust.common.Tree;
import com.trust.entity.admin.Menu;
import com.trust.entity.admin.Role;

import java.util.List;

public interface RoleService {

    List<Role> getRoleList();

    Role getRoleById(int id);

    void add(Role role);

    void edit(Role role);

    void delete(int id);

    PageInfo getRoleByPage(int pageNo, int pageSize);

    boolean setRoleMenus(int roleId, String menuIds);

    boolean setRoleOperations(int roleId, String operationIds);

    Role getRoleByName(String name);

    List<Tree> getMenuTreeWithRole(int roleId);

    List<Tree> getOperationTreeWithRole(int roleId);

    List<Role> getActiveRoleList();
}
