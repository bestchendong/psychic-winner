package com.trust.entity.cms;

import java.io.Serializable;
import java.util.Date;

/**
 * 图片库
 */
public class CmsPictureLibrary implements Serializable {
    private Long cPictureId;

    private Long cCreatorId;

    private String cCreatorName;

    private Long cSiteId; //站点ID

    private String cSiteCode; //站点编码

    private String cPictureName; //图片名字

    private String cPictureUrl; //图片URL

    private String cPictureSize; //图片大小

    private String cPictureDescribe;  //图片说明

    private String cPictureCategoryName; //分类名称

    private String cPictureCategoryCode; //分类编码

    private String cPictureFormat; //格式

    private Date cCreateTime; //创建时间

    private static final long serialVersionUID = 1L;

    public CmsPictureLibrary(Long cPictureId, Long cCreatorId, String cCreatorName, Long cSiteId, String cSiteCode, String cPictureName, String cPictureUrl, String cPictureSize, String cPictureDescribe, String cPictureCategoryName, String cPictureCategoryCode, String cPictureFormat, Date cCreateTime) {
        this.cPictureId = cPictureId;
        this.cCreatorId = cCreatorId;
        this.cCreatorName = cCreatorName;
        this.cSiteId = cSiteId;
        this.cSiteCode = cSiteCode;
        this.cPictureName = cPictureName;
        this.cPictureUrl = cPictureUrl;
        this.cPictureSize = cPictureSize;
        this.cPictureDescribe = cPictureDescribe;
        this.cPictureCategoryName = cPictureCategoryName;
        this.cPictureCategoryCode = cPictureCategoryCode;
        this.cPictureFormat = cPictureFormat;
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

    public String getcCreatorName() {
        return cCreatorName;
    }

    public void setcCreatorName(String cCreatorName) {
        this.cCreatorName = cCreatorName == null ? null : cCreatorName.trim();
    }

    public Long getcSiteId() {
        return cSiteId;
    }

    public void setcSiteId(Long cSiteId) {
        this.cSiteId = cSiteId;
    }

    public String getcSiteCode() {
        return cSiteCode;
    }

    public void setcSiteCode(String cSiteCode) {
        this.cSiteCode = cSiteCode == null ? null : cSiteCode.trim();
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

    public String getcPictureCategoryName() {
        return cPictureCategoryName;
    }

    public void setcPictureCategoryName(String cPictureCategoryName) {
        this.cPictureCategoryName = cPictureCategoryName == null ? null : cPictureCategoryName.trim();
    }

    public String getcPictureCategoryCode() {
        return cPictureCategoryCode;
    }

    public void setcPictureCategoryCode(String cPictureCategoryCode) {
        this.cPictureCategoryCode = cPictureCategoryCode == null ? null : cPictureCategoryCode.trim();
    }

    public String getcPictureFormat() {
        return cPictureFormat;
    }

    public void setcPictureFormat(String cPictureFormat) {
        this.cPictureFormat = cPictureFormat == null ? null : cPictureFormat.trim();
    }

    public Date getcCreateTime() {
        return cCreateTime;
    }

    public void setcCreateTime(Date cCreateTime) {
        this.cCreateTime = cCreateTime;
    }
}