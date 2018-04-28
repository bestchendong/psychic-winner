package com.trust.entity.rnt;

import java.io.Serializable;

public class RntOperationDetail implements Serializable {
    private Long operationlogDetailsId;

    private String operationlogDetailsAttributename;

    private String operationlogDetailsAttributedes;

    private String operationlogDetailsBefore;

    private String operationlogDetailsAfter;

    private String operationlogDetailsDes;

    private String operationlogDetailsCode;

    private String operationlogDetailsRemarks;

    private String operationlogDetailsStatus;

    private Long operationlogDetailsLogid;

    private static final long serialVersionUID = 1L;

    public RntOperationDetail(Long operationlogDetailsId, String operationlogDetailsAttributename, String operationlogDetailsAttributedes, String operationlogDetailsBefore, String operationlogDetailsAfter, String operationlogDetailsDes, String operationlogDetailsCode, String operationlogDetailsRemarks, String operationlogDetailsStatus, Long operationlogDetailsLogid) {
        this.operationlogDetailsId = operationlogDetailsId;
        this.operationlogDetailsAttributename = operationlogDetailsAttributename;
        this.operationlogDetailsAttributedes = operationlogDetailsAttributedes;
        this.operationlogDetailsBefore = operationlogDetailsBefore;
        this.operationlogDetailsAfter = operationlogDetailsAfter;
        this.operationlogDetailsDes = operationlogDetailsDes;
        this.operationlogDetailsCode = operationlogDetailsCode;
        this.operationlogDetailsRemarks = operationlogDetailsRemarks;
        this.operationlogDetailsStatus = operationlogDetailsStatus;
        this.operationlogDetailsLogid = operationlogDetailsLogid;
    }

    public RntOperationDetail() {
        super();
    }

    public Long getOperationlogDetailsId() {
        return operationlogDetailsId;
    }

    public void setOperationlogDetailsId(Long operationlogDetailsId) {
        this.operationlogDetailsId = operationlogDetailsId;
    }

    public String getOperationlogDetailsAttributename() {
        return operationlogDetailsAttributename;
    }

    public void setOperationlogDetailsAttributename(String operationlogDetailsAttributename) {
        this.operationlogDetailsAttributename = operationlogDetailsAttributename == null ? null : operationlogDetailsAttributename.trim();
    }

    public String getOperationlogDetailsAttributedes() {
        return operationlogDetailsAttributedes;
    }

    public void setOperationlogDetailsAttributedes(String operationlogDetailsAttributedes) {
        this.operationlogDetailsAttributedes = operationlogDetailsAttributedes == null ? null : operationlogDetailsAttributedes.trim();
    }

    public String getOperationlogDetailsBefore() {
        return operationlogDetailsBefore;
    }

    public void setOperationlogDetailsBefore(String operationlogDetailsBefore) {
        this.operationlogDetailsBefore = operationlogDetailsBefore == null ? null : operationlogDetailsBefore.trim();
    }

    public String getOperationlogDetailsAfter() {
        return operationlogDetailsAfter;
    }

    public void setOperationlogDetailsAfter(String operationlogDetailsAfter) {
        this.operationlogDetailsAfter = operationlogDetailsAfter == null ? null : operationlogDetailsAfter.trim();
    }

    public String getOperationlogDetailsDes() {
        return operationlogDetailsDes;
    }

    public void setOperationlogDetailsDes(String operationlogDetailsDes) {
        this.operationlogDetailsDes = operationlogDetailsDes == null ? null : operationlogDetailsDes.trim();
    }

    public String getOperationlogDetailsCode() {
        return operationlogDetailsCode;
    }

    public void setOperationlogDetailsCode(String operationlogDetailsCode) {
        this.operationlogDetailsCode = operationlogDetailsCode == null ? null : operationlogDetailsCode.trim();
    }

    public String getOperationlogDetailsRemarks() {
        return operationlogDetailsRemarks;
    }

    public void setOperationlogDetailsRemarks(String operationlogDetailsRemarks) {
        this.operationlogDetailsRemarks = operationlogDetailsRemarks == null ? null : operationlogDetailsRemarks.trim();
    }

    public String getOperationlogDetailsStatus() {
        return operationlogDetailsStatus;
    }

    public void setOperationlogDetailsStatus(String operationlogDetailsStatus) {
        this.operationlogDetailsStatus = operationlogDetailsStatus == null ? null : operationlogDetailsStatus.trim();
    }

    public Long getOperationlogDetailsLogid() {
        return operationlogDetailsLogid;
    }

    public void setOperationlogDetailsLogid(Long operationlogDetailsLogid) {
        this.operationlogDetailsLogid = operationlogDetailsLogid;
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
        RntOperationDetail other = (RntOperationDetail) that;
        return (this.getOperationlogDetailsId() == null ? other.getOperationlogDetailsId() == null : this.getOperationlogDetailsId().equals(other.getOperationlogDetailsId()))
            && (this.getOperationlogDetailsAttributename() == null ? other.getOperationlogDetailsAttributename() == null : this.getOperationlogDetailsAttributename().equals(other.getOperationlogDetailsAttributename()))
            && (this.getOperationlogDetailsAttributedes() == null ? other.getOperationlogDetailsAttributedes() == null : this.getOperationlogDetailsAttributedes().equals(other.getOperationlogDetailsAttributedes()))
            && (this.getOperationlogDetailsBefore() == null ? other.getOperationlogDetailsBefore() == null : this.getOperationlogDetailsBefore().equals(other.getOperationlogDetailsBefore()))
            && (this.getOperationlogDetailsAfter() == null ? other.getOperationlogDetailsAfter() == null : this.getOperationlogDetailsAfter().equals(other.getOperationlogDetailsAfter()))
            && (this.getOperationlogDetailsDes() == null ? other.getOperationlogDetailsDes() == null : this.getOperationlogDetailsDes().equals(other.getOperationlogDetailsDes()))
            && (this.getOperationlogDetailsCode() == null ? other.getOperationlogDetailsCode() == null : this.getOperationlogDetailsCode().equals(other.getOperationlogDetailsCode()))
            && (this.getOperationlogDetailsRemarks() == null ? other.getOperationlogDetailsRemarks() == null : this.getOperationlogDetailsRemarks().equals(other.getOperationlogDetailsRemarks()))
            && (this.getOperationlogDetailsStatus() == null ? other.getOperationlogDetailsStatus() == null : this.getOperationlogDetailsStatus().equals(other.getOperationlogDetailsStatus()))
            && (this.getOperationlogDetailsLogid() == null ? other.getOperationlogDetailsLogid() == null : this.getOperationlogDetailsLogid().equals(other.getOperationlogDetailsLogid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOperationlogDetailsId() == null) ? 0 : getOperationlogDetailsId().hashCode());
        result = prime * result + ((getOperationlogDetailsAttributename() == null) ? 0 : getOperationlogDetailsAttributename().hashCode());
        result = prime * result + ((getOperationlogDetailsAttributedes() == null) ? 0 : getOperationlogDetailsAttributedes().hashCode());
        result = prime * result + ((getOperationlogDetailsBefore() == null) ? 0 : getOperationlogDetailsBefore().hashCode());
        result = prime * result + ((getOperationlogDetailsAfter() == null) ? 0 : getOperationlogDetailsAfter().hashCode());
        result = prime * result + ((getOperationlogDetailsDes() == null) ? 0 : getOperationlogDetailsDes().hashCode());
        result = prime * result + ((getOperationlogDetailsCode() == null) ? 0 : getOperationlogDetailsCode().hashCode());
        result = prime * result + ((getOperationlogDetailsRemarks() == null) ? 0 : getOperationlogDetailsRemarks().hashCode());
        result = prime * result + ((getOperationlogDetailsStatus() == null) ? 0 : getOperationlogDetailsStatus().hashCode());
        result = prime * result + ((getOperationlogDetailsLogid() == null) ? 0 : getOperationlogDetailsLogid().hashCode());
        return result;
    }
}