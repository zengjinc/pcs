package com.ssm.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PcsConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PcsConfigExample() {
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

        public Criteria andPcsGroupIsNull() {
            addCriterion("PCS_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andPcsGroupIsNotNull() {
            addCriterion("PCS_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andPcsGroupEqualTo(String value) {
            addCriterion("PCS_GROUP =", value, "pcsGroup");
            return (Criteria) this;
        }

        public Criteria andPcsGroupNotEqualTo(String value) {
            addCriterion("PCS_GROUP <>", value, "pcsGroup");
            return (Criteria) this;
        }

        public Criteria andPcsGroupGreaterThan(String value) {
            addCriterion("PCS_GROUP >", value, "pcsGroup");
            return (Criteria) this;
        }

        public Criteria andPcsGroupGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_GROUP >=", value, "pcsGroup");
            return (Criteria) this;
        }

        public Criteria andPcsGroupLessThan(String value) {
            addCriterion("PCS_GROUP <", value, "pcsGroup");
            return (Criteria) this;
        }

        public Criteria andPcsGroupLessThanOrEqualTo(String value) {
            addCriterion("PCS_GROUP <=", value, "pcsGroup");
            return (Criteria) this;
        }

        public Criteria andPcsGroupLike(String value) {
            addCriterion("PCS_GROUP like", value, "pcsGroup");
            return (Criteria) this;
        }

        public Criteria andPcsGroupNotLike(String value) {
            addCriterion("PCS_GROUP not like", value, "pcsGroup");
            return (Criteria) this;
        }

        public Criteria andPcsGroupIn(List<String> values) {
            addCriterion("PCS_GROUP in", values, "pcsGroup");
            return (Criteria) this;
        }

        public Criteria andPcsGroupNotIn(List<String> values) {
            addCriterion("PCS_GROUP not in", values, "pcsGroup");
            return (Criteria) this;
        }

        public Criteria andPcsGroupBetween(String value1, String value2) {
            addCriterion("PCS_GROUP between", value1, value2, "pcsGroup");
            return (Criteria) this;
        }

        public Criteria andPcsGroupNotBetween(String value1, String value2) {
            addCriterion("PCS_GROUP not between", value1, value2, "pcsGroup");
            return (Criteria) this;
        }

        public Criteria andPcsKeyIsNull() {
            addCriterion("PCS_KEY is null");
            return (Criteria) this;
        }

        public Criteria andPcsKeyIsNotNull() {
            addCriterion("PCS_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andPcsKeyEqualTo(String value) {
            addCriterion("PCS_KEY =", value, "pcsKey");
            return (Criteria) this;
        }

        public Criteria andPcsKeyNotEqualTo(String value) {
            addCriterion("PCS_KEY <>", value, "pcsKey");
            return (Criteria) this;
        }

        public Criteria andPcsKeyGreaterThan(String value) {
            addCriterion("PCS_KEY >", value, "pcsKey");
            return (Criteria) this;
        }

        public Criteria andPcsKeyGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_KEY >=", value, "pcsKey");
            return (Criteria) this;
        }

        public Criteria andPcsKeyLessThan(String value) {
            addCriterion("PCS_KEY <", value, "pcsKey");
            return (Criteria) this;
        }

        public Criteria andPcsKeyLessThanOrEqualTo(String value) {
            addCriterion("PCS_KEY <=", value, "pcsKey");
            return (Criteria) this;
        }

        public Criteria andPcsKeyLike(String value) {
            addCriterion("PCS_KEY like", value, "pcsKey");
            return (Criteria) this;
        }

        public Criteria andPcsKeyNotLike(String value) {
            addCriterion("PCS_KEY not like", value, "pcsKey");
            return (Criteria) this;
        }

        public Criteria andPcsKeyIn(List<String> values) {
            addCriterion("PCS_KEY in", values, "pcsKey");
            return (Criteria) this;
        }

        public Criteria andPcsKeyNotIn(List<String> values) {
            addCriterion("PCS_KEY not in", values, "pcsKey");
            return (Criteria) this;
        }

        public Criteria andPcsKeyBetween(String value1, String value2) {
            addCriterion("PCS_KEY between", value1, value2, "pcsKey");
            return (Criteria) this;
        }

        public Criteria andPcsKeyNotBetween(String value1, String value2) {
            addCriterion("PCS_KEY not between", value1, value2, "pcsKey");
            return (Criteria) this;
        }

        public Criteria andPcsValueIsNull() {
            addCriterion("PCS_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andPcsValueIsNotNull() {
            addCriterion("PCS_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andPcsValueEqualTo(String value) {
            addCriterion("PCS_VALUE =", value, "pcsValue");
            return (Criteria) this;
        }

        public Criteria andPcsValueNotEqualTo(String value) {
            addCriterion("PCS_VALUE <>", value, "pcsValue");
            return (Criteria) this;
        }

        public Criteria andPcsValueGreaterThan(String value) {
            addCriterion("PCS_VALUE >", value, "pcsValue");
            return (Criteria) this;
        }

        public Criteria andPcsValueGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_VALUE >=", value, "pcsValue");
            return (Criteria) this;
        }

        public Criteria andPcsValueLessThan(String value) {
            addCriterion("PCS_VALUE <", value, "pcsValue");
            return (Criteria) this;
        }

        public Criteria andPcsValueLessThanOrEqualTo(String value) {
            addCriterion("PCS_VALUE <=", value, "pcsValue");
            return (Criteria) this;
        }

        public Criteria andPcsValueLike(String value) {
            addCriterion("PCS_VALUE like", value, "pcsValue");
            return (Criteria) this;
        }

        public Criteria andPcsValueNotLike(String value) {
            addCriterion("PCS_VALUE not like", value, "pcsValue");
            return (Criteria) this;
        }

        public Criteria andPcsValueIn(List<String> values) {
            addCriterion("PCS_VALUE in", values, "pcsValue");
            return (Criteria) this;
        }

        public Criteria andPcsValueNotIn(List<String> values) {
            addCriterion("PCS_VALUE not in", values, "pcsValue");
            return (Criteria) this;
        }

        public Criteria andPcsValueBetween(String value1, String value2) {
            addCriterion("PCS_VALUE between", value1, value2, "pcsValue");
            return (Criteria) this;
        }

        public Criteria andPcsValueNotBetween(String value1, String value2) {
            addCriterion("PCS_VALUE not between", value1, value2, "pcsValue");
            return (Criteria) this;
        }

        public Criteria andPcsDescriptionIsNull() {
            addCriterion("PCS_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andPcsDescriptionIsNotNull() {
            addCriterion("PCS_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andPcsDescriptionEqualTo(String value) {
            addCriterion("PCS_DESCRIPTION =", value, "pcsDescription");
            return (Criteria) this;
        }

        public Criteria andPcsDescriptionNotEqualTo(String value) {
            addCriterion("PCS_DESCRIPTION <>", value, "pcsDescription");
            return (Criteria) this;
        }

        public Criteria andPcsDescriptionGreaterThan(String value) {
            addCriterion("PCS_DESCRIPTION >", value, "pcsDescription");
            return (Criteria) this;
        }

        public Criteria andPcsDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_DESCRIPTION >=", value, "pcsDescription");
            return (Criteria) this;
        }

        public Criteria andPcsDescriptionLessThan(String value) {
            addCriterion("PCS_DESCRIPTION <", value, "pcsDescription");
            return (Criteria) this;
        }

        public Criteria andPcsDescriptionLessThanOrEqualTo(String value) {
            addCriterion("PCS_DESCRIPTION <=", value, "pcsDescription");
            return (Criteria) this;
        }

        public Criteria andPcsDescriptionLike(String value) {
            addCriterion("PCS_DESCRIPTION like", value, "pcsDescription");
            return (Criteria) this;
        }

        public Criteria andPcsDescriptionNotLike(String value) {
            addCriterion("PCS_DESCRIPTION not like", value, "pcsDescription");
            return (Criteria) this;
        }

        public Criteria andPcsDescriptionIn(List<String> values) {
            addCriterion("PCS_DESCRIPTION in", values, "pcsDescription");
            return (Criteria) this;
        }

        public Criteria andPcsDescriptionNotIn(List<String> values) {
            addCriterion("PCS_DESCRIPTION not in", values, "pcsDescription");
            return (Criteria) this;
        }

        public Criteria andPcsDescriptionBetween(String value1, String value2) {
            addCriterion("PCS_DESCRIPTION between", value1, value2, "pcsDescription");
            return (Criteria) this;
        }

        public Criteria andPcsDescriptionNotBetween(String value1, String value2) {
            addCriterion("PCS_DESCRIPTION not between", value1, value2, "pcsDescription");
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