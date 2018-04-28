package com.trust.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;

/**
 * ArticleDetailArticleContents
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-15T03:06:26.991Z")

public class ArticleDetailArticleContents implements Serializable {
  @JsonProperty("cArticleContentId")
  private Long cArticleContentId = null;

  @JsonProperty("cArticleId")
  private Long cArticleId = null;

  @JsonProperty("cArticleContent")
  private String cArticleContent = null;

  @JsonProperty("cContentIndex")
  private Integer cContentIndex = null;

  @JsonProperty("cContentType")
  private Integer cContentType = null;


  public ArticleDetailArticleContents(Long cArticleContentId, Long cArticleId, String cArticleContent, Integer cContentIndex, Integer cContentType) {
    this.cArticleContentId = cArticleContentId;
    this.cArticleId = cArticleId;
    this.cArticleContent = cArticleContent;
    this.cContentIndex = cContentIndex;
    this.cContentType = cContentType;
  }
  public ArticleDetailArticleContents cArticleContentId(Long cArticleContentId) {
    this.cArticleContentId = cArticleContentId;
    return this;
  }

   /**
   * 内容ID
   * @return cArticleContentId
  **/
  @ApiModelProperty(value = "内容ID")


  public Long getCArticleContentId() {
    return cArticleContentId;
  }

  public void setCArticleContentId(Long cArticleContentId) {
    this.cArticleContentId = cArticleContentId;
  }

  public ArticleDetailArticleContents cArticleId(Long cArticleId) {
    this.cArticleId = cArticleId;
    return this;
  }

   /**
   * 文章ID
   * @return cArticleId
  **/
  @ApiModelProperty(value = "文章ID")


  public Long getCArticleId() {
    return cArticleId;
  }

  public void setCArticleId(Long cArticleId) {
    this.cArticleId = cArticleId;
  }

  public ArticleDetailArticleContents cArticleContent(String cArticleContent) {
    this.cArticleContent = cArticleContent;
    return this;
  }

   /**
   * 内容
   * @return cArticleContent
  **/
  @ApiModelProperty(value = "内容")


  public String getCArticleContent() {
    return cArticleContent;
  }

  public void setCArticleContent(String cArticleContent) {
    this.cArticleContent = cArticleContent;
  }

  public ArticleDetailArticleContents cContentIndex(Integer cContentIndex) {
    this.cContentIndex = cContentIndex;
    return this;
  }

   /**
   * 排序
   * @return cContentIndex
  **/
  @ApiModelProperty(value = "排序")


  public Integer getCContentIndex() {
    return cContentIndex;
  }

  public void setCContentIndex(Integer cContentIndex) {
    this.cContentIndex = cContentIndex;
  }

  public ArticleDetailArticleContents cContentType(Integer cContentType) {
    this.cContentType = cContentType;
    return this;
  }

   /**
   * //内容类型 1:文字 2:图片
   * @return cContentType
  **/
  @ApiModelProperty(value = "//内容类型 1:文字 2:图片")


  public Integer getCContentType() {
    return cContentType;
  }

  public void setCContentType(Integer cContentType) {
    this.cContentType = cContentType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArticleDetailArticleContents articleDetailArticleContents = (ArticleDetailArticleContents) o;
    return Objects.equals(this.cArticleContentId, articleDetailArticleContents.cArticleContentId) &&
        Objects.equals(this.cArticleId, articleDetailArticleContents.cArticleId) &&
        Objects.equals(this.cArticleContent, articleDetailArticleContents.cArticleContent) &&
        Objects.equals(this.cContentIndex, articleDetailArticleContents.cContentIndex) &&
        Objects.equals(this.cContentType, articleDetailArticleContents.cContentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cArticleContentId, cArticleId, cArticleContent, cContentIndex, cContentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleDetailArticleContents {\n");

    sb.append("    cArticleContentId: ").append(toIndentedString(cArticleContentId)).append("\n");
    sb.append("    cArticleId: ").append(toIndentedString(cArticleId)).append("\n");
    sb.append("    cArticleContent: ").append(toIndentedString(cArticleContent)).append("\n");
    sb.append("    cContentIndex: ").append(toIndentedString(cContentIndex)).append("\n");
    sb.append("    cContentType: ").append(toIndentedString(cContentType)).append("\n");
    sb.append("}");
    return sb.toString();
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

