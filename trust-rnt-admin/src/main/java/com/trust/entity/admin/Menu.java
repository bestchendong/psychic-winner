package com.trust.entity.admin;

import com.trust.common.annotation.OperationLogAttr;

import java.io.Serializable;
import java.util.List;

public class Menu implements Serializable {

    @OperationLogAttr(attributeDes="菜单ID")
    private Integer menuId;

    @OperationLogAttr(attributeDes="菜单名称")
    private String name;

    @OperationLogAttr(attributeDes="父级ID")
    private Integer parentId;

    @OperationLogAttr(attributeDes="菜单级别")
    private Integer level;

    @OperationLogAttr(attributeDes="路径")
    private String url;

    @OperationLogAttr(attributeDes="菜单图标")
    private String icon;

    List<Menu> childrenMenu;
	
    private String menuKey;
	
	private Integer isRoot;
	
    List<Operation> operationList;

    private static final long serialVersionUID = 1L;

    public Menu(Integer menuId, String name, Integer parentId, Integer level, String url, String icon, String menuKey, Integer isRoot) {
        this.menuId = menuId;
        this.name = name;
        this.parentId = parentId;
        this.level = level;
        this.url = url;
        this.icon = icon;
        this.menuKey = menuKey;
        this.isRoot = isRoot;
    }

    public Menu() {
        super();
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public List<Menu> getChildrenMenu() {
        return childrenMenu;
    }

    public List<Operation> getOperationList() {
        return operationList;
    }

    public void setChildrenMenu(List<Menu> childrenMenu) {
        this.childrenMenu = childrenMenu;
    }

    public void setOperationList(List<Operation> operationList) {
        this.operationList = operationList;
    }

	public String getMenuKey() {
        return menuKey;
    }

	public void setMenuKey(String menuKey) {
        this.menuKey = menuKey == null ? null : menuKey.trim();
    }

    public Integer getIsRoot() {
        return isRoot;
    }

    public void setIsRoot(Integer isRoot) {
        this.isRoot = isRoot;
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
        Menu other = (Menu) that;
        return (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
            && (this.getMenuKey() == null ? other.getMenuKey() == null : this.getMenuKey().equals(other.getMenuKey()))
            && (this.getIsRoot() == null ? other.getIsRoot() == null : this.getIsRoot().equals(other.getIsRoot()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getMenuKey() == null) ? 0 : getMenuKey().hashCode());
        result = prime * result + ((getIsRoot() == null) ? 0 : getIsRoot().hashCode());
        return result;
    }
}