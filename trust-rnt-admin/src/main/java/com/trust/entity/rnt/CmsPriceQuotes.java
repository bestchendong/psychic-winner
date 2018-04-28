package com.trust.entity.rnt;

import java.io.Serializable;
import java.util.Date;

public class CmsPriceQuotes implements Serializable {
    private Long id;

    private Long newsId;

    private String cropsName;

    private Float priceLow;

    private Float priceHigh;

    private Float priceLarge;

    private Float tradingVolume;

    private String source;

    private Date releasedAt;

    private String city;

    private Byte category;

    private Date createdAt;

    private String refUrl;

    private String sysCode;

    private String categoryCode;

    private static final long serialVersionUID = 1L;

    public CmsPriceQuotes(Long id, Long newsId, String cropsName, Float priceLow, Float priceHigh, Float priceLarge, Float tradingVolume, String source, Date releasedAt, String city, Byte category, Date createdAt, String refUrl, String sysCode, String categoryCode) {
        this.id = id;
        this.newsId = newsId;
        this.cropsName = cropsName;
        this.priceLow = priceLow;
        this.priceHigh = priceHigh;
        this.priceLarge = priceLarge;
        this.tradingVolume = tradingVolume;
        this.source = source;
        this.releasedAt = releasedAt;
        this.city = city;
        this.category = category;
        this.createdAt = createdAt;
        this.refUrl = refUrl;
        this.sysCode = sysCode;
        this.categoryCode = categoryCode;
    }

    public CmsPriceQuotes() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    public String getCropsName() {
        return cropsName;
    }

    public void setCropsName(String cropsName) {
        this.cropsName = cropsName == null ? null : cropsName.trim();
    }

    public Float getPriceLow() {
        return priceLow;
    }

    public void setPriceLow(Float priceLow) {
        this.priceLow = priceLow;
    }

    public Float getPriceHigh() {
        return priceHigh;
    }

    public void setPriceHigh(Float priceHigh) {
        this.priceHigh = priceHigh;
    }

    public Float getPriceLarge() {
        return priceLarge;
    }

    public void setPriceLarge(Float priceLarge) {
        this.priceLarge = priceLarge;
    }

    public Float getTradingVolume() {
        return tradingVolume;
    }

    public void setTradingVolume(Float tradingVolume) {
        this.tradingVolume = tradingVolume;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Date getReleasedAt() {
        return releasedAt;
    }

    public void setReleasedAt(Date releasedAt) {
        this.releasedAt = releasedAt;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Byte getCategory() {
        return category;
    }

    public void setCategory(Byte category) {
        this.category = category;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getRefUrl() {
        return refUrl;
    }

    public void setRefUrl(String refUrl) {
        this.refUrl = refUrl == null ? null : refUrl.trim();
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode == null ? null : sysCode.trim();
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode == null ? null : categoryCode.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CmsPriceQuotes other = (CmsPriceQuotes) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getNewsId() == null ? other.getNewsId() == null : this.getNewsId().equals(other.getNewsId()))
            && (this.getCropsName() == null ? other.getCropsName() == null : this.getCropsName().equals(other.getCropsName()))
            && (this.getPriceLow() == null ? other.getPriceLow() == null : this.getPriceLow().equals(other.getPriceLow()))
            && (this.getPriceHigh() == null ? other.getPriceHigh() == null : this.getPriceHigh().equals(other.getPriceHigh()))
            && (this.getPriceLarge() == null ? other.getPriceLarge() == null : this.getPriceLarge().equals(other.getPriceLarge()))
            && (this.getTradingVolume() == null ? other.getTradingVolume() == null : this.getTradingVolume().equals(other.getTradingVolume()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getReleasedAt() == null ? other.getReleasedAt() == null : this.getReleasedAt().equals(other.getReleasedAt()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getRefUrl() == null ? other.getRefUrl() == null : this.getRefUrl().equals(other.getRefUrl()))
            && (this.getSysCode() == null ? other.getSysCode() == null : this.getSysCode().equals(other.getSysCode()))
            && (this.getCategoryCode() == null ? other.getCategoryCode() == null : this.getCategoryCode().equals(other.getCategoryCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNewsId() == null) ? 0 : getNewsId().hashCode());
        result = prime * result + ((getCropsName() == null) ? 0 : getCropsName().hashCode());
        result = prime * result + ((getPriceLow() == null) ? 0 : getPriceLow().hashCode());
        result = prime * result + ((getPriceHigh() == null) ? 0 : getPriceHigh().hashCode());
        result = prime * result + ((getPriceLarge() == null) ? 0 : getPriceLarge().hashCode());
        result = prime * result + ((getTradingVolume() == null) ? 0 : getTradingVolume().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getReleasedAt() == null) ? 0 : getReleasedAt().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getRefUrl() == null) ? 0 : getRefUrl().hashCode());
        result = prime * result + ((getSysCode() == null) ? 0 : getSysCode().hashCode());
        result = prime * result + ((getCategoryCode() == null) ? 0 : getCategoryCode().hashCode());
        return result;
    }
}