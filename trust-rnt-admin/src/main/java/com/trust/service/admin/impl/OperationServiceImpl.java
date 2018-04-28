package com.trust.service.admin.impl;

import com.github.pagehelper.PageHelper;
import com.trust.common.PageInfo;
import com.trust.dao.admin.MenuMapper;
import com.trust.dao.admin.OperationMapper;
import com.trust.dao.admin.RoleOperationMapper;
import com.trust.entity.admin.*;
import com.trust.service.admin.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OperationServiceImpl implements OperationService {

    @Autowired
    private OperationMapper operationMapper;
    @Autowired
    private RoleOperationMapper roleOperationMapper;
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Operation> getOperationList() {
        OperationExample operationExample = new OperationExample();
        return operationMapper.selectByExample(operationExample);
    }

    @Override
    public Operation getOperationById(int id) {
        return operationMapper.selectByPrimaryKey(id);
    }

    @Override
    public void add(Operation operation) {
        operationMapper.insertSelective(operation);
    }

    @Override
    public void edit(Operation operation) {
        operationMapper.updateByPrimaryKeySelective(operation);
    }

    @Override
    public void delete(int id) {
        operationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Operation getOperationByName(Integer menuId, String name) {
        OperationExample operationExample = new OperationExample();
        operationExample.createCriteria().andMenuIdEqualTo(menuId).andNameEqualTo(name);
        List<Operation> operationList = operationMapper.selectByExample(operationExample);
        if(operationList != null && operationList.size() > 0){
            return operationList.get(0);
        }
        return null;
    }

    @Override
    public List<RoleOperation> getRoleOperationByOperationId(int operationId) {
        RoleOperationExample roleOperationExample = new RoleOperationExample();
        roleOperationExample.createCriteria().andOperationIdEqualTo(operationId);
        return roleOperationMapper.selectByExample(roleOperationExample);
    }

    @Override
    public PageInfo<Operation> geOperationByPage(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        OperationExample operationExample = new OperationExample();
        operationExample.createCriteria().andIsRootNotEqualTo(1);
        List<Operation> operationList = operationMapper.selectByExample(operationExample);
        if( operationList != null ){
            for(int i = 0; i < operationList.size(); i++){
                int menuId = operationList.get(i).getMenuId();
                MenuExample menuExample = new MenuExample();
                menuExample.createCriteria().andMenuIdEqualTo(menuId);
                List<Menu> menuList = menuMapper.selectByExample(menuExample);
                if(menuList != null){
                    operationList.get(i).setParentMenu(menuList.get(0).getName());
                }
            }
        }
        return new PageInfo(operationList);
    }

    @Override
    public List<Menu> getLevelFourMenu() {
        MenuExample menuExample = new MenuExample();
        menuExample.createCriteria().andLevelEqualTo(4);
        return menuMapper.selectByExample(menuExample);
    }

    @Override
    public Operation getOperationByKey(String operationId) {
        OperationExample operationExample = new OperationExample();
        operationExample.createCriteria().andOperationIdEqualTo(operationId);
        List<Operation> operations = operationMapper.selectByExample(operationExample);
        if(operations != null && operations.size() > 0){
            return operations.get(0);
        }
        return null;
    }
}
