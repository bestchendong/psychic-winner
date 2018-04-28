package com.trust.service.admin;

import com.trust.common.PageInfo;
import com.trust.entity.admin.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> getDepartmentList();

    Department getDepartmentById(int id);

    void add(Department department);

    void edit(Department department);

    void delete(int id);

    List<Department> getDepartmentTree();

    PageInfo<Department> getDepartmentByPage(Department department, int pageNo, int pageSize);

    Department getDepartmentByName(String name);

    List<Department> getDepartmentChildren(int pid);
}
