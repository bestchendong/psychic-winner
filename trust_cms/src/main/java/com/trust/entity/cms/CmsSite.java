package com.trust.entity.cms;

import java.io.Serializable;
/**
 * @Author Yangcb
 * @Descrintion频道
 * @Date create 2017-11-23 9:53
 * @Version 1.0
 */
public class CmsSite implements Serializable {
    private Long cSiteId;//站点ID

    private String cSiteName;//站点名称

    private String cSiteCode;//编码

    private Integer cSiteStatus;//状态

    private static final long serialVersionUID = 1L;

    public CmsSite(Long cSiteId, String cSiteName, String cSiteCode, Integer cSiteStatus) {
        this.cSiteId = cSiteId;
        this.cSiteName = cSiteName;
        this.cSiteCode = cSiteCode;
        this.cSiteStatus = cSiteStatus;
    }

    public CmsSite() {
        super();
    }

    public Long getcSiteId() {
        return cSiteId;
    }

    public void setcSiteId(Long cSiteId) {
        this.cSiteId = cSiteId;
    }

    public String getcSiteName() {
        return cSiteName;
    }

    public void setcSiteName(String cSiteName) {
        this.cSiteName = cSiteName == null ? null : cSiteName.trim();
    }

    public String getcSiteCode() {
        return cSiteCode;
    }

    public void setcSiteCode(String cSiteCode) {
        this.cSiteCode = cSiteCode == null ? null : cSiteCode.trim();
    }

    public Integer getcSiteStatus() {
        return cSiteStatus;
    }

    public void setcSiteStatus(Integer cSiteStatus) {
        this.cSiteStatus = cSiteStatus;
    }

}