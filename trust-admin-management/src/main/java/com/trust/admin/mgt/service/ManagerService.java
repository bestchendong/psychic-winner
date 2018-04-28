package com.trust.admin.mgt.service;

import com.trust.admin.mgt.common.PageInfo;
import com.trust.admin.mgt.entity.Manager;
import com.trust.admin.mgt.entity.Menu;

import java.util.List;
import java.util.Set;

public interface ManagerService {

    List<Manager> getDepartmentManagerList(int departmentId);

    PageInfo<Manager> getManagerByPage(int pageNo, int pageSize);

    Manager getManagerById(int id);

    Manager getManagerByManagerName(String managerName);

    void add(Manager manager);

    void edit(Manager manager);

    void delete(int id);

    void changeManagerStatus(int managerId, int status);

    List<Manager> getManagerByDepartmentId(int departmentId);

    List<Menu> getMenusOfManager(int managerId);

    Set<String> getAuthorityKeyOfManager(int managerId);
}
