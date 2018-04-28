package com.trust.admin.mgt.service;


import com.trust.admin.mgt.common.PageInfo;
import com.trust.admin.mgt.common.Tree;
import com.trust.admin.mgt.entity.Menu;
import com.trust.admin.mgt.entity.Role;

import java.util.List;

public interface RoleService {

    List<Role> getRoleList();

    Role getRoleById(int id);

    void add(Role role);

    void edit(Role role);

    void delete(int id);

    PageInfo getRoleByPage(int pageNo, int pageSize);

    List<Menu> getMenusOfRole(int roleId);
    
    boolean setRoleMenus(int roleId, String menuIds);

    boolean setRoleOperations(int roleId, String operationIds);

    Role getRoleByName(String name);

    List<Tree> getMenuTreeWithRole(int roleId);

    List<Tree> getOperationTreeWithRole(int roleId);

    List<Role> getActiveRoleList();
}
