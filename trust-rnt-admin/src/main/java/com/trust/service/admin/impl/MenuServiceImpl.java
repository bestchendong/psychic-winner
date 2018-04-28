package com.trust.service.admin.impl;

import com.github.pagehelper.PageHelper;
import com.trust.common.PageInfo;
import com.trust.dao.admin.MenuMapper;
import com.trust.dao.admin.RoleMenuMapper;
import com.trust.entity.admin.Menu;
import com.trust.entity.admin.MenuExample;
import com.trust.entity.admin.RoleMenu;
import com.trust.entity.admin.RoleMenuExample;
import com.trust.service.admin.MenuService;
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
        menuExample.createCriteria().andIsRootNotEqualTo(1);
        List<Menu> list = menuMapper.selectByExample(menuExample);
        return new PageInfo(list);
    }

    @Override
    public Menu getMenuByName(String name) {
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
}
