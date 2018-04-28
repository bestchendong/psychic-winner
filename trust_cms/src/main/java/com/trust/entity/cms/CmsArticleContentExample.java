package com.trust.entity.cms;

import java.util.ArrayList;
import java.util.List;

public class CmsArticleContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsArticleContentExample() {
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

        public Criteria andCArticleContentIdIsNull() {
            addCriterion("c_article_content_id is null");
            return (Criteria) this;
        }

        public Criteria andCArticleContentIdIsNotNull() {
            addCriterion("c_article_content_id is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleContentIdEqualTo(Long value) {
            addCriterion("c_article_content_id =", value, "cArticleContentId");
            return (Criteria) this;
        }

        public Criteria andCArticleContentIdNotEqualTo(Long value) {
            addCriterion("c_article_content_id <>", value, "cArticleContentId");
            return (Criteria) this;
        }

        public Criteria andCArticleContentIdGreaterThan(Long value) {
            addCriterion("c_article_content_id >", value, "cArticleContentId");
            return (Criteria) this;
        }

        public Criteria andCArticleContentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("c_article_content_id >=", value, "cArticleContentId");
            return (Criteria) this;
        }

        public Criteria andCArticleContentIdLessThan(Long value) {
            addCriterion("c_article_content_id <", value, "cArticleContentId");
            return (Criteria) this;
        }

        public Criteria andCArticleContentIdLessThanOrEqualTo(Long value) {
            addCriterion("c_article_content_id <=", value, "cArticleContentId");
            return (Criteria) this;
        }

        public Criteria andCArticleContentIdIn(List<Long> values) {
            addCriterion("c_article_content_id in", values, "cArticleContentId");
            return (Criteria) this;
        }

        public Criteria andCArticleContentIdNotIn(List<Long> values) {
            addCriterion("c_article_content_id not in", values, "cArticleContentId");
            return (Criteria) this;
        }

        public Criteria andCArticleContentIdBetween(Long value1, Long value2) {
            addCriterion("c_article_content_id between", value1, value2, "cArticleContentId");
            return (Criteria) this;
        }

        public Criteria andCArticleContentIdNotBetween(Long value1, Long value2) {
            addCriterion("c_article_content_id not between", value1, value2, "cArticleContentId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdIsNull() {
            addCriterion("c_article_id is null");
            return (Criteria) this;
        }

        public Criteria andCArticleIdIsNotNull() {
            addCriterion("c_article_id is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleIdEqualTo(Long value) {
            addCriterion("c_article_id =", value, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdNotEqualTo(Long value) {
            addCriterion("c_article_id <>", value, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdGreaterThan(Long value) {
            addCriterion("c_article_id >", value, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("c_article_id >=", value, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdLessThan(Long value) {
            addCriterion("c_article_id <", value, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdLessThanOrEqualTo(Long value) {
            addCriterion("c_article_id <=", value, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdIn(List<Long> values) {
            addCriterion("c_article_id in", values, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdNotIn(List<Long> values) {
            addCriterion("c_article_id not in", values, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdBetween(Long value1, Long value2) {
            addCriterion("c_article_id between", value1, value2, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdNotBetween(Long value1, Long value2) {
            addCriterion("c_article_id not between", value1, value2, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleContentIsNull() {
            addCriterion("c_article_content is null");
            return (Criteria) this;
        }

        public Criteria andCArticleContentIsNotNull() {
            addCriterion("c_article_content is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleContentEqualTo(String value) {
            addCriterion("c_article_content =", value, "cArticleContent");
            return (Criteria) this;
        }

        public Criteria andCArticleContentNotEqualTo(String value) {
            addCriterion("c_article_content <>", value, "cArticleContent");
            return (Criteria) this;
        }

        public Criteria andCArticleContentGreaterThan(String value) {
            addCriterion("c_article_content >", value, "cArticleContent");
            return (Criteria) this;
        }

        public Criteria andCArticleContentGreaterThanOrEqualTo(String value) {
            addCriterion("c_article_content >=", value, "cArticleContent");
            return (Criteria) this;
        }

        public Criteria andCArticleContentLessThan(String value) {
            addCriterion("c_article_content <", value, "cArticleContent");
            return (Criteria) this;
        }

        public Criteria andCArticleContentLessThanOrEqualTo(String value) {
            addCriterion("c_article_content <=", value, "cArticleContent");
            return (Criteria) this;
        }

        public Criteria andCArticleContentLike(String value) {
            addCriterion("c_article_content like", value, "cArticleContent");
            return (Criteria) this;
        }

        public Criteria andCArticleContentNotLike(String value) {
            addCriterion("c_article_content not like", value, "cArticleContent");
            return (Criteria) this;
        }

        public Criteria andCArticleContentIn(List<String> values) {
            addCriterion("c_article_content in", values, "cArticleContent");
            return (Criteria) this;
        }

        public Criteria andCArticleContentNotIn(List<String> values) {
            addCriterion("c_article_content not in", values, "cArticleContent");
            return (Criteria) this;
        }

        public Criteria andCArticleContentBetween(String value1, String value2) {
            addCriterion("c_article_content between", value1, value2, "cArticleContent");
            return (Criteria) this;
        }

        public Criteria andCArticleContentNotBetween(String value1, String value2) {
            addCriterion("c_article_content not between", value1, value2, "cArticleContent");
            return (Criteria) this;
        }

        public Criteria andCContentIndexIsNull() {
            addCriterion("c_content_index is null");
            return (Criteria) this;
        }

        public Criteria andCContentIndexIsNotNull() {
            addCriterion("c_content_index is not null");
            return (Criteria) this;
        }

        public Criteria andCContentIndexEqualTo(Integer value) {
            addCriterion("c_content_index =", value, "cContentIndex");
            return (Criteria) this;
        }

        public Criteria andCContentIndexNotEqualTo(Integer value) {
            addCriterion("c_content_index <>", value, "cContentIndex");
            return (Criteria) this;
        }

        public Criteria andCContentIndexGreaterThan(Integer value) {
            addCriterion("c_content_index >", value, "cContentIndex");
            return (Criteria) this;
        }

        public Criteria andCContentIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_content_index >=", value, "cContentIndex");
            return (Criteria) this;
        }

        public Criteria andCContentIndexLessThan(Integer value) {
            addCriterion("c_content_index <", value, "cContentIndex");
            return (Criteria) this;
        }

        public Criteria andCContentIndexLessThanOrEqualTo(Integer value) {
            addCriterion("c_content_index <=", value, "cContentIndex");
            return (Criteria) this;
        }

        public Criteria andCContentIndexIn(List<Integer> values) {
            addCriterion("c_content_index in", values, "cContentIndex");
            return (Criteria) this;
        }

        public Criteria andCContentIndexNotIn(List<Integer> values) {
            addCriterion("c_content_index not in", values, "cContentIndex");
            return (Criteria) this;
        }

        public Criteria andCContentIndexBetween(Integer value1, Integer value2) {
            addCriterion("c_content_index between", value1, value2, "cContentIndex");
            return (Criteria) this;
        }

        public Criteria andCContentIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("c_content_index not between", value1, value2, "cContentIndex");
            return (Criteria) this;
        }

        public Criteria andCContentTypeIsNull() {
            addCriterion("c_content_type is null");
            return (Criteria) this;
        }

        public Criteria andCContentTypeIsNotNull() {
            addCriterion("c_content_type is not null");
            return (Criteria) this;
        }

        public Criteria andCContentTypeEqualTo(Integer value) {
            addCriterion("c_content_type =", value, "cContentType");
            return (Criteria) this;
        }

        public Criteria andCContentTypeNotEqualTo(Integer value) {
            addCriterion("c_content_type <>", value, "cContentType");
            return (Criteria) this;
        }

        public Criteria andCContentTypeGreaterThan(Integer value) {
            addCriterion("c_content_type >", value, "cContentType");
            return (Criteria) this;
        }

        public Criteria andCContentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_content_type >=", value, "cContentType");
            return (Criteria) this;
        }

        public Criteria andCContentTypeLessThan(Integer value) {
            addCriterion("c_content_type <", value, "cContentType");
            return (Criteria) this;
        }

        public Criteria andCContentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("c_content_type <=", value, "cContentType");
            return (Criteria) this;
        }

        public Criteria andCContentTypeIn(List<Integer> values) {
            addCriterion("c_content_type in", values, "cContentType");
            return (Criteria) this;
        }

        public Criteria andCContentTypeNotIn(List<Integer> values) {
            addCriterion("c_content_type not in", values, "cContentType");
            return (Criteria) this;
        }

        public Criteria andCContentTypeBetween(Integer value1, Integer value2) {
            addCriterion("c_content_type between", value1, value2, "cContentType");
            return (Criteria) this;
        }

        public Criteria andCContentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("c_content_type not between", value1, value2, "cContentType");
            return (Criteria) this;
        }

        public Criteria andCArticleContentLikeInsensitive(String value) {
            addCriterion("upper(c_article_content) like", value.toUpperCase(), "cArticleContent");
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