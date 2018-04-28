package com.trust.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.trust.utils.DateUtil;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * RntVersion
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-15T03:06:26.991Z")

public class RntVersion  implements Serializable {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("sysName")
  private String sysName = null;

  @JsonProperty("versionCode")
  private String versionCode = null;

  @JsonProperty("applicationMarket")
  private String applicationMarket = null;

  @JsonProperty("downloadUrl")
  private String downloadUrl = null;

  @JsonProperty("versionDes")
  private String versionDes = null;

  @JsonProperty("publishTime")
  private String publishTime = null;

  @JsonProperty("versionNum")
  private Integer versionNum = null;

  public RntVersion(Long id, String sysName, String versionCode, String applicationMarket, String downloadUrl,Date publishTime, String versionDes,Integer versionNum) {
    this.id = id;
    this.sysName = sysName;
    this.versionNum = versionNum;
    this.applicationMarket = applicationMarket;
    this.downloadUrl = downloadUrl;
    this.publishTime = DateUtil.formatDate(publishTime);
    this.versionDes = versionDes;
    this.versionCode = versionCode;
  }


   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

   /**
   * 系统名称
   * @return sysName
  **/
  @ApiModelProperty(value = "系统名称")


  public String getSysName() {
    return sysName;
  }

  public void setSysName(String sysName) {
    this.sysName = sysName;
  }


   /**
   * 版本号
   * @return versionNum
  **/
  @ApiModelProperty(value = "版本号")


  public Integer getVersionNum() {
    return versionNum;
  }

  public String getVersionCode() {
    return versionCode;
  }

  public void setVersionCode(String versionCode) {
    this.versionCode = versionCode;
  }

  public void setVersionNum(Integer versionNum) {
    this.versionNum = versionNum;
  }

  /**
   * 发布时间
   * @return
   */
  public String getPublishTime() {
    return publishTime;
  }

  public void setPublishTime(Date publishTime) {
    this.publishTime = DateUtil.formatDate(publishTime);
  }

   /**
   * 应用市场
   * @return applicationMarket
  **/
  @ApiModelProperty(value = "应用市场")


  public String getApplicationMarket() {
    return applicationMarket;
  }

  public void setApplicationMarket(String applicationMarket) {
    this.applicationMarket = applicationMarket;
  }



   /**
   * 下载地址
   * @return downloadUrl
  **/
  @ApiModelProperty(value = "下载地址")


  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

   /**
   * 版本介绍
   * @return versionDes
  **/
  @ApiModelProperty(value = "版本介绍")


  public String getVersionDes() {
    return versionDes;
  }

  public void setVersionDes(String versionDes) {
    this.versionDes = versionDes;
  }
}

