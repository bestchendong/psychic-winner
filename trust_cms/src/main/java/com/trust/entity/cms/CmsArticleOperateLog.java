package com.trust.entity.cms;

import java.io.Serializable;
import java.util.Date;

/**
 * 内容操作日志
 */
public class CmsArticleOperateLog implements Serializable {

    private Long cmsOperateLogId; //主键ＩＤ

    private String cmsSiteCode; //站点编码

    private Long cmsSiteId; //站点ＩＤ

    private String cmsUserName; //操作人

    private String cmsResourcesName; //资源

    private Date cmsOperateDate; //操作时间

    private Long cmsArticleId; //内容ID

    private String cmsArtcileName;//内容名字

    private Long cmsUserId; //用户ＩＤ

    private String cmsOperateExplain;//格式

    private static final long serialVersionUID = 1L;

    public CmsArticleOperateLog(Long cmsOperateLogId, String cmsSiteCode, Long cmsSiteId, String cmsUserName, String cmsResourcesName, Date cmsOperateDate, Long cmsArticleId, String cmsArtcileName, Long cmsUserId, String cmsOperateExplain) {
        this.cmsOperateLogId = cmsOperateLogId;
        this.cmsSiteCode = cmsSiteCode;
        this.cmsSiteId = cmsSiteId;
        this.cmsUserName = cmsUserName;
        this.cmsResourcesName = cmsResourcesName;
        this.cmsOperateDate = cmsOperateDate;
        this.cmsArticleId = cmsArticleId;
        this.cmsArtcileName = cmsArtcileName;
        this.cmsUserId = cmsUserId;
        this.cmsOperateExplain = cmsOperateExplain;
    }

    public CmsArticleOperateLog() {
        super();
    }

    public Long getCmsOperateLogId() {
        return cmsOperateLogId;
    }

    public void setCmsOperateLogId(Long cmsOperateLogId) {
        this.cmsOperateLogId = cmsOperateLogId;
    }

    public String getCmsSiteCode() {
        return cmsSiteCode;
    }

    public void setCmsSiteCode(String cmsSiteCode) {
        this.cmsSiteCode = cmsSiteCode == null ? null : cmsSiteCode.trim();
    }

    public Long getCmsSiteId() {
        return cmsSiteId;
    }

    public void setCmsSiteId(Long cmsSiteId) {
        this.cmsSiteId = cmsSiteId;
    }

    public String getCmsUserName() {
        return cmsUserName;
    }

    public void setCmsUserName(String cmsUserName) {
        this.cmsUserName = cmsUserName == null ? null : cmsUserName.trim();
    }

    public String getCmsResourcesName() {
        return cmsResourcesName;
    }

    public void setCmsResourcesName(String cmsResourcesName) {
        this.cmsResourcesName = cmsResourcesName == null ? null : cmsResourcesName.trim();
    }

    public Date getCmsOperateDate() {
        return cmsOperateDate;
    }

    public void setCmsOperateDate(Date cmsOperateDate) {
        this.cmsOperateDate = cmsOperateDate;
    }

    public Long getCmsArticleId() {
        return cmsArticleId;
    }

    public void setCmsArticleId(Long cmsArticleId) {
        this.cmsArticleId = cmsArticleId;
    }

    public String getCmsArtcileName() {
        return cmsArtcileName;
    }

    public void setCmsArtcileName(String cmsArtcileName) {
        this.cmsArtcileName = cmsArtcileName == null ? null : cmsArtcileName.trim();
    }

    public Long getCmsUserId() {
        return cmsUserId;
    }

    public void setCmsUserId(Long cmsUserId) {
        this.cmsUserId = cmsUserId;
    }

    public String getCmsOperateExplain() {
        return cmsOperateExplain;
    }

    public void setCmsOperateExplain(String cmsOperateExplain) {
        this.cmsOperateExplain = cmsOperateExplain == null ? null : cmsOperateExplain.trim();
    }
}