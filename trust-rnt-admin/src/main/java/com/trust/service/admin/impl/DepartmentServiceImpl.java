package com.trust.service.admin.impl;

import com.github.pagehelper.PageHelper;
import com.trust.common.PageInfo;
import com.trust.dao.admin.DepartmentMapper;
import com.trust.entity.admin.Department;
import com.trust.entity.admin.DepartmentExample;
import com.trust.service.admin.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public PageInfo<Department> getDepartmentByPage(Department department, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        DepartmentExample departmentExample = new DepartmentExample();
        DepartmentExample.Criteria criteria = departmentExample.createCriteria();
        if(department.getName() != null && !department.getName().equals("")){
            criteria.andNameLike("%"+department.getName()+"%");
        }
        if(department.getCode() != null && !department.getCode().equals("")){
            criteria.andCodeLike("%"+department.getCode()+"%");
        }
        if(department.getPid() != null && department.getPid() >= 0){
            String departmentIds = departmentMapper.getChildList(department.getPid());
            String[] idArray = departmentIds.split(",");
            List<Integer> idList = new ArrayList<>();
            for(int i = 0; i < idArray.length; i++){
                if(Integer.parseInt(idArray[i]) > 0){
                    idList.add(Integer.parseInt(idArray[i]));
                }
            }
            criteria.andDepartmentIdIn(idList);
        }
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
