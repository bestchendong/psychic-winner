package com.trust.entity.cms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmsPictureLibraryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsPictureLibraryExample() {
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

        public Criteria andCPictureIdIsNull() {
            addCriterion("c_picture_id is null");
            return (Criteria) this;
        }

        public Criteria andCPictureIdIsNotNull() {
            addCriterion("c_picture_id is not null");
            return (Criteria) this;
        }

        public Criteria andCPictureIdEqualTo(Long value) {
            addCriterion("c_picture_id =", value, "cPictureId");
            return (Criteria) this;
        }

        public Criteria andCPictureIdNotEqualTo(Long value) {
            addCriterion("c_picture_id <>", value, "cPictureId");
            return (Criteria) this;
        }

        public Criteria andCPictureIdGreaterThan(Long value) {
            addCriterion("c_picture_id >", value, "cPictureId");
            return (Criteria) this;
        }

        public Criteria andCPictureIdGreaterThanOrEqualTo(Long value) {
            addCriterion("c_picture_id >=", value, "cPictureId");
            return (Criteria) this;
        }

        public Criteria andCPictureIdLessThan(Long value) {
            addCriterion("c_picture_id <", value, "cPictureId");
            return (Criteria) this;
        }

        public Criteria andCPictureIdLessThanOrEqualTo(Long value) {
            addCriterion("c_picture_id <=", value, "cPictureId");
            return (Criteria) this;
        }

        public Criteria andCPictureIdIn(List<Long> values) {
            addCriterion("c_picture_id in", values, "cPictureId");
            return (Criteria) this;
        }

        public Criteria andCPictureIdNotIn(List<Long> values) {
            addCriterion("c_picture_id not in", values, "cPictureId");
            return (Criteria) this;
        }

        public Criteria andCPictureIdBetween(Long value1, Long value2) {
            addCriterion("c_picture_id between", value1, value2, "cPictureId");
            return (Criteria) this;
        }

        public Criteria andCPictureIdNotBetween(Long value1, Long value2) {
            addCriterion("c_picture_id not between", value1, value2, "cPictureId");
            return (Criteria) this;
        }

        public Criteria andCCreatorIdIsNull() {
            addCriterion("c_creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCCreatorIdIsNotNull() {
            addCriterion("c_creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCCreatorIdEqualTo(Long value) {
            addCriterion("c_creator_id =", value, "cCreatorId");
            return (Criteria) this;
        }

        public Criteria andCCreatorIdNotEqualTo(Long value) {
            addCriterion("c_creator_id <>", value, "cCreatorId");
            return (Criteria) this;
        }

        public Criteria andCCreatorIdGreaterThan(Long value) {
            addCriterion("c_creator_id >", value, "cCreatorId");
            return (Criteria) this;
        }

        public Criteria andCCreatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("c_creator_id >=", value, "cCreatorId");
            return (Criteria) this;
        }

        public Criteria andCCreatorIdLessThan(Long value) {
            addCriterion("c_creator_id <", value, "cCreatorId");
            return (Criteria) this;
        }

        public Criteria andCCreatorIdLessThanOrEqualTo(Long value) {
            addCriterion("c_creator_id <=", value, "cCreatorId");
            return (Criteria) this;
        }

        public Criteria andCCreatorIdIn(List<Long> values) {
            addCriterion("c_creator_id in", values, "cCreatorId");
            return (Criteria) this;
        }

        public Criteria andCCreatorIdNotIn(List<Long> values) {
            addCriterion("c_creator_id not in", values, "cCreatorId");
            return (Criteria) this;
        }

        public Criteria andCCreatorIdBetween(Long value1, Long value2) {
            addCriterion("c_creator_id between", value1, value2, "cCreatorId");
            return (Criteria) this;
        }

        public Criteria andCCreatorIdNotBetween(Long value1, Long value2) {
            addCriterion("c_creator_id not between", value1, value2, "cCreatorId");
            return (Criteria) this;
        }

        public Criteria andCCreatorNameIsNull() {
            addCriterion("c_creator_name is null");
            return (Criteria) this;
        }

        public Criteria andCCreatorNameIsNotNull() {
            addCriterion("c_creator_name is not null");
            return (Criteria) this;
        }

        public Criteria andCCreatorNameEqualTo(String value) {
            addCriterion("c_creator_name =", value, "cCreatorName");
            return (Criteria) this;
        }

        public Criteria andCCreatorNameNotEqualTo(String value) {
            addCriterion("c_creator_name <>", value, "cCreatorName");
            return (Criteria) this;
        }

        public Criteria andCCreatorNameGreaterThan(String value) {
            addCriterion("c_creator_name >", value, "cCreatorName");
            return (Criteria) this;
        }

        public Criteria andCCreatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_creator_name >=", value, "cCreatorName");
            return (Criteria) this;
        }

        public Criteria andCCreatorNameLessThan(String value) {
            addCriterion("c_creator_name <", value, "cCreatorName");
            return (Criteria) this;
        }

        public Criteria andCCreatorNameLessThanOrEqualTo(String value) {
            addCriterion("c_creator_name <=", value, "cCreatorName");
            return (Criteria) this;
        }

        public Criteria andCCreatorNameLike(String value) {
            addCriterion("c_creator_name like", value, "cCreatorName");
            return (Criteria) this;
        }

        public Criteria andCCreatorNameNotLike(String value) {
            addCriterion("c_creator_name not like", value, "cCreatorName");
            return (Criteria) this;
        }

        public Criteria andCCreatorNameIn(List<String> values) {
            addCriterion("c_creator_name in", values, "cCreatorName");
            return (Criteria) this;
        }

        public Criteria andCCreatorNameNotIn(List<String> values) {
            addCriterion("c_creator_name not in", values, "cCreatorName");
            return (Criteria) this;
        }

        public Criteria andCCreatorNameBetween(String value1, String value2) {
            addCriterion("c_creator_name between", value1, value2, "cCreatorName");
            return (Criteria) this;
        }

        public Criteria andCCreatorNameNotBetween(String value1, String value2) {
            addCriterion("c_creator_name not between", value1, value2, "cCreatorName");
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

        public Criteria andCPictureNameIsNull() {
            addCriterion("c_picture_name is null");
            return (Criteria) this;
        }

        public Criteria andCPictureNameIsNotNull() {
            addCriterion("c_picture_name is not null");
            return (Criteria) this;
        }

        public Criteria andCPictureNameEqualTo(String value) {
            addCriterion("c_picture_name =", value, "cPictureName");
            return (Criteria) this;
        }

        public Criteria andCPictureNameNotEqualTo(String value) {
            addCriterion("c_picture_name <>", value, "cPictureName");
            return (Criteria) this;
        }

        public Criteria andCPictureNameGreaterThan(String value) {
            addCriterion("c_picture_name >", value, "cPictureName");
            return (Criteria) this;
        }

        public Criteria andCPictureNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_picture_name >=", value, "cPictureName");
            return (Criteria) this;
        }

        public Criteria andCPictureNameLessThan(String value) {
            addCriterion("c_picture_name <", value, "cPictureName");
            return (Criteria) this;
        }

        public Criteria andCPictureNameLessThanOrEqualTo(String value) {
            addCriterion("c_picture_name <=", value, "cPictureName");
            return (Criteria) this;
        }

        public Criteria andCPictureNameLike(String value) {
            addCriterion("c_picture_name like", value, "cPictureName");
            return (Criteria) this;
        }

        public Criteria andCPictureNameNotLike(String value) {
            addCriterion("c_picture_name not like", value, "cPictureName");
            return (Criteria) this;
        }

        public Criteria andCPictureNameIn(List<String> values) {
            addCriterion("c_picture_name in", values, "cPictureName");
            return (Criteria) this;
        }

        public Criteria andCPictureNameNotIn(List<String> values) {
            addCriterion("c_picture_name not in", values, "cPictureName");
            return (Criteria) this;
        }

        public Criteria andCPictureNameBetween(String value1, String value2) {
            addCriterion("c_picture_name between", value1, value2, "cPictureName");
            return (Criteria) this;
        }

        public Criteria andCPictureNameNotBetween(String value1, String value2) {
            addCriterion("c_picture_name not between", value1, value2, "cPictureName");
            return (Criteria) this;
        }

        public Criteria andCPictureUrlIsNull() {
            addCriterion("c_picture_url is null");
            return (Criteria) this;
        }

        public Criteria andCPictureUrlIsNotNull() {
            addCriterion("c_picture_url is not null");
            return (Criteria) this;
        }

        public Criteria andCPictureUrlEqualTo(String value) {
            addCriterion("c_picture_url =", value, "cPictureUrl");
            return (Criteria) this;
        }

        public Criteria andCPictureUrlNotEqualTo(String value) {
            addCriterion("c_picture_url <>", value, "cPictureUrl");
            return (Criteria) this;
        }

        public Criteria andCPictureUrlGreaterThan(String value) {
            addCriterion("c_picture_url >", value, "cPictureUrl");
            return (Criteria) this;
        }

        public Criteria andCPictureUrlGreaterThanOrEqualTo(String value) {
            addCriterion("c_picture_url >=", value, "cPictureUrl");
            return (Criteria) this;
        }

        public Criteria andCPictureUrlLessThan(String value) {
            addCriterion("c_picture_url <", value, "cPictureUrl");
            return (Criteria) this;
        }

        public Criteria andCPictureUrlLessThanOrEqualTo(String value) {
            addCriterion("c_picture_url <=", value, "cPictureUrl");
            return (Criteria) this;
        }

        public Criteria andCPictureUrlLike(String value) {
            addCriterion("c_picture_url like", value, "cPictureUrl");
            return (Criteria) this;
        }

        public Criteria andCPictureUrlNotLike(String value) {
            addCriterion("c_picture_url not like", value, "cPictureUrl");
            return (Criteria) this;
        }

        public Criteria andCPictureUrlIn(List<String> values) {
            addCriterion("c_picture_url in", values, "cPictureUrl");
            return (Criteria) this;
        }

        public Criteria andCPictureUrlNotIn(List<String> values) {
            addCriterion("c_picture_url not in", values, "cPictureUrl");
            return (Criteria) this;
        }

        public Criteria andCPictureUrlBetween(String value1, String value2) {
            addCriterion("c_picture_url between", value1, value2, "cPictureUrl");
            return (Criteria) this;
        }

        public Criteria andCPictureUrlNotBetween(String value1, String value2) {
            addCriterion("c_picture_url not between", value1, value2, "cPictureUrl");
            return (Criteria) this;
        }

        public Criteria andCPictureSizeIsNull() {
            addCriterion("c_picture_size is null");
            return (Criteria) this;
        }

        public Criteria andCPictureSizeIsNotNull() {
            addCriterion("c_picture_size is not null");
            return (Criteria) this;
        }

        public Criteria andCPictureSizeEqualTo(String value) {
            addCriterion("c_picture_size =", value, "cPictureSize");
            return (Criteria) this;
        }

        public Criteria andCPictureSizeNotEqualTo(String value) {
            addCriterion("c_picture_size <>", value, "cPictureSize");
            return (Criteria) this;
        }

        public Criteria andCPictureSizeGreaterThan(String value) {
            addCriterion("c_picture_size >", value, "cPictureSize");
            return (Criteria) this;
        }

        public Criteria andCPictureSizeGreaterThanOrEqualTo(String value) {
            addCriterion("c_picture_size >=", value, "cPictureSize");
            return (Criteria) this;
        }

        public Criteria andCPictureSizeLessThan(String value) {
            addCriterion("c_picture_size <", value, "cPictureSize");
            return (Criteria) this;
        }

        public Criteria andCPictureSizeLessThanOrEqualTo(String value) {
            addCriterion("c_picture_size <=", value, "cPictureSize");
            return (Criteria) this;
        }

        public Criteria andCPictureSizeLike(String value) {
            addCriterion("c_picture_size like", value, "cPictureSize");
            return (Criteria) this;
        }

        public Criteria andCPictureSizeNotLike(String value) {
            addCriterion("c_picture_size not like", value, "cPictureSize");
            return (Criteria) this;
        }

        public Criteria andCPictureSizeIn(List<String> values) {
            addCriterion("c_picture_size in", values, "cPictureSize");
            return (Criteria) this;
        }

        public Criteria andCPictureSizeNotIn(List<String> values) {
            addCriterion("c_picture_size not in", values, "cPictureSize");
            return (Criteria) this;
        }

        public Criteria andCPictureSizeBetween(String value1, String value2) {
            addCriterion("c_picture_size between", value1, value2, "cPictureSize");
            return (Criteria) this;
        }

        public Criteria andCPictureSizeNotBetween(String value1, String value2) {
            addCriterion("c_picture_size not between", value1, value2, "cPictureSize");
            return (Criteria) this;
        }

        public Criteria andCPictureDescribeIsNull() {
            addCriterion("c_picture_describe is null");
            return (Criteria) this;
        }

        public Criteria andCPictureDescribeIsNotNull() {
            addCriterion("c_picture_describe is not null");
            return (Criteria) this;
        }

        public Criteria andCPictureDescribeEqualTo(String value) {
            addCriterion("c_picture_describe =", value, "cPictureDescribe");
            return (Criteria) this;
        }

        public Criteria andCPictureDescribeNotEqualTo(String value) {
            addCriterion("c_picture_describe <>", value, "cPictureDescribe");
            return (Criteria) this;
        }

        public Criteria andCPictureDescribeGreaterThan(String value) {
            addCriterion("c_picture_describe >", value, "cPictureDescribe");
            return (Criteria) this;
        }

        public Criteria andCPictureDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("c_picture_describe >=", value, "cPictureDescribe");
            return (Criteria) this;
        }

        public Criteria andCPictureDescribeLessThan(String value) {
            addCriterion("c_picture_describe <", value, "cPictureDescribe");
            return (Criteria) this;
        }

        public Criteria andCPictureDescribeLessThanOrEqualTo(String value) {
            addCriterion("c_picture_describe <=", value, "cPictureDescribe");
            return (Criteria) this;
        }

        public Criteria andCPictureDescribeLike(String value) {
            addCriterion("c_picture_describe like", value, "cPictureDescribe");
            return (Criteria) this;
        }

        public Criteria andCPictureDescribeNotLike(String value) {
            addCriterion("c_picture_describe not like", value, "cPictureDescribe");
            return (Criteria) this;
        }

        public Criteria andCPictureDescribeIn(List<String> values) {
            addCriterion("c_picture_describe in", values, "cPictureDescribe");
            return (Criteria) this;
        }

        public Criteria andCPictureDescribeNotIn(List<String> values) {
            addCriterion("c_picture_describe not in", values, "cPictureDescribe");
            return (Criteria) this;
        }

        public Criteria andCPictureDescribeBetween(String value1, String value2) {
            addCriterion("c_picture_describe between", value1, value2, "cPictureDescribe");
            return (Criteria) this;
        }

        public Criteria andCPictureDescribeNotBetween(String value1, String value2) {
            addCriterion("c_picture_describe not between", value1, value2, "cPictureDescribe");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryNameIsNull() {
            addCriterion("c_picture_category_name is null");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryNameIsNotNull() {
            addCriterion("c_picture_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryNameEqualTo(String value) {
            addCriterion("c_picture_category_name =", value, "cPictureCategoryName");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryNameNotEqualTo(String value) {
            addCriterion("c_picture_category_name <>", value, "cPictureCategoryName");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryNameGreaterThan(String value) {
            addCriterion("c_picture_category_name >", value, "cPictureCategoryName");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_picture_category_name >=", value, "cPictureCategoryName");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryNameLessThan(String value) {
            addCriterion("c_picture_category_name <", value, "cPictureCategoryName");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("c_picture_category_name <=", value, "cPictureCategoryName");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryNameLike(String value) {
            addCriterion("c_picture_category_name like", value, "cPictureCategoryName");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryNameNotLike(String value) {
            addCriterion("c_picture_category_name not like", value, "cPictureCategoryName");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryNameIn(List<String> values) {
            addCriterion("c_picture_category_name in", values, "cPictureCategoryName");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryNameNotIn(List<String> values) {
            addCriterion("c_picture_category_name not in", values, "cPictureCategoryName");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryNameBetween(String value1, String value2) {
            addCriterion("c_picture_category_name between", value1, value2, "cPictureCategoryName");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryNameNotBetween(String value1, String value2) {
            addCriterion("c_picture_category_name not between", value1, value2, "cPictureCategoryName");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryCodeIsNull() {
            addCriterion("c_picture_category_code is null");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryCodeIsNotNull() {
            addCriterion("c_picture_category_code is not null");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryCodeEqualTo(String value) {
            addCriterion("c_picture_category_code =", value, "cPictureCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryCodeNotEqualTo(String value) {
            addCriterion("c_picture_category_code <>", value, "cPictureCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryCodeGreaterThan(String value) {
            addCriterion("c_picture_category_code >", value, "cPictureCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("c_picture_category_code >=", value, "cPictureCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryCodeLessThan(String value) {
            addCriterion("c_picture_category_code <", value, "cPictureCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryCodeLessThanOrEqualTo(String value) {
            addCriterion("c_picture_category_code <=", value, "cPictureCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryCodeLike(String value) {
            addCriterion("c_picture_category_code like", value, "cPictureCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryCodeNotLike(String value) {
            addCriterion("c_picture_category_code not like", value, "cPictureCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryCodeIn(List<String> values) {
            addCriterion("c_picture_category_code in", values, "cPictureCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryCodeNotIn(List<String> values) {
            addCriterion("c_picture_category_code not in", values, "cPictureCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryCodeBetween(String value1, String value2) {
            addCriterion("c_picture_category_code between", value1, value2, "cPictureCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryCodeNotBetween(String value1, String value2) {
            addCriterion("c_picture_category_code not between", value1, value2, "cPictureCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCPictureFormatIsNull() {
            addCriterion("c_picture_format is null");
            return (Criteria) this;
        }

        public Criteria andCPictureFormatIsNotNull() {
            addCriterion("c_picture_format is not null");
            return (Criteria) this;
        }

        public Criteria andCPictureFormatEqualTo(String value) {
            addCriterion("c_picture_format =", value, "cPictureFormat");
            return (Criteria) this;
        }

        public Criteria andCPictureFormatNotEqualTo(String value) {
            addCriterion("c_picture_format <>", value, "cPictureFormat");
            return (Criteria) this;
        }

        public Criteria andCPictureFormatGreaterThan(String value) {
            addCriterion("c_picture_format >", value, "cPictureFormat");
            return (Criteria) this;
        }

        public Criteria andCPictureFormatGreaterThanOrEqualTo(String value) {
            addCriterion("c_picture_format >=", value, "cPictureFormat");
            return (Criteria) this;
        }

        public Criteria andCPictureFormatLessThan(String value) {
            addCriterion("c_picture_format <", value, "cPictureFormat");
            return (Criteria) this;
        }

        public Criteria andCPictureFormatLessThanOrEqualTo(String value) {
            addCriterion("c_picture_format <=", value, "cPictureFormat");
            return (Criteria) this;
        }

        public Criteria andCPictureFormatLike(String value) {
            addCriterion("c_picture_format like", value, "cPictureFormat");
            return (Criteria) this;
        }

        public Criteria andCPictureFormatNotLike(String value) {
            addCriterion("c_picture_format not like", value, "cPictureFormat");
            return (Criteria) this;
        }

        public Criteria andCPictureFormatIn(List<String> values) {
            addCriterion("c_picture_format in", values, "cPictureFormat");
            return (Criteria) this;
        }

        public Criteria andCPictureFormatNotIn(List<String> values) {
            addCriterion("c_picture_format not in", values, "cPictureFormat");
            return (Criteria) this;
        }

        public Criteria andCPictureFormatBetween(String value1, String value2) {
            addCriterion("c_picture_format between", value1, value2, "cPictureFormat");
            return (Criteria) this;
        }

        public Criteria andCPictureFormatNotBetween(String value1, String value2) {
            addCriterion("c_picture_format not between", value1, value2, "cPictureFormat");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIsNull() {
            addCriterion("c_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIsNotNull() {
            addCriterion("c_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeEqualTo(Date value) {
            addCriterion("c_create_time =", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotEqualTo(Date value) {
            addCriterion("c_create_time <>", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeGreaterThan(Date value) {
            addCriterion("c_create_time >", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_create_time >=", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeLessThan(Date value) {
            addCriterion("c_create_time <", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("c_create_time <=", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIn(List<Date> values) {
            addCriterion("c_create_time in", values, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotIn(List<Date> values) {
            addCriterion("c_create_time not in", values, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeBetween(Date value1, Date value2) {
            addCriterion("c_create_time between", value1, value2, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("c_create_time not between", value1, value2, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreatorNameLikeInsensitive(String value) {
            addCriterion("upper(c_creator_name) like", value.toUpperCase(), "cCreatorName");
            return (Criteria) this;
        }

        public Criteria andCSiteCodeLikeInsensitive(String value) {
            addCriterion("upper(c_site_code) like", value.toUpperCase(), "cSiteCode");
            return (Criteria) this;
        }

        public Criteria andCPictureNameLikeInsensitive(String value) {
            addCriterion("upper(c_picture_name) like", value.toUpperCase(), "cPictureName");
            return (Criteria) this;
        }

        public Criteria andCPictureUrlLikeInsensitive(String value) {
            addCriterion("upper(c_picture_url) like", value.toUpperCase(), "cPictureUrl");
            return (Criteria) this;
        }

        public Criteria andCPictureSizeLikeInsensitive(String value) {
            addCriterion("upper(c_picture_size) like", value.toUpperCase(), "cPictureSize");
            return (Criteria) this;
        }

        public Criteria andCPictureDescribeLikeInsensitive(String value) {
            addCriterion("upper(c_picture_describe) like", value.toUpperCase(), "cPictureDescribe");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryNameLikeInsensitive(String value) {
            addCriterion("upper(c_picture_category_name) like", value.toUpperCase(), "cPictureCategoryName");
            return (Criteria) this;
        }

        public Criteria andCPictureCategoryCodeLikeInsensitive(String value) {
            addCriterion("upper(c_picture_category_code) like", value.toUpperCase(), "cPictureCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCPictureFormatLikeInsensitive(String value) {
            addCriterion("upper(c_picture_format) like", value.toUpperCase(), "cPictureFormat");
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