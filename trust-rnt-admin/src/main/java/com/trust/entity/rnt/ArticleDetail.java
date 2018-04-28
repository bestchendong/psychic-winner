package com.trust.entity.rnt;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * ArticleDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-15T03:06:26.991Z")

public class ArticleDetail  implements Serializable {
  @JsonProperty("cArticleId")
  private Long cArticleId = null;

  @JsonProperty("cArticleCategoryId")
  private Long cArticleCategoryId = null;

  @JsonProperty("cArticleCreator")
  private Long cArticleCreator = null;

  @JsonProperty("cArticleCreatorName")
  private String cArticleCreatorName = null;

  @JsonProperty("siteCode")
  private String siteCode = null;

  @JsonProperty("cArticleTitle")
  private String cArticleTitle = null;

  @JsonProperty("cArticlePoster")
  private String cArticlePoster = null;

  @JsonProperty("cArticleAuthor")
  private String cArticleAuthor = null;

  @JsonProperty("cArticleCreatetime")
  private Date cArticleCreatetime = null;

  @JsonProperty("cArticleUpdatetime")
  private Date cArticleUpdatetime = null;

  @JsonProperty("cArticleReleaseid")
  private Long cArticleReleaseid = null;

  @JsonProperty("cArticleReleaseTime")
  private Date cArticleReleaseTime = null;

  @JsonProperty("cArticleStatus")
  private Integer cArticleStatus = null;

  @JsonProperty("cArticleAmount")
  private Integer cArticleAmount = null;

  @JsonProperty("cArticleResource")
  private String cArticleResource = null;

  @JsonProperty("cArticleResourceUrl")
  private String cArticleResourceUrl = null;

  @JsonProperty("cArticleSubtitle")
  private String cArticleSubtitle = null;

  @JsonProperty("cArticleDes")
  private String cArticleDes = null;

  @JsonProperty("cTemplatePath")
  private String cTemplatePath = null;

  @JsonProperty("cArticleCategoryCode")
  private String cArticleCategoryCode = null;

  @JsonProperty("articleContents")
  private List<ArticleDetailArticleContents> articleContents = null;

  public ArticleDetail cArticleId(Long cArticleId) {
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

  public ArticleDetail cArticleCategoryId(Long cArticleCategoryId) {
    this.cArticleCategoryId = cArticleCategoryId;
    return this;
  }

   /**
   * 分类ID
   * @return cArticleCategoryId
  **/
  @ApiModelProperty(value = "分类ID")


  public Long getCArticleCategoryId() {
    return cArticleCategoryId;
  }

  public void setCArticleCategoryId(Long cArticleCategoryId) {
    this.cArticleCategoryId = cArticleCategoryId;
  }

  public ArticleDetail cArticleCreator(Long cArticleCreator) {
    this.cArticleCreator = cArticleCreator;
    return this;
  }


   /**
   * 创建人ID
   * @return cArticleCreator
  **/
  @ApiModelProperty(value = "创建人ID")


  public Long getCArticleCreator() {
    return cArticleCreator;
  }

  public void setCArticleCreator(Long cArticleCreator) {
    this.cArticleCreator = cArticleCreator;
  }

  public ArticleDetail siteCode(String siteCode) {
    this.siteCode = siteCode;
    return this;
  }

  /**
   * 创建人名字
   * @return
   */
  public String getcArticleCreatorName() {
    return cArticleCreatorName;
  }

  public void setcArticleCreatorName(String cArticleCreatorName) {
    this.cArticleCreatorName = cArticleCreatorName;
  }
   /**
   * 站点编码
   * @return siteCode
  **/
  @ApiModelProperty(value = "站点编码")


  public String getSiteCode() {
    return siteCode;
  }

  public void setSiteCode(String siteCode) {
    this.siteCode = siteCode;
  }

  public ArticleDetail cArticleTitle(String cArticleTitle) {
    this.cArticleTitle = cArticleTitle;
    return this;
  }

   /**
   * 标题
   * @return cArticleTitle
  **/
  @ApiModelProperty(value = "标题")


  public String getCArticleTitle() {
    return cArticleTitle;
  }

  public void setCArticleTitle(String cArticleTitle) {
    this.cArticleTitle = cArticleTitle;
  }

  public ArticleDetail cArticlePoster(String cArticlePoster) {
    this.cArticlePoster = cArticlePoster;
    return this;
  }

   /**
   * 海报
   * @return cArticlePoster
  **/
  @ApiModelProperty(value = "海报")


  public String getCArticlePoster() {
    return cArticlePoster;
  }

  public void setCArticlePoster(String cArticlePoster) {
    this.cArticlePoster = cArticlePoster;
  }

  public ArticleDetail cArticleAuthor(String cArticleAuthor) {
    this.cArticleAuthor = cArticleAuthor;
    return this;
  }

   /**
   * 作者
   * @return cArticleAuthor
  **/
  @ApiModelProperty(value = "作者")


  public String getCArticleAuthor() {
    return cArticleAuthor;
  }

  public void setCArticleAuthor(String cArticleAuthor) {
    this.cArticleAuthor = cArticleAuthor;
  }

  public ArticleDetail cArticleCreatetime(Date cArticleCreatetime) {
    this.cArticleCreatetime = cArticleCreatetime;
    return this;
  }

   /**
   * 创建时间
   * @return cArticleCreatetime
  **/
  @ApiModelProperty(value = "创建时间")

  @Valid

  public Date getCArticleCreatetime() {
    return cArticleCreatetime;
  }

  public void setCArticleCreatetime(Date cArticleCreatetime) {
    this.cArticleCreatetime = cArticleCreatetime;
  }

  public ArticleDetail cArticleUpdatetime(Date cArticleUpdatetime) {
    this.cArticleUpdatetime = cArticleUpdatetime;
    return this;
  }

   /**
   * 修改时间
   * @return cArticleUpdatetime
  **/
  @ApiModelProperty(value = "修改时间")

  @Valid

  public Date getCArticleUpdatetime() {
    return cArticleUpdatetime;
  }

  public void setCArticleUpdatetime(Date cArticleUpdatetime) {
    this.cArticleUpdatetime = cArticleUpdatetime;
  }

  public ArticleDetail cArticleReleaseid(Long cArticleReleaseid) {
    this.cArticleReleaseid = cArticleReleaseid;
    return this;
  }

   /**
   * 发布人ID
   * @return cArticleReleaseid
  **/
  @ApiModelProperty(value = "发布人ID")


  public Long getCArticleReleaseid() {
    return cArticleReleaseid;
  }

  public void setCArticleReleaseid(Long cArticleReleaseid) {
    this.cArticleReleaseid = cArticleReleaseid;
  }

  public ArticleDetail cArticleReleaseTime(Date cArticleReleaseTime) {
    this.cArticleReleaseTime = cArticleReleaseTime;
    return this;
  }

   /**
   * 发布时间
   * @return cArticleReleaseTime
  **/
  @ApiModelProperty(value = "发布时间")

  @Valid

  public Date getCArticleReleaseTime() {
    return cArticleReleaseTime;
  }

  public void setCArticleReleaseTime(Date cArticleReleaseTime) {
    this.cArticleReleaseTime = cArticleReleaseTime;
  }

  public ArticleDetail cArticleStatus(Integer cArticleStatus) {
    this.cArticleStatus = cArticleStatus;
    return this;
  }

   /**
   * 状态
   * @return cArticleStatus
  **/
  @ApiModelProperty(value = "状态")


  public Integer getCArticleStatus() {
    return cArticleStatus;
  }

  public void setCArticleStatus(Integer cArticleStatus) {
    this.cArticleStatus = cArticleStatus;
  }

  public ArticleDetail cArticleAmount(Integer cArticleAmount) {
    this.cArticleAmount = cArticleAmount;
    return this;
  }

   /**
   * 浏览量
   * @return cArticleAmount
  **/
  @ApiModelProperty(value = "浏览量")


  public Integer getCArticleAmount() {
    return cArticleAmount;
  }

  public void setCArticleAmount(Integer cArticleAmount) {
    this.cArticleAmount = cArticleAmount;
  }

  public ArticleDetail cArticleResource(String cArticleResource) {
    this.cArticleResource = cArticleResource;
    return this;
  }

   /**
   * 来源
   * @return cArticleResource
  **/
  @ApiModelProperty(value = "来源")


  public String getCArticleResource() {
    return cArticleResource;
  }

  public void setCArticleResource(String cArticleResource) {
    this.cArticleResource = cArticleResource;
  }

  public ArticleDetail cArticleResourceUrl(String cArticleResourceUrl) {
    this.cArticleResourceUrl = cArticleResourceUrl;
    return this;
  }

   /**
   * 来源链接
   * @return cArticleResourceUrl
  **/
  @ApiModelProperty(value = "来源链接")


  public String getCArticleResourceUrl() {
    return cArticleResourceUrl;
  }

  public void setCArticleResourceUrl(String cArticleResourceUrl) {
    this.cArticleResourceUrl = cArticleResourceUrl;
  }

  public ArticleDetail cArticleSubtitle(String cArticleSubtitle) {
    this.cArticleSubtitle = cArticleSubtitle;
    return this;
  }

   /**
   * 副标题
   * @return cArticleSubtitle
  **/
  @ApiModelProperty(value = "副标题")


  public String getCArticleSubtitle() {
    return cArticleSubtitle;
  }

  public void setCArticleSubtitle(String cArticleSubtitle) {
    this.cArticleSubtitle = cArticleSubtitle;
  }

  public ArticleDetail cArticleDes(String cArticleDes) {
    this.cArticleDes = cArticleDes;
    return this;
  }

   /**
   * 描述
   * @return cArticleDes
  **/
  @ApiModelProperty(value = "描述")


  public String getCArticleDes() {
    return cArticleDes;
  }

  public void setCArticleDes(String cArticleDes) {
    this.cArticleDes = cArticleDes;
  }

  public ArticleDetail cArticleCategoryCode(String cArticleCategoryCode) {
    this.cArticleCategoryCode = cArticleCategoryCode;
    return this;
  }


  public String getcTemplatePath() {
    return cTemplatePath;
  }

  public void setcTemplatePath(String cTemplatePath) {
    this.cTemplatePath = cTemplatePath;
  }
   /**
   * 分类code
   * @return cArticleCategoryCode
  **/
  @ApiModelProperty(value = "分类code")

  public String getCArticleCategoryCode() {
    return cArticleCategoryCode;
  }

  public ArticleDetail(Long cArticleId,
                       Long cArticleCategoryId,
                       Long cArticleCreator,
                       String cArticleCreatorName,
                       String siteCode,
                       String cArticleTitle,
                       String cArticlePoster,
                       String cArticleAuthor,
                       Date cArticleCreatetime,
                       Date cArticleUpdatetime,
                       Long cArticleReleaseid,
                       Date cArticleReleaseTime,
                       Integer cArticleStatus,
                       Integer cArticleAmount,
                       String cArticleResource,
                       String cArticleResourceUrl,
                       String cArticleSubtitle,
                       String cArticleDes,
                       String cTemplatePath,
                       String cArticleCategoryCode) {

    this.cArticleId = cArticleId;
    this.cArticleCategoryId = cArticleCategoryId;
    this.cArticleCreator = cArticleCreator;
    this.cArticleCreatorName = cArticleCreatorName;
    this.siteCode = siteCode;
    this.cArticleTitle = cArticleTitle;
    this.cArticlePoster = cArticlePoster;
    this.cArticleAuthor = cArticleAuthor;
    this.cArticleCreatetime = cArticleCreatetime;
    this.cArticleUpdatetime = cArticleUpdatetime;
    this.cArticleReleaseid = cArticleReleaseid;
    this.cArticleReleaseTime = cArticleReleaseTime;
    this.cArticleStatus = cArticleStatus;
    this.cArticleAmount = cArticleAmount;
    this.cArticleResource = cArticleResource;
    this.cArticleResourceUrl = cArticleResourceUrl;
    this.cArticleSubtitle = cArticleSubtitle;
    this.cArticleDes = cArticleDes;
    this.cTemplatePath = cTemplatePath;
    this.cArticleCategoryCode = cArticleCategoryCode;
  }

  public void setCArticleCategoryCode(String cArticleCategoryCode) {
    this.cArticleCategoryCode = cArticleCategoryCode;
  }

  public ArticleDetail articleContents(List<ArticleDetailArticleContents> articleContents) {
    this.articleContents = articleContents;
    return this;
  }

  public ArticleDetail addArticleContentsItem(ArticleDetailArticleContents articleContentsItem) {
    if (this.articleContents == null) {
      this.articleContents = new ArrayList<ArticleDetailArticleContents>();
    }
    this.articleContents.add(articleContentsItem);
    return this;
  }

   /**
   * Get articleContents
   * @return articleContents
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ArticleDetailArticleContents> getArticleContents() {
    return articleContents;
  }

  public void setArticleContents(List<ArticleDetailArticleContents> articleContents) {
    this.articleContents = articleContents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArticleDetail articleDetail = (ArticleDetail) o;
    return Objects.equals(this.cArticleId, articleDetail.cArticleId) &&
        Objects.equals(this.cArticleCategoryId, articleDetail.cArticleCategoryId) &&
        Objects.equals(this.cArticleCreator, articleDetail.cArticleCreator) &&
        Objects.equals(this.siteCode, articleDetail.siteCode) &&
        Objects.equals(this.cArticleTitle, articleDetail.cArticleTitle) &&
        Objects.equals(this.cArticlePoster, articleDetail.cArticlePoster) &&
        Objects.equals(this.cArticleAuthor, articleDetail.cArticleAuthor) &&
        Objects.equals(this.cArticleCreatetime, articleDetail.cArticleCreatetime) &&
        Objects.equals(this.cArticleUpdatetime, articleDetail.cArticleUpdatetime) &&
        Objects.equals(this.cArticleReleaseid, articleDetail.cArticleReleaseid) &&
        Objects.equals(this.cArticleReleaseTime, articleDetail.cArticleReleaseTime) &&
        Objects.equals(this.cArticleStatus, articleDetail.cArticleStatus) &&
        Objects.equals(this.cArticleAmount, articleDetail.cArticleAmount) &&
        Objects.equals(this.cArticleResource, articleDetail.cArticleResource) &&
        Objects.equals(this.cArticleResourceUrl, articleDetail.cArticleResourceUrl) &&
        Objects.equals(this.cArticleSubtitle, articleDetail.cArticleSubtitle) &&
        Objects.equals(this.cArticleDes, articleDetail.cArticleDes) &&
        Objects.equals(this.cArticleCategoryCode, articleDetail.cArticleCategoryCode) &&
        Objects.equals(this.articleContents, articleDetail.articleContents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cArticleId, cArticleCategoryId, cArticleCreator, siteCode, cArticleTitle, cArticlePoster, cArticleAuthor, cArticleCreatetime, cArticleUpdatetime, cArticleReleaseid, cArticleReleaseTime, cArticleStatus, cArticleAmount, cArticleResource, cArticleResourceUrl, cArticleSubtitle, cArticleDes, cArticleCategoryCode, articleContents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleDetail {\n");

    sb.append("    cArticleId: ").append(toIndentedString(cArticleId)).append("\n");
    sb.append("    cArticleCategoryId: ").append(toIndentedString(cArticleCategoryId)).append("\n");
    sb.append("    cArticleCreator: ").append(toIndentedString(cArticleCreator)).append("\n");
    sb.append("    siteCode: ").append(toIndentedString(siteCode)).append("\n");
    sb.append("    cArticleTitle: ").append(toIndentedString(cArticleTitle)).append("\n");
    sb.append("    cArticlePoster: ").append(toIndentedString(cArticlePoster)).append("\n");
    sb.append("    cArticleAuthor: ").append(toIndentedString(cArticleAuthor)).append("\n");
    sb.append("    cArticleCreatetime: ").append(toIndentedString(cArticleCreatetime)).append("\n");
    sb.append("    cArticleUpdatetime: ").append(toIndentedString(cArticleUpdatetime)).append("\n");
    sb.append("    cArticleReleaseid: ").append(toIndentedString(cArticleReleaseid)).append("\n");
    sb.append("    cArticleReleaseTime: ").append(toIndentedString(cArticleReleaseTime)).append("\n");
    sb.append("    cArticleStatus: ").append(toIndentedString(cArticleStatus)).append("\n");
    sb.append("    cArticleAmount: ").append(toIndentedString(cArticleAmount)).append("\n");
    sb.append("    cArticleResource: ").append(toIndentedString(cArticleResource)).append("\n");
    sb.append("    cArticleResourceUrl: ").append(toIndentedString(cArticleResourceUrl)).append("\n");
    sb.append("    cArticleSubtitle: ").append(toIndentedString(cArticleSubtitle)).append("\n");
    sb.append("    cArticleDes: ").append(toIndentedString(cArticleDes)).append("\n");
    sb.append("    cArticleCategoryCode: ").append(toIndentedString(cArticleCategoryCode)).append("\n");
    sb.append("    articleContents: ").append(toIndentedString(articleContents)).append("\n");
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

