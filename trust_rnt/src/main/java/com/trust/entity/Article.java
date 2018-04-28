package com.trust.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.trust.utils.DateUtil;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;


/**
 * @Author Yangcb
 * @Descrintion
 * @Date create 2017-12-20 16:31
 * @Version 1.0
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-15T03:06:26.991Z")

public class Article implements Serializable {
    @JsonProperty("articleId")
    private Long articleId = null;

    @JsonProperty("articleTitle")
    private String articleTitle = null;

    @JsonProperty("articleCategoryCode")
    private String articleCategoryCode = null;

    @JsonProperty("articlePoster")
    private String articlePoster = null;

    @JsonProperty("articleReleaseTime")
    private String articleReleaseTime = null;

    @JsonProperty("articleResource")
    private String articleResource = null;

    public Article(Long cArticleId,String cArticleTitle, String cArticlePoster, Date cArticleReleaseTime ,String cArticleResource, String cArticleCategoryCode) {
        this.articleId = cArticleId;
        this.articleTitle = cArticleTitle;
        this.articlePoster = cArticlePoster;
        this.articleReleaseTime = DateUtil.formatDateTime(cArticleReleaseTime);
        this.articleResource = cArticleResource;
        this.articleCategoryCode = cArticleCategoryCode;
    }
    /**
     * 文章ID
     * @return articleId
     **/
    @ApiModelProperty(value = "文章ID")

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    /**
     * 文章标题
     * @return articleTitle
     **/
    @ApiModelProperty(value = "文章标题")


    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }


    /**
     * 文章来源
     * @return articleResource
     **/
    @ApiModelProperty(value = "文章来源")


    public String getArticleResource() {
        return articleResource;
    }

    public void setArticleResource(String articleResource) {
        this.articleResource = articleResource;
    }




    /**
     * 发布时间
     * @return cArticleReleaseTime
     **/
    @ApiModelProperty(value = "发布时间")
    public String getArticleReleaseTime() {
        return articleReleaseTime;
    }

    public void setArticleReleaseTime(String  articleReleaseTime) {
        this.articleReleaseTime = articleReleaseTime;
    }
    /**
     * 海报
     * @return cArticlePoster
     **/
    @ApiModelProperty(value = "海报")

    public String getArticlePoster() {
        return articlePoster;
    }

    public void setArticlePoster(String cArticlePoster) {
        this.articlePoster = articlePoster;
    }

    /**
     * 分类编码
     * @return aticleCategoryCode
     **/
    @ApiModelProperty(value = "分类编码")

    public String getArticleCategoryCode() {
        return articleCategoryCode;
    }

    public void setArticleCategoryCode(String articleCategoryCode) {
        this.articleCategoryCode = articleCategoryCode;
    }


}


