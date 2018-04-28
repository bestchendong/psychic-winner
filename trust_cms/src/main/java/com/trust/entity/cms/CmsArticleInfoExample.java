package com.trust.entity.cms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmsArticleInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsArticleInfoExample() {
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

        public Criteria andCArticleIdIsNull() {
            addCriterion("c_article_id is null");
            return (Criteria) this;
        }

        public Criteria andCArticleIdIsNotNull() {
            addCriterion("c_article_id is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleIdEqualTo(Long value) {
            addCriterion("c_article_id =", value, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdNotEqualTo(Long value) {
            addCriterion("c_article_id <>", value, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdGreaterThan(Long value) {
            addCriterion("c_article_id >", value, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("c_article_id >=", value, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdLessThan(Long value) {
            addCriterion("c_article_id <", value, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdLessThanOrEqualTo(Long value) {
            addCriterion("c_article_id <=", value, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdIn(List<Long> values) {
            addCriterion("c_article_id in", values, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdNotIn(List<Long> values) {
            addCriterion("c_article_id not in", values, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdBetween(Long value1, Long value2) {
            addCriterion("c_article_id between", value1, value2, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdNotBetween(Long value1, Long value2) {
            addCriterion("c_article_id not between", value1, value2, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleCategoryIdIsNull() {
            addCriterion("c_article_category_id is null");
            return (Criteria) this;
        }

        public Criteria andCArticleCategoryIdIsNotNull() {
            addCriterion("c_article_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleCategoryIdEqualTo(Long value) {
            addCriterion("c_article_category_id =", value, "cArticleCategoryId");
            return (Criteria) this;
        }

        public Criteria andCArticleCategoryIdNotEqualTo(Long value) {
            addCriterion("c_article_category_id <>", value, "cArticleCategoryId");
            return (Criteria) this;
        }

        public Criteria andCArticleCategoryIdGreaterThan(Long value) {
            addCriterion("c_article_category_id >", value, "cArticleCategoryId");
            return (Criteria) this;
        }

        public Criteria andCArticleCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("c_article_category_id >=", value, "cArticleCategoryId");
            return (Criteria) this;
        }

        public Criteria andCArticleCategoryIdLessThan(Long value) {
            addCriterion("c_article_category_id <", value, "cArticleCategoryId");
            return (Criteria) this;
        }

        public Criteria andCArticleCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("c_article_category_id <=", value, "cArticleCategoryId");
            return (Criteria) this;
        }

        public Criteria andCArticleCategoryIdIn(List<Long> values) {
            addCriterion("c_article_category_id in", values, "cArticleCategoryId");
            return (Criteria) this;
        }

        public Criteria andCArticleCategoryIdNotIn(List<Long> values) {
            addCriterion("c_article_category_id not in", values, "cArticleCategoryId");
            return (Criteria) this;
        }

        public Criteria andCArticleCategoryIdBetween(Long value1, Long value2) {
            addCriterion("c_article_category_id between", value1, value2, "cArticleCategoryId");
            return (Criteria) this;
        }

        public Criteria andCArticleCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("c_article_category_id not between", value1, value2, "cArticleCategoryId");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatorIsNull() {
            addCriterion("c_article_creator is null");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatorIsNotNull() {
            addCriterion("c_article_creator is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatorEqualTo(Long value) {
            addCriterion("c_article_creator =", value, "cArticleCreator");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatorNotEqualTo(Long value) {
            addCriterion("c_article_creator <>", value, "cArticleCreator");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatorGreaterThan(Long value) {
            addCriterion("c_article_creator >", value, "cArticleCreator");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatorGreaterThanOrEqualTo(Long value) {
            addCriterion("c_article_creator >=", value, "cArticleCreator");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatorLessThan(Long value) {
            addCriterion("c_article_creator <", value, "cArticleCreator");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatorLessThanOrEqualTo(Long value) {
            addCriterion("c_article_creator <=", value, "cArticleCreator");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatorIn(List<Long> values) {
            addCriterion("c_article_creator in", values, "cArticleCreator");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatorNotIn(List<Long> values) {
            addCriterion("c_article_creator not in", values, "cArticleCreator");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatorBetween(Long value1, Long value2) {
            addCriterion("c_article_creator between", value1, value2, "cArticleCreator");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatorNotBetween(Long value1, Long value2) {
            addCriterion("c_article_creator not between", value1, value2, "cArticleCreator");
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

        public Criteria andCArticleTitleIsNull() {
            addCriterion("c_article_title is null");
            return (Criteria) this;
        }

        public Criteria andCArticleTitleIsNotNull() {
            addCriterion("c_article_title is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleTitleEqualTo(String value) {
            addCriterion("c_article_title =", value, "cArticleTitle");
            return (Criteria) this;
        }

        public Criteria andCArticleTitleNotEqualTo(String value) {
            addCriterion("c_article_title <>", value, "cArticleTitle");
            return (Criteria) this;
        }

        public Criteria andCArticleTitleGreaterThan(String value) {
            addCriterion("c_article_title >", value, "cArticleTitle");
            return (Criteria) this;
        }

        public Criteria andCArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("c_article_title >=", value, "cArticleTitle");
            return (Criteria) this;
        }

        public Criteria andCArticleTitleLessThan(String value) {
            addCriterion("c_article_title <", value, "cArticleTitle");
            return (Criteria) this;
        }

        public Criteria andCArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("c_article_title <=", value, "cArticleTitle");
            return (Criteria) this;
        }

        public Criteria andCArticleTitleLike(String value) {
            addCriterion("c_article_title like", value, "cArticleTitle");
            return (Criteria) this;
        }

        public Criteria andCArticleTitleNotLike(String value) {
            addCriterion("c_article_title not like", value, "cArticleTitle");
            return (Criteria) this;
        }

        public Criteria andCArticleTitleIn(List<String> values) {
            addCriterion("c_article_title in", values, "cArticleTitle");
            return (Criteria) this;
        }

        public Criteria andCArticleTitleNotIn(List<String> values) {
            addCriterion("c_article_title not in", values, "cArticleTitle");
            return (Criteria) this;
        }

        public Criteria andCArticleTitleBetween(String value1, String value2) {
            addCriterion("c_article_title between", value1, value2, "cArticleTitle");
            return (Criteria) this;
        }

        public Criteria andCArticleTitleNotBetween(String value1, String value2) {
            addCriterion("c_article_title not between", value1, value2, "cArticleTitle");
            return (Criteria) this;
        }

        public Criteria andCArticlePosterIsNull() {
            addCriterion("c_article_poster is null");
            return (Criteria) this;
        }

        public Criteria andCArticlePosterIsNotNull() {
            addCriterion("c_article_poster is not null");
            return (Criteria) this;
        }

        public Criteria andCArticlePosterEqualTo(String value) {
            addCriterion("c_article_poster =", value, "cArticlePoster");
            return (Criteria) this;
        }

        public Criteria andCArticlePosterNotEqualTo(String value) {
            addCriterion("c_article_poster <>", value, "cArticlePoster");
            return (Criteria) this;
        }

        public Criteria andCArticlePosterGreaterThan(String value) {
            addCriterion("c_article_poster >", value, "cArticlePoster");
            return (Criteria) this;
        }

        public Criteria andCArticlePosterGreaterThanOrEqualTo(String value) {
            addCriterion("c_article_poster >=", value, "cArticlePoster");
            return (Criteria) this;
        }

        public Criteria andCArticlePosterLessThan(String value) {
            addCriterion("c_article_poster <", value, "cArticlePoster");
            return (Criteria) this;
        }

        public Criteria andCArticlePosterLessThanOrEqualTo(String value) {
            addCriterion("c_article_poster <=", value, "cArticlePoster");
            return (Criteria) this;
        }

        public Criteria andCArticlePosterLike(String value) {
            addCriterion("c_article_poster like", value, "cArticlePoster");
            return (Criteria) this;
        }

        public Criteria andCArticlePosterNotLike(String value) {
            addCriterion("c_article_poster not like", value, "cArticlePoster");
            return (Criteria) this;
        }

        public Criteria andCArticlePosterIn(List<String> values) {
            addCriterion("c_article_poster in", values, "cArticlePoster");
            return (Criteria) this;
        }

        public Criteria andCArticlePosterNotIn(List<String> values) {
            addCriterion("c_article_poster not in", values, "cArticlePoster");
            return (Criteria) this;
        }

        public Criteria andCArticlePosterBetween(String value1, String value2) {
            addCriterion("c_article_poster between", value1, value2, "cArticlePoster");
            return (Criteria) this;
        }

        public Criteria andCArticlePosterNotBetween(String value1, String value2) {
            addCriterion("c_article_poster not between", value1, value2, "cArticlePoster");
            return (Criteria) this;
        }

        public Criteria andCArticleAuthorIsNull() {
            addCriterion("c_article_author is null");
            return (Criteria) this;
        }

        public Criteria andCArticleAuthorIsNotNull() {
            addCriterion("c_article_author is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleAuthorEqualTo(String value) {
            addCriterion("c_article_author =", value, "cArticleAuthor");
            return (Criteria) this;
        }

        public Criteria andCArticleAuthorNotEqualTo(String value) {
            addCriterion("c_article_author <>", value, "cArticleAuthor");
            return (Criteria) this;
        }

        public Criteria andCArticleAuthorGreaterThan(String value) {
            addCriterion("c_article_author >", value, "cArticleAuthor");
            return (Criteria) this;
        }

        public Criteria andCArticleAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("c_article_author >=", value, "cArticleAuthor");
            return (Criteria) this;
        }

        public Criteria andCArticleAuthorLessThan(String value) {
            addCriterion("c_article_author <", value, "cArticleAuthor");
            return (Criteria) this;
        }

        public Criteria andCArticleAuthorLessThanOrEqualTo(String value) {
            addCriterion("c_article_author <=", value, "cArticleAuthor");
            return (Criteria) this;
        }

        public Criteria andCArticleAuthorLike(String value) {
            addCriterion("c_article_author like", value, "cArticleAuthor");
            return (Criteria) this;
        }

        public Criteria andCArticleAuthorNotLike(String value) {
            addCriterion("c_article_author not like", value, "cArticleAuthor");
            return (Criteria) this;
        }

        public Criteria andCArticleAuthorIn(List<String> values) {
            addCriterion("c_article_author in", values, "cArticleAuthor");
            return (Criteria) this;
        }

        public Criteria andCArticleAuthorNotIn(List<String> values) {
            addCriterion("c_article_author not in", values, "cArticleAuthor");
            return (Criteria) this;
        }

        public Criteria andCArticleAuthorBetween(String value1, String value2) {
            addCriterion("c_article_author between", value1, value2, "cArticleAuthor");
            return (Criteria) this;
        }

        public Criteria andCArticleAuthorNotBetween(String value1, String value2) {
            addCriterion("c_article_author not between", value1, value2, "cArticleAuthor");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatetimeIsNull() {
            addCriterion("c_article_createtime is null");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatetimeIsNotNull() {
            addCriterion("c_article_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatetimeEqualTo(Date value) {
            addCriterion("c_article_createtime =", value, "cArticleCreatetime");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatetimeNotEqualTo(Date value) {
            addCriterion("c_article_createtime <>", value, "cArticleCreatetime");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatetimeGreaterThan(Date value) {
            addCriterion("c_article_createtime >", value, "cArticleCreatetime");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_article_createtime >=", value, "cArticleCreatetime");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatetimeLessThan(Date value) {
            addCriterion("c_article_createtime <", value, "cArticleCreatetime");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("c_article_createtime <=", value, "cArticleCreatetime");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatetimeIn(List<Date> values) {
            addCriterion("c_article_createtime in", values, "cArticleCreatetime");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatetimeNotIn(List<Date> values) {
            addCriterion("c_article_createtime not in", values, "cArticleCreatetime");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatetimeBetween(Date value1, Date value2) {
            addCriterion("c_article_createtime between", value1, value2, "cArticleCreatetime");
            return (Criteria) this;
        }

        public Criteria andCArticleCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("c_article_createtime not between", value1, value2, "cArticleCreatetime");
            return (Criteria) this;
        }

        public Criteria andCArticleUpdatetimeIsNull() {
            addCriterion("c_article_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andCArticleUpdatetimeIsNotNull() {
            addCriterion("c_article_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleUpdatetimeEqualTo(Date value) {
            addCriterion("c_article_updatetime =", value, "cArticleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCArticleUpdatetimeNotEqualTo(Date value) {
            addCriterion("c_article_updatetime <>", value, "cArticleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCArticleUpdatetimeGreaterThan(Date value) {
            addCriterion("c_article_updatetime >", value, "cArticleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCArticleUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_article_updatetime >=", value, "cArticleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCArticleUpdatetimeLessThan(Date value) {
            addCriterion("c_article_updatetime <", value, "cArticleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCArticleUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("c_article_updatetime <=", value, "cArticleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCArticleUpdatetimeIn(List<Date> values) {
            addCriterion("c_article_updatetime in", values, "cArticleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCArticleUpdatetimeNotIn(List<Date> values) {
            addCriterion("c_article_updatetime not in", values, "cArticleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCArticleUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("c_article_updatetime between", value1, value2, "cArticleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCArticleUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("c_article_updatetime not between", value1, value2, "cArticleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseidIsNull() {
            addCriterion("c_article_releaseid is null");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseidIsNotNull() {
            addCriterion("c_article_releaseid is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseidEqualTo(Long value) {
            addCriterion("c_article_releaseid =", value, "cArticleReleaseid");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseidNotEqualTo(Long value) {
            addCriterion("c_article_releaseid <>", value, "cArticleReleaseid");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseidGreaterThan(Long value) {
            addCriterion("c_article_releaseid >", value, "cArticleReleaseid");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseidGreaterThanOrEqualTo(Long value) {
            addCriterion("c_article_releaseid >=", value, "cArticleReleaseid");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseidLessThan(Long value) {
            addCriterion("c_article_releaseid <", value, "cArticleReleaseid");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseidLessThanOrEqualTo(Long value) {
            addCriterion("c_article_releaseid <=", value, "cArticleReleaseid");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseidIn(List<Long> values) {
            addCriterion("c_article_releaseid in", values, "cArticleReleaseid");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseidNotIn(List<Long> values) {
            addCriterion("c_article_releaseid not in", values, "cArticleReleaseid");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseidBetween(Long value1, Long value2) {
            addCriterion("c_article_releaseid between", value1, value2, "cArticleReleaseid");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseidNotBetween(Long value1, Long value2) {
            addCriterion("c_article_releaseid not between", value1, value2, "cArticleReleaseid");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseTimeIsNull() {
            addCriterion("c_article_release_time is null");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseTimeIsNotNull() {
            addCriterion("c_article_release_time is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseTimeEqualTo(Date value) {
            addCriterion("c_article_release_time =", value, "cArticleReleaseTime");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseTimeNotEqualTo(Date value) {
            addCriterion("c_article_release_time <>", value, "cArticleReleaseTime");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseTimeGreaterThan(Date value) {
            addCriterion("c_article_release_time >", value, "cArticleReleaseTime");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_article_release_time >=", value, "cArticleReleaseTime");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseTimeLessThan(Date value) {
            addCriterion("c_article_release_time <", value, "cArticleReleaseTime");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("c_article_release_time <=", value, "cArticleReleaseTime");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseTimeIn(List<Date> values) {
            addCriterion("c_article_release_time in", values, "cArticleReleaseTime");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseTimeNotIn(List<Date> values) {
            addCriterion("c_article_release_time not in", values, "cArticleReleaseTime");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseTimeBetween(Date value1, Date value2) {
            addCriterion("c_article_release_time between", value1, value2, "cArticleReleaseTime");
            return (Criteria) this;
        }

        public Criteria andCArticleReleaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("c_article_release_time not between", value1, value2, "cArticleReleaseTime");
            return (Criteria) this;
        }

        public Criteria andCArticleStatusIsNull() {
            addCriterion("c_article_status is null");
            return (Criteria) this;
        }

        public Criteria andCArticleStatusIsNotNull() {
            addCriterion("c_article_status is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleStatusEqualTo(Integer value) {
            addCriterion("c_article_status =", value, "cArticleStatus");
            return (Criteria) this;
        }

        public Criteria andCArticleStatusNotEqualTo(Integer value) {
            addCriterion("c_article_status <>", value, "cArticleStatus");
            return (Criteria) this;
        }

        public Criteria andCArticleStatusGreaterThan(Integer value) {
            addCriterion("c_article_status >", value, "cArticleStatus");
            return (Criteria) this;
        }

        public Criteria andCArticleStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_article_status >=", value, "cArticleStatus");
            return (Criteria) this;
        }

        public Criteria andCArticleStatusLessThan(Integer value) {
            addCriterion("c_article_status <", value, "cArticleStatus");
            return (Criteria) this;
        }

        public Criteria andCArticleStatusLessThanOrEqualTo(Integer value) {
            addCriterion("c_article_status <=", value, "cArticleStatus");
            return (Criteria) this;
        }

        public Criteria andCArticleStatusIn(List<Integer> values) {
            addCriterion("c_article_status in", values, "cArticleStatus");
            return (Criteria) this;
        }

        public Criteria andCArticleStatusNotIn(List<Integer> values) {
            addCriterion("c_article_status not in", values, "cArticleStatus");
            return (Criteria) this;
        }

        public Criteria andCArticleStatusBetween(Integer value1, Integer value2) {
            addCriterion("c_article_status between", value1, value2, "cArticleStatus");
            return (Criteria) this;
        }

        public Criteria andCArticleStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("c_article_status not between", value1, value2, "cArticleStatus");
            return (Criteria) this;
        }

        public Criteria andCArticleAmountIsNull() {
            addCriterion("c_article_amount is null");
            return (Criteria) this;
        }

        public Criteria andCArticleAmountIsNotNull() {
            addCriterion("c_article_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleAmountEqualTo(Integer value) {
            addCriterion("c_article_amount =", value, "cArticleAmount");
            return (Criteria) this;
        }

        public Criteria andCArticleAmountNotEqualTo(Integer value) {
            addCriterion("c_article_amount <>", value, "cArticleAmount");
            return (Criteria) this;
        }

        public Criteria andCArticleAmountGreaterThan(Integer value) {
            addCriterion("c_article_amount >", value, "cArticleAmount");
            return (Criteria) this;
        }

        public Criteria andCArticleAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_article_amount >=", value, "cArticleAmount");
            return (Criteria) this;
        }

        public Criteria andCArticleAmountLessThan(Integer value) {
            addCriterion("c_article_amount <", value, "cArticleAmount");
            return (Criteria) this;
        }

        public Criteria andCArticleAmountLessThanOrEqualTo(Integer value) {
            addCriterion("c_article_amount <=", value, "cArticleAmount");
            return (Criteria) this;
        }

        public Criteria andCArticleAmountIn(List<Integer> values) {
            addCriterion("c_article_amount in", values, "cArticleAmount");
            return (Criteria) this;
        }

        public Criteria andCArticleAmountNotIn(List<Integer> values) {
            addCriterion("c_article_amount not in", values, "cArticleAmount");
            return (Criteria) this;
        }

        public Criteria andCArticleAmountBetween(Integer value1, Integer value2) {
            addCriterion("c_article_amount between", value1, value2, "cArticleAmount");
            return (Criteria) this;
        }

        public Criteria andCArticleAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("c_article_amount not between", value1, value2, "cArticleAmount");
            return (Criteria) this;
        }

        public Criteria andCArticlePriorityIsNull() {
            addCriterion("c_article_priority is null");
            return (Criteria) this;
        }

        public Criteria andCArticlePriorityIsNotNull() {
            addCriterion("c_article_priority is not null");
            return (Criteria) this;
        }

        public Criteria andCArticlePriorityEqualTo(Long value) {
            addCriterion("c_article_priority =", value, "cArticlePriority");
            return (Criteria) this;
        }

        public Criteria andCArticlePriorityNotEqualTo(Long value) {
            addCriterion("c_article_priority <>", value, "cArticlePriority");
            return (Criteria) this;
        }

        public Criteria andCArticlePriorityGreaterThan(Long value) {
            addCriterion("c_article_priority >", value, "cArticlePriority");
            return (Criteria) this;
        }

        public Criteria andCArticlePriorityGreaterThanOrEqualTo(Long value) {
            addCriterion("c_article_priority >=", value, "cArticlePriority");
            return (Criteria) this;
        }

        public Criteria andCArticlePriorityLessThan(Long value) {
            addCriterion("c_article_priority <", value, "cArticlePriority");
            return (Criteria) this;
        }

        public Criteria andCArticlePriorityLessThanOrEqualTo(Long value) {
            addCriterion("c_article_priority <=", value, "cArticlePriority");
            return (Criteria) this;
        }

        public Criteria andCArticlePriorityIn(List<Long> values) {
            addCriterion("c_article_priority in", values, "cArticlePriority");
            return (Criteria) this;
        }

        public Criteria andCArticlePriorityNotIn(List<Long> values) {
            addCriterion("c_article_priority not in", values, "cArticlePriority");
            return (Criteria) this;
        }

        public Criteria andCArticlePriorityBetween(Long value1, Long value2) {
            addCriterion("c_article_priority between", value1, value2, "cArticlePriority");
            return (Criteria) this;
        }

        public Criteria andCArticlePriorityNotBetween(Long value1, Long value2) {
            addCriterion("c_article_priority not between", value1, value2, "cArticlePriority");
            return (Criteria) this;
        }

        public Criteria andCArticleLabelIsNull() {
            addCriterion("c_article_label is null");
            return (Criteria) this;
        }

        public Criteria andCArticleLabelIsNotNull() {
            addCriterion("c_article_label is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleLabelEqualTo(Long value) {
            addCriterion("c_article_label =", value, "cArticleLabel");
            return (Criteria) this;
        }

        public Criteria andCArticleLabelNotEqualTo(Long value) {
            addCriterion("c_article_label <>", value, "cArticleLabel");
            return (Criteria) this;
        }

        public Criteria andCArticleLabelGreaterThan(Long value) {
            addCriterion("c_article_label >", value, "cArticleLabel");
            return (Criteria) this;
        }

        public Criteria andCArticleLabelGreaterThanOrEqualTo(Long value) {
            addCriterion("c_article_label >=", value, "cArticleLabel");
            return (Criteria) this;
        }

        public Criteria andCArticleLabelLessThan(Long value) {
            addCriterion("c_article_label <", value, "cArticleLabel");
            return (Criteria) this;
        }

        public Criteria andCArticleLabelLessThanOrEqualTo(Long value) {
            addCriterion("c_article_label <=", value, "cArticleLabel");
            return (Criteria) this;
        }

        public Criteria andCArticleLabelIn(List<Long> values) {
            addCriterion("c_article_label in", values, "cArticleLabel");
            return (Criteria) this;
        }

        public Criteria andCArticleLabelNotIn(List<Long> values) {
            addCriterion("c_article_label not in", values, "cArticleLabel");
            return (Criteria) this;
        }

        public Criteria andCArticleLabelBetween(Long value1, Long value2) {
            addCriterion("c_article_label between", value1, value2, "cArticleLabel");
            return (Criteria) this;
        }

        public Criteria andCArticleLabelNotBetween(Long value1, Long value2) {
            addCriterion("c_article_label not between", value1, value2, "cArticleLabel");
            return (Criteria) this;
        }

        public Criteria andCArticleKeywordIsNull() {
            addCriterion("c_article_keyword is null");
            return (Criteria) this;
        }

        public Criteria andCArticleKeywordIsNotNull() {
            addCriterion("c_article_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleKeywordEqualTo(String value) {
            addCriterion("c_article_keyword =", value, "cArticleKeyword");
            return (Criteria) this;
        }

        public Criteria andCArticleKeywordNotEqualTo(String value) {
            addCriterion("c_article_keyword <>", value, "cArticleKeyword");
            return (Criteria) this;
        }

        public Criteria andCArticleKeywordGreaterThan(String value) {
            addCriterion("c_article_keyword >", value, "cArticleKeyword");
            return (Criteria) this;
        }

        public Criteria andCArticleKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("c_article_keyword >=", value, "cArticleKeyword");
            return (Criteria) this;
        }

        public Criteria andCArticleKeywordLessThan(String value) {
            addCriterion("c_article_keyword <", value, "cArticleKeyword");
            return (Criteria) this;
        }

        public Criteria andCArticleKeywordLessThanOrEqualTo(String value) {
            addCriterion("c_article_keyword <=", value, "cArticleKeyword");
            return (Criteria) this;
        }

        public Criteria andCArticleKeywordLike(String value) {
            addCriterion("c_article_keyword like", value, "cArticleKeyword");
            return (Criteria) this;
        }

        public Criteria andCArticleKeywordNotLike(String value) {
            addCriterion("c_article_keyword not like", value, "cArticleKeyword");
            return (Criteria) this;
        }

        public Criteria andCArticleKeywordIn(List<String> values) {
            addCriterion("c_article_keyword in", values, "cArticleKeyword");
            return (Criteria) this;
        }

        public Criteria andCArticleKeywordNotIn(List<String> values) {
            addCriterion("c_article_keyword not in", values, "cArticleKeyword");
            return (Criteria) this;
        }

        public Criteria andCArticleKeywordBetween(String value1, String value2) {
            addCriterion("c_article_keyword between", value1, value2, "cArticleKeyword");
            return (Criteria) this;
        }

        public Criteria andCArticleKeywordNotBetween(String value1, String value2) {
            addCriterion("c_article_keyword not between", value1, value2, "cArticleKeyword");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceIsNull() {
            addCriterion("c_article_resource is null");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceIsNotNull() {
            addCriterion("c_article_resource is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceEqualTo(String value) {
            addCriterion("c_article_resource =", value, "cArticleResource");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceNotEqualTo(String value) {
            addCriterion("c_article_resource <>", value, "cArticleResource");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceGreaterThan(String value) {
            addCriterion("c_article_resource >", value, "cArticleResource");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceGreaterThanOrEqualTo(String value) {
            addCriterion("c_article_resource >=", value, "cArticleResource");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceLessThan(String value) {
            addCriterion("c_article_resource <", value, "cArticleResource");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceLessThanOrEqualTo(String value) {
            addCriterion("c_article_resource <=", value, "cArticleResource");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceLike(String value) {
            addCriterion("c_article_resource like", value, "cArticleResource");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceNotLike(String value) {
            addCriterion("c_article_resource not like", value, "cArticleResource");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceIn(List<String> values) {
            addCriterion("c_article_resource in", values, "cArticleResource");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceNotIn(List<String> values) {
            addCriterion("c_article_resource not in", values, "cArticleResource");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceBetween(String value1, String value2) {
            addCriterion("c_article_resource between", value1, value2, "cArticleResource");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceNotBetween(String value1, String value2) {
            addCriterion("c_article_resource not between", value1, value2, "cArticleResource");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceUrlIsNull() {
            addCriterion("c_article_resource_url is null");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceUrlIsNotNull() {
            addCriterion("c_article_resource_url is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceUrlEqualTo(String value) {
            addCriterion("c_article_resource_url =", value, "cArticleResourceUrl");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceUrlNotEqualTo(String value) {
            addCriterion("c_article_resource_url <>", value, "cArticleResourceUrl");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceUrlGreaterThan(String value) {
            addCriterion("c_article_resource_url >", value, "cArticleResourceUrl");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("c_article_resource_url >=", value, "cArticleResourceUrl");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceUrlLessThan(String value) {
            addCriterion("c_article_resource_url <", value, "cArticleResourceUrl");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceUrlLessThanOrEqualTo(String value) {
            addCriterion("c_article_resource_url <=", value, "cArticleResourceUrl");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceUrlLike(String value) {
            addCriterion("c_article_resource_url like", value, "cArticleResourceUrl");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceUrlNotLike(String value) {
            addCriterion("c_article_resource_url not like", value, "cArticleResourceUrl");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceUrlIn(List<String> values) {
            addCriterion("c_article_resource_url in", values, "cArticleResourceUrl");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceUrlNotIn(List<String> values) {
            addCriterion("c_article_resource_url not in", values, "cArticleResourceUrl");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceUrlBetween(String value1, String value2) {
            addCriterion("c_article_resource_url between", value1, value2, "cArticleResourceUrl");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceUrlNotBetween(String value1, String value2) {
            addCriterion("c_article_resource_url not between", value1, value2, "cArticleResourceUrl");
            return (Criteria) this;
        }

        public Criteria andCArticleSubtitleIsNull() {
            addCriterion("c_article_subtitle is null");
            return (Criteria) this;
        }

        public Criteria andCArticleSubtitleIsNotNull() {
            addCriterion("c_article_subtitle is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleSubtitleEqualTo(String value) {
            addCriterion("c_article_subtitle =", value, "cArticleSubtitle");
            return (Criteria) this;
        }

        public Criteria andCArticleSubtitleNotEqualTo(String value) {
            addCriterion("c_article_subtitle <>", value, "cArticleSubtitle");
            return (Criteria) this;
        }

        public Criteria andCArticleSubtitleGreaterThan(String value) {
            addCriterion("c_article_subtitle >", value, "cArticleSubtitle");
            return (Criteria) this;
        }

        public Criteria andCArticleSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("c_article_subtitle >=", value, "cArticleSubtitle");
            return (Criteria) this;
        }

        public Criteria andCArticleSubtitleLessThan(String value) {
            addCriterion("c_article_subtitle <", value, "cArticleSubtitle");
            return (Criteria) this;
        }

        public Criteria andCArticleSubtitleLessThanOrEqualTo(String value) {
            addCriterion("c_article_subtitle <=", value, "cArticleSubtitle");
            return (Criteria) this;
        }

        public Criteria andCArticleSubtitleLike(String value) {
            addCriterion("c_article_subtitle like", value, "cArticleSubtitle");
            return (Criteria) this;
        }

        public Criteria andCArticleSubtitleNotLike(String value) {
            addCriterion("c_article_subtitle not like", value, "cArticleSubtitle");
            return (Criteria) this;
        }

        public Criteria andCArticleSubtitleIn(List<String> values) {
            addCriterion("c_article_subtitle in", values, "cArticleSubtitle");
            return (Criteria) this;
        }

        public Criteria andCArticleSubtitleNotIn(List<String> values) {
            addCriterion("c_article_subtitle not in", values, "cArticleSubtitle");
            return (Criteria) this;
        }

        public Criteria andCArticleSubtitleBetween(String value1, String value2) {
            addCriterion("c_article_subtitle between", value1, value2, "cArticleSubtitle");
            return (Criteria) this;
        }

        public Criteria andCArticleSubtitleNotBetween(String value1, String value2) {
            addCriterion("c_article_subtitle not between", value1, value2, "cArticleSubtitle");
            return (Criteria) this;
        }

        public Criteria andCArticleDesIsNull() {
            addCriterion("c_article_des is null");
            return (Criteria) this;
        }

        public Criteria andCArticleDesIsNotNull() {
            addCriterion("c_article_des is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleDesEqualTo(String value) {
            addCriterion("c_article_des =", value, "cArticleDes");
            return (Criteria) this;
        }

        public Criteria andCArticleDesNotEqualTo(String value) {
            addCriterion("c_article_des <>", value, "cArticleDes");
            return (Criteria) this;
        }

        public Criteria andCArticleDesGreaterThan(String value) {
            addCriterion("c_article_des >", value, "cArticleDes");
            return (Criteria) this;
        }

        public Criteria andCArticleDesGreaterThanOrEqualTo(String value) {
            addCriterion("c_article_des >=", value, "cArticleDes");
            return (Criteria) this;
        }

        public Criteria andCArticleDesLessThan(String value) {
            addCriterion("c_article_des <", value, "cArticleDes");
            return (Criteria) this;
        }

        public Criteria andCArticleDesLessThanOrEqualTo(String value) {
            addCriterion("c_article_des <=", value, "cArticleDes");
            return (Criteria) this;
        }

        public Criteria andCArticleDesLike(String value) {
            addCriterion("c_article_des like", value, "cArticleDes");
            return (Criteria) this;
        }

        public Criteria andCArticleDesNotLike(String value) {
            addCriterion("c_article_des not like", value, "cArticleDes");
            return (Criteria) this;
        }

        public Criteria andCArticleDesIn(List<String> values) {
            addCriterion("c_article_des in", values, "cArticleDes");
            return (Criteria) this;
        }

        public Criteria andCArticleDesNotIn(List<String> values) {
            addCriterion("c_article_des not in", values, "cArticleDes");
            return (Criteria) this;
        }

        public Criteria andCArticleDesBetween(String value1, String value2) {
            addCriterion("c_article_des between", value1, value2, "cArticleDes");
            return (Criteria) this;
        }

        public Criteria andCArticleDesNotBetween(String value1, String value2) {
            addCriterion("c_article_des not between", value1, value2, "cArticleDes");
            return (Criteria) this;
        }

        public Criteria andCArticleSmallImageIsNull() {
            addCriterion("c_article_small_image is null");
            return (Criteria) this;
        }

        public Criteria andCArticleSmallImageIsNotNull() {
            addCriterion("c_article_small_image is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleSmallImageEqualTo(String value) {
            addCriterion("c_article_small_image =", value, "cArticleSmallImage");
            return (Criteria) this;
        }

        public Criteria andCArticleSmallImageNotEqualTo(String value) {
            addCriterion("c_article_small_image <>", value, "cArticleSmallImage");
            return (Criteria) this;
        }

        public Criteria andCArticleSmallImageGreaterThan(String value) {
            addCriterion("c_article_small_image >", value, "cArticleSmallImage");
            return (Criteria) this;
        }

        public Criteria andCArticleSmallImageGreaterThanOrEqualTo(String value) {
            addCriterion("c_article_small_image >=", value, "cArticleSmallImage");
            return (Criteria) this;
        }

        public Criteria andCArticleSmallImageLessThan(String value) {
            addCriterion("c_article_small_image <", value, "cArticleSmallImage");
            return (Criteria) this;
        }

        public Criteria andCArticleSmallImageLessThanOrEqualTo(String value) {
            addCriterion("c_article_small_image <=", value, "cArticleSmallImage");
            return (Criteria) this;
        }

        public Criteria andCArticleSmallImageLike(String value) {
            addCriterion("c_article_small_image like", value, "cArticleSmallImage");
            return (Criteria) this;
        }

        public Criteria andCArticleSmallImageNotLike(String value) {
            addCriterion("c_article_small_image not like", value, "cArticleSmallImage");
            return (Criteria) this;
        }

        public Criteria andCArticleSmallImageIn(List<String> values) {
            addCriterion("c_article_small_image in", values, "cArticleSmallImage");
            return (Criteria) this;
        }

        public Criteria andCArticleSmallImageNotIn(List<String> values) {
            addCriterion("c_article_small_image not in", values, "cArticleSmallImage");
            return (Criteria) this;
        }

        public Criteria andCArticleSmallImageBetween(String value1, String value2) {
            addCriterion("c_article_small_image between", value1, value2, "cArticleSmallImage");
            return (Criteria) this;
        }

        public Criteria andCArticleSmallImageNotBetween(String value1, String value2) {
            addCriterion("c_article_small_image not between", value1, value2, "cArticleSmallImage");
            return (Criteria) this;
        }

        public Criteria andCArticleLargeImageIsNull() {
            addCriterion("c_article_large_image is null");
            return (Criteria) this;
        }

        public Criteria andCArticleLargeImageIsNotNull() {
            addCriterion("c_article_large_image is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleLargeImageEqualTo(String value) {
            addCriterion("c_article_large_image =", value, "cArticleLargeImage");
            return (Criteria) this;
        }

        public Criteria andCArticleLargeImageNotEqualTo(String value) {
            addCriterion("c_article_large_image <>", value, "cArticleLargeImage");
            return (Criteria) this;
        }

        public Criteria andCArticleLargeImageGreaterThan(String value) {
            addCriterion("c_article_large_image >", value, "cArticleLargeImage");
            return (Criteria) this;
        }

        public Criteria andCArticleLargeImageGreaterThanOrEqualTo(String value) {
            addCriterion("c_article_large_image >=", value, "cArticleLargeImage");
            return (Criteria) this;
        }

        public Criteria andCArticleLargeImageLessThan(String value) {
            addCriterion("c_article_large_image <", value, "cArticleLargeImage");
            return (Criteria) this;
        }

        public Criteria andCArticleLargeImageLessThanOrEqualTo(String value) {
            addCriterion("c_article_large_image <=", value, "cArticleLargeImage");
            return (Criteria) this;
        }

        public Criteria andCArticleLargeImageLike(String value) {
            addCriterion("c_article_large_image like", value, "cArticleLargeImage");
            return (Criteria) this;
        }

        public Criteria andCArticleLargeImageNotLike(String value) {
            addCriterion("c_article_large_image not like", value, "cArticleLargeImage");
            return (Criteria) this;
        }

        public Criteria andCArticleLargeImageIn(List<String> values) {
            addCriterion("c_article_large_image in", values, "cArticleLargeImage");
            return (Criteria) this;
        }

        public Criteria andCArticleLargeImageNotIn(List<String> values) {
            addCriterion("c_article_large_image not in", values, "cArticleLargeImage");
            return (Criteria) this;
        }

        public Criteria andCArticleLargeImageBetween(String value1, String value2) {
            addCriterion("c_article_large_image between", value1, value2, "cArticleLargeImage");
            return (Criteria) this;
        }

        public Criteria andCArticleLargeImageNotBetween(String value1, String value2) {
            addCriterion("c_article_large_image not between", value1, value2, "cArticleLargeImage");
            return (Criteria) this;
        }

        public Criteria andCArticleCommentarieIsNull() {
            addCriterion("c_article_commentarie is null");
            return (Criteria) this;
        }

        public Criteria andCArticleCommentarieIsNotNull() {
            addCriterion("c_article_commentarie is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleCommentarieEqualTo(Integer value) {
            addCriterion("c_article_commentarie =", value, "cArticleCommentarie");
            return (Criteria) this;
        }

        public Criteria andCArticleCommentarieNotEqualTo(Integer value) {
            addCriterion("c_article_commentarie <>", value, "cArticleCommentarie");
            return (Criteria) this;
        }

        public Criteria andCArticleCommentarieGreaterThan(Integer value) {
            addCriterion("c_article_commentarie >", value, "cArticleCommentarie");
            return (Criteria) this;
        }

        public Criteria andCArticleCommentarieGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_article_commentarie >=", value, "cArticleCommentarie");
            return (Criteria) this;
        }

        public Criteria andCArticleCommentarieLessThan(Integer value) {
            addCriterion("c_article_commentarie <", value, "cArticleCommentarie");
            return (Criteria) this;
        }

        public Criteria andCArticleCommentarieLessThanOrEqualTo(Integer value) {
            addCriterion("c_article_commentarie <=", value, "cArticleCommentarie");
            return (Criteria) this;
        }

        public Criteria andCArticleCommentarieIn(List<Integer> values) {
            addCriterion("c_article_commentarie in", values, "cArticleCommentarie");
            return (Criteria) this;
        }

        public Criteria andCArticleCommentarieNotIn(List<Integer> values) {
            addCriterion("c_article_commentarie not in", values, "cArticleCommentarie");
            return (Criteria) this;
        }

        public Criteria andCArticleCommentarieBetween(Integer value1, Integer value2) {
            addCriterion("c_article_commentarie between", value1, value2, "cArticleCommentarie");
            return (Criteria) this;
        }

        public Criteria andCArticleCommentarieNotBetween(Integer value1, Integer value2) {
            addCriterion("c_article_commentarie not between", value1, value2, "cArticleCommentarie");
            return (Criteria) this;
        }

        public Criteria andCArticleCollectIsNull() {
            addCriterion("c_article_collect is null");
            return (Criteria) this;
        }

        public Criteria andCArticleCollectIsNotNull() {
            addCriterion("c_article_collect is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleCollectEqualTo(Integer value) {
            addCriterion("c_article_collect =", value, "cArticleCollect");
            return (Criteria) this;
        }

        public Criteria andCArticleCollectNotEqualTo(Integer value) {
            addCriterion("c_article_collect <>", value, "cArticleCollect");
            return (Criteria) this;
        }

        public Criteria andCArticleCollectGreaterThan(Integer value) {
            addCriterion("c_article_collect >", value, "cArticleCollect");
            return (Criteria) this;
        }

        public Criteria andCArticleCollectGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_article_collect >=", value, "cArticleCollect");
            return (Criteria) this;
        }

        public Criteria andCArticleCollectLessThan(Integer value) {
            addCriterion("c_article_collect <", value, "cArticleCollect");
            return (Criteria) this;
        }

        public Criteria andCArticleCollectLessThanOrEqualTo(Integer value) {
            addCriterion("c_article_collect <=", value, "cArticleCollect");
            return (Criteria) this;
        }

        public Criteria andCArticleCollectIn(List<Integer> values) {
            addCriterion("c_article_collect in", values, "cArticleCollect");
            return (Criteria) this;
        }

        public Criteria andCArticleCollectNotIn(List<Integer> values) {
            addCriterion("c_article_collect not in", values, "cArticleCollect");
            return (Criteria) this;
        }

        public Criteria andCArticleCollectBetween(Integer value1, Integer value2) {
            addCriterion("c_article_collect between", value1, value2, "cArticleCollect");
            return (Criteria) this;
        }

        public Criteria andCArticleCollectNotBetween(Integer value1, Integer value2) {
            addCriterion("c_article_collect not between", value1, value2, "cArticleCollect");
            return (Criteria) this;
        }

        public Criteria andCArticleTypeIsNull() {
            addCriterion("c_article_type is null");
            return (Criteria) this;
        }

        public Criteria andCArticleTypeIsNotNull() {
            addCriterion("c_article_type is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleTypeEqualTo(Integer value) {
            addCriterion("c_article_type =", value, "cArticleType");
            return (Criteria) this;
        }

        public Criteria andCArticleTypeNotEqualTo(Integer value) {
            addCriterion("c_article_type <>", value, "cArticleType");
            return (Criteria) this;
        }

        public Criteria andCArticleTypeGreaterThan(Integer value) {
            addCriterion("c_article_type >", value, "cArticleType");
            return (Criteria) this;
        }

        public Criteria andCArticleTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_article_type >=", value, "cArticleType");
            return (Criteria) this;
        }

        public Criteria andCArticleTypeLessThan(Integer value) {
            addCriterion("c_article_type <", value, "cArticleType");
            return (Criteria) this;
        }

        public Criteria andCArticleTypeLessThanOrEqualTo(Integer value) {
            addCriterion("c_article_type <=", value, "cArticleType");
            return (Criteria) this;
        }

        public Criteria andCArticleTypeIn(List<Integer> values) {
            addCriterion("c_article_type in", values, "cArticleType");
            return (Criteria) this;
        }

        public Criteria andCArticleTypeNotIn(List<Integer> values) {
            addCriterion("c_article_type not in", values, "cArticleType");
            return (Criteria) this;
        }

        public Criteria andCArticleTypeBetween(Integer value1, Integer value2) {
            addCriterion("c_article_type between", value1, value2, "cArticleType");
            return (Criteria) this;
        }

        public Criteria andCArticleTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("c_article_type not between", value1, value2, "cArticleType");
            return (Criteria) this;
        }

        public Criteria andCArticleTitleLikeInsensitive(String value) {
            addCriterion("upper(c_article_title) like", value.toUpperCase(), "cArticleTitle");
            return (Criteria) this;
        }

        public Criteria andCArticlePosterLikeInsensitive(String value) {
            addCriterion("upper(c_article_poster) like", value.toUpperCase(), "cArticlePoster");
            return (Criteria) this;
        }

        public Criteria andCArticleAuthorLikeInsensitive(String value) {
            addCriterion("upper(c_article_author) like", value.toUpperCase(), "cArticleAuthor");
            return (Criteria) this;
        }

        public Criteria andCArticleKeywordLikeInsensitive(String value) {
            addCriterion("upper(c_article_keyword) like", value.toUpperCase(), "cArticleKeyword");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceLikeInsensitive(String value) {
            addCriterion("upper(c_article_resource) like", value.toUpperCase(), "cArticleResource");
            return (Criteria) this;
        }

        public Criteria andCArticleResourceUrlLikeInsensitive(String value) {
            addCriterion("upper(c_article_resource_url) like", value.toUpperCase(), "cArticleResourceUrl");
            return (Criteria) this;
        }

        public Criteria andCArticleSubtitleLikeInsensitive(String value) {
            addCriterion("upper(c_article_subtitle) like", value.toUpperCase(), "cArticleSubtitle");
            return (Criteria) this;
        }

        public Criteria andCArticleDesLikeInsensitive(String value) {
            addCriterion("upper(c_article_des) like", value.toUpperCase(), "cArticleDes");
            return (Criteria) this;
        }

        public Criteria andCArticleSmallImageLikeInsensitive(String value) {
            addCriterion("upper(c_article_small_image) like", value.toUpperCase(), "cArticleSmallImage");
            return (Criteria) this;
        }

        public Criteria andCArticleLargeImageLikeInsensitive(String value) {
            addCriterion("upper(c_article_large_image) like", value.toUpperCase(), "cArticleLargeImage");
            return (Criteria) this;
        }

        public Criteria andcArticleCategoryCodeIsNull() {
            addCriterion("c_article_category_code is null");
            return (Criteria) this;
        }

        public Criteria andcArticleCategoryCodeIsNotNull() {
            addCriterion("c_article_category_code is not null");
            return (Criteria) this;
        }

        public Criteria andcArticleCategoryCodeEqualTo(String value) {
            addCriterion("c_article_category_code =", value, "cArticleCategoryCode");
            return (Criteria) this;
        }

        public Criteria andcArticleCategoryCodeNotEqualTo(String value) {
            addCriterion("c_article_category_code <>", value, "cArticleCategoryCode");
            return (Criteria) this;
        }


        public Criteria andcArticleCategoryCodeTitleLike(String value) {
            addCriterion("c_article_category_code like", value, "cArticleCategoryCode");
            return (Criteria) this;
        }

        public Criteria andcArticleCategoryCodeNotLike(String value) {
            addCriterion("c_article_category_code not like", value, "cArticleCategoryCode");
            return (Criteria) this;
        }

        public Criteria andcArticleCategoryCodeIn(List<String> values) {
            addCriterion("c_article_category_code in", values, "cArticleCategoryCode");
            return (Criteria) this;
        }

        public Criteria andcArticleCategoryCodeNotIn(List<String> values) {
            addCriterion("c_article_title not in", values, "cArticleCategoryCode");
            return (Criteria) this;
        }

        public Criteria andcArticleCategoryCodeBetween(String value1, String value2) {
            addCriterion("c_article_category_code between", value1, value2, "cArticleCategoryCode");
            return (Criteria) this;
        }

        public Criteria andcArticleCategoryCodeNotBetween(String value1, String value2) {
            addCriterion("c_article_category_code not between", value1, value2, "cArticleCategoryCode");
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