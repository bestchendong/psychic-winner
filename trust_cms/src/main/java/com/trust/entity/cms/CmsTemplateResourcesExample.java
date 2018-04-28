package com.trust.entity.cms;

import java.util.ArrayList;
import java.util.List;

public class CmsTemplateResourcesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsTemplateResourcesExample() {
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

        public Criteria andCTemplateResourceIdIsNull() {
            addCriterion("c_template_resource_id is null");
            return (Criteria) this;
        }

        public Criteria andCTemplateResourceIdIsNotNull() {
            addCriterion("c_template_resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andCTemplateResourceIdEqualTo(Long value) {
            addCriterion("c_template_resource_id =", value, "cTemplateResourceId");
            return (Criteria) this;
        }

        public Criteria andCTemplateResourceIdNotEqualTo(Long value) {
            addCriterion("c_template_resource_id <>", value, "cTemplateResourceId");
            return (Criteria) this;
        }

        public Criteria andCTemplateResourceIdGreaterThan(Long value) {
            addCriterion("c_template_resource_id >", value, "cTemplateResourceId");
            return (Criteria) this;
        }

        public Criteria andCTemplateResourceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("c_template_resource_id >=", value, "cTemplateResourceId");
            return (Criteria) this;
        }

        public Criteria andCTemplateResourceIdLessThan(Long value) {
            addCriterion("c_template_resource_id <", value, "cTemplateResourceId");
            return (Criteria) this;
        }

        public Criteria andCTemplateResourceIdLessThanOrEqualTo(Long value) {
            addCriterion("c_template_resource_id <=", value, "cTemplateResourceId");
            return (Criteria) this;
        }

        public Criteria andCTemplateResourceIdIn(List<Long> values) {
            addCriterion("c_template_resource_id in", values, "cTemplateResourceId");
            return (Criteria) this;
        }

        public Criteria andCTemplateResourceIdNotIn(List<Long> values) {
            addCriterion("c_template_resource_id not in", values, "cTemplateResourceId");
            return (Criteria) this;
        }

        public Criteria andCTemplateResourceIdBetween(Long value1, Long value2) {
            addCriterion("c_template_resource_id between", value1, value2, "cTemplateResourceId");
            return (Criteria) this;
        }

        public Criteria andCTemplateResourceIdNotBetween(Long value1, Long value2) {
            addCriterion("c_template_resource_id not between", value1, value2, "cTemplateResourceId");
            return (Criteria) this;
        }

        public Criteria andCTemplateIdIsNull() {
            addCriterion("c_template_id is null");
            return (Criteria) this;
        }

        public Criteria andCTemplateIdIsNotNull() {
            addCriterion("c_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andCTemplateIdEqualTo(Long value) {
            addCriterion("c_template_id =", value, "cTemplateId");
            return (Criteria) this;
        }

        public Criteria andCTemplateIdNotEqualTo(Long value) {
            addCriterion("c_template_id <>", value, "cTemplateId");
            return (Criteria) this;
        }

        public Criteria andCTemplateIdGreaterThan(Long value) {
            addCriterion("c_template_id >", value, "cTemplateId");
            return (Criteria) this;
        }

        public Criteria andCTemplateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("c_template_id >=", value, "cTemplateId");
            return (Criteria) this;
        }

        public Criteria andCTemplateIdLessThan(Long value) {
            addCriterion("c_template_id <", value, "cTemplateId");
            return (Criteria) this;
        }

        public Criteria andCTemplateIdLessThanOrEqualTo(Long value) {
            addCriterion("c_template_id <=", value, "cTemplateId");
            return (Criteria) this;
        }

        public Criteria andCTemplateIdIn(List<Long> values) {
            addCriterion("c_template_id in", values, "cTemplateId");
            return (Criteria) this;
        }

        public Criteria andCTemplateIdNotIn(List<Long> values) {
            addCriterion("c_template_id not in", values, "cTemplateId");
            return (Criteria) this;
        }

        public Criteria andCTemplateIdBetween(Long value1, Long value2) {
            addCriterion("c_template_id between", value1, value2, "cTemplateId");
            return (Criteria) this;
        }

        public Criteria andCTemplateIdNotBetween(Long value1, Long value2) {
            addCriterion("c_template_id not between", value1, value2, "cTemplateId");
            return (Criteria) this;
        }

        public Criteria andCTemplatePathIsNull() {
            addCriterion("c_template_path is null");
            return (Criteria) this;
        }

        public Criteria andCTemplatePathIsNotNull() {
            addCriterion("c_template_path is not null");
            return (Criteria) this;
        }

        public Criteria andCTemplatePathEqualTo(String value) {
            addCriterion("c_template_path =", value, "cTemplatePath");
            return (Criteria) this;
        }

        public Criteria andCTemplatePathNotEqualTo(String value) {
            addCriterion("c_template_path <>", value, "cTemplatePath");
            return (Criteria) this;
        }

        public Criteria andCTemplatePathGreaterThan(String value) {
            addCriterion("c_template_path >", value, "cTemplatePath");
            return (Criteria) this;
        }

        public Criteria andCTemplatePathGreaterThanOrEqualTo(String value) {
            addCriterion("c_template_path >=", value, "cTemplatePath");
            return (Criteria) this;
        }

        public Criteria andCTemplatePathLessThan(String value) {
            addCriterion("c_template_path <", value, "cTemplatePath");
            return (Criteria) this;
        }

        public Criteria andCTemplatePathLessThanOrEqualTo(String value) {
            addCriterion("c_template_path <=", value, "cTemplatePath");
            return (Criteria) this;
        }

        public Criteria andCTemplatePathLike(String value) {
            addCriterion("c_template_path like", value, "cTemplatePath");
            return (Criteria) this;
        }

        public Criteria andCTemplatePathNotLike(String value) {
            addCriterion("c_template_path not like", value, "cTemplatePath");
            return (Criteria) this;
        }

        public Criteria andCTemplatePathIn(List<String> values) {
            addCriterion("c_template_path in", values, "cTemplatePath");
            return (Criteria) this;
        }

        public Criteria andCTemplatePathNotIn(List<String> values) {
            addCriterion("c_template_path not in", values, "cTemplatePath");
            return (Criteria) this;
        }

        public Criteria andCTemplatePathBetween(String value1, String value2) {
            addCriterion("c_template_path between", value1, value2, "cTemplatePath");
            return (Criteria) this;
        }

        public Criteria andCTemplatePathNotBetween(String value1, String value2) {
            addCriterion("c_template_path not between", value1, value2, "cTemplatePath");
            return (Criteria) this;
        }

        public Criteria andCTemplateAccessTypeIsNull() {
            addCriterion("c_template_access_type is null");
            return (Criteria) this;
        }

        public Criteria andCTemplateAccessTypeIsNotNull() {
            addCriterion("c_template_access_type is not null");
            return (Criteria) this;
        }

        public Criteria andCTemplateAccessTypeEqualTo(String value) {
            addCriterion("c_template_access_type =", value, "cTemplateAccessType");
            return (Criteria) this;
        }

        public Criteria andCTemplateAccessTypeNotEqualTo(String value) {
            addCriterion("c_template_access_type <>", value, "cTemplateAccessType");
            return (Criteria) this;
        }

        public Criteria andCTemplateAccessTypeGreaterThan(String value) {
            addCriterion("c_template_access_type >", value, "cTemplateAccessType");
            return (Criteria) this;
        }

        public Criteria andCTemplateAccessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_template_access_type >=", value, "cTemplateAccessType");
            return (Criteria) this;
        }

        public Criteria andCTemplateAccessTypeLessThan(String value) {
            addCriterion("c_template_access_type <", value, "cTemplateAccessType");
            return (Criteria) this;
        }

        public Criteria andCTemplateAccessTypeLessThanOrEqualTo(String value) {
            addCriterion("c_template_access_type <=", value, "cTemplateAccessType");
            return (Criteria) this;
        }

        public Criteria andCTemplateAccessTypeLike(String value) {
            addCriterion("c_template_access_type like", value, "cTemplateAccessType");
            return (Criteria) this;
        }

        public Criteria andCTemplateAccessTypeNotLike(String value) {
            addCriterion("c_template_access_type not like", value, "cTemplateAccessType");
            return (Criteria) this;
        }

        public Criteria andCTemplateAccessTypeIn(List<String> values) {
            addCriterion("c_template_access_type in", values, "cTemplateAccessType");
            return (Criteria) this;
        }

        public Criteria andCTemplateAccessTypeNotIn(List<String> values) {
            addCriterion("c_template_access_type not in", values, "cTemplateAccessType");
            return (Criteria) this;
        }

        public Criteria andCTemplateAccessTypeBetween(String value1, String value2) {
            addCriterion("c_template_access_type between", value1, value2, "cTemplateAccessType");
            return (Criteria) this;
        }

        public Criteria andCTemplateAccessTypeNotBetween(String value1, String value2) {
            addCriterion("c_template_access_type not between", value1, value2, "cTemplateAccessType");
            return (Criteria) this;
        }

        public Criteria andCTemplatePathLikeInsensitive(String value) {
            addCriterion("upper(c_template_path) like", value.toUpperCase(), "cTemplatePath");
            return (Criteria) this;
        }

        public Criteria andCTemplateAccessTypeLikeInsensitive(String value) {
            addCriterion("upper(c_template_access_type) like", value.toUpperCase(), "cTemplateAccessType");
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