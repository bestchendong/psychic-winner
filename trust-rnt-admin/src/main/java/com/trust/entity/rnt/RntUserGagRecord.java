package com.trust.entity.rnt;

import java.io.Serializable;
import java.util.Date;

public class RntUserGagRecord implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer gagItem;

    private String gagReason;

    private Integer operatorUserId;

    private Date gagTime;

    private Integer operatorId;

    private static final long serialVersionUID = 1L;

    public RntUserGagRecord(Integer id, Integer userId, Integer gagItem, String gagReason, Integer operatorUserId, Date gagTime, Integer operatorId) {
        this.id = id;
        this.userId = userId;
        this.gagItem = gagItem;
        this.gagReason = gagReason;
        this.operatorUserId = operatorUserId;
        this.gagTime = gagTime;
        this.operatorId = operatorId;
    }

    public RntUserGagRecord() {
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

    public String getGagReason() {
        return gagReason;
    }

    public void setGagReason(String gagReason) {
        this.gagReason = gagReason == null ? null : gagReason.trim();
    }

    public Integer getOperatorUserId() {
        return operatorUserId;
    }

    public void setOperatorUserId(Integer operatorUserId) {
        this.operatorUserId = operatorUserId;
    }

    public Date getGagTime() {
        return gagTime;
    }

    public void setGagTime(Date gagTime) {
        this.gagTime = gagTime;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
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
        RntUserGagRecord other = (RntUserGagRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getGagItem() == null ? other.getGagItem() == null : this.getGagItem().equals(other.getGagItem()))
            && (this.getGagReason() == null ? other.getGagReason() == null : this.getGagReason().equals(other.getGagReason()))
            && (this.getOperatorUserId() == null ? other.getOperatorUserId() == null : this.getOperatorUserId().equals(other.getOperatorUserId()))
            && (this.getGagTime() == null ? other.getGagTime() == null : this.getGagTime().equals(other.getGagTime()))
            && (this.getOperatorId() == null ? other.getOperatorId() == null : this.getOperatorId().equals(other.getOperatorId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getGagItem() == null) ? 0 : getGagItem().hashCode());
        result = prime * result + ((getGagReason() == null) ? 0 : getGagReason().hashCode());
        result = prime * result + ((getOperatorUserId() == null) ? 0 : getOperatorUserId().hashCode());
        result = prime * result + ((getGagTime() == null) ? 0 : getGagTime().hashCode());
        result = prime * result + ((getOperatorId() == null) ? 0 : getOperatorId().hashCode());
        return result;
    }
}