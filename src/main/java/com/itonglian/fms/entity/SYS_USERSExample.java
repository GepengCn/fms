package com.itonglian.fms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SYS_USERSExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SYS_USERSExample() {
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

        public Criteria andSu00IsNull() {
            addCriterion("SU00 is null");
            return (Criteria) this;
        }

        public Criteria andSu00IsNotNull() {
            addCriterion("SU00 is not null");
            return (Criteria) this;
        }

        public Criteria andSu00EqualTo(Long value) {
            addCriterion("SU00 =", value, "su00");
            return (Criteria) this;
        }

        public Criteria andSu00NotEqualTo(Long value) {
            addCriterion("SU00 <>", value, "su00");
            return (Criteria) this;
        }

        public Criteria andSu00GreaterThan(Long value) {
            addCriterion("SU00 >", value, "su00");
            return (Criteria) this;
        }

        public Criteria andSu00GreaterThanOrEqualTo(Long value) {
            addCriterion("SU00 >=", value, "su00");
            return (Criteria) this;
        }

        public Criteria andSu00LessThan(Long value) {
            addCriterion("SU00 <", value, "su00");
            return (Criteria) this;
        }

        public Criteria andSu00LessThanOrEqualTo(Long value) {
            addCriterion("SU00 <=", value, "su00");
            return (Criteria) this;
        }

        public Criteria andSu00In(List<Long> values) {
            addCriterion("SU00 in", values, "su00");
            return (Criteria) this;
        }

        public Criteria andSu00NotIn(List<Long> values) {
            addCriterion("SU00 not in", values, "su00");
            return (Criteria) this;
        }

        public Criteria andSu00Between(Long value1, Long value2) {
            addCriterion("SU00 between", value1, value2, "su00");
            return (Criteria) this;
        }

        public Criteria andSu00NotBetween(Long value1, Long value2) {
            addCriterion("SU00 not between", value1, value2, "su00");
            return (Criteria) this;
        }

        public Criteria andSu01IsNull() {
            addCriterion("SU01 is null");
            return (Criteria) this;
        }

        public Criteria andSu01IsNotNull() {
            addCriterion("SU01 is not null");
            return (Criteria) this;
        }

        public Criteria andSu01EqualTo(String value) {
            addCriterion("SU01 =", value, "su01");
            return (Criteria) this;
        }

        public Criteria andSu01NotEqualTo(String value) {
            addCriterion("SU01 <>", value, "su01");
            return (Criteria) this;
        }

        public Criteria andSu01GreaterThan(String value) {
            addCriterion("SU01 >", value, "su01");
            return (Criteria) this;
        }

        public Criteria andSu01GreaterThanOrEqualTo(String value) {
            addCriterion("SU01 >=", value, "su01");
            return (Criteria) this;
        }

        public Criteria andSu01LessThan(String value) {
            addCriterion("SU01 <", value, "su01");
            return (Criteria) this;
        }

        public Criteria andSu01LessThanOrEqualTo(String value) {
            addCriterion("SU01 <=", value, "su01");
            return (Criteria) this;
        }

        public Criteria andSu01Like(String value) {
            addCriterion("SU01 like", value, "su01");
            return (Criteria) this;
        }

        public Criteria andSu01NotLike(String value) {
            addCriterion("SU01 not like", value, "su01");
            return (Criteria) this;
        }

        public Criteria andSu01In(List<String> values) {
            addCriterion("SU01 in", values, "su01");
            return (Criteria) this;
        }

        public Criteria andSu01NotIn(List<String> values) {
            addCriterion("SU01 not in", values, "su01");
            return (Criteria) this;
        }

        public Criteria andSu01Between(String value1, String value2) {
            addCriterion("SU01 between", value1, value2, "su01");
            return (Criteria) this;
        }

        public Criteria andSu01NotBetween(String value1, String value2) {
            addCriterion("SU01 not between", value1, value2, "su01");
            return (Criteria) this;
        }

        public Criteria andSu02IsNull() {
            addCriterion("SU02 is null");
            return (Criteria) this;
        }

        public Criteria andSu02IsNotNull() {
            addCriterion("SU02 is not null");
            return (Criteria) this;
        }

        public Criteria andSu02EqualTo(String value) {
            addCriterion("SU02 =", value, "su02");
            return (Criteria) this;
        }

        public Criteria andSu02NotEqualTo(String value) {
            addCriterion("SU02 <>", value, "su02");
            return (Criteria) this;
        }

        public Criteria andSu02GreaterThan(String value) {
            addCriterion("SU02 >", value, "su02");
            return (Criteria) this;
        }

        public Criteria andSu02GreaterThanOrEqualTo(String value) {
            addCriterion("SU02 >=", value, "su02");
            return (Criteria) this;
        }

        public Criteria andSu02LessThan(String value) {
            addCriterion("SU02 <", value, "su02");
            return (Criteria) this;
        }

        public Criteria andSu02LessThanOrEqualTo(String value) {
            addCriterion("SU02 <=", value, "su02");
            return (Criteria) this;
        }

        public Criteria andSu02Like(String value) {
            addCriterion("SU02 like", value, "su02");
            return (Criteria) this;
        }

        public Criteria andSu02NotLike(String value) {
            addCriterion("SU02 not like", value, "su02");
            return (Criteria) this;
        }

        public Criteria andSu02In(List<String> values) {
            addCriterion("SU02 in", values, "su02");
            return (Criteria) this;
        }

        public Criteria andSu02NotIn(List<String> values) {
            addCriterion("SU02 not in", values, "su02");
            return (Criteria) this;
        }

        public Criteria andSu02Between(String value1, String value2) {
            addCriterion("SU02 between", value1, value2, "su02");
            return (Criteria) this;
        }

        public Criteria andSu02NotBetween(String value1, String value2) {
            addCriterion("SU02 not between", value1, value2, "su02");
            return (Criteria) this;
        }

        public Criteria andSu03IsNull() {
            addCriterion("SU03 is null");
            return (Criteria) this;
        }

        public Criteria andSu03IsNotNull() {
            addCriterion("SU03 is not null");
            return (Criteria) this;
        }

        public Criteria andSu03EqualTo(String value) {
            addCriterion("SU03 =", value, "su03");
            return (Criteria) this;
        }

        public Criteria andSu03NotEqualTo(String value) {
            addCriterion("SU03 <>", value, "su03");
            return (Criteria) this;
        }

        public Criteria andSu03GreaterThan(String value) {
            addCriterion("SU03 >", value, "su03");
            return (Criteria) this;
        }

        public Criteria andSu03GreaterThanOrEqualTo(String value) {
            addCriterion("SU03 >=", value, "su03");
            return (Criteria) this;
        }

        public Criteria andSu03LessThan(String value) {
            addCriterion("SU03 <", value, "su03");
            return (Criteria) this;
        }

        public Criteria andSu03LessThanOrEqualTo(String value) {
            addCriterion("SU03 <=", value, "su03");
            return (Criteria) this;
        }

        public Criteria andSu03Like(String value) {
            addCriterion("SU03 like", value, "su03");
            return (Criteria) this;
        }

        public Criteria andSu03NotLike(String value) {
            addCriterion("SU03 not like", value, "su03");
            return (Criteria) this;
        }

        public Criteria andSu03In(List<String> values) {
            addCriterion("SU03 in", values, "su03");
            return (Criteria) this;
        }

        public Criteria andSu03NotIn(List<String> values) {
            addCriterion("SU03 not in", values, "su03");
            return (Criteria) this;
        }

        public Criteria andSu03Between(String value1, String value2) {
            addCriterion("SU03 between", value1, value2, "su03");
            return (Criteria) this;
        }

        public Criteria andSu03NotBetween(String value1, String value2) {
            addCriterion("SU03 not between", value1, value2, "su03");
            return (Criteria) this;
        }

        public Criteria andSu04IsNull() {
            addCriterion("SU04 is null");
            return (Criteria) this;
        }

        public Criteria andSu04IsNotNull() {
            addCriterion("SU04 is not null");
            return (Criteria) this;
        }

        public Criteria andSu04EqualTo(String value) {
            addCriterion("SU04 =", value, "su04");
            return (Criteria) this;
        }

        public Criteria andSu04NotEqualTo(String value) {
            addCriterion("SU04 <>", value, "su04");
            return (Criteria) this;
        }

        public Criteria andSu04GreaterThan(String value) {
            addCriterion("SU04 >", value, "su04");
            return (Criteria) this;
        }

        public Criteria andSu04GreaterThanOrEqualTo(String value) {
            addCriterion("SU04 >=", value, "su04");
            return (Criteria) this;
        }

        public Criteria andSu04LessThan(String value) {
            addCriterion("SU04 <", value, "su04");
            return (Criteria) this;
        }

        public Criteria andSu04LessThanOrEqualTo(String value) {
            addCriterion("SU04 <=", value, "su04");
            return (Criteria) this;
        }

        public Criteria andSu04Like(String value) {
            addCriterion("SU04 like", value, "su04");
            return (Criteria) this;
        }

        public Criteria andSu04NotLike(String value) {
            addCriterion("SU04 not like", value, "su04");
            return (Criteria) this;
        }

        public Criteria andSu04In(List<String> values) {
            addCriterion("SU04 in", values, "su04");
            return (Criteria) this;
        }

        public Criteria andSu04NotIn(List<String> values) {
            addCriterion("SU04 not in", values, "su04");
            return (Criteria) this;
        }

        public Criteria andSu04Between(String value1, String value2) {
            addCriterion("SU04 between", value1, value2, "su04");
            return (Criteria) this;
        }

        public Criteria andSu04NotBetween(String value1, String value2) {
            addCriterion("SU04 not between", value1, value2, "su04");
            return (Criteria) this;
        }

        public Criteria andSu05IsNull() {
            addCriterion("SU05 is null");
            return (Criteria) this;
        }

        public Criteria andSu05IsNotNull() {
            addCriterion("SU05 is not null");
            return (Criteria) this;
        }

        public Criteria andSu05EqualTo(String value) {
            addCriterion("SU05 =", value, "su05");
            return (Criteria) this;
        }

        public Criteria andSu05NotEqualTo(String value) {
            addCriterion("SU05 <>", value, "su05");
            return (Criteria) this;
        }

        public Criteria andSu05GreaterThan(String value) {
            addCriterion("SU05 >", value, "su05");
            return (Criteria) this;
        }

        public Criteria andSu05GreaterThanOrEqualTo(String value) {
            addCriterion("SU05 >=", value, "su05");
            return (Criteria) this;
        }

        public Criteria andSu05LessThan(String value) {
            addCriterion("SU05 <", value, "su05");
            return (Criteria) this;
        }

        public Criteria andSu05LessThanOrEqualTo(String value) {
            addCriterion("SU05 <=", value, "su05");
            return (Criteria) this;
        }

        public Criteria andSu05Like(String value) {
            addCriterion("SU05 like", value, "su05");
            return (Criteria) this;
        }

        public Criteria andSu05NotLike(String value) {
            addCriterion("SU05 not like", value, "su05");
            return (Criteria) this;
        }

        public Criteria andSu05In(List<String> values) {
            addCriterion("SU05 in", values, "su05");
            return (Criteria) this;
        }

        public Criteria andSu05NotIn(List<String> values) {
            addCriterion("SU05 not in", values, "su05");
            return (Criteria) this;
        }

        public Criteria andSu05Between(String value1, String value2) {
            addCriterion("SU05 between", value1, value2, "su05");
            return (Criteria) this;
        }

        public Criteria andSu05NotBetween(String value1, String value2) {
            addCriterion("SU05 not between", value1, value2, "su05");
            return (Criteria) this;
        }

        public Criteria andSu06IsNull() {
            addCriterion("SU06 is null");
            return (Criteria) this;
        }

        public Criteria andSu06IsNotNull() {
            addCriterion("SU06 is not null");
            return (Criteria) this;
        }

        public Criteria andSu06EqualTo(String value) {
            addCriterion("SU06 =", value, "su06");
            return (Criteria) this;
        }

        public Criteria andSu06NotEqualTo(String value) {
            addCriterion("SU06 <>", value, "su06");
            return (Criteria) this;
        }

        public Criteria andSu06GreaterThan(String value) {
            addCriterion("SU06 >", value, "su06");
            return (Criteria) this;
        }

        public Criteria andSu06GreaterThanOrEqualTo(String value) {
            addCriterion("SU06 >=", value, "su06");
            return (Criteria) this;
        }

        public Criteria andSu06LessThan(String value) {
            addCriterion("SU06 <", value, "su06");
            return (Criteria) this;
        }

        public Criteria andSu06LessThanOrEqualTo(String value) {
            addCriterion("SU06 <=", value, "su06");
            return (Criteria) this;
        }

        public Criteria andSu06Like(String value) {
            addCriterion("SU06 like", value, "su06");
            return (Criteria) this;
        }

        public Criteria andSu06NotLike(String value) {
            addCriterion("SU06 not like", value, "su06");
            return (Criteria) this;
        }

        public Criteria andSu06In(List<String> values) {
            addCriterion("SU06 in", values, "su06");
            return (Criteria) this;
        }

        public Criteria andSu06NotIn(List<String> values) {
            addCriterion("SU06 not in", values, "su06");
            return (Criteria) this;
        }

        public Criteria andSu06Between(String value1, String value2) {
            addCriterion("SU06 between", value1, value2, "su06");
            return (Criteria) this;
        }

        public Criteria andSu06NotBetween(String value1, String value2) {
            addCriterion("SU06 not between", value1, value2, "su06");
            return (Criteria) this;
        }

        public Criteria andSu07IsNull() {
            addCriterion("SU07 is null");
            return (Criteria) this;
        }

        public Criteria andSu07IsNotNull() {
            addCriterion("SU07 is not null");
            return (Criteria) this;
        }

        public Criteria andSu07EqualTo(String value) {
            addCriterion("SU07 =", value, "su07");
            return (Criteria) this;
        }

        public Criteria andSu07NotEqualTo(String value) {
            addCriterion("SU07 <>", value, "su07");
            return (Criteria) this;
        }

        public Criteria andSu07GreaterThan(String value) {
            addCriterion("SU07 >", value, "su07");
            return (Criteria) this;
        }

        public Criteria andSu07GreaterThanOrEqualTo(String value) {
            addCriterion("SU07 >=", value, "su07");
            return (Criteria) this;
        }

        public Criteria andSu07LessThan(String value) {
            addCriterion("SU07 <", value, "su07");
            return (Criteria) this;
        }

        public Criteria andSu07LessThanOrEqualTo(String value) {
            addCriterion("SU07 <=", value, "su07");
            return (Criteria) this;
        }

        public Criteria andSu07Like(String value) {
            addCriterion("SU07 like", value, "su07");
            return (Criteria) this;
        }

        public Criteria andSu07NotLike(String value) {
            addCriterion("SU07 not like", value, "su07");
            return (Criteria) this;
        }

        public Criteria andSu07In(List<String> values) {
            addCriterion("SU07 in", values, "su07");
            return (Criteria) this;
        }

        public Criteria andSu07NotIn(List<String> values) {
            addCriterion("SU07 not in", values, "su07");
            return (Criteria) this;
        }

        public Criteria andSu07Between(String value1, String value2) {
            addCriterion("SU07 between", value1, value2, "su07");
            return (Criteria) this;
        }

        public Criteria andSu07NotBetween(String value1, String value2) {
            addCriterion("SU07 not between", value1, value2, "su07");
            return (Criteria) this;
        }

        public Criteria andSu08IsNull() {
            addCriterion("SU08 is null");
            return (Criteria) this;
        }

        public Criteria andSu08IsNotNull() {
            addCriterion("SU08 is not null");
            return (Criteria) this;
        }

        public Criteria andSu08EqualTo(String value) {
            addCriterion("SU08 =", value, "su08");
            return (Criteria) this;
        }

        public Criteria andSu08NotEqualTo(String value) {
            addCriterion("SU08 <>", value, "su08");
            return (Criteria) this;
        }

        public Criteria andSu08GreaterThan(String value) {
            addCriterion("SU08 >", value, "su08");
            return (Criteria) this;
        }

        public Criteria andSu08GreaterThanOrEqualTo(String value) {
            addCriterion("SU08 >=", value, "su08");
            return (Criteria) this;
        }

        public Criteria andSu08LessThan(String value) {
            addCriterion("SU08 <", value, "su08");
            return (Criteria) this;
        }

        public Criteria andSu08LessThanOrEqualTo(String value) {
            addCriterion("SU08 <=", value, "su08");
            return (Criteria) this;
        }

        public Criteria andSu08Like(String value) {
            addCriterion("SU08 like", value, "su08");
            return (Criteria) this;
        }

        public Criteria andSu08NotLike(String value) {
            addCriterion("SU08 not like", value, "su08");
            return (Criteria) this;
        }

        public Criteria andSu08In(List<String> values) {
            addCriterion("SU08 in", values, "su08");
            return (Criteria) this;
        }

        public Criteria andSu08NotIn(List<String> values) {
            addCriterion("SU08 not in", values, "su08");
            return (Criteria) this;
        }

        public Criteria andSu08Between(String value1, String value2) {
            addCriterion("SU08 between", value1, value2, "su08");
            return (Criteria) this;
        }

        public Criteria andSu08NotBetween(String value1, String value2) {
            addCriterion("SU08 not between", value1, value2, "su08");
            return (Criteria) this;
        }

        public Criteria andSu09IsNull() {
            addCriterion("SU09 is null");
            return (Criteria) this;
        }

        public Criteria andSu09IsNotNull() {
            addCriterion("SU09 is not null");
            return (Criteria) this;
        }

        public Criteria andSu09EqualTo(String value) {
            addCriterion("SU09 =", value, "su09");
            return (Criteria) this;
        }

        public Criteria andSu09NotEqualTo(String value) {
            addCriterion("SU09 <>", value, "su09");
            return (Criteria) this;
        }

        public Criteria andSu09GreaterThan(String value) {
            addCriterion("SU09 >", value, "su09");
            return (Criteria) this;
        }

        public Criteria andSu09GreaterThanOrEqualTo(String value) {
            addCriterion("SU09 >=", value, "su09");
            return (Criteria) this;
        }

        public Criteria andSu09LessThan(String value) {
            addCriterion("SU09 <", value, "su09");
            return (Criteria) this;
        }

        public Criteria andSu09LessThanOrEqualTo(String value) {
            addCriterion("SU09 <=", value, "su09");
            return (Criteria) this;
        }

        public Criteria andSu09Like(String value) {
            addCriterion("SU09 like", value, "su09");
            return (Criteria) this;
        }

        public Criteria andSu09NotLike(String value) {
            addCriterion("SU09 not like", value, "su09");
            return (Criteria) this;
        }

        public Criteria andSu09In(List<String> values) {
            addCriterion("SU09 in", values, "su09");
            return (Criteria) this;
        }

        public Criteria andSu09NotIn(List<String> values) {
            addCriterion("SU09 not in", values, "su09");
            return (Criteria) this;
        }

        public Criteria andSu09Between(String value1, String value2) {
            addCriterion("SU09 between", value1, value2, "su09");
            return (Criteria) this;
        }

        public Criteria andSu09NotBetween(String value1, String value2) {
            addCriterion("SU09 not between", value1, value2, "su09");
            return (Criteria) this;
        }

        public Criteria andSu10IsNull() {
            addCriterion("SU10 is null");
            return (Criteria) this;
        }

        public Criteria andSu10IsNotNull() {
            addCriterion("SU10 is not null");
            return (Criteria) this;
        }

        public Criteria andSu10EqualTo(String value) {
            addCriterion("SU10 =", value, "su10");
            return (Criteria) this;
        }

        public Criteria andSu10NotEqualTo(String value) {
            addCriterion("SU10 <>", value, "su10");
            return (Criteria) this;
        }

        public Criteria andSu10GreaterThan(String value) {
            addCriterion("SU10 >", value, "su10");
            return (Criteria) this;
        }

        public Criteria andSu10GreaterThanOrEqualTo(String value) {
            addCriterion("SU10 >=", value, "su10");
            return (Criteria) this;
        }

        public Criteria andSu10LessThan(String value) {
            addCriterion("SU10 <", value, "su10");
            return (Criteria) this;
        }

        public Criteria andSu10LessThanOrEqualTo(String value) {
            addCriterion("SU10 <=", value, "su10");
            return (Criteria) this;
        }

        public Criteria andSu10Like(String value) {
            addCriterion("SU10 like", value, "su10");
            return (Criteria) this;
        }

        public Criteria andSu10NotLike(String value) {
            addCriterion("SU10 not like", value, "su10");
            return (Criteria) this;
        }

        public Criteria andSu10In(List<String> values) {
            addCriterion("SU10 in", values, "su10");
            return (Criteria) this;
        }

        public Criteria andSu10NotIn(List<String> values) {
            addCriterion("SU10 not in", values, "su10");
            return (Criteria) this;
        }

        public Criteria andSu10Between(String value1, String value2) {
            addCriterion("SU10 between", value1, value2, "su10");
            return (Criteria) this;
        }

        public Criteria andSu10NotBetween(String value1, String value2) {
            addCriterion("SU10 not between", value1, value2, "su10");
            return (Criteria) this;
        }

        public Criteria andSu11IsNull() {
            addCriterion("SU11 is null");
            return (Criteria) this;
        }

        public Criteria andSu11IsNotNull() {
            addCriterion("SU11 is not null");
            return (Criteria) this;
        }

        public Criteria andSu11EqualTo(String value) {
            addCriterion("SU11 =", value, "su11");
            return (Criteria) this;
        }

        public Criteria andSu11NotEqualTo(String value) {
            addCriterion("SU11 <>", value, "su11");
            return (Criteria) this;
        }

        public Criteria andSu11GreaterThan(String value) {
            addCriterion("SU11 >", value, "su11");
            return (Criteria) this;
        }

        public Criteria andSu11GreaterThanOrEqualTo(String value) {
            addCriterion("SU11 >=", value, "su11");
            return (Criteria) this;
        }

        public Criteria andSu11LessThan(String value) {
            addCriterion("SU11 <", value, "su11");
            return (Criteria) this;
        }

        public Criteria andSu11LessThanOrEqualTo(String value) {
            addCriterion("SU11 <=", value, "su11");
            return (Criteria) this;
        }

        public Criteria andSu11Like(String value) {
            addCriterion("SU11 like", value, "su11");
            return (Criteria) this;
        }

        public Criteria andSu11NotLike(String value) {
            addCriterion("SU11 not like", value, "su11");
            return (Criteria) this;
        }

        public Criteria andSu11In(List<String> values) {
            addCriterion("SU11 in", values, "su11");
            return (Criteria) this;
        }

        public Criteria andSu11NotIn(List<String> values) {
            addCriterion("SU11 not in", values, "su11");
            return (Criteria) this;
        }

        public Criteria andSu11Between(String value1, String value2) {
            addCriterion("SU11 between", value1, value2, "su11");
            return (Criteria) this;
        }

        public Criteria andSu11NotBetween(String value1, String value2) {
            addCriterion("SU11 not between", value1, value2, "su11");
            return (Criteria) this;
        }

        public Criteria andSu12IsNull() {
            addCriterion("SU12 is null");
            return (Criteria) this;
        }

        public Criteria andSu12IsNotNull() {
            addCriterion("SU12 is not null");
            return (Criteria) this;
        }

        public Criteria andSu12EqualTo(String value) {
            addCriterion("SU12 =", value, "su12");
            return (Criteria) this;
        }

        public Criteria andSu12NotEqualTo(String value) {
            addCriterion("SU12 <>", value, "su12");
            return (Criteria) this;
        }

        public Criteria andSu12GreaterThan(String value) {
            addCriterion("SU12 >", value, "su12");
            return (Criteria) this;
        }

        public Criteria andSu12GreaterThanOrEqualTo(String value) {
            addCriterion("SU12 >=", value, "su12");
            return (Criteria) this;
        }

        public Criteria andSu12LessThan(String value) {
            addCriterion("SU12 <", value, "su12");
            return (Criteria) this;
        }

        public Criteria andSu12LessThanOrEqualTo(String value) {
            addCriterion("SU12 <=", value, "su12");
            return (Criteria) this;
        }

        public Criteria andSu12Like(String value) {
            addCriterion("SU12 like", value, "su12");
            return (Criteria) this;
        }

        public Criteria andSu12NotLike(String value) {
            addCriterion("SU12 not like", value, "su12");
            return (Criteria) this;
        }

        public Criteria andSu12In(List<String> values) {
            addCriterion("SU12 in", values, "su12");
            return (Criteria) this;
        }

        public Criteria andSu12NotIn(List<String> values) {
            addCriterion("SU12 not in", values, "su12");
            return (Criteria) this;
        }

        public Criteria andSu12Between(String value1, String value2) {
            addCriterion("SU12 between", value1, value2, "su12");
            return (Criteria) this;
        }

        public Criteria andSu12NotBetween(String value1, String value2) {
            addCriterion("SU12 not between", value1, value2, "su12");
            return (Criteria) this;
        }

        public Criteria andSu13IsNull() {
            addCriterion("SU13 is null");
            return (Criteria) this;
        }

        public Criteria andSu13IsNotNull() {
            addCriterion("SU13 is not null");
            return (Criteria) this;
        }

        public Criteria andSu13EqualTo(String value) {
            addCriterion("SU13 =", value, "su13");
            return (Criteria) this;
        }

        public Criteria andSu13NotEqualTo(String value) {
            addCriterion("SU13 <>", value, "su13");
            return (Criteria) this;
        }

        public Criteria andSu13GreaterThan(String value) {
            addCriterion("SU13 >", value, "su13");
            return (Criteria) this;
        }

        public Criteria andSu13GreaterThanOrEqualTo(String value) {
            addCriterion("SU13 >=", value, "su13");
            return (Criteria) this;
        }

        public Criteria andSu13LessThan(String value) {
            addCriterion("SU13 <", value, "su13");
            return (Criteria) this;
        }

        public Criteria andSu13LessThanOrEqualTo(String value) {
            addCriterion("SU13 <=", value, "su13");
            return (Criteria) this;
        }

        public Criteria andSu13Like(String value) {
            addCriterion("SU13 like", value, "su13");
            return (Criteria) this;
        }

        public Criteria andSu13NotLike(String value) {
            addCriterion("SU13 not like", value, "su13");
            return (Criteria) this;
        }

        public Criteria andSu13In(List<String> values) {
            addCriterion("SU13 in", values, "su13");
            return (Criteria) this;
        }

        public Criteria andSu13NotIn(List<String> values) {
            addCriterion("SU13 not in", values, "su13");
            return (Criteria) this;
        }

        public Criteria andSu13Between(String value1, String value2) {
            addCriterion("SU13 between", value1, value2, "su13");
            return (Criteria) this;
        }

        public Criteria andSu13NotBetween(String value1, String value2) {
            addCriterion("SU13 not between", value1, value2, "su13");
            return (Criteria) this;
        }

        public Criteria andSu14IsNull() {
            addCriterion("SU14 is null");
            return (Criteria) this;
        }

        public Criteria andSu14IsNotNull() {
            addCriterion("SU14 is not null");
            return (Criteria) this;
        }

        public Criteria andSu14EqualTo(String value) {
            addCriterion("SU14 =", value, "su14");
            return (Criteria) this;
        }

        public Criteria andSu14NotEqualTo(String value) {
            addCriterion("SU14 <>", value, "su14");
            return (Criteria) this;
        }

        public Criteria andSu14GreaterThan(String value) {
            addCriterion("SU14 >", value, "su14");
            return (Criteria) this;
        }

        public Criteria andSu14GreaterThanOrEqualTo(String value) {
            addCriterion("SU14 >=", value, "su14");
            return (Criteria) this;
        }

        public Criteria andSu14LessThan(String value) {
            addCriterion("SU14 <", value, "su14");
            return (Criteria) this;
        }

        public Criteria andSu14LessThanOrEqualTo(String value) {
            addCriterion("SU14 <=", value, "su14");
            return (Criteria) this;
        }

        public Criteria andSu14Like(String value) {
            addCriterion("SU14 like", value, "su14");
            return (Criteria) this;
        }

        public Criteria andSu14NotLike(String value) {
            addCriterion("SU14 not like", value, "su14");
            return (Criteria) this;
        }

        public Criteria andSu14In(List<String> values) {
            addCriterion("SU14 in", values, "su14");
            return (Criteria) this;
        }

        public Criteria andSu14NotIn(List<String> values) {
            addCriterion("SU14 not in", values, "su14");
            return (Criteria) this;
        }

        public Criteria andSu14Between(String value1, String value2) {
            addCriterion("SU14 between", value1, value2, "su14");
            return (Criteria) this;
        }

        public Criteria andSu14NotBetween(String value1, String value2) {
            addCriterion("SU14 not between", value1, value2, "su14");
            return (Criteria) this;
        }

        public Criteria andSu15IsNull() {
            addCriterion("SU15 is null");
            return (Criteria) this;
        }

        public Criteria andSu15IsNotNull() {
            addCriterion("SU15 is not null");
            return (Criteria) this;
        }

        public Criteria andSu15EqualTo(String value) {
            addCriterion("SU15 =", value, "su15");
            return (Criteria) this;
        }

        public Criteria andSu15NotEqualTo(String value) {
            addCriterion("SU15 <>", value, "su15");
            return (Criteria) this;
        }

        public Criteria andSu15GreaterThan(String value) {
            addCriterion("SU15 >", value, "su15");
            return (Criteria) this;
        }

        public Criteria andSu15GreaterThanOrEqualTo(String value) {
            addCriterion("SU15 >=", value, "su15");
            return (Criteria) this;
        }

        public Criteria andSu15LessThan(String value) {
            addCriterion("SU15 <", value, "su15");
            return (Criteria) this;
        }

        public Criteria andSu15LessThanOrEqualTo(String value) {
            addCriterion("SU15 <=", value, "su15");
            return (Criteria) this;
        }

        public Criteria andSu15Like(String value) {
            addCriterion("SU15 like", value, "su15");
            return (Criteria) this;
        }

        public Criteria andSu15NotLike(String value) {
            addCriterion("SU15 not like", value, "su15");
            return (Criteria) this;
        }

        public Criteria andSu15In(List<String> values) {
            addCriterion("SU15 in", values, "su15");
            return (Criteria) this;
        }

        public Criteria andSu15NotIn(List<String> values) {
            addCriterion("SU15 not in", values, "su15");
            return (Criteria) this;
        }

        public Criteria andSu15Between(String value1, String value2) {
            addCriterion("SU15 between", value1, value2, "su15");
            return (Criteria) this;
        }

        public Criteria andSu15NotBetween(String value1, String value2) {
            addCriterion("SU15 not between", value1, value2, "su15");
            return (Criteria) this;
        }

        public Criteria andSu16IsNull() {
            addCriterion("SU16 is null");
            return (Criteria) this;
        }

        public Criteria andSu16IsNotNull() {
            addCriterion("SU16 is not null");
            return (Criteria) this;
        }

        public Criteria andSu16EqualTo(String value) {
            addCriterion("SU16 =", value, "su16");
            return (Criteria) this;
        }

        public Criteria andSu16NotEqualTo(String value) {
            addCriterion("SU16 <>", value, "su16");
            return (Criteria) this;
        }

        public Criteria andSu16GreaterThan(String value) {
            addCriterion("SU16 >", value, "su16");
            return (Criteria) this;
        }

        public Criteria andSu16GreaterThanOrEqualTo(String value) {
            addCriterion("SU16 >=", value, "su16");
            return (Criteria) this;
        }

        public Criteria andSu16LessThan(String value) {
            addCriterion("SU16 <", value, "su16");
            return (Criteria) this;
        }

        public Criteria andSu16LessThanOrEqualTo(String value) {
            addCriterion("SU16 <=", value, "su16");
            return (Criteria) this;
        }

        public Criteria andSu16Like(String value) {
            addCriterion("SU16 like", value, "su16");
            return (Criteria) this;
        }

        public Criteria andSu16NotLike(String value) {
            addCriterion("SU16 not like", value, "su16");
            return (Criteria) this;
        }

        public Criteria andSu16In(List<String> values) {
            addCriterion("SU16 in", values, "su16");
            return (Criteria) this;
        }

        public Criteria andSu16NotIn(List<String> values) {
            addCriterion("SU16 not in", values, "su16");
            return (Criteria) this;
        }

        public Criteria andSu16Between(String value1, String value2) {
            addCriterion("SU16 between", value1, value2, "su16");
            return (Criteria) this;
        }

        public Criteria andSu16NotBetween(String value1, String value2) {
            addCriterion("SU16 not between", value1, value2, "su16");
            return (Criteria) this;
        }

        public Criteria andSu17IsNull() {
            addCriterion("SU17 is null");
            return (Criteria) this;
        }

        public Criteria andSu17IsNotNull() {
            addCriterion("SU17 is not null");
            return (Criteria) this;
        }

        public Criteria andSu17EqualTo(String value) {
            addCriterion("SU17 =", value, "su17");
            return (Criteria) this;
        }

        public Criteria andSu17NotEqualTo(String value) {
            addCriterion("SU17 <>", value, "su17");
            return (Criteria) this;
        }

        public Criteria andSu17GreaterThan(String value) {
            addCriterion("SU17 >", value, "su17");
            return (Criteria) this;
        }

        public Criteria andSu17GreaterThanOrEqualTo(String value) {
            addCriterion("SU17 >=", value, "su17");
            return (Criteria) this;
        }

        public Criteria andSu17LessThan(String value) {
            addCriterion("SU17 <", value, "su17");
            return (Criteria) this;
        }

        public Criteria andSu17LessThanOrEqualTo(String value) {
            addCriterion("SU17 <=", value, "su17");
            return (Criteria) this;
        }

        public Criteria andSu17Like(String value) {
            addCriterion("SU17 like", value, "su17");
            return (Criteria) this;
        }

        public Criteria andSu17NotLike(String value) {
            addCriterion("SU17 not like", value, "su17");
            return (Criteria) this;
        }

        public Criteria andSu17In(List<String> values) {
            addCriterion("SU17 in", values, "su17");
            return (Criteria) this;
        }

        public Criteria andSu17NotIn(List<String> values) {
            addCriterion("SU17 not in", values, "su17");
            return (Criteria) this;
        }

        public Criteria andSu17Between(String value1, String value2) {
            addCriterion("SU17 between", value1, value2, "su17");
            return (Criteria) this;
        }

        public Criteria andSu17NotBetween(String value1, String value2) {
            addCriterion("SU17 not between", value1, value2, "su17");
            return (Criteria) this;
        }

        public Criteria andSu18IsNull() {
            addCriterion("SU18 is null");
            return (Criteria) this;
        }

        public Criteria andSu18IsNotNull() {
            addCriterion("SU18 is not null");
            return (Criteria) this;
        }

        public Criteria andSu18EqualTo(String value) {
            addCriterion("SU18 =", value, "su18");
            return (Criteria) this;
        }

        public Criteria andSu18NotEqualTo(String value) {
            addCriterion("SU18 <>", value, "su18");
            return (Criteria) this;
        }

        public Criteria andSu18GreaterThan(String value) {
            addCriterion("SU18 >", value, "su18");
            return (Criteria) this;
        }

        public Criteria andSu18GreaterThanOrEqualTo(String value) {
            addCriterion("SU18 >=", value, "su18");
            return (Criteria) this;
        }

        public Criteria andSu18LessThan(String value) {
            addCriterion("SU18 <", value, "su18");
            return (Criteria) this;
        }

        public Criteria andSu18LessThanOrEqualTo(String value) {
            addCriterion("SU18 <=", value, "su18");
            return (Criteria) this;
        }

        public Criteria andSu18Like(String value) {
            addCriterion("SU18 like", value, "su18");
            return (Criteria) this;
        }

        public Criteria andSu18NotLike(String value) {
            addCriterion("SU18 not like", value, "su18");
            return (Criteria) this;
        }

        public Criteria andSu18In(List<String> values) {
            addCriterion("SU18 in", values, "su18");
            return (Criteria) this;
        }

        public Criteria andSu18NotIn(List<String> values) {
            addCriterion("SU18 not in", values, "su18");
            return (Criteria) this;
        }

        public Criteria andSu18Between(String value1, String value2) {
            addCriterion("SU18 between", value1, value2, "su18");
            return (Criteria) this;
        }

        public Criteria andSu18NotBetween(String value1, String value2) {
            addCriterion("SU18 not between", value1, value2, "su18");
            return (Criteria) this;
        }

        public Criteria andSu19IsNull() {
            addCriterion("SU19 is null");
            return (Criteria) this;
        }

        public Criteria andSu19IsNotNull() {
            addCriterion("SU19 is not null");
            return (Criteria) this;
        }

        public Criteria andSu19EqualTo(String value) {
            addCriterion("SU19 =", value, "su19");
            return (Criteria) this;
        }

        public Criteria andSu19NotEqualTo(String value) {
            addCriterion("SU19 <>", value, "su19");
            return (Criteria) this;
        }

        public Criteria andSu19GreaterThan(String value) {
            addCriterion("SU19 >", value, "su19");
            return (Criteria) this;
        }

        public Criteria andSu19GreaterThanOrEqualTo(String value) {
            addCriterion("SU19 >=", value, "su19");
            return (Criteria) this;
        }

        public Criteria andSu19LessThan(String value) {
            addCriterion("SU19 <", value, "su19");
            return (Criteria) this;
        }

        public Criteria andSu19LessThanOrEqualTo(String value) {
            addCriterion("SU19 <=", value, "su19");
            return (Criteria) this;
        }

        public Criteria andSu19Like(String value) {
            addCriterion("SU19 like", value, "su19");
            return (Criteria) this;
        }

        public Criteria andSu19NotLike(String value) {
            addCriterion("SU19 not like", value, "su19");
            return (Criteria) this;
        }

        public Criteria andSu19In(List<String> values) {
            addCriterion("SU19 in", values, "su19");
            return (Criteria) this;
        }

        public Criteria andSu19NotIn(List<String> values) {
            addCriterion("SU19 not in", values, "su19");
            return (Criteria) this;
        }

        public Criteria andSu19Between(String value1, String value2) {
            addCriterion("SU19 between", value1, value2, "su19");
            return (Criteria) this;
        }

        public Criteria andSu19NotBetween(String value1, String value2) {
            addCriterion("SU19 not between", value1, value2, "su19");
            return (Criteria) this;
        }

        public Criteria andSu20IsNull() {
            addCriterion("SU20 is null");
            return (Criteria) this;
        }

        public Criteria andSu20IsNotNull() {
            addCriterion("SU20 is not null");
            return (Criteria) this;
        }

        public Criteria andSu20EqualTo(String value) {
            addCriterion("SU20 =", value, "su20");
            return (Criteria) this;
        }

        public Criteria andSu20NotEqualTo(String value) {
            addCriterion("SU20 <>", value, "su20");
            return (Criteria) this;
        }

        public Criteria andSu20GreaterThan(String value) {
            addCriterion("SU20 >", value, "su20");
            return (Criteria) this;
        }

        public Criteria andSu20GreaterThanOrEqualTo(String value) {
            addCriterion("SU20 >=", value, "su20");
            return (Criteria) this;
        }

        public Criteria andSu20LessThan(String value) {
            addCriterion("SU20 <", value, "su20");
            return (Criteria) this;
        }

        public Criteria andSu20LessThanOrEqualTo(String value) {
            addCriterion("SU20 <=", value, "su20");
            return (Criteria) this;
        }

        public Criteria andSu20Like(String value) {
            addCriterion("SU20 like", value, "su20");
            return (Criteria) this;
        }

        public Criteria andSu20NotLike(String value) {
            addCriterion("SU20 not like", value, "su20");
            return (Criteria) this;
        }

        public Criteria andSu20In(List<String> values) {
            addCriterion("SU20 in", values, "su20");
            return (Criteria) this;
        }

        public Criteria andSu20NotIn(List<String> values) {
            addCriterion("SU20 not in", values, "su20");
            return (Criteria) this;
        }

        public Criteria andSu20Between(String value1, String value2) {
            addCriterion("SU20 between", value1, value2, "su20");
            return (Criteria) this;
        }

        public Criteria andSu20NotBetween(String value1, String value2) {
            addCriterion("SU20 not between", value1, value2, "su20");
            return (Criteria) this;
        }

        public Criteria andSu21IsNull() {
            addCriterion("SU21 is null");
            return (Criteria) this;
        }

        public Criteria andSu21IsNotNull() {
            addCriterion("SU21 is not null");
            return (Criteria) this;
        }

        public Criteria andSu21EqualTo(Date value) {
            addCriterion("SU21 =", value, "su21");
            return (Criteria) this;
        }

        public Criteria andSu21NotEqualTo(Date value) {
            addCriterion("SU21 <>", value, "su21");
            return (Criteria) this;
        }

        public Criteria andSu21GreaterThan(Date value) {
            addCriterion("SU21 >", value, "su21");
            return (Criteria) this;
        }

        public Criteria andSu21GreaterThanOrEqualTo(Date value) {
            addCriterion("SU21 >=", value, "su21");
            return (Criteria) this;
        }

        public Criteria andSu21LessThan(Date value) {
            addCriterion("SU21 <", value, "su21");
            return (Criteria) this;
        }

        public Criteria andSu21LessThanOrEqualTo(Date value) {
            addCriterion("SU21 <=", value, "su21");
            return (Criteria) this;
        }

        public Criteria andSu21In(List<Date> values) {
            addCriterion("SU21 in", values, "su21");
            return (Criteria) this;
        }

        public Criteria andSu21NotIn(List<Date> values) {
            addCriterion("SU21 not in", values, "su21");
            return (Criteria) this;
        }

        public Criteria andSu21Between(Date value1, Date value2) {
            addCriterion("SU21 between", value1, value2, "su21");
            return (Criteria) this;
        }

        public Criteria andSu21NotBetween(Date value1, Date value2) {
            addCriterion("SU21 not between", value1, value2, "su21");
            return (Criteria) this;
        }

        public Criteria andSu22IsNull() {
            addCriterion("SU22 is null");
            return (Criteria) this;
        }

        public Criteria andSu22IsNotNull() {
            addCriterion("SU22 is not null");
            return (Criteria) this;
        }

        public Criteria andSu22EqualTo(String value) {
            addCriterion("SU22 =", value, "su22");
            return (Criteria) this;
        }

        public Criteria andSu22NotEqualTo(String value) {
            addCriterion("SU22 <>", value, "su22");
            return (Criteria) this;
        }

        public Criteria andSu22GreaterThan(String value) {
            addCriterion("SU22 >", value, "su22");
            return (Criteria) this;
        }

        public Criteria andSu22GreaterThanOrEqualTo(String value) {
            addCriterion("SU22 >=", value, "su22");
            return (Criteria) this;
        }

        public Criteria andSu22LessThan(String value) {
            addCriterion("SU22 <", value, "su22");
            return (Criteria) this;
        }

        public Criteria andSu22LessThanOrEqualTo(String value) {
            addCriterion("SU22 <=", value, "su22");
            return (Criteria) this;
        }

        public Criteria andSu22Like(String value) {
            addCriterion("SU22 like", value, "su22");
            return (Criteria) this;
        }

        public Criteria andSu22NotLike(String value) {
            addCriterion("SU22 not like", value, "su22");
            return (Criteria) this;
        }

        public Criteria andSu22In(List<String> values) {
            addCriterion("SU22 in", values, "su22");
            return (Criteria) this;
        }

        public Criteria andSu22NotIn(List<String> values) {
            addCriterion("SU22 not in", values, "su22");
            return (Criteria) this;
        }

        public Criteria andSu22Between(String value1, String value2) {
            addCriterion("SU22 between", value1, value2, "su22");
            return (Criteria) this;
        }

        public Criteria andSu22NotBetween(String value1, String value2) {
            addCriterion("SU22 not between", value1, value2, "su22");
            return (Criteria) this;
        }

        public Criteria andSu23IsNull() {
            addCriterion("SU23 is null");
            return (Criteria) this;
        }

        public Criteria andSu23IsNotNull() {
            addCriterion("SU23 is not null");
            return (Criteria) this;
        }

        public Criteria andSu23EqualTo(String value) {
            addCriterion("SU23 =", value, "su23");
            return (Criteria) this;
        }

        public Criteria andSu23NotEqualTo(String value) {
            addCriterion("SU23 <>", value, "su23");
            return (Criteria) this;
        }

        public Criteria andSu23GreaterThan(String value) {
            addCriterion("SU23 >", value, "su23");
            return (Criteria) this;
        }

        public Criteria andSu23GreaterThanOrEqualTo(String value) {
            addCriterion("SU23 >=", value, "su23");
            return (Criteria) this;
        }

        public Criteria andSu23LessThan(String value) {
            addCriterion("SU23 <", value, "su23");
            return (Criteria) this;
        }

        public Criteria andSu23LessThanOrEqualTo(String value) {
            addCriterion("SU23 <=", value, "su23");
            return (Criteria) this;
        }

        public Criteria andSu23Like(String value) {
            addCriterion("SU23 like", value, "su23");
            return (Criteria) this;
        }

        public Criteria andSu23NotLike(String value) {
            addCriterion("SU23 not like", value, "su23");
            return (Criteria) this;
        }

        public Criteria andSu23In(List<String> values) {
            addCriterion("SU23 in", values, "su23");
            return (Criteria) this;
        }

        public Criteria andSu23NotIn(List<String> values) {
            addCriterion("SU23 not in", values, "su23");
            return (Criteria) this;
        }

        public Criteria andSu23Between(String value1, String value2) {
            addCriterion("SU23 between", value1, value2, "su23");
            return (Criteria) this;
        }

        public Criteria andSu23NotBetween(String value1, String value2) {
            addCriterion("SU23 not between", value1, value2, "su23");
            return (Criteria) this;
        }

        public Criteria andSu24IsNull() {
            addCriterion("SU24 is null");
            return (Criteria) this;
        }

        public Criteria andSu24IsNotNull() {
            addCriterion("SU24 is not null");
            return (Criteria) this;
        }

        public Criteria andSu24EqualTo(String value) {
            addCriterion("SU24 =", value, "su24");
            return (Criteria) this;
        }

        public Criteria andSu24NotEqualTo(String value) {
            addCriterion("SU24 <>", value, "su24");
            return (Criteria) this;
        }

        public Criteria andSu24GreaterThan(String value) {
            addCriterion("SU24 >", value, "su24");
            return (Criteria) this;
        }

        public Criteria andSu24GreaterThanOrEqualTo(String value) {
            addCriterion("SU24 >=", value, "su24");
            return (Criteria) this;
        }

        public Criteria andSu24LessThan(String value) {
            addCriterion("SU24 <", value, "su24");
            return (Criteria) this;
        }

        public Criteria andSu24LessThanOrEqualTo(String value) {
            addCriterion("SU24 <=", value, "su24");
            return (Criteria) this;
        }

        public Criteria andSu24Like(String value) {
            addCriterion("SU24 like", value, "su24");
            return (Criteria) this;
        }

        public Criteria andSu24NotLike(String value) {
            addCriterion("SU24 not like", value, "su24");
            return (Criteria) this;
        }

        public Criteria andSu24In(List<String> values) {
            addCriterion("SU24 in", values, "su24");
            return (Criteria) this;
        }

        public Criteria andSu24NotIn(List<String> values) {
            addCriterion("SU24 not in", values, "su24");
            return (Criteria) this;
        }

        public Criteria andSu24Between(String value1, String value2) {
            addCriterion("SU24 between", value1, value2, "su24");
            return (Criteria) this;
        }

        public Criteria andSu24NotBetween(String value1, String value2) {
            addCriterion("SU24 not between", value1, value2, "su24");
            return (Criteria) this;
        }

        public Criteria andSu25IsNull() {
            addCriterion("SU25 is null");
            return (Criteria) this;
        }

        public Criteria andSu25IsNotNull() {
            addCriterion("SU25 is not null");
            return (Criteria) this;
        }

        public Criteria andSu25EqualTo(String value) {
            addCriterion("SU25 =", value, "su25");
            return (Criteria) this;
        }

        public Criteria andSu25NotEqualTo(String value) {
            addCriterion("SU25 <>", value, "su25");
            return (Criteria) this;
        }

        public Criteria andSu25GreaterThan(String value) {
            addCriterion("SU25 >", value, "su25");
            return (Criteria) this;
        }

        public Criteria andSu25GreaterThanOrEqualTo(String value) {
            addCriterion("SU25 >=", value, "su25");
            return (Criteria) this;
        }

        public Criteria andSu25LessThan(String value) {
            addCriterion("SU25 <", value, "su25");
            return (Criteria) this;
        }

        public Criteria andSu25LessThanOrEqualTo(String value) {
            addCriterion("SU25 <=", value, "su25");
            return (Criteria) this;
        }

        public Criteria andSu25Like(String value) {
            addCriterion("SU25 like", value, "su25");
            return (Criteria) this;
        }

        public Criteria andSu25NotLike(String value) {
            addCriterion("SU25 not like", value, "su25");
            return (Criteria) this;
        }

        public Criteria andSu25In(List<String> values) {
            addCriterion("SU25 in", values, "su25");
            return (Criteria) this;
        }

        public Criteria andSu25NotIn(List<String> values) {
            addCriterion("SU25 not in", values, "su25");
            return (Criteria) this;
        }

        public Criteria andSu25Between(String value1, String value2) {
            addCriterion("SU25 between", value1, value2, "su25");
            return (Criteria) this;
        }

        public Criteria andSu25NotBetween(String value1, String value2) {
            addCriterion("SU25 not between", value1, value2, "su25");
            return (Criteria) this;
        }

        public Criteria andSu26IsNull() {
            addCriterion("SU26 is null");
            return (Criteria) this;
        }

        public Criteria andSu26IsNotNull() {
            addCriterion("SU26 is not null");
            return (Criteria) this;
        }

        public Criteria andSu26EqualTo(String value) {
            addCriterion("SU26 =", value, "su26");
            return (Criteria) this;
        }

        public Criteria andSu26NotEqualTo(String value) {
            addCriterion("SU26 <>", value, "su26");
            return (Criteria) this;
        }

        public Criteria andSu26GreaterThan(String value) {
            addCriterion("SU26 >", value, "su26");
            return (Criteria) this;
        }

        public Criteria andSu26GreaterThanOrEqualTo(String value) {
            addCriterion("SU26 >=", value, "su26");
            return (Criteria) this;
        }

        public Criteria andSu26LessThan(String value) {
            addCriterion("SU26 <", value, "su26");
            return (Criteria) this;
        }

        public Criteria andSu26LessThanOrEqualTo(String value) {
            addCriterion("SU26 <=", value, "su26");
            return (Criteria) this;
        }

        public Criteria andSu26Like(String value) {
            addCriterion("SU26 like", value, "su26");
            return (Criteria) this;
        }

        public Criteria andSu26NotLike(String value) {
            addCriterion("SU26 not like", value, "su26");
            return (Criteria) this;
        }

        public Criteria andSu26In(List<String> values) {
            addCriterion("SU26 in", values, "su26");
            return (Criteria) this;
        }

        public Criteria andSu26NotIn(List<String> values) {
            addCriterion("SU26 not in", values, "su26");
            return (Criteria) this;
        }

        public Criteria andSu26Between(String value1, String value2) {
            addCriterion("SU26 between", value1, value2, "su26");
            return (Criteria) this;
        }

        public Criteria andSu26NotBetween(String value1, String value2) {
            addCriterion("SU26 not between", value1, value2, "su26");
            return (Criteria) this;
        }

        public Criteria andSu27IsNull() {
            addCriterion("SU27 is null");
            return (Criteria) this;
        }

        public Criteria andSu27IsNotNull() {
            addCriterion("SU27 is not null");
            return (Criteria) this;
        }

        public Criteria andSu27EqualTo(String value) {
            addCriterion("SU27 =", value, "su27");
            return (Criteria) this;
        }

        public Criteria andSu27NotEqualTo(String value) {
            addCriterion("SU27 <>", value, "su27");
            return (Criteria) this;
        }

        public Criteria andSu27GreaterThan(String value) {
            addCriterion("SU27 >", value, "su27");
            return (Criteria) this;
        }

        public Criteria andSu27GreaterThanOrEqualTo(String value) {
            addCriterion("SU27 >=", value, "su27");
            return (Criteria) this;
        }

        public Criteria andSu27LessThan(String value) {
            addCriterion("SU27 <", value, "su27");
            return (Criteria) this;
        }

        public Criteria andSu27LessThanOrEqualTo(String value) {
            addCriterion("SU27 <=", value, "su27");
            return (Criteria) this;
        }

        public Criteria andSu27Like(String value) {
            addCriterion("SU27 like", value, "su27");
            return (Criteria) this;
        }

        public Criteria andSu27NotLike(String value) {
            addCriterion("SU27 not like", value, "su27");
            return (Criteria) this;
        }

        public Criteria andSu27In(List<String> values) {
            addCriterion("SU27 in", values, "su27");
            return (Criteria) this;
        }

        public Criteria andSu27NotIn(List<String> values) {
            addCriterion("SU27 not in", values, "su27");
            return (Criteria) this;
        }

        public Criteria andSu27Between(String value1, String value2) {
            addCriterion("SU27 between", value1, value2, "su27");
            return (Criteria) this;
        }

        public Criteria andSu27NotBetween(String value1, String value2) {
            addCriterion("SU27 not between", value1, value2, "su27");
            return (Criteria) this;
        }

        public Criteria andSu28IsNull() {
            addCriterion("SU28 is null");
            return (Criteria) this;
        }

        public Criteria andSu28IsNotNull() {
            addCriterion("SU28 is not null");
            return (Criteria) this;
        }

        public Criteria andSu28EqualTo(String value) {
            addCriterion("SU28 =", value, "su28");
            return (Criteria) this;
        }

        public Criteria andSu28NotEqualTo(String value) {
            addCriterion("SU28 <>", value, "su28");
            return (Criteria) this;
        }

        public Criteria andSu28GreaterThan(String value) {
            addCriterion("SU28 >", value, "su28");
            return (Criteria) this;
        }

        public Criteria andSu28GreaterThanOrEqualTo(String value) {
            addCriterion("SU28 >=", value, "su28");
            return (Criteria) this;
        }

        public Criteria andSu28LessThan(String value) {
            addCriterion("SU28 <", value, "su28");
            return (Criteria) this;
        }

        public Criteria andSu28LessThanOrEqualTo(String value) {
            addCriterion("SU28 <=", value, "su28");
            return (Criteria) this;
        }

        public Criteria andSu28Like(String value) {
            addCriterion("SU28 like", value, "su28");
            return (Criteria) this;
        }

        public Criteria andSu28NotLike(String value) {
            addCriterion("SU28 not like", value, "su28");
            return (Criteria) this;
        }

        public Criteria andSu28In(List<String> values) {
            addCriterion("SU28 in", values, "su28");
            return (Criteria) this;
        }

        public Criteria andSu28NotIn(List<String> values) {
            addCriterion("SU28 not in", values, "su28");
            return (Criteria) this;
        }

        public Criteria andSu28Between(String value1, String value2) {
            addCriterion("SU28 between", value1, value2, "su28");
            return (Criteria) this;
        }

        public Criteria andSu28NotBetween(String value1, String value2) {
            addCriterion("SU28 not between", value1, value2, "su28");
            return (Criteria) this;
        }

        public Criteria andSu29IsNull() {
            addCriterion("SU29 is null");
            return (Criteria) this;
        }

        public Criteria andSu29IsNotNull() {
            addCriterion("SU29 is not null");
            return (Criteria) this;
        }

        public Criteria andSu29EqualTo(String value) {
            addCriterion("SU29 =", value, "su29");
            return (Criteria) this;
        }

        public Criteria andSu29NotEqualTo(String value) {
            addCriterion("SU29 <>", value, "su29");
            return (Criteria) this;
        }

        public Criteria andSu29GreaterThan(String value) {
            addCriterion("SU29 >", value, "su29");
            return (Criteria) this;
        }

        public Criteria andSu29GreaterThanOrEqualTo(String value) {
            addCriterion("SU29 >=", value, "su29");
            return (Criteria) this;
        }

        public Criteria andSu29LessThan(String value) {
            addCriterion("SU29 <", value, "su29");
            return (Criteria) this;
        }

        public Criteria andSu29LessThanOrEqualTo(String value) {
            addCriterion("SU29 <=", value, "su29");
            return (Criteria) this;
        }

        public Criteria andSu29Like(String value) {
            addCriterion("SU29 like", value, "su29");
            return (Criteria) this;
        }

        public Criteria andSu29NotLike(String value) {
            addCriterion("SU29 not like", value, "su29");
            return (Criteria) this;
        }

        public Criteria andSu29In(List<String> values) {
            addCriterion("SU29 in", values, "su29");
            return (Criteria) this;
        }

        public Criteria andSu29NotIn(List<String> values) {
            addCriterion("SU29 not in", values, "su29");
            return (Criteria) this;
        }

        public Criteria andSu29Between(String value1, String value2) {
            addCriterion("SU29 between", value1, value2, "su29");
            return (Criteria) this;
        }

        public Criteria andSu29NotBetween(String value1, String value2) {
            addCriterion("SU29 not between", value1, value2, "su29");
            return (Criteria) this;
        }

        public Criteria andSu30IsNull() {
            addCriterion("SU30 is null");
            return (Criteria) this;
        }

        public Criteria andSu30IsNotNull() {
            addCriterion("SU30 is not null");
            return (Criteria) this;
        }

        public Criteria andSu30EqualTo(String value) {
            addCriterion("SU30 =", value, "su30");
            return (Criteria) this;
        }

        public Criteria andSu30NotEqualTo(String value) {
            addCriterion("SU30 <>", value, "su30");
            return (Criteria) this;
        }

        public Criteria andSu30GreaterThan(String value) {
            addCriterion("SU30 >", value, "su30");
            return (Criteria) this;
        }

        public Criteria andSu30GreaterThanOrEqualTo(String value) {
            addCriterion("SU30 >=", value, "su30");
            return (Criteria) this;
        }

        public Criteria andSu30LessThan(String value) {
            addCriterion("SU30 <", value, "su30");
            return (Criteria) this;
        }

        public Criteria andSu30LessThanOrEqualTo(String value) {
            addCriterion("SU30 <=", value, "su30");
            return (Criteria) this;
        }

        public Criteria andSu30Like(String value) {
            addCriterion("SU30 like", value, "su30");
            return (Criteria) this;
        }

        public Criteria andSu30NotLike(String value) {
            addCriterion("SU30 not like", value, "su30");
            return (Criteria) this;
        }

        public Criteria andSu30In(List<String> values) {
            addCriterion("SU30 in", values, "su30");
            return (Criteria) this;
        }

        public Criteria andSu30NotIn(List<String> values) {
            addCriterion("SU30 not in", values, "su30");
            return (Criteria) this;
        }

        public Criteria andSu30Between(String value1, String value2) {
            addCriterion("SU30 between", value1, value2, "su30");
            return (Criteria) this;
        }

        public Criteria andSu30NotBetween(String value1, String value2) {
            addCriterion("SU30 not between", value1, value2, "su30");
            return (Criteria) this;
        }

        public Criteria andSu31IsNull() {
            addCriterion("SU31 is null");
            return (Criteria) this;
        }

        public Criteria andSu31IsNotNull() {
            addCriterion("SU31 is not null");
            return (Criteria) this;
        }

        public Criteria andSu31EqualTo(String value) {
            addCriterion("SU31 =", value, "su31");
            return (Criteria) this;
        }

        public Criteria andSu31NotEqualTo(String value) {
            addCriterion("SU31 <>", value, "su31");
            return (Criteria) this;
        }

        public Criteria andSu31GreaterThan(String value) {
            addCriterion("SU31 >", value, "su31");
            return (Criteria) this;
        }

        public Criteria andSu31GreaterThanOrEqualTo(String value) {
            addCriterion("SU31 >=", value, "su31");
            return (Criteria) this;
        }

        public Criteria andSu31LessThan(String value) {
            addCriterion("SU31 <", value, "su31");
            return (Criteria) this;
        }

        public Criteria andSu31LessThanOrEqualTo(String value) {
            addCriterion("SU31 <=", value, "su31");
            return (Criteria) this;
        }

        public Criteria andSu31Like(String value) {
            addCriterion("SU31 like", value, "su31");
            return (Criteria) this;
        }

        public Criteria andSu31NotLike(String value) {
            addCriterion("SU31 not like", value, "su31");
            return (Criteria) this;
        }

        public Criteria andSu31In(List<String> values) {
            addCriterion("SU31 in", values, "su31");
            return (Criteria) this;
        }

        public Criteria andSu31NotIn(List<String> values) {
            addCriterion("SU31 not in", values, "su31");
            return (Criteria) this;
        }

        public Criteria andSu31Between(String value1, String value2) {
            addCriterion("SU31 between", value1, value2, "su31");
            return (Criteria) this;
        }

        public Criteria andSu31NotBetween(String value1, String value2) {
            addCriterion("SU31 not between", value1, value2, "su31");
            return (Criteria) this;
        }

        public Criteria andSu32IsNull() {
            addCriterion("SU32 is null");
            return (Criteria) this;
        }

        public Criteria andSu32IsNotNull() {
            addCriterion("SU32 is not null");
            return (Criteria) this;
        }

        public Criteria andSu32EqualTo(String value) {
            addCriterion("SU32 =", value, "su32");
            return (Criteria) this;
        }

        public Criteria andSu32NotEqualTo(String value) {
            addCriterion("SU32 <>", value, "su32");
            return (Criteria) this;
        }

        public Criteria andSu32GreaterThan(String value) {
            addCriterion("SU32 >", value, "su32");
            return (Criteria) this;
        }

        public Criteria andSu32GreaterThanOrEqualTo(String value) {
            addCriterion("SU32 >=", value, "su32");
            return (Criteria) this;
        }

        public Criteria andSu32LessThan(String value) {
            addCriterion("SU32 <", value, "su32");
            return (Criteria) this;
        }

        public Criteria andSu32LessThanOrEqualTo(String value) {
            addCriterion("SU32 <=", value, "su32");
            return (Criteria) this;
        }

        public Criteria andSu32Like(String value) {
            addCriterion("SU32 like", value, "su32");
            return (Criteria) this;
        }

        public Criteria andSu32NotLike(String value) {
            addCriterion("SU32 not like", value, "su32");
            return (Criteria) this;
        }

        public Criteria andSu32In(List<String> values) {
            addCriterion("SU32 in", values, "su32");
            return (Criteria) this;
        }

        public Criteria andSu32NotIn(List<String> values) {
            addCriterion("SU32 not in", values, "su32");
            return (Criteria) this;
        }

        public Criteria andSu32Between(String value1, String value2) {
            addCriterion("SU32 between", value1, value2, "su32");
            return (Criteria) this;
        }

        public Criteria andSu32NotBetween(String value1, String value2) {
            addCriterion("SU32 not between", value1, value2, "su32");
            return (Criteria) this;
        }

        public Criteria andSu33IsNull() {
            addCriterion("SU33 is null");
            return (Criteria) this;
        }

        public Criteria andSu33IsNotNull() {
            addCriterion("SU33 is not null");
            return (Criteria) this;
        }

        public Criteria andSu33EqualTo(String value) {
            addCriterion("SU33 =", value, "su33");
            return (Criteria) this;
        }

        public Criteria andSu33NotEqualTo(String value) {
            addCriterion("SU33 <>", value, "su33");
            return (Criteria) this;
        }

        public Criteria andSu33GreaterThan(String value) {
            addCriterion("SU33 >", value, "su33");
            return (Criteria) this;
        }

        public Criteria andSu33GreaterThanOrEqualTo(String value) {
            addCriterion("SU33 >=", value, "su33");
            return (Criteria) this;
        }

        public Criteria andSu33LessThan(String value) {
            addCriterion("SU33 <", value, "su33");
            return (Criteria) this;
        }

        public Criteria andSu33LessThanOrEqualTo(String value) {
            addCriterion("SU33 <=", value, "su33");
            return (Criteria) this;
        }

        public Criteria andSu33Like(String value) {
            addCriterion("SU33 like", value, "su33");
            return (Criteria) this;
        }

        public Criteria andSu33NotLike(String value) {
            addCriterion("SU33 not like", value, "su33");
            return (Criteria) this;
        }

        public Criteria andSu33In(List<String> values) {
            addCriterion("SU33 in", values, "su33");
            return (Criteria) this;
        }

        public Criteria andSu33NotIn(List<String> values) {
            addCriterion("SU33 not in", values, "su33");
            return (Criteria) this;
        }

        public Criteria andSu33Between(String value1, String value2) {
            addCriterion("SU33 between", value1, value2, "su33");
            return (Criteria) this;
        }

        public Criteria andSu33NotBetween(String value1, String value2) {
            addCriterion("SU33 not between", value1, value2, "su33");
            return (Criteria) this;
        }

        public Criteria andSu34IsNull() {
            addCriterion("SU34 is null");
            return (Criteria) this;
        }

        public Criteria andSu34IsNotNull() {
            addCriterion("SU34 is not null");
            return (Criteria) this;
        }

        public Criteria andSu34EqualTo(Long value) {
            addCriterion("SU34 =", value, "su34");
            return (Criteria) this;
        }

        public Criteria andSu34NotEqualTo(Long value) {
            addCriterion("SU34 <>", value, "su34");
            return (Criteria) this;
        }

        public Criteria andSu34GreaterThan(Long value) {
            addCriterion("SU34 >", value, "su34");
            return (Criteria) this;
        }

        public Criteria andSu34GreaterThanOrEqualTo(Long value) {
            addCriterion("SU34 >=", value, "su34");
            return (Criteria) this;
        }

        public Criteria andSu34LessThan(Long value) {
            addCriterion("SU34 <", value, "su34");
            return (Criteria) this;
        }

        public Criteria andSu34LessThanOrEqualTo(Long value) {
            addCriterion("SU34 <=", value, "su34");
            return (Criteria) this;
        }

        public Criteria andSu34In(List<Long> values) {
            addCriterion("SU34 in", values, "su34");
            return (Criteria) this;
        }

        public Criteria andSu34NotIn(List<Long> values) {
            addCriterion("SU34 not in", values, "su34");
            return (Criteria) this;
        }

        public Criteria andSu34Between(Long value1, Long value2) {
            addCriterion("SU34 between", value1, value2, "su34");
            return (Criteria) this;
        }

        public Criteria andSu34NotBetween(Long value1, Long value2) {
            addCriterion("SU34 not between", value1, value2, "su34");
            return (Criteria) this;
        }

        public Criteria andSu35IsNull() {
            addCriterion("SU35 is null");
            return (Criteria) this;
        }

        public Criteria andSu35IsNotNull() {
            addCriterion("SU35 is not null");
            return (Criteria) this;
        }

        public Criteria andSu35EqualTo(String value) {
            addCriterion("SU35 =", value, "su35");
            return (Criteria) this;
        }

        public Criteria andSu35NotEqualTo(String value) {
            addCriterion("SU35 <>", value, "su35");
            return (Criteria) this;
        }

        public Criteria andSu35GreaterThan(String value) {
            addCriterion("SU35 >", value, "su35");
            return (Criteria) this;
        }

        public Criteria andSu35GreaterThanOrEqualTo(String value) {
            addCriterion("SU35 >=", value, "su35");
            return (Criteria) this;
        }

        public Criteria andSu35LessThan(String value) {
            addCriterion("SU35 <", value, "su35");
            return (Criteria) this;
        }

        public Criteria andSu35LessThanOrEqualTo(String value) {
            addCriterion("SU35 <=", value, "su35");
            return (Criteria) this;
        }

        public Criteria andSu35Like(String value) {
            addCriterion("SU35 like", value, "su35");
            return (Criteria) this;
        }

        public Criteria andSu35NotLike(String value) {
            addCriterion("SU35 not like", value, "su35");
            return (Criteria) this;
        }

        public Criteria andSu35In(List<String> values) {
            addCriterion("SU35 in", values, "su35");
            return (Criteria) this;
        }

        public Criteria andSu35NotIn(List<String> values) {
            addCriterion("SU35 not in", values, "su35");
            return (Criteria) this;
        }

        public Criteria andSu35Between(String value1, String value2) {
            addCriterion("SU35 between", value1, value2, "su35");
            return (Criteria) this;
        }

        public Criteria andSu35NotBetween(String value1, String value2) {
            addCriterion("SU35 not between", value1, value2, "su35");
            return (Criteria) this;
        }

        public Criteria andSu36IsNull() {
            addCriterion("SU36 is null");
            return (Criteria) this;
        }

        public Criteria andSu36IsNotNull() {
            addCriterion("SU36 is not null");
            return (Criteria) this;
        }

        public Criteria andSu36EqualTo(Long value) {
            addCriterion("SU36 =", value, "su36");
            return (Criteria) this;
        }

        public Criteria andSu36NotEqualTo(Long value) {
            addCriterion("SU36 <>", value, "su36");
            return (Criteria) this;
        }

        public Criteria andSu36GreaterThan(Long value) {
            addCriterion("SU36 >", value, "su36");
            return (Criteria) this;
        }

        public Criteria andSu36GreaterThanOrEqualTo(Long value) {
            addCriterion("SU36 >=", value, "su36");
            return (Criteria) this;
        }

        public Criteria andSu36LessThan(Long value) {
            addCriterion("SU36 <", value, "su36");
            return (Criteria) this;
        }

        public Criteria andSu36LessThanOrEqualTo(Long value) {
            addCriterion("SU36 <=", value, "su36");
            return (Criteria) this;
        }

        public Criteria andSu36In(List<Long> values) {
            addCriterion("SU36 in", values, "su36");
            return (Criteria) this;
        }

        public Criteria andSu36NotIn(List<Long> values) {
            addCriterion("SU36 not in", values, "su36");
            return (Criteria) this;
        }

        public Criteria andSu36Between(Long value1, Long value2) {
            addCriterion("SU36 between", value1, value2, "su36");
            return (Criteria) this;
        }

        public Criteria andSu36NotBetween(Long value1, Long value2) {
            addCriterion("SU36 not between", value1, value2, "su36");
            return (Criteria) this;
        }

        public Criteria andSu37IsNull() {
            addCriterion("SU37 is null");
            return (Criteria) this;
        }

        public Criteria andSu37IsNotNull() {
            addCriterion("SU37 is not null");
            return (Criteria) this;
        }

        public Criteria andSu37EqualTo(String value) {
            addCriterion("SU37 =", value, "su37");
            return (Criteria) this;
        }

        public Criteria andSu37NotEqualTo(String value) {
            addCriterion("SU37 <>", value, "su37");
            return (Criteria) this;
        }

        public Criteria andSu37GreaterThan(String value) {
            addCriterion("SU37 >", value, "su37");
            return (Criteria) this;
        }

        public Criteria andSu37GreaterThanOrEqualTo(String value) {
            addCriterion("SU37 >=", value, "su37");
            return (Criteria) this;
        }

        public Criteria andSu37LessThan(String value) {
            addCriterion("SU37 <", value, "su37");
            return (Criteria) this;
        }

        public Criteria andSu37LessThanOrEqualTo(String value) {
            addCriterion("SU37 <=", value, "su37");
            return (Criteria) this;
        }

        public Criteria andSu37Like(String value) {
            addCriterion("SU37 like", value, "su37");
            return (Criteria) this;
        }

        public Criteria andSu37NotLike(String value) {
            addCriterion("SU37 not like", value, "su37");
            return (Criteria) this;
        }

        public Criteria andSu37In(List<String> values) {
            addCriterion("SU37 in", values, "su37");
            return (Criteria) this;
        }

        public Criteria andSu37NotIn(List<String> values) {
            addCriterion("SU37 not in", values, "su37");
            return (Criteria) this;
        }

        public Criteria andSu37Between(String value1, String value2) {
            addCriterion("SU37 between", value1, value2, "su37");
            return (Criteria) this;
        }

        public Criteria andSu37NotBetween(String value1, String value2) {
            addCriterion("SU37 not between", value1, value2, "su37");
            return (Criteria) this;
        }

        public Criteria andSu38IsNull() {
            addCriterion("SU38 is null");
            return (Criteria) this;
        }

        public Criteria andSu38IsNotNull() {
            addCriterion("SU38 is not null");
            return (Criteria) this;
        }

        public Criteria andSu38EqualTo(String value) {
            addCriterion("SU38 =", value, "su38");
            return (Criteria) this;
        }

        public Criteria andSu38NotEqualTo(String value) {
            addCriterion("SU38 <>", value, "su38");
            return (Criteria) this;
        }

        public Criteria andSu38GreaterThan(String value) {
            addCriterion("SU38 >", value, "su38");
            return (Criteria) this;
        }

        public Criteria andSu38GreaterThanOrEqualTo(String value) {
            addCriterion("SU38 >=", value, "su38");
            return (Criteria) this;
        }

        public Criteria andSu38LessThan(String value) {
            addCriterion("SU38 <", value, "su38");
            return (Criteria) this;
        }

        public Criteria andSu38LessThanOrEqualTo(String value) {
            addCriterion("SU38 <=", value, "su38");
            return (Criteria) this;
        }

        public Criteria andSu38Like(String value) {
            addCriterion("SU38 like", value, "su38");
            return (Criteria) this;
        }

        public Criteria andSu38NotLike(String value) {
            addCriterion("SU38 not like", value, "su38");
            return (Criteria) this;
        }

        public Criteria andSu38In(List<String> values) {
            addCriterion("SU38 in", values, "su38");
            return (Criteria) this;
        }

        public Criteria andSu38NotIn(List<String> values) {
            addCriterion("SU38 not in", values, "su38");
            return (Criteria) this;
        }

        public Criteria andSu38Between(String value1, String value2) {
            addCriterion("SU38 between", value1, value2, "su38");
            return (Criteria) this;
        }

        public Criteria andSu38NotBetween(String value1, String value2) {
            addCriterion("SU38 not between", value1, value2, "su38");
            return (Criteria) this;
        }

        public Criteria andSu39IsNull() {
            addCriterion("SU39 is null");
            return (Criteria) this;
        }

        public Criteria andSu39IsNotNull() {
            addCriterion("SU39 is not null");
            return (Criteria) this;
        }

        public Criteria andSu39EqualTo(String value) {
            addCriterion("SU39 =", value, "su39");
            return (Criteria) this;
        }

        public Criteria andSu39NotEqualTo(String value) {
            addCriterion("SU39 <>", value, "su39");
            return (Criteria) this;
        }

        public Criteria andSu39GreaterThan(String value) {
            addCriterion("SU39 >", value, "su39");
            return (Criteria) this;
        }

        public Criteria andSu39GreaterThanOrEqualTo(String value) {
            addCriterion("SU39 >=", value, "su39");
            return (Criteria) this;
        }

        public Criteria andSu39LessThan(String value) {
            addCriterion("SU39 <", value, "su39");
            return (Criteria) this;
        }

        public Criteria andSu39LessThanOrEqualTo(String value) {
            addCriterion("SU39 <=", value, "su39");
            return (Criteria) this;
        }

        public Criteria andSu39Like(String value) {
            addCriterion("SU39 like", value, "su39");
            return (Criteria) this;
        }

        public Criteria andSu39NotLike(String value) {
            addCriterion("SU39 not like", value, "su39");
            return (Criteria) this;
        }

        public Criteria andSu39In(List<String> values) {
            addCriterion("SU39 in", values, "su39");
            return (Criteria) this;
        }

        public Criteria andSu39NotIn(List<String> values) {
            addCriterion("SU39 not in", values, "su39");
            return (Criteria) this;
        }

        public Criteria andSu39Between(String value1, String value2) {
            addCriterion("SU39 between", value1, value2, "su39");
            return (Criteria) this;
        }

        public Criteria andSu39NotBetween(String value1, String value2) {
            addCriterion("SU39 not between", value1, value2, "su39");
            return (Criteria) this;
        }

        public Criteria andSu40IsNull() {
            addCriterion("SU40 is null");
            return (Criteria) this;
        }

        public Criteria andSu40IsNotNull() {
            addCriterion("SU40 is not null");
            return (Criteria) this;
        }

        public Criteria andSu40EqualTo(String value) {
            addCriterion("SU40 =", value, "su40");
            return (Criteria) this;
        }

        public Criteria andSu40NotEqualTo(String value) {
            addCriterion("SU40 <>", value, "su40");
            return (Criteria) this;
        }

        public Criteria andSu40GreaterThan(String value) {
            addCriterion("SU40 >", value, "su40");
            return (Criteria) this;
        }

        public Criteria andSu40GreaterThanOrEqualTo(String value) {
            addCriterion("SU40 >=", value, "su40");
            return (Criteria) this;
        }

        public Criteria andSu40LessThan(String value) {
            addCriterion("SU40 <", value, "su40");
            return (Criteria) this;
        }

        public Criteria andSu40LessThanOrEqualTo(String value) {
            addCriterion("SU40 <=", value, "su40");
            return (Criteria) this;
        }

        public Criteria andSu40Like(String value) {
            addCriterion("SU40 like", value, "su40");
            return (Criteria) this;
        }

        public Criteria andSu40NotLike(String value) {
            addCriterion("SU40 not like", value, "su40");
            return (Criteria) this;
        }

        public Criteria andSu40In(List<String> values) {
            addCriterion("SU40 in", values, "su40");
            return (Criteria) this;
        }

        public Criteria andSu40NotIn(List<String> values) {
            addCriterion("SU40 not in", values, "su40");
            return (Criteria) this;
        }

        public Criteria andSu40Between(String value1, String value2) {
            addCriterion("SU40 between", value1, value2, "su40");
            return (Criteria) this;
        }

        public Criteria andSu40NotBetween(String value1, String value2) {
            addCriterion("SU40 not between", value1, value2, "su40");
            return (Criteria) this;
        }

        public Criteria andSu41IsNull() {
            addCriterion("SU41 is null");
            return (Criteria) this;
        }

        public Criteria andSu41IsNotNull() {
            addCriterion("SU41 is not null");
            return (Criteria) this;
        }

        public Criteria andSu41EqualTo(String value) {
            addCriterion("SU41 =", value, "su41");
            return (Criteria) this;
        }

        public Criteria andSu41NotEqualTo(String value) {
            addCriterion("SU41 <>", value, "su41");
            return (Criteria) this;
        }

        public Criteria andSu41GreaterThan(String value) {
            addCriterion("SU41 >", value, "su41");
            return (Criteria) this;
        }

        public Criteria andSu41GreaterThanOrEqualTo(String value) {
            addCriterion("SU41 >=", value, "su41");
            return (Criteria) this;
        }

        public Criteria andSu41LessThan(String value) {
            addCriterion("SU41 <", value, "su41");
            return (Criteria) this;
        }

        public Criteria andSu41LessThanOrEqualTo(String value) {
            addCriterion("SU41 <=", value, "su41");
            return (Criteria) this;
        }

        public Criteria andSu41Like(String value) {
            addCriterion("SU41 like", value, "su41");
            return (Criteria) this;
        }

        public Criteria andSu41NotLike(String value) {
            addCriterion("SU41 not like", value, "su41");
            return (Criteria) this;
        }

        public Criteria andSu41In(List<String> values) {
            addCriterion("SU41 in", values, "su41");
            return (Criteria) this;
        }

        public Criteria andSu41NotIn(List<String> values) {
            addCriterion("SU41 not in", values, "su41");
            return (Criteria) this;
        }

        public Criteria andSu41Between(String value1, String value2) {
            addCriterion("SU41 between", value1, value2, "su41");
            return (Criteria) this;
        }

        public Criteria andSu41NotBetween(String value1, String value2) {
            addCriterion("SU41 not between", value1, value2, "su41");
            return (Criteria) this;
        }

        public Criteria andSu42IsNull() {
            addCriterion("SU42 is null");
            return (Criteria) this;
        }

        public Criteria andSu42IsNotNull() {
            addCriterion("SU42 is not null");
            return (Criteria) this;
        }

        public Criteria andSu42EqualTo(String value) {
            addCriterion("SU42 =", value, "su42");
            return (Criteria) this;
        }

        public Criteria andSu42NotEqualTo(String value) {
            addCriterion("SU42 <>", value, "su42");
            return (Criteria) this;
        }

        public Criteria andSu42GreaterThan(String value) {
            addCriterion("SU42 >", value, "su42");
            return (Criteria) this;
        }

        public Criteria andSu42GreaterThanOrEqualTo(String value) {
            addCriterion("SU42 >=", value, "su42");
            return (Criteria) this;
        }

        public Criteria andSu42LessThan(String value) {
            addCriterion("SU42 <", value, "su42");
            return (Criteria) this;
        }

        public Criteria andSu42LessThanOrEqualTo(String value) {
            addCriterion("SU42 <=", value, "su42");
            return (Criteria) this;
        }

        public Criteria andSu42Like(String value) {
            addCriterion("SU42 like", value, "su42");
            return (Criteria) this;
        }

        public Criteria andSu42NotLike(String value) {
            addCriterion("SU42 not like", value, "su42");
            return (Criteria) this;
        }

        public Criteria andSu42In(List<String> values) {
            addCriterion("SU42 in", values, "su42");
            return (Criteria) this;
        }

        public Criteria andSu42NotIn(List<String> values) {
            addCriterion("SU42 not in", values, "su42");
            return (Criteria) this;
        }

        public Criteria andSu42Between(String value1, String value2) {
            addCriterion("SU42 between", value1, value2, "su42");
            return (Criteria) this;
        }

        public Criteria andSu42NotBetween(String value1, String value2) {
            addCriterion("SU42 not between", value1, value2, "su42");
            return (Criteria) this;
        }

        public Criteria andZmv8cardidsIsNull() {
            addCriterion("ZMV8CARDIDS is null");
            return (Criteria) this;
        }

        public Criteria andZmv8cardidsIsNotNull() {
            addCriterion("ZMV8CARDIDS is not null");
            return (Criteria) this;
        }

        public Criteria andZmv8cardidsEqualTo(String value) {
            addCriterion("ZMV8CARDIDS =", value, "zmv8cardids");
            return (Criteria) this;
        }

        public Criteria andZmv8cardidsNotEqualTo(String value) {
            addCriterion("ZMV8CARDIDS <>", value, "zmv8cardids");
            return (Criteria) this;
        }

        public Criteria andZmv8cardidsGreaterThan(String value) {
            addCriterion("ZMV8CARDIDS >", value, "zmv8cardids");
            return (Criteria) this;
        }

        public Criteria andZmv8cardidsGreaterThanOrEqualTo(String value) {
            addCriterion("ZMV8CARDIDS >=", value, "zmv8cardids");
            return (Criteria) this;
        }

        public Criteria andZmv8cardidsLessThan(String value) {
            addCriterion("ZMV8CARDIDS <", value, "zmv8cardids");
            return (Criteria) this;
        }

        public Criteria andZmv8cardidsLessThanOrEqualTo(String value) {
            addCriterion("ZMV8CARDIDS <=", value, "zmv8cardids");
            return (Criteria) this;
        }

        public Criteria andZmv8cardidsLike(String value) {
            addCriterion("ZMV8CARDIDS like", value, "zmv8cardids");
            return (Criteria) this;
        }

        public Criteria andZmv8cardidsNotLike(String value) {
            addCriterion("ZMV8CARDIDS not like", value, "zmv8cardids");
            return (Criteria) this;
        }

        public Criteria andZmv8cardidsIn(List<String> values) {
            addCriterion("ZMV8CARDIDS in", values, "zmv8cardids");
            return (Criteria) this;
        }

        public Criteria andZmv8cardidsNotIn(List<String> values) {
            addCriterion("ZMV8CARDIDS not in", values, "zmv8cardids");
            return (Criteria) this;
        }

        public Criteria andZmv8cardidsBetween(String value1, String value2) {
            addCriterion("ZMV8CARDIDS between", value1, value2, "zmv8cardids");
            return (Criteria) this;
        }

        public Criteria andZmv8cardidsNotBetween(String value1, String value2) {
            addCriterion("ZMV8CARDIDS not between", value1, value2, "zmv8cardids");
            return (Criteria) this;
        }

        public Criteria andCocallsIsNull() {
            addCriterion("COCALLS is null");
            return (Criteria) this;
        }

        public Criteria andCocallsIsNotNull() {
            addCriterion("COCALLS is not null");
            return (Criteria) this;
        }

        public Criteria andCocallsEqualTo(String value) {
            addCriterion("COCALLS =", value, "cocalls");
            return (Criteria) this;
        }

        public Criteria andCocallsNotEqualTo(String value) {
            addCriterion("COCALLS <>", value, "cocalls");
            return (Criteria) this;
        }

        public Criteria andCocallsGreaterThan(String value) {
            addCriterion("COCALLS >", value, "cocalls");
            return (Criteria) this;
        }

        public Criteria andCocallsGreaterThanOrEqualTo(String value) {
            addCriterion("COCALLS >=", value, "cocalls");
            return (Criteria) this;
        }

        public Criteria andCocallsLessThan(String value) {
            addCriterion("COCALLS <", value, "cocalls");
            return (Criteria) this;
        }

        public Criteria andCocallsLessThanOrEqualTo(String value) {
            addCriterion("COCALLS <=", value, "cocalls");
            return (Criteria) this;
        }

        public Criteria andCocallsLike(String value) {
            addCriterion("COCALLS like", value, "cocalls");
            return (Criteria) this;
        }

        public Criteria andCocallsNotLike(String value) {
            addCriterion("COCALLS not like", value, "cocalls");
            return (Criteria) this;
        }

        public Criteria andCocallsIn(List<String> values) {
            addCriterion("COCALLS in", values, "cocalls");
            return (Criteria) this;
        }

        public Criteria andCocallsNotIn(List<String> values) {
            addCriterion("COCALLS not in", values, "cocalls");
            return (Criteria) this;
        }

        public Criteria andCocallsBetween(String value1, String value2) {
            addCriterion("COCALLS between", value1, value2, "cocalls");
            return (Criteria) this;
        }

        public Criteria andCocallsNotBetween(String value1, String value2) {
            addCriterion("COCALLS not between", value1, value2, "cocalls");
            return (Criteria) this;
        }

        public Criteria andSu43IsNull() {
            addCriterion("SU43 is null");
            return (Criteria) this;
        }

        public Criteria andSu43IsNotNull() {
            addCriterion("SU43 is not null");
            return (Criteria) this;
        }

        public Criteria andSu43EqualTo(String value) {
            addCriterion("SU43 =", value, "su43");
            return (Criteria) this;
        }

        public Criteria andSu43NotEqualTo(String value) {
            addCriterion("SU43 <>", value, "su43");
            return (Criteria) this;
        }

        public Criteria andSu43GreaterThan(String value) {
            addCriterion("SU43 >", value, "su43");
            return (Criteria) this;
        }

        public Criteria andSu43GreaterThanOrEqualTo(String value) {
            addCriterion("SU43 >=", value, "su43");
            return (Criteria) this;
        }

        public Criteria andSu43LessThan(String value) {
            addCriterion("SU43 <", value, "su43");
            return (Criteria) this;
        }

        public Criteria andSu43LessThanOrEqualTo(String value) {
            addCriterion("SU43 <=", value, "su43");
            return (Criteria) this;
        }

        public Criteria andSu43Like(String value) {
            addCriterion("SU43 like", value, "su43");
            return (Criteria) this;
        }

        public Criteria andSu43NotLike(String value) {
            addCriterion("SU43 not like", value, "su43");
            return (Criteria) this;
        }

        public Criteria andSu43In(List<String> values) {
            addCriterion("SU43 in", values, "su43");
            return (Criteria) this;
        }

        public Criteria andSu43NotIn(List<String> values) {
            addCriterion("SU43 not in", values, "su43");
            return (Criteria) this;
        }

        public Criteria andSu43Between(String value1, String value2) {
            addCriterion("SU43 between", value1, value2, "su43");
            return (Criteria) this;
        }

        public Criteria andSu43NotBetween(String value1, String value2) {
            addCriterion("SU43 not between", value1, value2, "su43");
            return (Criteria) this;
        }

        public Criteria andSu44IsNull() {
            addCriterion("SU44 is null");
            return (Criteria) this;
        }

        public Criteria andSu44IsNotNull() {
            addCriterion("SU44 is not null");
            return (Criteria) this;
        }

        public Criteria andSu44EqualTo(String value) {
            addCriterion("SU44 =", value, "su44");
            return (Criteria) this;
        }

        public Criteria andSu44NotEqualTo(String value) {
            addCriterion("SU44 <>", value, "su44");
            return (Criteria) this;
        }

        public Criteria andSu44GreaterThan(String value) {
            addCriterion("SU44 >", value, "su44");
            return (Criteria) this;
        }

        public Criteria andSu44GreaterThanOrEqualTo(String value) {
            addCriterion("SU44 >=", value, "su44");
            return (Criteria) this;
        }

        public Criteria andSu44LessThan(String value) {
            addCriterion("SU44 <", value, "su44");
            return (Criteria) this;
        }

        public Criteria andSu44LessThanOrEqualTo(String value) {
            addCriterion("SU44 <=", value, "su44");
            return (Criteria) this;
        }

        public Criteria andSu44Like(String value) {
            addCriterion("SU44 like", value, "su44");
            return (Criteria) this;
        }

        public Criteria andSu44NotLike(String value) {
            addCriterion("SU44 not like", value, "su44");
            return (Criteria) this;
        }

        public Criteria andSu44In(List<String> values) {
            addCriterion("SU44 in", values, "su44");
            return (Criteria) this;
        }

        public Criteria andSu44NotIn(List<String> values) {
            addCriterion("SU44 not in", values, "su44");
            return (Criteria) this;
        }

        public Criteria andSu44Between(String value1, String value2) {
            addCriterion("SU44 between", value1, value2, "su44");
            return (Criteria) this;
        }

        public Criteria andSu44NotBetween(String value1, String value2) {
            addCriterion("SU44 not between", value1, value2, "su44");
            return (Criteria) this;
        }

        public Criteria andSu45IsNull() {
            addCriterion("SU45 is null");
            return (Criteria) this;
        }

        public Criteria andSu45IsNotNull() {
            addCriterion("SU45 is not null");
            return (Criteria) this;
        }

        public Criteria andSu45EqualTo(String value) {
            addCriterion("SU45 =", value, "su45");
            return (Criteria) this;
        }

        public Criteria andSu45NotEqualTo(String value) {
            addCriterion("SU45 <>", value, "su45");
            return (Criteria) this;
        }

        public Criteria andSu45GreaterThan(String value) {
            addCriterion("SU45 >", value, "su45");
            return (Criteria) this;
        }

        public Criteria andSu45GreaterThanOrEqualTo(String value) {
            addCriterion("SU45 >=", value, "su45");
            return (Criteria) this;
        }

        public Criteria andSu45LessThan(String value) {
            addCriterion("SU45 <", value, "su45");
            return (Criteria) this;
        }

        public Criteria andSu45LessThanOrEqualTo(String value) {
            addCriterion("SU45 <=", value, "su45");
            return (Criteria) this;
        }

        public Criteria andSu45Like(String value) {
            addCriterion("SU45 like", value, "su45");
            return (Criteria) this;
        }

        public Criteria andSu45NotLike(String value) {
            addCriterion("SU45 not like", value, "su45");
            return (Criteria) this;
        }

        public Criteria andSu45In(List<String> values) {
            addCriterion("SU45 in", values, "su45");
            return (Criteria) this;
        }

        public Criteria andSu45NotIn(List<String> values) {
            addCriterion("SU45 not in", values, "su45");
            return (Criteria) this;
        }

        public Criteria andSu45Between(String value1, String value2) {
            addCriterion("SU45 between", value1, value2, "su45");
            return (Criteria) this;
        }

        public Criteria andSu45NotBetween(String value1, String value2) {
            addCriterion("SU45 not between", value1, value2, "su45");
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