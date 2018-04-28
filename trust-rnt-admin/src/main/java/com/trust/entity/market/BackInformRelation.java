package com.trust.entity.market;

import java.io.Serializable;

public class BackInformRelation implements Serializable {
    private Long backinformRelationId;

    private Long backinformRelationBackinformid;

    private Long backinformRelationManagerid;

    private String backinformRelationIsread;

    private String backinformRelationIsdel;

    private String backinformRelationCode;

    private String backinformRelationState;

    private static final long serialVersionUID = 1L;

    public BackInformRelation(Long backinformRelationId, Long backinformRelationBackinformid, Long backinformRelationManagerid, String backinformRelationIsread, String backinformRelationIsdel, String backinformRelationCode, String backinformRelationState) {
        this.backinformRelationId = backinformRelationId;
        this.backinformRelationBackinformid = backinformRelationBackinformid;
        this.backinformRelationManagerid = backinformRelationManagerid;
        this.backinformRelationIsread = backinformRelationIsread;
        this.backinformRelationIsdel = backinformRelationIsdel;
        this.backinformRelationCode = backinformRelationCode;
        this.backinformRelationState = backinformRelationState;
    }

    public BackInformRelation() {
        super();
    }

    public Long getBackinformRelationId() {
        return backinformRelationId;
    }

    public void setBackinformRelationId(Long backinformRelationId) {
        this.backinformRelationId = backinformRelationId;
    }

    public Long getBackinformRelationBackinformid() {
        return backinformRelationBackinformid;
    }

    public void setBackinformRelationBackinformid(Long backinformRelationBackinformid) {
        this.backinformRelationBackinformid = backinformRelationBackinformid;
    }

    public Long getBackinformRelationManagerid() {
        return backinformRelationManagerid;
    }

    public void setBackinformRelationManagerid(Long backinformRelationManagerid) {
        this.backinformRelationManagerid = backinformRelationManagerid;
    }

    public String getBackinformRelationIsread() {
        return backinformRelationIsread;
    }

    public void setBackinformRelationIsread(String backinformRelationIsread) {
        this.backinformRelationIsread = backinformRelationIsread == null ? null : backinformRelationIsread.trim();
    }

    public String getBackinformRelationIsdel() {
        return backinformRelationIsdel;
    }

    public void setBackinformRelationIsdel(String backinformRelationIsdel) {
        this.backinformRelationIsdel = backinformRelationIsdel == null ? null : backinformRelationIsdel.trim();
    }

    public String getBackinformRelationCode() {
        return backinformRelationCode;
    }

    public void setBackinformRelationCode(String backinformRelationCode) {
        this.backinformRelationCode = backinformRelationCode == null ? null : backinformRelationCode.trim();
    }

    public String getBackinformRelationState() {
        return backinformRelationState;
    }

    public void setBackinformRelationState(String backinformRelationState) {
        this.backinformRelationState = backinformRelationState == null ? null : backinformRelationState.trim();
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
        BackInformRelation other = (BackInformRelation) that;
        return (this.getBackinformRelationId() == null ? other.getBackinformRelationId() == null : this.getBackinformRelationId().equals(other.getBackinformRelationId()))
            && (this.getBackinformRelationBackinformid() == null ? other.getBackinformRelationBackinformid() == null : this.getBackinformRelationBackinformid().equals(other.getBackinformRelationBackinformid()))
            && (this.getBackinformRelationManagerid() == null ? other.getBackinformRelationManagerid() == null : this.getBackinformRelationManagerid().equals(other.getBackinformRelationManagerid()))
            && (this.getBackinformRelationIsread() == null ? other.getBackinformRelationIsread() == null : this.getBackinformRelationIsread().equals(other.getBackinformRelationIsread()))
            && (this.getBackinformRelationIsdel() == null ? other.getBackinformRelationIsdel() == null : this.getBackinformRelationIsdel().equals(other.getBackinformRelationIsdel()))
            && (this.getBackinformRelationCode() == null ? other.getBackinformRelationCode() == null : this.getBackinformRelationCode().equals(other.getBackinformRelationCode()))
            && (this.getBackinformRelationState() == null ? other.getBackinformRelationState() == null : this.getBackinformRelationState().equals(other.getBackinformRelationState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBackinformRelationId() == null) ? 0 : getBackinformRelationId().hashCode());
        result = prime * result + ((getBackinformRelationBackinformid() == null) ? 0 : getBackinformRelationBackinformid().hashCode());
        result = prime * result + ((getBackinformRelationManagerid() == null) ? 0 : getBackinformRelationManagerid().hashCode());
        result = prime * result + ((getBackinformRelationIsread() == null) ? 0 : getBackinformRelationIsread().hashCode());
        result = prime * result + ((getBackinformRelationIsdel() == null) ? 0 : getBackinformRelationIsdel().hashCode());
        result = prime * result + ((getBackinformRelationCode() == null) ? 0 : getBackinformRelationCode().hashCode());
        result = prime * result + ((getBackinformRelationState() == null) ? 0 : getBackinformRelationState().hashCode());
        return result;
    }
}