package com.trust.admin.mgt.utils;

import com.trust.admin.mgt.entity.Menu;

import java.util.ArrayList;
import java.util.List;

public class AdminUtil {

    public static List<Menu> changeRoleMenuListToTreeList(List<Menu> roleMenuList){
        List<Menu> roleMenus = new ArrayList<>();
        for( Menu menu1 : roleMenuList){
            if(menu1.getLevel() == 1){
                List<Menu> menu1Children = new ArrayList<Menu>();
                for(Menu menu2 : roleMenuList){
                    if(menu2.getParentId() == menu1.getMenuId()){
                        menu1Children.add(menu2);
                        List<Menu> menu2Children = new ArrayList<Menu>();
                        for(Menu menu3 : roleMenuList){
                            if(menu3.getParentId() == menu2.getMenuId()){
                                menu2Children.add(menu3);
                                List<Menu> menu3Children = new ArrayList<Menu>();
                                for(Menu menu4 : roleMenuList){
                                    if(menu4.getParentId() == menu3.getMenuId()){
                                        menu3Children.add(menu4);
                                    }
                                }
                                menu3.setChildrenMenu(menu3Children);
                            }
                        }
                        menu2.setChildrenMenu(menu2Children);
                    }
                }
                menu1.setChildrenMenu(menu1Children);
                roleMenus.add(menu1);
            }
        }
        return roleMenus;
    }
}
