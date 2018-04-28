package com.trust.admin.mgt.service.impl;

import com.github.pagehelper.PageHelper;
import com.trust.admin.mgt.common.PageInfo;
import com.trust.admin.mgt.dao.DepartmentMapper;
import com.trust.admin.mgt.entity.Department;
import com.trust.admin.mgt.entity.DepartmentExample;
import com.trust.admin.mgt.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Repository
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getDepartmentList() {
        DepartmentExample departmentExample = new DepartmentExample();
        return departmentMapper.selectByExample(departmentExample);
    }

    @Override
    public Department getDepartmentById(int id) {
        Department department = departmentMapper.selectByPrimaryKey(id);
        department.setParentDepartment(getParentDepartment(department));
        return department;
    }

    @Override
    public void add(Department department) {
        department.setCreateTime(new Date());
        departmentMapper.insertSelective(department);
    }

    @Override
    public void edit(Department department) {
        departmentMapper.updateByPrimaryKeySelective(department);
    }

    @Override
    public void delete(int id) {
        departmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Department> getDepartmentTree() {
        DepartmentExample departmentExample = new DepartmentExample();
        departmentExample.createCriteria().andLevelEqualTo(1);
        return departmentMapper.selectByExample(departmentExample);
    }

    @Override
    public PageInfo<Department> getDepartmentByPage(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        DepartmentExample departmentExample = new DepartmentExample();
        List<Department> departmentList = departmentMapper.selectByExample(departmentExample);
        if(departmentList != null){
           for(int i = 0; i < departmentList.size(); i++){
                departmentList.get(i).setParentDepartment(getParentDepartment(departmentList.get(i)));
            }
        }
        return new PageInfo<Department>(departmentList);
    }

    @Override
    public Department getDepartmentByName(String name) {
        DepartmentExample departmentExample = new DepartmentExample();
        departmentExample.createCriteria().andNameEqualTo(name);
        List<Department> departmentList = departmentMapper.selectByExample(departmentExample);
        if(departmentList != null && departmentList.size() > 0){
            return  departmentList.get(0);
        }
        return null;
    }

    @Override
    public List<Department> getDepartmentChildren(int pid) {
        DepartmentExample departmentExample = new DepartmentExample();
        departmentExample.createCriteria().andPidEqualTo(pid);
        return departmentMapper.selectByExample(departmentExample);
    }

    public String getParentDepartment(Department department){
        Department parent = departmentMapper.selectByPrimaryKey(department.getPid());
        if( parent != null){
            if(parent.getPid() == 0){
                return parent.getName();
            }
            return getParentDepartment(parent) + " / " + parent.getName();
        } else {
            return "";
        }
    }
}
