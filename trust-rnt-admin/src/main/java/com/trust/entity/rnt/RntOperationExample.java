package com.trust.entity.rnt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RntOperationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RntOperationExample() {
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

        public Criteria andOperationlogIdIsNull() {
            addCriterion("operationlog_id is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogIdIsNotNull() {
            addCriterion("operationlog_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogIdEqualTo(Long value) {
            addCriterion("operationlog_id =", value, "operationlogId");
            return (Criteria) this;
        }

        public Criteria andOperationlogIdNotEqualTo(Long value) {
            addCriterion("operationlog_id <>", value, "operationlogId");
            return (Criteria) this;
        }

        public Criteria andOperationlogIdGreaterThan(Long value) {
            addCriterion("operationlog_id >", value, "operationlogId");
            return (Criteria) this;
        }

        public Criteria andOperationlogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("operationlog_id >=", value, "operationlogId");
            return (Criteria) this;
        }

        public Criteria andOperationlogIdLessThan(Long value) {
            addCriterion("operationlog_id <", value, "operationlogId");
            return (Criteria) this;
        }

        public Criteria andOperationlogIdLessThanOrEqualTo(Long value) {
            addCriterion("operationlog_id <=", value, "operationlogId");
            return (Criteria) this;
        }

        public Criteria andOperationlogIdIn(List<Long> values) {
            addCriterion("operationlog_id in", values, "operationlogId");
            return (Criteria) this;
        }

        public Criteria andOperationlogIdNotIn(List<Long> values) {
            addCriterion("operationlog_id not in", values, "operationlogId");
            return (Criteria) this;
        }

        public Criteria andOperationlogIdBetween(Long value1, Long value2) {
            addCriterion("operationlog_id between", value1, value2, "operationlogId");
            return (Criteria) this;
        }

        public Criteria andOperationlogIdNotBetween(Long value1, Long value2) {
            addCriterion("operationlog_id not between", value1, value2, "operationlogId");
            return (Criteria) this;
        }

        public Criteria andOperationlogUseridIsNull() {
            addCriterion("operationlog_userid is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogUseridIsNotNull() {
            addCriterion("operationlog_userid is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogUseridEqualTo(Long value) {
            addCriterion("operationlog_userid =", value, "operationlogUserid");
            return (Criteria) this;
        }

        public Criteria andOperationlogUseridNotEqualTo(Long value) {
            addCriterion("operationlog_userid <>", value, "operationlogUserid");
            return (Criteria) this;
        }

        public Criteria andOperationlogUseridGreaterThan(Long value) {
            addCriterion("operationlog_userid >", value, "operationlogUserid");
            return (Criteria) this;
        }

        public Criteria andOperationlogUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("operationlog_userid >=", value, "operationlogUserid");
            return (Criteria) this;
        }

        public Criteria andOperationlogUseridLessThan(Long value) {
            addCriterion("operationlog_userid <", value, "operationlogUserid");
            return (Criteria) this;
        }

        public Criteria andOperationlogUseridLessThanOrEqualTo(Long value) {
            addCriterion("operationlog_userid <=", value, "operationlogUserid");
            return (Criteria) this;
        }

        public Criteria andOperationlogUseridIn(List<Long> values) {
            addCriterion("operationlog_userid in", values, "operationlogUserid");
            return (Criteria) this;
        }

        public Criteria andOperationlogUseridNotIn(List<Long> values) {
            addCriterion("operationlog_userid not in", values, "operationlogUserid");
            return (Criteria) this;
        }

        public Criteria andOperationlogUseridBetween(Long value1, Long value2) {
            addCriterion("operationlog_userid between", value1, value2, "operationlogUserid");
            return (Criteria) this;
        }

        public Criteria andOperationlogUseridNotBetween(Long value1, Long value2) {
            addCriterion("operationlog_userid not between", value1, value2, "operationlogUserid");
            return (Criteria) this;
        }

        public Criteria andOperationlogUsernameIsNull() {
            addCriterion("operationlog_username is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogUsernameIsNotNull() {
            addCriterion("operationlog_username is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogUsernameEqualTo(String value) {
            addCriterion("operationlog_username =", value, "operationlogUsername");
            return (Criteria) this;
        }

        public Criteria andOperationlogUsernameNotEqualTo(String value) {
            addCriterion("operationlog_username <>", value, "operationlogUsername");
            return (Criteria) this;
        }

        public Criteria andOperationlogUsernameGreaterThan(String value) {
            addCriterion("operationlog_username >", value, "operationlogUsername");
            return (Criteria) this;
        }

        public Criteria andOperationlogUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("operationlog_username >=", value, "operationlogUsername");
            return (Criteria) this;
        }

        public Criteria andOperationlogUsernameLessThan(String value) {
            addCriterion("operationlog_username <", value, "operationlogUsername");
            return (Criteria) this;
        }

        public Criteria andOperationlogUsernameLessThanOrEqualTo(String value) {
            addCriterion("operationlog_username <=", value, "operationlogUsername");
            return (Criteria) this;
        }

        public Criteria andOperationlogUsernameLike(String value) {
            addCriterion("operationlog_username like", value, "operationlogUsername");
            return (Criteria) this;
        }

        public Criteria andOperationlogUsernameNotLike(String value) {
            addCriterion("operationlog_username not like", value, "operationlogUsername");
            return (Criteria) this;
        }

        public Criteria andOperationlogUsernameIn(List<String> values) {
            addCriterion("operationlog_username in", values, "operationlogUsername");
            return (Criteria) this;
        }

        public Criteria andOperationlogUsernameNotIn(List<String> values) {
            addCriterion("operationlog_username not in", values, "operationlogUsername");
            return (Criteria) this;
        }

        public Criteria andOperationlogUsernameBetween(String value1, String value2) {
            addCriterion("operationlog_username between", value1, value2, "operationlogUsername");
            return (Criteria) this;
        }

        public Criteria andOperationlogUsernameNotBetween(String value1, String value2) {
            addCriterion("operationlog_username not between", value1, value2, "operationlogUsername");
            return (Criteria) this;
        }

        public Criteria andOperationlogTimeIsNull() {
            addCriterion("operationlog_time is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogTimeIsNotNull() {
            addCriterion("operationlog_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogTimeEqualTo(Date value) {
            addCriterion("operationlog_time =", value, "operationlogTime");
            return (Criteria) this;
        }

        public Criteria andOperationlogTimeNotEqualTo(Date value) {
            addCriterion("operationlog_time <>", value, "operationlogTime");
            return (Criteria) this;
        }

        public Criteria andOperationlogTimeGreaterThan(Date value) {
            addCriterion("operationlog_time >", value, "operationlogTime");
            return (Criteria) this;
        }

        public Criteria andOperationlogTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("operationlog_time >=", value, "operationlogTime");
            return (Criteria) this;
        }

        public Criteria andOperationlogTimeLessThan(Date value) {
            addCriterion("operationlog_time <", value, "operationlogTime");
            return (Criteria) this;
        }

        public Criteria andOperationlogTimeLessThanOrEqualTo(Date value) {
            addCriterion("operationlog_time <=", value, "operationlogTime");
            return (Criteria) this;
        }

        public Criteria andOperationlogTimeIn(List<Date> values) {
            addCriterion("operationlog_time in", values, "operationlogTime");
            return (Criteria) this;
        }

        public Criteria andOperationlogTimeNotIn(List<Date> values) {
            addCriterion("operationlog_time not in", values, "operationlogTime");
            return (Criteria) this;
        }

        public Criteria andOperationlogTimeBetween(Date value1, Date value2) {
            addCriterion("operationlog_time between", value1, value2, "operationlogTime");
            return (Criteria) this;
        }

        public Criteria andOperationlogTimeNotBetween(Date value1, Date value2) {
            addCriterion("operationlog_time not between", value1, value2, "operationlogTime");
            return (Criteria) this;
        }

        public Criteria andOperationlogModulenameIsNull() {
            addCriterion("operationlog_modulename is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogModulenameIsNotNull() {
            addCriterion("operationlog_modulename is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogModulenameEqualTo(String value) {
            addCriterion("operationlog_modulename =", value, "operationlogModulename");
            return (Criteria) this;
        }

        public Criteria andOperationlogModulenameNotEqualTo(String value) {
            addCriterion("operationlog_modulename <>", value, "operationlogModulename");
            return (Criteria) this;
        }

        public Criteria andOperationlogModulenameGreaterThan(String value) {
            addCriterion("operationlog_modulename >", value, "operationlogModulename");
            return (Criteria) this;
        }

        public Criteria andOperationlogModulenameGreaterThanOrEqualTo(String value) {
            addCriterion("operationlog_modulename >=", value, "operationlogModulename");
            return (Criteria) this;
        }

        public Criteria andOperationlogModulenameLessThan(String value) {
            addCriterion("operationlog_modulename <", value, "operationlogModulename");
            return (Criteria) this;
        }

        public Criteria andOperationlogModulenameLessThanOrEqualTo(String value) {
            addCriterion("operationlog_modulename <=", value, "operationlogModulename");
            return (Criteria) this;
        }

        public Criteria andOperationlogModulenameLike(String value) {
            addCriterion("operationlog_modulename like", value, "operationlogModulename");
            return (Criteria) this;
        }

        public Criteria andOperationlogModulenameNotLike(String value) {
            addCriterion("operationlog_modulename not like", value, "operationlogModulename");
            return (Criteria) this;
        }

        public Criteria andOperationlogModulenameIn(List<String> values) {
            addCriterion("operationlog_modulename in", values, "operationlogModulename");
            return (Criteria) this;
        }

        public Criteria andOperationlogModulenameNotIn(List<String> values) {
            addCriterion("operationlog_modulename not in", values, "operationlogModulename");
            return (Criteria) this;
        }

        public Criteria andOperationlogModulenameBetween(String value1, String value2) {
            addCriterion("operationlog_modulename between", value1, value2, "operationlogModulename");
            return (Criteria) this;
        }

        public Criteria andOperationlogModulenameNotBetween(String value1, String value2) {
            addCriterion("operationlog_modulename not between", value1, value2, "operationlogModulename");
            return (Criteria) this;
        }

        public Criteria andOperationlogCategoryIsNull() {
            addCriterion("operationlog_category is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogCategoryIsNotNull() {
            addCriterion("operationlog_category is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogCategoryEqualTo(String value) {
            addCriterion("operationlog_category =", value, "operationlogCategory");
            return (Criteria) this;
        }

        public Criteria andOperationlogCategoryNotEqualTo(String value) {
            addCriterion("operationlog_category <>", value, "operationlogCategory");
            return (Criteria) this;
        }

        public Criteria andOperationlogCategoryGreaterThan(String value) {
            addCriterion("operationlog_category >", value, "operationlogCategory");
            return (Criteria) this;
        }

        public Criteria andOperationlogCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("operationlog_category >=", value, "operationlogCategory");
            return (Criteria) this;
        }

        public Criteria andOperationlogCategoryLessThan(String value) {
            addCriterion("operationlog_category <", value, "operationlogCategory");
            return (Criteria) this;
        }

        public Criteria andOperationlogCategoryLessThanOrEqualTo(String value) {
            addCriterion("operationlog_category <=", value, "operationlogCategory");
            return (Criteria) this;
        }

        public Criteria andOperationlogCategoryLike(String value) {
            addCriterion("operationlog_category like", value, "operationlogCategory");
            return (Criteria) this;
        }

        public Criteria andOperationlogCategoryNotLike(String value) {
            addCriterion("operationlog_category not like", value, "operationlogCategory");
            return (Criteria) this;
        }

        public Criteria andOperationlogCategoryIn(List<String> values) {
            addCriterion("operationlog_category in", values, "operationlogCategory");
            return (Criteria) this;
        }

        public Criteria andOperationlogCategoryNotIn(List<String> values) {
            addCriterion("operationlog_category not in", values, "operationlogCategory");
            return (Criteria) this;
        }

        public Criteria andOperationlogCategoryBetween(String value1, String value2) {
            addCriterion("operationlog_category between", value1, value2, "operationlogCategory");
            return (Criteria) this;
        }

        public Criteria andOperationlogCategoryNotBetween(String value1, String value2) {
            addCriterion("operationlog_category not between", value1, value2, "operationlogCategory");
            return (Criteria) this;
        }

        public Criteria andOperationlogResultIsNull() {
            addCriterion("operationlog_result is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogResultIsNotNull() {
            addCriterion("operationlog_result is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogResultEqualTo(String value) {
            addCriterion("operationlog_result =", value, "operationlogResult");
            return (Criteria) this;
        }

        public Criteria andOperationlogResultNotEqualTo(String value) {
            addCriterion("operationlog_result <>", value, "operationlogResult");
            return (Criteria) this;
        }

        public Criteria andOperationlogResultGreaterThan(String value) {
            addCriterion("operationlog_result >", value, "operationlogResult");
            return (Criteria) this;
        }

        public Criteria andOperationlogResultGreaterThanOrEqualTo(String value) {
            addCriterion("operationlog_result >=", value, "operationlogResult");
            return (Criteria) this;
        }

        public Criteria andOperationlogResultLessThan(String value) {
            addCriterion("operationlog_result <", value, "operationlogResult");
            return (Criteria) this;
        }

        public Criteria andOperationlogResultLessThanOrEqualTo(String value) {
            addCriterion("operationlog_result <=", value, "operationlogResult");
            return (Criteria) this;
        }

        public Criteria andOperationlogResultLike(String value) {
            addCriterion("operationlog_result like", value, "operationlogResult");
            return (Criteria) this;
        }

        public Criteria andOperationlogResultNotLike(String value) {
            addCriterion("operationlog_result not like", value, "operationlogResult");
            return (Criteria) this;
        }

        public Criteria andOperationlogResultIn(List<String> values) {
            addCriterion("operationlog_result in", values, "operationlogResult");
            return (Criteria) this;
        }

        public Criteria andOperationlogResultNotIn(List<String> values) {
            addCriterion("operationlog_result not in", values, "operationlogResult");
            return (Criteria) this;
        }

        public Criteria andOperationlogResultBetween(String value1, String value2) {
            addCriterion("operationlog_result between", value1, value2, "operationlogResult");
            return (Criteria) this;
        }

        public Criteria andOperationlogResultNotBetween(String value1, String value2) {
            addCriterion("operationlog_result not between", value1, value2, "operationlogResult");
            return (Criteria) this;
        }

        public Criteria andOperationlogDesIsNull() {
            addCriterion("operationlog_des is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogDesIsNotNull() {
            addCriterion("operationlog_des is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogDesEqualTo(String value) {
            addCriterion("operationlog_des =", value, "operationlogDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDesNotEqualTo(String value) {
            addCriterion("operationlog_des <>", value, "operationlogDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDesGreaterThan(String value) {
            addCriterion("operationlog_des >", value, "operationlogDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDesGreaterThanOrEqualTo(String value) {
            addCriterion("operationlog_des >=", value, "operationlogDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDesLessThan(String value) {
            addCriterion("operationlog_des <", value, "operationlogDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDesLessThanOrEqualTo(String value) {
            addCriterion("operationlog_des <=", value, "operationlogDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDesLike(String value) {
            addCriterion("operationlog_des like", value, "operationlogDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDesNotLike(String value) {
            addCriterion("operationlog_des not like", value, "operationlogDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDesIn(List<String> values) {
            addCriterion("operationlog_des in", values, "operationlogDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDesNotIn(List<String> values) {
            addCriterion("operationlog_des not in", values, "operationlogDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDesBetween(String value1, String value2) {
            addCriterion("operationlog_des between", value1, value2, "operationlogDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDesNotBetween(String value1, String value2) {
            addCriterion("operationlog_des not between", value1, value2, "operationlogDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogChecklevelIsNull() {
            addCriterion("operationlog_checklevel is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogChecklevelIsNotNull() {
            addCriterion("operationlog_checklevel is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogChecklevelEqualTo(String value) {
            addCriterion("operationlog_checklevel =", value, "operationlogChecklevel");
            return (Criteria) this;
        }

        public Criteria andOperationlogChecklevelNotEqualTo(String value) {
            addCriterion("operationlog_checklevel <>", value, "operationlogChecklevel");
            return (Criteria) this;
        }

        public Criteria andOperationlogChecklevelGreaterThan(String value) {
            addCriterion("operationlog_checklevel >", value, "operationlogChecklevel");
            return (Criteria) this;
        }

        public Criteria andOperationlogChecklevelGreaterThanOrEqualTo(String value) {
            addCriterion("operationlog_checklevel >=", value, "operationlogChecklevel");
            return (Criteria) this;
        }

        public Criteria andOperationlogChecklevelLessThan(String value) {
            addCriterion("operationlog_checklevel <", value, "operationlogChecklevel");
            return (Criteria) this;
        }

        public Criteria andOperationlogChecklevelLessThanOrEqualTo(String value) {
            addCriterion("operationlog_checklevel <=", value, "operationlogChecklevel");
            return (Criteria) this;
        }

        public Criteria andOperationlogChecklevelLike(String value) {
            addCriterion("operationlog_checklevel like", value, "operationlogChecklevel");
            return (Criteria) this;
        }

        public Criteria andOperationlogChecklevelNotLike(String value) {
            addCriterion("operationlog_checklevel not like", value, "operationlogChecklevel");
            return (Criteria) this;
        }

        public Criteria andOperationlogChecklevelIn(List<String> values) {
            addCriterion("operationlog_checklevel in", values, "operationlogChecklevel");
            return (Criteria) this;
        }

        public Criteria andOperationlogChecklevelNotIn(List<String> values) {
            addCriterion("operationlog_checklevel not in", values, "operationlogChecklevel");
            return (Criteria) this;
        }

        public Criteria andOperationlogChecklevelBetween(String value1, String value2) {
            addCriterion("operationlog_checklevel between", value1, value2, "operationlogChecklevel");
            return (Criteria) this;
        }

        public Criteria andOperationlogChecklevelNotBetween(String value1, String value2) {
            addCriterion("operationlog_checklevel not between", value1, value2, "operationlogChecklevel");
            return (Criteria) this;
        }

        public Criteria andOperationlogIpIsNull() {
            addCriterion("operationlog_ip is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogIpIsNotNull() {
            addCriterion("operationlog_ip is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogIpEqualTo(String value) {
            addCriterion("operationlog_ip =", value, "operationlogIp");
            return (Criteria) this;
        }

        public Criteria andOperationlogIpNotEqualTo(String value) {
            addCriterion("operationlog_ip <>", value, "operationlogIp");
            return (Criteria) this;
        }

        public Criteria andOperationlogIpGreaterThan(String value) {
            addCriterion("operationlog_ip >", value, "operationlogIp");
            return (Criteria) this;
        }

        public Criteria andOperationlogIpGreaterThanOrEqualTo(String value) {
            addCriterion("operationlog_ip >=", value, "operationlogIp");
            return (Criteria) this;
        }

        public Criteria andOperationlogIpLessThan(String value) {
            addCriterion("operationlog_ip <", value, "operationlogIp");
            return (Criteria) this;
        }

        public Criteria andOperationlogIpLessThanOrEqualTo(String value) {
            addCriterion("operationlog_ip <=", value, "operationlogIp");
            return (Criteria) this;
        }

        public Criteria andOperationlogIpLike(String value) {
            addCriterion("operationlog_ip like", value, "operationlogIp");
            return (Criteria) this;
        }

        public Criteria andOperationlogIpNotLike(String value) {
            addCriterion("operationlog_ip not like", value, "operationlogIp");
            return (Criteria) this;
        }

        public Criteria andOperationlogIpIn(List<String> values) {
            addCriterion("operationlog_ip in", values, "operationlogIp");
            return (Criteria) this;
        }

        public Criteria andOperationlogIpNotIn(List<String> values) {
            addCriterion("operationlog_ip not in", values, "operationlogIp");
            return (Criteria) this;
        }

        public Criteria andOperationlogIpBetween(String value1, String value2) {
            addCriterion("operationlog_ip between", value1, value2, "operationlogIp");
            return (Criteria) this;
        }

        public Criteria andOperationlogIpNotBetween(String value1, String value2) {
            addCriterion("operationlog_ip not between", value1, value2, "operationlogIp");
            return (Criteria) this;
        }

        public Criteria andOperationlogCodeIsNull() {
            addCriterion("operationlog_code is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogCodeIsNotNull() {
            addCriterion("operationlog_code is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogCodeEqualTo(String value) {
            addCriterion("operationlog_code =", value, "operationlogCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogCodeNotEqualTo(String value) {
            addCriterion("operationlog_code <>", value, "operationlogCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogCodeGreaterThan(String value) {
            addCriterion("operationlog_code >", value, "operationlogCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogCodeGreaterThanOrEqualTo(String value) {
            addCriterion("operationlog_code >=", value, "operationlogCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogCodeLessThan(String value) {
            addCriterion("operationlog_code <", value, "operationlogCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogCodeLessThanOrEqualTo(String value) {
            addCriterion("operationlog_code <=", value, "operationlogCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogCodeLike(String value) {
            addCriterion("operationlog_code like", value, "operationlogCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogCodeNotLike(String value) {
            addCriterion("operationlog_code not like", value, "operationlogCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogCodeIn(List<String> values) {
            addCriterion("operationlog_code in", values, "operationlogCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogCodeNotIn(List<String> values) {
            addCriterion("operationlog_code not in", values, "operationlogCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogCodeBetween(String value1, String value2) {
            addCriterion("operationlog_code between", value1, value2, "operationlogCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogCodeNotBetween(String value1, String value2) {
            addCriterion("operationlog_code not between", value1, value2, "operationlogCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogRemarksIsNull() {
            addCriterion("operationlog_remarks is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogRemarksIsNotNull() {
            addCriterion("operationlog_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogRemarksEqualTo(String value) {
            addCriterion("operationlog_remarks =", value, "operationlogRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogRemarksNotEqualTo(String value) {
            addCriterion("operationlog_remarks <>", value, "operationlogRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogRemarksGreaterThan(String value) {
            addCriterion("operationlog_remarks >", value, "operationlogRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("operationlog_remarks >=", value, "operationlogRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogRemarksLessThan(String value) {
            addCriterion("operationlog_remarks <", value, "operationlogRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogRemarksLessThanOrEqualTo(String value) {
            addCriterion("operationlog_remarks <=", value, "operationlogRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogRemarksLike(String value) {
            addCriterion("operationlog_remarks like", value, "operationlogRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogRemarksNotLike(String value) {
            addCriterion("operationlog_remarks not like", value, "operationlogRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogRemarksIn(List<String> values) {
            addCriterion("operationlog_remarks in", values, "operationlogRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogRemarksNotIn(List<String> values) {
            addCriterion("operationlog_remarks not in", values, "operationlogRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogRemarksBetween(String value1, String value2) {
            addCriterion("operationlog_remarks between", value1, value2, "operationlogRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogRemarksNotBetween(String value1, String value2) {
            addCriterion("operationlog_remarks not between", value1, value2, "operationlogRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogStatusIsNull() {
            addCriterion("operationlog_status is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogStatusIsNotNull() {
            addCriterion("operationlog_status is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogStatusEqualTo(String value) {
            addCriterion("operationlog_status =", value, "operationlogStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogStatusNotEqualTo(String value) {
            addCriterion("operationlog_status <>", value, "operationlogStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogStatusGreaterThan(String value) {
            addCriterion("operationlog_status >", value, "operationlogStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogStatusGreaterThanOrEqualTo(String value) {
            addCriterion("operationlog_status >=", value, "operationlogStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogStatusLessThan(String value) {
            addCriterion("operationlog_status <", value, "operationlogStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogStatusLessThanOrEqualTo(String value) {
            addCriterion("operationlog_status <=", value, "operationlogStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogStatusLike(String value) {
            addCriterion("operationlog_status like", value, "operationlogStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogStatusNotLike(String value) {
            addCriterion("operationlog_status not like", value, "operationlogStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogStatusIn(List<String> values) {
            addCriterion("operationlog_status in", values, "operationlogStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogStatusNotIn(List<String> values) {
            addCriterion("operationlog_status not in", values, "operationlogStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogStatusBetween(String value1, String value2) {
            addCriterion("operationlog_status between", value1, value2, "operationlogStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogStatusNotBetween(String value1, String value2) {
            addCriterion("operationlog_status not between", value1, value2, "operationlogStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogUsernameLikeInsensitive(String value) {
            addCriterion("upper(operationlog_username) like", value.toUpperCase(), "operationlogUsername");
            return (Criteria) this;
        }

        public Criteria andOperationlogModulenameLikeInsensitive(String value) {
            addCriterion("upper(operationlog_modulename) like", value.toUpperCase(), "operationlogModulename");
            return (Criteria) this;
        }

        public Criteria andOperationlogCategoryLikeInsensitive(String value) {
            addCriterion("upper(operationlog_category) like", value.toUpperCase(), "operationlogCategory");
            return (Criteria) this;
        }

        public Criteria andOperationlogResultLikeInsensitive(String value) {
            addCriterion("upper(operationlog_result) like", value.toUpperCase(), "operationlogResult");
            return (Criteria) this;
        }

        public Criteria andOperationlogDesLikeInsensitive(String value) {
            addCriterion("upper(operationlog_des) like", value.toUpperCase(), "operationlogDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogChecklevelLikeInsensitive(String value) {
            addCriterion("upper(operationlog_checklevel) like", value.toUpperCase(), "operationlogChecklevel");
            return (Criteria) this;
        }

        public Criteria andOperationlogIpLikeInsensitive(String value) {
            addCriterion("upper(operationlog_ip) like", value.toUpperCase(), "operationlogIp");
            return (Criteria) this;
        }

        public Criteria andOperationlogCodeLikeInsensitive(String value) {
            addCriterion("upper(operationlog_code) like", value.toUpperCase(), "operationlogCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogRemarksLikeInsensitive(String value) {
            addCriterion("upper(operationlog_remarks) like", value.toUpperCase(), "operationlogRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogStatusLikeInsensitive(String value) {
            addCriterion("upper(operationlog_status) like", value.toUpperCase(), "operationlogStatus");
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