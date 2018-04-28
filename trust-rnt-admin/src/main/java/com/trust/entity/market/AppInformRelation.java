package com.trust.entity.market;

import java.io.Serializable;

public class AppInformRelation implements Serializable {
    private Long appinformRelationId;

    private Long appinformRelationAppinformid;

    private Long appinformRelationUserid;

    private String appinformRelationIsread;

    private String appinformRelationIsdel;

    private String appinformRelationCode;

    private String appinformRelationState;

    private static final long serialVersionUID = 1L;

    public AppInformRelation(Long appinformRelationId, Long appinformRelationAppinformid, Long appinformRelationUserid, String appinformRelationIsread, String appinformRelationIsdel, String appinformRelationCode, String appinformRelationState) {
        this.appinformRelationId = appinformRelationId;
        this.appinformRelationAppinformid = appinformRelationAppinformid;
        this.appinformRelationUserid = appinformRelationUserid;
        this.appinformRelationIsread = appinformRelationIsread;
        this.appinformRelationIsdel = appinformRelationIsdel;
        this.appinformRelationCode = appinformRelationCode;
        this.appinformRelationState = appinformRelationState;
    }

    public AppInformRelation() {
        super();
    }

    public Long getAppinformRelationId() {
        return appinformRelationId;
    }

    public void setAppinformRelationId(Long appinformRelationId) {
        this.appinformRelationId = appinformRelationId;
    }

    public Long getAppinformRelationAppinformid() {
        return appinformRelationAppinformid;
    }

    public void setAppinformRelationAppinformid(Long appinformRelationAppinformid) {
        this.appinformRelationAppinformid = appinformRelationAppinformid;
    }

    public Long getAppinformRelationUserid() {
        return appinformRelationUserid;
    }

    public void setAppinformRelationUserid(Long appinformRelationUserid) {
        this.appinformRelationUserid = appinformRelationUserid;
    }

    public String getAppinformRelationIsread() {
        return appinformRelationIsread;
    }

    public void setAppinformRelationIsread(String appinformRelationIsread) {
        this.appinformRelationIsread = appinformRelationIsread == null ? null : appinformRelationIsread.trim();
    }

    public String getAppinformRelationIsdel() {
        return appinformRelationIsdel;
    }

    public void setAppinformRelationIsdel(String appinformRelationIsdel) {
        this.appinformRelationIsdel = appinformRelationIsdel == null ? null : appinformRelationIsdel.trim();
    }

    public String getAppinformRelationCode() {
        return appinformRelationCode;
    }

    public void setAppinformRelationCode(String appinformRelationCode) {
        this.appinformRelationCode = appinformRelationCode == null ? null : appinformRelationCode.trim();
    }

    public String getAppinformRelationState() {
        return appinformRelationState;
    }

    public void setAppinformRelationState(String appinformRelationState) {
        this.appinformRelationState = appinformRelationState == null ? null : appinformRelationState.trim();
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
        AppInformRelation other = (AppInformRelation) that;
        return (this.getAppinformRelationId() == null ? other.getAppinformRelationId() == null : this.getAppinformRelationId().equals(other.getAppinformRelationId()))
            && (this.getAppinformRelationAppinformid() == null ? other.getAppinformRelationAppinformid() == null : this.getAppinformRelationAppinformid().equals(other.getAppinformRelationAppinformid()))
            && (this.getAppinformRelationUserid() == null ? other.getAppinformRelationUserid() == null : this.getAppinformRelationUserid().equals(other.getAppinformRelationUserid()))
            && (this.getAppinformRelationIsread() == null ? other.getAppinformRelationIsread() == null : this.getAppinformRelationIsread().equals(other.getAppinformRelationIsread()))
            && (this.getAppinformRelationIsdel() == null ? other.getAppinformRelationIsdel() == null : this.getAppinformRelationIsdel().equals(other.getAppinformRelationIsdel()))
            && (this.getAppinformRelationCode() == null ? other.getAppinformRelationCode() == null : this.getAppinformRelationCode().equals(other.getAppinformRelationCode()))
            && (this.getAppinformRelationState() == null ? other.getAppinformRelationState() == null : this.getAppinformRelationState().equals(other.getAppinformRelationState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAppinformRelationId() == null) ? 0 : getAppinformRelationId().hashCode());
        result = prime * result + ((getAppinformRelationAppinformid() == null) ? 0 : getAppinformRelationAppinformid().hashCode());
        result = prime * result + ((getAppinformRelationUserid() == null) ? 0 : getAppinformRelationUserid().hashCode());
        result = prime * result + ((getAppinformRelationIsread() == null) ? 0 : getAppinformRelationIsread().hashCode());
        result = prime * result + ((getAppinformRelationIsdel() == null) ? 0 : getAppinformRelationIsdel().hashCode());
        result = prime * result + ((getAppinformRelationCode() == null) ? 0 : getAppinformRelationCode().hashCode());
        result = prime * result + ((getAppinformRelationState() == null) ? 0 : getAppinformRelationState().hashCode());
        return result;
    }
}