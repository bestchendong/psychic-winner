package com.trust.entity.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * ArticleDetailArticleContents
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-15T03:06:26.991Z")

public class ArticleDetailArticleContents implements Serializable {
  @JsonProperty("carticleContentId")
  private Long carticleContentId = null;

  @JsonProperty("carticleId")
  private Long carticleId = null;

  @JsonProperty("carticleContent")
  private String carticleContent = null;

  @JsonProperty("contentIndex")
  private Integer contentIndex = null;

  @JsonProperty("contentType")
  private Integer contentType = null;


  public ArticleDetailArticleContents(Long cArticleContentId, Long cArticleId, String cArticleContent, Integer cContentIndex, Integer cContentType) {
    this.carticleContentId = cArticleContentId;
    this.carticleId = cArticleId;
    this.carticleContent = cArticleContent;
    this.contentIndex = cContentIndex;
    this.contentType = cContentType;
  }
  public ArticleDetailArticleContents cArticleContentId(Long carticleContentId) {
    this.carticleContentId = carticleContentId;
    return this;
  }

   /**
   * 内容ID
   * @return cArticleContentId
  **/
  @ApiModelProperty(value = "内容ID")


  public Long getCarticleContentId() {
    return carticleContentId;
  }

  public void setCarticleContentId(Long carticleContentId) {
    this.carticleContentId = carticleContentId;
  }

  public ArticleDetailArticleContents cArticleId(Long carticleId) {
    this.carticleId = carticleId;
    return this;
  }

   /**
   * 文章ID
   * @return cArticleId
  **/
  @ApiModelProperty(value = "文章ID")


  public Long getCarticleId() {
    return carticleId;
  }

  public void setCarticleId(Long cArticleId) {
    this.carticleId = carticleId;
  }

  public ArticleDetailArticleContents cArticleContent(String carticleContent) {
    this.carticleContent = carticleContent;
    return this;
  }

   /**
   * 内容
   * @return cArticleContent
  **/
  @ApiModelProperty(value = "内容")


  public String getCarticleContent() {
    return carticleContent;
  }

  public void setCarticleContent(String carticleContent) {
    this.carticleContent = carticleContent;
  }

  public ArticleDetailArticleContents contentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
    return this;
  }

   /**
   * 排序
   * @return cContentIndex
  **/
  @ApiModelProperty(value = "排序")


  public Integer getContentIndex() {
    return contentIndex;
  }

  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  public ArticleDetailArticleContents contentType(Integer contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * //内容类型 1:文字 2:图片
   * @return cContentType
  **/
  @ApiModelProperty(value = "//内容类型 1:文字 2:图片")


  public Integer getContentType() {
    return contentType;
  }

  public void setContentType(Integer contentType) {
    this.contentType = contentType;
  }


  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

