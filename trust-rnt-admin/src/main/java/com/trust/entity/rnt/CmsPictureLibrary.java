package com.trust.entity.rnt;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author Yangcb
 * @Descrintion  图片库表
 * @Date create 2017-11-23 10:09
 * @Version 1.0
 */
public class CmsPictureLibrary implements Serializable {
    private Long cPictureId;//图片ID

    private Long cCreatorId;//创建人ID

    private Long cSiteId;//站点ID

    private String cCreatorName;//创建人名字

    private String cPictureName;//图片名字

    private String cPictureUrl;//图片URL

    private String cPictureSize;//尺寸大小

    private String cPictureDescribe;//详情描述

    private Date cCreateTime;//创建时间

    private static final long serialVersionUID = 1L;

    public CmsPictureLibrary(Long cPictureId, Long cCreatorId, Long cSiteId, String cCreatorName, String cPictureName, String cPictureUrl, String cPictureSize, String cPictureDescribe, Date cCreateTime) {
        this.cPictureId = cPictureId;
        this.cCreatorId = cCreatorId;
        this.cSiteId = cSiteId;
        this.cCreatorName = cCreatorName;
        this.cPictureName = cPictureName;
        this.cPictureUrl = cPictureUrl;
        this.cPictureSize = cPictureSize;
        this.cPictureDescribe = cPictureDescribe;
        this.cCreateTime = cCreateTime;
    }

    public CmsPictureLibrary() {
        super();
    }

    public Long getcPictureId() {
        return cPictureId;
    }

    public void setcPictureId(Long cPictureId) {
        this.cPictureId = cPictureId;
    }

    public Long getcCreatorId() {
        return cCreatorId;
    }

    public void setcCreatorId(Long cCreatorId) {
        this.cCreatorId = cCreatorId;
    }

    public Long getcSiteId() {
        return cSiteId;
    }

    public void setcSiteId(Long cSiteId) {
        this.cSiteId = cSiteId;
    }

    public String getcCreatorName() {
        return cCreatorName;
    }

    public void setcCreatorName(String cCreatorName) {
        this.cCreatorName = cCreatorName == null ? null : cCreatorName.trim();
    }

    public String getcPictureName() {
        return cPictureName;
    }

    public void setcPictureName(String cPictureName) {
        this.cPictureName = cPictureName == null ? null : cPictureName.trim();
    }

    public String getcPictureUrl() {
        return cPictureUrl;
    }

    public void setcPictureUrl(String cPictureUrl) {
        this.cPictureUrl = cPictureUrl == null ? null : cPictureUrl.trim();
    }

    public String getcPictureSize() {
        return cPictureSize;
    }

    public void setcPictureSize(String cPictureSize) {
        this.cPictureSize = cPictureSize == null ? null : cPictureSize.trim();
    }

    public String getcPictureDescribe() {
        return cPictureDescribe;
    }

    public void setcPictureDescribe(String cPictureDescribe) {
        this.cPictureDescribe = cPictureDescribe == null ? null : cPictureDescribe.trim();
    }

    public Date getcCreateTime() {
        return cCreateTime;
    }

    public void setcCreateTime(Date cCreateTime) {
        this.cCreateTime = cCreateTime;
    }


}