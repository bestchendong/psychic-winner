package com.trust.admin.mgt.service;

import com.trust.admin.mgt.common.PageInfo;
import com.trust.admin.mgt.entity.Menu;
import com.trust.admin.mgt.entity.Operation;
import com.trust.admin.mgt.entity.RoleOperation;

import java.util.List;

public interface OperationService {

    List<Operation> getOperationList();

    Operation getOperationById(int id);

    void add(Operation operation);

    void edit(Operation operation);

    void delete(int id);

    Operation getOperationByName(Integer menuId, String name);

    List<RoleOperation> getRoleOperationByOperationId(int operationId);

    PageInfo<Operation> geOperationByPage(int pageNo, int pageSize);

    List<Menu> getLevelFourMenu();

    Operation getOperationByKey(String operationId);
}
