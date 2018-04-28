package com.trust.entity.cms;


import com.trust.utils.DateUtil;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author Yangcb
 * @Descrintion 文章新闻病虫害等发布信息实体
 * @Date create 2017-11-23 9:47
 * @Version 1.0
 */
public class CmsArticleInfo implements Serializable {

    private Long cArticleId;//文章ID

    private Long cArticleCategoryId;//分类ID

    private Long cArticleCreator;//创建人

    private String articleCreatorName;//创建人名字

    private Long cSiteId;//频道

    private String siteCode;//站点编码

    private String cArticleTitle;//标题

    private String cArticlePoster;//海报

    private String cArticleAuthor;//作者

    private Date cArticleCreatetime;//创建时间

    private String articleCreatetime;//创建时间

    private Date cArticleUpdatetime;//修改时间

    private String articleUpdatetime;//修改时间

    private Long cArticleReleaseid;//发布人

    private Date cArticleReleaseTime;//发布时间

    private String articleReleaseTime;//发布时间

    private Date cArticleOriganalReleaseTime;//原文发布时间

    private String articleOriganalReleaseTime;//原文发布时间

    private Date cArticlePushTime;//推送时间

    private String  articlePushTime;//推送时间

    private Integer cArticleStatus;//状态

    private Integer cArticleAmount;//浏览量

    private Long cArticlePriority;//优先级

    private Long cArticleLabel;//标签

    private String cArticleKeyword;//关键字

    private String cArticleResource;//来源

    private String cArticleResourceUrl;//来源URL

    private String cArticleSubtitle;//副标题

    private String cArticleDes;//描述

    private String cArticleSmallImage;//小图

    private String cArticleLargeImage;//大图

    private Integer cArticleCommentarie;//评论数

    private Integer cArticleCollect;//收藏数

    private Integer cArticleType;;//来源 1:本站 2：爬取

    private CmsArticleCategory cmsArticleCategory; //所属分类

    private List<CmsArticleContent> articleContents;//文章内容

    private List<CmsArticleOperateLog> cmsArticleOperateLogs;//文章操作日志

    private String cArticleCategoryCode;//文章分类编码

    private static final long serialVersionUID = 1L;

    public CmsArticleInfo(Long cArticleId, Long cArticleCategoryId, Long cArticleCreator, String cArticleCreatorName, Long cSiteId, String siteCode, String cArticleTitle, String cArticlePoster, String cArticleAuthor, Date cArticleCreatetime, Date cArticleUpdatetime, Long cArticleReleaseid, Date cArticleReleaseTime, Date cArticleOriganalReleaseTime, Date cArticlePushTime, Integer cArticleStatus, Integer cArticleAmount, Long cArticlePriority, Long cArticleLabel, String cArticleKeyword, String cArticleResource, String cArticleResourceUrl, String cArticleSubtitle, String cArticleDes, String cArticleSmallImage, String cArticleLargeImage, Integer cArticleCommentarie, Integer cArticleCollect, Integer cArticleType, String cArticleCategoryCode) {
        this.cArticleId = cArticleId;
        this.cArticleCategoryId = cArticleCategoryId;
        this.cArticleCreator = cArticleCreator;
        this.articleCreatorName = cArticleCreatorName;
        this.cSiteId = cSiteId;
        this.cArticleTitle = cArticleTitle;
        this.cArticlePoster = cArticlePoster;
        this.cArticleAuthor = cArticleAuthor;
        this.cArticleCreatetime = cArticleCreatetime;
        this.cArticleUpdatetime = cArticleUpdatetime;
        this.cArticleReleaseid = cArticleReleaseid;
        this.cArticleReleaseTime = cArticleReleaseTime;
        this.cArticleOriganalReleaseTime = cArticleOriganalReleaseTime;
        this.cArticlePushTime = cArticlePushTime;
        this.cArticleStatus = cArticleStatus;
        this.cArticleAmount = cArticleAmount;
        this.cArticlePriority = cArticlePriority;
        this.cArticleLabel = cArticleLabel;
        this.cArticleKeyword = cArticleKeyword;
        this.cArticleResource = cArticleResource;
        this.cArticleResourceUrl = cArticleResourceUrl;
        this.cArticleSubtitle = cArticleSubtitle;
        this.cArticleDes = cArticleDes;
        this.cArticleSmallImage = cArticleSmallImage;
        this.cArticleLargeImage = cArticleLargeImage;
        this.cArticleCommentarie = cArticleCommentarie;
        this.cArticleCollect = cArticleCollect;
        this.cArticleType = cArticleType;
        this.cArticleCategoryCode = cArticleCategoryCode;
        this.siteCode = siteCode;
        if(cArticlePushTime!=null) {
            this.articlePushTime = DateUtil.formatDateTime(cArticlePushTime);
        }
        if(cArticleCreatetime!=null) {
            this.articleCreatetime = DateUtil.formatDateTime(cArticleCreatetime);
        }
        if(cArticleUpdatetime!=null) {
            this.articleUpdatetime = DateUtil.formatDateTime(cArticleUpdatetime);
        }
        if(cArticleReleaseTime!=null) {
            this.articleReleaseTime = DateUtil.formatDateTime(cArticleReleaseTime);
        }
        if(cArticlePushTime!=null) {
            this.articlePushTime = DateUtil.formatDateTime(cArticlePushTime);
        }
    }

    public String getArticleCreatorName() {
        return articleCreatorName;
    }

    public void setArticleCreatorName(String articleCreatorName) {
        this.articleCreatorName = articleCreatorName;
    }
    public CmsArticleInfo() {
        super();
    }

    public Long getcArticleId() {
        return cArticleId;
    }

    public void setcArticleId(Long cArticleId) {
        this.cArticleId = cArticleId;
    }

    public Long getcArticleCategoryId() {
        return cArticleCategoryId;
    }

    public void setcArticleCategoryId(Long cArticleCategoryId) {
        this.cArticleCategoryId = cArticleCategoryId;
    }

    public Long getcArticleCreator() {
        return cArticleCreator;
    }

    public void setcArticleCreator(Long cArticleCreator) {
        this.cArticleCreator = cArticleCreator;
    }

    public Long getcSiteId() {
        return cSiteId;
    }

    public void setcSiteId(Long cSiteId) {
        this.cSiteId = cSiteId;
    }

    public String getcArticleTitle() {
        return cArticleTitle;
    }

    public void setcArticleTitle(String cArticleTitle) {
        this.cArticleTitle = cArticleTitle == null ? null : cArticleTitle.trim();
    }

    public String getcArticlePoster() {
        return cArticlePoster;
    }

    public void setcArticlePoster(String cArticlePoster) {
        this.cArticlePoster = cArticlePoster == null ? null : cArticlePoster.trim();
    }

    public String getcArticleAuthor() {
        return cArticleAuthor;
    }

    public void setcArticleAuthor(String cArticleAuthor) {
        this.cArticleAuthor = cArticleAuthor == null ? null : cArticleAuthor.trim();
    }

    public Date getcArticleCreatetime() {
        return cArticleCreatetime;
    }

    public void setcArticleCreatetime(Date cArticleCreatetime) {
        this.cArticleCreatetime = cArticleCreatetime;
        if(cArticleCreatetime!=null) {
            this.articleCreatetime = DateUtil.formatDateTime(cArticleCreatetime);
        }
    }

    public Date getcArticleUpdatetime() {
        return cArticleUpdatetime;
    }

    public void setcArticleUpdatetime(Date cArticleUpdatetime) {
        this.cArticleUpdatetime = cArticleUpdatetime;
        if(cArticleUpdatetime!=null) {
            this.articleUpdatetime = DateUtil.formatDateTime(cArticleUpdatetime);
        }
    }

    public Long getcArticleReleaseid() {
        return cArticleReleaseid;
    }

    public void setcArticleReleaseid(Long cArticleReleaseid) {
        this.cArticleReleaseid = cArticleReleaseid;
    }

    public Date getcArticleReleaseTime() {
        return cArticleReleaseTime;
    }

    public void setcArticleReleaseTime(Date cArticleReleaseTime) {
        this.cArticleReleaseTime = cArticleReleaseTime;
        if(cArticleReleaseTime!=null) {
            this.articleReleaseTime = DateUtil.formatDateTime(cArticleReleaseTime);
        }
    }

    public Integer getcArticleStatus() {
        return cArticleStatus;
    }

    public void setcArticleStatus(Integer cArticleStatus) {
        this.cArticleStatus = cArticleStatus;
    }

    public Integer getcArticleAmount() {
        return cArticleAmount;
    }

    public void setcArticleAmount(Integer cArticleAmount) {
        this.cArticleAmount = cArticleAmount;
    }

    public Long getcArticlePriority() {
        return cArticlePriority;
    }

    public void setcArticlePriority(Long cArticlePriority) {
        this.cArticlePriority = cArticlePriority;
    }

    public Long getcArticleLabel() {
        return cArticleLabel;
    }

    public void setcArticleLabel(Long cArticleLabel) {
        this.cArticleLabel = cArticleLabel;
    }

    public String getcArticleKeyword() {
        return cArticleKeyword;
    }

    public void setcArticleKeyword(String cArticleKeyword) {
        this.cArticleKeyword = cArticleKeyword == null ? null : cArticleKeyword.trim();
    }

    public String getcArticleResource() {
        return cArticleResource;
    }

    public void setcArticleResource(String cArticleResource) {
        this.cArticleResource = cArticleResource == null ? null : cArticleResource.trim();
    }

    public String getcArticleResourceUrl() {
        return cArticleResourceUrl;
    }

    public void setcArticleResourceUrl(String cArticleResourceUrl) {
        this.cArticleResourceUrl = cArticleResourceUrl == null ? null : cArticleResourceUrl.trim();
    }

    public String getcArticleSubtitle() {
        return cArticleSubtitle;
    }

    public void setcArticleSubtitle(String cArticleSubtitle) {
        this.cArticleSubtitle = cArticleSubtitle == null ? null : cArticleSubtitle.trim();
    }

    public String getcArticleDes() {
        return cArticleDes;
    }

    public void setcArticleDes(String cArticleDes) {
        this.cArticleDes = cArticleDes == null ? null : cArticleDes.trim();
    }

    public String getcArticleSmallImage() {
        return cArticleSmallImage;
    }

    public void setcArticleSmallImage(String cArticleSmallImage) { this.cArticleSmallImage = cArticleSmallImage == null ? null : cArticleSmallImage.trim(); }

    public String getcArticleLargeImage() {
        return cArticleLargeImage;
    }

    public void setcArticleLargeImage(String cArticleLargeImage) { this.cArticleLargeImage = cArticleLargeImage == null ? null : cArticleLargeImage.trim(); }

    public Integer getcArticleCommentarie() {
        return cArticleCommentarie;
    }

    public void setcArticleCommentarie(Integer cArticleCommentarie) {
        this.cArticleCommentarie = cArticleCommentarie;
    }

    public Integer getcArticleCollect() {
        return cArticleCollect;
    }

    public void setcArticleCollect(Integer cArticleCollect) {
        this.cArticleCollect = cArticleCollect;
    }

    public Integer getcArticleType() {
        return cArticleType;
    }

    public void setcArticleType(Integer cArticleType) {
        this.cArticleType = cArticleType;
    }

    public String getcArticleCategoryCode() { return cArticleCategoryCode; }

    public void setcArticleCategoryCode(String cArticleCategoryCode) { this.cArticleCategoryCode = cArticleCategoryCode == null ? null : cArticleCategoryCode.trim(); }

    public String getSiteCode() { return siteCode; }

    public void setSiteCode(String siteCode) { this.siteCode = siteCode; }

    public List<CmsArticleOperateLog> getCmsArticleOperateLogs() { return cmsArticleOperateLogs; }

    public void setCmsArticleOperateLogs(List<CmsArticleOperateLog> cmsArticleOperateLogs) { this.cmsArticleOperateLogs = cmsArticleOperateLogs; }

    public List<CmsArticleContent> getArticleContents() { return articleContents; }

    public void setArticleContents(List<CmsArticleContent> articleContents) { this.articleContents = articleContents; }

    public Date getcArticleOriganalReleaseTime() {return cArticleOriganalReleaseTime; }

    public void setcArticleOriganalReleaseTime(Date cArticleOriganalReleaseTime) {this.cArticleOriganalReleaseTime = cArticleOriganalReleaseTime; }

    public Date getcArticlePushTime() {return cArticlePushTime; }

    public void setcArticlePushTime(Date cArticlePushTime) {
        this.cArticlePushTime = cArticlePushTime;
        if(cArticlePushTime!=null) {
            this.articlePushTime = DateUtil.formatDateTime(cArticlePushTime);
        }
    }

    public CmsArticleCategory getCmsArticleCategory() {
        return cmsArticleCategory;
    }

    public void setCmsArticleCategory(CmsArticleCategory cmsArticleCategory) {
        this.cmsArticleCategory = cmsArticleCategory;
    }

    public String getArticleCreatetime() {
        return articleCreatetime;
    }

    public String getArticleUpdatetime() {
        return articleUpdatetime;
    }

    public String getArticleReleaseTime() {
        return articleReleaseTime;
    }

    public String getArticleOriganalReleaseTime() {
        return articleOriganalReleaseTime;
    }

    public String getArticlePushTime() { return articlePushTime; }

}