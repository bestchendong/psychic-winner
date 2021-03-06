package com.trust.entity.admin;

import com.trust.common.annotation.OperationLogAttr;

import java.io.Serializable;
import java.util.Date;

public class Manager implements Serializable {
    @OperationLogAttr(attributeDes="账号ID")
    private Integer managerId;

    @OperationLogAttr(attributeDes="账号名称")
    private String managerName;

    @OperationLogAttr(attributeDes="密码")
    private String password;

    @OperationLogAttr(attributeDes="真实姓名")
    private String realName;

    @OperationLogAttr(attributeDes="电话号码")
    private String phoneNumber;

    @OperationLogAttr(attributeDes="是否启用")
    private Integer status;

    @OperationLogAttr(attributeDes="所属部门ID")
    private Integer departmentId;

    private Department department;

    private String completeDepartmentName;

    @OperationLogAttr(attributeDes="邮箱")
    private String email;

    @OperationLogAttr(attributeDes="创建时间")
    private Date createTime;

    @OperationLogAttr(attributeDes="最后登录时间")
    private Date lastLoginTime;

    private Integer isDelete;
	
	private Integer isRoot;

    private Integer roleId;

    private Role role;

    private static final long serialVersionUID = 1L;

    public Manager(Integer managerId, String managerName, String password, String realName, String phoneNumber, Integer status, Integer departmentId, String email, Date createTime, Date lastLoginTime, Integer isDelete, Integer isRoot) {
        this.managerId = managerId;
        this.managerName = managerName;
        this.password = password;
        this.realName = realName;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.departmentId = departmentId;
        this.email = email;
        this.createTime = createTime;
        this.lastLoginTime = lastLoginTime;
        this.isDelete = isDelete;
        this.isRoot = isRoot;
    }

    public Manager() {
        super();
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName == null ? null : managerName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getCompleteDepartmentName() {
        return completeDepartmentName;
    }

    public void setCompleteDepartmentName(String completeDepartmentName) {

        this.completeDepartmentName = completeDepartmentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Integer getIsRoot() {
        return isRoot;
    }

    public void setIsRoot(Integer isRoot) {
        this.isRoot = isRoot;
    }

    public Role getRole() {

        return role;
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
        Manager other = (Manager) that;
        return (this.getManagerId() == null ? other.getManagerId() == null : this.getManagerId().equals(other.getManagerId()))
            && (this.getManagerName() == null ? other.getManagerName() == null : this.getManagerName().equals(other.getManagerName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDepartmentId() == null ? other.getDepartmentId() == null : this.getDepartmentId().equals(other.getDepartmentId()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getLastLoginTime() == null ? other.getLastLoginTime() == null : this.getLastLoginTime().equals(other.getLastLoginTime()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getIsRoot() == null ? other.getIsRoot() == null : this.getIsRoot().equals(other.getIsRoot()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getManagerId() == null) ? 0 : getManagerId().hashCode());
        result = prime * result + ((getManagerName() == null) ? 0 : getManagerName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDepartmentId() == null) ? 0 : getDepartmentId().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getLastLoginTime() == null) ? 0 : getLastLoginTime().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getIsRoot() == null) ? 0 : getIsRoot().hashCode());
        return result;
    }
}