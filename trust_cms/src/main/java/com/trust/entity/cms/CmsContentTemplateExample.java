package com.trust.entity.cms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmsContentTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsContentTemplateExample() {
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

        public Criteria andCContentTemplateIdIsNull() {
            addCriterion("c_content_template_id is null");
            return (Criteria) this;
        }

        public Criteria andCContentTemplateIdIsNotNull() {
            addCriterion("c_content_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andCContentTemplateIdEqualTo(Long value) {
            addCriterion("c_content_template_id =", value, "cContentTemplateId");
            return (Criteria) this;
        }

        public Criteria andCContentTemplateIdNotEqualTo(Long value) {
            addCriterion("c_content_template_id <>", value, "cContentTemplateId");
            return (Criteria) this;
        }

        public Criteria andCContentTemplateIdGreaterThan(Long value) {
            addCriterion("c_content_template_id >", value, "cContentTemplateId");
            return (Criteria) this;
        }

        public Criteria andCContentTemplateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("c_content_template_id >=", value, "cContentTemplateId");
            return (Criteria) this;
        }

        public Criteria andCContentTemplateIdLessThan(Long value) {
            addCriterion("c_content_template_id <", value, "cContentTemplateId");
            return (Criteria) this;
        }

        public Criteria andCContentTemplateIdLessThanOrEqualTo(Long value) {
            addCriterion("c_content_template_id <=", value, "cContentTemplateId");
            return (Criteria) this;
        }

        public Criteria andCContentTemplateIdIn(List<Long> values) {
            addCriterion("c_content_template_id in", values, "cContentTemplateId");
            return (Criteria) this;
        }

        public Criteria andCContentTemplateIdNotIn(List<Long> values) {
            addCriterion("c_content_template_id not in", values, "cContentTemplateId");
            return (Criteria) this;
        }

        public Criteria andCContentTemplateIdBetween(Long value1, Long value2) {
            addCriterion("c_content_template_id between", value1, value2, "cContentTemplateId");
            return (Criteria) this;
        }

        public Criteria andCContentTemplateIdNotBetween(Long value1, Long value2) {
            addCriterion("c_content_template_id not between", value1, value2, "cContentTemplateId");
            return (Criteria) this;
        }

        public Criteria andCTemplateNameIsNull() {
            addCriterion("c_template_name is null");
            return (Criteria) this;
        }

        public Criteria andCTemplateNameIsNotNull() {
            addCriterion("c_template_name is not null");
            return (Criteria) this;
        }

        public Criteria andCTemplateNameEqualTo(String value) {
            addCriterion("c_template_name =", value, "cTemplateName");
            return (Criteria) this;
        }

        public Criteria andCTemplateNameNotEqualTo(String value) {
            addCriterion("c_template_name <>", value, "cTemplateName");
            return (Criteria) this;
        }

        public Criteria andCTemplateNameGreaterThan(String value) {
            addCriterion("c_template_name >", value, "cTemplateName");
            return (Criteria) this;
        }

        public Criteria andCTemplateNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_template_name >=", value, "cTemplateName");
            return (Criteria) this;
        }

        public Criteria andCTemplateNameLessThan(String value) {
            addCriterion("c_template_name <", value, "cTemplateName");
            return (Criteria) this;
        }

        public Criteria andCTemplateNameLessThanOrEqualTo(String value) {
            addCriterion("c_template_name <=", value, "cTemplateName");
            return (Criteria) this;
        }

        public Criteria andCTemplateNameLike(String value) {
            addCriterion("c_template_name like", value, "cTemplateName");
            return (Criteria) this;
        }

        public Criteria andCTemplateNameNotLike(String value) {
            addCriterion("c_template_name not like", value, "cTemplateName");
            return (Criteria) this;
        }

        public Criteria andCTemplateNameIn(List<String> values) {
            addCriterion("c_template_name in", values, "cTemplateName");
            return (Criteria) this;
        }

        public Criteria andCTemplateNameNotIn(List<String> values) {
            addCriterion("c_template_name not in", values, "cTemplateName");
            return (Criteria) this;
        }

        public Criteria andCTemplateNameBetween(String value1, String value2) {
            addCriterion("c_template_name between", value1, value2, "cTemplateName");
            return (Criteria) this;
        }

        public Criteria andCTemplateNameNotBetween(String value1, String value2) {
            addCriterion("c_template_name not between", value1, value2, "cTemplateName");
            return (Criteria) this;
        }

        public Criteria andCTemplateCreatetimeIsNull() {
            addCriterion("c_template_createtime is null");
            return (Criteria) this;
        }

        public Criteria andCTemplateCreatetimeIsNotNull() {
            addCriterion("c_template_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCTemplateCreatetimeEqualTo(Date value) {
            addCriterion("c_template_createtime =", value, "cTemplateCreatetime");
            return (Criteria) this;
        }

        public Criteria andCTemplateCreatetimeNotEqualTo(Date value) {
            addCriterion("c_template_createtime <>", value, "cTemplateCreatetime");
            return (Criteria) this;
        }

        public Criteria andCTemplateCreatetimeGreaterThan(Date value) {
            addCriterion("c_template_createtime >", value, "cTemplateCreatetime");
            return (Criteria) this;
        }

        public Criteria andCTemplateCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_template_createtime >=", value, "cTemplateCreatetime");
            return (Criteria) this;
        }

        public Criteria andCTemplateCreatetimeLessThan(Date value) {
            addCriterion("c_template_createtime <", value, "cTemplateCreatetime");
            return (Criteria) this;
        }

        public Criteria andCTemplateCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("c_template_createtime <=", value, "cTemplateCreatetime");
            return (Criteria) this;
        }

        public Criteria andCTemplateCreatetimeIn(List<Date> values) {
            addCriterion("c_template_createtime in", values, "cTemplateCreatetime");
            return (Criteria) this;
        }

        public Criteria andCTemplateCreatetimeNotIn(List<Date> values) {
            addCriterion("c_template_createtime not in", values, "cTemplateCreatetime");
            return (Criteria) this;
        }

        public Criteria andCTemplateCreatetimeBetween(Date value1, Date value2) {
            addCriterion("c_template_createtime between", value1, value2, "cTemplateCreatetime");
            return (Criteria) this;
        }

        public Criteria andCTemplateCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("c_template_createtime not between", value1, value2, "cTemplateCreatetime");
            return (Criteria) this;
        }

        public Criteria andCTemplateNameLikeInsensitive(String value) {
            addCriterion("upper(c_template_name) like", value.toUpperCase(), "cTemplateName");
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