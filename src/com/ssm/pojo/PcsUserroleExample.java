package com.ssm.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PcsUserroleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PcsUserroleExample() {
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

        public Criteria andPcsUseruuidIsNull() {
            addCriterion("PCS_USERUUID is null");
            return (Criteria) this;
        }

        public Criteria andPcsUseruuidIsNotNull() {
            addCriterion("PCS_USERUUID is not null");
            return (Criteria) this;
        }

        public Criteria andPcsUseruuidEqualTo(String value) {
            addCriterion("PCS_USERUUID =", value, "pcsUseruuid");
            return (Criteria) this;
        }

        public Criteria andPcsUseruuidNotEqualTo(String value) {
            addCriterion("PCS_USERUUID <>", value, "pcsUseruuid");
            return (Criteria) this;
        }

        public Criteria andPcsUseruuidGreaterThan(String value) {
            addCriterion("PCS_USERUUID >", value, "pcsUseruuid");
            return (Criteria) this;
        }

        public Criteria andPcsUseruuidGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_USERUUID >=", value, "pcsUseruuid");
            return (Criteria) this;
        }

        public Criteria andPcsUseruuidLessThan(String value) {
            addCriterion("PCS_USERUUID <", value, "pcsUseruuid");
            return (Criteria) this;
        }

        public Criteria andPcsUseruuidLessThanOrEqualTo(String value) {
            addCriterion("PCS_USERUUID <=", value, "pcsUseruuid");
            return (Criteria) this;
        }

        public Criteria andPcsUseruuidLike(String value) {
            addCriterion("PCS_USERUUID like", value, "pcsUseruuid");
            return (Criteria) this;
        }

        public Criteria andPcsUseruuidNotLike(String value) {
            addCriterion("PCS_USERUUID not like", value, "pcsUseruuid");
            return (Criteria) this;
        }

        public Criteria andPcsUseruuidIn(List<String> values) {
            addCriterion("PCS_USERUUID in", values, "pcsUseruuid");
            return (Criteria) this;
        }

        public Criteria andPcsUseruuidNotIn(List<String> values) {
            addCriterion("PCS_USERUUID not in", values, "pcsUseruuid");
            return (Criteria) this;
        }

        public Criteria andPcsUseruuidBetween(String value1, String value2) {
            addCriterion("PCS_USERUUID between", value1, value2, "pcsUseruuid");
            return (Criteria) this;
        }

        public Criteria andPcsUseruuidNotBetween(String value1, String value2) {
            addCriterion("PCS_USERUUID not between", value1, value2, "pcsUseruuid");
            return (Criteria) this;
        }

        public Criteria andPcsRoleIsNull() {
            addCriterion("PCS_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andPcsRoleIsNotNull() {
            addCriterion("PCS_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andPcsRoleEqualTo(String value) {
            addCriterion("PCS_ROLE =", value, "pcsRole");
            return (Criteria) this;
        }

        public Criteria andPcsRoleNotEqualTo(String value) {
            addCriterion("PCS_ROLE <>", value, "pcsRole");
            return (Criteria) this;
        }

        public Criteria andPcsRoleGreaterThan(String value) {
            addCriterion("PCS_ROLE >", value, "pcsRole");
            return (Criteria) this;
        }

        public Criteria andPcsRoleGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_ROLE >=", value, "pcsRole");
            return (Criteria) this;
        }

        public Criteria andPcsRoleLessThan(String value) {
            addCriterion("PCS_ROLE <", value, "pcsRole");
            return (Criteria) this;
        }

        public Criteria andPcsRoleLessThanOrEqualTo(String value) {
            addCriterion("PCS_ROLE <=", value, "pcsRole");
            return (Criteria) this;
        }

        public Criteria andPcsRoleLike(String value) {
            addCriterion("PCS_ROLE like", value, "pcsRole");
            return (Criteria) this;
        }

        public Criteria andPcsRoleNotLike(String value) {
            addCriterion("PCS_ROLE not like", value, "pcsRole");
            return (Criteria) this;
        }

        public Criteria andPcsRoleIn(List<String> values) {
            addCriterion("PCS_ROLE in", values, "pcsRole");
            return (Criteria) this;
        }

        public Criteria andPcsRoleNotIn(List<String> values) {
            addCriterion("PCS_ROLE not in", values, "pcsRole");
            return (Criteria) this;
        }

        public Criteria andPcsRoleBetween(String value1, String value2) {
            addCriterion("PCS_ROLE between", value1, value2, "pcsRole");
            return (Criteria) this;
        }

        public Criteria andPcsRoleNotBetween(String value1, String value2) {
            addCriterion("PCS_ROLE not between", value1, value2, "pcsRole");
            return (Criteria) this;
        }

        public Criteria andPcsRealmIsNull() {
            addCriterion("PCS_REALM is null");
            return (Criteria) this;
        }

        public Criteria andPcsRealmIsNotNull() {
            addCriterion("PCS_REALM is not null");
            return (Criteria) this;
        }

        public Criteria andPcsRealmEqualTo(String value) {
            addCriterion("PCS_REALM =", value, "pcsRealm");
            return (Criteria) this;
        }

        public Criteria andPcsRealmNotEqualTo(String value) {
            addCriterion("PCS_REALM <>", value, "pcsRealm");
            return (Criteria) this;
        }

        public Criteria andPcsRealmGreaterThan(String value) {
            addCriterion("PCS_REALM >", value, "pcsRealm");
            return (Criteria) this;
        }

        public Criteria andPcsRealmGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_REALM >=", value, "pcsRealm");
            return (Criteria) this;
        }

        public Criteria andPcsRealmLessThan(String value) {
            addCriterion("PCS_REALM <", value, "pcsRealm");
            return (Criteria) this;
        }

        public Criteria andPcsRealmLessThanOrEqualTo(String value) {
            addCriterion("PCS_REALM <=", value, "pcsRealm");
            return (Criteria) this;
        }

        public Criteria andPcsRealmLike(String value) {
            addCriterion("PCS_REALM like", value, "pcsRealm");
            return (Criteria) this;
        }

        public Criteria andPcsRealmNotLike(String value) {
            addCriterion("PCS_REALM not like", value, "pcsRealm");
            return (Criteria) this;
        }

        public Criteria andPcsRealmIn(List<String> values) {
            addCriterion("PCS_REALM in", values, "pcsRealm");
            return (Criteria) this;
        }

        public Criteria andPcsRealmNotIn(List<String> values) {
            addCriterion("PCS_REALM not in", values, "pcsRealm");
            return (Criteria) this;
        }

        public Criteria andPcsRealmBetween(String value1, String value2) {
            addCriterion("PCS_REALM between", value1, value2, "pcsRealm");
            return (Criteria) this;
        }

        public Criteria andPcsRealmNotBetween(String value1, String value2) {
            addCriterion("PCS_REALM not between", value1, value2, "pcsRealm");
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