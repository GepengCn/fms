package com.itonglian.fms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WfTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WfTaskExample() {
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

        public Criteria andWt00IsNull() {
            addCriterion("WT00 is null");
            return (Criteria) this;
        }

        public Criteria andWt00IsNotNull() {
            addCriterion("WT00 is not null");
            return (Criteria) this;
        }

        public Criteria andWt00EqualTo(Long value) {
            addCriterion("WT00 =", value, "wt00");
            return (Criteria) this;
        }

        public Criteria andWt00NotEqualTo(Long value) {
            addCriterion("WT00 <>", value, "wt00");
            return (Criteria) this;
        }

        public Criteria andWt00GreaterThan(Long value) {
            addCriterion("WT00 >", value, "wt00");
            return (Criteria) this;
        }

        public Criteria andWt00GreaterThanOrEqualTo(Long value) {
            addCriterion("WT00 >=", value, "wt00");
            return (Criteria) this;
        }

        public Criteria andWt00LessThan(Long value) {
            addCriterion("WT00 <", value, "wt00");
            return (Criteria) this;
        }

        public Criteria andWt00LessThanOrEqualTo(Long value) {
            addCriterion("WT00 <=", value, "wt00");
            return (Criteria) this;
        }

        public Criteria andWt00In(List<Long> values) {
            addCriterion("WT00 in", values, "wt00");
            return (Criteria) this;
        }

        public Criteria andWt00NotIn(List<Long> values) {
            addCriterion("WT00 not in", values, "wt00");
            return (Criteria) this;
        }

        public Criteria andWt00Between(Long value1, Long value2) {
            addCriterion("WT00 between", value1, value2, "wt00");
            return (Criteria) this;
        }

        public Criteria andWt00NotBetween(Long value1, Long value2) {
            addCriterion("WT00 not between", value1, value2, "wt00");
            return (Criteria) this;
        }

        public Criteria andWt01IsNull() {
            addCriterion("WT01 is null");
            return (Criteria) this;
        }

        public Criteria andWt01IsNotNull() {
            addCriterion("WT01 is not null");
            return (Criteria) this;
        }

        public Criteria andWt01EqualTo(String value) {
            addCriterion("WT01 =", value, "wt01");
            return (Criteria) this;
        }

        public Criteria andWt01NotEqualTo(String value) {
            addCriterion("WT01 <>", value, "wt01");
            return (Criteria) this;
        }

        public Criteria andWt01GreaterThan(String value) {
            addCriterion("WT01 >", value, "wt01");
            return (Criteria) this;
        }

        public Criteria andWt01GreaterThanOrEqualTo(String value) {
            addCriterion("WT01 >=", value, "wt01");
            return (Criteria) this;
        }

        public Criteria andWt01LessThan(String value) {
            addCriterion("WT01 <", value, "wt01");
            return (Criteria) this;
        }

        public Criteria andWt01LessThanOrEqualTo(String value) {
            addCriterion("WT01 <=", value, "wt01");
            return (Criteria) this;
        }

        public Criteria andWt01Like(String value) {
            addCriterion("WT01 like", value, "wt01");
            return (Criteria) this;
        }

        public Criteria andWt01NotLike(String value) {
            addCriterion("WT01 not like", value, "wt01");
            return (Criteria) this;
        }

        public Criteria andWt01In(List<String> values) {
            addCriterion("WT01 in", values, "wt01");
            return (Criteria) this;
        }

        public Criteria andWt01NotIn(List<String> values) {
            addCriterion("WT01 not in", values, "wt01");
            return (Criteria) this;
        }

        public Criteria andWt01Between(String value1, String value2) {
            addCriterion("WT01 between", value1, value2, "wt01");
            return (Criteria) this;
        }

        public Criteria andWt01NotBetween(String value1, String value2) {
            addCriterion("WT01 not between", value1, value2, "wt01");
            return (Criteria) this;
        }

        public Criteria andWt02IsNull() {
            addCriterion("WT02 is null");
            return (Criteria) this;
        }

        public Criteria andWt02IsNotNull() {
            addCriterion("WT02 is not null");
            return (Criteria) this;
        }

        public Criteria andWt02EqualTo(String value) {
            addCriterion("WT02 =", value, "wt02");
            return (Criteria) this;
        }

        public Criteria andWt02NotEqualTo(String value) {
            addCriterion("WT02 <>", value, "wt02");
            return (Criteria) this;
        }

        public Criteria andWt02GreaterThan(String value) {
            addCriterion("WT02 >", value, "wt02");
            return (Criteria) this;
        }

        public Criteria andWt02GreaterThanOrEqualTo(String value) {
            addCriterion("WT02 >=", value, "wt02");
            return (Criteria) this;
        }

        public Criteria andWt02LessThan(String value) {
            addCriterion("WT02 <", value, "wt02");
            return (Criteria) this;
        }

        public Criteria andWt02LessThanOrEqualTo(String value) {
            addCriterion("WT02 <=", value, "wt02");
            return (Criteria) this;
        }

        public Criteria andWt02Like(String value) {
            addCriterion("WT02 like", value, "wt02");
            return (Criteria) this;
        }

        public Criteria andWt02NotLike(String value) {
            addCriterion("WT02 not like", value, "wt02");
            return (Criteria) this;
        }

        public Criteria andWt02In(List<String> values) {
            addCriterion("WT02 in", values, "wt02");
            return (Criteria) this;
        }

        public Criteria andWt02NotIn(List<String> values) {
            addCriterion("WT02 not in", values, "wt02");
            return (Criteria) this;
        }

        public Criteria andWt02Between(String value1, String value2) {
            addCriterion("WT02 between", value1, value2, "wt02");
            return (Criteria) this;
        }

        public Criteria andWt02NotBetween(String value1, String value2) {
            addCriterion("WT02 not between", value1, value2, "wt02");
            return (Criteria) this;
        }

        public Criteria andWt03IsNull() {
            addCriterion("WT03 is null");
            return (Criteria) this;
        }

        public Criteria andWt03IsNotNull() {
            addCriterion("WT03 is not null");
            return (Criteria) this;
        }

        public Criteria andWt03EqualTo(String value) {
            addCriterion("WT03 =", value, "wt03");
            return (Criteria) this;
        }

        public Criteria andWt03NotEqualTo(String value) {
            addCriterion("WT03 <>", value, "wt03");
            return (Criteria) this;
        }

        public Criteria andWt03GreaterThan(String value) {
            addCriterion("WT03 >", value, "wt03");
            return (Criteria) this;
        }

        public Criteria andWt03GreaterThanOrEqualTo(String value) {
            addCriterion("WT03 >=", value, "wt03");
            return (Criteria) this;
        }

        public Criteria andWt03LessThan(String value) {
            addCriterion("WT03 <", value, "wt03");
            return (Criteria) this;
        }

        public Criteria andWt03LessThanOrEqualTo(String value) {
            addCriterion("WT03 <=", value, "wt03");
            return (Criteria) this;
        }

        public Criteria andWt03Like(String value) {
            addCriterion("WT03 like", value, "wt03");
            return (Criteria) this;
        }

        public Criteria andWt03NotLike(String value) {
            addCriterion("WT03 not like", value, "wt03");
            return (Criteria) this;
        }

        public Criteria andWt03In(List<String> values) {
            addCriterion("WT03 in", values, "wt03");
            return (Criteria) this;
        }

        public Criteria andWt03NotIn(List<String> values) {
            addCriterion("WT03 not in", values, "wt03");
            return (Criteria) this;
        }

        public Criteria andWt03Between(String value1, String value2) {
            addCriterion("WT03 between", value1, value2, "wt03");
            return (Criteria) this;
        }

        public Criteria andWt03NotBetween(String value1, String value2) {
            addCriterion("WT03 not between", value1, value2, "wt03");
            return (Criteria) this;
        }

        public Criteria andWt04IsNull() {
            addCriterion("WT04 is null");
            return (Criteria) this;
        }

        public Criteria andWt04IsNotNull() {
            addCriterion("WT04 is not null");
            return (Criteria) this;
        }

        public Criteria andWt04EqualTo(Long value) {
            addCriterion("WT04 =", value, "wt04");
            return (Criteria) this;
        }

        public Criteria andWt04NotEqualTo(Long value) {
            addCriterion("WT04 <>", value, "wt04");
            return (Criteria) this;
        }

        public Criteria andWt04GreaterThan(Long value) {
            addCriterion("WT04 >", value, "wt04");
            return (Criteria) this;
        }

        public Criteria andWt04GreaterThanOrEqualTo(Long value) {
            addCriterion("WT04 >=", value, "wt04");
            return (Criteria) this;
        }

        public Criteria andWt04LessThan(Long value) {
            addCriterion("WT04 <", value, "wt04");
            return (Criteria) this;
        }

        public Criteria andWt04LessThanOrEqualTo(Long value) {
            addCriterion("WT04 <=", value, "wt04");
            return (Criteria) this;
        }

        public Criteria andWt04In(List<Long> values) {
            addCriterion("WT04 in", values, "wt04");
            return (Criteria) this;
        }

        public Criteria andWt04NotIn(List<Long> values) {
            addCriterion("WT04 not in", values, "wt04");
            return (Criteria) this;
        }

        public Criteria andWt04Between(Long value1, Long value2) {
            addCriterion("WT04 between", value1, value2, "wt04");
            return (Criteria) this;
        }

        public Criteria andWt04NotBetween(Long value1, Long value2) {
            addCriterion("WT04 not between", value1, value2, "wt04");
            return (Criteria) this;
        }

        public Criteria andWt05IsNull() {
            addCriterion("WT05 is null");
            return (Criteria) this;
        }

        public Criteria andWt05IsNotNull() {
            addCriterion("WT05 is not null");
            return (Criteria) this;
        }

        public Criteria andWt05EqualTo(String value) {
            addCriterion("WT05 =", value, "wt05");
            return (Criteria) this;
        }

        public Criteria andWt05NotEqualTo(String value) {
            addCriterion("WT05 <>", value, "wt05");
            return (Criteria) this;
        }

        public Criteria andWt05GreaterThan(String value) {
            addCriterion("WT05 >", value, "wt05");
            return (Criteria) this;
        }

        public Criteria andWt05GreaterThanOrEqualTo(String value) {
            addCriterion("WT05 >=", value, "wt05");
            return (Criteria) this;
        }

        public Criteria andWt05LessThan(String value) {
            addCriterion("WT05 <", value, "wt05");
            return (Criteria) this;
        }

        public Criteria andWt05LessThanOrEqualTo(String value) {
            addCriterion("WT05 <=", value, "wt05");
            return (Criteria) this;
        }

        public Criteria andWt05Like(String value) {
            addCriterion("WT05 like", value, "wt05");
            return (Criteria) this;
        }

        public Criteria andWt05NotLike(String value) {
            addCriterion("WT05 not like", value, "wt05");
            return (Criteria) this;
        }

        public Criteria andWt05In(List<String> values) {
            addCriterion("WT05 in", values, "wt05");
            return (Criteria) this;
        }

        public Criteria andWt05NotIn(List<String> values) {
            addCriterion("WT05 not in", values, "wt05");
            return (Criteria) this;
        }

        public Criteria andWt05Between(String value1, String value2) {
            addCriterion("WT05 between", value1, value2, "wt05");
            return (Criteria) this;
        }

        public Criteria andWt05NotBetween(String value1, String value2) {
            addCriterion("WT05 not between", value1, value2, "wt05");
            return (Criteria) this;
        }

        public Criteria andWt06IsNull() {
            addCriterion("WT06 is null");
            return (Criteria) this;
        }

        public Criteria andWt06IsNotNull() {
            addCriterion("WT06 is not null");
            return (Criteria) this;
        }

        public Criteria andWt06EqualTo(String value) {
            addCriterion("WT06 =", value, "wt06");
            return (Criteria) this;
        }

        public Criteria andWt06NotEqualTo(String value) {
            addCriterion("WT06 <>", value, "wt06");
            return (Criteria) this;
        }

        public Criteria andWt06GreaterThan(String value) {
            addCriterion("WT06 >", value, "wt06");
            return (Criteria) this;
        }

        public Criteria andWt06GreaterThanOrEqualTo(String value) {
            addCriterion("WT06 >=", value, "wt06");
            return (Criteria) this;
        }

        public Criteria andWt06LessThan(String value) {
            addCriterion("WT06 <", value, "wt06");
            return (Criteria) this;
        }

        public Criteria andWt06LessThanOrEqualTo(String value) {
            addCriterion("WT06 <=", value, "wt06");
            return (Criteria) this;
        }

        public Criteria andWt06Like(String value) {
            addCriterion("WT06 like", value, "wt06");
            return (Criteria) this;
        }

        public Criteria andWt06NotLike(String value) {
            addCriterion("WT06 not like", value, "wt06");
            return (Criteria) this;
        }

        public Criteria andWt06In(List<String> values) {
            addCriterion("WT06 in", values, "wt06");
            return (Criteria) this;
        }

        public Criteria andWt06NotIn(List<String> values) {
            addCriterion("WT06 not in", values, "wt06");
            return (Criteria) this;
        }

        public Criteria andWt06Between(String value1, String value2) {
            addCriterion("WT06 between", value1, value2, "wt06");
            return (Criteria) this;
        }

        public Criteria andWt06NotBetween(String value1, String value2) {
            addCriterion("WT06 not between", value1, value2, "wt06");
            return (Criteria) this;
        }

        public Criteria andWt07IsNull() {
            addCriterion("WT07 is null");
            return (Criteria) this;
        }

        public Criteria andWt07IsNotNull() {
            addCriterion("WT07 is not null");
            return (Criteria) this;
        }

        public Criteria andWt07EqualTo(String value) {
            addCriterion("WT07 =", value, "wt07");
            return (Criteria) this;
        }

        public Criteria andWt07NotEqualTo(String value) {
            addCriterion("WT07 <>", value, "wt07");
            return (Criteria) this;
        }

        public Criteria andWt07GreaterThan(String value) {
            addCriterion("WT07 >", value, "wt07");
            return (Criteria) this;
        }

        public Criteria andWt07GreaterThanOrEqualTo(String value) {
            addCriterion("WT07 >=", value, "wt07");
            return (Criteria) this;
        }

        public Criteria andWt07LessThan(String value) {
            addCriterion("WT07 <", value, "wt07");
            return (Criteria) this;
        }

        public Criteria andWt07LessThanOrEqualTo(String value) {
            addCriterion("WT07 <=", value, "wt07");
            return (Criteria) this;
        }

        public Criteria andWt07Like(String value) {
            addCriterion("WT07 like", value, "wt07");
            return (Criteria) this;
        }

        public Criteria andWt07NotLike(String value) {
            addCriterion("WT07 not like", value, "wt07");
            return (Criteria) this;
        }

        public Criteria andWt07In(List<String> values) {
            addCriterion("WT07 in", values, "wt07");
            return (Criteria) this;
        }

        public Criteria andWt07NotIn(List<String> values) {
            addCriterion("WT07 not in", values, "wt07");
            return (Criteria) this;
        }

        public Criteria andWt07Between(String value1, String value2) {
            addCriterion("WT07 between", value1, value2, "wt07");
            return (Criteria) this;
        }

        public Criteria andWt07NotBetween(String value1, String value2) {
            addCriterion("WT07 not between", value1, value2, "wt07");
            return (Criteria) this;
        }

        public Criteria andWt08IsNull() {
            addCriterion("WT08 is null");
            return (Criteria) this;
        }

        public Criteria andWt08IsNotNull() {
            addCriterion("WT08 is not null");
            return (Criteria) this;
        }

        public Criteria andWt08EqualTo(String value) {
            addCriterion("WT08 =", value, "wt08");
            return (Criteria) this;
        }

        public Criteria andWt08NotEqualTo(String value) {
            addCriterion("WT08 <>", value, "wt08");
            return (Criteria) this;
        }

        public Criteria andWt08GreaterThan(String value) {
            addCriterion("WT08 >", value, "wt08");
            return (Criteria) this;
        }

        public Criteria andWt08GreaterThanOrEqualTo(String value) {
            addCriterion("WT08 >=", value, "wt08");
            return (Criteria) this;
        }

        public Criteria andWt08LessThan(String value) {
            addCriterion("WT08 <", value, "wt08");
            return (Criteria) this;
        }

        public Criteria andWt08LessThanOrEqualTo(String value) {
            addCriterion("WT08 <=", value, "wt08");
            return (Criteria) this;
        }

        public Criteria andWt08Like(String value) {
            addCriterion("WT08 like", value, "wt08");
            return (Criteria) this;
        }

        public Criteria andWt08NotLike(String value) {
            addCriterion("WT08 not like", value, "wt08");
            return (Criteria) this;
        }

        public Criteria andWt08In(List<String> values) {
            addCriterion("WT08 in", values, "wt08");
            return (Criteria) this;
        }

        public Criteria andWt08NotIn(List<String> values) {
            addCriterion("WT08 not in", values, "wt08");
            return (Criteria) this;
        }

        public Criteria andWt08Between(String value1, String value2) {
            addCriterion("WT08 between", value1, value2, "wt08");
            return (Criteria) this;
        }

        public Criteria andWt08NotBetween(String value1, String value2) {
            addCriterion("WT08 not between", value1, value2, "wt08");
            return (Criteria) this;
        }

        public Criteria andWt09IsNull() {
            addCriterion("WT09 is null");
            return (Criteria) this;
        }

        public Criteria andWt09IsNotNull() {
            addCriterion("WT09 is not null");
            return (Criteria) this;
        }

        public Criteria andWt09EqualTo(Date value) {
            addCriterion("WT09 =", value, "wt09");
            return (Criteria) this;
        }

        public Criteria andWt09NotEqualTo(Date value) {
            addCriterion("WT09 <>", value, "wt09");
            return (Criteria) this;
        }

        public Criteria andWt09GreaterThan(Date value) {
            addCriterion("WT09 >", value, "wt09");
            return (Criteria) this;
        }

        public Criteria andWt09GreaterThanOrEqualTo(Date value) {
            addCriterion("WT09 >=", value, "wt09");
            return (Criteria) this;
        }

        public Criteria andWt09LessThan(Date value) {
            addCriterion("WT09 <", value, "wt09");
            return (Criteria) this;
        }

        public Criteria andWt09LessThanOrEqualTo(Date value) {
            addCriterion("WT09 <=", value, "wt09");
            return (Criteria) this;
        }

        public Criteria andWt09In(List<Date> values) {
            addCriterion("WT09 in", values, "wt09");
            return (Criteria) this;
        }

        public Criteria andWt09NotIn(List<Date> values) {
            addCriterion("WT09 not in", values, "wt09");
            return (Criteria) this;
        }

        public Criteria andWt09Between(Date value1, Date value2) {
            addCriterion("WT09 between", value1, value2, "wt09");
            return (Criteria) this;
        }

        public Criteria andWt09NotBetween(Date value1, Date value2) {
            addCriterion("WT09 not between", value1, value2, "wt09");
            return (Criteria) this;
        }

        public Criteria andWt10IsNull() {
            addCriterion("WT10 is null");
            return (Criteria) this;
        }

        public Criteria andWt10IsNotNull() {
            addCriterion("WT10 is not null");
            return (Criteria) this;
        }

        public Criteria andWt10EqualTo(Date value) {
            addCriterion("WT10 =", value, "wt10");
            return (Criteria) this;
        }

        public Criteria andWt10NotEqualTo(Date value) {
            addCriterion("WT10 <>", value, "wt10");
            return (Criteria) this;
        }

        public Criteria andWt10GreaterThan(Date value) {
            addCriterion("WT10 >", value, "wt10");
            return (Criteria) this;
        }

        public Criteria andWt10GreaterThanOrEqualTo(Date value) {
            addCriterion("WT10 >=", value, "wt10");
            return (Criteria) this;
        }

        public Criteria andWt10LessThan(Date value) {
            addCriterion("WT10 <", value, "wt10");
            return (Criteria) this;
        }

        public Criteria andWt10LessThanOrEqualTo(Date value) {
            addCriterion("WT10 <=", value, "wt10");
            return (Criteria) this;
        }

        public Criteria andWt10In(List<Date> values) {
            addCriterion("WT10 in", values, "wt10");
            return (Criteria) this;
        }

        public Criteria andWt10NotIn(List<Date> values) {
            addCriterion("WT10 not in", values, "wt10");
            return (Criteria) this;
        }

        public Criteria andWt10Between(Date value1, Date value2) {
            addCriterion("WT10 between", value1, value2, "wt10");
            return (Criteria) this;
        }

        public Criteria andWt10NotBetween(Date value1, Date value2) {
            addCriterion("WT10 not between", value1, value2, "wt10");
            return (Criteria) this;
        }

        public Criteria andWt11IsNull() {
            addCriterion("WT11 is null");
            return (Criteria) this;
        }

        public Criteria andWt11IsNotNull() {
            addCriterion("WT11 is not null");
            return (Criteria) this;
        }

        public Criteria andWt11EqualTo(String value) {
            addCriterion("WT11 =", value, "wt11");
            return (Criteria) this;
        }

        public Criteria andWt11NotEqualTo(String value) {
            addCriterion("WT11 <>", value, "wt11");
            return (Criteria) this;
        }

        public Criteria andWt11GreaterThan(String value) {
            addCriterion("WT11 >", value, "wt11");
            return (Criteria) this;
        }

        public Criteria andWt11GreaterThanOrEqualTo(String value) {
            addCriterion("WT11 >=", value, "wt11");
            return (Criteria) this;
        }

        public Criteria andWt11LessThan(String value) {
            addCriterion("WT11 <", value, "wt11");
            return (Criteria) this;
        }

        public Criteria andWt11LessThanOrEqualTo(String value) {
            addCriterion("WT11 <=", value, "wt11");
            return (Criteria) this;
        }

        public Criteria andWt11Like(String value) {
            addCriterion("WT11 like", value, "wt11");
            return (Criteria) this;
        }

        public Criteria andWt11NotLike(String value) {
            addCriterion("WT11 not like", value, "wt11");
            return (Criteria) this;
        }

        public Criteria andWt11In(List<String> values) {
            addCriterion("WT11 in", values, "wt11");
            return (Criteria) this;
        }

        public Criteria andWt11NotIn(List<String> values) {
            addCriterion("WT11 not in", values, "wt11");
            return (Criteria) this;
        }

        public Criteria andWt11Between(String value1, String value2) {
            addCriterion("WT11 between", value1, value2, "wt11");
            return (Criteria) this;
        }

        public Criteria andWt11NotBetween(String value1, String value2) {
            addCriterion("WT11 not between", value1, value2, "wt11");
            return (Criteria) this;
        }

        public Criteria andWt12IsNull() {
            addCriterion("WT12 is null");
            return (Criteria) this;
        }

        public Criteria andWt12IsNotNull() {
            addCriterion("WT12 is not null");
            return (Criteria) this;
        }

        public Criteria andWt12EqualTo(String value) {
            addCriterion("WT12 =", value, "wt12");
            return (Criteria) this;
        }

        public Criteria andWt12NotEqualTo(String value) {
            addCriterion("WT12 <>", value, "wt12");
            return (Criteria) this;
        }

        public Criteria andWt12GreaterThan(String value) {
            addCriterion("WT12 >", value, "wt12");
            return (Criteria) this;
        }

        public Criteria andWt12GreaterThanOrEqualTo(String value) {
            addCriterion("WT12 >=", value, "wt12");
            return (Criteria) this;
        }

        public Criteria andWt12LessThan(String value) {
            addCriterion("WT12 <", value, "wt12");
            return (Criteria) this;
        }

        public Criteria andWt12LessThanOrEqualTo(String value) {
            addCriterion("WT12 <=", value, "wt12");
            return (Criteria) this;
        }

        public Criteria andWt12Like(String value) {
            addCriterion("WT12 like", value, "wt12");
            return (Criteria) this;
        }

        public Criteria andWt12NotLike(String value) {
            addCriterion("WT12 not like", value, "wt12");
            return (Criteria) this;
        }

        public Criteria andWt12In(List<String> values) {
            addCriterion("WT12 in", values, "wt12");
            return (Criteria) this;
        }

        public Criteria andWt12NotIn(List<String> values) {
            addCriterion("WT12 not in", values, "wt12");
            return (Criteria) this;
        }

        public Criteria andWt12Between(String value1, String value2) {
            addCriterion("WT12 between", value1, value2, "wt12");
            return (Criteria) this;
        }

        public Criteria andWt12NotBetween(String value1, String value2) {
            addCriterion("WT12 not between", value1, value2, "wt12");
            return (Criteria) this;
        }

        public Criteria andWt13IsNull() {
            addCriterion("WT13 is null");
            return (Criteria) this;
        }

        public Criteria andWt13IsNotNull() {
            addCriterion("WT13 is not null");
            return (Criteria) this;
        }

        public Criteria andWt13EqualTo(String value) {
            addCriterion("WT13 =", value, "wt13");
            return (Criteria) this;
        }

        public Criteria andWt13NotEqualTo(String value) {
            addCriterion("WT13 <>", value, "wt13");
            return (Criteria) this;
        }

        public Criteria andWt13GreaterThan(String value) {
            addCriterion("WT13 >", value, "wt13");
            return (Criteria) this;
        }

        public Criteria andWt13GreaterThanOrEqualTo(String value) {
            addCriterion("WT13 >=", value, "wt13");
            return (Criteria) this;
        }

        public Criteria andWt13LessThan(String value) {
            addCriterion("WT13 <", value, "wt13");
            return (Criteria) this;
        }

        public Criteria andWt13LessThanOrEqualTo(String value) {
            addCriterion("WT13 <=", value, "wt13");
            return (Criteria) this;
        }

        public Criteria andWt13Like(String value) {
            addCriterion("WT13 like", value, "wt13");
            return (Criteria) this;
        }

        public Criteria andWt13NotLike(String value) {
            addCriterion("WT13 not like", value, "wt13");
            return (Criteria) this;
        }

        public Criteria andWt13In(List<String> values) {
            addCriterion("WT13 in", values, "wt13");
            return (Criteria) this;
        }

        public Criteria andWt13NotIn(List<String> values) {
            addCriterion("WT13 not in", values, "wt13");
            return (Criteria) this;
        }

        public Criteria andWt13Between(String value1, String value2) {
            addCriterion("WT13 between", value1, value2, "wt13");
            return (Criteria) this;
        }

        public Criteria andWt13NotBetween(String value1, String value2) {
            addCriterion("WT13 not between", value1, value2, "wt13");
            return (Criteria) this;
        }

        public Criteria andWt14IsNull() {
            addCriterion("WT14 is null");
            return (Criteria) this;
        }

        public Criteria andWt14IsNotNull() {
            addCriterion("WT14 is not null");
            return (Criteria) this;
        }

        public Criteria andWt14EqualTo(String value) {
            addCriterion("WT14 =", value, "wt14");
            return (Criteria) this;
        }

        public Criteria andWt14NotEqualTo(String value) {
            addCriterion("WT14 <>", value, "wt14");
            return (Criteria) this;
        }

        public Criteria andWt14GreaterThan(String value) {
            addCriterion("WT14 >", value, "wt14");
            return (Criteria) this;
        }

        public Criteria andWt14GreaterThanOrEqualTo(String value) {
            addCriterion("WT14 >=", value, "wt14");
            return (Criteria) this;
        }

        public Criteria andWt14LessThan(String value) {
            addCriterion("WT14 <", value, "wt14");
            return (Criteria) this;
        }

        public Criteria andWt14LessThanOrEqualTo(String value) {
            addCriterion("WT14 <=", value, "wt14");
            return (Criteria) this;
        }

        public Criteria andWt14Like(String value) {
            addCriterion("WT14 like", value, "wt14");
            return (Criteria) this;
        }

        public Criteria andWt14NotLike(String value) {
            addCriterion("WT14 not like", value, "wt14");
            return (Criteria) this;
        }

        public Criteria andWt14In(List<String> values) {
            addCriterion("WT14 in", values, "wt14");
            return (Criteria) this;
        }

        public Criteria andWt14NotIn(List<String> values) {
            addCriterion("WT14 not in", values, "wt14");
            return (Criteria) this;
        }

        public Criteria andWt14Between(String value1, String value2) {
            addCriterion("WT14 between", value1, value2, "wt14");
            return (Criteria) this;
        }

        public Criteria andWt14NotBetween(String value1, String value2) {
            addCriterion("WT14 not between", value1, value2, "wt14");
            return (Criteria) this;
        }

        public Criteria andWt15IsNull() {
            addCriterion("WT15 is null");
            return (Criteria) this;
        }

        public Criteria andWt15IsNotNull() {
            addCriterion("WT15 is not null");
            return (Criteria) this;
        }

        public Criteria andWt15EqualTo(String value) {
            addCriterion("WT15 =", value, "wt15");
            return (Criteria) this;
        }

        public Criteria andWt15NotEqualTo(String value) {
            addCriterion("WT15 <>", value, "wt15");
            return (Criteria) this;
        }

        public Criteria andWt15GreaterThan(String value) {
            addCriterion("WT15 >", value, "wt15");
            return (Criteria) this;
        }

        public Criteria andWt15GreaterThanOrEqualTo(String value) {
            addCriterion("WT15 >=", value, "wt15");
            return (Criteria) this;
        }

        public Criteria andWt15LessThan(String value) {
            addCriterion("WT15 <", value, "wt15");
            return (Criteria) this;
        }

        public Criteria andWt15LessThanOrEqualTo(String value) {
            addCriterion("WT15 <=", value, "wt15");
            return (Criteria) this;
        }

        public Criteria andWt15Like(String value) {
            addCriterion("WT15 like", value, "wt15");
            return (Criteria) this;
        }

        public Criteria andWt15NotLike(String value) {
            addCriterion("WT15 not like", value, "wt15");
            return (Criteria) this;
        }

        public Criteria andWt15In(List<String> values) {
            addCriterion("WT15 in", values, "wt15");
            return (Criteria) this;
        }

        public Criteria andWt15NotIn(List<String> values) {
            addCriterion("WT15 not in", values, "wt15");
            return (Criteria) this;
        }

        public Criteria andWt15Between(String value1, String value2) {
            addCriterion("WT15 between", value1, value2, "wt15");
            return (Criteria) this;
        }

        public Criteria andWt15NotBetween(String value1, String value2) {
            addCriterion("WT15 not between", value1, value2, "wt15");
            return (Criteria) this;
        }

        public Criteria andWt16IsNull() {
            addCriterion("WT16 is null");
            return (Criteria) this;
        }

        public Criteria andWt16IsNotNull() {
            addCriterion("WT16 is not null");
            return (Criteria) this;
        }

        public Criteria andWt16EqualTo(String value) {
            addCriterion("WT16 =", value, "wt16");
            return (Criteria) this;
        }

        public Criteria andWt16NotEqualTo(String value) {
            addCriterion("WT16 <>", value, "wt16");
            return (Criteria) this;
        }

        public Criteria andWt16GreaterThan(String value) {
            addCriterion("WT16 >", value, "wt16");
            return (Criteria) this;
        }

        public Criteria andWt16GreaterThanOrEqualTo(String value) {
            addCriterion("WT16 >=", value, "wt16");
            return (Criteria) this;
        }

        public Criteria andWt16LessThan(String value) {
            addCriterion("WT16 <", value, "wt16");
            return (Criteria) this;
        }

        public Criteria andWt16LessThanOrEqualTo(String value) {
            addCriterion("WT16 <=", value, "wt16");
            return (Criteria) this;
        }

        public Criteria andWt16Like(String value) {
            addCriterion("WT16 like", value, "wt16");
            return (Criteria) this;
        }

        public Criteria andWt16NotLike(String value) {
            addCriterion("WT16 not like", value, "wt16");
            return (Criteria) this;
        }

        public Criteria andWt16In(List<String> values) {
            addCriterion("WT16 in", values, "wt16");
            return (Criteria) this;
        }

        public Criteria andWt16NotIn(List<String> values) {
            addCriterion("WT16 not in", values, "wt16");
            return (Criteria) this;
        }

        public Criteria andWt16Between(String value1, String value2) {
            addCriterion("WT16 between", value1, value2, "wt16");
            return (Criteria) this;
        }

        public Criteria andWt16NotBetween(String value1, String value2) {
            addCriterion("WT16 not between", value1, value2, "wt16");
            return (Criteria) this;
        }

        public Criteria andWt17IsNull() {
            addCriterion("WT17 is null");
            return (Criteria) this;
        }

        public Criteria andWt17IsNotNull() {
            addCriterion("WT17 is not null");
            return (Criteria) this;
        }

        public Criteria andWt17EqualTo(String value) {
            addCriterion("WT17 =", value, "wt17");
            return (Criteria) this;
        }

        public Criteria andWt17NotEqualTo(String value) {
            addCriterion("WT17 <>", value, "wt17");
            return (Criteria) this;
        }

        public Criteria andWt17GreaterThan(String value) {
            addCriterion("WT17 >", value, "wt17");
            return (Criteria) this;
        }

        public Criteria andWt17GreaterThanOrEqualTo(String value) {
            addCriterion("WT17 >=", value, "wt17");
            return (Criteria) this;
        }

        public Criteria andWt17LessThan(String value) {
            addCriterion("WT17 <", value, "wt17");
            return (Criteria) this;
        }

        public Criteria andWt17LessThanOrEqualTo(String value) {
            addCriterion("WT17 <=", value, "wt17");
            return (Criteria) this;
        }

        public Criteria andWt17Like(String value) {
            addCriterion("WT17 like", value, "wt17");
            return (Criteria) this;
        }

        public Criteria andWt17NotLike(String value) {
            addCriterion("WT17 not like", value, "wt17");
            return (Criteria) this;
        }

        public Criteria andWt17In(List<String> values) {
            addCriterion("WT17 in", values, "wt17");
            return (Criteria) this;
        }

        public Criteria andWt17NotIn(List<String> values) {
            addCriterion("WT17 not in", values, "wt17");
            return (Criteria) this;
        }

        public Criteria andWt17Between(String value1, String value2) {
            addCriterion("WT17 between", value1, value2, "wt17");
            return (Criteria) this;
        }

        public Criteria andWt17NotBetween(String value1, String value2) {
            addCriterion("WT17 not between", value1, value2, "wt17");
            return (Criteria) this;
        }

        public Criteria andWt18IsNull() {
            addCriterion("WT18 is null");
            return (Criteria) this;
        }

        public Criteria andWt18IsNotNull() {
            addCriterion("WT18 is not null");
            return (Criteria) this;
        }

        public Criteria andWt18EqualTo(Long value) {
            addCriterion("WT18 =", value, "wt18");
            return (Criteria) this;
        }

        public Criteria andWt18NotEqualTo(Long value) {
            addCriterion("WT18 <>", value, "wt18");
            return (Criteria) this;
        }

        public Criteria andWt18GreaterThan(Long value) {
            addCriterion("WT18 >", value, "wt18");
            return (Criteria) this;
        }

        public Criteria andWt18GreaterThanOrEqualTo(Long value) {
            addCriterion("WT18 >=", value, "wt18");
            return (Criteria) this;
        }

        public Criteria andWt18LessThan(Long value) {
            addCriterion("WT18 <", value, "wt18");
            return (Criteria) this;
        }

        public Criteria andWt18LessThanOrEqualTo(Long value) {
            addCriterion("WT18 <=", value, "wt18");
            return (Criteria) this;
        }

        public Criteria andWt18In(List<Long> values) {
            addCriterion("WT18 in", values, "wt18");
            return (Criteria) this;
        }

        public Criteria andWt18NotIn(List<Long> values) {
            addCriterion("WT18 not in", values, "wt18");
            return (Criteria) this;
        }

        public Criteria andWt18Between(Long value1, Long value2) {
            addCriterion("WT18 between", value1, value2, "wt18");
            return (Criteria) this;
        }

        public Criteria andWt18NotBetween(Long value1, Long value2) {
            addCriterion("WT18 not between", value1, value2, "wt18");
            return (Criteria) this;
        }

        public Criteria andWt19IsNull() {
            addCriterion("WT19 is null");
            return (Criteria) this;
        }

        public Criteria andWt19IsNotNull() {
            addCriterion("WT19 is not null");
            return (Criteria) this;
        }

        public Criteria andWt19EqualTo(String value) {
            addCriterion("WT19 =", value, "wt19");
            return (Criteria) this;
        }

        public Criteria andWt19NotEqualTo(String value) {
            addCriterion("WT19 <>", value, "wt19");
            return (Criteria) this;
        }

        public Criteria andWt19GreaterThan(String value) {
            addCriterion("WT19 >", value, "wt19");
            return (Criteria) this;
        }

        public Criteria andWt19GreaterThanOrEqualTo(String value) {
            addCriterion("WT19 >=", value, "wt19");
            return (Criteria) this;
        }

        public Criteria andWt19LessThan(String value) {
            addCriterion("WT19 <", value, "wt19");
            return (Criteria) this;
        }

        public Criteria andWt19LessThanOrEqualTo(String value) {
            addCriterion("WT19 <=", value, "wt19");
            return (Criteria) this;
        }

        public Criteria andWt19Like(String value) {
            addCriterion("WT19 like", value, "wt19");
            return (Criteria) this;
        }

        public Criteria andWt19NotLike(String value) {
            addCriterion("WT19 not like", value, "wt19");
            return (Criteria) this;
        }

        public Criteria andWt19In(List<String> values) {
            addCriterion("WT19 in", values, "wt19");
            return (Criteria) this;
        }

        public Criteria andWt19NotIn(List<String> values) {
            addCriterion("WT19 not in", values, "wt19");
            return (Criteria) this;
        }

        public Criteria andWt19Between(String value1, String value2) {
            addCriterion("WT19 between", value1, value2, "wt19");
            return (Criteria) this;
        }

        public Criteria andWt19NotBetween(String value1, String value2) {
            addCriterion("WT19 not between", value1, value2, "wt19");
            return (Criteria) this;
        }

        public Criteria andWt20IsNull() {
            addCriterion("WT20 is null");
            return (Criteria) this;
        }

        public Criteria andWt20IsNotNull() {
            addCriterion("WT20 is not null");
            return (Criteria) this;
        }

        public Criteria andWt20EqualTo(String value) {
            addCriterion("WT20 =", value, "wt20");
            return (Criteria) this;
        }

        public Criteria andWt20NotEqualTo(String value) {
            addCriterion("WT20 <>", value, "wt20");
            return (Criteria) this;
        }

        public Criteria andWt20GreaterThan(String value) {
            addCriterion("WT20 >", value, "wt20");
            return (Criteria) this;
        }

        public Criteria andWt20GreaterThanOrEqualTo(String value) {
            addCriterion("WT20 >=", value, "wt20");
            return (Criteria) this;
        }

        public Criteria andWt20LessThan(String value) {
            addCriterion("WT20 <", value, "wt20");
            return (Criteria) this;
        }

        public Criteria andWt20LessThanOrEqualTo(String value) {
            addCriterion("WT20 <=", value, "wt20");
            return (Criteria) this;
        }

        public Criteria andWt20Like(String value) {
            addCriterion("WT20 like", value, "wt20");
            return (Criteria) this;
        }

        public Criteria andWt20NotLike(String value) {
            addCriterion("WT20 not like", value, "wt20");
            return (Criteria) this;
        }

        public Criteria andWt20In(List<String> values) {
            addCriterion("WT20 in", values, "wt20");
            return (Criteria) this;
        }

        public Criteria andWt20NotIn(List<String> values) {
            addCriterion("WT20 not in", values, "wt20");
            return (Criteria) this;
        }

        public Criteria andWt20Between(String value1, String value2) {
            addCriterion("WT20 between", value1, value2, "wt20");
            return (Criteria) this;
        }

        public Criteria andWt20NotBetween(String value1, String value2) {
            addCriterion("WT20 not between", value1, value2, "wt20");
            return (Criteria) this;
        }

        public Criteria andWt21IsNull() {
            addCriterion("WT21 is null");
            return (Criteria) this;
        }

        public Criteria andWt21IsNotNull() {
            addCriterion("WT21 is not null");
            return (Criteria) this;
        }

        public Criteria andWt21EqualTo(String value) {
            addCriterion("WT21 =", value, "wt21");
            return (Criteria) this;
        }

        public Criteria andWt21NotEqualTo(String value) {
            addCriterion("WT21 <>", value, "wt21");
            return (Criteria) this;
        }

        public Criteria andWt21GreaterThan(String value) {
            addCriterion("WT21 >", value, "wt21");
            return (Criteria) this;
        }

        public Criteria andWt21GreaterThanOrEqualTo(String value) {
            addCriterion("WT21 >=", value, "wt21");
            return (Criteria) this;
        }

        public Criteria andWt21LessThan(String value) {
            addCriterion("WT21 <", value, "wt21");
            return (Criteria) this;
        }

        public Criteria andWt21LessThanOrEqualTo(String value) {
            addCriterion("WT21 <=", value, "wt21");
            return (Criteria) this;
        }

        public Criteria andWt21Like(String value) {
            addCriterion("WT21 like", value, "wt21");
            return (Criteria) this;
        }

        public Criteria andWt21NotLike(String value) {
            addCriterion("WT21 not like", value, "wt21");
            return (Criteria) this;
        }

        public Criteria andWt21In(List<String> values) {
            addCriterion("WT21 in", values, "wt21");
            return (Criteria) this;
        }

        public Criteria andWt21NotIn(List<String> values) {
            addCriterion("WT21 not in", values, "wt21");
            return (Criteria) this;
        }

        public Criteria andWt21Between(String value1, String value2) {
            addCriterion("WT21 between", value1, value2, "wt21");
            return (Criteria) this;
        }

        public Criteria andWt21NotBetween(String value1, String value2) {
            addCriterion("WT21 not between", value1, value2, "wt21");
            return (Criteria) this;
        }

        public Criteria andWt22IsNull() {
            addCriterion("WT22 is null");
            return (Criteria) this;
        }

        public Criteria andWt22IsNotNull() {
            addCriterion("WT22 is not null");
            return (Criteria) this;
        }

        public Criteria andWt22EqualTo(Long value) {
            addCriterion("WT22 =", value, "wt22");
            return (Criteria) this;
        }

        public Criteria andWt22NotEqualTo(Long value) {
            addCriterion("WT22 <>", value, "wt22");
            return (Criteria) this;
        }

        public Criteria andWt22GreaterThan(Long value) {
            addCriterion("WT22 >", value, "wt22");
            return (Criteria) this;
        }

        public Criteria andWt22GreaterThanOrEqualTo(Long value) {
            addCriterion("WT22 >=", value, "wt22");
            return (Criteria) this;
        }

        public Criteria andWt22LessThan(Long value) {
            addCriterion("WT22 <", value, "wt22");
            return (Criteria) this;
        }

        public Criteria andWt22LessThanOrEqualTo(Long value) {
            addCriterion("WT22 <=", value, "wt22");
            return (Criteria) this;
        }

        public Criteria andWt22In(List<Long> values) {
            addCriterion("WT22 in", values, "wt22");
            return (Criteria) this;
        }

        public Criteria andWt22NotIn(List<Long> values) {
            addCriterion("WT22 not in", values, "wt22");
            return (Criteria) this;
        }

        public Criteria andWt22Between(Long value1, Long value2) {
            addCriterion("WT22 between", value1, value2, "wt22");
            return (Criteria) this;
        }

        public Criteria andWt22NotBetween(Long value1, Long value2) {
            addCriterion("WT22 not between", value1, value2, "wt22");
            return (Criteria) this;
        }

        public Criteria andWt23IsNull() {
            addCriterion("WT23 is null");
            return (Criteria) this;
        }

        public Criteria andWt23IsNotNull() {
            addCriterion("WT23 is not null");
            return (Criteria) this;
        }

        public Criteria andWt23EqualTo(Long value) {
            addCriterion("WT23 =", value, "wt23");
            return (Criteria) this;
        }

        public Criteria andWt23NotEqualTo(Long value) {
            addCriterion("WT23 <>", value, "wt23");
            return (Criteria) this;
        }

        public Criteria andWt23GreaterThan(Long value) {
            addCriterion("WT23 >", value, "wt23");
            return (Criteria) this;
        }

        public Criteria andWt23GreaterThanOrEqualTo(Long value) {
            addCriterion("WT23 >=", value, "wt23");
            return (Criteria) this;
        }

        public Criteria andWt23LessThan(Long value) {
            addCriterion("WT23 <", value, "wt23");
            return (Criteria) this;
        }

        public Criteria andWt23LessThanOrEqualTo(Long value) {
            addCriterion("WT23 <=", value, "wt23");
            return (Criteria) this;
        }

        public Criteria andWt23In(List<Long> values) {
            addCriterion("WT23 in", values, "wt23");
            return (Criteria) this;
        }

        public Criteria andWt23NotIn(List<Long> values) {
            addCriterion("WT23 not in", values, "wt23");
            return (Criteria) this;
        }

        public Criteria andWt23Between(Long value1, Long value2) {
            addCriterion("WT23 between", value1, value2, "wt23");
            return (Criteria) this;
        }

        public Criteria andWt23NotBetween(Long value1, Long value2) {
            addCriterion("WT23 not between", value1, value2, "wt23");
            return (Criteria) this;
        }

        public Criteria andWt24IsNull() {
            addCriterion("WT24 is null");
            return (Criteria) this;
        }

        public Criteria andWt24IsNotNull() {
            addCriterion("WT24 is not null");
            return (Criteria) this;
        }

        public Criteria andWt24EqualTo(String value) {
            addCriterion("WT24 =", value, "wt24");
            return (Criteria) this;
        }

        public Criteria andWt24NotEqualTo(String value) {
            addCriterion("WT24 <>", value, "wt24");
            return (Criteria) this;
        }

        public Criteria andWt24GreaterThan(String value) {
            addCriterion("WT24 >", value, "wt24");
            return (Criteria) this;
        }

        public Criteria andWt24GreaterThanOrEqualTo(String value) {
            addCriterion("WT24 >=", value, "wt24");
            return (Criteria) this;
        }

        public Criteria andWt24LessThan(String value) {
            addCriterion("WT24 <", value, "wt24");
            return (Criteria) this;
        }

        public Criteria andWt24LessThanOrEqualTo(String value) {
            addCriterion("WT24 <=", value, "wt24");
            return (Criteria) this;
        }

        public Criteria andWt24Like(String value) {
            addCriterion("WT24 like", value, "wt24");
            return (Criteria) this;
        }

        public Criteria andWt24NotLike(String value) {
            addCriterion("WT24 not like", value, "wt24");
            return (Criteria) this;
        }

        public Criteria andWt24In(List<String> values) {
            addCriterion("WT24 in", values, "wt24");
            return (Criteria) this;
        }

        public Criteria andWt24NotIn(List<String> values) {
            addCriterion("WT24 not in", values, "wt24");
            return (Criteria) this;
        }

        public Criteria andWt24Between(String value1, String value2) {
            addCriterion("WT24 between", value1, value2, "wt24");
            return (Criteria) this;
        }

        public Criteria andWt24NotBetween(String value1, String value2) {
            addCriterion("WT24 not between", value1, value2, "wt24");
            return (Criteria) this;
        }

        public Criteria andWt25IsNull() {
            addCriterion("WT25 is null");
            return (Criteria) this;
        }

        public Criteria andWt25IsNotNull() {
            addCriterion("WT25 is not null");
            return (Criteria) this;
        }

        public Criteria andWt25EqualTo(String value) {
            addCriterion("WT25 =", value, "wt25");
            return (Criteria) this;
        }

        public Criteria andWt25NotEqualTo(String value) {
            addCriterion("WT25 <>", value, "wt25");
            return (Criteria) this;
        }

        public Criteria andWt25GreaterThan(String value) {
            addCriterion("WT25 >", value, "wt25");
            return (Criteria) this;
        }

        public Criteria andWt25GreaterThanOrEqualTo(String value) {
            addCriterion("WT25 >=", value, "wt25");
            return (Criteria) this;
        }

        public Criteria andWt25LessThan(String value) {
            addCriterion("WT25 <", value, "wt25");
            return (Criteria) this;
        }

        public Criteria andWt25LessThanOrEqualTo(String value) {
            addCriterion("WT25 <=", value, "wt25");
            return (Criteria) this;
        }

        public Criteria andWt25Like(String value) {
            addCriterion("WT25 like", value, "wt25");
            return (Criteria) this;
        }

        public Criteria andWt25NotLike(String value) {
            addCriterion("WT25 not like", value, "wt25");
            return (Criteria) this;
        }

        public Criteria andWt25In(List<String> values) {
            addCriterion("WT25 in", values, "wt25");
            return (Criteria) this;
        }

        public Criteria andWt25NotIn(List<String> values) {
            addCriterion("WT25 not in", values, "wt25");
            return (Criteria) this;
        }

        public Criteria andWt25Between(String value1, String value2) {
            addCriterion("WT25 between", value1, value2, "wt25");
            return (Criteria) this;
        }

        public Criteria andWt25NotBetween(String value1, String value2) {
            addCriterion("WT25 not between", value1, value2, "wt25");
            return (Criteria) this;
        }

        public Criteria andWt26IsNull() {
            addCriterion("WT26 is null");
            return (Criteria) this;
        }

        public Criteria andWt26IsNotNull() {
            addCriterion("WT26 is not null");
            return (Criteria) this;
        }

        public Criteria andWt26EqualTo(String value) {
            addCriterion("WT26 =", value, "wt26");
            return (Criteria) this;
        }

        public Criteria andWt26NotEqualTo(String value) {
            addCriterion("WT26 <>", value, "wt26");
            return (Criteria) this;
        }

        public Criteria andWt26GreaterThan(String value) {
            addCriterion("WT26 >", value, "wt26");
            return (Criteria) this;
        }

        public Criteria andWt26GreaterThanOrEqualTo(String value) {
            addCriterion("WT26 >=", value, "wt26");
            return (Criteria) this;
        }

        public Criteria andWt26LessThan(String value) {
            addCriterion("WT26 <", value, "wt26");
            return (Criteria) this;
        }

        public Criteria andWt26LessThanOrEqualTo(String value) {
            addCriterion("WT26 <=", value, "wt26");
            return (Criteria) this;
        }

        public Criteria andWt26Like(String value) {
            addCriterion("WT26 like", value, "wt26");
            return (Criteria) this;
        }

        public Criteria andWt26NotLike(String value) {
            addCriterion("WT26 not like", value, "wt26");
            return (Criteria) this;
        }

        public Criteria andWt26In(List<String> values) {
            addCriterion("WT26 in", values, "wt26");
            return (Criteria) this;
        }

        public Criteria andWt26NotIn(List<String> values) {
            addCriterion("WT26 not in", values, "wt26");
            return (Criteria) this;
        }

        public Criteria andWt26Between(String value1, String value2) {
            addCriterion("WT26 between", value1, value2, "wt26");
            return (Criteria) this;
        }

        public Criteria andWt26NotBetween(String value1, String value2) {
            addCriterion("WT26 not between", value1, value2, "wt26");
            return (Criteria) this;
        }

        public Criteria andWt27IsNull() {
            addCriterion("WT27 is null");
            return (Criteria) this;
        }

        public Criteria andWt27IsNotNull() {
            addCriterion("WT27 is not null");
            return (Criteria) this;
        }

        public Criteria andWt27EqualTo(String value) {
            addCriterion("WT27 =", value, "wt27");
            return (Criteria) this;
        }

        public Criteria andWt27NotEqualTo(String value) {
            addCriterion("WT27 <>", value, "wt27");
            return (Criteria) this;
        }

        public Criteria andWt27GreaterThan(String value) {
            addCriterion("WT27 >", value, "wt27");
            return (Criteria) this;
        }

        public Criteria andWt27GreaterThanOrEqualTo(String value) {
            addCriterion("WT27 >=", value, "wt27");
            return (Criteria) this;
        }

        public Criteria andWt27LessThan(String value) {
            addCriterion("WT27 <", value, "wt27");
            return (Criteria) this;
        }

        public Criteria andWt27LessThanOrEqualTo(String value) {
            addCriterion("WT27 <=", value, "wt27");
            return (Criteria) this;
        }

        public Criteria andWt27Like(String value) {
            addCriterion("WT27 like", value, "wt27");
            return (Criteria) this;
        }

        public Criteria andWt27NotLike(String value) {
            addCriterion("WT27 not like", value, "wt27");
            return (Criteria) this;
        }

        public Criteria andWt27In(List<String> values) {
            addCriterion("WT27 in", values, "wt27");
            return (Criteria) this;
        }

        public Criteria andWt27NotIn(List<String> values) {
            addCriterion("WT27 not in", values, "wt27");
            return (Criteria) this;
        }

        public Criteria andWt27Between(String value1, String value2) {
            addCriterion("WT27 between", value1, value2, "wt27");
            return (Criteria) this;
        }

        public Criteria andWt27NotBetween(String value1, String value2) {
            addCriterion("WT27 not between", value1, value2, "wt27");
            return (Criteria) this;
        }

        public Criteria andWt28IsNull() {
            addCriterion("WT28 is null");
            return (Criteria) this;
        }

        public Criteria andWt28IsNotNull() {
            addCriterion("WT28 is not null");
            return (Criteria) this;
        }

        public Criteria andWt28EqualTo(String value) {
            addCriterion("WT28 =", value, "wt28");
            return (Criteria) this;
        }

        public Criteria andWt28NotEqualTo(String value) {
            addCriterion("WT28 <>", value, "wt28");
            return (Criteria) this;
        }

        public Criteria andWt28GreaterThan(String value) {
            addCriterion("WT28 >", value, "wt28");
            return (Criteria) this;
        }

        public Criteria andWt28GreaterThanOrEqualTo(String value) {
            addCriterion("WT28 >=", value, "wt28");
            return (Criteria) this;
        }

        public Criteria andWt28LessThan(String value) {
            addCriterion("WT28 <", value, "wt28");
            return (Criteria) this;
        }

        public Criteria andWt28LessThanOrEqualTo(String value) {
            addCriterion("WT28 <=", value, "wt28");
            return (Criteria) this;
        }

        public Criteria andWt28Like(String value) {
            addCriterion("WT28 like", value, "wt28");
            return (Criteria) this;
        }

        public Criteria andWt28NotLike(String value) {
            addCriterion("WT28 not like", value, "wt28");
            return (Criteria) this;
        }

        public Criteria andWt28In(List<String> values) {
            addCriterion("WT28 in", values, "wt28");
            return (Criteria) this;
        }

        public Criteria andWt28NotIn(List<String> values) {
            addCriterion("WT28 not in", values, "wt28");
            return (Criteria) this;
        }

        public Criteria andWt28Between(String value1, String value2) {
            addCriterion("WT28 between", value1, value2, "wt28");
            return (Criteria) this;
        }

        public Criteria andWt28NotBetween(String value1, String value2) {
            addCriterion("WT28 not between", value1, value2, "wt28");
            return (Criteria) this;
        }

        public Criteria andWt29IsNull() {
            addCriterion("WT29 is null");
            return (Criteria) this;
        }

        public Criteria andWt29IsNotNull() {
            addCriterion("WT29 is not null");
            return (Criteria) this;
        }

        public Criteria andWt29EqualTo(String value) {
            addCriterion("WT29 =", value, "wt29");
            return (Criteria) this;
        }

        public Criteria andWt29NotEqualTo(String value) {
            addCriterion("WT29 <>", value, "wt29");
            return (Criteria) this;
        }

        public Criteria andWt29GreaterThan(String value) {
            addCriterion("WT29 >", value, "wt29");
            return (Criteria) this;
        }

        public Criteria andWt29GreaterThanOrEqualTo(String value) {
            addCriterion("WT29 >=", value, "wt29");
            return (Criteria) this;
        }

        public Criteria andWt29LessThan(String value) {
            addCriterion("WT29 <", value, "wt29");
            return (Criteria) this;
        }

        public Criteria andWt29LessThanOrEqualTo(String value) {
            addCriterion("WT29 <=", value, "wt29");
            return (Criteria) this;
        }

        public Criteria andWt29Like(String value) {
            addCriterion("WT29 like", value, "wt29");
            return (Criteria) this;
        }

        public Criteria andWt29NotLike(String value) {
            addCriterion("WT29 not like", value, "wt29");
            return (Criteria) this;
        }

        public Criteria andWt29In(List<String> values) {
            addCriterion("WT29 in", values, "wt29");
            return (Criteria) this;
        }

        public Criteria andWt29NotIn(List<String> values) {
            addCriterion("WT29 not in", values, "wt29");
            return (Criteria) this;
        }

        public Criteria andWt29Between(String value1, String value2) {
            addCriterion("WT29 between", value1, value2, "wt29");
            return (Criteria) this;
        }

        public Criteria andWt29NotBetween(String value1, String value2) {
            addCriterion("WT29 not between", value1, value2, "wt29");
            return (Criteria) this;
        }

        public Criteria andWt30IsNull() {
            addCriterion("WT30 is null");
            return (Criteria) this;
        }

        public Criteria andWt30IsNotNull() {
            addCriterion("WT30 is not null");
            return (Criteria) this;
        }

        public Criteria andWt30EqualTo(String value) {
            addCriterion("WT30 =", value, "wt30");
            return (Criteria) this;
        }

        public Criteria andWt30NotEqualTo(String value) {
            addCriterion("WT30 <>", value, "wt30");
            return (Criteria) this;
        }

        public Criteria andWt30GreaterThan(String value) {
            addCriterion("WT30 >", value, "wt30");
            return (Criteria) this;
        }

        public Criteria andWt30GreaterThanOrEqualTo(String value) {
            addCriterion("WT30 >=", value, "wt30");
            return (Criteria) this;
        }

        public Criteria andWt30LessThan(String value) {
            addCriterion("WT30 <", value, "wt30");
            return (Criteria) this;
        }

        public Criteria andWt30LessThanOrEqualTo(String value) {
            addCriterion("WT30 <=", value, "wt30");
            return (Criteria) this;
        }

        public Criteria andWt30Like(String value) {
            addCriterion("WT30 like", value, "wt30");
            return (Criteria) this;
        }

        public Criteria andWt30NotLike(String value) {
            addCriterion("WT30 not like", value, "wt30");
            return (Criteria) this;
        }

        public Criteria andWt30In(List<String> values) {
            addCriterion("WT30 in", values, "wt30");
            return (Criteria) this;
        }

        public Criteria andWt30NotIn(List<String> values) {
            addCriterion("WT30 not in", values, "wt30");
            return (Criteria) this;
        }

        public Criteria andWt30Between(String value1, String value2) {
            addCriterion("WT30 between", value1, value2, "wt30");
            return (Criteria) this;
        }

        public Criteria andWt30NotBetween(String value1, String value2) {
            addCriterion("WT30 not between", value1, value2, "wt30");
            return (Criteria) this;
        }

        public Criteria andWt31IsNull() {
            addCriterion("WT31 is null");
            return (Criteria) this;
        }

        public Criteria andWt31IsNotNull() {
            addCriterion("WT31 is not null");
            return (Criteria) this;
        }

        public Criteria andWt31EqualTo(Long value) {
            addCriterion("WT31 =", value, "wt31");
            return (Criteria) this;
        }

        public Criteria andWt31NotEqualTo(Long value) {
            addCriterion("WT31 <>", value, "wt31");
            return (Criteria) this;
        }

        public Criteria andWt31GreaterThan(Long value) {
            addCriterion("WT31 >", value, "wt31");
            return (Criteria) this;
        }

        public Criteria andWt31GreaterThanOrEqualTo(Long value) {
            addCriterion("WT31 >=", value, "wt31");
            return (Criteria) this;
        }

        public Criteria andWt31LessThan(Long value) {
            addCriterion("WT31 <", value, "wt31");
            return (Criteria) this;
        }

        public Criteria andWt31LessThanOrEqualTo(Long value) {
            addCriterion("WT31 <=", value, "wt31");
            return (Criteria) this;
        }

        public Criteria andWt31In(List<Long> values) {
            addCriterion("WT31 in", values, "wt31");
            return (Criteria) this;
        }

        public Criteria andWt31NotIn(List<Long> values) {
            addCriterion("WT31 not in", values, "wt31");
            return (Criteria) this;
        }

        public Criteria andWt31Between(Long value1, Long value2) {
            addCriterion("WT31 between", value1, value2, "wt31");
            return (Criteria) this;
        }

        public Criteria andWt31NotBetween(Long value1, Long value2) {
            addCriterion("WT31 not between", value1, value2, "wt31");
            return (Criteria) this;
        }

        public Criteria andWt32IsNull() {
            addCriterion("WT32 is null");
            return (Criteria) this;
        }

        public Criteria andWt32IsNotNull() {
            addCriterion("WT32 is not null");
            return (Criteria) this;
        }

        public Criteria andWt32EqualTo(String value) {
            addCriterion("WT32 =", value, "wt32");
            return (Criteria) this;
        }

        public Criteria andWt32NotEqualTo(String value) {
            addCriterion("WT32 <>", value, "wt32");
            return (Criteria) this;
        }

        public Criteria andWt32GreaterThan(String value) {
            addCriterion("WT32 >", value, "wt32");
            return (Criteria) this;
        }

        public Criteria andWt32GreaterThanOrEqualTo(String value) {
            addCriterion("WT32 >=", value, "wt32");
            return (Criteria) this;
        }

        public Criteria andWt32LessThan(String value) {
            addCriterion("WT32 <", value, "wt32");
            return (Criteria) this;
        }

        public Criteria andWt32LessThanOrEqualTo(String value) {
            addCriterion("WT32 <=", value, "wt32");
            return (Criteria) this;
        }

        public Criteria andWt32Like(String value) {
            addCriterion("WT32 like", value, "wt32");
            return (Criteria) this;
        }

        public Criteria andWt32NotLike(String value) {
            addCriterion("WT32 not like", value, "wt32");
            return (Criteria) this;
        }

        public Criteria andWt32In(List<String> values) {
            addCriterion("WT32 in", values, "wt32");
            return (Criteria) this;
        }

        public Criteria andWt32NotIn(List<String> values) {
            addCriterion("WT32 not in", values, "wt32");
            return (Criteria) this;
        }

        public Criteria andWt32Between(String value1, String value2) {
            addCriterion("WT32 between", value1, value2, "wt32");
            return (Criteria) this;
        }

        public Criteria andWt32NotBetween(String value1, String value2) {
            addCriterion("WT32 not between", value1, value2, "wt32");
            return (Criteria) this;
        }

        public Criteria andWt33IsNull() {
            addCriterion("WT33 is null");
            return (Criteria) this;
        }

        public Criteria andWt33IsNotNull() {
            addCriterion("WT33 is not null");
            return (Criteria) this;
        }

        public Criteria andWt33EqualTo(String value) {
            addCriterion("WT33 =", value, "wt33");
            return (Criteria) this;
        }

        public Criteria andWt33NotEqualTo(String value) {
            addCriterion("WT33 <>", value, "wt33");
            return (Criteria) this;
        }

        public Criteria andWt33GreaterThan(String value) {
            addCriterion("WT33 >", value, "wt33");
            return (Criteria) this;
        }

        public Criteria andWt33GreaterThanOrEqualTo(String value) {
            addCriterion("WT33 >=", value, "wt33");
            return (Criteria) this;
        }

        public Criteria andWt33LessThan(String value) {
            addCriterion("WT33 <", value, "wt33");
            return (Criteria) this;
        }

        public Criteria andWt33LessThanOrEqualTo(String value) {
            addCriterion("WT33 <=", value, "wt33");
            return (Criteria) this;
        }

        public Criteria andWt33Like(String value) {
            addCriterion("WT33 like", value, "wt33");
            return (Criteria) this;
        }

        public Criteria andWt33NotLike(String value) {
            addCriterion("WT33 not like", value, "wt33");
            return (Criteria) this;
        }

        public Criteria andWt33In(List<String> values) {
            addCriterion("WT33 in", values, "wt33");
            return (Criteria) this;
        }

        public Criteria andWt33NotIn(List<String> values) {
            addCriterion("WT33 not in", values, "wt33");
            return (Criteria) this;
        }

        public Criteria andWt33Between(String value1, String value2) {
            addCriterion("WT33 between", value1, value2, "wt33");
            return (Criteria) this;
        }

        public Criteria andWt33NotBetween(String value1, String value2) {
            addCriterion("WT33 not between", value1, value2, "wt33");
            return (Criteria) this;
        }

        public Criteria andWt34IsNull() {
            addCriterion("WT34 is null");
            return (Criteria) this;
        }

        public Criteria andWt34IsNotNull() {
            addCriterion("WT34 is not null");
            return (Criteria) this;
        }

        public Criteria andWt34EqualTo(String value) {
            addCriterion("WT34 =", value, "wt34");
            return (Criteria) this;
        }

        public Criteria andWt34NotEqualTo(String value) {
            addCriterion("WT34 <>", value, "wt34");
            return (Criteria) this;
        }

        public Criteria andWt34GreaterThan(String value) {
            addCriterion("WT34 >", value, "wt34");
            return (Criteria) this;
        }

        public Criteria andWt34GreaterThanOrEqualTo(String value) {
            addCriterion("WT34 >=", value, "wt34");
            return (Criteria) this;
        }

        public Criteria andWt34LessThan(String value) {
            addCriterion("WT34 <", value, "wt34");
            return (Criteria) this;
        }

        public Criteria andWt34LessThanOrEqualTo(String value) {
            addCriterion("WT34 <=", value, "wt34");
            return (Criteria) this;
        }

        public Criteria andWt34Like(String value) {
            addCriterion("WT34 like", value, "wt34");
            return (Criteria) this;
        }

        public Criteria andWt34NotLike(String value) {
            addCriterion("WT34 not like", value, "wt34");
            return (Criteria) this;
        }

        public Criteria andWt34In(List<String> values) {
            addCriterion("WT34 in", values, "wt34");
            return (Criteria) this;
        }

        public Criteria andWt34NotIn(List<String> values) {
            addCriterion("WT34 not in", values, "wt34");
            return (Criteria) this;
        }

        public Criteria andWt34Between(String value1, String value2) {
            addCriterion("WT34 between", value1, value2, "wt34");
            return (Criteria) this;
        }

        public Criteria andWt34NotBetween(String value1, String value2) {
            addCriterion("WT34 not between", value1, value2, "wt34");
            return (Criteria) this;
        }

        public Criteria andWt35IsNull() {
            addCriterion("WT35 is null");
            return (Criteria) this;
        }

        public Criteria andWt35IsNotNull() {
            addCriterion("WT35 is not null");
            return (Criteria) this;
        }

        public Criteria andWt35EqualTo(String value) {
            addCriterion("WT35 =", value, "wt35");
            return (Criteria) this;
        }

        public Criteria andWt35NotEqualTo(String value) {
            addCriterion("WT35 <>", value, "wt35");
            return (Criteria) this;
        }

        public Criteria andWt35GreaterThan(String value) {
            addCriterion("WT35 >", value, "wt35");
            return (Criteria) this;
        }

        public Criteria andWt35GreaterThanOrEqualTo(String value) {
            addCriterion("WT35 >=", value, "wt35");
            return (Criteria) this;
        }

        public Criteria andWt35LessThan(String value) {
            addCriterion("WT35 <", value, "wt35");
            return (Criteria) this;
        }

        public Criteria andWt35LessThanOrEqualTo(String value) {
            addCriterion("WT35 <=", value, "wt35");
            return (Criteria) this;
        }

        public Criteria andWt35Like(String value) {
            addCriterion("WT35 like", value, "wt35");
            return (Criteria) this;
        }

        public Criteria andWt35NotLike(String value) {
            addCriterion("WT35 not like", value, "wt35");
            return (Criteria) this;
        }

        public Criteria andWt35In(List<String> values) {
            addCriterion("WT35 in", values, "wt35");
            return (Criteria) this;
        }

        public Criteria andWt35NotIn(List<String> values) {
            addCriterion("WT35 not in", values, "wt35");
            return (Criteria) this;
        }

        public Criteria andWt35Between(String value1, String value2) {
            addCriterion("WT35 between", value1, value2, "wt35");
            return (Criteria) this;
        }

        public Criteria andWt35NotBetween(String value1, String value2) {
            addCriterion("WT35 not between", value1, value2, "wt35");
            return (Criteria) this;
        }

        public Criteria andWt36IsNull() {
            addCriterion("WT36 is null");
            return (Criteria) this;
        }

        public Criteria andWt36IsNotNull() {
            addCriterion("WT36 is not null");
            return (Criteria) this;
        }

        public Criteria andWt36EqualTo(String value) {
            addCriterion("WT36 =", value, "wt36");
            return (Criteria) this;
        }

        public Criteria andWt36NotEqualTo(String value) {
            addCriterion("WT36 <>", value, "wt36");
            return (Criteria) this;
        }

        public Criteria andWt36GreaterThan(String value) {
            addCriterion("WT36 >", value, "wt36");
            return (Criteria) this;
        }

        public Criteria andWt36GreaterThanOrEqualTo(String value) {
            addCriterion("WT36 >=", value, "wt36");
            return (Criteria) this;
        }

        public Criteria andWt36LessThan(String value) {
            addCriterion("WT36 <", value, "wt36");
            return (Criteria) this;
        }

        public Criteria andWt36LessThanOrEqualTo(String value) {
            addCriterion("WT36 <=", value, "wt36");
            return (Criteria) this;
        }

        public Criteria andWt36Like(String value) {
            addCriterion("WT36 like", value, "wt36");
            return (Criteria) this;
        }

        public Criteria andWt36NotLike(String value) {
            addCriterion("WT36 not like", value, "wt36");
            return (Criteria) this;
        }

        public Criteria andWt36In(List<String> values) {
            addCriterion("WT36 in", values, "wt36");
            return (Criteria) this;
        }

        public Criteria andWt36NotIn(List<String> values) {
            addCriterion("WT36 not in", values, "wt36");
            return (Criteria) this;
        }

        public Criteria andWt36Between(String value1, String value2) {
            addCriterion("WT36 between", value1, value2, "wt36");
            return (Criteria) this;
        }

        public Criteria andWt36NotBetween(String value1, String value2) {
            addCriterion("WT36 not between", value1, value2, "wt36");
            return (Criteria) this;
        }

        public Criteria andWt37IsNull() {
            addCriterion("WT37 is null");
            return (Criteria) this;
        }

        public Criteria andWt37IsNotNull() {
            addCriterion("WT37 is not null");
            return (Criteria) this;
        }

        public Criteria andWt37EqualTo(Long value) {
            addCriterion("WT37 =", value, "wt37");
            return (Criteria) this;
        }

        public Criteria andWt37NotEqualTo(Long value) {
            addCriterion("WT37 <>", value, "wt37");
            return (Criteria) this;
        }

        public Criteria andWt37GreaterThan(Long value) {
            addCriterion("WT37 >", value, "wt37");
            return (Criteria) this;
        }

        public Criteria andWt37GreaterThanOrEqualTo(Long value) {
            addCriterion("WT37 >=", value, "wt37");
            return (Criteria) this;
        }

        public Criteria andWt37LessThan(Long value) {
            addCriterion("WT37 <", value, "wt37");
            return (Criteria) this;
        }

        public Criteria andWt37LessThanOrEqualTo(Long value) {
            addCriterion("WT37 <=", value, "wt37");
            return (Criteria) this;
        }

        public Criteria andWt37In(List<Long> values) {
            addCriterion("WT37 in", values, "wt37");
            return (Criteria) this;
        }

        public Criteria andWt37NotIn(List<Long> values) {
            addCriterion("WT37 not in", values, "wt37");
            return (Criteria) this;
        }

        public Criteria andWt37Between(Long value1, Long value2) {
            addCriterion("WT37 between", value1, value2, "wt37");
            return (Criteria) this;
        }

        public Criteria andWt37NotBetween(Long value1, Long value2) {
            addCriterion("WT37 not between", value1, value2, "wt37");
            return (Criteria) this;
        }

        public Criteria andWt38IsNull() {
            addCriterion("WT38 is null");
            return (Criteria) this;
        }

        public Criteria andWt38IsNotNull() {
            addCriterion("WT38 is not null");
            return (Criteria) this;
        }

        public Criteria andWt38EqualTo(String value) {
            addCriterion("WT38 =", value, "wt38");
            return (Criteria) this;
        }

        public Criteria andWt38NotEqualTo(String value) {
            addCriterion("WT38 <>", value, "wt38");
            return (Criteria) this;
        }

        public Criteria andWt38GreaterThan(String value) {
            addCriterion("WT38 >", value, "wt38");
            return (Criteria) this;
        }

        public Criteria andWt38GreaterThanOrEqualTo(String value) {
            addCriterion("WT38 >=", value, "wt38");
            return (Criteria) this;
        }

        public Criteria andWt38LessThan(String value) {
            addCriterion("WT38 <", value, "wt38");
            return (Criteria) this;
        }

        public Criteria andWt38LessThanOrEqualTo(String value) {
            addCriterion("WT38 <=", value, "wt38");
            return (Criteria) this;
        }

        public Criteria andWt38Like(String value) {
            addCriterion("WT38 like", value, "wt38");
            return (Criteria) this;
        }

        public Criteria andWt38NotLike(String value) {
            addCriterion("WT38 not like", value, "wt38");
            return (Criteria) this;
        }

        public Criteria andWt38In(List<String> values) {
            addCriterion("WT38 in", values, "wt38");
            return (Criteria) this;
        }

        public Criteria andWt38NotIn(List<String> values) {
            addCriterion("WT38 not in", values, "wt38");
            return (Criteria) this;
        }

        public Criteria andWt38Between(String value1, String value2) {
            addCriterion("WT38 between", value1, value2, "wt38");
            return (Criteria) this;
        }

        public Criteria andWt38NotBetween(String value1, String value2) {
            addCriterion("WT38 not between", value1, value2, "wt38");
            return (Criteria) this;
        }

        public Criteria andWt39IsNull() {
            addCriterion("WT39 is null");
            return (Criteria) this;
        }

        public Criteria andWt39IsNotNull() {
            addCriterion("WT39 is not null");
            return (Criteria) this;
        }

        public Criteria andWt39EqualTo(String value) {
            addCriterion("WT39 =", value, "wt39");
            return (Criteria) this;
        }

        public Criteria andWt39NotEqualTo(String value) {
            addCriterion("WT39 <>", value, "wt39");
            return (Criteria) this;
        }

        public Criteria andWt39GreaterThan(String value) {
            addCriterion("WT39 >", value, "wt39");
            return (Criteria) this;
        }

        public Criteria andWt39GreaterThanOrEqualTo(String value) {
            addCriterion("WT39 >=", value, "wt39");
            return (Criteria) this;
        }

        public Criteria andWt39LessThan(String value) {
            addCriterion("WT39 <", value, "wt39");
            return (Criteria) this;
        }

        public Criteria andWt39LessThanOrEqualTo(String value) {
            addCriterion("WT39 <=", value, "wt39");
            return (Criteria) this;
        }

        public Criteria andWt39Like(String value) {
            addCriterion("WT39 like", value, "wt39");
            return (Criteria) this;
        }

        public Criteria andWt39NotLike(String value) {
            addCriterion("WT39 not like", value, "wt39");
            return (Criteria) this;
        }

        public Criteria andWt39In(List<String> values) {
            addCriterion("WT39 in", values, "wt39");
            return (Criteria) this;
        }

        public Criteria andWt39NotIn(List<String> values) {
            addCriterion("WT39 not in", values, "wt39");
            return (Criteria) this;
        }

        public Criteria andWt39Between(String value1, String value2) {
            addCriterion("WT39 between", value1, value2, "wt39");
            return (Criteria) this;
        }

        public Criteria andWt39NotBetween(String value1, String value2) {
            addCriterion("WT39 not between", value1, value2, "wt39");
            return (Criteria) this;
        }

        public Criteria andWt40IsNull() {
            addCriterion("WT40 is null");
            return (Criteria) this;
        }

        public Criteria andWt40IsNotNull() {
            addCriterion("WT40 is not null");
            return (Criteria) this;
        }

        public Criteria andWt40EqualTo(String value) {
            addCriterion("WT40 =", value, "wt40");
            return (Criteria) this;
        }

        public Criteria andWt40NotEqualTo(String value) {
            addCriterion("WT40 <>", value, "wt40");
            return (Criteria) this;
        }

        public Criteria andWt40GreaterThan(String value) {
            addCriterion("WT40 >", value, "wt40");
            return (Criteria) this;
        }

        public Criteria andWt40GreaterThanOrEqualTo(String value) {
            addCriterion("WT40 >=", value, "wt40");
            return (Criteria) this;
        }

        public Criteria andWt40LessThan(String value) {
            addCriterion("WT40 <", value, "wt40");
            return (Criteria) this;
        }

        public Criteria andWt40LessThanOrEqualTo(String value) {
            addCriterion("WT40 <=", value, "wt40");
            return (Criteria) this;
        }

        public Criteria andWt40Like(String value) {
            addCriterion("WT40 like", value, "wt40");
            return (Criteria) this;
        }

        public Criteria andWt40NotLike(String value) {
            addCriterion("WT40 not like", value, "wt40");
            return (Criteria) this;
        }

        public Criteria andWt40In(List<String> values) {
            addCriterion("WT40 in", values, "wt40");
            return (Criteria) this;
        }

        public Criteria andWt40NotIn(List<String> values) {
            addCriterion("WT40 not in", values, "wt40");
            return (Criteria) this;
        }

        public Criteria andWt40Between(String value1, String value2) {
            addCriterion("WT40 between", value1, value2, "wt40");
            return (Criteria) this;
        }

        public Criteria andWt40NotBetween(String value1, String value2) {
            addCriterion("WT40 not between", value1, value2, "wt40");
            return (Criteria) this;
        }

        public Criteria andIsdeployIsNull() {
            addCriterion("ISDEPLOY is null");
            return (Criteria) this;
        }

        public Criteria andIsdeployIsNotNull() {
            addCriterion("ISDEPLOY is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeployEqualTo(String value) {
            addCriterion("ISDEPLOY =", value, "isdeploy");
            return (Criteria) this;
        }

        public Criteria andIsdeployNotEqualTo(String value) {
            addCriterion("ISDEPLOY <>", value, "isdeploy");
            return (Criteria) this;
        }

        public Criteria andIsdeployGreaterThan(String value) {
            addCriterion("ISDEPLOY >", value, "isdeploy");
            return (Criteria) this;
        }

        public Criteria andIsdeployGreaterThanOrEqualTo(String value) {
            addCriterion("ISDEPLOY >=", value, "isdeploy");
            return (Criteria) this;
        }

        public Criteria andIsdeployLessThan(String value) {
            addCriterion("ISDEPLOY <", value, "isdeploy");
            return (Criteria) this;
        }

        public Criteria andIsdeployLessThanOrEqualTo(String value) {
            addCriterion("ISDEPLOY <=", value, "isdeploy");
            return (Criteria) this;
        }

        public Criteria andIsdeployLike(String value) {
            addCriterion("ISDEPLOY like", value, "isdeploy");
            return (Criteria) this;
        }

        public Criteria andIsdeployNotLike(String value) {
            addCriterion("ISDEPLOY not like", value, "isdeploy");
            return (Criteria) this;
        }

        public Criteria andIsdeployIn(List<String> values) {
            addCriterion("ISDEPLOY in", values, "isdeploy");
            return (Criteria) this;
        }

        public Criteria andIsdeployNotIn(List<String> values) {
            addCriterion("ISDEPLOY not in", values, "isdeploy");
            return (Criteria) this;
        }

        public Criteria andIsdeployBetween(String value1, String value2) {
            addCriterion("ISDEPLOY between", value1, value2, "isdeploy");
            return (Criteria) this;
        }

        public Criteria andIsdeployNotBetween(String value1, String value2) {
            addCriterion("ISDEPLOY not between", value1, value2, "isdeploy");
            return (Criteria) this;
        }

        public Criteria andItemsidIsNull() {
            addCriterion("ITEMSID is null");
            return (Criteria) this;
        }

        public Criteria andItemsidIsNotNull() {
            addCriterion("ITEMSID is not null");
            return (Criteria) this;
        }

        public Criteria andItemsidEqualTo(String value) {
            addCriterion("ITEMSID =", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidNotEqualTo(String value) {
            addCriterion("ITEMSID <>", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidGreaterThan(String value) {
            addCriterion("ITEMSID >", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMSID >=", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidLessThan(String value) {
            addCriterion("ITEMSID <", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidLessThanOrEqualTo(String value) {
            addCriterion("ITEMSID <=", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidLike(String value) {
            addCriterion("ITEMSID like", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidNotLike(String value) {
            addCriterion("ITEMSID not like", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidIn(List<String> values) {
            addCriterion("ITEMSID in", values, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidNotIn(List<String> values) {
            addCriterion("ITEMSID not in", values, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidBetween(String value1, String value2) {
            addCriterion("ITEMSID between", value1, value2, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidNotBetween(String value1, String value2) {
            addCriterion("ITEMSID not between", value1, value2, "itemsid");
            return (Criteria) this;
        }

        public Criteria andIsdeploydateIsNull() {
            addCriterion("ISDEPLOYDATE is null");
            return (Criteria) this;
        }

        public Criteria andIsdeploydateIsNotNull() {
            addCriterion("ISDEPLOYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeploydateEqualTo(String value) {
            addCriterion("ISDEPLOYDATE =", value, "isdeploydate");
            return (Criteria) this;
        }

        public Criteria andIsdeploydateNotEqualTo(String value) {
            addCriterion("ISDEPLOYDATE <>", value, "isdeploydate");
            return (Criteria) this;
        }

        public Criteria andIsdeploydateGreaterThan(String value) {
            addCriterion("ISDEPLOYDATE >", value, "isdeploydate");
            return (Criteria) this;
        }

        public Criteria andIsdeploydateGreaterThanOrEqualTo(String value) {
            addCriterion("ISDEPLOYDATE >=", value, "isdeploydate");
            return (Criteria) this;
        }

        public Criteria andIsdeploydateLessThan(String value) {
            addCriterion("ISDEPLOYDATE <", value, "isdeploydate");
            return (Criteria) this;
        }

        public Criteria andIsdeploydateLessThanOrEqualTo(String value) {
            addCriterion("ISDEPLOYDATE <=", value, "isdeploydate");
            return (Criteria) this;
        }

        public Criteria andIsdeploydateLike(String value) {
            addCriterion("ISDEPLOYDATE like", value, "isdeploydate");
            return (Criteria) this;
        }

        public Criteria andIsdeploydateNotLike(String value) {
            addCriterion("ISDEPLOYDATE not like", value, "isdeploydate");
            return (Criteria) this;
        }

        public Criteria andIsdeploydateIn(List<String> values) {
            addCriterion("ISDEPLOYDATE in", values, "isdeploydate");
            return (Criteria) this;
        }

        public Criteria andIsdeploydateNotIn(List<String> values) {
            addCriterion("ISDEPLOYDATE not in", values, "isdeploydate");
            return (Criteria) this;
        }

        public Criteria andIsdeploydateBetween(String value1, String value2) {
            addCriterion("ISDEPLOYDATE between", value1, value2, "isdeploydate");
            return (Criteria) this;
        }

        public Criteria andIsdeploydateNotBetween(String value1, String value2) {
            addCriterion("ISDEPLOYDATE not between", value1, value2, "isdeploydate");
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