package com.trust.entity.rnt;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * PriceQuotes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-15T03:06:26.991Z")

public class PriceQuotes  implements Serializable {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("cropsName")
  private String cropsName = null;

  @JsonProperty("priceLow")
  private Float priceLow = null;

  @JsonProperty("priceHigh")
  private Float priceHigh = null;

  @JsonProperty("priceLarge")
  private Float priceLarge = null;

  @JsonProperty("tradingVolume")
  private Float tradingVolume = null;

  @JsonProperty("releasedAt")
  private Date releasedAt = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("categoryCode")
  private String categoryCode = null;

  public PriceQuotes id(Long id) {
    this.id = id;
    return this;
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

  public PriceQuotes cropsName(String cropsName) {
    this.cropsName = cropsName;
    return this;
  }

   /**
   * 品种名称
   * @return cropsName
  **/
  @ApiModelProperty(value = "品种名称")


  public String getCropsName() {
    return cropsName;
  }

  public void setCropsName(String cropsName) {
    this.cropsName = cropsName;
  }

  public PriceQuotes priceLow(Float priceLow) {
    this.priceLow = priceLow;
    return this;
  }

   /**
   * 最低价
   * @return priceLow
  **/
  @ApiModelProperty(value = "最低价")


  public Float getPriceLow() {
    return priceLow;
  }

  public void setPriceLow(Float priceLow) {
    this.priceLow = priceLow;
  }

  public PriceQuotes priceHigh(Float priceHigh) {
    this.priceHigh = priceHigh;
    return this;
  }

  public PriceQuotes(Long id, String cropsName, Float priceLow, Float priceHigh, Float priceLarge, Float tradingVolume, Date releasedAt, String city, String categoryCode) {
    this.id = id;
    this.cropsName = cropsName;
    this.priceLow = priceLow;
    this.priceHigh = priceHigh;
    this.priceLarge = priceLarge;
    this.tradingVolume = tradingVolume;
    this.releasedAt = releasedAt;
    this.city = city;
    this.categoryCode = categoryCode;
  }

  /**

   * 最高价
   * @return priceHigh
  **/
  @ApiModelProperty(value = "最高价")


  public Float getPriceHigh() {
    return priceHigh;
  }

  public void setPriceHigh(Float priceHigh) {
    this.priceHigh = priceHigh;
  }

  public PriceQuotes priceLarge(Float priceLarge) {
    this.priceLarge = priceLarge;
    return this;
  }

   /**
   * 大宗价
   * @return priceLarge
  **/
  @ApiModelProperty(value = "大宗价")


  public Float getPriceLarge() {
    return priceLarge;
  }

  public void setPriceLarge(Float priceLarge) {
    this.priceLarge = priceLarge;
  }

  public PriceQuotes tradingVolume(Float tradingVolume) {
    this.tradingVolume = tradingVolume;
    return this;
  }

   /**
   * 交易量单位吨
   * @return tradingVolume
  **/
  @ApiModelProperty(value = "交易量单位吨")


  public Float getTradingVolume() {
    return tradingVolume;
  }

  public void setTradingVolume(Float tradingVolume) {
    this.tradingVolume = tradingVolume;
  }

  public PriceQuotes releasedAt(Date releasedAt) {
    this.releasedAt = releasedAt;
    return this;
  }

   /**
   * 公布时间
   * @return releasedAt
  **/
  @ApiModelProperty(value = "公布时间")

  @Valid

  public Date getReleasedAt() {
    return releasedAt;
  }

  public void setReleasedAt(Date releasedAt) {
    this.releasedAt = releasedAt;
  }

  public PriceQuotes city(String city) {
    this.city = city;
    return this;
  }

   /**
   * 城市
   * @return city
  **/
  @ApiModelProperty(value = "城市")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PriceQuotes categoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
    return this;
  }

   /**
   * 分类编码
   * @return categoryCode
  **/
  @ApiModelProperty(value = "分类编码")


  public String getCategoryCode() {
    return categoryCode;
  }

  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceQuotes priceQuotes = (PriceQuotes) o;
    return Objects.equals(this.id, priceQuotes.id) &&
        Objects.equals(this.cropsName, priceQuotes.cropsName) &&
        Objects.equals(this.priceLow, priceQuotes.priceLow) &&
        Objects.equals(this.priceHigh, priceQuotes.priceHigh) &&
        Objects.equals(this.priceLarge, priceQuotes.priceLarge) &&
        Objects.equals(this.tradingVolume, priceQuotes.tradingVolume) &&
        Objects.equals(this.releasedAt, priceQuotes.releasedAt) &&
        Objects.equals(this.city, priceQuotes.city) &&
        Objects.equals(this.categoryCode, priceQuotes.categoryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cropsName, priceLow, priceHigh, priceLarge, tradingVolume, releasedAt, city, categoryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceQuotes {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cropsName: ").append(toIndentedString(cropsName)).append("\n");
    sb.append("    priceLow: ").append(toIndentedString(priceLow)).append("\n");
    sb.append("    priceHigh: ").append(toIndentedString(priceHigh)).append("\n");
    sb.append("    priceLarge: ").append(toIndentedString(priceLarge)).append("\n");
    sb.append("    tradingVolume: ").append(toIndentedString(tradingVolume)).append("\n");
    sb.append("    releasedAt: ").append(toIndentedString(releasedAt)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
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