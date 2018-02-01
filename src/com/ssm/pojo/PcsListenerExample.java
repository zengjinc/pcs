package com.ssm.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PcsListenerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PcsListenerExample() {
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

        public Criteria andPcsListenernameIsNull() {
            addCriterion("PCS_LISTENERNAME is null");
            return (Criteria) this;
        }

        public Criteria andPcsListenernameIsNotNull() {
            addCriterion("PCS_LISTENERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPcsListenernameEqualTo(String value) {
            addCriterion("PCS_LISTENERNAME =", value, "pcsListenername");
            return (Criteria) this;
        }

        public Criteria andPcsListenernameNotEqualTo(String value) {
            addCriterion("PCS_LISTENERNAME <>", value, "pcsListenername");
            return (Criteria) this;
        }

        public Criteria andPcsListenernameGreaterThan(String value) {
            addCriterion("PCS_LISTENERNAME >", value, "pcsListenername");
            return (Criteria) this;
        }

        public Criteria andPcsListenernameGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_LISTENERNAME >=", value, "pcsListenername");
            return (Criteria) this;
        }

        public Criteria andPcsListenernameLessThan(String value) {
            addCriterion("PCS_LISTENERNAME <", value, "pcsListenername");
            return (Criteria) this;
        }

        public Criteria andPcsListenernameLessThanOrEqualTo(String value) {
            addCriterion("PCS_LISTENERNAME <=", value, "pcsListenername");
            return (Criteria) this;
        }

        public Criteria andPcsListenernameLike(String value) {
            addCriterion("PCS_LISTENERNAME like", value, "pcsListenername");
            return (Criteria) this;
        }

        public Criteria andPcsListenernameNotLike(String value) {
            addCriterion("PCS_LISTENERNAME not like", value, "pcsListenername");
            return (Criteria) this;
        }

        public Criteria andPcsListenernameIn(List<String> values) {
            addCriterion("PCS_LISTENERNAME in", values, "pcsListenername");
            return (Criteria) this;
        }

        public Criteria andPcsListenernameNotIn(List<String> values) {
            addCriterion("PCS_LISTENERNAME not in", values, "pcsListenername");
            return (Criteria) this;
        }

        public Criteria andPcsListenernameBetween(String value1, String value2) {
            addCriterion("PCS_LISTENERNAME between", value1, value2, "pcsListenername");
            return (Criteria) this;
        }

        public Criteria andPcsListenernameNotBetween(String value1, String value2) {
            addCriterion("PCS_LISTENERNAME not between", value1, value2, "pcsListenername");
            return (Criteria) this;
        }

        public Criteria andPcsEventcategoryIsNull() {
            addCriterion("PCS_EVENTCATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andPcsEventcategoryIsNotNull() {
            addCriterion("PCS_EVENTCATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andPcsEventcategoryEqualTo(String value) {
            addCriterion("PCS_EVENTCATEGORY =", value, "pcsEventcategory");
            return (Criteria) this;
        }

        public Criteria andPcsEventcategoryNotEqualTo(String value) {
            addCriterion("PCS_EVENTCATEGORY <>", value, "pcsEventcategory");
            return (Criteria) this;
        }

        public Criteria andPcsEventcategoryGreaterThan(String value) {
            addCriterion("PCS_EVENTCATEGORY >", value, "pcsEventcategory");
            return (Criteria) this;
        }

        public Criteria andPcsEventcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_EVENTCATEGORY >=", value, "pcsEventcategory");
            return (Criteria) this;
        }

        public Criteria andPcsEventcategoryLessThan(String value) {
            addCriterion("PCS_EVENTCATEGORY <", value, "pcsEventcategory");
            return (Criteria) this;
        }

        public Criteria andPcsEventcategoryLessThanOrEqualTo(String value) {
            addCriterion("PCS_EVENTCATEGORY <=", value, "pcsEventcategory");
            return (Criteria) this;
        }

        public Criteria andPcsEventcategoryLike(String value) {
            addCriterion("PCS_EVENTCATEGORY like", value, "pcsEventcategory");
            return (Criteria) this;
        }

        public Criteria andPcsEventcategoryNotLike(String value) {
            addCriterion("PCS_EVENTCATEGORY not like", value, "pcsEventcategory");
            return (Criteria) this;
        }

        public Criteria andPcsEventcategoryIn(List<String> values) {
            addCriterion("PCS_EVENTCATEGORY in", values, "pcsEventcategory");
            return (Criteria) this;
        }

        public Criteria andPcsEventcategoryNotIn(List<String> values) {
            addCriterion("PCS_EVENTCATEGORY not in", values, "pcsEventcategory");
            return (Criteria) this;
        }

        public Criteria andPcsEventcategoryBetween(String value1, String value2) {
            addCriterion("PCS_EVENTCATEGORY between", value1, value2, "pcsEventcategory");
            return (Criteria) this;
        }

        public Criteria andPcsEventcategoryNotBetween(String value1, String value2) {
            addCriterion("PCS_EVENTCATEGORY not between", value1, value2, "pcsEventcategory");
            return (Criteria) this;
        }

        public Criteria andPcsEventtypeIsNull() {
            addCriterion("PCS_EVENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPcsEventtypeIsNotNull() {
            addCriterion("PCS_EVENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPcsEventtypeEqualTo(String value) {
            addCriterion("PCS_EVENTTYPE =", value, "pcsEventtype");
            return (Criteria) this;
        }

        public Criteria andPcsEventtypeNotEqualTo(String value) {
            addCriterion("PCS_EVENTTYPE <>", value, "pcsEventtype");
            return (Criteria) this;
        }

        public Criteria andPcsEventtypeGreaterThan(String value) {
            addCriterion("PCS_EVENTTYPE >", value, "pcsEventtype");
            return (Criteria) this;
        }

        public Criteria andPcsEventtypeGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_EVENTTYPE >=", value, "pcsEventtype");
            return (Criteria) this;
        }

        public Criteria andPcsEventtypeLessThan(String value) {
            addCriterion("PCS_EVENTTYPE <", value, "pcsEventtype");
            return (Criteria) this;
        }

        public Criteria andPcsEventtypeLessThanOrEqualTo(String value) {
            addCriterion("PCS_EVENTTYPE <=", value, "pcsEventtype");
            return (Criteria) this;
        }

        public Criteria andPcsEventtypeLike(String value) {
            addCriterion("PCS_EVENTTYPE like", value, "pcsEventtype");
            return (Criteria) this;
        }

        public Criteria andPcsEventtypeNotLike(String value) {
            addCriterion("PCS_EVENTTYPE not like", value, "pcsEventtype");
            return (Criteria) this;
        }

        public Criteria andPcsEventtypeIn(List<String> values) {
            addCriterion("PCS_EVENTTYPE in", values, "pcsEventtype");
            return (Criteria) this;
        }

        public Criteria andPcsEventtypeNotIn(List<String> values) {
            addCriterion("PCS_EVENTTYPE not in", values, "pcsEventtype");
            return (Criteria) this;
        }

        public Criteria andPcsEventtypeBetween(String value1, String value2) {
            addCriterion("PCS_EVENTTYPE between", value1, value2, "pcsEventtype");
            return (Criteria) this;
        }

        public Criteria andPcsEventtypeNotBetween(String value1, String value2) {
            addCriterion("PCS_EVENTTYPE not between", value1, value2, "pcsEventtype");
            return (Criteria) this;
        }

        public Criteria andPcsEventresultIsNull() {
            addCriterion("PCS_EVENTRESULT is null");
            return (Criteria) this;
        }

        public Criteria andPcsEventresultIsNotNull() {
            addCriterion("PCS_EVENTRESULT is not null");
            return (Criteria) this;
        }

        public Criteria andPcsEventresultEqualTo(String value) {
            addCriterion("PCS_EVENTRESULT =", value, "pcsEventresult");
            return (Criteria) this;
        }

        public Criteria andPcsEventresultNotEqualTo(String value) {
            addCriterion("PCS_EVENTRESULT <>", value, "pcsEventresult");
            return (Criteria) this;
        }

        public Criteria andPcsEventresultGreaterThan(String value) {
            addCriterion("PCS_EVENTRESULT >", value, "pcsEventresult");
            return (Criteria) this;
        }

        public Criteria andPcsEventresultGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_EVENTRESULT >=", value, "pcsEventresult");
            return (Criteria) this;
        }

        public Criteria andPcsEventresultLessThan(String value) {
            addCriterion("PCS_EVENTRESULT <", value, "pcsEventresult");
            return (Criteria) this;
        }

        public Criteria andPcsEventresultLessThanOrEqualTo(String value) {
            addCriterion("PCS_EVENTRESULT <=", value, "pcsEventresult");
            return (Criteria) this;
        }

        public Criteria andPcsEventresultLike(String value) {
            addCriterion("PCS_EVENTRESULT like", value, "pcsEventresult");
            return (Criteria) this;
        }

        public Criteria andPcsEventresultNotLike(String value) {
            addCriterion("PCS_EVENTRESULT not like", value, "pcsEventresult");
            return (Criteria) this;
        }

        public Criteria andPcsEventresultIn(List<String> values) {
            addCriterion("PCS_EVENTRESULT in", values, "pcsEventresult");
            return (Criteria) this;
        }

        public Criteria andPcsEventresultNotIn(List<String> values) {
            addCriterion("PCS_EVENTRESULT not in", values, "pcsEventresult");
            return (Criteria) this;
        }

        public Criteria andPcsEventresultBetween(String value1, String value2) {
            addCriterion("PCS_EVENTRESULT between", value1, value2, "pcsEventresult");
            return (Criteria) this;
        }

        public Criteria andPcsEventresultNotBetween(String value1, String value2) {
            addCriterion("PCS_EVENTRESULT not between", value1, value2, "pcsEventresult");
            return (Criteria) this;
        }

        public Criteria andPcsConnectorIsNull() {
            addCriterion("PCS_CONNECTOR is null");
            return (Criteria) this;
        }

        public Criteria andPcsConnectorIsNotNull() {
            addCriterion("PCS_CONNECTOR is not null");
            return (Criteria) this;
        }

        public Criteria andPcsConnectorEqualTo(String value) {
            addCriterion("PCS_CONNECTOR =", value, "pcsConnector");
            return (Criteria) this;
        }

        public Criteria andPcsConnectorNotEqualTo(String value) {
            addCriterion("PCS_CONNECTOR <>", value, "pcsConnector");
            return (Criteria) this;
        }

        public Criteria andPcsConnectorGreaterThan(String value) {
            addCriterion("PCS_CONNECTOR >", value, "pcsConnector");
            return (Criteria) this;
        }

        public Criteria andPcsConnectorGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_CONNECTOR >=", value, "pcsConnector");
            return (Criteria) this;
        }

        public Criteria andPcsConnectorLessThan(String value) {
            addCriterion("PCS_CONNECTOR <", value, "pcsConnector");
            return (Criteria) this;
        }

        public Criteria andPcsConnectorLessThanOrEqualTo(String value) {
            addCriterion("PCS_CONNECTOR <=", value, "pcsConnector");
            return (Criteria) this;
        }

        public Criteria andPcsConnectorLike(String value) {
            addCriterion("PCS_CONNECTOR like", value, "pcsConnector");
            return (Criteria) this;
        }

        public Criteria andPcsConnectorNotLike(String value) {
            addCriterion("PCS_CONNECTOR not like", value, "pcsConnector");
            return (Criteria) this;
        }

        public Criteria andPcsConnectorIn(List<String> values) {
            addCriterion("PCS_CONNECTOR in", values, "pcsConnector");
            return (Criteria) this;
        }

        public Criteria andPcsConnectorNotIn(List<String> values) {
            addCriterion("PCS_CONNECTOR not in", values, "pcsConnector");
            return (Criteria) this;
        }

        public Criteria andPcsConnectorBetween(String value1, String value2) {
            addCriterion("PCS_CONNECTOR between", value1, value2, "pcsConnector");
            return (Criteria) this;
        }

        public Criteria andPcsConnectorNotBetween(String value1, String value2) {
            addCriterion("PCS_CONNECTOR not between", value1, value2, "pcsConnector");
            return (Criteria) this;
        }

        public Criteria andPcsWhenIsNull() {
            addCriterion("PCS_WHEN is null");
            return (Criteria) this;
        }

        public Criteria andPcsWhenIsNotNull() {
            addCriterion("PCS_WHEN is not null");
            return (Criteria) this;
        }

        public Criteria andPcsWhenEqualTo(String value) {
            addCriterion("PCS_WHEN =", value, "pcsWhen");
            return (Criteria) this;
        }

        public Criteria andPcsWhenNotEqualTo(String value) {
            addCriterion("PCS_WHEN <>", value, "pcsWhen");
            return (Criteria) this;
        }

        public Criteria andPcsWhenGreaterThan(String value) {
            addCriterion("PCS_WHEN >", value, "pcsWhen");
            return (Criteria) this;
        }

        public Criteria andPcsWhenGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_WHEN >=", value, "pcsWhen");
            return (Criteria) this;
        }

        public Criteria andPcsWhenLessThan(String value) {
            addCriterion("PCS_WHEN <", value, "pcsWhen");
            return (Criteria) this;
        }

        public Criteria andPcsWhenLessThanOrEqualTo(String value) {
            addCriterion("PCS_WHEN <=", value, "pcsWhen");
            return (Criteria) this;
        }

        public Criteria andPcsWhenLike(String value) {
            addCriterion("PCS_WHEN like", value, "pcsWhen");
            return (Criteria) this;
        }

        public Criteria andPcsWhenNotLike(String value) {
            addCriterion("PCS_WHEN not like", value, "pcsWhen");
            return (Criteria) this;
        }

        public Criteria andPcsWhenIn(List<String> values) {
            addCriterion("PCS_WHEN in", values, "pcsWhen");
            return (Criteria) this;
        }

        public Criteria andPcsWhenNotIn(List<String> values) {
            addCriterion("PCS_WHEN not in", values, "pcsWhen");
            return (Criteria) this;
        }

        public Criteria andPcsWhenBetween(String value1, String value2) {
            addCriterion("PCS_WHEN between", value1, value2, "pcsWhen");
            return (Criteria) this;
        }

        public Criteria andPcsWhenNotBetween(String value1, String value2) {
            addCriterion("PCS_WHEN not between", value1, value2, "pcsWhen");
            return (Criteria) this;
        }

        public Criteria andPcsRunnowIsNull() {
            addCriterion("PCS_RUNNOW is null");
            return (Criteria) this;
        }

        public Criteria andPcsRunnowIsNotNull() {
            addCriterion("PCS_RUNNOW is not null");
            return (Criteria) this;
        }

        public Criteria andPcsRunnowEqualTo(String value) {
            addCriterion("PCS_RUNNOW =", value, "pcsRunnow");
            return (Criteria) this;
        }

        public Criteria andPcsRunnowNotEqualTo(String value) {
            addCriterion("PCS_RUNNOW <>", value, "pcsRunnow");
            return (Criteria) this;
        }

        public Criteria andPcsRunnowGreaterThan(String value) {
            addCriterion("PCS_RUNNOW >", value, "pcsRunnow");
            return (Criteria) this;
        }

        public Criteria andPcsRunnowGreaterThanOrEqualTo(String value) {
            addCriterion("PCS_RUNNOW >=", value, "pcsRunnow");
            return (Criteria) this;
        }

        public Criteria andPcsRunnowLessThan(String value) {
            addCriterion("PCS_RUNNOW <", value, "pcsRunnow");
            return (Criteria) this;
        }

        public Criteria andPcsRunnowLessThanOrEqualTo(String value) {
            addCriterion("PCS_RUNNOW <=", value, "pcsRunnow");
            return (Criteria) this;
        }

        public Criteria andPcsRunnowLike(String value) {
            addCriterion("PCS_RUNNOW like", value, "pcsRunnow");
            return (Criteria) this;
        }

        public Criteria andPcsRunnowNotLike(String value) {
            addCriterion("PCS_RUNNOW not like", value, "pcsRunnow");
            return (Criteria) this;
        }

        public Criteria andPcsRunnowIn(List<String> values) {
            addCriterion("PCS_RUNNOW in", values, "pcsRunnow");
            return (Criteria) this;
        }

        public Criteria andPcsRunnowNotIn(List<String> values) {
            addCriterion("PCS_RUNNOW not in", values, "pcsRunnow");
            return (Criteria) this;
        }

        public Criteria andPcsRunnowBetween(String value1, String value2) {
            addCriterion("PCS_RUNNOW between", value1, value2, "pcsRunnow");
            return (Criteria) this;
        }

        public Criteria andPcsRunnowNotBetween(String value1, String value2) {
            addCriterion("PCS_RUNNOW not between", value1, value2, "pcsRunnow");
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