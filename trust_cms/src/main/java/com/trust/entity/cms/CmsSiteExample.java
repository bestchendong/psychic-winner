package com.trust.entity.cms;

import java.util.ArrayList;
import java.util.List;

public class CmsSiteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsSiteExample() {
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

        public Criteria andCSiteNameIsNull() {
            addCriterion("c_site_name is null");
            return (Criteria) this;
        }

        public Criteria andCSiteNameIsNotNull() {
            addCriterion("c_site_name is not null");
            return (Criteria) this;
        }

        public Criteria andCSiteNameEqualTo(String value) {
            addCriterion("c_site_name =", value, "cSiteName");
            return (Criteria) this;
        }

        public Criteria andCSiteNameNotEqualTo(String value) {
            addCriterion("c_site_name <>", value, "cSiteName");
            return (Criteria) this;
        }

        public Criteria andCSiteNameGreaterThan(String value) {
            addCriterion("c_site_name >", value, "cSiteName");
            return (Criteria) this;
        }

        public Criteria andCSiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_site_name >=", value, "cSiteName");
            return (Criteria) this;
        }

        public Criteria andCSiteNameLessThan(String value) {
            addCriterion("c_site_name <", value, "cSiteName");
            return (Criteria) this;
        }

        public Criteria andCSiteNameLessThanOrEqualTo(String value) {
            addCriterion("c_site_name <=", value, "cSiteName");
            return (Criteria) this;
        }

        public Criteria andCSiteNameLike(String value) {
            addCriterion("c_site_name like", value, "cSiteName");
            return (Criteria) this;
        }

        public Criteria andCSiteNameNotLike(String value) {
            addCriterion("c_site_name not like", value, "cSiteName");
            return (Criteria) this;
        }

        public Criteria andCSiteNameIn(List<String> values) {
            addCriterion("c_site_name in", values, "cSiteName");
            return (Criteria) this;
        }

        public Criteria andCSiteNameNotIn(List<String> values) {
            addCriterion("c_site_name not in", values, "cSiteName");
            return (Criteria) this;
        }

        public Criteria andCSiteNameBetween(String value1, String value2) {
            addCriterion("c_site_name between", value1, value2, "cSiteName");
            return (Criteria) this;
        }

        public Criteria andCSiteNameNotBetween(String value1, String value2) {
            addCriterion("c_site_name not between", value1, value2, "cSiteName");
            return (Criteria) this;
        }

        public Criteria andCSiteCodeIsNull() {
            addCriterion("c_site_code is null");
            return (Criteria) this;
        }

        public Criteria andCSiteCodeIsNotNull() {
            addCriterion("c_site_code is not null");
            return (Criteria) this;
        }

        public Criteria andCSiteCodeEqualTo(String value) {
            addCriterion("c_site_code =", value, "cSiteCode");
            return (Criteria) this;
        }

        public Criteria andCSiteCodeNotEqualTo(String value) {
            addCriterion("c_site_code <>", value, "cSiteCode");
            return (Criteria) this;
        }

        public Criteria andCSiteCodeGreaterThan(String value) {
            addCriterion("c_site_code >", value, "cSiteCode");
            return (Criteria) this;
        }

        public Criteria andCSiteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("c_site_code >=", value, "cSiteCode");
            return (Criteria) this;
        }

        public Criteria andCSiteCodeLessThan(String value) {
            addCriterion("c_site_code <", value, "cSiteCode");
            return (Criteria) this;
        }

        public Criteria andCSiteCodeLessThanOrEqualTo(String value) {
            addCriterion("c_site_code <=", value, "cSiteCode");
            return (Criteria) this;
        }

        public Criteria andCSiteCodeLike(String value) {
            addCriterion("c_site_code like", value, "cSiteCode");
            return (Criteria) this;
        }

        public Criteria andCSiteCodeNotLike(String value) {
            addCriterion("c_site_code not like", value, "cSiteCode");
            return (Criteria) this;
        }

        public Criteria andCSiteCodeIn(List<String> values) {
            addCriterion("c_site_code in", values, "cSiteCode");
            return (Criteria) this;
        }

        public Criteria andCSiteCodeNotIn(List<String> values) {
            addCriterion("c_site_code not in", values, "cSiteCode");
            return (Criteria) this;
        }

        public Criteria andCSiteCodeBetween(String value1, String value2) {
            addCriterion("c_site_code between", value1, value2, "cSiteCode");
            return (Criteria) this;
        }

        public Criteria andCSiteCodeNotBetween(String value1, String value2) {
            addCriterion("c_site_code not between", value1, value2, "cSiteCode");
            return (Criteria) this;
        }

        public Criteria andCSiteStatusIsNull() {
            addCriterion("c_site_status is null");
            return (Criteria) this;
        }

        public Criteria andCSiteStatusIsNotNull() {
            addCriterion("c_site_status is not null");
            return (Criteria) this;
        }

        public Criteria andCSiteStatusEqualTo(Integer value) {
            addCriterion("c_site_status =", value, "cSiteStatus");
            return (Criteria) this;
        }

        public Criteria andCSiteStatusNotEqualTo(Integer value) {
            addCriterion("c_site_status <>", value, "cSiteStatus");
            return (Criteria) this;
        }

        public Criteria andCSiteStatusGreaterThan(Integer value) {
            addCriterion("c_site_status >", value, "cSiteStatus");
            return (Criteria) this;
        }

        public Criteria andCSiteStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_site_status >=", value, "cSiteStatus");
            return (Criteria) this;
        }

        public Criteria andCSiteStatusLessThan(Integer value) {
            addCriterion("c_site_status <", value, "cSiteStatus");
            return (Criteria) this;
        }

        public Criteria andCSiteStatusLessThanOrEqualTo(Integer value) {
            addCriterion("c_site_status <=", value, "cSiteStatus");
            return (Criteria) this;
        }

        public Criteria andCSiteStatusIn(List<Integer> values) {
            addCriterion("c_site_status in", values, "cSiteStatus");
            return (Criteria) this;
        }

        public Criteria andCSiteStatusNotIn(List<Integer> values) {
            addCriterion("c_site_status not in", values, "cSiteStatus");
            return (Criteria) this;
        }

        public Criteria andCSiteStatusBetween(Integer value1, Integer value2) {
            addCriterion("c_site_status between", value1, value2, "cSiteStatus");
            return (Criteria) this;
        }

        public Criteria andCSiteStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("c_site_status not between", value1, value2, "cSiteStatus");
            return (Criteria) this;
        }

        public Criteria andCSiteNameLikeInsensitive(String value) {
            addCriterion("upper(c_site_name) like", value.toUpperCase(), "cSiteName");
            return (Criteria) this;
        }

        public Criteria andCSiteCodeLikeInsensitive(String value) {
            addCriterion("upper(c_site_code) like", value.toUpperCase(), "cSiteCode");
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