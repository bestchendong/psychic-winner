package com.trust.entity.market;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@ApiModel(description = "app推送消息")
public class AppInformContent implements Serializable {

    @ApiModelProperty(value = "消息id")
    private Long appinformId;

    @ApiModelProperty(value = "消息标题")
    private String appinformTitle;

    @ApiModelProperty(value = "消息类型(链接link/活动event)")
    private String appinformType;

    @ApiModelProperty(value = "发布人id")
    private Long appinformManagerid;

    @ApiModelProperty(value = "发布人")
    private String appinformManagername;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "发布时间")
    private Date appinformPublishtime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "创建时间")
    private Date appinformCreatetime;

    @ApiModelProperty(value = "消息链接")
    private String appinformUrl;

    @ApiModelProperty(value = "消息内容")
    private String appinformContent;

    @ApiModelProperty(value = "消息编码(接收人类别：全部all/单个id)")
    private String appinformCode;

    @ApiModelProperty(value = "是否删除(是y/否n)")
    private String appinformIsdel;

    @ApiModelProperty(value = "消息状态")
    private String appinformState;

    @ApiModelProperty(value = "备注")
    private String appinformRemark;

    private static final long serialVersionUID = 1L;

    public AppInformContent(Long appinformId, String appinformTitle, String appinformType, Long appinformManagerid, String appinformManagername, Date appinformPublishtime, Date appinformCreatetime, String appinformUrl, String appinformContent, String appinformCode, String appinformIsdel, String appinformState, String appinformRemark) {
        this.appinformId = appinformId;
        this.appinformTitle = appinformTitle;
        this.appinformType = appinformType;
        this.appinformManagerid = appinformManagerid;
        this.appinformManagername = appinformManagername;
        this.appinformPublishtime = appinformPublishtime;
        this.appinformCreatetime = appinformCreatetime;
        this.appinformUrl = appinformUrl;
        this.appinformContent = appinformContent;
        this.appinformCode = appinformCode;
        this.appinformIsdel = appinformIsdel;
        this.appinformState = appinformState;
        this.appinformRemark = appinformRemark;
    }

    public AppInformContent() {
        super();
    }

    public Long getAppinformId() {
        return appinformId;
    }

    public void setAppinformId(Long appinformId) {
        this.appinformId = appinformId;
    }

    public String getAppinformTitle() {
        return appinformTitle;
    }

    public void setAppinformTitle(String appinformTitle) {
        this.appinformTitle = appinformTitle == null ? null : appinformTitle.trim();
    }

    public String getAppinformType() {
        return appinformType;
    }

    public void setAppinformType(String appinformType) {
        this.appinformType = appinformType == null ? null : appinformType.trim();
    }

    public Long getAppinformManagerid() {
        return appinformManagerid;
    }

    public void setAppinformManagerid(Long appinformManagerid) {
        this.appinformManagerid = appinformManagerid;
    }

    public String getAppinformManagername() {
        return appinformManagername;
    }

    public void setAppinformManagername(String appinformManagername) {
        this.appinformManagername = appinformManagername == null ? null : appinformManagername.trim();
    }

    public Date getAppinformPublishtime() {
        return appinformPublishtime;
    }

    public void setAppinformPublishtime(Date appinformPublishtime) {
        this.appinformPublishtime = appinformPublishtime;
    }

    public Date getAppinformCreatetime() {
        return appinformCreatetime;
    }

    public void setAppinformCreatetime(Date appinformCreatetime) {
        this.appinformCreatetime = appinformCreatetime;
    }

    public String getAppinformUrl() {
        return appinformUrl;
    }

    public void setAppinformUrl(String appinformUrl) {
        this.appinformUrl = appinformUrl == null ? null : appinformUrl.trim();
    }

    public String getAppinformContent() {
        return appinformContent;
    }

    public void setAppinformContent(String appinformContent) {
        this.appinformContent = appinformContent == null ? null : appinformContent.trim();
    }

    public String getAppinformCode() {
        return appinformCode;
    }

    public void setAppinformCode(String appinformCode) {
        this.appinformCode = appinformCode == null ? null : appinformCode.trim();
    }

    public String getAppinformIsdel() {
        return appinformIsdel;
    }

    public void setAppinformIsdel(String appinformIsdel) {
        this.appinformIsdel = appinformIsdel == null ? null : appinformIsdel.trim();
    }

    public String getAppinformState() {
        return appinformState;
    }

    public void setAppinformState(String appinformState) {
        this.appinformState = appinformState == null ? null : appinformState.trim();
    }

    public String getAppinformRemark() {
        return appinformRemark;
    }

    public void setAppinformRemark(String appinformRemark) {
        this.appinformRemark = appinformRemark == null ? null : appinformRemark.trim();
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
        AppInformContent other = (AppInformContent) that;
        return (this.getAppinformId() == null ? other.getAppinformId() == null : this.getAppinformId().equals(other.getAppinformId()))
            && (this.getAppinformTitle() == null ? other.getAppinformTitle() == null : this.getAppinformTitle().equals(other.getAppinformTitle()))
            && (this.getAppinformType() == null ? other.getAppinformType() == null : this.getAppinformType().equals(other.getAppinformType()))
            && (this.getAppinformManagerid() == null ? other.getAppinformManagerid() == null : this.getAppinformManagerid().equals(other.getAppinformManagerid()))
            && (this.getAppinformManagername() == null ? other.getAppinformManagername() == null : this.getAppinformManagername().equals(other.getAppinformManagername()))
            && (this.getAppinformPublishtime() == null ? other.getAppinformPublishtime() == null : this.getAppinformPublishtime().equals(other.getAppinformPublishtime()))
            && (this.getAppinformCreatetime() == null ? other.getAppinformCreatetime() == null : this.getAppinformCreatetime().equals(other.getAppinformCreatetime()))
            && (this.getAppinformUrl() == null ? other.getAppinformUrl() == null : this.getAppinformUrl().equals(other.getAppinformUrl()))
            && (this.getAppinformContent() == null ? other.getAppinformContent() == null : this.getAppinformContent().equals(other.getAppinformContent()))
            && (this.getAppinformCode() == null ? other.getAppinformCode() == null : this.getAppinformCode().equals(other.getAppinformCode()))
            && (this.getAppinformIsdel() == null ? other.getAppinformIsdel() == null : this.getAppinformIsdel().equals(other.getAppinformIsdel()))
            && (this.getAppinformState() == null ? other.getAppinformState() == null : this.getAppinformState().equals(other.getAppinformState()))
            && (this.getAppinformRemark() == null ? other.getAppinformRemark() == null : this.getAppinformRemark().equals(other.getAppinformRemark()));
    }

    @Override
    public String toString() {
        return "AppInformContent{" +
                "appinformId=" + appinformId +
                ", appinformTitle='" + appinformTitle + '\'' +
                ", appinformType='" + appinformType + '\'' +
                ", appinformManagerid=" + appinformManagerid +
                ", appinformManagername='" + appinformManagername + '\'' +
                ", appinformPublishtime=" + appinformPublishtime +
                ", appinformCreatetime=" + appinformCreatetime +
                ", appinformUrl='" + appinformUrl + '\'' +
                ", appinformContent='" + appinformContent + '\'' +
                ", appinformCode='" + appinformCode + '\'' +
                ", appinformIsdel='" + appinformIsdel + '\'' +
                ", appinformState='" + appinformState + '\'' +
                ", appinformRemark='" + appinformRemark + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAppinformId() == null) ? 0 : getAppinformId().hashCode());
        result = prime * result + ((getAppinformTitle() == null) ? 0 : getAppinformTitle().hashCode());
        result = prime * result + ((getAppinformType() == null) ? 0 : getAppinformType().hashCode());
        result = prime * result + ((getAppinformManagerid() == null) ? 0 : getAppinformManagerid().hashCode());
        result = prime * result + ((getAppinformManagername() == null) ? 0 : getAppinformManagername().hashCode());
        result = prime * result + ((getAppinformPublishtime() == null) ? 0 : getAppinformPublishtime().hashCode());
        result = prime * result + ((getAppinformCreatetime() == null) ? 0 : getAppinformCreatetime().hashCode());
        result = prime * result + ((getAppinformUrl() == null) ? 0 : getAppinformUrl().hashCode());
        result = prime * result + ((getAppinformContent() == null) ? 0 : getAppinformContent().hashCode());
        result = prime * result + ((getAppinformCode() == null) ? 0 : getAppinformCode().hashCode());
        result = prime * result + ((getAppinformIsdel() == null) ? 0 : getAppinformIsdel().hashCode());
        result = prime * result + ((getAppinformState() == null) ? 0 : getAppinformState().hashCode());
        result = prime * result + ((getAppinformRemark() == null) ? 0 : getAppinformRemark().hashCode());
        return result;
    }
}