package com.trust.entity.cms;

import java.util.ArrayList;
import java.util.List;

public class CmsUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsUserExample() {
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

        public Criteria andCUserIdIsNull() {
            addCriterion("c_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCUserIdIsNotNull() {
            addCriterion("c_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCUserIdEqualTo(Long value) {
            addCriterion("c_user_id =", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotEqualTo(Long value) {
            addCriterion("c_user_id <>", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdGreaterThan(Long value) {
            addCriterion("c_user_id >", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("c_user_id >=", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdLessThan(Long value) {
            addCriterion("c_user_id <", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdLessThanOrEqualTo(Long value) {
            addCriterion("c_user_id <=", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdIn(List<Long> values) {
            addCriterion("c_user_id in", values, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotIn(List<Long> values) {
            addCriterion("c_user_id not in", values, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdBetween(Long value1, Long value2) {
            addCriterion("c_user_id between", value1, value2, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotBetween(Long value1, Long value2) {
            addCriterion("c_user_id not between", value1, value2, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserNameIsNull() {
            addCriterion("c_user_name is null");
            return (Criteria) this;
        }

        public Criteria andCUserNameIsNotNull() {
            addCriterion("c_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andCUserNameEqualTo(String value) {
            addCriterion("c_user_name =", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameNotEqualTo(String value) {
            addCriterion("c_user_name <>", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameGreaterThan(String value) {
            addCriterion("c_user_name >", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_user_name >=", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameLessThan(String value) {
            addCriterion("c_user_name <", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameLessThanOrEqualTo(String value) {
            addCriterion("c_user_name <=", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameLike(String value) {
            addCriterion("c_user_name like", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameNotLike(String value) {
            addCriterion("c_user_name not like", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameIn(List<String> values) {
            addCriterion("c_user_name in", values, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameNotIn(List<String> values) {
            addCriterion("c_user_name not in", values, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameBetween(String value1, String value2) {
            addCriterion("c_user_name between", value1, value2, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameNotBetween(String value1, String value2) {
            addCriterion("c_user_name not between", value1, value2, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCPasswordIsNull() {
            addCriterion("c_password is null");
            return (Criteria) this;
        }

        public Criteria andCPasswordIsNotNull() {
            addCriterion("c_password is not null");
            return (Criteria) this;
        }

        public Criteria andCPasswordEqualTo(String value) {
            addCriterion("c_password =", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotEqualTo(String value) {
            addCriterion("c_password <>", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordGreaterThan(String value) {
            addCriterion("c_password >", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("c_password >=", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLessThan(String value) {
            addCriterion("c_password <", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLessThanOrEqualTo(String value) {
            addCriterion("c_password <=", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLike(String value) {
            addCriterion("c_password like", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotLike(String value) {
            addCriterion("c_password not like", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordIn(List<String> values) {
            addCriterion("c_password in", values, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotIn(List<String> values) {
            addCriterion("c_password not in", values, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordBetween(String value1, String value2) {
            addCriterion("c_password between", value1, value2, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotBetween(String value1, String value2) {
            addCriterion("c_password not between", value1, value2, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCUserRealnameIsNull() {
            addCriterion("c_user_realname is null");
            return (Criteria) this;
        }

        public Criteria andCUserRealnameIsNotNull() {
            addCriterion("c_user_realname is not null");
            return (Criteria) this;
        }

        public Criteria andCUserRealnameEqualTo(String value) {
            addCriterion("c_user_realname =", value, "cUserRealname");
            return (Criteria) this;
        }

        public Criteria andCUserRealnameNotEqualTo(String value) {
            addCriterion("c_user_realname <>", value, "cUserRealname");
            return (Criteria) this;
        }

        public Criteria andCUserRealnameGreaterThan(String value) {
            addCriterion("c_user_realname >", value, "cUserRealname");
            return (Criteria) this;
        }

        public Criteria andCUserRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("c_user_realname >=", value, "cUserRealname");
            return (Criteria) this;
        }

        public Criteria andCUserRealnameLessThan(String value) {
            addCriterion("c_user_realname <", value, "cUserRealname");
            return (Criteria) this;
        }

        public Criteria andCUserRealnameLessThanOrEqualTo(String value) {
            addCriterion("c_user_realname <=", value, "cUserRealname");
            return (Criteria) this;
        }

        public Criteria andCUserRealnameLike(String value) {
            addCriterion("c_user_realname like", value, "cUserRealname");
            return (Criteria) this;
        }

        public Criteria andCUserRealnameNotLike(String value) {
            addCriterion("c_user_realname not like", value, "cUserRealname");
            return (Criteria) this;
        }

        public Criteria andCUserRealnameIn(List<String> values) {
            addCriterion("c_user_realname in", values, "cUserRealname");
            return (Criteria) this;
        }

        public Criteria andCUserRealnameNotIn(List<String> values) {
            addCriterion("c_user_realname not in", values, "cUserRealname");
            return (Criteria) this;
        }

        public Criteria andCUserRealnameBetween(String value1, String value2) {
            addCriterion("c_user_realname between", value1, value2, "cUserRealname");
            return (Criteria) this;
        }

        public Criteria andCUserRealnameNotBetween(String value1, String value2) {
            addCriterion("c_user_realname not between", value1, value2, "cUserRealname");
            return (Criteria) this;
        }

        public Criteria andCUserNameLikeInsensitive(String value) {
            addCriterion("upper(c_user_name) like", value.toUpperCase(), "cUserName");
            return (Criteria) this;
        }

        public Criteria andCPasswordLikeInsensitive(String value) {
            addCriterion("upper(c_password) like", value.toUpperCase(), "cPassword");
            return (Criteria) this;
        }

        public Criteria andCUserRealnameLikeInsensitive(String value) {
            addCriterion("upper(c_user_realname) like", value.toUpperCase(), "cUserRealname");
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