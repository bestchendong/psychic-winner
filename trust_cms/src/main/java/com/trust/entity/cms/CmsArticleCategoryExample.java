package com.trust.entity.cms;

import java.util.ArrayList;
import java.util.List;

public class CmsArticleCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsArticleCategoryExample() {
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

        public Criteria andCCategoryIdIsNull() {
            addCriterion("c_category_id is null");
            return (Criteria) this;
        }

        public Criteria andCCategoryIdIsNotNull() {
            addCriterion("c_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCCategoryIdEqualTo(Long value) {
            addCriterion("c_category_id =", value, "cCategoryId");
            return (Criteria) this;
        }

        public Criteria andCCategoryIdNotEqualTo(Long value) {
            addCriterion("c_category_id <>", value, "cCategoryId");
            return (Criteria) this;
        }

        public Criteria andCCategoryIdGreaterThan(Long value) {
            addCriterion("c_category_id >", value, "cCategoryId");
            return (Criteria) this;
        }

        public Criteria andCCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("c_category_id >=", value, "cCategoryId");
            return (Criteria) this;
        }

        public Criteria andCCategoryIdLessThan(Long value) {
            addCriterion("c_category_id <", value, "cCategoryId");
            return (Criteria) this;
        }

        public Criteria andCCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("c_category_id <=", value, "cCategoryId");
            return (Criteria) this;
        }

        public Criteria andCCategoryIdIn(List<Long> values) {
            addCriterion("c_category_id in", values, "cCategoryId");
            return (Criteria) this;
        }

        public Criteria andCCategoryIdNotIn(List<Long> values) {
            addCriterion("c_category_id not in", values, "cCategoryId");
            return (Criteria) this;
        }

        public Criteria andCCategoryIdBetween(Long value1, Long value2) {
            addCriterion("c_category_id between", value1, value2, "cCategoryId");
            return (Criteria) this;
        }

        public Criteria andCCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("c_category_id not between", value1, value2, "cCategoryId");
            return (Criteria) this;
        }

        public Criteria andCSiteIdIsNull() {
            addCriterion("c_site_id is null");
            return (Criteria) this;
        }

        public Criteria andCSiteIdIsNotNull() {
            addCriterion("c_site_id is not null");
            return (Criteria) this;
        }

        public Criteria andCSiteIdEqualTo(Long value) {
            addCriterion("c_site_id =", value, "cSiteId");
            return (Criteria) this;
        }

        public Criteria andCSiteIdNotEqualTo(Long value) {
            addCriterion("c_site_id <>", value, "cSiteId");
            return (Criteria) this;
        }

        public Criteria andCSiteIdGreaterThan(Long value) {
            addCriterion("c_site_id >", value, "cSiteId");
            return (Criteria) this;
        }

        public Criteria andCSiteIdGreaterThanOrEqualTo(Long value) {
            addCriterion("c_site_id >=", value, "cSiteId");
            return (Criteria) this;
        }

        public Criteria andCSiteIdLessThan(Long value) {
            addCriterion("c_site_id <", value, "cSiteId");
            return (Criteria) this;
        }

        public Criteria andCSiteIdLessThanOrEqualTo(Long value) {
            addCriterion("c_site_id <=", value, "cSiteId");
            return (Criteria) this;
        }

        public Criteria andCSiteIdIn(List<Long> values) {
            addCriterion("c_site_id in", values, "cSiteId");
            return (Criteria) this;
        }

        public Criteria andCSiteIdNotIn(List<Long> values) {
            addCriterion("c_site_id not in", values, "cSiteId");
            return (Criteria) this;
        }

        public Criteria andCSiteIdBetween(Long value1, Long value2) {
            addCriterion("c_site_id between", value1, value2, "cSiteId");
            return (Criteria) this;
        }

        public Criteria andCSiteIdNotBetween(Long value1, Long value2) {
            addCriterion("c_site_id not between", value1, value2, "cSiteId");
            return (Criteria) this;
        }

        public Criteria andCPidIsNull() {
            addCriterion("c_pid is null");
            return (Criteria) this;
        }

        public Criteria andCPidIsNotNull() {
            addCriterion("c_pid is not null");
            return (Criteria) this;
        }

        public Criteria andCPidEqualTo(Long value) {
            addCriterion("c_pid =", value, "cPid");
            return (Criteria) this;
        }

        public Criteria andCPidNotEqualTo(Long value) {
            addCriterion("c_pid <>", value, "cPid");
            return (Criteria) this;
        }

        public Criteria andCPidGreaterThan(Long value) {
            addCriterion("c_pid >", value, "cPid");
            return (Criteria) this;
        }

        public Criteria andCPidGreaterThanOrEqualTo(Long value) {
            addCriterion("c_pid >=", value, "cPid");
            return (Criteria) this;
        }

        public Criteria andCPidLessThan(Long value) {
            addCriterion("c_pid <", value, "cPid");
            return (Criteria) this;
        }

        public Criteria andCPidLessThanOrEqualTo(Long value) {
            addCriterion("c_pid <=", value, "cPid");
            return (Criteria) this;
        }

        public Criteria andCPidIn(List<Long> values) {
            addCriterion("c_pid in", values, "cPid");
            return (Criteria) this;
        }

        public Criteria andCPidNotIn(List<Long> values) {
            addCriterion("c_pid not in", values, "cPid");
            return (Criteria) this;
        }

        public Criteria andCPidBetween(Long value1, Long value2) {
            addCriterion("c_pid between", value1, value2, "cPid");
            return (Criteria) this;
        }

        public Criteria andCPidNotBetween(Long value1, Long value2) {
            addCriterion("c_pid not between", value1, value2, "cPid");
            return (Criteria) this;
        }

        public Criteria andCCategoryCodeIsNull() {
            addCriterion("c_category_code is null");
            return (Criteria) this;
        }

        public Criteria andCCategoryCodeIsNotNull() {
            addCriterion("c_category_code is not null");
            return (Criteria) this;
        }

        public Criteria andCCategoryCodeEqualTo(String value) {
            addCriterion("c_category_code =", value, "cCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCCategoryCodeNotEqualTo(String value) {
            addCriterion("c_category_code <>", value, "cCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCCategoryCodeGreaterThan(String value) {
            addCriterion("c_category_code >", value, "cCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCCategoryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("c_category_code >=", value, "cCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCCategoryCodeLessThan(String value) {
            addCriterion("c_category_code <", value, "cCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCCategoryCodeLessThanOrEqualTo(String value) {
            addCriterion("c_category_code <=", value, "cCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCCategoryCodeLike(String value) {
            addCriterion("c_category_code like", value, "cCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCCategoryCodeNotLike(String value) {
            addCriterion("c_category_code not like", value, "cCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCCategoryCodeIn(List<String> values) {
            addCriterion("c_category_code in", values, "cCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCCategoryCodeNotIn(List<String> values) {
            addCriterion("c_category_code not in", values, "cCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCCategoryCodeBetween(String value1, String value2) {
            addCriterion("c_category_code between", value1, value2, "cCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCCategoryCodeNotBetween(String value1, String value2) {
            addCriterion("c_category_code not between", value1, value2, "cCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCCategoryNameIsNull() {
            addCriterion("c_category_name is null");
            return (Criteria) this;
        }

        public Criteria andCCategoryNameIsNotNull() {
            addCriterion("c_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCCategoryNameEqualTo(String value) {
            addCriterion("c_category_name =", value, "cCategoryName");
            return (Criteria) this;
        }

        public Criteria andCCategoryNameNotEqualTo(String value) {
            addCriterion("c_category_name <>", value, "cCategoryName");
            return (Criteria) this;
        }

        public Criteria andCCategoryNameGreaterThan(String value) {
            addCriterion("c_category_name >", value, "cCategoryName");
            return (Criteria) this;
        }

        public Criteria andCCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_category_name >=", value, "cCategoryName");
            return (Criteria) this;
        }

        public Criteria andCCategoryNameLessThan(String value) {
            addCriterion("c_category_name <", value, "cCategoryName");
            return (Criteria) this;
        }

        public Criteria andCCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("c_category_name <=", value, "cCategoryName");
            return (Criteria) this;
        }

        public Criteria andCCategoryNameLike(String value) {
            addCriterion("c_category_name like", value, "cCategoryName");
            return (Criteria) this;
        }

        public Criteria andCCategoryNameNotLike(String value) {
            addCriterion("c_category_name not like", value, "cCategoryName");
            return (Criteria) this;
        }

        public Criteria andCCategoryNameIn(List<String> values) {
            addCriterion("c_category_name in", values, "cCategoryName");
            return (Criteria) this;
        }

        public Criteria andCCategoryNameNotIn(List<String> values) {
            addCriterion("c_category_name not in", values, "cCategoryName");
            return (Criteria) this;
        }

        public Criteria andCCategoryNameBetween(String value1, String value2) {
            addCriterion("c_category_name between", value1, value2, "cCategoryName");
            return (Criteria) this;
        }

        public Criteria andCCategoryNameNotBetween(String value1, String value2) {
            addCriterion("c_category_name not between", value1, value2, "cCategoryName");
            return (Criteria) this;
        }

        public Criteria andCCategoryStatusIsNull() {
            addCriterion("c_category_status is null");
            return (Criteria) this;
        }

        public Criteria andCCategoryStatusIsNotNull() {
            addCriterion("c_category_status is not null");
            return (Criteria) this;
        }

        public Criteria andCCategoryStatusEqualTo(Integer value) {
            addCriterion("c_category_status =", value, "cCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andCCategoryStatusNotEqualTo(Integer value) {
            addCriterion("c_category_status <>", value, "cCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andCCategoryStatusGreaterThan(Integer value) {
            addCriterion("c_category_status >", value, "cCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andCCategoryStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_category_status >=", value, "cCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andCCategoryStatusLessThan(Integer value) {
            addCriterion("c_category_status <", value, "cCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andCCategoryStatusLessThanOrEqualTo(Integer value) {
            addCriterion("c_category_status <=", value, "cCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andCCategoryStatusIn(List<Integer> values) {
            addCriterion("c_category_status in", values, "cCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andCCategoryStatusNotIn(List<Integer> values) {
            addCriterion("c_category_status not in", values, "cCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andCCategoryStatusBetween(Integer value1, Integer value2) {
            addCriterion("c_category_status between", value1, value2, "cCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andCCategoryStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("c_category_status not between", value1, value2, "cCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andCCategoryDescribeIsNull() {
            addCriterion("c_category_describe is null");
            return (Criteria) this;
        }

        public Criteria andCCategoryDescribeIsNotNull() {
            addCriterion("c_category_describe is not null");
            return (Criteria) this;
        }

        public Criteria andCCategoryDescribeEqualTo(String value) {
            addCriterion("c_category_describe =", value, "cCategoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCCategoryDescribeNotEqualTo(String value) {
            addCriterion("c_category_describe <>", value, "cCategoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCCategoryDescribeGreaterThan(String value) {
            addCriterion("c_category_describe >", value, "cCategoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCCategoryDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("c_category_describe >=", value, "cCategoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCCategoryDescribeLessThan(String value) {
            addCriterion("c_category_describe <", value, "cCategoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCCategoryDescribeLessThanOrEqualTo(String value) {
            addCriterion("c_category_describe <=", value, "cCategoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCCategoryDescribeLike(String value) {
            addCriterion("c_category_describe like", value, "cCategoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCCategoryDescribeNotLike(String value) {
            addCriterion("c_category_describe not like", value, "cCategoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCCategoryDescribeIn(List<String> values) {
            addCriterion("c_category_describe in", values, "cCategoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCCategoryDescribeNotIn(List<String> values) {
            addCriterion("c_category_describe not in", values, "cCategoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCCategoryDescribeBetween(String value1, String value2) {
            addCriterion("c_category_describe between", value1, value2, "cCategoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCCategoryDescribeNotBetween(String value1, String value2) {
            addCriterion("c_category_describe not between", value1, value2, "cCategoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCCategoryImageIsNull() {
            addCriterion("c_category_image is null");
            return (Criteria) this;
        }

        public Criteria andCCategoryImageIsNotNull() {
            addCriterion("c_category_image is not null");
            return (Criteria) this;
        }

        public Criteria andCCategoryImageEqualTo(String value) {
            addCriterion("c_category_image =", value, "cCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCCategoryImageNotEqualTo(String value) {
            addCriterion("c_category_image <>", value, "cCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCCategoryImageGreaterThan(String value) {
            addCriterion("c_category_image >", value, "cCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCCategoryImageGreaterThanOrEqualTo(String value) {
            addCriterion("c_category_image >=", value, "cCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCCategoryImageLessThan(String value) {
            addCriterion("c_category_image <", value, "cCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCCategoryImageLessThanOrEqualTo(String value) {
            addCriterion("c_category_image <=", value, "cCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCCategoryImageLike(String value) {
            addCriterion("c_category_image like", value, "cCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCCategoryImageNotLike(String value) {
            addCriterion("c_category_image not like", value, "cCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCCategoryImageIn(List<String> values) {
            addCriterion("c_category_image in", values, "cCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCCategoryImageNotIn(List<String> values) {
            addCriterion("c_category_image not in", values, "cCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCCategoryImageBetween(String value1, String value2) {
            addCriterion("c_category_image between", value1, value2, "cCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCCategoryImageNotBetween(String value1, String value2) {
            addCriterion("c_category_image not between", value1, value2, "cCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCCategoryLevelIsNull() {
            addCriterion("c_category_level is null");
            return (Criteria) this;
        }

        public Criteria andCCategoryLevelIsNotNull() {
            addCriterion("c_category_level is not null");
            return (Criteria) this;
        }

        public Criteria andCCategoryLevelEqualTo(Integer value) {
            addCriterion("c_category_level =", value, "cCategoryLevel");
            return (Criteria) this;
        }

        public Criteria andCCategoryLevelNotEqualTo(Integer value) {
            addCriterion("c_category_level <>", value, "cCategoryLevel");
            return (Criteria) this;
        }

        public Criteria andCCategoryLevelGreaterThan(Integer value) {
            addCriterion("c_category_level >", value, "cCategoryLevel");
            return (Criteria) this;
        }

        public Criteria andCCategoryLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_category_level >=", value, "cCategoryLevel");
            return (Criteria) this;
        }

        public Criteria andCCategoryLevelLessThan(Integer value) {
            addCriterion("c_category_level <", value, "cCategoryLevel");
            return (Criteria) this;
        }

        public Criteria andCCategoryLevelLessThanOrEqualTo(Integer value) {
            addCriterion("c_category_level <=", value, "cCategoryLevel");
            return (Criteria) this;
        }

        public Criteria andCCategoryLevelIn(List<Integer> values) {
            addCriterion("c_category_level in", values, "cCategoryLevel");
            return (Criteria) this;
        }

        public Criteria andCCategoryLevelNotIn(List<Integer> values) {
            addCriterion("c_category_level not in", values, "cCategoryLevel");
            return (Criteria) this;
        }

        public Criteria andCCategoryLevelBetween(Integer value1, Integer value2) {
            addCriterion("c_category_level between", value1, value2, "cCategoryLevel");
            return (Criteria) this;
        }

        public Criteria andCCategoryLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("c_category_level not between", value1, value2, "cCategoryLevel");
            return (Criteria) this;
        }

        public Criteria andCCategoryCodeLikeInsensitive(String value) {
            addCriterion("upper(c_category_code) like", value.toUpperCase(), "cCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCCategoryNameLikeInsensitive(String value) {
            addCriterion("upper(c_category_name) like", value.toUpperCase(), "cCategoryName");
            return (Criteria) this;
        }

        public Criteria andCCategoryDescribeLikeInsensitive(String value) {
            addCriterion("upper(c_category_describe) like", value.toUpperCase(), "cCategoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCCategoryImageLikeInsensitive(String value) {
            addCriterion("upper(c_category_image) like", value.toUpperCase(), "cCategoryImage");
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