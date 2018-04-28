package com.trust.service.admin.impl;

import com.github.pagehelper.PageHelper;
import com.trust.common.PageInfo;
import com.trust.dao.admin.*;
import com.trust.entity.admin.*;
import com.trust.service.admin.ManagerService;
import com.trust.utils.admin.AdminUtil;
import com.trust.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Repository
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerMapper managerMapper;
    @Autowired
    private ManagerRoleMapper managerRoleMapper;
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private MenuMapper menuMapper;
    @Autowired
    private OperationMapper operationMapper;

    @Override
    public List<Manager> getDepartmentManagerList(int departmentId) {
        ManagerExample managerExample = new ManagerExample();
        managerExample.createCriteria().andDepartmentIdEqualTo(departmentId).andIsDeleteEqualTo(0);
        return managerMapper.selectByExample(managerExample);
    }

    @Override
    public PageInfo<Manager> getManagerByPage(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        ManagerExample managerExample = new ManagerExample();
        managerExample.createCriteria().andIsDeleteEqualTo(0).andIsRootEqualTo(0);
        List<Manager> managerList = managerMapper.selectByExample(managerExample);
        for(int i = 0; i < managerList.size(); i++){
            if(managerList.get(i).getDepartment() != null){
                managerList.get(i).setCompleteDepartmentName(
                        getCompleteDepartmentName(managerList.get(i).getDepartment()));
            }
        }
        return new PageInfo<Manager>(managerList);
    }

    public String getCompleteDepartmentName(Department department){
        if(department == null){
            return "";
        }
        Department parent = departmentMapper.selectByPrimaryKey(department.getPid());
        if( parent != null){
            return getCompleteDepartmentName(parent) + " / " + department.getName();
        } else {
            return department.getName();
        }
    }

    @Override
    public Manager getManagerById(int id) {
        Manager manager = managerMapper.selectByPrimaryKey(id);
        manager.setCompleteDepartmentName(getCompleteDepartmentName(manager.getDepartment()));
        return manager;
    }

    @Override
    public Manager getManagerByManagerName(String managerName) {
        ManagerExample managerExample = new ManagerExample();
        managerExample.createCriteria().andManagerNameEqualTo(managerName).andIsDeleteEqualTo(0);
        List<Manager> managerList = managerMapper.selectByExample(managerExample);
        if(managerList.size() > 0){
            return managerList.get(0);
        }
        return null;
    }

    @Override
    public void add(Manager manager) {
        manager.setCreateTime(new Date());
        manager.setIsDelete(0);
        if(manager.getPassword() == null || manager.getPassword().equals("")){
            manager.setPassword(MD5Util.md5Encrypt("123456"));
        }
        if(manager.getIsRoot() == null){
            manager.setIsRoot(0);
        }
        managerMapper.insert(manager);
        if(manager.getRoleId() != null && manager.getRoleId() != 0){
            ManagerRole managerRole = new ManagerRole();
            managerRole.setManagerId(manager.getManagerId());
            managerRole.setRoleId(manager.getRoleId());
            managerRoleMapper.insert(managerRole);
        }
    }

    @Override
    public void edit(Manager manager) {
        managerMapper.updateByPrimaryKeySelective(manager);
        ManagerRoleExample managerRoleExample = new ManagerRoleExample();
        managerRoleExample.createCriteria().andManagerIdEqualTo(manager.getManagerId());
        List<ManagerRole> managerRoleList = managerRoleMapper.selectByExample(managerRoleExample);
        //一个用户对应一个角色的处理逻辑
        if(managerRoleList != null && managerRoleList.size() > 0){
            ManagerRole managerRole = managerRoleList.get(0);
            if(manager.getRoleId() != managerRole.getRoleId()){
                managerRole.setRoleId(manager.getRoleId());
                managerRoleMapper.updateByPrimaryKeySelective(managerRole);
            }
        } else {
            if(manager.getRoleId() != null && manager.getRoleId() != 0){
                ManagerRole managerRole = new ManagerRole();
                managerRole.setRoleId(manager.getRoleId());
                managerRole.setManagerId(manager.getManagerId());
                managerRoleMapper.insert(managerRole);
            }
        }
    }

    @Override
    public void delete(int id) {
        Manager manager = new Manager();
        manager.setManagerId(id);
        manager.setIsDelete(1);
        managerMapper.updateByPrimaryKeySelective(manager);
    }

    @Override
    public void changeManagerStatus(int managerId, int status) {
        Manager manager = new Manager();
        manager.setManagerId(managerId);
        manager.setStatus(status);
        managerMapper.updateByPrimaryKeySelective(manager);
    }

    @Override
    public List<Manager> getManagerByDepartmentId(int departmentId) {
        ManagerExample managerExample = new ManagerExample();
        managerExample.createCriteria().andDepartmentIdEqualTo(departmentId).andIsDeleteEqualTo(0);
        return managerMapper.selectByExample(managerExample);
    }

    @Override
    public List<Menu> getMenusOfManager(int managerId) {
        ManagerRoleExample managerRoleExample = new ManagerRoleExample();
        managerRoleExample.createCriteria().andManagerIdEqualTo(managerId);
        List<ManagerRole> managerRoleList = managerRoleMapper.selectByExample(managerRoleExample);
        if(managerRoleList != null && managerRoleList.size() > 0){
            //目前是一个账户对应一个角色
            Role role = roleMapper.selectByPrimaryKey(managerRoleList.get(0).getRoleId());
            if(role.getStatus() == 1){
                List<Menu> roleMenuList =  menuMapper.getRoleMenuByRoleId(role.getRoleId());
                if(roleMenuList != null && roleMenuList.size() > 0){
                    return AdminUtil.changeRoleMenuListToTreeList(roleMenuList);
                }
            }
        } else {
            MenuExample menuExample = new MenuExample();
            menuExample.createCriteria().andIsRootEqualTo(2);
            List<Menu> publicMenu = menuMapper.selectByExample(menuExample);
            if(publicMenu != null && publicMenu.size() > 0){
                return AdminUtil.changeRoleMenuListToTreeList(publicMenu);
            }
        }
        return new ArrayList<Menu>();
    }

    @Override
    public Set<String> getAuthorityKeyOfManager(int managerId) {
        ManagerRoleExample managerRoleExample = new ManagerRoleExample();
        managerRoleExample.createCriteria().andManagerIdEqualTo(managerId);
        List<ManagerRole> managerRoleList = managerRoleMapper.selectByExample(managerRoleExample);
        Set<String> keys = new HashSet<>();
        if(managerRoleList != null && managerRoleList.size() > 0){
            //目前是一个账户对应一个角色
            Role role = roleMapper.selectByPrimaryKey(managerRoleList.get(0).getRoleId());
            if(role.getStatus() == 1){
                //获取操作key
                List<Operation> roleOperationList = operationMapper.getRoleOperationByRoleId(role.getRoleId());
                if(roleOperationList != null && roleOperationList.size() > 0 ){
                    for(Operation operation : roleOperationList){
                        if(operation.getOperationId() != null
                                && !operation.getOperationId().equals("")){
                            keys.add(operation.getOperationId());
                        }
                    }
                }
                //获取菜单权限key
                List<Menu> roleMenuList = menuMapper.getRoleMenuByRoleId(role.getRoleId());
                if(roleMenuList != null && roleMenuList.size() > 0) {
                    for(Menu menu : roleMenuList){
                        if(menu.getMenuKey() != null
                                && !menu.getMenuKey().equals("")){
                            keys.add(menu.getMenuKey());
                        }
                    }
                }
            }
        }
        return keys;
    }
}
