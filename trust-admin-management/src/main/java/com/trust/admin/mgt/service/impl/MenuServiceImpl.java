package com.trust.admin.mgt.service.impl;

import com.github.pagehelper.PageHelper;
import com.trust.admin.mgt.common.PageInfo;
import com.trust.admin.mgt.dao.MenuMapper;
import com.trust.admin.mgt.dao.RoleMenuMapper;
import com.trust.admin.mgt.entity.Menu;
import com.trust.admin.mgt.entity.MenuExample;
import com.trust.admin.mgt.entity.RoleMenu;
import com.trust.admin.mgt.entity.RoleMenuExample;
import com.trust.admin.mgt.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MenuServiceImpl implements MenuService{

    @Autowired
    private MenuMapper menuMapper;
    @Autowired
    private RoleMenuMapper roleMenuMapper;

    @Override
    public List<Menu> getMenuList() {
        MenuExample menuExample = new MenuExample();
        menuExample.createCriteria().andLevelEqualTo(1);
        return menuMapper.selectByExample(menuExample);
    }

    @Override
    public Menu getMenuById(int id) {
        return menuMapper.selectByPrimaryKey(id);
    }

    @Override
    public void add(Menu menu) {
        menuMapper.insertSelective(menu);
    }

    @Override
    public void edit(Menu menu) {
        menuMapper.updateByPrimaryKeySelective(menu);
    }

    @Override
    public void delete(int id) {
        menuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PageInfo getMenuByPage(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        MenuExample menuExample = new MenuExample();
        List<Menu> menuList = menuMapper.selectByExample(menuExample);
        if(menuList != null && menuList.size() > 0){
            for(int i = 0; i<menuList.size(); i++){
                menuList.get(i).setParentMenus(getParentMenu(menuList.get(i)));
            }
        }
        return new PageInfo(menuList);
    }

    @Override
    public Menu getMenuByName( String name) {
        MenuExample menuExample = new MenuExample();
        menuExample.createCriteria().andNameEqualTo(name);
        List<Menu> menuList = menuMapper.selectByExample(menuExample);
        if(menuList != null && menuList.size() > 0){
            return menuList.get(0);
        }
        return null;
    }

    @Override
    public List<RoleMenu> getRoleMenuByMenuId(int menuId) {
        RoleMenuExample roleMenuExample = new RoleMenuExample();
        roleMenuExample.createCriteria().andMenuIdEqualTo(menuId);
        return roleMenuMapper.selectByExample(roleMenuExample);
    }

    public String getParentMenu(Menu menu){
        if(menu.getLevel() > 1){
            Menu parentMenu = menuMapper.selectByPrimaryKey(menu.getParentId());
            if(parentMenu.getLevel() == 1){
                return parentMenu.getName();
            }
            return getParentMenu(parentMenu) + " / " + parentMenu.getName();
        } else {
            return "";
        }
    }
}
