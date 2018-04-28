package com.trust.entity.admin;

import com.trust.common.annotation.OperationLogAttr;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Role implements Serializable {

    @OperationLogAttr(attributeDes="角色ID")
    private Integer roleId;

    @OperationLogAttr(attributeDes="角色名称")
    private String name;

    @OperationLogAttr(attributeDes="是否启用")
    private Integer status;

    @OperationLogAttr(attributeDes="角色描述")
    private String description;

    private Integer isRoot;

    private List<Menu> menuList;

    private Set<String> operationKeys;

    private static final long serialVersionUID = 1L;

    public Role(Integer roleId, String name, Integer status, String description, Integer isRoot) {
        this.roleId = roleId;
        this.name = name;
        this.status = status;
        this.description = description;
        this.isRoot = isRoot;
    }

    public Role() {
        super();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getIsRoot() {
        return isRoot;
    }

    public void setIsRoot(Integer isRoot) {
        this.isRoot = isRoot;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public List<Menu> getMenuList() {

        return menuList;
    }

    public Set<String> getOperationKeys() {
        return operationKeys;
    }

    public void setOperationKeys(Set<String> operationKeys) {
        this.operationKeys = operationKeys;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Role other = (Role) that;
        return (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getIsRoot() == null ? other.getIsRoot() == null : this.getIsRoot().equals(other.getIsRoot()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getIsRoot() == null) ? 0 : getIsRoot().hashCode());
        return result;
    }
}