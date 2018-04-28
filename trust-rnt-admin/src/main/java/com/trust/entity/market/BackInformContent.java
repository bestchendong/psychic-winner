package com.trust.entity.market;

import java.io.Serializable;
import java.util.Date;

public class BackInformContent implements Serializable {
    private Long backinformId;

    private String backinformTitle;

    private String backinformType;

    private Long backinformManagerid;

    private String backinformManagername;

    private Date backinformPublishtime;

    private Date backinformCreatetime;

    private String backinformUrl;

    private String backinformContent;

    private String backinformCode;

    private String backinformIsdel;

    private String backinformState;

    private String backinformRemark;

    private static final long serialVersionUID = 1L;

    public BackInformContent(Long backinformId, String backinformTitle, String backinformType, Long backinformManagerid, String backinformManagername, Date backinformPublishtime, Date backinformCreatetime, String backinformUrl, String backinformContent, String backinformCode, String backinformIsdel, String backinformState, String backinformRemark) {
        this.backinformId = backinformId;
        this.backinformTitle = backinformTitle;
        this.backinformType = backinformType;
        this.backinformManagerid = backinformManagerid;
        this.backinformManagername = backinformManagername;
        this.backinformPublishtime = backinformPublishtime;
        this.backinformCreatetime = backinformCreatetime;
        this.backinformUrl = backinformUrl;
        this.backinformContent = backinformContent;
        this.backinformCode = backinformCode;
        this.backinformIsdel = backinformIsdel;
        this.backinformState = backinformState;
        this.backinformRemark = backinformRemark;
    }

    public BackInformContent() {
        super();
    }

    public Long getBackinformId() {
        return backinformId;
    }

    public void setBackinformId(Long backinformId) {
        this.backinformId = backinformId;
    }

    public String getBackinformTitle() {
        return backinformTitle;
    }

    public void setBackinformTitle(String backinformTitle) {
        this.backinformTitle = backinformTitle == null ? null : backinformTitle.trim();
    }

    public String getBackinformType() {
        return backinformType;
    }

    public void setBackinformType(String backinformType) {
        this.backinformType = backinformType == null ? null : backinformType.trim();
    }

    public Long getBackinformManagerid() {
        return backinformManagerid;
    }

    public void setBackinformManagerid(Long backinformManagerid) {
        this.backinformManagerid = backinformManagerid;
    }

    public String getBackinformManagername() {
        return backinformManagername;
    }

    public void setBackinformManagername(String backinformManagername) {
        this.backinformManagername = backinformManagername == null ? null : backinformManagername.trim();
    }

    public Date getBackinformPublishtime() {
        return backinformPublishtime;
    }

    public void setBackinformPublishtime(Date backinformPublishtime) {
        this.backinformPublishtime = backinformPublishtime;
    }

    public Date getBackinformCreatetime() {
        return backinformCreatetime;
    }

    public void setBackinformCreatetime(Date backinformCreatetime) {
        this.backinformCreatetime = backinformCreatetime;
    }

    public String getBackinformUrl() {
        return backinformUrl;
    }

    public void setBackinformUrl(String backinformUrl) {
        this.backinformUrl = backinformUrl == null ? null : backinformUrl.trim();
    }

    public String getBackinformContent() {
        return backinformContent;
    }

    public void setBackinformContent(String backinformContent) {
        this.backinformContent = backinformContent == null ? null : backinformContent.trim();
    }

    public String getBackinformCode() {
        return backinformCode;
    }

    public void setBackinformCode(String backinformCode) {
        this.backinformCode = backinformCode == null ? null : backinformCode.trim();
    }

    public String getBackinformIsdel() {
        return backinformIsdel;
    }

    public void setBackinformIsdel(String backinformIsdel) {
        this.backinformIsdel = backinformIsdel == null ? null : backinformIsdel.trim();
    }

    public String getBackinformState() {
        return backinformState;
    }

    public void setBackinformState(String backinformState) {
        this.backinformState = backinformState == null ? null : backinformState.trim();
    }

    public String getBackinformRemark() {
        return backinformRemark;
    }

    public void setBackinformRemark(String backinformRemark) {
        this.backinformRemark = backinformRemark == null ? null : backinformRemark.trim();
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
        BackInformContent other = (BackInformContent) that;
        return (this.getBackinformId() == null ? other.getBackinformId() == null : this.getBackinformId().equals(other.getBackinformId()))
            && (this.getBackinformTitle() == null ? other.getBackinformTitle() == null : this.getBackinformTitle().equals(other.getBackinformTitle()))
            && (this.getBackinformType() == null ? other.getBackinformType() == null : this.getBackinformType().equals(other.getBackinformType()))
            && (this.getBackinformManagerid() == null ? other.getBackinformManagerid() == null : this.getBackinformManagerid().equals(other.getBackinformManagerid()))
            && (this.getBackinformManagername() == null ? other.getBackinformManagername() == null : this.getBackinformManagername().equals(other.getBackinformManagername()))
            && (this.getBackinformPublishtime() == null ? other.getBackinformPublishtime() == null : this.getBackinformPublishtime().equals(other.getBackinformPublishtime()))
            && (this.getBackinformCreatetime() == null ? other.getBackinformCreatetime() == null : this.getBackinformCreatetime().equals(other.getBackinformCreatetime()))
            && (this.getBackinformUrl() == null ? other.getBackinformUrl() == null : this.getBackinformUrl().equals(other.getBackinformUrl()))
            && (this.getBackinformContent() == null ? other.getBackinformContent() == null : this.getBackinformContent().equals(other.getBackinformContent()))
            && (this.getBackinformCode() == null ? other.getBackinformCode() == null : this.getBackinformCode().equals(other.getBackinformCode()))
            && (this.getBackinformIsdel() == null ? other.getBackinformIsdel() == null : this.getBackinformIsdel().equals(other.getBackinformIsdel()))
            && (this.getBackinformState() == null ? other.getBackinformState() == null : this.getBackinformState().equals(other.getBackinformState()))
            && (this.getBackinformRemark() == null ? other.getBackinformRemark() == null : this.getBackinformRemark().equals(other.getBackinformRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBackinformId() == null) ? 0 : getBackinformId().hashCode());
        result = prime * result + ((getBackinformTitle() == null) ? 0 : getBackinformTitle().hashCode());
        result = prime * result + ((getBackinformType() == null) ? 0 : getBackinformType().hashCode());
        result = prime * result + ((getBackinformManagerid() == null) ? 0 : getBackinformManagerid().hashCode());
        result = prime * result + ((getBackinformManagername() == null) ? 0 : getBackinformManagername().hashCode());
        result = prime * result + ((getBackinformPublishtime() == null) ? 0 : getBackinformPublishtime().hashCode());
        result = prime * result + ((getBackinformCreatetime() == null) ? 0 : getBackinformCreatetime().hashCode());
        result = prime * result + ((getBackinformUrl() == null) ? 0 : getBackinformUrl().hashCode());
        result = prime * result + ((getBackinformContent() == null) ? 0 : getBackinformContent().hashCode());
        result = prime * result + ((getBackinformCode() == null) ? 0 : getBackinformCode().hashCode());
        result = prime * result + ((getBackinformIsdel() == null) ? 0 : getBackinformIsdel().hashCode());
        result = prime * result + ((getBackinformState() == null) ? 0 : getBackinformState().hashCode());
        result = prime * result + ((getBackinformRemark() == null) ? 0 : getBackinformRemark().hashCode());
        return result;
    }
}