package com.trust.entity.cms;

import java.io.Serializable;

/**
 * @Author Yangcb
 * @Descrintion 文章正文内容
 * @Date create 2017-11-23 10:02
 * @Version 1.0
 */
public class CmsArticleContent implements Serializable {

    private Long cArticleContentId;//内容ID

    private Long cArticleId;//文章ID

    private String cArticleContent;//文章分段内容

    private Integer cContentIndex;//排序

    private Integer cContentType;//内容类型 1:文字 2:图片

    private static final long serialVersionUID = 1L;

    public CmsArticleContent(Long cArticleContentId, Long cArticleId, String cArticleContent, Integer cContentIndex, Integer cContentType) {
        this.cArticleContentId = cArticleContentId;
        this.cArticleId = cArticleId;
        this.cArticleContent = cArticleContent;
        this.cContentIndex = cContentIndex;
        this.cContentType = cContentType;
    }

    public CmsArticleContent() {
        super();
    }

    public Long getcArticleContentId() {
        return cArticleContentId;
    }

    public void setcArticleContentId(Long cArticleContentId) {
        this.cArticleContentId = cArticleContentId;
    }

    public Long getcArticleId() {
        return cArticleId;
    }

    public void setcArticleId(Long cArticleId) {
        this.cArticleId = cArticleId;
    }

    public String getcArticleContent() {
        return cArticleContent;
    }

    public void setcArticleContent(String cArticleContent) {
        this.cArticleContent = cArticleContent == null ? null : cArticleContent.trim();
    }

    public Integer getcContentIndex() {
        return cContentIndex;
    }

    public void setcContentIndex(Integer cContentIndex) {
        this.cContentIndex = cContentIndex;
    }

    public Integer getcContentType() {
        return cContentType;
    }

    public void setcContentType(Integer cContentType) {
        this.cContentType = cContentType;
    }

}