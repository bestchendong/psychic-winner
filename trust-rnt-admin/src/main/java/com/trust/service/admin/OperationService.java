package com.trust.service.admin;

import com.trust.common.PageInfo;
import com.trust.entity.admin.Menu;
import com.trust.entity.admin.Operation;
import com.trust.entity.admin.RoleOperation;

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
