package com.ssm.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PcsAuditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PcsAuditExample() {
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

        public Criteria andPcsUuidIsNull() {
            addCriterion("PCS_UUID is null");
            return (Criteria) this;
        }

        public Criteria andPcsUuidIsNotNull() {
            addCriterion("PCS_UUID is not null");
            return (Criteria) this;
        }

        public Criteria andPcsUuidEqualTo(String value) {
            addCriterion("PCS_UUID =", value, "pcsUuid");
            return (Criteria) this;
        }

        public Criteria andPcsUuidNotEqualTo(String value) {
            addCriterion("PCS_UUID <>", value, "pcsUuid");
            return (Criteria) this;
        }

        public Criteria andPcsUuidGreaterThan(String value) {
            addCriterion("PCS_UUID >", value, "pcsUuid");
            return (Criteria) this;
        }

        public Criteria andPcsUuidGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_UUID >=", value, "pcsUuid");
            return (Criteria) this;
        }

        public Criteria andPcsUuidLessThan(String value) {
            addCriterion("PCS_UUID <", value, "pcsUuid");
            return (Criteria) this;
        }

        public Criteria andPcsUuidLessThanOrEqualTo(String value) {
            addCriterion("PCS_UUID <=", value, "pcsUuid");
            return (Criteria) this;
        }

        public Criteria andPcsUuidLike(String value) {
            addCriterion("PCS_UUID like", value, "pcsUuid");
            return (Criteria) this;
        }

        public Criteria andPcsUuidNotLike(String value) {
            addCriterion("PCS_UUID not like", value, "pcsUuid");
            return (Criteria) this;
        }

        public Criteria andPcsUuidIn(List<String> values) {
            addCriterion("PCS_UUID in", values, "pcsUuid");
            return (Criteria) this;
        }

        public Criteria andPcsUuidNotIn(List<String> values) {
            addCriterion("PCS_UUID not in", values, "pcsUuid");
            return (Criteria) this;
        }

        public Criteria andPcsUuidBetween(String value1, String value2) {
            addCriterion("PCS_UUID between", value1, value2, "pcsUuid");
            return (Criteria) this;
        }

        public Criteria andPcsUuidNotBetween(String value1, String value2) {
            addCriterion("PCS_UUID not between", value1, value2, "pcsUuid");
            return (Criteria) this;
        }

        public Criteria andPcsIdIsNull() {
            addCriterion("PCS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPcsIdIsNotNull() {
            addCriterion("PCS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPcsIdEqualTo(String value) {
            addCriterion("PCS_ID =", value, "pcsId");
            return (Criteria) this;
        }

        public Criteria andPcsIdNotEqualTo(String value) {
            addCriterion("PCS_ID <>", value, "pcsId");
            return (Criteria) this;
        }

        public Criteria andPcsIdGreaterThan(String value) {
            addCriterion("PCS_ID >", value, "pcsId");
            return (Criteria) this;
        }

        public Criteria andPcsIdGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_ID >=", value, "pcsId");
            return (Criteria) this;
        }

        public Criteria andPcsIdLessThan(String value) {
            addCriterion("PCS_ID <", value, "pcsId");
            return (Criteria) this;
        }

        public Criteria andPcsIdLessThanOrEqualTo(String value) {
            addCriterion("PCS_ID <=", value, "pcsId");
            return (Criteria) this;
        }

        public Criteria andPcsIdLike(String value) {
            addCriterion("PCS_ID like", value, "pcsId");
            return (Criteria) this;
        }

        public Criteria andPcsIdNotLike(String value) {
            addCriterion("PCS_ID not like", value, "pcsId");
            return (Criteria) this;
        }

        public Criteria andPcsIdIn(List<String> values) {
            addCriterion("PCS_ID in", values, "pcsId");
            return (Criteria) this;
        }

        public Criteria andPcsIdNotIn(List<String> values) {
            addCriterion("PCS_ID not in", values, "pcsId");
            return (Criteria) this;
        }

        public Criteria andPcsIdBetween(String value1, String value2) {
            addCriterion("PCS_ID between", value1, value2, "pcsId");
            return (Criteria) this;
        }

        public Criteria andPcsIdNotBetween(String value1, String value2) {
            addCriterion("PCS_ID not between", value1, value2, "pcsId");
            return (Criteria) this;
        }

        public Criteria andPcsReportTimeIsNull() {
            addCriterion("PCS_REPORT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPcsReportTimeIsNotNull() {
            addCriterion("PCS_REPORT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPcsReportTimeEqualTo(Date value) {
            addCriterion("PCS_REPORT_TIME =", value, "pcsReportTime");
            return (Criteria) this;
        }

        public Criteria andPcsReportTimeNotEqualTo(Date value) {
            addCriterion("PCS_REPORT_TIME <>", value, "pcsReportTime");
            return (Criteria) this;
        }

        public Criteria andPcsReportTimeGreaterThan(Date value) {
            addCriterion("PCS_REPORT_TIME >", value, "pcsReportTime");
            return (Criteria) this;
        }

        public Criteria andPcsReportTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PCS_REPORT_TIME >=", value, "pcsReportTime");
            return (Criteria) this;
        }

        public Criteria andPcsReportTimeLessThan(Date value) {
            addCriterion("PCS_REPORT_TIME <", value, "pcsReportTime");
            return (Criteria) this;
        }

        public Criteria andPcsReportTimeLessThanOrEqualTo(Date value) {
            addCriterion("PCS_REPORT_TIME <=", value, "pcsReportTime");
            return (Criteria) this;
        }

        public Criteria andPcsReportTimeIn(List<Date> values) {
            addCriterion("PCS_REPORT_TIME in", values, "pcsReportTime");
            return (Criteria) this;
        }

        public Criteria andPcsReportTimeNotIn(List<Date> values) {
            addCriterion("PCS_REPORT_TIME not in", values, "pcsReportTime");
            return (Criteria) this;
        }

        public Criteria andPcsReportTimeBetween(Date value1, Date value2) {
            addCriterion("PCS_REPORT_TIME between", value1, value2, "pcsReportTime");
            return (Criteria) this;
        }

        public Criteria andPcsReportTimeNotBetween(Date value1, Date value2) {
            addCriterion("PCS_REPORT_TIME not between", value1, value2, "pcsReportTime");
            return (Criteria) this;
        }

        public Criteria andPcsCategoryIsNull() {
            addCriterion("PCS_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andPcsCategoryIsNotNull() {
            addCriterion("PCS_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andPcsCategoryEqualTo(String value) {
            addCriterion("PCS_CATEGORY =", value, "pcsCategory");
            return (Criteria) this;
        }

        public Criteria andPcsCategoryNotEqualTo(String value) {
            addCriterion("PCS_CATEGORY <>", value, "pcsCategory");
            return (Criteria) this;
        }

        public Criteria andPcsCategoryGreaterThan(String value) {
            addCriterion("PCS_CATEGORY >", value, "pcsCategory");
            return (Criteria) this;
        }

        public Criteria andPcsCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_CATEGORY >=", value, "pcsCategory");
            return (Criteria) this;
        }

        public Criteria andPcsCategoryLessThan(String value) {
            addCriterion("PCS_CATEGORY <", value, "pcsCategory");
            return (Criteria) this;
        }

        public Criteria andPcsCategoryLessThanOrEqualTo(String value) {
            addCriterion("PCS_CATEGORY <=", value, "pcsCategory");
            return (Criteria) this;
        }

        public Criteria andPcsCategoryLike(String value) {
            addCriterion("PCS_CATEGORY like", value, "pcsCategory");
            return (Criteria) this;
        }

        public Criteria andPcsCategoryNotLike(String value) {
            addCriterion("PCS_CATEGORY not like", value, "pcsCategory");
            return (Criteria) this;
        }

        public Criteria andPcsCategoryIn(List<String> values) {
            addCriterion("PCS_CATEGORY in", values, "pcsCategory");
            return (Criteria) this;
        }

        public Criteria andPcsCategoryNotIn(List<String> values) {
            addCriterion("PCS_CATEGORY not in", values, "pcsCategory");
            return (Criteria) this;
        }

        public Criteria andPcsCategoryBetween(String value1, String value2) {
            addCriterion("PCS_CATEGORY between", value1, value2, "pcsCategory");
            return (Criteria) this;
        }

        public Criteria andPcsCategoryNotBetween(String value1, String value2) {
            addCriterion("PCS_CATEGORY not between", value1, value2, "pcsCategory");
            return (Criteria) this;
        }

        public Criteria andPcsModuleIsNull() {
            addCriterion("PCS_MODULE is null");
            return (Criteria) this;
        }

        public Criteria andPcsModuleIsNotNull() {
            addCriterion("PCS_MODULE is not null");
            return (Criteria) this;
        }

        public Criteria andPcsModuleEqualTo(String value) {
            addCriterion("PCS_MODULE =", value, "pcsModule");
            return (Criteria) this;
        }

        public Criteria andPcsModuleNotEqualTo(String value) {
            addCriterion("PCS_MODULE <>", value, "pcsModule");
            return (Criteria) this;
        }

        public Criteria andPcsModuleGreaterThan(String value) {
            addCriterion("PCS_MODULE >", value, "pcsModule");
            return (Criteria) this;
        }

        public Criteria andPcsModuleGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_MODULE >=", value, "pcsModule");
            return (Criteria) this;
        }

        public Criteria andPcsModuleLessThan(String value) {
            addCriterion("PCS_MODULE <", value, "pcsModule");
            return (Criteria) this;
        }

        public Criteria andPcsModuleLessThanOrEqualTo(String value) {
            addCriterion("PCS_MODULE <=", value, "pcsModule");
            return (Criteria) this;
        }

        public Criteria andPcsModuleLike(String value) {
            addCriterion("PCS_MODULE like", value, "pcsModule");
            return (Criteria) this;
        }

        public Criteria andPcsModuleNotLike(String value) {
            addCriterion("PCS_MODULE not like", value, "pcsModule");
            return (Criteria) this;
        }

        public Criteria andPcsModuleIn(List<String> values) {
            addCriterion("PCS_MODULE in", values, "pcsModule");
            return (Criteria) this;
        }

        public Criteria andPcsModuleNotIn(List<String> values) {
            addCriterion("PCS_MODULE not in", values, "pcsModule");
            return (Criteria) this;
        }

        public Criteria andPcsModuleBetween(String value1, String value2) {
            addCriterion("PCS_MODULE between", value1, value2, "pcsModule");
            return (Criteria) this;
        }

        public Criteria andPcsModuleNotBetween(String value1, String value2) {
            addCriterion("PCS_MODULE not between", value1, value2, "pcsModule");
            return (Criteria) this;
        }

        public Criteria andPcsResultIsNull() {
            addCriterion("PCS_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andPcsResultIsNotNull() {
            addCriterion("PCS_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andPcsResultEqualTo(String value) {
            addCriterion("PCS_RESULT =", value, "pcsResult");
            return (Criteria) this;
        }

        public Criteria andPcsResultNotEqualTo(String value) {
            addCriterion("PCS_RESULT <>", value, "pcsResult");
            return (Criteria) this;
        }

        public Criteria andPcsResultGreaterThan(String value) {
            addCriterion("PCS_RESULT >", value, "pcsResult");
            return (Criteria) this;
        }

        public Criteria andPcsResultGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_RESULT >=", value, "pcsResult");
            return (Criteria) this;
        }

        public Criteria andPcsResultLessThan(String value) {
            addCriterion("PCS_RESULT <", value, "pcsResult");
            return (Criteria) this;
        }

        public Criteria andPcsResultLessThanOrEqualTo(String value) {
            addCriterion("PCS_RESULT <=", value, "pcsResult");
            return (Criteria) this;
        }

        public Criteria andPcsResultLike(String value) {
            addCriterion("PCS_RESULT like", value, "pcsResult");
            return (Criteria) this;
        }

        public Criteria andPcsResultNotLike(String value) {
            addCriterion("PCS_RESULT not like", value, "pcsResult");
            return (Criteria) this;
        }

        public Criteria andPcsResultIn(List<String> values) {
            addCriterion("PCS_RESULT in", values, "pcsResult");
            return (Criteria) this;
        }

        public Criteria andPcsResultNotIn(List<String> values) {
            addCriterion("PCS_RESULT not in", values, "pcsResult");
            return (Criteria) this;
        }

        public Criteria andPcsResultBetween(String value1, String value2) {
            addCriterion("PCS_RESULT between", value1, value2, "pcsResult");
            return (Criteria) this;
        }

        public Criteria andPcsResultNotBetween(String value1, String value2) {
            addCriterion("PCS_RESULT not between", value1, value2, "pcsResult");
            return (Criteria) this;
        }

        public Criteria andPcsResultCodeIsNull() {
            addCriterion("PCS_RESULT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPcsResultCodeIsNotNull() {
            addCriterion("PCS_RESULT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPcsResultCodeEqualTo(String value) {
            addCriterion("PCS_RESULT_CODE =", value, "pcsResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsResultCodeNotEqualTo(String value) {
            addCriterion("PCS_RESULT_CODE <>", value, "pcsResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsResultCodeGreaterThan(String value) {
            addCriterion("PCS_RESULT_CODE >", value, "pcsResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsResultCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_RESULT_CODE >=", value, "pcsResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsResultCodeLessThan(String value) {
            addCriterion("PCS_RESULT_CODE <", value, "pcsResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsResultCodeLessThanOrEqualTo(String value) {
            addCriterion("PCS_RESULT_CODE <=", value, "pcsResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsResultCodeLike(String value) {
            addCriterion("PCS_RESULT_CODE like", value, "pcsResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsResultCodeNotLike(String value) {
            addCriterion("PCS_RESULT_CODE not like", value, "pcsResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsResultCodeIn(List<String> values) {
            addCriterion("PCS_RESULT_CODE in", values, "pcsResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsResultCodeNotIn(List<String> values) {
            addCriterion("PCS_RESULT_CODE not in", values, "pcsResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsResultCodeBetween(String value1, String value2) {
            addCriterion("PCS_RESULT_CODE between", value1, value2, "pcsResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsResultCodeNotBetween(String value1, String value2) {
            addCriterion("PCS_RESULT_CODE not between", value1, value2, "pcsResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultIsNull() {
            addCriterion("PCS_EXT_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultIsNotNull() {
            addCriterion("PCS_EXT_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultEqualTo(String value) {
            addCriterion("PCS_EXT_RESULT =", value, "pcsExtResult");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultNotEqualTo(String value) {
            addCriterion("PCS_EXT_RESULT <>", value, "pcsExtResult");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultGreaterThan(String value) {
            addCriterion("PCS_EXT_RESULT >", value, "pcsExtResult");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_EXT_RESULT >=", value, "pcsExtResult");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultLessThan(String value) {
            addCriterion("PCS_EXT_RESULT <", value, "pcsExtResult");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultLessThanOrEqualTo(String value) {
            addCriterion("PCS_EXT_RESULT <=", value, "pcsExtResult");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultLike(String value) {
            addCriterion("PCS_EXT_RESULT like", value, "pcsExtResult");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultNotLike(String value) {
            addCriterion("PCS_EXT_RESULT not like", value, "pcsExtResult");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultIn(List<String> values) {
            addCriterion("PCS_EXT_RESULT in", values, "pcsExtResult");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultNotIn(List<String> values) {
            addCriterion("PCS_EXT_RESULT not in", values, "pcsExtResult");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultBetween(String value1, String value2) {
            addCriterion("PCS_EXT_RESULT between", value1, value2, "pcsExtResult");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultNotBetween(String value1, String value2) {
            addCriterion("PCS_EXT_RESULT not between", value1, value2, "pcsExtResult");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultCodeIsNull() {
            addCriterion("PCS_EXT_RESULT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultCodeIsNotNull() {
            addCriterion("PCS_EXT_RESULT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultCodeEqualTo(String value) {
            addCriterion("PCS_EXT_RESULT_CODE =", value, "pcsExtResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultCodeNotEqualTo(String value) {
            addCriterion("PCS_EXT_RESULT_CODE <>", value, "pcsExtResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultCodeGreaterThan(String value) {
            addCriterion("PCS_EXT_RESULT_CODE >", value, "pcsExtResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_EXT_RESULT_CODE >=", value, "pcsExtResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultCodeLessThan(String value) {
            addCriterion("PCS_EXT_RESULT_CODE <", value, "pcsExtResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultCodeLessThanOrEqualTo(String value) {
            addCriterion("PCS_EXT_RESULT_CODE <=", value, "pcsExtResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultCodeLike(String value) {
            addCriterion("PCS_EXT_RESULT_CODE like", value, "pcsExtResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultCodeNotLike(String value) {
            addCriterion("PCS_EXT_RESULT_CODE not like", value, "pcsExtResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultCodeIn(List<String> values) {
            addCriterion("PCS_EXT_RESULT_CODE in", values, "pcsExtResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultCodeNotIn(List<String> values) {
            addCriterion("PCS_EXT_RESULT_CODE not in", values, "pcsExtResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultCodeBetween(String value1, String value2) {
            addCriterion("PCS_EXT_RESULT_CODE between", value1, value2, "pcsExtResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsExtResultCodeNotBetween(String value1, String value2) {
            addCriterion("PCS_EXT_RESULT_CODE not between", value1, value2, "pcsExtResultCode");
            return (Criteria) this;
        }

        public Criteria andPcsActorUuidIsNull() {
            addCriterion("PCS_ACTOR_UUID is null");
            return (Criteria) this;
        }

        public Criteria andPcsActorUuidIsNotNull() {
            addCriterion("PCS_ACTOR_UUID is not null");
            return (Criteria) this;
        }

        public Criteria andPcsActorUuidEqualTo(String value) {
            addCriterion("PCS_ACTOR_UUID =", value, "pcsActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsActorUuidNotEqualTo(String value) {
            addCriterion("PCS_ACTOR_UUID <>", value, "pcsActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsActorUuidGreaterThan(String value) {
            addCriterion("PCS_ACTOR_UUID >", value, "pcsActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsActorUuidGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_ACTOR_UUID >=", value, "pcsActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsActorUuidLessThan(String value) {
            addCriterion("PCS_ACTOR_UUID <", value, "pcsActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsActorUuidLessThanOrEqualTo(String value) {
            addCriterion("PCS_ACTOR_UUID <=", value, "pcsActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsActorUuidLike(String value) {
            addCriterion("PCS_ACTOR_UUID like", value, "pcsActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsActorUuidNotLike(String value) {
            addCriterion("PCS_ACTOR_UUID not like", value, "pcsActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsActorUuidIn(List<String> values) {
            addCriterion("PCS_ACTOR_UUID in", values, "pcsActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsActorUuidNotIn(List<String> values) {
            addCriterion("PCS_ACTOR_UUID not in", values, "pcsActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsActorUuidBetween(String value1, String value2) {
            addCriterion("PCS_ACTOR_UUID between", value1, value2, "pcsActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsActorUuidNotBetween(String value1, String value2) {
            addCriterion("PCS_ACTOR_UUID not between", value1, value2, "pcsActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsActorIdIsNull() {
            addCriterion("PCS_ACTOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andPcsActorIdIsNotNull() {
            addCriterion("PCS_ACTOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPcsActorIdEqualTo(String value) {
            addCriterion("PCS_ACTOR_ID =", value, "pcsActorId");
            return (Criteria) this;
        }

        public Criteria andPcsActorIdNotEqualTo(String value) {
            addCriterion("PCS_ACTOR_ID <>", value, "pcsActorId");
            return (Criteria) this;
        }

        public Criteria andPcsActorIdGreaterThan(String value) {
            addCriterion("PCS_ACTOR_ID >", value, "pcsActorId");
            return (Criteria) this;
        }

        public Criteria andPcsActorIdGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_ACTOR_ID >=", value, "pcsActorId");
            return (Criteria) this;
        }

        public Criteria andPcsActorIdLessThan(String value) {
            addCriterion("PCS_ACTOR_ID <", value, "pcsActorId");
            return (Criteria) this;
        }

        public Criteria andPcsActorIdLessThanOrEqualTo(String value) {
            addCriterion("PCS_ACTOR_ID <=", value, "pcsActorId");
            return (Criteria) this;
        }

        public Criteria andPcsActorIdLike(String value) {
            addCriterion("PCS_ACTOR_ID like", value, "pcsActorId");
            return (Criteria) this;
        }

        public Criteria andPcsActorIdNotLike(String value) {
            addCriterion("PCS_ACTOR_ID not like", value, "pcsActorId");
            return (Criteria) this;
        }

        public Criteria andPcsActorIdIn(List<String> values) {
            addCriterion("PCS_ACTOR_ID in", values, "pcsActorId");
            return (Criteria) this;
        }

        public Criteria andPcsActorIdNotIn(List<String> values) {
            addCriterion("PCS_ACTOR_ID not in", values, "pcsActorId");
            return (Criteria) this;
        }

        public Criteria andPcsActorIdBetween(String value1, String value2) {
            addCriterion("PCS_ACTOR_ID between", value1, value2, "pcsActorId");
            return (Criteria) this;
        }

        public Criteria andPcsActorIdNotBetween(String value1, String value2) {
            addCriterion("PCS_ACTOR_ID not between", value1, value2, "pcsActorId");
            return (Criteria) this;
        }

        public Criteria andPcsActorIpAddrIsNull() {
            addCriterion("PCS_ACTOR_IP_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andPcsActorIpAddrIsNotNull() {
            addCriterion("PCS_ACTOR_IP_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andPcsActorIpAddrEqualTo(String value) {
            addCriterion("PCS_ACTOR_IP_ADDR =", value, "pcsActorIpAddr");
            return (Criteria) this;
        }

        public Criteria andPcsActorIpAddrNotEqualTo(String value) {
            addCriterion("PCS_ACTOR_IP_ADDR <>", value, "pcsActorIpAddr");
            return (Criteria) this;
        }

        public Criteria andPcsActorIpAddrGreaterThan(String value) {
            addCriterion("PCS_ACTOR_IP_ADDR >", value, "pcsActorIpAddr");
            return (Criteria) this;
        }

        public Criteria andPcsActorIpAddrGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_ACTOR_IP_ADDR >=", value, "pcsActorIpAddr");
            return (Criteria) this;
        }

        public Criteria andPcsActorIpAddrLessThan(String value) {
            addCriterion("PCS_ACTOR_IP_ADDR <", value, "pcsActorIpAddr");
            return (Criteria) this;
        }

        public Criteria andPcsActorIpAddrLessThanOrEqualTo(String value) {
            addCriterion("PCS_ACTOR_IP_ADDR <=", value, "pcsActorIpAddr");
            return (Criteria) this;
        }

        public Criteria andPcsActorIpAddrLike(String value) {
            addCriterion("PCS_ACTOR_IP_ADDR like", value, "pcsActorIpAddr");
            return (Criteria) this;
        }

        public Criteria andPcsActorIpAddrNotLike(String value) {
            addCriterion("PCS_ACTOR_IP_ADDR not like", value, "pcsActorIpAddr");
            return (Criteria) this;
        }

        public Criteria andPcsActorIpAddrIn(List<String> values) {
            addCriterion("PCS_ACTOR_IP_ADDR in", values, "pcsActorIpAddr");
            return (Criteria) this;
        }

        public Criteria andPcsActorIpAddrNotIn(List<String> values) {
            addCriterion("PCS_ACTOR_IP_ADDR not in", values, "pcsActorIpAddr");
            return (Criteria) this;
        }

        public Criteria andPcsActorIpAddrBetween(String value1, String value2) {
            addCriterion("PCS_ACTOR_IP_ADDR between", value1, value2, "pcsActorIpAddr");
            return (Criteria) this;
        }

        public Criteria andPcsActorIpAddrNotBetween(String value1, String value2) {
            addCriterion("PCS_ACTOR_IP_ADDR not between", value1, value2, "pcsActorIpAddr");
            return (Criteria) this;
        }

        public Criteria andPcsActorMacIsNull() {
            addCriterion("PCS_ACTOR_MAC is null");
            return (Criteria) this;
        }

        public Criteria andPcsActorMacIsNotNull() {
            addCriterion("PCS_ACTOR_MAC is not null");
            return (Criteria) this;
        }

        public Criteria andPcsActorMacEqualTo(String value) {
            addCriterion("PCS_ACTOR_MAC =", value, "pcsActorMac");
            return (Criteria) this;
        }

        public Criteria andPcsActorMacNotEqualTo(String value) {
            addCriterion("PCS_ACTOR_MAC <>", value, "pcsActorMac");
            return (Criteria) this;
        }

        public Criteria andPcsActorMacGreaterThan(String value) {
            addCriterion("PCS_ACTOR_MAC >", value, "pcsActorMac");
            return (Criteria) this;
        }

        public Criteria andPcsActorMacGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_ACTOR_MAC >=", value, "pcsActorMac");
            return (Criteria) this;
        }

        public Criteria andPcsActorMacLessThan(String value) {
            addCriterion("PCS_ACTOR_MAC <", value, "pcsActorMac");
            return (Criteria) this;
        }

        public Criteria andPcsActorMacLessThanOrEqualTo(String value) {
            addCriterion("PCS_ACTOR_MAC <=", value, "pcsActorMac");
            return (Criteria) this;
        }

        public Criteria andPcsActorMacLike(String value) {
            addCriterion("PCS_ACTOR_MAC like", value, "pcsActorMac");
            return (Criteria) this;
        }

        public Criteria andPcsActorMacNotLike(String value) {
            addCriterion("PCS_ACTOR_MAC not like", value, "pcsActorMac");
            return (Criteria) this;
        }

        public Criteria andPcsActorMacIn(List<String> values) {
            addCriterion("PCS_ACTOR_MAC in", values, "pcsActorMac");
            return (Criteria) this;
        }

        public Criteria andPcsActorMacNotIn(List<String> values) {
            addCriterion("PCS_ACTOR_MAC not in", values, "pcsActorMac");
            return (Criteria) this;
        }

        public Criteria andPcsActorMacBetween(String value1, String value2) {
            addCriterion("PCS_ACTOR_MAC between", value1, value2, "pcsActorMac");
            return (Criteria) this;
        }

        public Criteria andPcsActorMacNotBetween(String value1, String value2) {
            addCriterion("PCS_ACTOR_MAC not between", value1, value2, "pcsActorMac");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorUuidIsNull() {
            addCriterion("PCS_REAL_ACTOR_UUID is null");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorUuidIsNotNull() {
            addCriterion("PCS_REAL_ACTOR_UUID is not null");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorUuidEqualTo(String value) {
            addCriterion("PCS_REAL_ACTOR_UUID =", value, "pcsRealActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorUuidNotEqualTo(String value) {
            addCriterion("PCS_REAL_ACTOR_UUID <>", value, "pcsRealActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorUuidGreaterThan(String value) {
            addCriterion("PCS_REAL_ACTOR_UUID >", value, "pcsRealActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorUuidGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_REAL_ACTOR_UUID >=", value, "pcsRealActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorUuidLessThan(String value) {
            addCriterion("PCS_REAL_ACTOR_UUID <", value, "pcsRealActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorUuidLessThanOrEqualTo(String value) {
            addCriterion("PCS_REAL_ACTOR_UUID <=", value, "pcsRealActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorUuidLike(String value) {
            addCriterion("PCS_REAL_ACTOR_UUID like", value, "pcsRealActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorUuidNotLike(String value) {
            addCriterion("PCS_REAL_ACTOR_UUID not like", value, "pcsRealActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorUuidIn(List<String> values) {
            addCriterion("PCS_REAL_ACTOR_UUID in", values, "pcsRealActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorUuidNotIn(List<String> values) {
            addCriterion("PCS_REAL_ACTOR_UUID not in", values, "pcsRealActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorUuidBetween(String value1, String value2) {
            addCriterion("PCS_REAL_ACTOR_UUID between", value1, value2, "pcsRealActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorUuidNotBetween(String value1, String value2) {
            addCriterion("PCS_REAL_ACTOR_UUID not between", value1, value2, "pcsRealActorUuid");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorIdIsNull() {
            addCriterion("PCS_REAL_ACTOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorIdIsNotNull() {
            addCriterion("PCS_REAL_ACTOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorIdEqualTo(String value) {
            addCriterion("PCS_REAL_ACTOR_ID =", value, "pcsRealActorId");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorIdNotEqualTo(String value) {
            addCriterion("PCS_REAL_ACTOR_ID <>", value, "pcsRealActorId");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorIdGreaterThan(String value) {
            addCriterion("PCS_REAL_ACTOR_ID >", value, "pcsRealActorId");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorIdGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_REAL_ACTOR_ID >=", value, "pcsRealActorId");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorIdLessThan(String value) {
            addCriterion("PCS_REAL_ACTOR_ID <", value, "pcsRealActorId");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorIdLessThanOrEqualTo(String value) {
            addCriterion("PCS_REAL_ACTOR_ID <=", value, "pcsRealActorId");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorIdLike(String value) {
            addCriterion("PCS_REAL_ACTOR_ID like", value, "pcsRealActorId");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorIdNotLike(String value) {
            addCriterion("PCS_REAL_ACTOR_ID not like", value, "pcsRealActorId");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorIdIn(List<String> values) {
            addCriterion("PCS_REAL_ACTOR_ID in", values, "pcsRealActorId");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorIdNotIn(List<String> values) {
            addCriterion("PCS_REAL_ACTOR_ID not in", values, "pcsRealActorId");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorIdBetween(String value1, String value2) {
            addCriterion("PCS_REAL_ACTOR_ID between", value1, value2, "pcsRealActorId");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorIdNotBetween(String value1, String value2) {
            addCriterion("PCS_REAL_ACTOR_ID not between", value1, value2, "pcsRealActorId");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorNameIsNull() {
            addCriterion("PCS_REAL_ACTOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorNameIsNotNull() {
            addCriterion("PCS_REAL_ACTOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorNameEqualTo(String value) {
            addCriterion("PCS_REAL_ACTOR_NAME =", value, "pcsRealActorName");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorNameNotEqualTo(String value) {
            addCriterion("PCS_REAL_ACTOR_NAME <>", value, "pcsRealActorName");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorNameGreaterThan(String value) {
            addCriterion("PCS_REAL_ACTOR_NAME >", value, "pcsRealActorName");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorNameGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_REAL_ACTOR_NAME >=", value, "pcsRealActorName");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorNameLessThan(String value) {
            addCriterion("PCS_REAL_ACTOR_NAME <", value, "pcsRealActorName");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorNameLessThanOrEqualTo(String value) {
            addCriterion("PCS_REAL_ACTOR_NAME <=", value, "pcsRealActorName");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorNameLike(String value) {
            addCriterion("PCS_REAL_ACTOR_NAME like", value, "pcsRealActorName");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorNameNotLike(String value) {
            addCriterion("PCS_REAL_ACTOR_NAME not like", value, "pcsRealActorName");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorNameIn(List<String> values) {
            addCriterion("PCS_REAL_ACTOR_NAME in", values, "pcsRealActorName");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorNameNotIn(List<String> values) {
            addCriterion("PCS_REAL_ACTOR_NAME not in", values, "pcsRealActorName");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorNameBetween(String value1, String value2) {
            addCriterion("PCS_REAL_ACTOR_NAME between", value1, value2, "pcsRealActorName");
            return (Criteria) this;
        }

        public Criteria andPcsRealActorNameNotBetween(String value1, String value2) {
            addCriterion("PCS_REAL_ACTOR_NAME not between", value1, value2, "pcsRealActorName");
            return (Criteria) this;
        }

        public Criteria andPcsClientIdIsNull() {
            addCriterion("PCS_CLIENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPcsClientIdIsNotNull() {
            addCriterion("PCS_CLIENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPcsClientIdEqualTo(String value) {
            addCriterion("PCS_CLIENT_ID =", value, "pcsClientId");
            return (Criteria) this;
        }

        public Criteria andPcsClientIdNotEqualTo(String value) {
            addCriterion("PCS_CLIENT_ID <>", value, "pcsClientId");
            return (Criteria) this;
        }

        public Criteria andPcsClientIdGreaterThan(String value) {
            addCriterion("PCS_CLIENT_ID >", value, "pcsClientId");
            return (Criteria) this;
        }

        public Criteria andPcsClientIdGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_CLIENT_ID >=", value, "pcsClientId");
            return (Criteria) this;
        }

        public Criteria andPcsClientIdLessThan(String value) {
            addCriterion("PCS_CLIENT_ID <", value, "pcsClientId");
            return (Criteria) this;
        }

        public Criteria andPcsClientIdLessThanOrEqualTo(String value) {
            addCriterion("PCS_CLIENT_ID <=", value, "pcsClientId");
            return (Criteria) this;
        }

        public Criteria andPcsClientIdLike(String value) {
            addCriterion("PCS_CLIENT_ID like", value, "pcsClientId");
            return (Criteria) this;
        }

        public Criteria andPcsClientIdNotLike(String value) {
            addCriterion("PCS_CLIENT_ID not like", value, "pcsClientId");
            return (Criteria) this;
        }

        public Criteria andPcsClientIdIn(List<String> values) {
            addCriterion("PCS_CLIENT_ID in", values, "pcsClientId");
            return (Criteria) this;
        }

        public Criteria andPcsClientIdNotIn(List<String> values) {
            addCriterion("PCS_CLIENT_ID not in", values, "pcsClientId");
            return (Criteria) this;
        }

        public Criteria andPcsClientIdBetween(String value1, String value2) {
            addCriterion("PCS_CLIENT_ID between", value1, value2, "pcsClientId");
            return (Criteria) this;
        }

        public Criteria andPcsClientIdNotBetween(String value1, String value2) {
            addCriterion("PCS_CLIENT_ID not between", value1, value2, "pcsClientId");
            return (Criteria) this;
        }

        public Criteria andPcsClientTypeIsNull() {
            addCriterion("PCS_CLIENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPcsClientTypeIsNotNull() {
            addCriterion("PCS_CLIENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPcsClientTypeEqualTo(String value) {
            addCriterion("PCS_CLIENT_TYPE =", value, "pcsClientType");
            return (Criteria) this;
        }

        public Criteria andPcsClientTypeNotEqualTo(String value) {
            addCriterion("PCS_CLIENT_TYPE <>", value, "pcsClientType");
            return (Criteria) this;
        }

        public Criteria andPcsClientTypeGreaterThan(String value) {
            addCriterion("PCS_CLIENT_TYPE >", value, "pcsClientType");
            return (Criteria) this;
        }

        public Criteria andPcsClientTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_CLIENT_TYPE >=", value, "pcsClientType");
            return (Criteria) this;
        }

        public Criteria andPcsClientTypeLessThan(String value) {
            addCriterion("PCS_CLIENT_TYPE <", value, "pcsClientType");
            return (Criteria) this;
        }

        public Criteria andPcsClientTypeLessThanOrEqualTo(String value) {
            addCriterion("PCS_CLIENT_TYPE <=", value, "pcsClientType");
            return (Criteria) this;
        }

        public Criteria andPcsClientTypeLike(String value) {
            addCriterion("PCS_CLIENT_TYPE like", value, "pcsClientType");
            return (Criteria) this;
        }

        public Criteria andPcsClientTypeNotLike(String value) {
            addCriterion("PCS_CLIENT_TYPE not like", value, "pcsClientType");
            return (Criteria) this;
        }

        public Criteria andPcsClientTypeIn(List<String> values) {
            addCriterion("PCS_CLIENT_TYPE in", values, "pcsClientType");
            return (Criteria) this;
        }

        public Criteria andPcsClientTypeNotIn(List<String> values) {
            addCriterion("PCS_CLIENT_TYPE not in", values, "pcsClientType");
            return (Criteria) this;
        }

        public Criteria andPcsClientTypeBetween(String value1, String value2) {
            addCriterion("PCS_CLIENT_TYPE between", value1, value2, "pcsClientType");
            return (Criteria) this;
        }

        public Criteria andPcsClientTypeNotBetween(String value1, String value2) {
            addCriterion("PCS_CLIENT_TYPE not between", value1, value2, "pcsClientType");
            return (Criteria) this;
        }

        public Criteria andPcsTargetUuidIsNull() {
            addCriterion("PCS_TARGET_UUID is null");
            return (Criteria) this;
        }

        public Criteria andPcsTargetUuidIsNotNull() {
            addCriterion("PCS_TARGET_UUID is not null");
            return (Criteria) this;
        }

        public Criteria andPcsTargetUuidEqualTo(String value) {
            addCriterion("PCS_TARGET_UUID =", value, "pcsTargetUuid");
            return (Criteria) this;
        }

        public Criteria andPcsTargetUuidNotEqualTo(String value) {
            addCriterion("PCS_TARGET_UUID <>", value, "pcsTargetUuid");
            return (Criteria) this;
        }

        public Criteria andPcsTargetUuidGreaterThan(String value) {
            addCriterion("PCS_TARGET_UUID >", value, "pcsTargetUuid");
            return (Criteria) this;
        }

        public Criteria andPcsTargetUuidGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_TARGET_UUID >=", value, "pcsTargetUuid");
            return (Criteria) this;
        }

        public Criteria andPcsTargetUuidLessThan(String value) {
            addCriterion("PCS_TARGET_UUID <", value, "pcsTargetUuid");
            return (Criteria) this;
        }

        public Criteria andPcsTargetUuidLessThanOrEqualTo(String value) {
            addCriterion("PCS_TARGET_UUID <=", value, "pcsTargetUuid");
            return (Criteria) this;
        }

        public Criteria andPcsTargetUuidLike(String value) {
            addCriterion("PCS_TARGET_UUID like", value, "pcsTargetUuid");
            return (Criteria) this;
        }

        public Criteria andPcsTargetUuidNotLike(String value) {
            addCriterion("PCS_TARGET_UUID not like", value, "pcsTargetUuid");
            return (Criteria) this;
        }

        public Criteria andPcsTargetUuidIn(List<String> values) {
            addCriterion("PCS_TARGET_UUID in", values, "pcsTargetUuid");
            return (Criteria) this;
        }

        public Criteria andPcsTargetUuidNotIn(List<String> values) {
            addCriterion("PCS_TARGET_UUID not in", values, "pcsTargetUuid");
            return (Criteria) this;
        }

        public Criteria andPcsTargetUuidBetween(String value1, String value2) {
            addCriterion("PCS_TARGET_UUID between", value1, value2, "pcsTargetUuid");
            return (Criteria) this;
        }

        public Criteria andPcsTargetUuidNotBetween(String value1, String value2) {
            addCriterion("PCS_TARGET_UUID not between", value1, value2, "pcsTargetUuid");
            return (Criteria) this;
        }

        public Criteria andPcsTargetIdIsNull() {
            addCriterion("PCS_TARGET_ID is null");
            return (Criteria) this;
        }

        public Criteria andPcsTargetIdIsNotNull() {
            addCriterion("PCS_TARGET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPcsTargetIdEqualTo(String value) {
            addCriterion("PCS_TARGET_ID =", value, "pcsTargetId");
            return (Criteria) this;
        }

        public Criteria andPcsTargetIdNotEqualTo(String value) {
            addCriterion("PCS_TARGET_ID <>", value, "pcsTargetId");
            return (Criteria) this;
        }

        public Criteria andPcsTargetIdGreaterThan(String value) {
            addCriterion("PCS_TARGET_ID >", value, "pcsTargetId");
            return (Criteria) this;
        }

        public Criteria andPcsTargetIdGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_TARGET_ID >=", value, "pcsTargetId");
            return (Criteria) this;
        }

        public Criteria andPcsTargetIdLessThan(String value) {
            addCriterion("PCS_TARGET_ID <", value, "pcsTargetId");
            return (Criteria) this;
        }

        public Criteria andPcsTargetIdLessThanOrEqualTo(String value) {
            addCriterion("PCS_TARGET_ID <=", value, "pcsTargetId");
            return (Criteria) this;
        }

        public Criteria andPcsTargetIdLike(String value) {
            addCriterion("PCS_TARGET_ID like", value, "pcsTargetId");
            return (Criteria) this;
        }

        public Criteria andPcsTargetIdNotLike(String value) {
            addCriterion("PCS_TARGET_ID not like", value, "pcsTargetId");
            return (Criteria) this;
        }

        public Criteria andPcsTargetIdIn(List<String> values) {
            addCriterion("PCS_TARGET_ID in", values, "pcsTargetId");
            return (Criteria) this;
        }

        public Criteria andPcsTargetIdNotIn(List<String> values) {
            addCriterion("PCS_TARGET_ID not in", values, "pcsTargetId");
            return (Criteria) this;
        }

        public Criteria andPcsTargetIdBetween(String value1, String value2) {
            addCriterion("PCS_TARGET_ID between", value1, value2, "pcsTargetId");
            return (Criteria) this;
        }

        public Criteria andPcsTargetIdNotBetween(String value1, String value2) {
            addCriterion("PCS_TARGET_ID not between", value1, value2, "pcsTargetId");
            return (Criteria) this;
        }

        public Criteria andPcsTargetNameIsNull() {
            addCriterion("PCS_TARGET_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPcsTargetNameIsNotNull() {
            addCriterion("PCS_TARGET_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPcsTargetNameEqualTo(String value) {
            addCriterion("PCS_TARGET_NAME =", value, "pcsTargetName");
            return (Criteria) this;
        }

        public Criteria andPcsTargetNameNotEqualTo(String value) {
            addCriterion("PCS_TARGET_NAME <>", value, "pcsTargetName");
            return (Criteria) this;
        }

        public Criteria andPcsTargetNameGreaterThan(String value) {
            addCriterion("PCS_TARGET_NAME >", value, "pcsTargetName");
            return (Criteria) this;
        }

        public Criteria andPcsTargetNameGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_TARGET_NAME >=", value, "pcsTargetName");
            return (Criteria) this;
        }

        public Criteria andPcsTargetNameLessThan(String value) {
            addCriterion("PCS_TARGET_NAME <", value, "pcsTargetName");
            return (Criteria) this;
        }

        public Criteria andPcsTargetNameLessThanOrEqualTo(String value) {
            addCriterion("PCS_TARGET_NAME <=", value, "pcsTargetName");
            return (Criteria) this;
        }

        public Criteria andPcsTargetNameLike(String value) {
            addCriterion("PCS_TARGET_NAME like", value, "pcsTargetName");
            return (Criteria) this;
        }

        public Criteria andPcsTargetNameNotLike(String value) {
            addCriterion("PCS_TARGET_NAME not like", value, "pcsTargetName");
            return (Criteria) this;
        }

        public Criteria andPcsTargetNameIn(List<String> values) {
            addCriterion("PCS_TARGET_NAME in", values, "pcsTargetName");
            return (Criteria) this;
        }

        public Criteria andPcsTargetNameNotIn(List<String> values) {
            addCriterion("PCS_TARGET_NAME not in", values, "pcsTargetName");
            return (Criteria) this;
        }

        public Criteria andPcsTargetNameBetween(String value1, String value2) {
            addCriterion("PCS_TARGET_NAME between", value1, value2, "pcsTargetName");
            return (Criteria) this;
        }

        public Criteria andPcsTargetNameNotBetween(String value1, String value2) {
            addCriterion("PCS_TARGET_NAME not between", value1, value2, "pcsTargetName");
            return (Criteria) this;
        }

        public Criteria andPcsCreaterIsNull() {
            addCriterion("PCS_CREATER is null");
            return (Criteria) this;
        }

        public Criteria andPcsCreaterIsNotNull() {
            addCriterion("PCS_CREATER is not null");
            return (Criteria) this;
        }

        public Criteria andPcsCreaterEqualTo(String value) {
            addCriterion("PCS_CREATER =", value, "pcsCreater");
            return (Criteria) this;
        }

        public Criteria andPcsCreaterNotEqualTo(String value) {
            addCriterion("PCS_CREATER <>", value, "pcsCreater");
            return (Criteria) this;
        }

        public Criteria andPcsCreaterGreaterThan(String value) {
            addCriterion("PCS_CREATER >", value, "pcsCreater");
            return (Criteria) this;
        }

        public Criteria andPcsCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_CREATER >=", value, "pcsCreater");
            return (Criteria) this;
        }

        public Criteria andPcsCreaterLessThan(String value) {
            addCriterion("PCS_CREATER <", value, "pcsCreater");
            return (Criteria) this;
        }

        public Criteria andPcsCreaterLessThanOrEqualTo(String value) {
            addCriterion("PCS_CREATER <=", value, "pcsCreater");
            return (Criteria) this;
        }

        public Criteria andPcsCreaterLike(String value) {
            addCriterion("PCS_CREATER like", value, "pcsCreater");
            return (Criteria) this;
        }

        public Criteria andPcsCreaterNotLike(String value) {
            addCriterion("PCS_CREATER not like", value, "pcsCreater");
            return (Criteria) this;
        }

        public Criteria andPcsCreaterIn(List<String> values) {
            addCriterion("PCS_CREATER in", values, "pcsCreater");
            return (Criteria) this;
        }

        public Criteria andPcsCreaterNotIn(List<String> values) {
            addCriterion("PCS_CREATER not in", values, "pcsCreater");
            return (Criteria) this;
        }

        public Criteria andPcsCreaterBetween(String value1, String value2) {
            addCriterion("PCS_CREATER between", value1, value2, "pcsCreater");
            return (Criteria) this;
        }

        public Criteria andPcsCreaterNotBetween(String value1, String value2) {
            addCriterion("PCS_CREATER not between", value1, value2, "pcsCreater");
            return (Criteria) this;
        }

        public Criteria andPcsCreatetimeIsNull() {
            addCriterion("PCS_CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andPcsCreatetimeIsNotNull() {
            addCriterion("PCS_CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andPcsCreatetimeEqualTo(Date value) {
            addCriterion("PCS_CREATETIME =", value, "pcsCreatetime");
            return (Criteria) this;
        }

        public Criteria andPcsCreatetimeNotEqualTo(Date value) {
            addCriterion("PCS_CREATETIME <>", value, "pcsCreatetime");
            return (Criteria) this;
        }

        public Criteria andPcsCreatetimeGreaterThan(Date value) {
            addCriterion("PCS_CREATETIME >", value, "pcsCreatetime");
            return (Criteria) this;
        }

        public Criteria andPcsCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PCS_CREATETIME >=", value, "pcsCreatetime");
            return (Criteria) this;
        }

        public Criteria andPcsCreatetimeLessThan(Date value) {
            addCriterion("PCS_CREATETIME <", value, "pcsCreatetime");
            return (Criteria) this;
        }

        public Criteria andPcsCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("PCS_CREATETIME <=", value, "pcsCreatetime");
            return (Criteria) this;
        }

        public Criteria andPcsCreatetimeIn(List<Date> values) {
            addCriterion("PCS_CREATETIME in", values, "pcsCreatetime");
            return (Criteria) this;
        }

        public Criteria andPcsCreatetimeNotIn(List<Date> values) {
            addCriterion("PCS_CREATETIME not in", values, "pcsCreatetime");
            return (Criteria) this;
        }

        public Criteria andPcsCreatetimeBetween(Date value1, Date value2) {
            addCriterion("PCS_CREATETIME between", value1, value2, "pcsCreatetime");
            return (Criteria) this;
        }

        public Criteria andPcsCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("PCS_CREATETIME not between", value1, value2, "pcsCreatetime");
            return (Criteria) this;
        }

        public Criteria andPcsModifiederIsNull() {
            addCriterion("PCS_MODIFIEDER is null");
            return (Criteria) this;
        }

        public Criteria andPcsModifiederIsNotNull() {
            addCriterion("PCS_MODIFIEDER is not null");
            return (Criteria) this;
        }

        public Criteria andPcsModifiederEqualTo(String value) {
            addCriterion("PCS_MODIFIEDER =", value, "pcsModifieder");
            return (Criteria) this;
        }

        public Criteria andPcsModifiederNotEqualTo(String value) {
            addCriterion("PCS_MODIFIEDER <>", value, "pcsModifieder");
            return (Criteria) this;
        }

        public Criteria andPcsModifiederGreaterThan(String value) {
            addCriterion("PCS_MODIFIEDER >", value, "pcsModifieder");
            return (Criteria) this;
        }

        public Criteria andPcsModifiederGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_MODIFIEDER >=", value, "pcsModifieder");
            return (Criteria) this;
        }

        public Criteria andPcsModifiederLessThan(String value) {
            addCriterion("PCS_MODIFIEDER <", value, "pcsModifieder");
            return (Criteria) this;
        }

        public Criteria andPcsModifiederLessThanOrEqualTo(String value) {
            addCriterion("PCS_MODIFIEDER <=", value, "pcsModifieder");
            return (Criteria) this;
        }

        public Criteria andPcsModifiederLike(String value) {
            addCriterion("PCS_MODIFIEDER like", value, "pcsModifieder");
            return (Criteria) this;
        }

        public Criteria andPcsModifiederNotLike(String value) {
            addCriterion("PCS_MODIFIEDER not like", value, "pcsModifieder");
            return (Criteria) this;
        }

        public Criteria andPcsModifiederIn(List<String> values) {
            addCriterion("PCS_MODIFIEDER in", values, "pcsModifieder");
            return (Criteria) this;
        }

        public Criteria andPcsModifiederNotIn(List<String> values) {
            addCriterion("PCS_MODIFIEDER not in", values, "pcsModifieder");
            return (Criteria) this;
        }

        public Criteria andPcsModifiederBetween(String value1, String value2) {
            addCriterion("PCS_MODIFIEDER between", value1, value2, "pcsModifieder");
            return (Criteria) this;
        }

        public Criteria andPcsModifiederNotBetween(String value1, String value2) {
            addCriterion("PCS_MODIFIEDER not between", value1, value2, "pcsModifieder");
            return (Criteria) this;
        }

        public Criteria andPcsModifiedtimeIsNull() {
            addCriterion("PCS_MODIFIEDTIME is null");
            return (Criteria) this;
        }

        public Criteria andPcsModifiedtimeIsNotNull() {
            addCriterion("PCS_MODIFIEDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPcsModifiedtimeEqualTo(Date value) {
            addCriterion("PCS_MODIFIEDTIME =", value, "pcsModifiedtime");
            return (Criteria) this;
        }

        public Criteria andPcsModifiedtimeNotEqualTo(Date value) {
            addCriterion("PCS_MODIFIEDTIME <>", value, "pcsModifiedtime");
            return (Criteria) this;
        }

        public Criteria andPcsModifiedtimeGreaterThan(Date value) {
            addCriterion("PCS_MODIFIEDTIME >", value, "pcsModifiedtime");
            return (Criteria) this;
        }

        public Criteria andPcsModifiedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PCS_MODIFIEDTIME >=", value, "pcsModifiedtime");
            return (Criteria) this;
        }

        public Criteria andPcsModifiedtimeLessThan(Date value) {
            addCriterion("PCS_MODIFIEDTIME <", value, "pcsModifiedtime");
            return (Criteria) this;
        }

        public Criteria andPcsModifiedtimeLessThanOrEqualTo(Date value) {
            addCriterion("PCS_MODIFIEDTIME <=", value, "pcsModifiedtime");
            return (Criteria) this;
        }

        public Criteria andPcsModifiedtimeIn(List<Date> values) {
            addCriterion("PCS_MODIFIEDTIME in", values, "pcsModifiedtime");
            return (Criteria) this;
        }

        public Criteria andPcsModifiedtimeNotIn(List<Date> values) {
            addCriterion("PCS_MODIFIEDTIME not in", values, "pcsModifiedtime");
            return (Criteria) this;
        }

        public Criteria andPcsModifiedtimeBetween(Date value1, Date value2) {
            addCriterion("PCS_MODIFIEDTIME between", value1, value2, "pcsModifiedtime");
            return (Criteria) this;
        }

        public Criteria andPcsModifiedtimeNotBetween(Date value1, Date value2) {
            addCriterion("PCS_MODIFIEDTIME not between", value1, value2, "pcsModifiedtime");
            return (Criteria) this;
        }

        public Criteria andPcsStatusIsNull() {
            addCriterion("PCS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPcsStatusIsNotNull() {
            addCriterion("PCS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPcsStatusEqualTo(BigDecimal value) {
            addCriterion("PCS_STATUS =", value, "pcsStatus");
            return (Criteria) this;
        }

        public Criteria andPcsStatusNotEqualTo(BigDecimal value) {
            addCriterion("PCS_STATUS <>", value, "pcsStatus");
            return (Criteria) this;
        }

        public Criteria andPcsStatusGreaterThan(BigDecimal value) {
            addCriterion("PCS_STATUS >", value, "pcsStatus");
            return (Criteria) this;
        }

        public Criteria andPcsStatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PCS_STATUS >=", value, "pcsStatus");
            return (Criteria) this;
        }

        public Criteria andPcsStatusLessThan(BigDecimal value) {
            addCriterion("PCS_STATUS <", value, "pcsStatus");
            return (Criteria) this;
        }

        public Criteria andPcsStatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PCS_STATUS <=", value, "pcsStatus");
            return (Criteria) this;
        }

        public Criteria andPcsStatusIn(List<BigDecimal> values) {
            addCriterion("PCS_STATUS in", values, "pcsStatus");
            return (Criteria) this;
        }

        public Criteria andPcsStatusNotIn(List<BigDecimal> values) {
            addCriterion("PCS_STATUS not in", values, "pcsStatus");
            return (Criteria) this;
        }

        public Criteria andPcsStatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PCS_STATUS between", value1, value2, "pcsStatus");
            return (Criteria) this;
        }

        public Criteria andPcsStatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PCS_STATUS not between", value1, value2, "pcsStatus");
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