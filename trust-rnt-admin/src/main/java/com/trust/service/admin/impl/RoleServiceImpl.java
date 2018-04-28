package com.trust.service.admin.impl;

import com.github.pagehelper.PageHelper;
import com.trust.common.PageInfo;
import com.trust.common.Tree;
import com.trust.dao.admin.*;
import com.trust.entity.admin.*;
import com.trust.service.admin.RoleService;
import com.trust.utils.admin.AdminUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Repository
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RoleMenuMapper roleMenuMapper;
    @Autowired
    private MenuMapper menuMapper;
    @Autowired
    private RoleOperationMapper roleOperationMapper;
    @Autowired
    private OperationMapper operationMapper;
    @Autowired
    private ManagerRoleMapper managerRoleMapper;

    @Override
    public List<Role> getRoleList() {
        RoleExample roleExample = new RoleExample();
        roleExample.createCriteria().andIsRootEqualTo(0);
        return roleMapper.selectByExample(roleExample);
    }

    @Override
    public Role getRoleById(int id) {
        Role role = roleMapper.selectByPrimaryKey(id);
        List<Menu> roleMenuList =  menuMapper.getRoleMenuByRoleId(id);
        List<Operation> roleOperationList = operationMapper.getRoleOperationByRoleId(id);
        boolean menuExist = false;
        boolean operationExist = false;
        if(roleMenuList.size() > 0){ menuExist = true;}
        if(roleOperationList.size() > 0 ){ operationExist = true;}
        List<Menu> levelFourMenus = new ArrayList<Menu>();
        if(operationExist){
            /*for(Menu menu : roleMenuList){
                if(menu.getLevel() == 4){
                    Menu levelFourmenu = menu;
                    if(menu.getPage() != null){
                        Page page = menu.getPage();
                        List<Operation> pageRoleOperation = new ArrayList<Operation>();
                        for(Operation operation : roleOperationList){
                            if(menu.getPage().getPageId() == operation.getPageId()){
                                pageRoleOperation.add(operation);
                            }
                        }
                        page.setOperations(pageRoleOperation);
                        menu.setPage(page);
                    }
                    levelFourMenus.add(levelFourmenu);
                }

            }*/
            Set<String> operationKeys = new HashSet<>();
            for(Operation operation : roleOperationList){
                operationKeys.add(operation.getOperationId());
            }
            role.setOperationKeys(operationKeys);
        }
        if(menuExist){
            role.setMenuList(AdminUtil.changeRoleMenuListToTreeList(roleMenuList));
        }
        return role;
    }



    @Override
    public void add(Role role) {
        if(role.getIsRoot() == null){
            role.setIsRoot(0);
        }
        roleMapper.insert(role);
    }

    @Override
    public void edit(Role role) {
        roleMapper.updateByPrimaryKeySelective(role);
    }

    @Override
    public void delete(int id) {
        //删除角色
        roleMapper.deleteByPrimaryKey(id);
        //删除角色菜单的对应关系
        RoleMenuExample roleMenuExample = new RoleMenuExample();
        roleMenuExample.createCriteria().andRoleIdEqualTo(id);
        roleMenuMapper.deleteByExample(roleMenuExample);
        //删除角色按钮的对应关系
        RoleOperationExample roleOperationExample = new RoleOperationExample();
        roleOperationExample.createCriteria().andRoleIdEqualTo(id);
        roleOperationMapper.deleteByExample(roleOperationExample);
        //清除用户与该角色的关联关系
        ManagerRoleExample managerRoleExample = new ManagerRoleExample();
        managerRoleExample.createCriteria().andRoleIdEqualTo(id);
        managerRoleMapper.deleteByExample(managerRoleExample);
    }

    @Override
    public PageInfo getRoleByPage(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        RoleExample roleExample = new RoleExample();
        List<Role> list = roleMapper.selectByExample(roleExample);
        return new PageInfo(list);
    }

    @Override
    public boolean setRoleMenus(int roleId, String menuIds) {
        try{
            String[] menuIdArray = menuIds.split(",");
            RoleMenuExample roleMenuExample = new RoleMenuExample();
            roleMenuExample.createCriteria().andRoleIdEqualTo(roleId);
            List<RoleMenu> roleMenuBefore =  roleMenuMapper.selectByExample(roleMenuExample);
            //list中存放需要删除的记录对应的menuId
            List<Integer> delete = new ArrayList<>();
            //list中存放需要增加的记录对应的menuId
            List<Integer> insert = new ArrayList<>();
            //中转list
            List<Integer> transfer = new ArrayList<>();
            for(RoleMenu roleMenu : roleMenuBefore) {
                delete.add(roleMenu.getMenuId());
            }
            transfer.addAll(delete);
            if(menuIdArray.length > 0 && !menuIdArray[0].equals("")){
                for(String menuId : menuIdArray){
                    insert.add(Integer.parseInt(menuId));
                }
            }
            //去掉提交的数据中存在的menuId;
            delete.removeAll(insert);
            if(delete.size() > 0){
                RoleMenuExample roleMenuExample1 = new RoleMenuExample();
                roleMenuExample1.createCriteria().andMenuIdIn(delete).andRoleIdEqualTo(roleId);
                roleMenuMapper.deleteByExample(roleMenuExample1);
                //删除对应的operation权限
                OperationExample operationExample = new OperationExample();
                operationExample.createCriteria().andMenuIdIn(delete);
                List<Operation> operationList = operationMapper.selectByExample(operationExample);
                if(operationList != null && operationList.size() > 0){
                    List<Integer> operationIds = new ArrayList<>();
                    for(Operation operation : operationList){
                        operationIds.add(operation.getId());
                    }
                    RoleOperationExample roleOperationExample = new RoleOperationExample();
                    roleOperationExample.createCriteria().andOperationIdIn(operationIds).andRoleIdEqualTo(roleId);
                    roleOperationMapper.deleteByExample(roleOperationExample);
                }
            }
            //去掉原来存在的记录对应的menuId
            insert.removeAll(transfer);
            if(insert.size() > 0){
                RoleMenu roleMenu = new RoleMenu();
                roleMenu.setRoleId(roleId);
                for(Integer menuId : insert){
                    roleMenu.setMenuId(menuId);
                    roleMenuMapper.insert(roleMenu);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean setRoleOperations(int roleId, String operationIds) {
        try{
            String[] operationIdArray = operationIds.split(",");
            RoleOperationExample roleOperationExample = new RoleOperationExample();
            roleOperationExample.createCriteria().andRoleIdEqualTo(roleId);
            List<RoleOperation> roleOperationBefore =  roleOperationMapper.selectByExample(roleOperationExample);
            //list中存放需要删除的记录对应的menuId
            List<Integer> delete = new ArrayList<>();
            //list中存放需要增加的记录对应的menuId
            List<Integer> insert = new ArrayList<>();
            //中转list
            List<Integer> transfer = new ArrayList<>();
            for(RoleOperation roleOperation : roleOperationBefore) {
                delete.add(roleOperation.getOperationId());
            }
            transfer.addAll(delete);
            if(operationIdArray.length > 0 && !operationIdArray[0].equals("")){
                for(String operationId : operationIdArray){
                    insert.add(Integer.parseInt(operationId));
                }
            }
            //去掉提交的数据中存在的menuId;
            delete.removeAll(insert);
            if(delete.size() > 0 ){
                RoleOperationExample roleOperationExample1 = new RoleOperationExample();
                roleOperationExample1.createCriteria().andOperationIdIn(delete);
                roleOperationMapper.deleteByExample(roleOperationExample1);
            }
            //去掉原来存在的记录对应的menuId
            insert.removeAll(transfer);
            RoleOperation roleOperation = new RoleOperation();
            roleOperation.setRoleId(roleId);
            for(Integer operationId : insert){
                roleOperation.setOperationId(operationId);
                roleOperationMapper.insert(roleOperation);
            }
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Role getRoleByName(String name) {
        RoleExample roleExample = new RoleExample();
        roleExample.createCriteria().andNameEqualTo(name);
        List<Role> roleList = roleMapper.selectByExample(roleExample);
        if(roleList != null && roleList.size() > 0){
            return roleList.get(0);
        }
        return null;
    }

    @Override
    public List<Tree> getMenuTreeWithRole(int roleId) {
        MenuExample menuExample = new MenuExample();
        menuExample.createCriteria().andLevelEqualTo(1).andIsRootEqualTo(0);
        List<Menu> menuList = menuMapper.selectByExample(menuExample);
        List<Integer> menuIds = roleMenuMapper.getMenuIdsByRoleId(roleId);
        List<Tree> treeList = menuListToTreeList(menuList,menuIds);
        return treeList;
    }

    @Override
    public List<Tree> getOperationTreeWithRole(int roleId) {
        List<Tree> treeList = new ArrayList<>();
        List<Integer> menuIds = roleMenuMapper.getMenuIdsByRoleId(roleId);
        if(menuIds != null && menuIds.size() > 0){
            MenuExample menuExample = new MenuExample();
            menuExample.createCriteria().andMenuIdIn(menuIds).andLevelEqualTo(4).andIsRootEqualTo(0);
            List<Menu> menuList = menuMapper.selectByExample(menuExample);
            List<Integer> operationIds = roleOperationMapper.getOperationsIdsByRoleId(roleId);
            if(menuList != null && menuList.size() > 0 ){
                for(Menu menu : menuList){
                    Tree tree = new Tree();
                    tree.setId(menu.getMenuId()+"");
                    tree.setText(menu.getName());
                    tree.setChecked(true);
                    tree.setLevel(1);
                    List<Tree> children = new ArrayList<>();
                    for(Operation operation : menu.getOperationList()){
                        Tree child = new Tree();
                        child.setId(operation.getId()+"");
                        child.setText(operation.getName());
                        child.setLevel(2);
                        if(operationIds != null && operationIds.contains(operation.getId())){
                            child.setChecked(true);
                        }
                        children.add(child);
                    }
                    tree.setChildren(children);
                    treeList.add(tree);
                }
            }
        }
        return treeList;
    }

    @Override
    public List<Role> getActiveRoleList() {
        RoleExample roleExample = new RoleExample();
        roleExample.createCriteria().andStatusEqualTo(1).andIsRootEqualTo(0);
        return roleMapper.selectByExample(roleExample);
    }

    public List<Tree> menuListToTreeList(List<Menu> menuList, List<Integer> menuIds){
        List<Tree> treeList = new ArrayList<>();
        if(menuList != null){
            for(Menu menu : menuList){
                if(menu.getIsRoot() != 0){
                    break;
                }
                Tree tree = new Tree();
                tree = menuToTree(tree, menu);
                if(menuIds != null && menuIds.contains(menu.getMenuId())){
                    tree.setChecked(true);
                }
                if(menu.getChildrenMenu() != null || menu.getLevel() < 4){
                    tree.setChildren(menuListToTreeList(menu.getChildrenMenu(),menuIds));
                }
                treeList.add(tree);
            }
        }
        return treeList;
    }

    public Tree menuToTree(Tree tree,Menu menu){
        tree.setId(menu.getMenuId() + "");
        tree.setText(menu.getName());
        tree.setPid(menu.getParentId() + "");
        tree.setLevel(menu.getLevel());
        return tree;
    }
}
