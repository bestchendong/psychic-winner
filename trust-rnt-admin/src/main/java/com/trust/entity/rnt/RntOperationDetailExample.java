package com.trust.entity.rnt;

import java.util.ArrayList;
import java.util.List;

public class RntOperationDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RntOperationDetailExample() {
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

        public Criteria andOperationlogDetailsIdIsNull() {
            addCriterion("operationlog_details_id is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsIdIsNotNull() {
            addCriterion("operationlog_details_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsIdEqualTo(Long value) {
            addCriterion("operationlog_details_id =", value, "operationlogDetailsId");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsIdNotEqualTo(Long value) {
            addCriterion("operationlog_details_id <>", value, "operationlogDetailsId");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsIdGreaterThan(Long value) {
            addCriterion("operationlog_details_id >", value, "operationlogDetailsId");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("operationlog_details_id >=", value, "operationlogDetailsId");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsIdLessThan(Long value) {
            addCriterion("operationlog_details_id <", value, "operationlogDetailsId");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsIdLessThanOrEqualTo(Long value) {
            addCriterion("operationlog_details_id <=", value, "operationlogDetailsId");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsIdIn(List<Long> values) {
            addCriterion("operationlog_details_id in", values, "operationlogDetailsId");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsIdNotIn(List<Long> values) {
            addCriterion("operationlog_details_id not in", values, "operationlogDetailsId");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsIdBetween(Long value1, Long value2) {
            addCriterion("operationlog_details_id between", value1, value2, "operationlogDetailsId");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsIdNotBetween(Long value1, Long value2) {
            addCriterion("operationlog_details_id not between", value1, value2, "operationlogDetailsId");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributenameIsNull() {
            addCriterion("operationlog_details_attributename is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributenameIsNotNull() {
            addCriterion("operationlog_details_attributename is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributenameEqualTo(String value) {
            addCriterion("operationlog_details_attributename =", value, "operationlogDetailsAttributename");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributenameNotEqualTo(String value) {
            addCriterion("operationlog_details_attributename <>", value, "operationlogDetailsAttributename");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributenameGreaterThan(String value) {
            addCriterion("operationlog_details_attributename >", value, "operationlogDetailsAttributename");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributenameGreaterThanOrEqualTo(String value) {
            addCriterion("operationlog_details_attributename >=", value, "operationlogDetailsAttributename");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributenameLessThan(String value) {
            addCriterion("operationlog_details_attributename <", value, "operationlogDetailsAttributename");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributenameLessThanOrEqualTo(String value) {
            addCriterion("operationlog_details_attributename <=", value, "operationlogDetailsAttributename");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributenameLike(String value) {
            addCriterion("operationlog_details_attributename like", value, "operationlogDetailsAttributename");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributenameNotLike(String value) {
            addCriterion("operationlog_details_attributename not like", value, "operationlogDetailsAttributename");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributenameIn(List<String> values) {
            addCriterion("operationlog_details_attributename in", values, "operationlogDetailsAttributename");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributenameNotIn(List<String> values) {
            addCriterion("operationlog_details_attributename not in", values, "operationlogDetailsAttributename");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributenameBetween(String value1, String value2) {
            addCriterion("operationlog_details_attributename between", value1, value2, "operationlogDetailsAttributename");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributenameNotBetween(String value1, String value2) {
            addCriterion("operationlog_details_attributename not between", value1, value2, "operationlogDetailsAttributename");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributedesIsNull() {
            addCriterion("operationlog_details_attributedes is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributedesIsNotNull() {
            addCriterion("operationlog_details_attributedes is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributedesEqualTo(String value) {
            addCriterion("operationlog_details_attributedes =", value, "operationlogDetailsAttributedes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributedesNotEqualTo(String value) {
            addCriterion("operationlog_details_attributedes <>", value, "operationlogDetailsAttributedes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributedesGreaterThan(String value) {
            addCriterion("operationlog_details_attributedes >", value, "operationlogDetailsAttributedes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributedesGreaterThanOrEqualTo(String value) {
            addCriterion("operationlog_details_attributedes >=", value, "operationlogDetailsAttributedes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributedesLessThan(String value) {
            addCriterion("operationlog_details_attributedes <", value, "operationlogDetailsAttributedes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributedesLessThanOrEqualTo(String value) {
            addCriterion("operationlog_details_attributedes <=", value, "operationlogDetailsAttributedes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributedesLike(String value) {
            addCriterion("operationlog_details_attributedes like", value, "operationlogDetailsAttributedes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributedesNotLike(String value) {
            addCriterion("operationlog_details_attributedes not like", value, "operationlogDetailsAttributedes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributedesIn(List<String> values) {
            addCriterion("operationlog_details_attributedes in", values, "operationlogDetailsAttributedes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributedesNotIn(List<String> values) {
            addCriterion("operationlog_details_attributedes not in", values, "operationlogDetailsAttributedes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributedesBetween(String value1, String value2) {
            addCriterion("operationlog_details_attributedes between", value1, value2, "operationlogDetailsAttributedes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributedesNotBetween(String value1, String value2) {
            addCriterion("operationlog_details_attributedes not between", value1, value2, "operationlogDetailsAttributedes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsBeforeIsNull() {
            addCriterion("operationlog_details_before is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsBeforeIsNotNull() {
            addCriterion("operationlog_details_before is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsBeforeEqualTo(String value) {
            addCriterion("operationlog_details_before =", value, "operationlogDetailsBefore");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsBeforeNotEqualTo(String value) {
            addCriterion("operationlog_details_before <>", value, "operationlogDetailsBefore");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsBeforeGreaterThan(String value) {
            addCriterion("operationlog_details_before >", value, "operationlogDetailsBefore");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsBeforeGreaterThanOrEqualTo(String value) {
            addCriterion("operationlog_details_before >=", value, "operationlogDetailsBefore");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsBeforeLessThan(String value) {
            addCriterion("operationlog_details_before <", value, "operationlogDetailsBefore");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsBeforeLessThanOrEqualTo(String value) {
            addCriterion("operationlog_details_before <=", value, "operationlogDetailsBefore");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsBeforeLike(String value) {
            addCriterion("operationlog_details_before like", value, "operationlogDetailsBefore");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsBeforeNotLike(String value) {
            addCriterion("operationlog_details_before not like", value, "operationlogDetailsBefore");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsBeforeIn(List<String> values) {
            addCriterion("operationlog_details_before in", values, "operationlogDetailsBefore");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsBeforeNotIn(List<String> values) {
            addCriterion("operationlog_details_before not in", values, "operationlogDetailsBefore");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsBeforeBetween(String value1, String value2) {
            addCriterion("operationlog_details_before between", value1, value2, "operationlogDetailsBefore");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsBeforeNotBetween(String value1, String value2) {
            addCriterion("operationlog_details_before not between", value1, value2, "operationlogDetailsBefore");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAfterIsNull() {
            addCriterion("operationlog_details_after is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAfterIsNotNull() {
            addCriterion("operationlog_details_after is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAfterEqualTo(String value) {
            addCriterion("operationlog_details_after =", value, "operationlogDetailsAfter");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAfterNotEqualTo(String value) {
            addCriterion("operationlog_details_after <>", value, "operationlogDetailsAfter");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAfterGreaterThan(String value) {
            addCriterion("operationlog_details_after >", value, "operationlogDetailsAfter");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAfterGreaterThanOrEqualTo(String value) {
            addCriterion("operationlog_details_after >=", value, "operationlogDetailsAfter");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAfterLessThan(String value) {
            addCriterion("operationlog_details_after <", value, "operationlogDetailsAfter");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAfterLessThanOrEqualTo(String value) {
            addCriterion("operationlog_details_after <=", value, "operationlogDetailsAfter");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAfterLike(String value) {
            addCriterion("operationlog_details_after like", value, "operationlogDetailsAfter");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAfterNotLike(String value) {
            addCriterion("operationlog_details_after not like", value, "operationlogDetailsAfter");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAfterIn(List<String> values) {
            addCriterion("operationlog_details_after in", values, "operationlogDetailsAfter");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAfterNotIn(List<String> values) {
            addCriterion("operationlog_details_after not in", values, "operationlogDetailsAfter");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAfterBetween(String value1, String value2) {
            addCriterion("operationlog_details_after between", value1, value2, "operationlogDetailsAfter");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAfterNotBetween(String value1, String value2) {
            addCriterion("operationlog_details_after not between", value1, value2, "operationlogDetailsAfter");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsDesIsNull() {
            addCriterion("operationlog_details_des is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsDesIsNotNull() {
            addCriterion("operationlog_details_des is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsDesEqualTo(String value) {
            addCriterion("operationlog_details_des =", value, "operationlogDetailsDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsDesNotEqualTo(String value) {
            addCriterion("operationlog_details_des <>", value, "operationlogDetailsDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsDesGreaterThan(String value) {
            addCriterion("operationlog_details_des >", value, "operationlogDetailsDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsDesGreaterThanOrEqualTo(String value) {
            addCriterion("operationlog_details_des >=", value, "operationlogDetailsDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsDesLessThan(String value) {
            addCriterion("operationlog_details_des <", value, "operationlogDetailsDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsDesLessThanOrEqualTo(String value) {
            addCriterion("operationlog_details_des <=", value, "operationlogDetailsDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsDesLike(String value) {
            addCriterion("operationlog_details_des like", value, "operationlogDetailsDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsDesNotLike(String value) {
            addCriterion("operationlog_details_des not like", value, "operationlogDetailsDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsDesIn(List<String> values) {
            addCriterion("operationlog_details_des in", values, "operationlogDetailsDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsDesNotIn(List<String> values) {
            addCriterion("operationlog_details_des not in", values, "operationlogDetailsDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsDesBetween(String value1, String value2) {
            addCriterion("operationlog_details_des between", value1, value2, "operationlogDetailsDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsDesNotBetween(String value1, String value2) {
            addCriterion("operationlog_details_des not between", value1, value2, "operationlogDetailsDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsCodeIsNull() {
            addCriterion("operationlog_details_code is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsCodeIsNotNull() {
            addCriterion("operationlog_details_code is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsCodeEqualTo(String value) {
            addCriterion("operationlog_details_code =", value, "operationlogDetailsCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsCodeNotEqualTo(String value) {
            addCriterion("operationlog_details_code <>", value, "operationlogDetailsCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsCodeGreaterThan(String value) {
            addCriterion("operationlog_details_code >", value, "operationlogDetailsCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("operationlog_details_code >=", value, "operationlogDetailsCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsCodeLessThan(String value) {
            addCriterion("operationlog_details_code <", value, "operationlogDetailsCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsCodeLessThanOrEqualTo(String value) {
            addCriterion("operationlog_details_code <=", value, "operationlogDetailsCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsCodeLike(String value) {
            addCriterion("operationlog_details_code like", value, "operationlogDetailsCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsCodeNotLike(String value) {
            addCriterion("operationlog_details_code not like", value, "operationlogDetailsCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsCodeIn(List<String> values) {
            addCriterion("operationlog_details_code in", values, "operationlogDetailsCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsCodeNotIn(List<String> values) {
            addCriterion("operationlog_details_code not in", values, "operationlogDetailsCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsCodeBetween(String value1, String value2) {
            addCriterion("operationlog_details_code between", value1, value2, "operationlogDetailsCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsCodeNotBetween(String value1, String value2) {
            addCriterion("operationlog_details_code not between", value1, value2, "operationlogDetailsCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsRemarksIsNull() {
            addCriterion("operationlog_details_remarks is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsRemarksIsNotNull() {
            addCriterion("operationlog_details_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsRemarksEqualTo(String value) {
            addCriterion("operationlog_details_remarks =", value, "operationlogDetailsRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsRemarksNotEqualTo(String value) {
            addCriterion("operationlog_details_remarks <>", value, "operationlogDetailsRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsRemarksGreaterThan(String value) {
            addCriterion("operationlog_details_remarks >", value, "operationlogDetailsRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("operationlog_details_remarks >=", value, "operationlogDetailsRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsRemarksLessThan(String value) {
            addCriterion("operationlog_details_remarks <", value, "operationlogDetailsRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsRemarksLessThanOrEqualTo(String value) {
            addCriterion("operationlog_details_remarks <=", value, "operationlogDetailsRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsRemarksLike(String value) {
            addCriterion("operationlog_details_remarks like", value, "operationlogDetailsRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsRemarksNotLike(String value) {
            addCriterion("operationlog_details_remarks not like", value, "operationlogDetailsRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsRemarksIn(List<String> values) {
            addCriterion("operationlog_details_remarks in", values, "operationlogDetailsRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsRemarksNotIn(List<String> values) {
            addCriterion("operationlog_details_remarks not in", values, "operationlogDetailsRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsRemarksBetween(String value1, String value2) {
            addCriterion("operationlog_details_remarks between", value1, value2, "operationlogDetailsRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsRemarksNotBetween(String value1, String value2) {
            addCriterion("operationlog_details_remarks not between", value1, value2, "operationlogDetailsRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsStatusIsNull() {
            addCriterion("operationlog_details_status is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsStatusIsNotNull() {
            addCriterion("operationlog_details_status is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsStatusEqualTo(String value) {
            addCriterion("operationlog_details_status =", value, "operationlogDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsStatusNotEqualTo(String value) {
            addCriterion("operationlog_details_status <>", value, "operationlogDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsStatusGreaterThan(String value) {
            addCriterion("operationlog_details_status >", value, "operationlogDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("operationlog_details_status >=", value, "operationlogDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsStatusLessThan(String value) {
            addCriterion("operationlog_details_status <", value, "operationlogDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsStatusLessThanOrEqualTo(String value) {
            addCriterion("operationlog_details_status <=", value, "operationlogDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsStatusLike(String value) {
            addCriterion("operationlog_details_status like", value, "operationlogDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsStatusNotLike(String value) {
            addCriterion("operationlog_details_status not like", value, "operationlogDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsStatusIn(List<String> values) {
            addCriterion("operationlog_details_status in", values, "operationlogDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsStatusNotIn(List<String> values) {
            addCriterion("operationlog_details_status not in", values, "operationlogDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsStatusBetween(String value1, String value2) {
            addCriterion("operationlog_details_status between", value1, value2, "operationlogDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsStatusNotBetween(String value1, String value2) {
            addCriterion("operationlog_details_status not between", value1, value2, "operationlogDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsLogidIsNull() {
            addCriterion("operationlog_details_logid is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsLogidIsNotNull() {
            addCriterion("operationlog_details_logid is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsLogidEqualTo(Long value) {
            addCriterion("operationlog_details_logid =", value, "operationlogDetailsLogid");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsLogidNotEqualTo(Long value) {
            addCriterion("operationlog_details_logid <>", value, "operationlogDetailsLogid");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsLogidGreaterThan(Long value) {
            addCriterion("operationlog_details_logid >", value, "operationlogDetailsLogid");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsLogidGreaterThanOrEqualTo(Long value) {
            addCriterion("operationlog_details_logid >=", value, "operationlogDetailsLogid");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsLogidLessThan(Long value) {
            addCriterion("operationlog_details_logid <", value, "operationlogDetailsLogid");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsLogidLessThanOrEqualTo(Long value) {
            addCriterion("operationlog_details_logid <=", value, "operationlogDetailsLogid");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsLogidIn(List<Long> values) {
            addCriterion("operationlog_details_logid in", values, "operationlogDetailsLogid");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsLogidNotIn(List<Long> values) {
            addCriterion("operationlog_details_logid not in", values, "operationlogDetailsLogid");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsLogidBetween(Long value1, Long value2) {
            addCriterion("operationlog_details_logid between", value1, value2, "operationlogDetailsLogid");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsLogidNotBetween(Long value1, Long value2) {
            addCriterion("operationlog_details_logid not between", value1, value2, "operationlogDetailsLogid");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributenameLikeInsensitive(String value) {
            addCriterion("upper(operationlog_details_attributename) like", value.toUpperCase(), "operationlogDetailsAttributename");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAttributedesLikeInsensitive(String value) {
            addCriterion("upper(operationlog_details_attributedes) like", value.toUpperCase(), "operationlogDetailsAttributedes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsBeforeLikeInsensitive(String value) {
            addCriterion("upper(operationlog_details_before) like", value.toUpperCase(), "operationlogDetailsBefore");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsAfterLikeInsensitive(String value) {
            addCriterion("upper(operationlog_details_after) like", value.toUpperCase(), "operationlogDetailsAfter");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsDesLikeInsensitive(String value) {
            addCriterion("upper(operationlog_details_des) like", value.toUpperCase(), "operationlogDetailsDes");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsCodeLikeInsensitive(String value) {
            addCriterion("upper(operationlog_details_code) like", value.toUpperCase(), "operationlogDetailsCode");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsRemarksLikeInsensitive(String value) {
            addCriterion("upper(operationlog_details_remarks) like", value.toUpperCase(), "operationlogDetailsRemarks");
            return (Criteria) this;
        }

        public Criteria andOperationlogDetailsStatusLikeInsensitive(String value) {
            addCriterion("upper(operationlog_details_status) like", value.toUpperCase(), "operationlogDetailsStatus");
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