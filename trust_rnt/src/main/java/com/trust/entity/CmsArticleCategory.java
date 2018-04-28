package com.trust.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @Author Yangcb
 * @Descrintion  文章新闻分类实体
 * @Date create 2017-11-22 16:45
 * @Version 1.0
 */
public class CmsArticleCategory implements Serializable {
    private Long cCategoryId;//分类ID

    private Long cSiteId;//频道ID

    private Long cPid;//父类ID

    private String cCategoryCode;//分类编码

    private String cCategoryName;//分类名称

    private Integer cCategoryStatus;//状态

    private String cCategoryDescribe;//描述

    private String cCategoryImage;//图片图标

    private Integer cCategoryLevel;//分类级别

    private CmsArticleCategory cmsArticleCategory;//父类

    private List<CmsArticleCategory> childrenCategory;//子类List

    private static final long serialVersionUID = 1L;

    public CmsArticleCategory(Long cCategoryId, Long cSiteId, Long cPid, String cCategoryCode, String cCategoryName, Integer cCategoryStatus, String cCategoryDescribe, String cCategoryImage, Integer cCategoryLevel) {
        this.cCategoryId = cCategoryId;
        this.cSiteId = cSiteId;
        this.cPid = cPid;
        this.cCategoryCode = cCategoryCode;
        this.cCategoryName = cCategoryName;
        this.cCategoryStatus = cCategoryStatus;
        this.cCategoryDescribe = cCategoryDescribe;
        this.cCategoryImage = cCategoryImage;
        this.cCategoryLevel = cCategoryLevel;
    }

    public CmsArticleCategory() {
        super();
    }

    public Long getcCategoryId() {
        return cCategoryId;
    }

    public void setcCategoryId(Long cCategoryId) {
        this.cCategoryId = cCategoryId;
    }

    public Long getcSiteId() {
        return cSiteId;
    }

    public void setcSiteId(Long cSiteId) {
        this.cSiteId = cSiteId;
    }

    public Long getcPid() {
        return cPid;
    }

    public void setcPid(Long cPid) {
        this.cPid = cPid;
    }

    public String getcCategoryCode() {
        return cCategoryCode;
    }

    public void setcCategoryCode(String cCategoryCode) {
        this.cCategoryCode = cCategoryCode == null ? null : cCategoryCode.trim();
    }

    public String getcCategoryName() {
        return cCategoryName;
    }

    public void setcCategoryName(String cCategoryName) {
        this.cCategoryName = cCategoryName == null ? null : cCategoryName.trim();
    }

    public Integer getcCategoryStatus() {
        return cCategoryStatus;
    }

    public void setcCategoryStatus(Integer cCategoryStatus) {
        this.cCategoryStatus = cCategoryStatus;
    }

    public String getcCategoryDescribe() {
        return cCategoryDescribe;
    }

    public void setcCategoryDescribe(String cCategoryDescribe) {
        this.cCategoryDescribe = cCategoryDescribe == null ? null : cCategoryDescribe.trim();
    }

    public String getcCategoryImage() {
        return cCategoryImage;
    }

    public void setcCategoryImage(String cCategoryImage) {
        this.cCategoryImage = cCategoryImage == null ? null : cCategoryImage.trim();
    }

    public Integer getcCategoryLevel() {
        return cCategoryLevel;
    }

    public void setcCategoryLevel(Integer cCategoryLevel) {
        this.cCategoryLevel = cCategoryLevel;
    }

    public List<CmsArticleCategory> getChildrenCategory() { return childrenCategory; }

    public void setChildrenCategory(List<CmsArticleCategory> childrenCategory) { this.childrenCategory = childrenCategory; }

    public CmsArticleCategory getCmsArticleCategory() { return cmsArticleCategory; }

    public void setCmsArticleCategory(CmsArticleCategory cmsArticleCategory) { this.cmsArticleCategory = cmsArticleCategory; }
}