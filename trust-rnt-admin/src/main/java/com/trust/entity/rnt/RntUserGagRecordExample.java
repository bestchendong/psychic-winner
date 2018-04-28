package com.trust.entity.rnt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RntUserGagRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RntUserGagRecordExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andGagItemIsNull() {
            addCriterion("gag_item is null");
            return (Criteria) this;
        }

        public Criteria andGagItemIsNotNull() {
            addCriterion("gag_item is not null");
            return (Criteria) this;
        }

        public Criteria andGagItemEqualTo(Integer value) {
            addCriterion("gag_item =", value, "gagItem");
            return (Criteria) this;
        }

        public Criteria andGagItemNotEqualTo(Integer value) {
            addCriterion("gag_item <>", value, "gagItem");
            return (Criteria) this;
        }

        public Criteria andGagItemGreaterThan(Integer value) {
            addCriterion("gag_item >", value, "gagItem");
            return (Criteria) this;
        }

        public Criteria andGagItemGreaterThanOrEqualTo(Integer value) {
            addCriterion("gag_item >=", value, "gagItem");
            return (Criteria) this;
        }

        public Criteria andGagItemLessThan(Integer value) {
            addCriterion("gag_item <", value, "gagItem");
            return (Criteria) this;
        }

        public Criteria andGagItemLessThanOrEqualTo(Integer value) {
            addCriterion("gag_item <=", value, "gagItem");
            return (Criteria) this;
        }

        public Criteria andGagItemIn(List<Integer> values) {
            addCriterion("gag_item in", values, "gagItem");
            return (Criteria) this;
        }

        public Criteria andGagItemNotIn(List<Integer> values) {
            addCriterion("gag_item not in", values, "gagItem");
            return (Criteria) this;
        }

        public Criteria andGagItemBetween(Integer value1, Integer value2) {
            addCriterion("gag_item between", value1, value2, "gagItem");
            return (Criteria) this;
        }

        public Criteria andGagItemNotBetween(Integer value1, Integer value2) {
            addCriterion("gag_item not between", value1, value2, "gagItem");
            return (Criteria) this;
        }

        public Criteria andGagReasonIsNull() {
            addCriterion("gag_reason is null");
            return (Criteria) this;
        }

        public Criteria andGagReasonIsNotNull() {
            addCriterion("gag_reason is not null");
            return (Criteria) this;
        }

        public Criteria andGagReasonEqualTo(String value) {
            addCriterion("gag_reason =", value, "gagReason");
            return (Criteria) this;
        }

        public Criteria andGagReasonNotEqualTo(String value) {
            addCriterion("gag_reason <>", value, "gagReason");
            return (Criteria) this;
        }

        public Criteria andGagReasonGreaterThan(String value) {
            addCriterion("gag_reason >", value, "gagReason");
            return (Criteria) this;
        }

        public Criteria andGagReasonGreaterThanOrEqualTo(String value) {
            addCriterion("gag_reason >=", value, "gagReason");
            return (Criteria) this;
        }

        public Criteria andGagReasonLessThan(String value) {
            addCriterion("gag_reason <", value, "gagReason");
            return (Criteria) this;
        }

        public Criteria andGagReasonLessThanOrEqualTo(String value) {
            addCriterion("gag_reason <=", value, "gagReason");
            return (Criteria) this;
        }

        public Criteria andGagReasonLike(String value) {
            addCriterion("gag_reason like", value, "gagReason");
            return (Criteria) this;
        }

        public Criteria andGagReasonNotLike(String value) {
            addCriterion("gag_reason not like", value, "gagReason");
            return (Criteria) this;
        }

        public Criteria andGagReasonIn(List<String> values) {
            addCriterion("gag_reason in", values, "gagReason");
            return (Criteria) this;
        }

        public Criteria andGagReasonNotIn(List<String> values) {
            addCriterion("gag_reason not in", values, "gagReason");
            return (Criteria) this;
        }

        public Criteria andGagReasonBetween(String value1, String value2) {
            addCriterion("gag_reason between", value1, value2, "gagReason");
            return (Criteria) this;
        }

        public Criteria andGagReasonNotBetween(String value1, String value2) {
            addCriterion("gag_reason not between", value1, value2, "gagReason");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdIsNull() {
            addCriterion("operator_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdIsNotNull() {
            addCriterion("operator_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdEqualTo(Integer value) {
            addCriterion("operator_user_id =", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdNotEqualTo(Integer value) {
            addCriterion("operator_user_id <>", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdGreaterThan(Integer value) {
            addCriterion("operator_user_id >", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("operator_user_id >=", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdLessThan(Integer value) {
            addCriterion("operator_user_id <", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("operator_user_id <=", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdIn(List<Integer> values) {
            addCriterion("operator_user_id in", values, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdNotIn(List<Integer> values) {
            addCriterion("operator_user_id not in", values, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdBetween(Integer value1, Integer value2) {
            addCriterion("operator_user_id between", value1, value2, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("operator_user_id not between", value1, value2, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andGagTimeIsNull() {
            addCriterion("gag_time is null");
            return (Criteria) this;
        }

        public Criteria andGagTimeIsNotNull() {
            addCriterion("gag_time is not null");
            return (Criteria) this;
        }

        public Criteria andGagTimeEqualTo(Date value) {
            addCriterion("gag_time =", value, "gagTime");
            return (Criteria) this;
        }

        public Criteria andGagTimeNotEqualTo(Date value) {
            addCriterion("gag_time <>", value, "gagTime");
            return (Criteria) this;
        }

        public Criteria andGagTimeGreaterThan(Date value) {
            addCriterion("gag_time >", value, "gagTime");
            return (Criteria) this;
        }

        public Criteria andGagTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gag_time >=", value, "gagTime");
            return (Criteria) this;
        }

        public Criteria andGagTimeLessThan(Date value) {
            addCriterion("gag_time <", value, "gagTime");
            return (Criteria) this;
        }

        public Criteria andGagTimeLessThanOrEqualTo(Date value) {
            addCriterion("gag_time <=", value, "gagTime");
            return (Criteria) this;
        }

        public Criteria andGagTimeIn(List<Date> values) {
            addCriterion("gag_time in", values, "gagTime");
            return (Criteria) this;
        }

        public Criteria andGagTimeNotIn(List<Date> values) {
            addCriterion("gag_time not in", values, "gagTime");
            return (Criteria) this;
        }

        public Criteria andGagTimeBetween(Date value1, Date value2) {
            addCriterion("gag_time between", value1, value2, "gagTime");
            return (Criteria) this;
        }

        public Criteria andGagTimeNotBetween(Date value1, Date value2) {
            addCriterion("gag_time not between", value1, value2, "gagTime");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("operator_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(Integer value) {
            addCriterion("operator_id =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(Integer value) {
            addCriterion("operator_id <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(Integer value) {
            addCriterion("operator_id >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("operator_id >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(Integer value) {
            addCriterion("operator_id <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("operator_id <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<Integer> values) {
            addCriterion("operator_id in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<Integer> values) {
            addCriterion("operator_id not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(Integer value1, Integer value2) {
            addCriterion("operator_id between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("operator_id not between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andGagReasonLikeInsensitive(String value) {
            addCriterion("upper(gag_reason) like", value.toUpperCase(), "gagReason");
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