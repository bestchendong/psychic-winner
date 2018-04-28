package com.trust.admin.mgt.service;

import com.trust.admin.mgt.common.PageInfo;
import com.trust.admin.mgt.entity.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> getDepartmentList();

    Department getDepartmentById(int id);

    void add(Department department);

    void edit(Department department);

    void delete(int id);

    List<Department> getDepartmentTree();

    PageInfo<Department> getDepartmentByPage(int pageNo, int pageSize);

    Department getDepartmentByName(String name);

    List<Department> getDepartmentChildren(int pid);
}
