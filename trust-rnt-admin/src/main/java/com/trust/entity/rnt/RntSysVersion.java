package com.trust.entity.rnt;

import com.trust.common.annotation.OperationLogAttr;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class RntSysVersion implements Serializable {

    @OperationLogAttr(attributeDes="系统信息ID")
    private Long versionId;

    @OperationLogAttr(attributeDes="系统名称")
    private String sysName;

    @OperationLogAttr(attributeDes="版本号")
    private String versionNum;

    @OperationLogAttr(attributeDes="应用市场名称")
    private String applicationMarket;

    @OperationLogAttr(attributeDes="下载链接")
    private String downloadUrl;

    @OperationLogAttr(attributeDes="版本描述")
    private String versionDes;

    @OperationLogAttr(attributeDes="发布时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date publishTime;

    @OperationLogAttr(attributeDes="迭代版本号")
    private Integer num;

    @OperationLogAttr(attributeDes="系统编码")
    private String sysCode;

    private static final long serialVersionUID = 1L;

    public RntSysVersion(Long versionId, String sysName, String versionNum, String applicationMarket, String downloadUrl, String versionDes, Date publishTime, Integer num, String sysCode) {
        this.versionId = versionId;
        this.sysName = sysName;
        this.versionNum = versionNum;
        this.applicationMarket = applicationMarket;
        this.downloadUrl = downloadUrl;
        this.versionDes = versionDes;
        this.publishTime = publishTime;
        this.num = num;
        this.sysCode = sysCode;
    }

    public RntSysVersion() {
        super();
    }

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName == null ? null : sysName.trim();
    }

    public String getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum == null ? null : versionNum.trim();
    }

    public String getApplicationMarket() {
        return applicationMarket;
    }

    public void setApplicationMarket(String applicationMarket) {
        this.applicationMarket = applicationMarket == null ? null : applicationMarket.trim();
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl == null ? null : downloadUrl.trim();
    }

    public String getVersionDes() {
        return versionDes;
    }

    public void setVersionDes(String versionDes) {
        this.versionDes = versionDes == null ? null : versionDes.trim();
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode == null ? null : sysCode.trim();
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
        RntSysVersion other = (RntSysVersion) that;
        return (this.getVersionId() == null ? other.getVersionId() == null : this.getVersionId().equals(other.getVersionId()))
            && (this.getSysName() == null ? other.getSysName() == null : this.getSysName().equals(other.getSysName()))
            && (this.getVersionNum() == null ? other.getVersionNum() == null : this.getVersionNum().equals(other.getVersionNum()))
            && (this.getApplicationMarket() == null ? other.getApplicationMarket() == null : this.getApplicationMarket().equals(other.getApplicationMarket()))
            && (this.getDownloadUrl() == null ? other.getDownloadUrl() == null : this.getDownloadUrl().equals(other.getDownloadUrl()))
            && (this.getVersionDes() == null ? other.getVersionDes() == null : this.getVersionDes().equals(other.getVersionDes()))
            && (this.getPublishTime() == null ? other.getPublishTime() == null : this.getPublishTime().equals(other.getPublishTime()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getSysCode() == null ? other.getSysCode() == null : this.getSysCode().equals(other.getSysCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        result = prime * result + ((getSysName() == null) ? 0 : getSysName().hashCode());
        result = prime * result + ((getVersionNum() == null) ? 0 : getVersionNum().hashCode());
        result = prime * result + ((getApplicationMarket() == null) ? 0 : getApplicationMarket().hashCode());
        result = prime * result + ((getDownloadUrl() == null) ? 0 : getDownloadUrl().hashCode());
        result = prime * result + ((getVersionDes() == null) ? 0 : getVersionDes().hashCode());
        result = prime * result + ((getPublishTime() == null) ? 0 : getPublishTime().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getSysCode() == null) ? 0 : getSysCode().hashCode());
        return result;
    }
}