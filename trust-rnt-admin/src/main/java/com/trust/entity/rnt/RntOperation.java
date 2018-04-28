package com.trust.entity.rnt;

import java.io.Serializable;
import java.util.Date;

public class RntOperation implements Serializable {
    private Long operationlogId;

    private Long operationlogUserid;

    private String operationlogUsername;

    private Date operationlogTime;

    private String operationlogModulename;

    private String operationlogCategory;

    private String operationlogResult;

    private String operationlogDes;

    private String operationlogChecklevel;

    private String operationlogIp;

    private String operationlogCode;

    private String operationlogRemarks;

    private String operationlogStatus;

    private static final long serialVersionUID = 1L;

    public RntOperation(Long operationlogId, Long operationlogUserid, String operationlogUsername, Date operationlogTime, String operationlogModulename, String operationlogCategory, String operationlogResult, String operationlogDes, String operationlogChecklevel, String operationlogIp, String operationlogCode, String operationlogRemarks, String operationlogStatus) {
        this.operationlogId = operationlogId;
        this.operationlogUserid = operationlogUserid;
        this.operationlogUsername = operationlogUsername;
        this.operationlogTime = operationlogTime;
        this.operationlogModulename = operationlogModulename;
        this.operationlogCategory = operationlogCategory;
        this.operationlogResult = operationlogResult;
        this.operationlogDes = operationlogDes;
        this.operationlogChecklevel = operationlogChecklevel;
        this.operationlogIp = operationlogIp;
        this.operationlogCode = operationlogCode;
        this.operationlogRemarks = operationlogRemarks;
        this.operationlogStatus = operationlogStatus;
    }

    public RntOperation() {
        super();
    }

    public Long getOperationlogId() {
        return operationlogId;
    }

    public void setOperationlogId(Long operationlogId) {
        this.operationlogId = operationlogId;
    }

    public Long getOperationlogUserid() {
        return operationlogUserid;
    }

    public void setOperationlogUserid(Long operationlogUserid) {
        this.operationlogUserid = operationlogUserid;
    }

    public String getOperationlogUsername() {
        return operationlogUsername;
    }

    public void setOperationlogUsername(String operationlogUsername) {
        this.operationlogUsername = operationlogUsername == null ? null : operationlogUsername.trim();
    }

    public Date getOperationlogTime() {
        return operationlogTime;
    }

    public void setOperationlogTime(Date operationlogTime) {
        this.operationlogTime = operationlogTime;
    }

    public String getOperationlogModulename() {
        return operationlogModulename;
    }

    public void setOperationlogModulename(String operationlogModulename) {
        this.operationlogModulename = operationlogModulename == null ? null : operationlogModulename.trim();
    }

    public String getOperationlogCategory() {
        return operationlogCategory;
    }

    public void setOperationlogCategory(String operationlogCategory) {
        this.operationlogCategory = operationlogCategory == null ? null : operationlogCategory.trim();
    }

    public String getOperationlogResult() {
        return operationlogResult;
    }

    public void setOperationlogResult(String operationlogResult) {
        this.operationlogResult = operationlogResult == null ? null : operationlogResult.trim();
    }

    public String getOperationlogDes() {
        return operationlogDes;
    }

    public void setOperationlogDes(String operationlogDes) {
        this.operationlogDes = operationlogDes == null ? null : operationlogDes.trim();
    }

    public String getOperationlogChecklevel() {
        return operationlogChecklevel;
    }

    public void setOperationlogChecklevel(String operationlogChecklevel) {
        this.operationlogChecklevel = operationlogChecklevel == null ? null : operationlogChecklevel.trim();
    }

    public String getOperationlogIp() {
        return operationlogIp;
    }

    public void setOperationlogIp(String operationlogIp) {
        this.operationlogIp = operationlogIp == null ? null : operationlogIp.trim();
    }

    public String getOperationlogCode() {
        return operationlogCode;
    }

    public void setOperationlogCode(String operationlogCode) {
        this.operationlogCode = operationlogCode == null ? null : operationlogCode.trim();
    }

    public String getOperationlogRemarks() {
        return operationlogRemarks;
    }

    public void setOperationlogRemarks(String operationlogRemarks) {
        this.operationlogRemarks = operationlogRemarks == null ? null : operationlogRemarks.trim();
    }

    public String getOperationlogStatus() {
        return operationlogStatus;
    }

    public void setOperationlogStatus(String operationlogStatus) {
        this.operationlogStatus = operationlogStatus == null ? null : operationlogStatus.trim();
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
        RntOperation other = (RntOperation) that;
        return (this.getOperationlogId() == null ? other.getOperationlogId() == null : this.getOperationlogId().equals(other.getOperationlogId()))
            && (this.getOperationlogUserid() == null ? other.getOperationlogUserid() == null : this.getOperationlogUserid().equals(other.getOperationlogUserid()))
            && (this.getOperationlogUsername() == null ? other.getOperationlogUsername() == null : this.getOperationlogUsername().equals(other.getOperationlogUsername()))
            && (this.getOperationlogTime() == null ? other.getOperationlogTime() == null : this.getOperationlogTime().equals(other.getOperationlogTime()))
            && (this.getOperationlogModulename() == null ? other.getOperationlogModulename() == null : this.getOperationlogModulename().equals(other.getOperationlogModulename()))
            && (this.getOperationlogCategory() == null ? other.getOperationlogCategory() == null : this.getOperationlogCategory().equals(other.getOperationlogCategory()))
            && (this.getOperationlogResult() == null ? other.getOperationlogResult() == null : this.getOperationlogResult().equals(other.getOperationlogResult()))
            && (this.getOperationlogDes() == null ? other.getOperationlogDes() == null : this.getOperationlogDes().equals(other.getOperationlogDes()))
            && (this.getOperationlogChecklevel() == null ? other.getOperationlogChecklevel() == null : this.getOperationlogChecklevel().equals(other.getOperationlogChecklevel()))
            && (this.getOperationlogIp() == null ? other.getOperationlogIp() == null : this.getOperationlogIp().equals(other.getOperationlogIp()))
            && (this.getOperationlogCode() == null ? other.getOperationlogCode() == null : this.getOperationlogCode().equals(other.getOperationlogCode()))
            && (this.getOperationlogRemarks() == null ? other.getOperationlogRemarks() == null : this.getOperationlogRemarks().equals(other.getOperationlogRemarks()))
            && (this.getOperationlogStatus() == null ? other.getOperationlogStatus() == null : this.getOperationlogStatus().equals(other.getOperationlogStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOperationlogId() == null) ? 0 : getOperationlogId().hashCode());
        result = prime * result + ((getOperationlogUserid() == null) ? 0 : getOperationlogUserid().hashCode());
        result = prime * result + ((getOperationlogUsername() == null) ? 0 : getOperationlogUsername().hashCode());
        result = prime * result + ((getOperationlogTime() == null) ? 0 : getOperationlogTime().hashCode());
        result = prime * result + ((getOperationlogModulename() == null) ? 0 : getOperationlogModulename().hashCode());
        result = prime * result + ((getOperationlogCategory() == null) ? 0 : getOperationlogCategory().hashCode());
        result = prime * result + ((getOperationlogResult() == null) ? 0 : getOperationlogResult().hashCode());
        result = prime * result + ((getOperationlogDes() == null) ? 0 : getOperationlogDes().hashCode());
        result = prime * result + ((getOperationlogChecklevel() == null) ? 0 : getOperationlogChecklevel().hashCode());
        result = prime * result + ((getOperationlogIp() == null) ? 0 : getOperationlogIp().hashCode());
        result = prime * result + ((getOperationlogCode() == null) ? 0 : getOperationlogCode().hashCode());
        result = prime * result + ((getOperationlogRemarks() == null) ? 0 : getOperationlogRemarks().hashCode());
        result = prime * result + ((getOperationlogStatus() == null) ? 0 : getOperationlogStatus().hashCode());
        return result;
    }
}