package com.trust.entity.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ArticleDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-15T03:06:26.991Z")

public class ArticleDetail  implements Serializable {
  @JsonProperty("carticleId")
  private Long carticleId = null;

  @JsonProperty("carticleCategoryId")
  private Long carticleCategoryId = null;

  @JsonProperty("carticleCreator")
  private Long carticleCreator = null;

  @JsonProperty("carticleCreatorName")
  private String carticleCreatorName = null;

  @JsonProperty("siteCode")
  private String siteCode = null;

  @JsonProperty("carticleTitle")
  private String carticleTitle = null;

  @JsonProperty("carticlePoster")
  private String carticlePoster = null;

  @JsonProperty("carticleAuthor")
  private String carticleAuthor = null;

  @JsonProperty("carticleCreatetime")
  private Date carticleCreatetime = null;

  @JsonProperty("carticleUpdatetime")
  private Date carticleUpdatetime = null;

  @JsonProperty("carticleReleaseid")
  private Long carticleReleaseid = null;

  @JsonProperty("carticleReleaseTime")
  private Date carticleReleaseTime = null;

  @JsonProperty("carticleStatus")
  private Integer carticleStatus = null;

  @JsonProperty("carticleAmount")
  private Integer carticleAmount = null;

  @JsonProperty("carticleResource")
  private String carticleResource = null;

  @JsonProperty("carticleResourceUrl")
  private String carticleResourceUrl = null;

  @JsonProperty("carticleSubtitle")
  private String carticleSubtitle = null;

  @JsonProperty("carticleDes")
  private String carticleDes = null;

  @JsonProperty("ctemplatePath")
  private String ctemplatePath = null;

  @JsonProperty("carticleCategoryCode")
  private String carticleCategoryCode = null;

  @JsonProperty("articleContents")
  private List<ArticleDetailArticleContents> articleContents = null;

  public ArticleDetail carticleId(Long cArticleId) {
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

  public void setCArticleId(Long carticleId) {
    this.carticleId = carticleId;
  }

  public ArticleDetail carticleCategoryId(Long carticleCategoryId) {
    this.carticleCategoryId = carticleCategoryId;
    return this;
  }

   /**
   * 分类ID
   * @return cArticleCategoryId
  **/
  @ApiModelProperty(value = "分类ID")


  public Long getCarticleCategoryId() {
    return carticleCategoryId;
  }

  public void setCarticleCategoryId(Long carticleCategoryId) {
    this.carticleCategoryId = carticleCategoryId;
  }

  public ArticleDetail carticleCreator(Long carticleCreator) {
    this.carticleCreator = carticleCreator;
    return this;
  }


   /**
   * 创建人ID
   * @return cArticleCreator
  **/
  @ApiModelProperty(value = "创建人ID")


  public Long getCarticleCreator() {
    return carticleCreator;
  }

  public void setCarticleCreator(Long carticleCreator) {
    this.carticleCreator = carticleCreator;
  }

  public ArticleDetail siteCode(String siteCode) {
    this.siteCode = siteCode;
    return this;
  }

  /**
   * 创建人名字
   * @return
   */
  public String getcarticleCreatorName() {
    return carticleCreatorName;
  }

  public void setcarticleCreatorName(String carticleCreatorName) {
    this.carticleCreatorName = carticleCreatorName;
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

  public ArticleDetail carticleTitle(String carticleTitle) {
    this.carticleTitle = carticleTitle;
    return this;
  }

   /**
   * 标题
   * @return cArticleTitle
  **/
  @ApiModelProperty(value = "标题")


  public String getCarticleTitle() {
    return carticleTitle;
  }

  public void setCarticleTitle(String carticleTitle) {
    this.carticleTitle = carticleTitle;
  }

  public ArticleDetail carticlePoster(String carticlePoster) {
    this.carticlePoster = carticlePoster;
    return this;
  }

   /**
   * 海报
   * @return cArticlePoster
  **/
  @ApiModelProperty(value = "海报")


  public String getCarticlePoster() {
    return carticlePoster;
  }

  public void setCarticlePoster(String carticlePoster) {
    this.carticlePoster = carticlePoster;
  }

  public ArticleDetail carticleAuthor(String carticleAuthor) {
    this.carticleAuthor = carticleAuthor;
    return this;
  }

   /**
   * 作者
   * @return cArticleAuthor
  **/
  @ApiModelProperty(value = "作者")


  public String getCarticleAuthor() {
    return carticleAuthor;
  }

  public void setCarticleAuthor(String cArticleAuthor) {
    this.carticleAuthor = carticleAuthor;
  }

  public ArticleDetail carticleCreatetime(Date carticleCreatetime) {
    this.carticleCreatetime = carticleCreatetime;
    return this;
  }

   /**
   * 创建时间
   * @return cArticleCreatetime
  **/
  @ApiModelProperty(value = "创建时间")

  @Valid

  public Date getCarticleCreatetime() {
    return carticleCreatetime;
  }

  public void setCarticleCreatetime(Date carticleCreatetime) {
    this.carticleCreatetime = carticleCreatetime;
  }

  public ArticleDetail carticleUpdatetime(Date carticleUpdatetime) {
    this.carticleUpdatetime = carticleUpdatetime;
    return this;
  }

   /**
   * 修改时间
   * @return cArticleUpdatetime
  **/
  @ApiModelProperty(value = "修改时间")

  @Valid

  public Date getCarticleUpdatetime() {
    return carticleUpdatetime;
  }

  public void setCarticleUpdatetime(Date carticleUpdatetime) {
    this.carticleUpdatetime = carticleUpdatetime;
  }

  public ArticleDetail carticleReleaseid(Long carticleReleaseid) {
    this.carticleReleaseid = carticleReleaseid;
    return this;
  }

   /**
   * 发布人ID
   * @return cArticleReleaseid
  **/
  @ApiModelProperty(value = "发布人ID")


  public Long getCarticleReleaseid() {
    return carticleReleaseid;
  }

  public void setCaArticleReleaseid(Long carticleReleaseid) {
    this.carticleReleaseid = carticleReleaseid;
  }

  public ArticleDetail carticleReleaseTime(Date carticleReleaseTime) {
    this.carticleReleaseTime = carticleReleaseTime;
    return this;
  }

   /**
   * 发布时间
   * @return cArticleReleaseTime
  **/
  @ApiModelProperty(value = "发布时间")

  @Valid

  public Date getCarticleReleaseTime() {
    return carticleReleaseTime;
  }

  public void setCarticleReleaseTime(Date carticleReleaseTime) {
    this.carticleReleaseTime = carticleReleaseTime;
  }

  public ArticleDetail carticleStatus(Integer carticleStatus) {
    this.carticleStatus = carticleStatus;
    return this;
  }

   /**
   * 状态
   * @return cArticleStatus
  **/
  @ApiModelProperty(value = "状态")


  public Integer getCarticleStatus() {
    return carticleStatus;
  }

  public void setCarticleStatus(Integer carticleStatus) {
    this.carticleStatus = carticleStatus;
  }

  public ArticleDetail carticleAmount(Integer carticleAmount) {
    this.carticleAmount = carticleAmount;
    return this;
  }

   /**
   * 浏览量
   * @return cArticleAmount
  **/
  @ApiModelProperty(value = "浏览量")


  public Integer getCarticleAmount() {
    return carticleAmount;
  }

  public void setCarticleAmount(Integer carticleAmount) {
    this.carticleAmount = carticleAmount;
  }

  public ArticleDetail cArticleResource(String carticleResource) {
    this.carticleResource = carticleResource;
    return this;
  }

   /**
   * 来源
   * @return cArticleResource
  **/
  @ApiModelProperty(value = "来源")


  public String getCarticleResource() {
    return carticleResource;
  }

  public void setCarticleResource(String carticleResource) {
    this.carticleResource = carticleResource;
  }

  public ArticleDetail carticleResourceUrl(String carticleResourceUrl) {
    this.carticleResourceUrl = carticleResourceUrl;
    return this;
  }

   /**
   * 来源链接
   * @return cArticleResourceUrl
  **/
  @ApiModelProperty(value = "来源链接")


  public String getCarticleResourceUrl() {
    return carticleResourceUrl;
  }

  public void setCarticleResourceUrl(String carticleResourceUrl) {
    this.carticleResourceUrl = carticleResourceUrl;
  }

  public ArticleDetail carticleSubtitle(String carticleSubtitle) {
    this.carticleSubtitle = carticleSubtitle;
    return this;
  }

   /**
   * 副标题
   * @return cArticleSubtitle
  **/
  @ApiModelProperty(value = "副标题")


  public String getCarticleSubtitle() {
    return carticleSubtitle;
  }

  public void setCarticleSubtitle(String carticleSubtitle) {
    this.carticleSubtitle = carticleSubtitle;
  }

  public ArticleDetail carticleDes(String carticleDes) {
    this.carticleDes = carticleDes;
    return this;
  }

   /**
   * 描述
   * @return cArticleDes
  **/
  @ApiModelProperty(value = "描述")


  public String getCarticleDes() {
    return carticleDes;
  }

  public void setCarticleDes(String cArticleDes) {
    this.carticleDes = carticleDes;
  }

  public ArticleDetail carticleCategoryCode(String carticleCategoryCode) {
    this.carticleCategoryCode = carticleCategoryCode;
    return this;
  }


  public String getctemplatePath() {
    return ctemplatePath;
  }

  public void setcTemplatePath(String ctemplatePath) {
    this.ctemplatePath = ctemplatePath;
  }
   /**
   * 分类code
   * @return cArticleCategoryCode
  **/
  @ApiModelProperty(value = "分类code")

  public String getCarticleCategoryCode() {
    return carticleCategoryCode;
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

    this.carticleId = cArticleId;
    this.carticleCategoryId = cArticleCategoryId;
    this.carticleCreator = cArticleCreator;
    this.carticleCreatorName = cArticleCreatorName;
    this.siteCode = siteCode;
    this.carticleTitle = cArticleTitle;
    this.carticlePoster = cArticlePoster;
    this.carticleAuthor = cArticleAuthor;
    this.carticleCreatetime = cArticleCreatetime;
    this.carticleUpdatetime = cArticleUpdatetime;
    this.carticleReleaseid = cArticleReleaseid;
    this.carticleReleaseTime = cArticleReleaseTime;
    this.carticleStatus = cArticleStatus;
    this.carticleAmount = cArticleAmount;
    this.carticleResource = cArticleResource;
    this.carticleResourceUrl = cArticleResourceUrl;
    this.carticleSubtitle = cArticleSubtitle;
    this.carticleDes = cArticleDes;
    this.ctemplatePath = cTemplatePath;
    this.carticleCategoryCode = cArticleCategoryCode;
  }

  public void setCArticleCategoryCode(String cArticleCategoryCode) {
    this.carticleCategoryCode = carticleCategoryCode;
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

