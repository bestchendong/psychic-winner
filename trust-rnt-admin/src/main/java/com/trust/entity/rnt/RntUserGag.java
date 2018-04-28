package com.trust.entity.rnt;

import java.io.Serializable;

public class RntUserGag implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer gagItem;

    private static final long serialVersionUID = 1L;

    public RntUserGag(Integer id, Integer userId, Integer gagItem) {
        this.id = id;
        this.userId = userId;
        this.gagItem = gagItem;
    }

    public RntUserGag() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGagItem() {
        return gagItem;
    }

    public void setGagItem(Integer gagItem) {
        this.gagItem = gagItem;
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
        RntUserGag other = (RntUserGag) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getGagItem() == null ? other.getGagItem() == null : this.getGagItem().equals(other.getGagItem()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getGagItem() == null) ? 0 : getGagItem().hashCode());
        return result;
    }
}