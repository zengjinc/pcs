package com.ssm.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PcsTestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PcsTestExample() {
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

        public Criteria andPcsBelongUuidIsNull() {
            addCriterion("PCS_BELONG_UUID is null");
            return (Criteria) this;
        }

        public Criteria andPcsBelongUuidIsNotNull() {
            addCriterion("PCS_BELONG_UUID is not null");
            return (Criteria) this;
        }

        public Criteria andPcsBelongUuidEqualTo(String value) {
            addCriterion("PCS_BELONG_UUID =", value, "pcsBelongUuid");
            return (Criteria) this;
        }

        public Criteria andPcsBelongUuidNotEqualTo(String value) {
            addCriterion("PCS_BELONG_UUID <>", value, "pcsBelongUuid");
            return (Criteria) this;
        }

        public Criteria andPcsBelongUuidGreaterThan(String value) {
            addCriterion("PCS_BELONG_UUID >", value, "pcsBelongUuid");
            return (Criteria) this;
        }

        public Criteria andPcsBelongUuidGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_BELONG_UUID >=", value, "pcsBelongUuid");
            return (Criteria) this;
        }

        public Criteria andPcsBelongUuidLessThan(String value) {
            addCriterion("PCS_BELONG_UUID <", value, "pcsBelongUuid");
            return (Criteria) this;
        }

        public Criteria andPcsBelongUuidLessThanOrEqualTo(String value) {
            addCriterion("PCS_BELONG_UUID <=", value, "pcsBelongUuid");
            return (Criteria) this;
        }

        public Criteria andPcsBelongUuidLike(String value) {
            addCriterion("PCS_BELONG_UUID like", value, "pcsBelongUuid");
            return (Criteria) this;
        }

        public Criteria andPcsBelongUuidNotLike(String value) {
            addCriterion("PCS_BELONG_UUID not like", value, "pcsBelongUuid");
            return (Criteria) this;
        }

        public Criteria andPcsBelongUuidIn(List<String> values) {
            addCriterion("PCS_BELONG_UUID in", values, "pcsBelongUuid");
            return (Criteria) this;
        }

        public Criteria andPcsBelongUuidNotIn(List<String> values) {
            addCriterion("PCS_BELONG_UUID not in", values, "pcsBelongUuid");
            return (Criteria) this;
        }

        public Criteria andPcsBelongUuidBetween(String value1, String value2) {
            addCriterion("PCS_BELONG_UUID between", value1, value2, "pcsBelongUuid");
            return (Criteria) this;
        }

        public Criteria andPcsBelongUuidNotBetween(String value1, String value2) {
            addCriterion("PCS_BELONG_UUID not between", value1, value2, "pcsBelongUuid");
            return (Criteria) this;
        }

        public Criteria andPcsAtt1IsNull() {
            addCriterion("PCS_ATT1 is null");
            return (Criteria) this;
        }

        public Criteria andPcsAtt1IsNotNull() {
            addCriterion("PCS_ATT1 is not null");
            return (Criteria) this;
        }

        public Criteria andPcsAtt1EqualTo(String value) {
            addCriterion("PCS_ATT1 =", value, "pcsAtt1");
            return (Criteria) this;
        }

        public Criteria andPcsAtt1NotEqualTo(String value) {
            addCriterion("PCS_ATT1 <>", value, "pcsAtt1");
            return (Criteria) this;
        }

        public Criteria andPcsAtt1GreaterThan(String value) {
            addCriterion("PCS_ATT1 >", value, "pcsAtt1");
            return (Criteria) this;
        }

        public Criteria andPcsAtt1GreaterThanOrEqualTo(String value) {
            addCriterion("PCS_ATT1 >=", value, "pcsAtt1");
            return (Criteria) this;
        }

        public Criteria andPcsAtt1LessThan(String value) {
            addCriterion("PCS_ATT1 <", value, "pcsAtt1");
            return (Criteria) this;
        }

        public Criteria andPcsAtt1LessThanOrEqualTo(String value) {
            addCriterion("PCS_ATT1 <=", value, "pcsAtt1");
            return (Criteria) this;
        }

        public Criteria andPcsAtt1Like(String value) {
            addCriterion("PCS_ATT1 like", value, "pcsAtt1");
            return (Criteria) this;
        }

        public Criteria andPcsAtt1NotLike(String value) {
            addCriterion("PCS_ATT1 not like", value, "pcsAtt1");
            return (Criteria) this;
        }

        public Criteria andPcsAtt1In(List<String> values) {
            addCriterion("PCS_ATT1 in", values, "pcsAtt1");
            return (Criteria) this;
        }

        public Criteria andPcsAtt1NotIn(List<String> values) {
            addCriterion("PCS_ATT1 not in", values, "pcsAtt1");
            return (Criteria) this;
        }

        public Criteria andPcsAtt1Between(String value1, String value2) {
            addCriterion("PCS_ATT1 between", value1, value2, "pcsAtt1");
            return (Criteria) this;
        }

        public Criteria andPcsAtt1NotBetween(String value1, String value2) {
            addCriterion("PCS_ATT1 not between", value1, value2, "pcsAtt1");
            return (Criteria) this;
        }

        public Criteria andPcsAtt2IsNull() {
            addCriterion("PCS_ATT2 is null");
            return (Criteria) this;
        }

        public Criteria andPcsAtt2IsNotNull() {
            addCriterion("PCS_ATT2 is not null");
            return (Criteria) this;
        }

        public Criteria andPcsAtt2EqualTo(String value) {
            addCriterion("PCS_ATT2 =", value, "pcsAtt2");
            return (Criteria) this;
        }

        public Criteria andPcsAtt2NotEqualTo(String value) {
            addCriterion("PCS_ATT2 <>", value, "pcsAtt2");
            return (Criteria) this;
        }

        public Criteria andPcsAtt2GreaterThan(String value) {
            addCriterion("PCS_ATT2 >", value, "pcsAtt2");
            return (Criteria) this;
        }

        public Criteria andPcsAtt2GreaterThanOrEqualTo(String value) {
            addCriterion("PCS_ATT2 >=", value, "pcsAtt2");
            return (Criteria) this;
        }

        public Criteria andPcsAtt2LessThan(String value) {
            addCriterion("PCS_ATT2 <", value, "pcsAtt2");
            return (Criteria) this;
        }

        public Criteria andPcsAtt2LessThanOrEqualTo(String value) {
            addCriterion("PCS_ATT2 <=", value, "pcsAtt2");
            return (Criteria) this;
        }

        public Criteria andPcsAtt2Like(String value) {
            addCriterion("PCS_ATT2 like", value, "pcsAtt2");
            return (Criteria) this;
        }

        public Criteria andPcsAtt2NotLike(String value) {
            addCriterion("PCS_ATT2 not like", value, "pcsAtt2");
            return (Criteria) this;
        }

        public Criteria andPcsAtt2In(List<String> values) {
            addCriterion("PCS_ATT2 in", values, "pcsAtt2");
            return (Criteria) this;
        }

        public Criteria andPcsAtt2NotIn(List<String> values) {
            addCriterion("PCS_ATT2 not in", values, "pcsAtt2");
            return (Criteria) this;
        }

        public Criteria andPcsAtt2Between(String value1, String value2) {
            addCriterion("PCS_ATT2 between", value1, value2, "pcsAtt2");
            return (Criteria) this;
        }

        public Criteria andPcsAtt2NotBetween(String value1, String value2) {
            addCriterion("PCS_ATT2 not between", value1, value2, "pcsAtt2");
            return (Criteria) this;
        }

        public Criteria andPcsAtt3IsNull() {
            addCriterion("PCS_ATT3 is null");
            return (Criteria) this;
        }

        public Criteria andPcsAtt3IsNotNull() {
            addCriterion("PCS_ATT3 is not null");
            return (Criteria) this;
        }

        public Criteria andPcsAtt3EqualTo(String value) {
            addCriterion("PCS_ATT3 =", value, "pcsAtt3");
            return (Criteria) this;
        }

        public Criteria andPcsAtt3NotEqualTo(String value) {
            addCriterion("PCS_ATT3 <>", value, "pcsAtt3");
            return (Criteria) this;
        }

        public Criteria andPcsAtt3GreaterThan(String value) {
            addCriterion("PCS_ATT3 >", value, "pcsAtt3");
            return (Criteria) this;
        }

        public Criteria andPcsAtt3GreaterThanOrEqualTo(String value) {
            addCriterion("PCS_ATT3 >=", value, "pcsAtt3");
            return (Criteria) this;
        }

        public Criteria andPcsAtt3LessThan(String value) {
            addCriterion("PCS_ATT3 <", value, "pcsAtt3");
            return (Criteria) this;
        }

        public Criteria andPcsAtt3LessThanOrEqualTo(String value) {
            addCriterion("PCS_ATT3 <=", value, "pcsAtt3");
            return (Criteria) this;
        }

        public Criteria andPcsAtt3Like(String value) {
            addCriterion("PCS_ATT3 like", value, "pcsAtt3");
            return (Criteria) this;
        }

        public Criteria andPcsAtt3NotLike(String value) {
            addCriterion("PCS_ATT3 not like", value, "pcsAtt3");
            return (Criteria) this;
        }

        public Criteria andPcsAtt3In(List<String> values) {
            addCriterion("PCS_ATT3 in", values, "pcsAtt3");
            return (Criteria) this;
        }

        public Criteria andPcsAtt3NotIn(List<String> values) {
            addCriterion("PCS_ATT3 not in", values, "pcsAtt3");
            return (Criteria) this;
        }

        public Criteria andPcsAtt3Between(String value1, String value2) {
            addCriterion("PCS_ATT3 between", value1, value2, "pcsAtt3");
            return (Criteria) this;
        }

        public Criteria andPcsAtt3NotBetween(String value1, String value2) {
            addCriterion("PCS_ATT3 not between", value1, value2, "pcsAtt3");
            return (Criteria) this;
        }

        public Criteria andPcsAtt4IsNull() {
            addCriterion("PCS_ATT4 is null");
            return (Criteria) this;
        }

        public Criteria andPcsAtt4IsNotNull() {
            addCriterion("PCS_ATT4 is not null");
            return (Criteria) this;
        }

        public Criteria andPcsAtt4EqualTo(String value) {
            addCriterion("PCS_ATT4 =", value, "pcsAtt4");
            return (Criteria) this;
        }

        public Criteria andPcsAtt4NotEqualTo(String value) {
            addCriterion("PCS_ATT4 <>", value, "pcsAtt4");
            return (Criteria) this;
        }

        public Criteria andPcsAtt4GreaterThan(String value) {
            addCriterion("PCS_ATT4 >", value, "pcsAtt4");
            return (Criteria) this;
        }

        public Criteria andPcsAtt4GreaterThanOrEqualTo(String value) {
            addCriterion("PCS_ATT4 >=", value, "pcsAtt4");
            return (Criteria) this;
        }

        public Criteria andPcsAtt4LessThan(String value) {
            addCriterion("PCS_ATT4 <", value, "pcsAtt4");
            return (Criteria) this;
        }

        public Criteria andPcsAtt4LessThanOrEqualTo(String value) {
            addCriterion("PCS_ATT4 <=", value, "pcsAtt4");
            return (Criteria) this;
        }

        public Criteria andPcsAtt4Like(String value) {
            addCriterion("PCS_ATT4 like", value, "pcsAtt4");
            return (Criteria) this;
        }

        public Criteria andPcsAtt4NotLike(String value) {
            addCriterion("PCS_ATT4 not like", value, "pcsAtt4");
            return (Criteria) this;
        }

        public Criteria andPcsAtt4In(List<String> values) {
            addCriterion("PCS_ATT4 in", values, "pcsAtt4");
            return (Criteria) this;
        }

        public Criteria andPcsAtt4NotIn(List<String> values) {
            addCriterion("PCS_ATT4 not in", values, "pcsAtt4");
            return (Criteria) this;
        }

        public Criteria andPcsAtt4Between(String value1, String value2) {
            addCriterion("PCS_ATT4 between", value1, value2, "pcsAtt4");
            return (Criteria) this;
        }

        public Criteria andPcsAtt4NotBetween(String value1, String value2) {
            addCriterion("PCS_ATT4 not between", value1, value2, "pcsAtt4");
            return (Criteria) this;
        }

        public Criteria andPcsAtt5IsNull() {
            addCriterion("PCS_ATT5 is null");
            return (Criteria) this;
        }

        public Criteria andPcsAtt5IsNotNull() {
            addCriterion("PCS_ATT5 is not null");
            return (Criteria) this;
        }

        public Criteria andPcsAtt5EqualTo(String value) {
            addCriterion("PCS_ATT5 =", value, "pcsAtt5");
            return (Criteria) this;
        }

        public Criteria andPcsAtt5NotEqualTo(String value) {
            addCriterion("PCS_ATT5 <>", value, "pcsAtt5");
            return (Criteria) this;
        }

        public Criteria andPcsAtt5GreaterThan(String value) {
            addCriterion("PCS_ATT5 >", value, "pcsAtt5");
            return (Criteria) this;
        }

        public Criteria andPcsAtt5GreaterThanOrEqualTo(String value) {
            addCriterion("PCS_ATT5 >=", value, "pcsAtt5");
            return (Criteria) this;
        }

        public Criteria andPcsAtt5LessThan(String value) {
            addCriterion("PCS_ATT5 <", value, "pcsAtt5");
            return (Criteria) this;
        }

        public Criteria andPcsAtt5LessThanOrEqualTo(String value) {
            addCriterion("PCS_ATT5 <=", value, "pcsAtt5");
            return (Criteria) this;
        }

        public Criteria andPcsAtt5Like(String value) {
            addCriterion("PCS_ATT5 like", value, "pcsAtt5");
            return (Criteria) this;
        }

        public Criteria andPcsAtt5NotLike(String value) {
            addCriterion("PCS_ATT5 not like", value, "pcsAtt5");
            return (Criteria) this;
        }

        public Criteria andPcsAtt5In(List<String> values) {
            addCriterion("PCS_ATT5 in", values, "pcsAtt5");
            return (Criteria) this;
        }

        public Criteria andPcsAtt5NotIn(List<String> values) {
            addCriterion("PCS_ATT5 not in", values, "pcsAtt5");
            return (Criteria) this;
        }

        public Criteria andPcsAtt5Between(String value1, String value2) {
            addCriterion("PCS_ATT5 between", value1, value2, "pcsAtt5");
            return (Criteria) this;
        }

        public Criteria andPcsAtt5NotBetween(String value1, String value2) {
            addCriterion("PCS_ATT5 not between", value1, value2, "pcsAtt5");
            return (Criteria) this;
        }

        public Criteria andPcsAtt6IsNull() {
            addCriterion("PCS_ATT6 is null");
            return (Criteria) this;
        }

        public Criteria andPcsAtt6IsNotNull() {
            addCriterion("PCS_ATT6 is not null");
            return (Criteria) this;
        }

        public Criteria andPcsAtt6EqualTo(String value) {
            addCriterion("PCS_ATT6 =", value, "pcsAtt6");
            return (Criteria) this;
        }

        public Criteria andPcsAtt6NotEqualTo(String value) {
            addCriterion("PCS_ATT6 <>", value, "pcsAtt6");
            return (Criteria) this;
        }

        public Criteria andPcsAtt6GreaterThan(String value) {
            addCriterion("PCS_ATT6 >", value, "pcsAtt6");
            return (Criteria) this;
        }

        public Criteria andPcsAtt6GreaterThanOrEqualTo(String value) {
            addCriterion("PCS_ATT6 >=", value, "pcsAtt6");
            return (Criteria) this;
        }

        public Criteria andPcsAtt6LessThan(String value) {
            addCriterion("PCS_ATT6 <", value, "pcsAtt6");
            return (Criteria) this;
        }

        public Criteria andPcsAtt6LessThanOrEqualTo(String value) {
            addCriterion("PCS_ATT6 <=", value, "pcsAtt6");
            return (Criteria) this;
        }

        public Criteria andPcsAtt6Like(String value) {
            addCriterion("PCS_ATT6 like", value, "pcsAtt6");
            return (Criteria) this;
        }

        public Criteria andPcsAtt6NotLike(String value) {
            addCriterion("PCS_ATT6 not like", value, "pcsAtt6");
            return (Criteria) this;
        }

        public Criteria andPcsAtt6In(List<String> values) {
            addCriterion("PCS_ATT6 in", values, "pcsAtt6");
            return (Criteria) this;
        }

        public Criteria andPcsAtt6NotIn(List<String> values) {
            addCriterion("PCS_ATT6 not in", values, "pcsAtt6");
            return (Criteria) this;
        }

        public Criteria andPcsAtt6Between(String value1, String value2) {
            addCriterion("PCS_ATT6 between", value1, value2, "pcsAtt6");
            return (Criteria) this;
        }

        public Criteria andPcsAtt6NotBetween(String value1, String value2) {
            addCriterion("PCS_ATT6 not between", value1, value2, "pcsAtt6");
            return (Criteria) this;
        }

        public Criteria andPcsAtt7IsNull() {
            addCriterion("PCS_ATT7 is null");
            return (Criteria) this;
        }

        public Criteria andPcsAtt7IsNotNull() {
            addCriterion("PCS_ATT7 is not null");
            return (Criteria) this;
        }

        public Criteria andPcsAtt7EqualTo(String value) {
            addCriterion("PCS_ATT7 =", value, "pcsAtt7");
            return (Criteria) this;
        }

        public Criteria andPcsAtt7NotEqualTo(String value) {
            addCriterion("PCS_ATT7 <>", value, "pcsAtt7");
            return (Criteria) this;
        }

        public Criteria andPcsAtt7GreaterThan(String value) {
            addCriterion("PCS_ATT7 >", value, "pcsAtt7");
            return (Criteria) this;
        }

        public Criteria andPcsAtt7GreaterThanOrEqualTo(String value) {
            addCriterion("PCS_ATT7 >=", value, "pcsAtt7");
            return (Criteria) this;
        }

        public Criteria andPcsAtt7LessThan(String value) {
            addCriterion("PCS_ATT7 <", value, "pcsAtt7");
            return (Criteria) this;
        }

        public Criteria andPcsAtt7LessThanOrEqualTo(String value) {
            addCriterion("PCS_ATT7 <=", value, "pcsAtt7");
            return (Criteria) this;
        }

        public Criteria andPcsAtt7Like(String value) {
            addCriterion("PCS_ATT7 like", value, "pcsAtt7");
            return (Criteria) this;
        }

        public Criteria andPcsAtt7NotLike(String value) {
            addCriterion("PCS_ATT7 not like", value, "pcsAtt7");
            return (Criteria) this;
        }

        public Criteria andPcsAtt7In(List<String> values) {
            addCriterion("PCS_ATT7 in", values, "pcsAtt7");
            return (Criteria) this;
        }

        public Criteria andPcsAtt7NotIn(List<String> values) {
            addCriterion("PCS_ATT7 not in", values, "pcsAtt7");
            return (Criteria) this;
        }

        public Criteria andPcsAtt7Between(String value1, String value2) {
            addCriterion("PCS_ATT7 between", value1, value2, "pcsAtt7");
            return (Criteria) this;
        }

        public Criteria andPcsAtt7NotBetween(String value1, String value2) {
            addCriterion("PCS_ATT7 not between", value1, value2, "pcsAtt7");
            return (Criteria) this;
        }

        public Criteria andPcsAtt8IsNull() {
            addCriterion("PCS_ATT8 is null");
            return (Criteria) this;
        }

        public Criteria andPcsAtt8IsNotNull() {
            addCriterion("PCS_ATT8 is not null");
            return (Criteria) this;
        }

        public Criteria andPcsAtt8EqualTo(String value) {
            addCriterion("PCS_ATT8 =", value, "pcsAtt8");
            return (Criteria) this;
        }

        public Criteria andPcsAtt8NotEqualTo(String value) {
            addCriterion("PCS_ATT8 <>", value, "pcsAtt8");
            return (Criteria) this;
        }

        public Criteria andPcsAtt8GreaterThan(String value) {
            addCriterion("PCS_ATT8 >", value, "pcsAtt8");
            return (Criteria) this;
        }

        public Criteria andPcsAtt8GreaterThanOrEqualTo(String value) {
            addCriterion("PCS_ATT8 >=", value, "pcsAtt8");
            return (Criteria) this;
        }

        public Criteria andPcsAtt8LessThan(String value) {
            addCriterion("PCS_ATT8 <", value, "pcsAtt8");
            return (Criteria) this;
        }

        public Criteria andPcsAtt8LessThanOrEqualTo(String value) {
            addCriterion("PCS_ATT8 <=", value, "pcsAtt8");
            return (Criteria) this;
        }

        public Criteria andPcsAtt8Like(String value) {
            addCriterion("PCS_ATT8 like", value, "pcsAtt8");
            return (Criteria) this;
        }

        public Criteria andPcsAtt8NotLike(String value) {
            addCriterion("PCS_ATT8 not like", value, "pcsAtt8");
            return (Criteria) this;
        }

        public Criteria andPcsAtt8In(List<String> values) {
            addCriterion("PCS_ATT8 in", values, "pcsAtt8");
            return (Criteria) this;
        }

        public Criteria andPcsAtt8NotIn(List<String> values) {
            addCriterion("PCS_ATT8 not in", values, "pcsAtt8");
            return (Criteria) this;
        }

        public Criteria andPcsAtt8Between(String value1, String value2) {
            addCriterion("PCS_ATT8 between", value1, value2, "pcsAtt8");
            return (Criteria) this;
        }

        public Criteria andPcsAtt8NotBetween(String value1, String value2) {
            addCriterion("PCS_ATT8 not between", value1, value2, "pcsAtt8");
            return (Criteria) this;
        }

        public Criteria andPcsAtt9IsNull() {
            addCriterion("PCS_ATT9 is null");
            return (Criteria) this;
        }

        public Criteria andPcsAtt9IsNotNull() {
            addCriterion("PCS_ATT9 is not null");
            return (Criteria) this;
        }

        public Criteria andPcsAtt9EqualTo(String value) {
            addCriterion("PCS_ATT9 =", value, "pcsAtt9");
            return (Criteria) this;
        }

        public Criteria andPcsAtt9NotEqualTo(String value) {
            addCriterion("PCS_ATT9 <>", value, "pcsAtt9");
            return (Criteria) this;
        }

        public Criteria andPcsAtt9GreaterThan(String value) {
            addCriterion("PCS_ATT9 >", value, "pcsAtt9");
            return (Criteria) this;
        }

        public Criteria andPcsAtt9GreaterThanOrEqualTo(String value) {
            addCriterion("PCS_ATT9 >=", value, "pcsAtt9");
            return (Criteria) this;
        }

        public Criteria andPcsAtt9LessThan(String value) {
            addCriterion("PCS_ATT9 <", value, "pcsAtt9");
            return (Criteria) this;
        }

        public Criteria andPcsAtt9LessThanOrEqualTo(String value) {
            addCriterion("PCS_ATT9 <=", value, "pcsAtt9");
            return (Criteria) this;
        }

        public Criteria andPcsAtt9Like(String value) {
            addCriterion("PCS_ATT9 like", value, "pcsAtt9");
            return (Criteria) this;
        }

        public Criteria andPcsAtt9NotLike(String value) {
            addCriterion("PCS_ATT9 not like", value, "pcsAtt9");
            return (Criteria) this;
        }

        public Criteria andPcsAtt9In(List<String> values) {
            addCriterion("PCS_ATT9 in", values, "pcsAtt9");
            return (Criteria) this;
        }

        public Criteria andPcsAtt9NotIn(List<String> values) {
            addCriterion("PCS_ATT9 not in", values, "pcsAtt9");
            return (Criteria) this;
        }

        public Criteria andPcsAtt9Between(String value1, String value2) {
            addCriterion("PCS_ATT9 between", value1, value2, "pcsAtt9");
            return (Criteria) this;
        }

        public Criteria andPcsAtt9NotBetween(String value1, String value2) {
            addCriterion("PCS_ATT9 not between", value1, value2, "pcsAtt9");
            return (Criteria) this;
        }

        public Criteria andPcsAtt10IsNull() {
            addCriterion("PCS_ATT10 is null");
            return (Criteria) this;
        }

        public Criteria andPcsAtt10IsNotNull() {
            addCriterion("PCS_ATT10 is not null");
            return (Criteria) this;
        }

        public Criteria andPcsAtt10EqualTo(String value) {
            addCriterion("PCS_ATT10 =", value, "pcsAtt10");
            return (Criteria) this;
        }

        public Criteria andPcsAtt10NotEqualTo(String value) {
            addCriterion("PCS_ATT10 <>", value, "pcsAtt10");
            return (Criteria) this;
        }

        public Criteria andPcsAtt10GreaterThan(String value) {
            addCriterion("PCS_ATT10 >", value, "pcsAtt10");
            return (Criteria) this;
        }

        public Criteria andPcsAtt10GreaterThanOrEqualTo(String value) {
            addCriterion("PCS_ATT10 >=", value, "pcsAtt10");
            return (Criteria) this;
        }

        public Criteria andPcsAtt10LessThan(String value) {
            addCriterion("PCS_ATT10 <", value, "pcsAtt10");
            return (Criteria) this;
        }

        public Criteria andPcsAtt10LessThanOrEqualTo(String value) {
            addCriterion("PCS_ATT10 <=", value, "pcsAtt10");
            return (Criteria) this;
        }

        public Criteria andPcsAtt10Like(String value) {
            addCriterion("PCS_ATT10 like", value, "pcsAtt10");
            return (Criteria) this;
        }

        public Criteria andPcsAtt10NotLike(String value) {
            addCriterion("PCS_ATT10 not like", value, "pcsAtt10");
            return (Criteria) this;
        }

        public Criteria andPcsAtt10In(List<String> values) {
            addCriterion("PCS_ATT10 in", values, "pcsAtt10");
            return (Criteria) this;
        }

        public Criteria andPcsAtt10NotIn(List<String> values) {
            addCriterion("PCS_ATT10 not in", values, "pcsAtt10");
            return (Criteria) this;
        }

        public Criteria andPcsAtt10Between(String value1, String value2) {
            addCriterion("PCS_ATT10 between", value1, value2, "pcsAtt10");
            return (Criteria) this;
        }

        public Criteria andPcsAtt10NotBetween(String value1, String value2) {
            addCriterion("PCS_ATT10 not between", value1, value2, "pcsAtt10");
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