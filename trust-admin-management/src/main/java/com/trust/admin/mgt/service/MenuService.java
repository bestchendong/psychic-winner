package com.trust.admin.mgt.service;


import com.trust.admin.mgt.common.PageInfo;
import com.trust.admin.mgt.entity.Menu;
import com.trust.admin.mgt.entity.RoleMenu;

import java.util.List;

public interface MenuService {

    List<Menu> getMenuList();

    Menu getMenuById(int id);

    void add(Menu menu);

    void edit(Menu menu);

    void delete(int id);

    PageInfo getMenuByPage(int pageNo, int pageSize);

    Menu getMenuByName(String name);

    List<RoleMenu> getRoleMenuByMenuId(int menuId);
}
