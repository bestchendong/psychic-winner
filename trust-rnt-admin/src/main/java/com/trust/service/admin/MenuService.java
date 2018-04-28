package com.trust.service.admin;


import com.trust.common.PageInfo;
import com.trust.entity.admin.Menu;
import com.trust.entity.admin.RoleMenu;

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
