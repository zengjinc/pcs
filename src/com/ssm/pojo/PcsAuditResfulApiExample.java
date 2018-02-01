package com.ssm.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PcsAuditResfulApiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PcsAuditResfulApiExample() {
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

        public Criteria andPcsCodeIsNull() {
            addCriterion("PCS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPcsCodeIsNotNull() {
            addCriterion("PCS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPcsCodeEqualTo(String value) {
            addCriterion("PCS_CODE =", value, "pcsCode");
            return (Criteria) this;
        }

        public Criteria andPcsCodeNotEqualTo(String value) {
            addCriterion("PCS_CODE <>", value, "pcsCode");
            return (Criteria) this;
        }

        public Criteria andPcsCodeGreaterThan(String value) {
            addCriterion("PCS_CODE >", value, "pcsCode");
            return (Criteria) this;
        }

        public Criteria andPcsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_CODE >=", value, "pcsCode");
            return (Criteria) this;
        }

        public Criteria andPcsCodeLessThan(String value) {
            addCriterion("PCS_CODE <", value, "pcsCode");
            return (Criteria) this;
        }

        public Criteria andPcsCodeLessThanOrEqualTo(String value) {
            addCriterion("PCS_CODE <=", value, "pcsCode");
            return (Criteria) this;
        }

        public Criteria andPcsCodeLike(String value) {
            addCriterion("PCS_CODE like", value, "pcsCode");
            return (Criteria) this;
        }

        public Criteria andPcsCodeNotLike(String value) {
            addCriterion("PCS_CODE not like", value, "pcsCode");
            return (Criteria) this;
        }

        public Criteria andPcsCodeIn(List<String> values) {
            addCriterion("PCS_CODE in", values, "pcsCode");
            return (Criteria) this;
        }

        public Criteria andPcsCodeNotIn(List<String> values) {
            addCriterion("PCS_CODE not in", values, "pcsCode");
            return (Criteria) this;
        }

        public Criteria andPcsCodeBetween(String value1, String value2) {
            addCriterion("PCS_CODE between", value1, value2, "pcsCode");
            return (Criteria) this;
        }

        public Criteria andPcsCodeNotBetween(String value1, String value2) {
            addCriterion("PCS_CODE not between", value1, value2, "pcsCode");
            return (Criteria) this;
        }

        public Criteria andPcsContextIsNull() {
            addCriterion("PCS_CONTEXT is null");
            return (Criteria) this;
        }

        public Criteria andPcsContextIsNotNull() {
            addCriterion("PCS_CONTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andPcsContextEqualTo(String value) {
            addCriterion("PCS_CONTEXT =", value, "pcsContext");
            return (Criteria) this;
        }

        public Criteria andPcsContextNotEqualTo(String value) {
            addCriterion("PCS_CONTEXT <>", value, "pcsContext");
            return (Criteria) this;
        }

        public Criteria andPcsContextGreaterThan(String value) {
            addCriterion("PCS_CONTEXT >", value, "pcsContext");
            return (Criteria) this;
        }

        public Criteria andPcsContextGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_CONTEXT >=", value, "pcsContext");
            return (Criteria) this;
        }

        public Criteria andPcsContextLessThan(String value) {
            addCriterion("PCS_CONTEXT <", value, "pcsContext");
            return (Criteria) this;
        }

        public Criteria andPcsContextLessThanOrEqualTo(String value) {
            addCriterion("PCS_CONTEXT <=", value, "pcsContext");
            return (Criteria) this;
        }

        public Criteria andPcsContextLike(String value) {
            addCriterion("PCS_CONTEXT like", value, "pcsContext");
            return (Criteria) this;
        }

        public Criteria andPcsContextNotLike(String value) {
            addCriterion("PCS_CONTEXT not like", value, "pcsContext");
            return (Criteria) this;
        }

        public Criteria andPcsContextIn(List<String> values) {
            addCriterion("PCS_CONTEXT in", values, "pcsContext");
            return (Criteria) this;
        }

        public Criteria andPcsContextNotIn(List<String> values) {
            addCriterion("PCS_CONTEXT not in", values, "pcsContext");
            return (Criteria) this;
        }

        public Criteria andPcsContextBetween(String value1, String value2) {
            addCriterion("PCS_CONTEXT between", value1, value2, "pcsContext");
            return (Criteria) this;
        }

        public Criteria andPcsContextNotBetween(String value1, String value2) {
            addCriterion("PCS_CONTEXT not between", value1, value2, "pcsContext");
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

        public Criteria andPcsLevelIsNull() {
            addCriterion("PCS_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andPcsLevelIsNotNull() {
            addCriterion("PCS_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andPcsLevelEqualTo(String value) {
            addCriterion("PCS_LEVEL =", value, "pcsLevel");
            return (Criteria) this;
        }

        public Criteria andPcsLevelNotEqualTo(String value) {
            addCriterion("PCS_LEVEL <>", value, "pcsLevel");
            return (Criteria) this;
        }

        public Criteria andPcsLevelGreaterThan(String value) {
            addCriterion("PCS_LEVEL >", value, "pcsLevel");
            return (Criteria) this;
        }

        public Criteria andPcsLevelGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_LEVEL >=", value, "pcsLevel");
            return (Criteria) this;
        }

        public Criteria andPcsLevelLessThan(String value) {
            addCriterion("PCS_LEVEL <", value, "pcsLevel");
            return (Criteria) this;
        }

        public Criteria andPcsLevelLessThanOrEqualTo(String value) {
            addCriterion("PCS_LEVEL <=", value, "pcsLevel");
            return (Criteria) this;
        }

        public Criteria andPcsLevelLike(String value) {
            addCriterion("PCS_LEVEL like", value, "pcsLevel");
            return (Criteria) this;
        }

        public Criteria andPcsLevelNotLike(String value) {
            addCriterion("PCS_LEVEL not like", value, "pcsLevel");
            return (Criteria) this;
        }

        public Criteria andPcsLevelIn(List<String> values) {
            addCriterion("PCS_LEVEL in", values, "pcsLevel");
            return (Criteria) this;
        }

        public Criteria andPcsLevelNotIn(List<String> values) {
            addCriterion("PCS_LEVEL not in", values, "pcsLevel");
            return (Criteria) this;
        }

        public Criteria andPcsLevelBetween(String value1, String value2) {
            addCriterion("PCS_LEVEL between", value1, value2, "pcsLevel");
            return (Criteria) this;
        }

        public Criteria andPcsLevelNotBetween(String value1, String value2) {
            addCriterion("PCS_LEVEL not between", value1, value2, "pcsLevel");
            return (Criteria) this;
        }

        public Criteria andPcsTitleIsNull() {
            addCriterion("PCS_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andPcsTitleIsNotNull() {
            addCriterion("PCS_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andPcsTitleEqualTo(String value) {
            addCriterion("PCS_TITLE =", value, "pcsTitle");
            return (Criteria) this;
        }

        public Criteria andPcsTitleNotEqualTo(String value) {
            addCriterion("PCS_TITLE <>", value, "pcsTitle");
            return (Criteria) this;
        }

        public Criteria andPcsTitleGreaterThan(String value) {
            addCriterion("PCS_TITLE >", value, "pcsTitle");
            return (Criteria) this;
        }

        public Criteria andPcsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_TITLE >=", value, "pcsTitle");
            return (Criteria) this;
        }

        public Criteria andPcsTitleLessThan(String value) {
            addCriterion("PCS_TITLE <", value, "pcsTitle");
            return (Criteria) this;
        }

        public Criteria andPcsTitleLessThanOrEqualTo(String value) {
            addCriterion("PCS_TITLE <=", value, "pcsTitle");
            return (Criteria) this;
        }

        public Criteria andPcsTitleLike(String value) {
            addCriterion("PCS_TITLE like", value, "pcsTitle");
            return (Criteria) this;
        }

        public Criteria andPcsTitleNotLike(String value) {
            addCriterion("PCS_TITLE not like", value, "pcsTitle");
            return (Criteria) this;
        }

        public Criteria andPcsTitleIn(List<String> values) {
            addCriterion("PCS_TITLE in", values, "pcsTitle");
            return (Criteria) this;
        }

        public Criteria andPcsTitleNotIn(List<String> values) {
            addCriterion("PCS_TITLE not in", values, "pcsTitle");
            return (Criteria) this;
        }

        public Criteria andPcsTitleBetween(String value1, String value2) {
            addCriterion("PCS_TITLE between", value1, value2, "pcsTitle");
            return (Criteria) this;
        }

        public Criteria andPcsTitleNotBetween(String value1, String value2) {
            addCriterion("PCS_TITLE not between", value1, value2, "pcsTitle");
            return (Criteria) this;
        }

        public Criteria andPcsExtcodeIsNull() {
            addCriterion("PCS_EXTCODE is null");
            return (Criteria) this;
        }

        public Criteria andPcsExtcodeIsNotNull() {
            addCriterion("PCS_EXTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPcsExtcodeEqualTo(String value) {
            addCriterion("PCS_EXTCODE =", value, "pcsExtcode");
            return (Criteria) this;
        }

        public Criteria andPcsExtcodeNotEqualTo(String value) {
            addCriterion("PCS_EXTCODE <>", value, "pcsExtcode");
            return (Criteria) this;
        }

        public Criteria andPcsExtcodeGreaterThan(String value) {
            addCriterion("PCS_EXTCODE >", value, "pcsExtcode");
            return (Criteria) this;
        }

        public Criteria andPcsExtcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_EXTCODE >=", value, "pcsExtcode");
            return (Criteria) this;
        }

        public Criteria andPcsExtcodeLessThan(String value) {
            addCriterion("PCS_EXTCODE <", value, "pcsExtcode");
            return (Criteria) this;
        }

        public Criteria andPcsExtcodeLessThanOrEqualTo(String value) {
            addCriterion("PCS_EXTCODE <=", value, "pcsExtcode");
            return (Criteria) this;
        }

        public Criteria andPcsExtcodeLike(String value) {
            addCriterion("PCS_EXTCODE like", value, "pcsExtcode");
            return (Criteria) this;
        }

        public Criteria andPcsExtcodeNotLike(String value) {
            addCriterion("PCS_EXTCODE not like", value, "pcsExtcode");
            return (Criteria) this;
        }

        public Criteria andPcsExtcodeIn(List<String> values) {
            addCriterion("PCS_EXTCODE in", values, "pcsExtcode");
            return (Criteria) this;
        }

        public Criteria andPcsExtcodeNotIn(List<String> values) {
            addCriterion("PCS_EXTCODE not in", values, "pcsExtcode");
            return (Criteria) this;
        }

        public Criteria andPcsExtcodeBetween(String value1, String value2) {
            addCriterion("PCS_EXTCODE between", value1, value2, "pcsExtcode");
            return (Criteria) this;
        }

        public Criteria andPcsExtcodeNotBetween(String value1, String value2) {
            addCriterion("PCS_EXTCODE not between", value1, value2, "pcsExtcode");
            return (Criteria) this;
        }

        public Criteria andPcsExtcontextIsNull() {
            addCriterion("PCS_EXTCONTEXT is null");
            return (Criteria) this;
        }

        public Criteria andPcsExtcontextIsNotNull() {
            addCriterion("PCS_EXTCONTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andPcsExtcontextEqualTo(String value) {
            addCriterion("PCS_EXTCONTEXT =", value, "pcsExtcontext");
            return (Criteria) this;
        }

        public Criteria andPcsExtcontextNotEqualTo(String value) {
            addCriterion("PCS_EXTCONTEXT <>", value, "pcsExtcontext");
            return (Criteria) this;
        }

        public Criteria andPcsExtcontextGreaterThan(String value) {
            addCriterion("PCS_EXTCONTEXT >", value, "pcsExtcontext");
            return (Criteria) this;
        }

        public Criteria andPcsExtcontextGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_EXTCONTEXT >=", value, "pcsExtcontext");
            return (Criteria) this;
        }

        public Criteria andPcsExtcontextLessThan(String value) {
            addCriterion("PCS_EXTCONTEXT <", value, "pcsExtcontext");
            return (Criteria) this;
        }

        public Criteria andPcsExtcontextLessThanOrEqualTo(String value) {
            addCriterion("PCS_EXTCONTEXT <=", value, "pcsExtcontext");
            return (Criteria) this;
        }

        public Criteria andPcsExtcontextLike(String value) {
            addCriterion("PCS_EXTCONTEXT like", value, "pcsExtcontext");
            return (Criteria) this;
        }

        public Criteria andPcsExtcontextNotLike(String value) {
            addCriterion("PCS_EXTCONTEXT not like", value, "pcsExtcontext");
            return (Criteria) this;
        }

        public Criteria andPcsExtcontextIn(List<String> values) {
            addCriterion("PCS_EXTCONTEXT in", values, "pcsExtcontext");
            return (Criteria) this;
        }

        public Criteria andPcsExtcontextNotIn(List<String> values) {
            addCriterion("PCS_EXTCONTEXT not in", values, "pcsExtcontext");
            return (Criteria) this;
        }

        public Criteria andPcsExtcontextBetween(String value1, String value2) {
            addCriterion("PCS_EXTCONTEXT between", value1, value2, "pcsExtcontext");
            return (Criteria) this;
        }

        public Criteria andPcsExtcontextNotBetween(String value1, String value2) {
            addCriterion("PCS_EXTCONTEXT not between", value1, value2, "pcsExtcontext");
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