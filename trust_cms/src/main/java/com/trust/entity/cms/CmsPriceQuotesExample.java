package com.trust.entity.cms;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CmsPriceQuotesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsPriceQuotesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNewsIdIsNull() {
            addCriterion("news_id is null");
            return (Criteria) this;
        }

        public Criteria andNewsIdIsNotNull() {
            addCriterion("news_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsIdEqualTo(Long value) {
            addCriterion("news_id =", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotEqualTo(Long value) {
            addCriterion("news_id <>", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThan(Long value) {
            addCriterion("news_id >", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("news_id >=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThan(Long value) {
            addCriterion("news_id <", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThanOrEqualTo(Long value) {
            addCriterion("news_id <=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdIn(List<Long> values) {
            addCriterion("news_id in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotIn(List<Long> values) {
            addCriterion("news_id not in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdBetween(Long value1, Long value2) {
            addCriterion("news_id between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotBetween(Long value1, Long value2) {
            addCriterion("news_id not between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andCropsNameIsNull() {
            addCriterion("crops_name is null");
            return (Criteria) this;
        }

        public Criteria andCropsNameIsNotNull() {
            addCriterion("crops_name is not null");
            return (Criteria) this;
        }

        public Criteria andCropsNameEqualTo(String value) {
            addCriterion("crops_name =", value, "cropsName");
            return (Criteria) this;
        }

        public Criteria andCropsNameNotEqualTo(String value) {
            addCriterion("crops_name <>", value, "cropsName");
            return (Criteria) this;
        }

        public Criteria andCropsNameGreaterThan(String value) {
            addCriterion("crops_name >", value, "cropsName");
            return (Criteria) this;
        }

        public Criteria andCropsNameGreaterThanOrEqualTo(String value) {
            addCriterion("crops_name >=", value, "cropsName");
            return (Criteria) this;
        }

        public Criteria andCropsNameLessThan(String value) {
            addCriterion("crops_name <", value, "cropsName");
            return (Criteria) this;
        }

        public Criteria andCropsNameLessThanOrEqualTo(String value) {
            addCriterion("crops_name <=", value, "cropsName");
            return (Criteria) this;
        }

        public Criteria andCropsNameLike(String value) {
            addCriterion("crops_name like", value, "cropsName");
            return (Criteria) this;
        }

        public Criteria andCropsNameNotLike(String value) {
            addCriterion("crops_name not like", value, "cropsName");
            return (Criteria) this;
        }

        public Criteria andCropsNameIn(List<String> values) {
            addCriterion("crops_name in", values, "cropsName");
            return (Criteria) this;
        }

        public Criteria andCropsNameNotIn(List<String> values) {
            addCriterion("crops_name not in", values, "cropsName");
            return (Criteria) this;
        }

        public Criteria andCropsNameBetween(String value1, String value2) {
            addCriterion("crops_name between", value1, value2, "cropsName");
            return (Criteria) this;
        }

        public Criteria andCropsNameNotBetween(String value1, String value2) {
            addCriterion("crops_name not between", value1, value2, "cropsName");
            return (Criteria) this;
        }

        public Criteria andPriceLowIsNull() {
            addCriterion("price_low is null");
            return (Criteria) this;
        }

        public Criteria andPriceLowIsNotNull() {
            addCriterion("price_low is not null");
            return (Criteria) this;
        }

        public Criteria andPriceLowEqualTo(Float value) {
            addCriterion("price_low =", value, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowNotEqualTo(Float value) {
            addCriterion("price_low <>", value, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowGreaterThan(Float value) {
            addCriterion("price_low >", value, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowGreaterThanOrEqualTo(Float value) {
            addCriterion("price_low >=", value, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowLessThan(Float value) {
            addCriterion("price_low <", value, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowLessThanOrEqualTo(Float value) {
            addCriterion("price_low <=", value, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowIn(List<Float> values) {
            addCriterion("price_low in", values, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowNotIn(List<Float> values) {
            addCriterion("price_low not in", values, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowBetween(Float value1, Float value2) {
            addCriterion("price_low between", value1, value2, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowNotBetween(Float value1, Float value2) {
            addCriterion("price_low not between", value1, value2, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceHighIsNull() {
            addCriterion("price_high is null");
            return (Criteria) this;
        }

        public Criteria andPriceHighIsNotNull() {
            addCriterion("price_high is not null");
            return (Criteria) this;
        }

        public Criteria andPriceHighEqualTo(Float value) {
            addCriterion("price_high =", value, "priceHigh");
            return (Criteria) this;
        }

        public Criteria andPriceHighNotEqualTo(Float value) {
            addCriterion("price_high <>", value, "priceHigh");
            return (Criteria) this;
        }

        public Criteria andPriceHighGreaterThan(Float value) {
            addCriterion("price_high >", value, "priceHigh");
            return (Criteria) this;
        }

        public Criteria andPriceHighGreaterThanOrEqualTo(Float value) {
            addCriterion("price_high >=", value, "priceHigh");
            return (Criteria) this;
        }

        public Criteria andPriceHighLessThan(Float value) {
            addCriterion("price_high <", value, "priceHigh");
            return (Criteria) this;
        }

        public Criteria andPriceHighLessThanOrEqualTo(Float value) {
            addCriterion("price_high <=", value, "priceHigh");
            return (Criteria) this;
        }

        public Criteria andPriceHighIn(List<Float> values) {
            addCriterion("price_high in", values, "priceHigh");
            return (Criteria) this;
        }

        public Criteria andPriceHighNotIn(List<Float> values) {
            addCriterion("price_high not in", values, "priceHigh");
            return (Criteria) this;
        }

        public Criteria andPriceHighBetween(Float value1, Float value2) {
            addCriterion("price_high between", value1, value2, "priceHigh");
            return (Criteria) this;
        }

        public Criteria andPriceHighNotBetween(Float value1, Float value2) {
            addCriterion("price_high not between", value1, value2, "priceHigh");
            return (Criteria) this;
        }

        public Criteria andPriceLargeIsNull() {
            addCriterion("price_large is null");
            return (Criteria) this;
        }

        public Criteria andPriceLargeIsNotNull() {
            addCriterion("price_large is not null");
            return (Criteria) this;
        }

        public Criteria andPriceLargeEqualTo(Float value) {
            addCriterion("price_large =", value, "priceLarge");
            return (Criteria) this;
        }

        public Criteria andPriceLargeNotEqualTo(Float value) {
            addCriterion("price_large <>", value, "priceLarge");
            return (Criteria) this;
        }

        public Criteria andPriceLargeGreaterThan(Float value) {
            addCriterion("price_large >", value, "priceLarge");
            return (Criteria) this;
        }

        public Criteria andPriceLargeGreaterThanOrEqualTo(Float value) {
            addCriterion("price_large >=", value, "priceLarge");
            return (Criteria) this;
        }

        public Criteria andPriceLargeLessThan(Float value) {
            addCriterion("price_large <", value, "priceLarge");
            return (Criteria) this;
        }

        public Criteria andPriceLargeLessThanOrEqualTo(Float value) {
            addCriterion("price_large <=", value, "priceLarge");
            return (Criteria) this;
        }

        public Criteria andPriceLargeIn(List<Float> values) {
            addCriterion("price_large in", values, "priceLarge");
            return (Criteria) this;
        }

        public Criteria andPriceLargeNotIn(List<Float> values) {
            addCriterion("price_large not in", values, "priceLarge");
            return (Criteria) this;
        }

        public Criteria andPriceLargeBetween(Float value1, Float value2) {
            addCriterion("price_large between", value1, value2, "priceLarge");
            return (Criteria) this;
        }

        public Criteria andPriceLargeNotBetween(Float value1, Float value2) {
            addCriterion("price_large not between", value1, value2, "priceLarge");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeIsNull() {
            addCriterion("trading_volume is null");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeIsNotNull() {
            addCriterion("trading_volume is not null");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeEqualTo(Float value) {
            addCriterion("trading_volume =", value, "tradingVolume");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeNotEqualTo(Float value) {
            addCriterion("trading_volume <>", value, "tradingVolume");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeGreaterThan(Float value) {
            addCriterion("trading_volume >", value, "tradingVolume");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeGreaterThanOrEqualTo(Float value) {
            addCriterion("trading_volume >=", value, "tradingVolume");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeLessThan(Float value) {
            addCriterion("trading_volume <", value, "tradingVolume");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeLessThanOrEqualTo(Float value) {
            addCriterion("trading_volume <=", value, "tradingVolume");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeIn(List<Float> values) {
            addCriterion("trading_volume in", values, "tradingVolume");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeNotIn(List<Float> values) {
            addCriterion("trading_volume not in", values, "tradingVolume");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeBetween(Float value1, Float value2) {
            addCriterion("trading_volume between", value1, value2, "tradingVolume");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeNotBetween(Float value1, Float value2) {
            addCriterion("trading_volume not between", value1, value2, "tradingVolume");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andReleasedAtIsNull() {
            addCriterion("released_at is null");
            return (Criteria) this;
        }

        public Criteria andReleasedAtIsNotNull() {
            addCriterion("released_at is not null");
            return (Criteria) this;
        }

        public Criteria andReleasedAtEqualTo(Date value) {
            addCriterionForJDBCDate("released_at =", value, "releasedAt");
            return (Criteria) this;
        }

        public Criteria andReleasedAtNotEqualTo(Date value) {
            addCriterionForJDBCDate("released_at <>", value, "releasedAt");
            return (Criteria) this;
        }

        public Criteria andReleasedAtGreaterThan(Date value) {
            addCriterionForJDBCDate("released_at >", value, "releasedAt");
            return (Criteria) this;
        }

        public Criteria andReleasedAtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("released_at >=", value, "releasedAt");
            return (Criteria) this;
        }

        public Criteria andReleasedAtLessThan(Date value) {
            addCriterionForJDBCDate("released_at <", value, "releasedAt");
            return (Criteria) this;
        }

        public Criteria andReleasedAtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("released_at <=", value, "releasedAt");
            return (Criteria) this;
        }

        public Criteria andReleasedAtIn(List<Date> values) {
            addCriterionForJDBCDate("released_at in", values, "releasedAt");
            return (Criteria) this;
        }

        public Criteria andReleasedAtNotIn(List<Date> values) {
            addCriterionForJDBCDate("released_at not in", values, "releasedAt");
            return (Criteria) this;
        }

        public Criteria andReleasedAtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("released_at between", value1, value2, "releasedAt");
            return (Criteria) this;
        }

        public Criteria andReleasedAtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("released_at not between", value1, value2, "releasedAt");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(Byte value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(Byte value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(Byte value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(Byte value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(Byte value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(Byte value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<Byte> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<Byte> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(Byte value1, Byte value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(Byte value1, Byte value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andRefUrlIsNull() {
            addCriterion("ref_url is null");
            return (Criteria) this;
        }

        public Criteria andRefUrlIsNotNull() {
            addCriterion("ref_url is not null");
            return (Criteria) this;
        }

        public Criteria andRefUrlEqualTo(String value) {
            addCriterion("ref_url =", value, "refUrl");
            return (Criteria) this;
        }

        public Criteria andRefUrlNotEqualTo(String value) {
            addCriterion("ref_url <>", value, "refUrl");
            return (Criteria) this;
        }

        public Criteria andRefUrlGreaterThan(String value) {
            addCriterion("ref_url >", value, "refUrl");
            return (Criteria) this;
        }

        public Criteria andRefUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ref_url >=", value, "refUrl");
            return (Criteria) this;
        }

        public Criteria andRefUrlLessThan(String value) {
            addCriterion("ref_url <", value, "refUrl");
            return (Criteria) this;
        }

        public Criteria andRefUrlLessThanOrEqualTo(String value) {
            addCriterion("ref_url <=", value, "refUrl");
            return (Criteria) this;
        }

        public Criteria andRefUrlLike(String value) {
            addCriterion("ref_url like", value, "refUrl");
            return (Criteria) this;
        }

        public Criteria andRefUrlNotLike(String value) {
            addCriterion("ref_url not like", value, "refUrl");
            return (Criteria) this;
        }

        public Criteria andRefUrlIn(List<String> values) {
            addCriterion("ref_url in", values, "refUrl");
            return (Criteria) this;
        }

        public Criteria andRefUrlNotIn(List<String> values) {
            addCriterion("ref_url not in", values, "refUrl");
            return (Criteria) this;
        }

        public Criteria andRefUrlBetween(String value1, String value2) {
            addCriterion("ref_url between", value1, value2, "refUrl");
            return (Criteria) this;
        }

        public Criteria andRefUrlNotBetween(String value1, String value2) {
            addCriterion("ref_url not between", value1, value2, "refUrl");
            return (Criteria) this;
        }

        public Criteria andSysCodeIsNull() {
            addCriterion("sys_code is null");
            return (Criteria) this;
        }

        public Criteria andSysCodeIsNotNull() {
            addCriterion("sys_code is not null");
            return (Criteria) this;
        }

        public Criteria andSysCodeEqualTo(String value) {
            addCriterion("sys_code =", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotEqualTo(String value) {
            addCriterion("sys_code <>", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeGreaterThan(String value) {
            addCriterion("sys_code >", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sys_code >=", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLessThan(String value) {
            addCriterion("sys_code <", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLessThanOrEqualTo(String value) {
            addCriterion("sys_code <=", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLike(String value) {
            addCriterion("sys_code like", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotLike(String value) {
            addCriterion("sys_code not like", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeIn(List<String> values) {
            addCriterion("sys_code in", values, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotIn(List<String> values) {
            addCriterion("sys_code not in", values, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeBetween(String value1, String value2) {
            addCriterion("sys_code between", value1, value2, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotBetween(String value1, String value2) {
            addCriterion("sys_code not between", value1, value2, "sysCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNull() {
            addCriterion("category_code is null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNotNull() {
            addCriterion("category_code is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeEqualTo(String value) {
            addCriterion("category_code =", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotEqualTo(String value) {
            addCriterion("category_code <>", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThan(String value) {
            addCriterion("category_code >", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("category_code >=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThan(String value) {
            addCriterion("category_code <", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThanOrEqualTo(String value) {
            addCriterion("category_code <=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLike(String value) {
            addCriterion("category_code like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotLike(String value) {
            addCriterion("category_code not like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIn(List<String> values) {
            addCriterion("category_code in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotIn(List<String> values) {
            addCriterion("category_code not in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeBetween(String value1, String value2) {
            addCriterion("category_code between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotBetween(String value1, String value2) {
            addCriterion("category_code not between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCropsNameLikeInsensitive(String value) {
            addCriterion("upper(crops_name) like", value.toUpperCase(), "cropsName");
            return (Criteria) this;
        }

        public Criteria andSourceLikeInsensitive(String value) {
            addCriterion("upper(source) like", value.toUpperCase(), "source");
            return (Criteria) this;
        }

        public Criteria andCityLikeInsensitive(String value) {
            addCriterion("upper(city) like", value.toUpperCase(), "city");
            return (Criteria) this;
        }

        public Criteria andRefUrlLikeInsensitive(String value) {
            addCriterion("upper(ref_url) like", value.toUpperCase(), "refUrl");
            return (Criteria) this;
        }

        public Criteria andSysCodeLikeInsensitive(String value) {
            addCriterion("upper(sys_code) like", value.toUpperCase(), "sysCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLikeInsensitive(String value) {
            addCriterion("upper(category_code) like", value.toUpperCase(), "categoryCode");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}