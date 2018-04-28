package com.trust.entity.cms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmsArticleOperateLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsArticleOperateLogExample() {
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

        public Criteria andCmsOperateLogIdIsNull() {
            addCriterion("cms_operate_log_id is null");
            return (Criteria) this;
        }

        public Criteria andCmsOperateLogIdIsNotNull() {
            addCriterion("cms_operate_log_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmsOperateLogIdEqualTo(Long value) {
            addCriterion("cms_operate_log_id =", value, "cmsOperateLogId");
            return (Criteria) this;
        }

        public Criteria andCmsOperateLogIdNotEqualTo(Long value) {
            addCriterion("cms_operate_log_id <>", value, "cmsOperateLogId");
            return (Criteria) this;
        }

        public Criteria andCmsOperateLogIdGreaterThan(Long value) {
            addCriterion("cms_operate_log_id >", value, "cmsOperateLogId");
            return (Criteria) this;
        }

        public Criteria andCmsOperateLogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cms_operate_log_id >=", value, "cmsOperateLogId");
            return (Criteria) this;
        }

        public Criteria andCmsOperateLogIdLessThan(Long value) {
            addCriterion("cms_operate_log_id <", value, "cmsOperateLogId");
            return (Criteria) this;
        }

        public Criteria andCmsOperateLogIdLessThanOrEqualTo(Long value) {
            addCriterion("cms_operate_log_id <=", value, "cmsOperateLogId");
            return (Criteria) this;
        }

        public Criteria andCmsOperateLogIdIn(List<Long> values) {
            addCriterion("cms_operate_log_id in", values, "cmsOperateLogId");
            return (Criteria) this;
        }

        public Criteria andCmsOperateLogIdNotIn(List<Long> values) {
            addCriterion("cms_operate_log_id not in", values, "cmsOperateLogId");
            return (Criteria) this;
        }

        public Criteria andCmsOperateLogIdBetween(Long value1, Long value2) {
            addCriterion("cms_operate_log_id between", value1, value2, "cmsOperateLogId");
            return (Criteria) this;
        }

        public Criteria andCmsOperateLogIdNotBetween(Long value1, Long value2) {
            addCriterion("cms_operate_log_id not between", value1, value2, "cmsOperateLogId");
            return (Criteria) this;
        }

        public Criteria andCmsSiteCodeIsNull() {
            addCriterion("cms_site_code is null");
            return (Criteria) this;
        }

        public Criteria andCmsSiteCodeIsNotNull() {
            addCriterion("cms_site_code is not null");
            return (Criteria) this;
        }

        public Criteria andCmsSiteCodeEqualTo(String value) {
            addCriterion("cms_site_code =", value, "cmsSiteCode");
            return (Criteria) this;
        }

        public Criteria andCmsSiteCodeNotEqualTo(String value) {
            addCriterion("cms_site_code <>", value, "cmsSiteCode");
            return (Criteria) this;
        }

        public Criteria andCmsSiteCodeGreaterThan(String value) {
            addCriterion("cms_site_code >", value, "cmsSiteCode");
            return (Criteria) this;
        }

        public Criteria andCmsSiteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cms_site_code >=", value, "cmsSiteCode");
            return (Criteria) this;
        }

        public Criteria andCmsSiteCodeLessThan(String value) {
            addCriterion("cms_site_code <", value, "cmsSiteCode");
            return (Criteria) this;
        }

        public Criteria andCmsSiteCodeLessThanOrEqualTo(String value) {
            addCriterion("cms_site_code <=", value, "cmsSiteCode");
            return (Criteria) this;
        }

        public Criteria andCmsSiteCodeLike(String value) {
            addCriterion("cms_site_code like", value, "cmsSiteCode");
            return (Criteria) this;
        }

        public Criteria andCmsSiteCodeNotLike(String value) {
            addCriterion("cms_site_code not like", value, "cmsSiteCode");
            return (Criteria) this;
        }

        public Criteria andCmsSiteCodeIn(List<String> values) {
            addCriterion("cms_site_code in", values, "cmsSiteCode");
            return (Criteria) this;
        }

        public Criteria andCmsSiteCodeNotIn(List<String> values) {
            addCriterion("cms_site_code not in", values, "cmsSiteCode");
            return (Criteria) this;
        }

        public Criteria andCmsSiteCodeBetween(String value1, String value2) {
            addCriterion("cms_site_code between", value1, value2, "cmsSiteCode");
            return (Criteria) this;
        }

        public Criteria andCmsSiteCodeNotBetween(String value1, String value2) {
            addCriterion("cms_site_code not between", value1, value2, "cmsSiteCode");
            return (Criteria) this;
        }

        public Criteria andCmsSiteIdIsNull() {
            addCriterion("cms_site_id is null");
            return (Criteria) this;
        }

        public Criteria andCmsSiteIdIsNotNull() {
            addCriterion("cms_site_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmsSiteIdEqualTo(Long value) {
            addCriterion("cms_site_id =", value, "cmsSiteId");
            return (Criteria) this;
        }

        public Criteria andCmsSiteIdNotEqualTo(Long value) {
            addCriterion("cms_site_id <>", value, "cmsSiteId");
            return (Criteria) this;
        }

        public Criteria andCmsSiteIdGreaterThan(Long value) {
            addCriterion("cms_site_id >", value, "cmsSiteId");
            return (Criteria) this;
        }

        public Criteria andCmsSiteIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cms_site_id >=", value, "cmsSiteId");
            return (Criteria) this;
        }

        public Criteria andCmsSiteIdLessThan(Long value) {
            addCriterion("cms_site_id <", value, "cmsSiteId");
            return (Criteria) this;
        }

        public Criteria andCmsSiteIdLessThanOrEqualTo(Long value) {
            addCriterion("cms_site_id <=", value, "cmsSiteId");
            return (Criteria) this;
        }

        public Criteria andCmsSiteIdIn(List<Long> values) {
            addCriterion("cms_site_id in", values, "cmsSiteId");
            return (Criteria) this;
        }

        public Criteria andCmsSiteIdNotIn(List<Long> values) {
            addCriterion("cms_site_id not in", values, "cmsSiteId");
            return (Criteria) this;
        }

        public Criteria andCmsSiteIdBetween(Long value1, Long value2) {
            addCriterion("cms_site_id between", value1, value2, "cmsSiteId");
            return (Criteria) this;
        }

        public Criteria andCmsSiteIdNotBetween(Long value1, Long value2) {
            addCriterion("cms_site_id not between", value1, value2, "cmsSiteId");
            return (Criteria) this;
        }

        public Criteria andCmsUserNameIsNull() {
            addCriterion("cms_user_name is null");
            return (Criteria) this;
        }

        public Criteria andCmsUserNameIsNotNull() {
            addCriterion("cms_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andCmsUserNameEqualTo(String value) {
            addCriterion("cms_user_name =", value, "cmsUserName");
            return (Criteria) this;
        }

        public Criteria andCmsUserNameNotEqualTo(String value) {
            addCriterion("cms_user_name <>", value, "cmsUserName");
            return (Criteria) this;
        }

        public Criteria andCmsUserNameGreaterThan(String value) {
            addCriterion("cms_user_name >", value, "cmsUserName");
            return (Criteria) this;
        }

        public Criteria andCmsUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("cms_user_name >=", value, "cmsUserName");
            return (Criteria) this;
        }

        public Criteria andCmsUserNameLessThan(String value) {
            addCriterion("cms_user_name <", value, "cmsUserName");
            return (Criteria) this;
        }

        public Criteria andCmsUserNameLessThanOrEqualTo(String value) {
            addCriterion("cms_user_name <=", value, "cmsUserName");
            return (Criteria) this;
        }

        public Criteria andCmsUserNameLike(String value) {
            addCriterion("cms_user_name like", value, "cmsUserName");
            return (Criteria) this;
        }

        public Criteria andCmsUserNameNotLike(String value) {
            addCriterion("cms_user_name not like", value, "cmsUserName");
            return (Criteria) this;
        }

        public Criteria andCmsUserNameIn(List<String> values) {
            addCriterion("cms_user_name in", values, "cmsUserName");
            return (Criteria) this;
        }

        public Criteria andCmsUserNameNotIn(List<String> values) {
            addCriterion("cms_user_name not in", values, "cmsUserName");
            return (Criteria) this;
        }

        public Criteria andCmsUserNameBetween(String value1, String value2) {
            addCriterion("cms_user_name between", value1, value2, "cmsUserName");
            return (Criteria) this;
        }

        public Criteria andCmsUserNameNotBetween(String value1, String value2) {
            addCriterion("cms_user_name not between", value1, value2, "cmsUserName");
            return (Criteria) this;
        }

        public Criteria andCmsResourcesNameIsNull() {
            addCriterion("cms_resources_name is null");
            return (Criteria) this;
        }

        public Criteria andCmsResourcesNameIsNotNull() {
            addCriterion("cms_resources_name is not null");
            return (Criteria) this;
        }

        public Criteria andCmsResourcesNameEqualTo(String value) {
            addCriterion("cms_resources_name =", value, "cmsResourcesName");
            return (Criteria) this;
        }

        public Criteria andCmsResourcesNameNotEqualTo(String value) {
            addCriterion("cms_resources_name <>", value, "cmsResourcesName");
            return (Criteria) this;
        }

        public Criteria andCmsResourcesNameGreaterThan(String value) {
            addCriterion("cms_resources_name >", value, "cmsResourcesName");
            return (Criteria) this;
        }

        public Criteria andCmsResourcesNameGreaterThanOrEqualTo(String value) {
            addCriterion("cms_resources_name >=", value, "cmsResourcesName");
            return (Criteria) this;
        }

        public Criteria andCmsResourcesNameLessThan(String value) {
            addCriterion("cms_resources_name <", value, "cmsResourcesName");
            return (Criteria) this;
        }

        public Criteria andCmsResourcesNameLessThanOrEqualTo(String value) {
            addCriterion("cms_resources_name <=", value, "cmsResourcesName");
            return (Criteria) this;
        }

        public Criteria andCmsResourcesNameLike(String value) {
            addCriterion("cms_resources_name like", value, "cmsResourcesName");
            return (Criteria) this;
        }

        public Criteria andCmsResourcesNameNotLike(String value) {
            addCriterion("cms_resources_name not like", value, "cmsResourcesName");
            return (Criteria) this;
        }

        public Criteria andCmsResourcesNameIn(List<String> values) {
            addCriterion("cms_resources_name in", values, "cmsResourcesName");
            return (Criteria) this;
        }

        public Criteria andCmsResourcesNameNotIn(List<String> values) {
            addCriterion("cms_resources_name not in", values, "cmsResourcesName");
            return (Criteria) this;
        }

        public Criteria andCmsResourcesNameBetween(String value1, String value2) {
            addCriterion("cms_resources_name between", value1, value2, "cmsResourcesName");
            return (Criteria) this;
        }

        public Criteria andCmsResourcesNameNotBetween(String value1, String value2) {
            addCriterion("cms_resources_name not between", value1, value2, "cmsResourcesName");
            return (Criteria) this;
        }

        public Criteria andCmsOperateDateIsNull() {
            addCriterion("cms_operate_date is null");
            return (Criteria) this;
        }

        public Criteria andCmsOperateDateIsNotNull() {
            addCriterion("cms_operate_date is not null");
            return (Criteria) this;
        }

        public Criteria andCmsOperateDateEqualTo(Date value) {
            addCriterion("cms_operate_date =", value, "cmsOperateDate");
            return (Criteria) this;
        }

        public Criteria andCmsOperateDateNotEqualTo(Date value) {
            addCriterion("cms_operate_date <>", value, "cmsOperateDate");
            return (Criteria) this;
        }

        public Criteria andCmsOperateDateGreaterThan(Date value) {
            addCriterion("cms_operate_date >", value, "cmsOperateDate");
            return (Criteria) this;
        }

        public Criteria andCmsOperateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("cms_operate_date >=", value, "cmsOperateDate");
            return (Criteria) this;
        }

        public Criteria andCmsOperateDateLessThan(Date value) {
            addCriterion("cms_operate_date <", value, "cmsOperateDate");
            return (Criteria) this;
        }

        public Criteria andCmsOperateDateLessThanOrEqualTo(Date value) {
            addCriterion("cms_operate_date <=", value, "cmsOperateDate");
            return (Criteria) this;
        }

        public Criteria andCmsOperateDateIn(List<Date> values) {
            addCriterion("cms_operate_date in", values, "cmsOperateDate");
            return (Criteria) this;
        }

        public Criteria andCmsOperateDateNotIn(List<Date> values) {
            addCriterion("cms_operate_date not in", values, "cmsOperateDate");
            return (Criteria) this;
        }

        public Criteria andCmsOperateDateBetween(Date value1, Date value2) {
            addCriterion("cms_operate_date between", value1, value2, "cmsOperateDate");
            return (Criteria) this;
        }

        public Criteria andCmsOperateDateNotBetween(Date value1, Date value2) {
            addCriterion("cms_operate_date not between", value1, value2, "cmsOperateDate");
            return (Criteria) this;
        }

        public Criteria andCmsArticleIdIsNull() {
            addCriterion("cms_article_id is null");
            return (Criteria) this;
        }

        public Criteria andCmsArticleIdIsNotNull() {
            addCriterion("cms_article_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmsArticleIdEqualTo(Long value) {
            addCriterion("cms_article_id =", value, "cmsArticleId");
            return (Criteria) this;
        }

        public Criteria andCmsArticleIdNotEqualTo(Long value) {
            addCriterion("cms_article_id <>", value, "cmsArticleId");
            return (Criteria) this;
        }

        public Criteria andCmsArticleIdGreaterThan(Long value) {
            addCriterion("cms_article_id >", value, "cmsArticleId");
            return (Criteria) this;
        }

        public Criteria andCmsArticleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cms_article_id >=", value, "cmsArticleId");
            return (Criteria) this;
        }

        public Criteria andCmsArticleIdLessThan(Long value) {
            addCriterion("cms_article_id <", value, "cmsArticleId");
            return (Criteria) this;
        }

        public Criteria andCmsArticleIdLessThanOrEqualTo(Long value) {
            addCriterion("cms_article_id <=", value, "cmsArticleId");
            return (Criteria) this;
        }

        public Criteria andCmsArticleIdIn(List<Long> values) {
            addCriterion("cms_article_id in", values, "cmsArticleId");
            return (Criteria) this;
        }

        public Criteria andCmsArticleIdNotIn(List<Long> values) {
            addCriterion("cms_article_id not in", values, "cmsArticleId");
            return (Criteria) this;
        }

        public Criteria andCmsArticleIdBetween(Long value1, Long value2) {
            addCriterion("cms_article_id between", value1, value2, "cmsArticleId");
            return (Criteria) this;
        }

        public Criteria andCmsArticleIdNotBetween(Long value1, Long value2) {
            addCriterion("cms_article_id not between", value1, value2, "cmsArticleId");
            return (Criteria) this;
        }

        public Criteria andCmsArtcileNameIsNull() {
            addCriterion("cms_artcile_name is null");
            return (Criteria) this;
        }

        public Criteria andCmsArtcileNameIsNotNull() {
            addCriterion("cms_artcile_name is not null");
            return (Criteria) this;
        }

        public Criteria andCmsArtcileNameEqualTo(String value) {
            addCriterion("cms_artcile_name =", value, "cmsArtcileName");
            return (Criteria) this;
        }

        public Criteria andCmsArtcileNameNotEqualTo(String value) {
            addCriterion("cms_artcile_name <>", value, "cmsArtcileName");
            return (Criteria) this;
        }

        public Criteria andCmsArtcileNameGreaterThan(String value) {
            addCriterion("cms_artcile_name >", value, "cmsArtcileName");
            return (Criteria) this;
        }

        public Criteria andCmsArtcileNameGreaterThanOrEqualTo(String value) {
            addCriterion("cms_artcile_name >=", value, "cmsArtcileName");
            return (Criteria) this;
        }

        public Criteria andCmsArtcileNameLessThan(String value) {
            addCriterion("cms_artcile_name <", value, "cmsArtcileName");
            return (Criteria) this;
        }

        public Criteria andCmsArtcileNameLessThanOrEqualTo(String value) {
            addCriterion("cms_artcile_name <=", value, "cmsArtcileName");
            return (Criteria) this;
        }

        public Criteria andCmsArtcileNameLike(String value) {
            addCriterion("cms_artcile_name like", value, "cmsArtcileName");
            return (Criteria) this;
        }

        public Criteria andCmsArtcileNameNotLike(String value) {
            addCriterion("cms_artcile_name not like", value, "cmsArtcileName");
            return (Criteria) this;
        }

        public Criteria andCmsArtcileNameIn(List<String> values) {
            addCriterion("cms_artcile_name in", values, "cmsArtcileName");
            return (Criteria) this;
        }

        public Criteria andCmsArtcileNameNotIn(List<String> values) {
            addCriterion("cms_artcile_name not in", values, "cmsArtcileName");
            return (Criteria) this;
        }

        public Criteria andCmsArtcileNameBetween(String value1, String value2) {
            addCriterion("cms_artcile_name between", value1, value2, "cmsArtcileName");
            return (Criteria) this;
        }

        public Criteria andCmsArtcileNameNotBetween(String value1, String value2) {
            addCriterion("cms_artcile_name not between", value1, value2, "cmsArtcileName");
            return (Criteria) this;
        }

        public Criteria andCmsUserIdIsNull() {
            addCriterion("cms_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCmsUserIdIsNotNull() {
            addCriterion("cms_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmsUserIdEqualTo(Long value) {
            addCriterion("cms_user_id =", value, "cmsUserId");
            return (Criteria) this;
        }

        public Criteria andCmsUserIdNotEqualTo(Long value) {
            addCriterion("cms_user_id <>", value, "cmsUserId");
            return (Criteria) this;
        }

        public Criteria andCmsUserIdGreaterThan(Long value) {
            addCriterion("cms_user_id >", value, "cmsUserId");
            return (Criteria) this;
        }

        public Criteria andCmsUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cms_user_id >=", value, "cmsUserId");
            return (Criteria) this;
        }

        public Criteria andCmsUserIdLessThan(Long value) {
            addCriterion("cms_user_id <", value, "cmsUserId");
            return (Criteria) this;
        }

        public Criteria andCmsUserIdLessThanOrEqualTo(Long value) {
            addCriterion("cms_user_id <=", value, "cmsUserId");
            return (Criteria) this;
        }

        public Criteria andCmsUserIdIn(List<Long> values) {
            addCriterion("cms_user_id in", values, "cmsUserId");
            return (Criteria) this;
        }

        public Criteria andCmsUserIdNotIn(List<Long> values) {
            addCriterion("cms_user_id not in", values, "cmsUserId");
            return (Criteria) this;
        }

        public Criteria andCmsUserIdBetween(Long value1, Long value2) {
            addCriterion("cms_user_id between", value1, value2, "cmsUserId");
            return (Criteria) this;
        }

        public Criteria andCmsUserIdNotBetween(Long value1, Long value2) {
            addCriterion("cms_user_id not between", value1, value2, "cmsUserId");
            return (Criteria) this;
        }

        public Criteria andCmsOperateExplainIsNull() {
            addCriterion("cms_operate_explain is null");
            return (Criteria) this;
        }

        public Criteria andCmsOperateExplainIsNotNull() {
            addCriterion("cms_operate_explain is not null");
            return (Criteria) this;
        }

        public Criteria andCmsOperateExplainEqualTo(String value) {
            addCriterion("cms_operate_explain =", value, "cmsOperateExplain");
            return (Criteria) this;
        }

        public Criteria andCmsOperateExplainNotEqualTo(String value) {
            addCriterion("cms_operate_explain <>", value, "cmsOperateExplain");
            return (Criteria) this;
        }

        public Criteria andCmsOperateExplainGreaterThan(String value) {
            addCriterion("cms_operate_explain >", value, "cmsOperateExplain");
            return (Criteria) this;
        }

        public Criteria andCmsOperateExplainGreaterThanOrEqualTo(String value) {
            addCriterion("cms_operate_explain >=", value, "cmsOperateExplain");
            return (Criteria) this;
        }

        public Criteria andCmsOperateExplainLessThan(String value) {
            addCriterion("cms_operate_explain <", value, "cmsOperateExplain");
            return (Criteria) this;
        }

        public Criteria andCmsOperateExplainLessThanOrEqualTo(String value) {
            addCriterion("cms_operate_explain <=", value, "cmsOperateExplain");
            return (Criteria) this;
        }

        public Criteria andCmsOperateExplainLike(String value) {
            addCriterion("cms_operate_explain like", value, "cmsOperateExplain");
            return (Criteria) this;
        }

        public Criteria andCmsOperateExplainNotLike(String value) {
            addCriterion("cms_operate_explain not like", value, "cmsOperateExplain");
            return (Criteria) this;
        }

        public Criteria andCmsOperateExplainIn(List<String> values) {
            addCriterion("cms_operate_explain in", values, "cmsOperateExplain");
            return (Criteria) this;
        }

        public Criteria andCmsOperateExplainNotIn(List<String> values) {
            addCriterion("cms_operate_explain not in", values, "cmsOperateExplain");
            return (Criteria) this;
        }

        public Criteria andCmsOperateExplainBetween(String value1, String value2) {
            addCriterion("cms_operate_explain between", value1, value2, "cmsOperateExplain");
            return (Criteria) this;
        }

        public Criteria andCmsOperateExplainNotBetween(String value1, String value2) {
            addCriterion("cms_operate_explain not between", value1, value2, "cmsOperateExplain");
            return (Criteria) this;
        }

        public Criteria andCmsSiteCodeLikeInsensitive(String value) {
            addCriterion("upper(cms_site_code) like", value.toUpperCase(), "cmsSiteCode");
            return (Criteria) this;
        }

        public Criteria andCmsUserNameLikeInsensitive(String value) {
            addCriterion("upper(cms_user_name) like", value.toUpperCase(), "cmsUserName");
            return (Criteria) this;
        }

        public Criteria andCmsResourcesNameLikeInsensitive(String value) {
            addCriterion("upper(cms_resources_name) like", value.toUpperCase(), "cmsResourcesName");
            return (Criteria) this;
        }

        public Criteria andCmsArtcileNameLikeInsensitive(String value) {
            addCriterion("upper(cms_artcile_name) like", value.toUpperCase(), "cmsArtcileName");
            return (Criteria) this;
        }

        public Criteria andCmsOperateExplainLikeInsensitive(String value) {
            addCriterion("upper(cms_operate_explain) like", value.toUpperCase(), "cmsOperateExplain");
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