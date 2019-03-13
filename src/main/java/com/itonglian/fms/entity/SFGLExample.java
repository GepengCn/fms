package com.itonglian.fms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SFGLExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SFGLExample() {
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

        public Criteria andSf00IsNull() {
            addCriterion("SF00 is null");
            return (Criteria) this;
        }

        public Criteria andSf00IsNotNull() {
            addCriterion("SF00 is not null");
            return (Criteria) this;
        }

        public Criteria andSf00EqualTo(Long value) {
            addCriterion("SF00 =", value, "sf00");
            return (Criteria) this;
        }

        public Criteria andSf00NotEqualTo(Long value) {
            addCriterion("SF00 <>", value, "sf00");
            return (Criteria) this;
        }

        public Criteria andSf00GreaterThan(Long value) {
            addCriterion("SF00 >", value, "sf00");
            return (Criteria) this;
        }

        public Criteria andSf00GreaterThanOrEqualTo(Long value) {
            addCriterion("SF00 >=", value, "sf00");
            return (Criteria) this;
        }

        public Criteria andSf00LessThan(Long value) {
            addCriterion("SF00 <", value, "sf00");
            return (Criteria) this;
        }

        public Criteria andSf00LessThanOrEqualTo(Long value) {
            addCriterion("SF00 <=", value, "sf00");
            return (Criteria) this;
        }

        public Criteria andSf00In(List<Long> values) {
            addCriterion("SF00 in", values, "sf00");
            return (Criteria) this;
        }

        public Criteria andSf00NotIn(List<Long> values) {
            addCriterion("SF00 not in", values, "sf00");
            return (Criteria) this;
        }

        public Criteria andSf00Between(Long value1, Long value2) {
            addCriterion("SF00 between", value1, value2, "sf00");
            return (Criteria) this;
        }

        public Criteria andSf00NotBetween(Long value1, Long value2) {
            addCriterion("SF00 not between", value1, value2, "sf00");
            return (Criteria) this;
        }

        public Criteria andSf01IsNull() {
            addCriterion("SF01 is null");
            return (Criteria) this;
        }

        public Criteria andSf01IsNotNull() {
            addCriterion("SF01 is not null");
            return (Criteria) this;
        }

        public Criteria andSf01EqualTo(String value) {
            addCriterion("SF01 =", value, "sf01");
            return (Criteria) this;
        }

        public Criteria andSf01NotEqualTo(String value) {
            addCriterion("SF01 <>", value, "sf01");
            return (Criteria) this;
        }

        public Criteria andSf01GreaterThan(String value) {
            addCriterion("SF01 >", value, "sf01");
            return (Criteria) this;
        }

        public Criteria andSf01GreaterThanOrEqualTo(String value) {
            addCriterion("SF01 >=", value, "sf01");
            return (Criteria) this;
        }

        public Criteria andSf01LessThan(String value) {
            addCriterion("SF01 <", value, "sf01");
            return (Criteria) this;
        }

        public Criteria andSf01LessThanOrEqualTo(String value) {
            addCriterion("SF01 <=", value, "sf01");
            return (Criteria) this;
        }

        public Criteria andSf01Like(String value) {
            addCriterion("SF01 like", value, "sf01");
            return (Criteria) this;
        }

        public Criteria andSf01NotLike(String value) {
            addCriterion("SF01 not like", value, "sf01");
            return (Criteria) this;
        }

        public Criteria andSf01In(List<String> values) {
            addCriterion("SF01 in", values, "sf01");
            return (Criteria) this;
        }

        public Criteria andSf01NotIn(List<String> values) {
            addCriterion("SF01 not in", values, "sf01");
            return (Criteria) this;
        }

        public Criteria andSf01Between(String value1, String value2) {
            addCriterion("SF01 between", value1, value2, "sf01");
            return (Criteria) this;
        }

        public Criteria andSf01NotBetween(String value1, String value2) {
            addCriterion("SF01 not between", value1, value2, "sf01");
            return (Criteria) this;
        }

        public Criteria andSf02IsNull() {
            addCriterion("SF02 is null");
            return (Criteria) this;
        }

        public Criteria andSf02IsNotNull() {
            addCriterion("SF02 is not null");
            return (Criteria) this;
        }

        public Criteria andSf02EqualTo(String value) {
            addCriterion("SF02 =", value, "sf02");
            return (Criteria) this;
        }

        public Criteria andSf02NotEqualTo(String value) {
            addCriterion("SF02 <>", value, "sf02");
            return (Criteria) this;
        }

        public Criteria andSf02GreaterThan(String value) {
            addCriterion("SF02 >", value, "sf02");
            return (Criteria) this;
        }

        public Criteria andSf02GreaterThanOrEqualTo(String value) {
            addCriterion("SF02 >=", value, "sf02");
            return (Criteria) this;
        }

        public Criteria andSf02LessThan(String value) {
            addCriterion("SF02 <", value, "sf02");
            return (Criteria) this;
        }

        public Criteria andSf02LessThanOrEqualTo(String value) {
            addCriterion("SF02 <=", value, "sf02");
            return (Criteria) this;
        }

        public Criteria andSf02Like(String value) {
            addCriterion("SF02 like", value, "sf02");
            return (Criteria) this;
        }

        public Criteria andSf02NotLike(String value) {
            addCriterion("SF02 not like", value, "sf02");
            return (Criteria) this;
        }

        public Criteria andSf02In(List<String> values) {
            addCriterion("SF02 in", values, "sf02");
            return (Criteria) this;
        }

        public Criteria andSf02NotIn(List<String> values) {
            addCriterion("SF02 not in", values, "sf02");
            return (Criteria) this;
        }

        public Criteria andSf02Between(String value1, String value2) {
            addCriterion("SF02 between", value1, value2, "sf02");
            return (Criteria) this;
        }

        public Criteria andSf02NotBetween(String value1, String value2) {
            addCriterion("SF02 not between", value1, value2, "sf02");
            return (Criteria) this;
        }

        public Criteria andSf03IsNull() {
            addCriterion("SF03 is null");
            return (Criteria) this;
        }

        public Criteria andSf03IsNotNull() {
            addCriterion("SF03 is not null");
            return (Criteria) this;
        }

        public Criteria andSf03EqualTo(String value) {
            addCriterion("SF03 =", value, "sf03");
            return (Criteria) this;
        }

        public Criteria andSf03NotEqualTo(String value) {
            addCriterion("SF03 <>", value, "sf03");
            return (Criteria) this;
        }

        public Criteria andSf03GreaterThan(String value) {
            addCriterion("SF03 >", value, "sf03");
            return (Criteria) this;
        }

        public Criteria andSf03GreaterThanOrEqualTo(String value) {
            addCriterion("SF03 >=", value, "sf03");
            return (Criteria) this;
        }

        public Criteria andSf03LessThan(String value) {
            addCriterion("SF03 <", value, "sf03");
            return (Criteria) this;
        }

        public Criteria andSf03LessThanOrEqualTo(String value) {
            addCriterion("SF03 <=", value, "sf03");
            return (Criteria) this;
        }

        public Criteria andSf03Like(String value) {
            addCriterion("SF03 like", value, "sf03");
            return (Criteria) this;
        }

        public Criteria andSf03NotLike(String value) {
            addCriterion("SF03 not like", value, "sf03");
            return (Criteria) this;
        }

        public Criteria andSf03In(List<String> values) {
            addCriterion("SF03 in", values, "sf03");
            return (Criteria) this;
        }

        public Criteria andSf03NotIn(List<String> values) {
            addCriterion("SF03 not in", values, "sf03");
            return (Criteria) this;
        }

        public Criteria andSf03Between(String value1, String value2) {
            addCriterion("SF03 between", value1, value2, "sf03");
            return (Criteria) this;
        }

        public Criteria andSf03NotBetween(String value1, String value2) {
            addCriterion("SF03 not between", value1, value2, "sf03");
            return (Criteria) this;
        }

        public Criteria andSf04IsNull() {
            addCriterion("SF04 is null");
            return (Criteria) this;
        }

        public Criteria andSf04IsNotNull() {
            addCriterion("SF04 is not null");
            return (Criteria) this;
        }

        public Criteria andSf04EqualTo(String value) {
            addCriterion("SF04 =", value, "sf04");
            return (Criteria) this;
        }

        public Criteria andSf04NotEqualTo(String value) {
            addCriterion("SF04 <>", value, "sf04");
            return (Criteria) this;
        }

        public Criteria andSf04GreaterThan(String value) {
            addCriterion("SF04 >", value, "sf04");
            return (Criteria) this;
        }

        public Criteria andSf04GreaterThanOrEqualTo(String value) {
            addCriterion("SF04 >=", value, "sf04");
            return (Criteria) this;
        }

        public Criteria andSf04LessThan(String value) {
            addCriterion("SF04 <", value, "sf04");
            return (Criteria) this;
        }

        public Criteria andSf04LessThanOrEqualTo(String value) {
            addCriterion("SF04 <=", value, "sf04");
            return (Criteria) this;
        }

        public Criteria andSf04Like(String value) {
            addCriterion("SF04 like", value, "sf04");
            return (Criteria) this;
        }

        public Criteria andSf04NotLike(String value) {
            addCriterion("SF04 not like", value, "sf04");
            return (Criteria) this;
        }

        public Criteria andSf04In(List<String> values) {
            addCriterion("SF04 in", values, "sf04");
            return (Criteria) this;
        }

        public Criteria andSf04NotIn(List<String> values) {
            addCriterion("SF04 not in", values, "sf04");
            return (Criteria) this;
        }

        public Criteria andSf04Between(String value1, String value2) {
            addCriterion("SF04 between", value1, value2, "sf04");
            return (Criteria) this;
        }

        public Criteria andSf04NotBetween(String value1, String value2) {
            addCriterion("SF04 not between", value1, value2, "sf04");
            return (Criteria) this;
        }

        public Criteria andSf05IsNull() {
            addCriterion("SF05 is null");
            return (Criteria) this;
        }

        public Criteria andSf05IsNotNull() {
            addCriterion("SF05 is not null");
            return (Criteria) this;
        }

        public Criteria andSf05EqualTo(String value) {
            addCriterion("SF05 =", value, "sf05");
            return (Criteria) this;
        }

        public Criteria andSf05NotEqualTo(String value) {
            addCriterion("SF05 <>", value, "sf05");
            return (Criteria) this;
        }

        public Criteria andSf05GreaterThan(String value) {
            addCriterion("SF05 >", value, "sf05");
            return (Criteria) this;
        }

        public Criteria andSf05GreaterThanOrEqualTo(String value) {
            addCriterion("SF05 >=", value, "sf05");
            return (Criteria) this;
        }

        public Criteria andSf05LessThan(String value) {
            addCriterion("SF05 <", value, "sf05");
            return (Criteria) this;
        }

        public Criteria andSf05LessThanOrEqualTo(String value) {
            addCriterion("SF05 <=", value, "sf05");
            return (Criteria) this;
        }

        public Criteria andSf05Like(String value) {
            addCriterion("SF05 like", value, "sf05");
            return (Criteria) this;
        }

        public Criteria andSf05NotLike(String value) {
            addCriterion("SF05 not like", value, "sf05");
            return (Criteria) this;
        }

        public Criteria andSf05In(List<String> values) {
            addCriterion("SF05 in", values, "sf05");
            return (Criteria) this;
        }

        public Criteria andSf05NotIn(List<String> values) {
            addCriterion("SF05 not in", values, "sf05");
            return (Criteria) this;
        }

        public Criteria andSf05Between(String value1, String value2) {
            addCriterion("SF05 between", value1, value2, "sf05");
            return (Criteria) this;
        }

        public Criteria andSf05NotBetween(String value1, String value2) {
            addCriterion("SF05 not between", value1, value2, "sf05");
            return (Criteria) this;
        }

        public Criteria andSf06IsNull() {
            addCriterion("SF06 is null");
            return (Criteria) this;
        }

        public Criteria andSf06IsNotNull() {
            addCriterion("SF06 is not null");
            return (Criteria) this;
        }

        public Criteria andSf06EqualTo(String value) {
            addCriterion("SF06 =", value, "sf06");
            return (Criteria) this;
        }

        public Criteria andSf06NotEqualTo(String value) {
            addCriterion("SF06 <>", value, "sf06");
            return (Criteria) this;
        }

        public Criteria andSf06GreaterThan(String value) {
            addCriterion("SF06 >", value, "sf06");
            return (Criteria) this;
        }

        public Criteria andSf06GreaterThanOrEqualTo(String value) {
            addCriterion("SF06 >=", value, "sf06");
            return (Criteria) this;
        }

        public Criteria andSf06LessThan(String value) {
            addCriterion("SF06 <", value, "sf06");
            return (Criteria) this;
        }

        public Criteria andSf06LessThanOrEqualTo(String value) {
            addCriterion("SF06 <=", value, "sf06");
            return (Criteria) this;
        }

        public Criteria andSf06Like(String value) {
            addCriterion("SF06 like", value, "sf06");
            return (Criteria) this;
        }

        public Criteria andSf06NotLike(String value) {
            addCriterion("SF06 not like", value, "sf06");
            return (Criteria) this;
        }

        public Criteria andSf06In(List<String> values) {
            addCriterion("SF06 in", values, "sf06");
            return (Criteria) this;
        }

        public Criteria andSf06NotIn(List<String> values) {
            addCriterion("SF06 not in", values, "sf06");
            return (Criteria) this;
        }

        public Criteria andSf06Between(String value1, String value2) {
            addCriterion("SF06 between", value1, value2, "sf06");
            return (Criteria) this;
        }

        public Criteria andSf06NotBetween(String value1, String value2) {
            addCriterion("SF06 not between", value1, value2, "sf06");
            return (Criteria) this;
        }

        public Criteria andSf07IsNull() {
            addCriterion("SF07 is null");
            return (Criteria) this;
        }

        public Criteria andSf07IsNotNull() {
            addCriterion("SF07 is not null");
            return (Criteria) this;
        }

        public Criteria andSf07EqualTo(String value) {
            addCriterion("SF07 =", value, "sf07");
            return (Criteria) this;
        }

        public Criteria andSf07NotEqualTo(String value) {
            addCriterion("SF07 <>", value, "sf07");
            return (Criteria) this;
        }

        public Criteria andSf07GreaterThan(String value) {
            addCriterion("SF07 >", value, "sf07");
            return (Criteria) this;
        }

        public Criteria andSf07GreaterThanOrEqualTo(String value) {
            addCriterion("SF07 >=", value, "sf07");
            return (Criteria) this;
        }

        public Criteria andSf07LessThan(String value) {
            addCriterion("SF07 <", value, "sf07");
            return (Criteria) this;
        }

        public Criteria andSf07LessThanOrEqualTo(String value) {
            addCriterion("SF07 <=", value, "sf07");
            return (Criteria) this;
        }

        public Criteria andSf07Like(String value) {
            addCriterion("SF07 like", value, "sf07");
            return (Criteria) this;
        }

        public Criteria andSf07NotLike(String value) {
            addCriterion("SF07 not like", value, "sf07");
            return (Criteria) this;
        }

        public Criteria andSf07In(List<String> values) {
            addCriterion("SF07 in", values, "sf07");
            return (Criteria) this;
        }

        public Criteria andSf07NotIn(List<String> values) {
            addCriterion("SF07 not in", values, "sf07");
            return (Criteria) this;
        }

        public Criteria andSf07Between(String value1, String value2) {
            addCriterion("SF07 between", value1, value2, "sf07");
            return (Criteria) this;
        }

        public Criteria andSf07NotBetween(String value1, String value2) {
            addCriterion("SF07 not between", value1, value2, "sf07");
            return (Criteria) this;
        }

        public Criteria andSf08IsNull() {
            addCriterion("SF08 is null");
            return (Criteria) this;
        }

        public Criteria andSf08IsNotNull() {
            addCriterion("SF08 is not null");
            return (Criteria) this;
        }

        public Criteria andSf08EqualTo(String value) {
            addCriterion("SF08 =", value, "sf08");
            return (Criteria) this;
        }

        public Criteria andSf08NotEqualTo(String value) {
            addCriterion("SF08 <>", value, "sf08");
            return (Criteria) this;
        }

        public Criteria andSf08GreaterThan(String value) {
            addCriterion("SF08 >", value, "sf08");
            return (Criteria) this;
        }

        public Criteria andSf08GreaterThanOrEqualTo(String value) {
            addCriterion("SF08 >=", value, "sf08");
            return (Criteria) this;
        }

        public Criteria andSf08LessThan(String value) {
            addCriterion("SF08 <", value, "sf08");
            return (Criteria) this;
        }

        public Criteria andSf08LessThanOrEqualTo(String value) {
            addCriterion("SF08 <=", value, "sf08");
            return (Criteria) this;
        }

        public Criteria andSf08Like(String value) {
            addCriterion("SF08 like", value, "sf08");
            return (Criteria) this;
        }

        public Criteria andSf08NotLike(String value) {
            addCriterion("SF08 not like", value, "sf08");
            return (Criteria) this;
        }

        public Criteria andSf08In(List<String> values) {
            addCriterion("SF08 in", values, "sf08");
            return (Criteria) this;
        }

        public Criteria andSf08NotIn(List<String> values) {
            addCriterion("SF08 not in", values, "sf08");
            return (Criteria) this;
        }

        public Criteria andSf08Between(String value1, String value2) {
            addCriterion("SF08 between", value1, value2, "sf08");
            return (Criteria) this;
        }

        public Criteria andSf08NotBetween(String value1, String value2) {
            addCriterion("SF08 not between", value1, value2, "sf08");
            return (Criteria) this;
        }

        public Criteria andSf09IsNull() {
            addCriterion("SF09 is null");
            return (Criteria) this;
        }

        public Criteria andSf09IsNotNull() {
            addCriterion("SF09 is not null");
            return (Criteria) this;
        }

        public Criteria andSf09EqualTo(String value) {
            addCriterion("SF09 =", value, "sf09");
            return (Criteria) this;
        }

        public Criteria andSf09NotEqualTo(String value) {
            addCriterion("SF09 <>", value, "sf09");
            return (Criteria) this;
        }

        public Criteria andSf09GreaterThan(String value) {
            addCriterion("SF09 >", value, "sf09");
            return (Criteria) this;
        }

        public Criteria andSf09GreaterThanOrEqualTo(String value) {
            addCriterion("SF09 >=", value, "sf09");
            return (Criteria) this;
        }

        public Criteria andSf09LessThan(String value) {
            addCriterion("SF09 <", value, "sf09");
            return (Criteria) this;
        }

        public Criteria andSf09LessThanOrEqualTo(String value) {
            addCriterion("SF09 <=", value, "sf09");
            return (Criteria) this;
        }

        public Criteria andSf09Like(String value) {
            addCriterion("SF09 like", value, "sf09");
            return (Criteria) this;
        }

        public Criteria andSf09NotLike(String value) {
            addCriterion("SF09 not like", value, "sf09");
            return (Criteria) this;
        }

        public Criteria andSf09In(List<String> values) {
            addCriterion("SF09 in", values, "sf09");
            return (Criteria) this;
        }

        public Criteria andSf09NotIn(List<String> values) {
            addCriterion("SF09 not in", values, "sf09");
            return (Criteria) this;
        }

        public Criteria andSf09Between(String value1, String value2) {
            addCriterion("SF09 between", value1, value2, "sf09");
            return (Criteria) this;
        }

        public Criteria andSf09NotBetween(String value1, String value2) {
            addCriterion("SF09 not between", value1, value2, "sf09");
            return (Criteria) this;
        }

        public Criteria andSf10IsNull() {
            addCriterion("SF10 is null");
            return (Criteria) this;
        }

        public Criteria andSf10IsNotNull() {
            addCriterion("SF10 is not null");
            return (Criteria) this;
        }

        public Criteria andSf10EqualTo(String value) {
            addCriterion("SF10 =", value, "sf10");
            return (Criteria) this;
        }

        public Criteria andSf10NotEqualTo(String value) {
            addCriterion("SF10 <>", value, "sf10");
            return (Criteria) this;
        }

        public Criteria andSf10GreaterThan(String value) {
            addCriterion("SF10 >", value, "sf10");
            return (Criteria) this;
        }

        public Criteria andSf10GreaterThanOrEqualTo(String value) {
            addCriterion("SF10 >=", value, "sf10");
            return (Criteria) this;
        }

        public Criteria andSf10LessThan(String value) {
            addCriterion("SF10 <", value, "sf10");
            return (Criteria) this;
        }

        public Criteria andSf10LessThanOrEqualTo(String value) {
            addCriterion("SF10 <=", value, "sf10");
            return (Criteria) this;
        }

        public Criteria andSf10Like(String value) {
            addCriterion("SF10 like", value, "sf10");
            return (Criteria) this;
        }

        public Criteria andSf10NotLike(String value) {
            addCriterion("SF10 not like", value, "sf10");
            return (Criteria) this;
        }

        public Criteria andSf10In(List<String> values) {
            addCriterion("SF10 in", values, "sf10");
            return (Criteria) this;
        }

        public Criteria andSf10NotIn(List<String> values) {
            addCriterion("SF10 not in", values, "sf10");
            return (Criteria) this;
        }

        public Criteria andSf10Between(String value1, String value2) {
            addCriterion("SF10 between", value1, value2, "sf10");
            return (Criteria) this;
        }

        public Criteria andSf10NotBetween(String value1, String value2) {
            addCriterion("SF10 not between", value1, value2, "sf10");
            return (Criteria) this;
        }

        public Criteria andSf11IsNull() {
            addCriterion("SF11 is null");
            return (Criteria) this;
        }

        public Criteria andSf11IsNotNull() {
            addCriterion("SF11 is not null");
            return (Criteria) this;
        }

        public Criteria andSf11EqualTo(String value) {
            addCriterion("SF11 =", value, "sf11");
            return (Criteria) this;
        }

        public Criteria andSf11NotEqualTo(String value) {
            addCriterion("SF11 <>", value, "sf11");
            return (Criteria) this;
        }

        public Criteria andSf11GreaterThan(String value) {
            addCriterion("SF11 >", value, "sf11");
            return (Criteria) this;
        }

        public Criteria andSf11GreaterThanOrEqualTo(String value) {
            addCriterion("SF11 >=", value, "sf11");
            return (Criteria) this;
        }

        public Criteria andSf11LessThan(String value) {
            addCriterion("SF11 <", value, "sf11");
            return (Criteria) this;
        }

        public Criteria andSf11LessThanOrEqualTo(String value) {
            addCriterion("SF11 <=", value, "sf11");
            return (Criteria) this;
        }

        public Criteria andSf11Like(String value) {
            addCriterion("SF11 like", value, "sf11");
            return (Criteria) this;
        }

        public Criteria andSf11NotLike(String value) {
            addCriterion("SF11 not like", value, "sf11");
            return (Criteria) this;
        }

        public Criteria andSf11In(List<String> values) {
            addCriterion("SF11 in", values, "sf11");
            return (Criteria) this;
        }

        public Criteria andSf11NotIn(List<String> values) {
            addCriterion("SF11 not in", values, "sf11");
            return (Criteria) this;
        }

        public Criteria andSf11Between(String value1, String value2) {
            addCriterion("SF11 between", value1, value2, "sf11");
            return (Criteria) this;
        }

        public Criteria andSf11NotBetween(String value1, String value2) {
            addCriterion("SF11 not between", value1, value2, "sf11");
            return (Criteria) this;
        }

        public Criteria andSf12IsNull() {
            addCriterion("SF12 is null");
            return (Criteria) this;
        }

        public Criteria andSf12IsNotNull() {
            addCriterion("SF12 is not null");
            return (Criteria) this;
        }

        public Criteria andSf12EqualTo(String value) {
            addCriterion("SF12 =", value, "sf12");
            return (Criteria) this;
        }

        public Criteria andSf12NotEqualTo(String value) {
            addCriterion("SF12 <>", value, "sf12");
            return (Criteria) this;
        }

        public Criteria andSf12GreaterThan(String value) {
            addCriterion("SF12 >", value, "sf12");
            return (Criteria) this;
        }

        public Criteria andSf12GreaterThanOrEqualTo(String value) {
            addCriterion("SF12 >=", value, "sf12");
            return (Criteria) this;
        }

        public Criteria andSf12LessThan(String value) {
            addCriterion("SF12 <", value, "sf12");
            return (Criteria) this;
        }

        public Criteria andSf12LessThanOrEqualTo(String value) {
            addCriterion("SF12 <=", value, "sf12");
            return (Criteria) this;
        }

        public Criteria andSf12Like(String value) {
            addCriterion("SF12 like", value, "sf12");
            return (Criteria) this;
        }

        public Criteria andSf12NotLike(String value) {
            addCriterion("SF12 not like", value, "sf12");
            return (Criteria) this;
        }

        public Criteria andSf12In(List<String> values) {
            addCriterion("SF12 in", values, "sf12");
            return (Criteria) this;
        }

        public Criteria andSf12NotIn(List<String> values) {
            addCriterion("SF12 not in", values, "sf12");
            return (Criteria) this;
        }

        public Criteria andSf12Between(String value1, String value2) {
            addCriterion("SF12 between", value1, value2, "sf12");
            return (Criteria) this;
        }

        public Criteria andSf12NotBetween(String value1, String value2) {
            addCriterion("SF12 not between", value1, value2, "sf12");
            return (Criteria) this;
        }

        public Criteria andSf13IsNull() {
            addCriterion("SF13 is null");
            return (Criteria) this;
        }

        public Criteria andSf13IsNotNull() {
            addCriterion("SF13 is not null");
            return (Criteria) this;
        }

        public Criteria andSf13EqualTo(String value) {
            addCriterion("SF13 =", value, "sf13");
            return (Criteria) this;
        }

        public Criteria andSf13NotEqualTo(String value) {
            addCriterion("SF13 <>", value, "sf13");
            return (Criteria) this;
        }

        public Criteria andSf13GreaterThan(String value) {
            addCriterion("SF13 >", value, "sf13");
            return (Criteria) this;
        }

        public Criteria andSf13GreaterThanOrEqualTo(String value) {
            addCriterion("SF13 >=", value, "sf13");
            return (Criteria) this;
        }

        public Criteria andSf13LessThan(String value) {
            addCriterion("SF13 <", value, "sf13");
            return (Criteria) this;
        }

        public Criteria andSf13LessThanOrEqualTo(String value) {
            addCriterion("SF13 <=", value, "sf13");
            return (Criteria) this;
        }

        public Criteria andSf13Like(String value) {
            addCriterion("SF13 like", value, "sf13");
            return (Criteria) this;
        }

        public Criteria andSf13NotLike(String value) {
            addCriterion("SF13 not like", value, "sf13");
            return (Criteria) this;
        }

        public Criteria andSf13In(List<String> values) {
            addCriterion("SF13 in", values, "sf13");
            return (Criteria) this;
        }

        public Criteria andSf13NotIn(List<String> values) {
            addCriterion("SF13 not in", values, "sf13");
            return (Criteria) this;
        }

        public Criteria andSf13Between(String value1, String value2) {
            addCriterion("SF13 between", value1, value2, "sf13");
            return (Criteria) this;
        }

        public Criteria andSf13NotBetween(String value1, String value2) {
            addCriterion("SF13 not between", value1, value2, "sf13");
            return (Criteria) this;
        }

        public Criteria andSf14IsNull() {
            addCriterion("SF14 is null");
            return (Criteria) this;
        }

        public Criteria andSf14IsNotNull() {
            addCriterion("SF14 is not null");
            return (Criteria) this;
        }

        public Criteria andSf14EqualTo(String value) {
            addCriterion("SF14 =", value, "sf14");
            return (Criteria) this;
        }

        public Criteria andSf14NotEqualTo(String value) {
            addCriterion("SF14 <>", value, "sf14");
            return (Criteria) this;
        }

        public Criteria andSf14GreaterThan(String value) {
            addCriterion("SF14 >", value, "sf14");
            return (Criteria) this;
        }

        public Criteria andSf14GreaterThanOrEqualTo(String value) {
            addCriterion("SF14 >=", value, "sf14");
            return (Criteria) this;
        }

        public Criteria andSf14LessThan(String value) {
            addCriterion("SF14 <", value, "sf14");
            return (Criteria) this;
        }

        public Criteria andSf14LessThanOrEqualTo(String value) {
            addCriterion("SF14 <=", value, "sf14");
            return (Criteria) this;
        }

        public Criteria andSf14Like(String value) {
            addCriterion("SF14 like", value, "sf14");
            return (Criteria) this;
        }

        public Criteria andSf14NotLike(String value) {
            addCriterion("SF14 not like", value, "sf14");
            return (Criteria) this;
        }

        public Criteria andSf14In(List<String> values) {
            addCriterion("SF14 in", values, "sf14");
            return (Criteria) this;
        }

        public Criteria andSf14NotIn(List<String> values) {
            addCriterion("SF14 not in", values, "sf14");
            return (Criteria) this;
        }

        public Criteria andSf14Between(String value1, String value2) {
            addCriterion("SF14 between", value1, value2, "sf14");
            return (Criteria) this;
        }

        public Criteria andSf14NotBetween(String value1, String value2) {
            addCriterion("SF14 not between", value1, value2, "sf14");
            return (Criteria) this;
        }

        public Criteria andSf15IsNull() {
            addCriterion("SF15 is null");
            return (Criteria) this;
        }

        public Criteria andSf15IsNotNull() {
            addCriterion("SF15 is not null");
            return (Criteria) this;
        }

        public Criteria andSf15EqualTo(String value) {
            addCriterion("SF15 =", value, "sf15");
            return (Criteria) this;
        }

        public Criteria andSf15NotEqualTo(String value) {
            addCriterion("SF15 <>", value, "sf15");
            return (Criteria) this;
        }

        public Criteria andSf15GreaterThan(String value) {
            addCriterion("SF15 >", value, "sf15");
            return (Criteria) this;
        }

        public Criteria andSf15GreaterThanOrEqualTo(String value) {
            addCriterion("SF15 >=", value, "sf15");
            return (Criteria) this;
        }

        public Criteria andSf15LessThan(String value) {
            addCriterion("SF15 <", value, "sf15");
            return (Criteria) this;
        }

        public Criteria andSf15LessThanOrEqualTo(String value) {
            addCriterion("SF15 <=", value, "sf15");
            return (Criteria) this;
        }

        public Criteria andSf15Like(String value) {
            addCriterion("SF15 like", value, "sf15");
            return (Criteria) this;
        }

        public Criteria andSf15NotLike(String value) {
            addCriterion("SF15 not like", value, "sf15");
            return (Criteria) this;
        }

        public Criteria andSf15In(List<String> values) {
            addCriterion("SF15 in", values, "sf15");
            return (Criteria) this;
        }

        public Criteria andSf15NotIn(List<String> values) {
            addCriterion("SF15 not in", values, "sf15");
            return (Criteria) this;
        }

        public Criteria andSf15Between(String value1, String value2) {
            addCriterion("SF15 between", value1, value2, "sf15");
            return (Criteria) this;
        }

        public Criteria andSf15NotBetween(String value1, String value2) {
            addCriterion("SF15 not between", value1, value2, "sf15");
            return (Criteria) this;
        }

        public Criteria andSf16IsNull() {
            addCriterion("SF16 is null");
            return (Criteria) this;
        }

        public Criteria andSf16IsNotNull() {
            addCriterion("SF16 is not null");
            return (Criteria) this;
        }

        public Criteria andSf16EqualTo(String value) {
            addCriterion("SF16 =", value, "sf16");
            return (Criteria) this;
        }

        public Criteria andSf16NotEqualTo(String value) {
            addCriterion("SF16 <>", value, "sf16");
            return (Criteria) this;
        }

        public Criteria andSf16GreaterThan(String value) {
            addCriterion("SF16 >", value, "sf16");
            return (Criteria) this;
        }

        public Criteria andSf16GreaterThanOrEqualTo(String value) {
            addCriterion("SF16 >=", value, "sf16");
            return (Criteria) this;
        }

        public Criteria andSf16LessThan(String value) {
            addCriterion("SF16 <", value, "sf16");
            return (Criteria) this;
        }

        public Criteria andSf16LessThanOrEqualTo(String value) {
            addCriterion("SF16 <=", value, "sf16");
            return (Criteria) this;
        }

        public Criteria andSf16Like(String value) {
            addCriterion("SF16 like", value, "sf16");
            return (Criteria) this;
        }

        public Criteria andSf16NotLike(String value) {
            addCriterion("SF16 not like", value, "sf16");
            return (Criteria) this;
        }

        public Criteria andSf16In(List<String> values) {
            addCriterion("SF16 in", values, "sf16");
            return (Criteria) this;
        }

        public Criteria andSf16NotIn(List<String> values) {
            addCriterion("SF16 not in", values, "sf16");
            return (Criteria) this;
        }

        public Criteria andSf16Between(String value1, String value2) {
            addCriterion("SF16 between", value1, value2, "sf16");
            return (Criteria) this;
        }

        public Criteria andSf16NotBetween(String value1, String value2) {
            addCriterion("SF16 not between", value1, value2, "sf16");
            return (Criteria) this;
        }

        public Criteria andSf17IsNull() {
            addCriterion("SF17 is null");
            return (Criteria) this;
        }

        public Criteria andSf17IsNotNull() {
            addCriterion("SF17 is not null");
            return (Criteria) this;
        }

        public Criteria andSf17EqualTo(String value) {
            addCriterion("SF17 =", value, "sf17");
            return (Criteria) this;
        }

        public Criteria andSf17NotEqualTo(String value) {
            addCriterion("SF17 <>", value, "sf17");
            return (Criteria) this;
        }

        public Criteria andSf17GreaterThan(String value) {
            addCriterion("SF17 >", value, "sf17");
            return (Criteria) this;
        }

        public Criteria andSf17GreaterThanOrEqualTo(String value) {
            addCriterion("SF17 >=", value, "sf17");
            return (Criteria) this;
        }

        public Criteria andSf17LessThan(String value) {
            addCriterion("SF17 <", value, "sf17");
            return (Criteria) this;
        }

        public Criteria andSf17LessThanOrEqualTo(String value) {
            addCriterion("SF17 <=", value, "sf17");
            return (Criteria) this;
        }

        public Criteria andSf17Like(String value) {
            addCriterion("SF17 like", value, "sf17");
            return (Criteria) this;
        }

        public Criteria andSf17NotLike(String value) {
            addCriterion("SF17 not like", value, "sf17");
            return (Criteria) this;
        }

        public Criteria andSf17In(List<String> values) {
            addCriterion("SF17 in", values, "sf17");
            return (Criteria) this;
        }

        public Criteria andSf17NotIn(List<String> values) {
            addCriterion("SF17 not in", values, "sf17");
            return (Criteria) this;
        }

        public Criteria andSf17Between(String value1, String value2) {
            addCriterion("SF17 between", value1, value2, "sf17");
            return (Criteria) this;
        }

        public Criteria andSf17NotBetween(String value1, String value2) {
            addCriterion("SF17 not between", value1, value2, "sf17");
            return (Criteria) this;
        }

        public Criteria andSf18IsNull() {
            addCriterion("SF18 is null");
            return (Criteria) this;
        }

        public Criteria andSf18IsNotNull() {
            addCriterion("SF18 is not null");
            return (Criteria) this;
        }

        public Criteria andSf18EqualTo(String value) {
            addCriterion("SF18 =", value, "sf18");
            return (Criteria) this;
        }

        public Criteria andSf18NotEqualTo(String value) {
            addCriterion("SF18 <>", value, "sf18");
            return (Criteria) this;
        }

        public Criteria andSf18GreaterThan(String value) {
            addCriterion("SF18 >", value, "sf18");
            return (Criteria) this;
        }

        public Criteria andSf18GreaterThanOrEqualTo(String value) {
            addCriterion("SF18 >=", value, "sf18");
            return (Criteria) this;
        }

        public Criteria andSf18LessThan(String value) {
            addCriterion("SF18 <", value, "sf18");
            return (Criteria) this;
        }

        public Criteria andSf18LessThanOrEqualTo(String value) {
            addCriterion("SF18 <=", value, "sf18");
            return (Criteria) this;
        }

        public Criteria andSf18Like(String value) {
            addCriterion("SF18 like", value, "sf18");
            return (Criteria) this;
        }

        public Criteria andSf18NotLike(String value) {
            addCriterion("SF18 not like", value, "sf18");
            return (Criteria) this;
        }

        public Criteria andSf18In(List<String> values) {
            addCriterion("SF18 in", values, "sf18");
            return (Criteria) this;
        }

        public Criteria andSf18NotIn(List<String> values) {
            addCriterion("SF18 not in", values, "sf18");
            return (Criteria) this;
        }

        public Criteria andSf18Between(String value1, String value2) {
            addCriterion("SF18 between", value1, value2, "sf18");
            return (Criteria) this;
        }

        public Criteria andSf18NotBetween(String value1, String value2) {
            addCriterion("SF18 not between", value1, value2, "sf18");
            return (Criteria) this;
        }

        public Criteria andSf19IsNull() {
            addCriterion("SF19 is null");
            return (Criteria) this;
        }

        public Criteria andSf19IsNotNull() {
            addCriterion("SF19 is not null");
            return (Criteria) this;
        }

        public Criteria andSf19EqualTo(String value) {
            addCriterion("SF19 =", value, "sf19");
            return (Criteria) this;
        }

        public Criteria andSf19NotEqualTo(String value) {
            addCriterion("SF19 <>", value, "sf19");
            return (Criteria) this;
        }

        public Criteria andSf19GreaterThan(String value) {
            addCriterion("SF19 >", value, "sf19");
            return (Criteria) this;
        }

        public Criteria andSf19GreaterThanOrEqualTo(String value) {
            addCriterion("SF19 >=", value, "sf19");
            return (Criteria) this;
        }

        public Criteria andSf19LessThan(String value) {
            addCriterion("SF19 <", value, "sf19");
            return (Criteria) this;
        }

        public Criteria andSf19LessThanOrEqualTo(String value) {
            addCriterion("SF19 <=", value, "sf19");
            return (Criteria) this;
        }

        public Criteria andSf19Like(String value) {
            addCriterion("SF19 like", value, "sf19");
            return (Criteria) this;
        }

        public Criteria andSf19NotLike(String value) {
            addCriterion("SF19 not like", value, "sf19");
            return (Criteria) this;
        }

        public Criteria andSf19In(List<String> values) {
            addCriterion("SF19 in", values, "sf19");
            return (Criteria) this;
        }

        public Criteria andSf19NotIn(List<String> values) {
            addCriterion("SF19 not in", values, "sf19");
            return (Criteria) this;
        }

        public Criteria andSf19Between(String value1, String value2) {
            addCriterion("SF19 between", value1, value2, "sf19");
            return (Criteria) this;
        }

        public Criteria andSf19NotBetween(String value1, String value2) {
            addCriterion("SF19 not between", value1, value2, "sf19");
            return (Criteria) this;
        }

        public Criteria andSf20IsNull() {
            addCriterion("SF20 is null");
            return (Criteria) this;
        }

        public Criteria andSf20IsNotNull() {
            addCriterion("SF20 is not null");
            return (Criteria) this;
        }

        public Criteria andSf20EqualTo(String value) {
            addCriterion("SF20 =", value, "sf20");
            return (Criteria) this;
        }

        public Criteria andSf20NotEqualTo(String value) {
            addCriterion("SF20 <>", value, "sf20");
            return (Criteria) this;
        }

        public Criteria andSf20GreaterThan(String value) {
            addCriterion("SF20 >", value, "sf20");
            return (Criteria) this;
        }

        public Criteria andSf20GreaterThanOrEqualTo(String value) {
            addCriterion("SF20 >=", value, "sf20");
            return (Criteria) this;
        }

        public Criteria andSf20LessThan(String value) {
            addCriterion("SF20 <", value, "sf20");
            return (Criteria) this;
        }

        public Criteria andSf20LessThanOrEqualTo(String value) {
            addCriterion("SF20 <=", value, "sf20");
            return (Criteria) this;
        }

        public Criteria andSf20Like(String value) {
            addCriterion("SF20 like", value, "sf20");
            return (Criteria) this;
        }

        public Criteria andSf20NotLike(String value) {
            addCriterion("SF20 not like", value, "sf20");
            return (Criteria) this;
        }

        public Criteria andSf20In(List<String> values) {
            addCriterion("SF20 in", values, "sf20");
            return (Criteria) this;
        }

        public Criteria andSf20NotIn(List<String> values) {
            addCriterion("SF20 not in", values, "sf20");
            return (Criteria) this;
        }

        public Criteria andSf20Between(String value1, String value2) {
            addCriterion("SF20 between", value1, value2, "sf20");
            return (Criteria) this;
        }

        public Criteria andSf20NotBetween(String value1, String value2) {
            addCriterion("SF20 not between", value1, value2, "sf20");
            return (Criteria) this;
        }

        public Criteria andSf21IsNull() {
            addCriterion("SF21 is null");
            return (Criteria) this;
        }

        public Criteria andSf21IsNotNull() {
            addCriterion("SF21 is not null");
            return (Criteria) this;
        }

        public Criteria andSf21EqualTo(String value) {
            addCriterion("SF21 =", value, "sf21");
            return (Criteria) this;
        }

        public Criteria andSf21NotEqualTo(String value) {
            addCriterion("SF21 <>", value, "sf21");
            return (Criteria) this;
        }

        public Criteria andSf21GreaterThan(String value) {
            addCriterion("SF21 >", value, "sf21");
            return (Criteria) this;
        }

        public Criteria andSf21GreaterThanOrEqualTo(String value) {
            addCriterion("SF21 >=", value, "sf21");
            return (Criteria) this;
        }

        public Criteria andSf21LessThan(String value) {
            addCriterion("SF21 <", value, "sf21");
            return (Criteria) this;
        }

        public Criteria andSf21LessThanOrEqualTo(String value) {
            addCriterion("SF21 <=", value, "sf21");
            return (Criteria) this;
        }

        public Criteria andSf21Like(String value) {
            addCriterion("SF21 like", value, "sf21");
            return (Criteria) this;
        }

        public Criteria andSf21NotLike(String value) {
            addCriterion("SF21 not like", value, "sf21");
            return (Criteria) this;
        }

        public Criteria andSf21In(List<String> values) {
            addCriterion("SF21 in", values, "sf21");
            return (Criteria) this;
        }

        public Criteria andSf21NotIn(List<String> values) {
            addCriterion("SF21 not in", values, "sf21");
            return (Criteria) this;
        }

        public Criteria andSf21Between(String value1, String value2) {
            addCriterion("SF21 between", value1, value2, "sf21");
            return (Criteria) this;
        }

        public Criteria andSf21NotBetween(String value1, String value2) {
            addCriterion("SF21 not between", value1, value2, "sf21");
            return (Criteria) this;
        }

        public Criteria andSf22IsNull() {
            addCriterion("SF22 is null");
            return (Criteria) this;
        }

        public Criteria andSf22IsNotNull() {
            addCriterion("SF22 is not null");
            return (Criteria) this;
        }

        public Criteria andSf22EqualTo(String value) {
            addCriterion("SF22 =", value, "sf22");
            return (Criteria) this;
        }

        public Criteria andSf22NotEqualTo(String value) {
            addCriterion("SF22 <>", value, "sf22");
            return (Criteria) this;
        }

        public Criteria andSf22GreaterThan(String value) {
            addCriterion("SF22 >", value, "sf22");
            return (Criteria) this;
        }

        public Criteria andSf22GreaterThanOrEqualTo(String value) {
            addCriterion("SF22 >=", value, "sf22");
            return (Criteria) this;
        }

        public Criteria andSf22LessThan(String value) {
            addCriterion("SF22 <", value, "sf22");
            return (Criteria) this;
        }

        public Criteria andSf22LessThanOrEqualTo(String value) {
            addCriterion("SF22 <=", value, "sf22");
            return (Criteria) this;
        }

        public Criteria andSf22Like(String value) {
            addCriterion("SF22 like", value, "sf22");
            return (Criteria) this;
        }

        public Criteria andSf22NotLike(String value) {
            addCriterion("SF22 not like", value, "sf22");
            return (Criteria) this;
        }

        public Criteria andSf22In(List<String> values) {
            addCriterion("SF22 in", values, "sf22");
            return (Criteria) this;
        }

        public Criteria andSf22NotIn(List<String> values) {
            addCriterion("SF22 not in", values, "sf22");
            return (Criteria) this;
        }

        public Criteria andSf22Between(String value1, String value2) {
            addCriterion("SF22 between", value1, value2, "sf22");
            return (Criteria) this;
        }

        public Criteria andSf22NotBetween(String value1, String value2) {
            addCriterion("SF22 not between", value1, value2, "sf22");
            return (Criteria) this;
        }

        public Criteria andSf23IsNull() {
            addCriterion("SF23 is null");
            return (Criteria) this;
        }

        public Criteria andSf23IsNotNull() {
            addCriterion("SF23 is not null");
            return (Criteria) this;
        }

        public Criteria andSf23EqualTo(String value) {
            addCriterion("SF23 =", value, "sf23");
            return (Criteria) this;
        }

        public Criteria andSf23NotEqualTo(String value) {
            addCriterion("SF23 <>", value, "sf23");
            return (Criteria) this;
        }

        public Criteria andSf23GreaterThan(String value) {
            addCriterion("SF23 >", value, "sf23");
            return (Criteria) this;
        }

        public Criteria andSf23GreaterThanOrEqualTo(String value) {
            addCriterion("SF23 >=", value, "sf23");
            return (Criteria) this;
        }

        public Criteria andSf23LessThan(String value) {
            addCriterion("SF23 <", value, "sf23");
            return (Criteria) this;
        }

        public Criteria andSf23LessThanOrEqualTo(String value) {
            addCriterion("SF23 <=", value, "sf23");
            return (Criteria) this;
        }

        public Criteria andSf23Like(String value) {
            addCriterion("SF23 like", value, "sf23");
            return (Criteria) this;
        }

        public Criteria andSf23NotLike(String value) {
            addCriterion("SF23 not like", value, "sf23");
            return (Criteria) this;
        }

        public Criteria andSf23In(List<String> values) {
            addCriterion("SF23 in", values, "sf23");
            return (Criteria) this;
        }

        public Criteria andSf23NotIn(List<String> values) {
            addCriterion("SF23 not in", values, "sf23");
            return (Criteria) this;
        }

        public Criteria andSf23Between(String value1, String value2) {
            addCriterion("SF23 between", value1, value2, "sf23");
            return (Criteria) this;
        }

        public Criteria andSf23NotBetween(String value1, String value2) {
            addCriterion("SF23 not between", value1, value2, "sf23");
            return (Criteria) this;
        }

        public Criteria andSf24IsNull() {
            addCriterion("SF24 is null");
            return (Criteria) this;
        }

        public Criteria andSf24IsNotNull() {
            addCriterion("SF24 is not null");
            return (Criteria) this;
        }

        public Criteria andSf24EqualTo(String value) {
            addCriterion("SF24 =", value, "sf24");
            return (Criteria) this;
        }

        public Criteria andSf24NotEqualTo(String value) {
            addCriterion("SF24 <>", value, "sf24");
            return (Criteria) this;
        }

        public Criteria andSf24GreaterThan(String value) {
            addCriterion("SF24 >", value, "sf24");
            return (Criteria) this;
        }

        public Criteria andSf24GreaterThanOrEqualTo(String value) {
            addCriterion("SF24 >=", value, "sf24");
            return (Criteria) this;
        }

        public Criteria andSf24LessThan(String value) {
            addCriterion("SF24 <", value, "sf24");
            return (Criteria) this;
        }

        public Criteria andSf24LessThanOrEqualTo(String value) {
            addCriterion("SF24 <=", value, "sf24");
            return (Criteria) this;
        }

        public Criteria andSf24Like(String value) {
            addCriterion("SF24 like", value, "sf24");
            return (Criteria) this;
        }

        public Criteria andSf24NotLike(String value) {
            addCriterion("SF24 not like", value, "sf24");
            return (Criteria) this;
        }

        public Criteria andSf24In(List<String> values) {
            addCriterion("SF24 in", values, "sf24");
            return (Criteria) this;
        }

        public Criteria andSf24NotIn(List<String> values) {
            addCriterion("SF24 not in", values, "sf24");
            return (Criteria) this;
        }

        public Criteria andSf24Between(String value1, String value2) {
            addCriterion("SF24 between", value1, value2, "sf24");
            return (Criteria) this;
        }

        public Criteria andSf24NotBetween(String value1, String value2) {
            addCriterion("SF24 not between", value1, value2, "sf24");
            return (Criteria) this;
        }

        public Criteria andSf25IsNull() {
            addCriterion("SF25 is null");
            return (Criteria) this;
        }

        public Criteria andSf25IsNotNull() {
            addCriterion("SF25 is not null");
            return (Criteria) this;
        }

        public Criteria andSf25EqualTo(String value) {
            addCriterion("SF25 =", value, "sf25");
            return (Criteria) this;
        }

        public Criteria andSf25NotEqualTo(String value) {
            addCriterion("SF25 <>", value, "sf25");
            return (Criteria) this;
        }

        public Criteria andSf25GreaterThan(String value) {
            addCriterion("SF25 >", value, "sf25");
            return (Criteria) this;
        }

        public Criteria andSf25GreaterThanOrEqualTo(String value) {
            addCriterion("SF25 >=", value, "sf25");
            return (Criteria) this;
        }

        public Criteria andSf25LessThan(String value) {
            addCriterion("SF25 <", value, "sf25");
            return (Criteria) this;
        }

        public Criteria andSf25LessThanOrEqualTo(String value) {
            addCriterion("SF25 <=", value, "sf25");
            return (Criteria) this;
        }

        public Criteria andSf25Like(String value) {
            addCriterion("SF25 like", value, "sf25");
            return (Criteria) this;
        }

        public Criteria andSf25NotLike(String value) {
            addCriterion("SF25 not like", value, "sf25");
            return (Criteria) this;
        }

        public Criteria andSf25In(List<String> values) {
            addCriterion("SF25 in", values, "sf25");
            return (Criteria) this;
        }

        public Criteria andSf25NotIn(List<String> values) {
            addCriterion("SF25 not in", values, "sf25");
            return (Criteria) this;
        }

        public Criteria andSf25Between(String value1, String value2) {
            addCriterion("SF25 between", value1, value2, "sf25");
            return (Criteria) this;
        }

        public Criteria andSf25NotBetween(String value1, String value2) {
            addCriterion("SF25 not between", value1, value2, "sf25");
            return (Criteria) this;
        }

        public Criteria andSf26IsNull() {
            addCriterion("SF26 is null");
            return (Criteria) this;
        }

        public Criteria andSf26IsNotNull() {
            addCriterion("SF26 is not null");
            return (Criteria) this;
        }

        public Criteria andSf26EqualTo(String value) {
            addCriterion("SF26 =", value, "sf26");
            return (Criteria) this;
        }

        public Criteria andSf26NotEqualTo(String value) {
            addCriterion("SF26 <>", value, "sf26");
            return (Criteria) this;
        }

        public Criteria andSf26GreaterThan(String value) {
            addCriterion("SF26 >", value, "sf26");
            return (Criteria) this;
        }

        public Criteria andSf26GreaterThanOrEqualTo(String value) {
            addCriterion("SF26 >=", value, "sf26");
            return (Criteria) this;
        }

        public Criteria andSf26LessThan(String value) {
            addCriterion("SF26 <", value, "sf26");
            return (Criteria) this;
        }

        public Criteria andSf26LessThanOrEqualTo(String value) {
            addCriterion("SF26 <=", value, "sf26");
            return (Criteria) this;
        }

        public Criteria andSf26Like(String value) {
            addCriterion("SF26 like", value, "sf26");
            return (Criteria) this;
        }

        public Criteria andSf26NotLike(String value) {
            addCriterion("SF26 not like", value, "sf26");
            return (Criteria) this;
        }

        public Criteria andSf26In(List<String> values) {
            addCriterion("SF26 in", values, "sf26");
            return (Criteria) this;
        }

        public Criteria andSf26NotIn(List<String> values) {
            addCriterion("SF26 not in", values, "sf26");
            return (Criteria) this;
        }

        public Criteria andSf26Between(String value1, String value2) {
            addCriterion("SF26 between", value1, value2, "sf26");
            return (Criteria) this;
        }

        public Criteria andSf26NotBetween(String value1, String value2) {
            addCriterion("SF26 not between", value1, value2, "sf26");
            return (Criteria) this;
        }

        public Criteria andSf27IsNull() {
            addCriterion("SF27 is null");
            return (Criteria) this;
        }

        public Criteria andSf27IsNotNull() {
            addCriterion("SF27 is not null");
            return (Criteria) this;
        }

        public Criteria andSf27EqualTo(Integer value) {
            addCriterion("SF27 =", value, "sf27");
            return (Criteria) this;
        }

        public Criteria andSf27NotEqualTo(Integer value) {
            addCriterion("SF27 <>", value, "sf27");
            return (Criteria) this;
        }

        public Criteria andSf27GreaterThan(Integer value) {
            addCriterion("SF27 >", value, "sf27");
            return (Criteria) this;
        }

        public Criteria andSf27GreaterThanOrEqualTo(Integer value) {
            addCriterion("SF27 >=", value, "sf27");
            return (Criteria) this;
        }

        public Criteria andSf27LessThan(Integer value) {
            addCriterion("SF27 <", value, "sf27");
            return (Criteria) this;
        }

        public Criteria andSf27LessThanOrEqualTo(Integer value) {
            addCriterion("SF27 <=", value, "sf27");
            return (Criteria) this;
        }

        public Criteria andSf27In(List<Integer> values) {
            addCriterion("SF27 in", values, "sf27");
            return (Criteria) this;
        }

        public Criteria andSf27NotIn(List<Integer> values) {
            addCriterion("SF27 not in", values, "sf27");
            return (Criteria) this;
        }

        public Criteria andSf27Between(Integer value1, Integer value2) {
            addCriterion("SF27 between", value1, value2, "sf27");
            return (Criteria) this;
        }

        public Criteria andSf27NotBetween(Integer value1, Integer value2) {
            addCriterion("SF27 not between", value1, value2, "sf27");
            return (Criteria) this;
        }

        public Criteria andSf28IsNull() {
            addCriterion("SF28 is null");
            return (Criteria) this;
        }

        public Criteria andSf28IsNotNull() {
            addCriterion("SF28 is not null");
            return (Criteria) this;
        }

        public Criteria andSf28EqualTo(Short value) {
            addCriterion("SF28 =", value, "sf28");
            return (Criteria) this;
        }

        public Criteria andSf28NotEqualTo(Short value) {
            addCriterion("SF28 <>", value, "sf28");
            return (Criteria) this;
        }

        public Criteria andSf28GreaterThan(Short value) {
            addCriterion("SF28 >", value, "sf28");
            return (Criteria) this;
        }

        public Criteria andSf28GreaterThanOrEqualTo(Short value) {
            addCriterion("SF28 >=", value, "sf28");
            return (Criteria) this;
        }

        public Criteria andSf28LessThan(Short value) {
            addCriterion("SF28 <", value, "sf28");
            return (Criteria) this;
        }

        public Criteria andSf28LessThanOrEqualTo(Short value) {
            addCriterion("SF28 <=", value, "sf28");
            return (Criteria) this;
        }

        public Criteria andSf28In(List<Short> values) {
            addCriterion("SF28 in", values, "sf28");
            return (Criteria) this;
        }

        public Criteria andSf28NotIn(List<Short> values) {
            addCriterion("SF28 not in", values, "sf28");
            return (Criteria) this;
        }

        public Criteria andSf28Between(Short value1, Short value2) {
            addCriterion("SF28 between", value1, value2, "sf28");
            return (Criteria) this;
        }

        public Criteria andSf28NotBetween(Short value1, Short value2) {
            addCriterion("SF28 not between", value1, value2, "sf28");
            return (Criteria) this;
        }

        public Criteria andSf29IsNull() {
            addCriterion("SF29 is null");
            return (Criteria) this;
        }

        public Criteria andSf29IsNotNull() {
            addCriterion("SF29 is not null");
            return (Criteria) this;
        }

        public Criteria andSf29EqualTo(Short value) {
            addCriterion("SF29 =", value, "sf29");
            return (Criteria) this;
        }

        public Criteria andSf29NotEqualTo(Short value) {
            addCriterion("SF29 <>", value, "sf29");
            return (Criteria) this;
        }

        public Criteria andSf29GreaterThan(Short value) {
            addCriterion("SF29 >", value, "sf29");
            return (Criteria) this;
        }

        public Criteria andSf29GreaterThanOrEqualTo(Short value) {
            addCriterion("SF29 >=", value, "sf29");
            return (Criteria) this;
        }

        public Criteria andSf29LessThan(Short value) {
            addCriterion("SF29 <", value, "sf29");
            return (Criteria) this;
        }

        public Criteria andSf29LessThanOrEqualTo(Short value) {
            addCriterion("SF29 <=", value, "sf29");
            return (Criteria) this;
        }

        public Criteria andSf29In(List<Short> values) {
            addCriterion("SF29 in", values, "sf29");
            return (Criteria) this;
        }

        public Criteria andSf29NotIn(List<Short> values) {
            addCriterion("SF29 not in", values, "sf29");
            return (Criteria) this;
        }

        public Criteria andSf29Between(Short value1, Short value2) {
            addCriterion("SF29 between", value1, value2, "sf29");
            return (Criteria) this;
        }

        public Criteria andSf29NotBetween(Short value1, Short value2) {
            addCriterion("SF29 not between", value1, value2, "sf29");
            return (Criteria) this;
        }

        public Criteria andSf30IsNull() {
            addCriterion("SF30 is null");
            return (Criteria) this;
        }

        public Criteria andSf30IsNotNull() {
            addCriterion("SF30 is not null");
            return (Criteria) this;
        }

        public Criteria andSf30EqualTo(String value) {
            addCriterion("SF30 =", value, "sf30");
            return (Criteria) this;
        }

        public Criteria andSf30NotEqualTo(String value) {
            addCriterion("SF30 <>", value, "sf30");
            return (Criteria) this;
        }

        public Criteria andSf30GreaterThan(String value) {
            addCriterion("SF30 >", value, "sf30");
            return (Criteria) this;
        }

        public Criteria andSf30GreaterThanOrEqualTo(String value) {
            addCriterion("SF30 >=", value, "sf30");
            return (Criteria) this;
        }

        public Criteria andSf30LessThan(String value) {
            addCriterion("SF30 <", value, "sf30");
            return (Criteria) this;
        }

        public Criteria andSf30LessThanOrEqualTo(String value) {
            addCriterion("SF30 <=", value, "sf30");
            return (Criteria) this;
        }

        public Criteria andSf30Like(String value) {
            addCriterion("SF30 like", value, "sf30");
            return (Criteria) this;
        }

        public Criteria andSf30NotLike(String value) {
            addCriterion("SF30 not like", value, "sf30");
            return (Criteria) this;
        }

        public Criteria andSf30In(List<String> values) {
            addCriterion("SF30 in", values, "sf30");
            return (Criteria) this;
        }

        public Criteria andSf30NotIn(List<String> values) {
            addCriterion("SF30 not in", values, "sf30");
            return (Criteria) this;
        }

        public Criteria andSf30Between(String value1, String value2) {
            addCriterion("SF30 between", value1, value2, "sf30");
            return (Criteria) this;
        }

        public Criteria andSf30NotBetween(String value1, String value2) {
            addCriterion("SF30 not between", value1, value2, "sf30");
            return (Criteria) this;
        }

        public Criteria andSf31IsNull() {
            addCriterion("SF31 is null");
            return (Criteria) this;
        }

        public Criteria andSf31IsNotNull() {
            addCriterion("SF31 is not null");
            return (Criteria) this;
        }

        public Criteria andSf31EqualTo(String value) {
            addCriterion("SF31 =", value, "sf31");
            return (Criteria) this;
        }

        public Criteria andSf31NotEqualTo(String value) {
            addCriterion("SF31 <>", value, "sf31");
            return (Criteria) this;
        }

        public Criteria andSf31GreaterThan(String value) {
            addCriterion("SF31 >", value, "sf31");
            return (Criteria) this;
        }

        public Criteria andSf31GreaterThanOrEqualTo(String value) {
            addCriterion("SF31 >=", value, "sf31");
            return (Criteria) this;
        }

        public Criteria andSf31LessThan(String value) {
            addCriterion("SF31 <", value, "sf31");
            return (Criteria) this;
        }

        public Criteria andSf31LessThanOrEqualTo(String value) {
            addCriterion("SF31 <=", value, "sf31");
            return (Criteria) this;
        }

        public Criteria andSf31Like(String value) {
            addCriterion("SF31 like", value, "sf31");
            return (Criteria) this;
        }

        public Criteria andSf31NotLike(String value) {
            addCriterion("SF31 not like", value, "sf31");
            return (Criteria) this;
        }

        public Criteria andSf31In(List<String> values) {
            addCriterion("SF31 in", values, "sf31");
            return (Criteria) this;
        }

        public Criteria andSf31NotIn(List<String> values) {
            addCriterion("SF31 not in", values, "sf31");
            return (Criteria) this;
        }

        public Criteria andSf31Between(String value1, String value2) {
            addCriterion("SF31 between", value1, value2, "sf31");
            return (Criteria) this;
        }

        public Criteria andSf31NotBetween(String value1, String value2) {
            addCriterion("SF31 not between", value1, value2, "sf31");
            return (Criteria) this;
        }

        public Criteria andSf32IsNull() {
            addCriterion("SF32 is null");
            return (Criteria) this;
        }

        public Criteria andSf32IsNotNull() {
            addCriterion("SF32 is not null");
            return (Criteria) this;
        }

        public Criteria andSf32EqualTo(String value) {
            addCriterion("SF32 =", value, "sf32");
            return (Criteria) this;
        }

        public Criteria andSf32NotEqualTo(String value) {
            addCriterion("SF32 <>", value, "sf32");
            return (Criteria) this;
        }

        public Criteria andSf32GreaterThan(String value) {
            addCriterion("SF32 >", value, "sf32");
            return (Criteria) this;
        }

        public Criteria andSf32GreaterThanOrEqualTo(String value) {
            addCriterion("SF32 >=", value, "sf32");
            return (Criteria) this;
        }

        public Criteria andSf32LessThan(String value) {
            addCriterion("SF32 <", value, "sf32");
            return (Criteria) this;
        }

        public Criteria andSf32LessThanOrEqualTo(String value) {
            addCriterion("SF32 <=", value, "sf32");
            return (Criteria) this;
        }

        public Criteria andSf32Like(String value) {
            addCriterion("SF32 like", value, "sf32");
            return (Criteria) this;
        }

        public Criteria andSf32NotLike(String value) {
            addCriterion("SF32 not like", value, "sf32");
            return (Criteria) this;
        }

        public Criteria andSf32In(List<String> values) {
            addCriterion("SF32 in", values, "sf32");
            return (Criteria) this;
        }

        public Criteria andSf32NotIn(List<String> values) {
            addCriterion("SF32 not in", values, "sf32");
            return (Criteria) this;
        }

        public Criteria andSf32Between(String value1, String value2) {
            addCriterion("SF32 between", value1, value2, "sf32");
            return (Criteria) this;
        }

        public Criteria andSf32NotBetween(String value1, String value2) {
            addCriterion("SF32 not between", value1, value2, "sf32");
            return (Criteria) this;
        }

        public Criteria andSf33IsNull() {
            addCriterion("SF33 is null");
            return (Criteria) this;
        }

        public Criteria andSf33IsNotNull() {
            addCriterion("SF33 is not null");
            return (Criteria) this;
        }

        public Criteria andSf33EqualTo(String value) {
            addCriterion("SF33 =", value, "sf33");
            return (Criteria) this;
        }

        public Criteria andSf33NotEqualTo(String value) {
            addCriterion("SF33 <>", value, "sf33");
            return (Criteria) this;
        }

        public Criteria andSf33GreaterThan(String value) {
            addCriterion("SF33 >", value, "sf33");
            return (Criteria) this;
        }

        public Criteria andSf33GreaterThanOrEqualTo(String value) {
            addCriterion("SF33 >=", value, "sf33");
            return (Criteria) this;
        }

        public Criteria andSf33LessThan(String value) {
            addCriterion("SF33 <", value, "sf33");
            return (Criteria) this;
        }

        public Criteria andSf33LessThanOrEqualTo(String value) {
            addCriterion("SF33 <=", value, "sf33");
            return (Criteria) this;
        }

        public Criteria andSf33Like(String value) {
            addCriterion("SF33 like", value, "sf33");
            return (Criteria) this;
        }

        public Criteria andSf33NotLike(String value) {
            addCriterion("SF33 not like", value, "sf33");
            return (Criteria) this;
        }

        public Criteria andSf33In(List<String> values) {
            addCriterion("SF33 in", values, "sf33");
            return (Criteria) this;
        }

        public Criteria andSf33NotIn(List<String> values) {
            addCriterion("SF33 not in", values, "sf33");
            return (Criteria) this;
        }

        public Criteria andSf33Between(String value1, String value2) {
            addCriterion("SF33 between", value1, value2, "sf33");
            return (Criteria) this;
        }

        public Criteria andSf33NotBetween(String value1, String value2) {
            addCriterion("SF33 not between", value1, value2, "sf33");
            return (Criteria) this;
        }

        public Criteria andSf34IsNull() {
            addCriterion("SF34 is null");
            return (Criteria) this;
        }

        public Criteria andSf34IsNotNull() {
            addCriterion("SF34 is not null");
            return (Criteria) this;
        }

        public Criteria andSf34EqualTo(String value) {
            addCriterion("SF34 =", value, "sf34");
            return (Criteria) this;
        }

        public Criteria andSf34NotEqualTo(String value) {
            addCriterion("SF34 <>", value, "sf34");
            return (Criteria) this;
        }

        public Criteria andSf34GreaterThan(String value) {
            addCriterion("SF34 >", value, "sf34");
            return (Criteria) this;
        }

        public Criteria andSf34GreaterThanOrEqualTo(String value) {
            addCriterion("SF34 >=", value, "sf34");
            return (Criteria) this;
        }

        public Criteria andSf34LessThan(String value) {
            addCriterion("SF34 <", value, "sf34");
            return (Criteria) this;
        }

        public Criteria andSf34LessThanOrEqualTo(String value) {
            addCriterion("SF34 <=", value, "sf34");
            return (Criteria) this;
        }

        public Criteria andSf34Like(String value) {
            addCriterion("SF34 like", value, "sf34");
            return (Criteria) this;
        }

        public Criteria andSf34NotLike(String value) {
            addCriterion("SF34 not like", value, "sf34");
            return (Criteria) this;
        }

        public Criteria andSf34In(List<String> values) {
            addCriterion("SF34 in", values, "sf34");
            return (Criteria) this;
        }

        public Criteria andSf34NotIn(List<String> values) {
            addCriterion("SF34 not in", values, "sf34");
            return (Criteria) this;
        }

        public Criteria andSf34Between(String value1, String value2) {
            addCriterion("SF34 between", value1, value2, "sf34");
            return (Criteria) this;
        }

        public Criteria andSf34NotBetween(String value1, String value2) {
            addCriterion("SF34 not between", value1, value2, "sf34");
            return (Criteria) this;
        }

        public Criteria andSf35IsNull() {
            addCriterion("SF35 is null");
            return (Criteria) this;
        }

        public Criteria andSf35IsNotNull() {
            addCriterion("SF35 is not null");
            return (Criteria) this;
        }

        public Criteria andSf35EqualTo(String value) {
            addCriterion("SF35 =", value, "sf35");
            return (Criteria) this;
        }

        public Criteria andSf35NotEqualTo(String value) {
            addCriterion("SF35 <>", value, "sf35");
            return (Criteria) this;
        }

        public Criteria andSf35GreaterThan(String value) {
            addCriterion("SF35 >", value, "sf35");
            return (Criteria) this;
        }

        public Criteria andSf35GreaterThanOrEqualTo(String value) {
            addCriterion("SF35 >=", value, "sf35");
            return (Criteria) this;
        }

        public Criteria andSf35LessThan(String value) {
            addCriterion("SF35 <", value, "sf35");
            return (Criteria) this;
        }

        public Criteria andSf35LessThanOrEqualTo(String value) {
            addCriterion("SF35 <=", value, "sf35");
            return (Criteria) this;
        }

        public Criteria andSf35Like(String value) {
            addCriterion("SF35 like", value, "sf35");
            return (Criteria) this;
        }

        public Criteria andSf35NotLike(String value) {
            addCriterion("SF35 not like", value, "sf35");
            return (Criteria) this;
        }

        public Criteria andSf35In(List<String> values) {
            addCriterion("SF35 in", values, "sf35");
            return (Criteria) this;
        }

        public Criteria andSf35NotIn(List<String> values) {
            addCriterion("SF35 not in", values, "sf35");
            return (Criteria) this;
        }

        public Criteria andSf35Between(String value1, String value2) {
            addCriterion("SF35 between", value1, value2, "sf35");
            return (Criteria) this;
        }

        public Criteria andSf35NotBetween(String value1, String value2) {
            addCriterion("SF35 not between", value1, value2, "sf35");
            return (Criteria) this;
        }

        public Criteria andSf36IsNull() {
            addCriterion("SF36 is null");
            return (Criteria) this;
        }

        public Criteria andSf36IsNotNull() {
            addCriterion("SF36 is not null");
            return (Criteria) this;
        }

        public Criteria andSf36EqualTo(String value) {
            addCriterion("SF36 =", value, "sf36");
            return (Criteria) this;
        }

        public Criteria andSf36NotEqualTo(String value) {
            addCriterion("SF36 <>", value, "sf36");
            return (Criteria) this;
        }

        public Criteria andSf36GreaterThan(String value) {
            addCriterion("SF36 >", value, "sf36");
            return (Criteria) this;
        }

        public Criteria andSf36GreaterThanOrEqualTo(String value) {
            addCriterion("SF36 >=", value, "sf36");
            return (Criteria) this;
        }

        public Criteria andSf36LessThan(String value) {
            addCriterion("SF36 <", value, "sf36");
            return (Criteria) this;
        }

        public Criteria andSf36LessThanOrEqualTo(String value) {
            addCriterion("SF36 <=", value, "sf36");
            return (Criteria) this;
        }

        public Criteria andSf36Like(String value) {
            addCriterion("SF36 like", value, "sf36");
            return (Criteria) this;
        }

        public Criteria andSf36NotLike(String value) {
            addCriterion("SF36 not like", value, "sf36");
            return (Criteria) this;
        }

        public Criteria andSf36In(List<String> values) {
            addCriterion("SF36 in", values, "sf36");
            return (Criteria) this;
        }

        public Criteria andSf36NotIn(List<String> values) {
            addCriterion("SF36 not in", values, "sf36");
            return (Criteria) this;
        }

        public Criteria andSf36Between(String value1, String value2) {
            addCriterion("SF36 between", value1, value2, "sf36");
            return (Criteria) this;
        }

        public Criteria andSf36NotBetween(String value1, String value2) {
            addCriterion("SF36 not between", value1, value2, "sf36");
            return (Criteria) this;
        }

        public Criteria andSf37IsNull() {
            addCriterion("SF37 is null");
            return (Criteria) this;
        }

        public Criteria andSf37IsNotNull() {
            addCriterion("SF37 is not null");
            return (Criteria) this;
        }

        public Criteria andSf37EqualTo(String value) {
            addCriterion("SF37 =", value, "sf37");
            return (Criteria) this;
        }

        public Criteria andSf37NotEqualTo(String value) {
            addCriterion("SF37 <>", value, "sf37");
            return (Criteria) this;
        }

        public Criteria andSf37GreaterThan(String value) {
            addCriterion("SF37 >", value, "sf37");
            return (Criteria) this;
        }

        public Criteria andSf37GreaterThanOrEqualTo(String value) {
            addCriterion("SF37 >=", value, "sf37");
            return (Criteria) this;
        }

        public Criteria andSf37LessThan(String value) {
            addCriterion("SF37 <", value, "sf37");
            return (Criteria) this;
        }

        public Criteria andSf37LessThanOrEqualTo(String value) {
            addCriterion("SF37 <=", value, "sf37");
            return (Criteria) this;
        }

        public Criteria andSf37Like(String value) {
            addCriterion("SF37 like", value, "sf37");
            return (Criteria) this;
        }

        public Criteria andSf37NotLike(String value) {
            addCriterion("SF37 not like", value, "sf37");
            return (Criteria) this;
        }

        public Criteria andSf37In(List<String> values) {
            addCriterion("SF37 in", values, "sf37");
            return (Criteria) this;
        }

        public Criteria andSf37NotIn(List<String> values) {
            addCriterion("SF37 not in", values, "sf37");
            return (Criteria) this;
        }

        public Criteria andSf37Between(String value1, String value2) {
            addCriterion("SF37 between", value1, value2, "sf37");
            return (Criteria) this;
        }

        public Criteria andSf37NotBetween(String value1, String value2) {
            addCriterion("SF37 not between", value1, value2, "sf37");
            return (Criteria) this;
        }

        public Criteria andSf38IsNull() {
            addCriterion("SF38 is null");
            return (Criteria) this;
        }

        public Criteria andSf38IsNotNull() {
            addCriterion("SF38 is not null");
            return (Criteria) this;
        }

        public Criteria andSf38EqualTo(String value) {
            addCriterion("SF38 =", value, "sf38");
            return (Criteria) this;
        }

        public Criteria andSf38NotEqualTo(String value) {
            addCriterion("SF38 <>", value, "sf38");
            return (Criteria) this;
        }

        public Criteria andSf38GreaterThan(String value) {
            addCriterion("SF38 >", value, "sf38");
            return (Criteria) this;
        }

        public Criteria andSf38GreaterThanOrEqualTo(String value) {
            addCriterion("SF38 >=", value, "sf38");
            return (Criteria) this;
        }

        public Criteria andSf38LessThan(String value) {
            addCriterion("SF38 <", value, "sf38");
            return (Criteria) this;
        }

        public Criteria andSf38LessThanOrEqualTo(String value) {
            addCriterion("SF38 <=", value, "sf38");
            return (Criteria) this;
        }

        public Criteria andSf38Like(String value) {
            addCriterion("SF38 like", value, "sf38");
            return (Criteria) this;
        }

        public Criteria andSf38NotLike(String value) {
            addCriterion("SF38 not like", value, "sf38");
            return (Criteria) this;
        }

        public Criteria andSf38In(List<String> values) {
            addCriterion("SF38 in", values, "sf38");
            return (Criteria) this;
        }

        public Criteria andSf38NotIn(List<String> values) {
            addCriterion("SF38 not in", values, "sf38");
            return (Criteria) this;
        }

        public Criteria andSf38Between(String value1, String value2) {
            addCriterion("SF38 between", value1, value2, "sf38");
            return (Criteria) this;
        }

        public Criteria andSf38NotBetween(String value1, String value2) {
            addCriterion("SF38 not between", value1, value2, "sf38");
            return (Criteria) this;
        }

        public Criteria andSf39IsNull() {
            addCriterion("SF39 is null");
            return (Criteria) this;
        }

        public Criteria andSf39IsNotNull() {
            addCriterion("SF39 is not null");
            return (Criteria) this;
        }

        public Criteria andSf39EqualTo(String value) {
            addCriterion("SF39 =", value, "sf39");
            return (Criteria) this;
        }

        public Criteria andSf39NotEqualTo(String value) {
            addCriterion("SF39 <>", value, "sf39");
            return (Criteria) this;
        }

        public Criteria andSf39GreaterThan(String value) {
            addCriterion("SF39 >", value, "sf39");
            return (Criteria) this;
        }

        public Criteria andSf39GreaterThanOrEqualTo(String value) {
            addCriterion("SF39 >=", value, "sf39");
            return (Criteria) this;
        }

        public Criteria andSf39LessThan(String value) {
            addCriterion("SF39 <", value, "sf39");
            return (Criteria) this;
        }

        public Criteria andSf39LessThanOrEqualTo(String value) {
            addCriterion("SF39 <=", value, "sf39");
            return (Criteria) this;
        }

        public Criteria andSf39Like(String value) {
            addCriterion("SF39 like", value, "sf39");
            return (Criteria) this;
        }

        public Criteria andSf39NotLike(String value) {
            addCriterion("SF39 not like", value, "sf39");
            return (Criteria) this;
        }

        public Criteria andSf39In(List<String> values) {
            addCriterion("SF39 in", values, "sf39");
            return (Criteria) this;
        }

        public Criteria andSf39NotIn(List<String> values) {
            addCriterion("SF39 not in", values, "sf39");
            return (Criteria) this;
        }

        public Criteria andSf39Between(String value1, String value2) {
            addCriterion("SF39 between", value1, value2, "sf39");
            return (Criteria) this;
        }

        public Criteria andSf39NotBetween(String value1, String value2) {
            addCriterion("SF39 not between", value1, value2, "sf39");
            return (Criteria) this;
        }

        public Criteria andSf40IsNull() {
            addCriterion("SF40 is null");
            return (Criteria) this;
        }

        public Criteria andSf40IsNotNull() {
            addCriterion("SF40 is not null");
            return (Criteria) this;
        }

        public Criteria andSf40EqualTo(String value) {
            addCriterion("SF40 =", value, "sf40");
            return (Criteria) this;
        }

        public Criteria andSf40NotEqualTo(String value) {
            addCriterion("SF40 <>", value, "sf40");
            return (Criteria) this;
        }

        public Criteria andSf40GreaterThan(String value) {
            addCriterion("SF40 >", value, "sf40");
            return (Criteria) this;
        }

        public Criteria andSf40GreaterThanOrEqualTo(String value) {
            addCriterion("SF40 >=", value, "sf40");
            return (Criteria) this;
        }

        public Criteria andSf40LessThan(String value) {
            addCriterion("SF40 <", value, "sf40");
            return (Criteria) this;
        }

        public Criteria andSf40LessThanOrEqualTo(String value) {
            addCriterion("SF40 <=", value, "sf40");
            return (Criteria) this;
        }

        public Criteria andSf40Like(String value) {
            addCriterion("SF40 like", value, "sf40");
            return (Criteria) this;
        }

        public Criteria andSf40NotLike(String value) {
            addCriterion("SF40 not like", value, "sf40");
            return (Criteria) this;
        }

        public Criteria andSf40In(List<String> values) {
            addCriterion("SF40 in", values, "sf40");
            return (Criteria) this;
        }

        public Criteria andSf40NotIn(List<String> values) {
            addCriterion("SF40 not in", values, "sf40");
            return (Criteria) this;
        }

        public Criteria andSf40Between(String value1, String value2) {
            addCriterion("SF40 between", value1, value2, "sf40");
            return (Criteria) this;
        }

        public Criteria andSf40NotBetween(String value1, String value2) {
            addCriterion("SF40 not between", value1, value2, "sf40");
            return (Criteria) this;
        }

        public Criteria andSf41IsNull() {
            addCriterion("SF41 is null");
            return (Criteria) this;
        }

        public Criteria andSf41IsNotNull() {
            addCriterion("SF41 is not null");
            return (Criteria) this;
        }

        public Criteria andSf41EqualTo(String value) {
            addCriterion("SF41 =", value, "sf41");
            return (Criteria) this;
        }

        public Criteria andSf41NotEqualTo(String value) {
            addCriterion("SF41 <>", value, "sf41");
            return (Criteria) this;
        }

        public Criteria andSf41GreaterThan(String value) {
            addCriterion("SF41 >", value, "sf41");
            return (Criteria) this;
        }

        public Criteria andSf41GreaterThanOrEqualTo(String value) {
            addCriterion("SF41 >=", value, "sf41");
            return (Criteria) this;
        }

        public Criteria andSf41LessThan(String value) {
            addCriterion("SF41 <", value, "sf41");
            return (Criteria) this;
        }

        public Criteria andSf41LessThanOrEqualTo(String value) {
            addCriterion("SF41 <=", value, "sf41");
            return (Criteria) this;
        }

        public Criteria andSf41Like(String value) {
            addCriterion("SF41 like", value, "sf41");
            return (Criteria) this;
        }

        public Criteria andSf41NotLike(String value) {
            addCriterion("SF41 not like", value, "sf41");
            return (Criteria) this;
        }

        public Criteria andSf41In(List<String> values) {
            addCriterion("SF41 in", values, "sf41");
            return (Criteria) this;
        }

        public Criteria andSf41NotIn(List<String> values) {
            addCriterion("SF41 not in", values, "sf41");
            return (Criteria) this;
        }

        public Criteria andSf41Between(String value1, String value2) {
            addCriterion("SF41 between", value1, value2, "sf41");
            return (Criteria) this;
        }

        public Criteria andSf41NotBetween(String value1, String value2) {
            addCriterion("SF41 not between", value1, value2, "sf41");
            return (Criteria) this;
        }

        public Criteria andSf42IsNull() {
            addCriterion("SF42 is null");
            return (Criteria) this;
        }

        public Criteria andSf42IsNotNull() {
            addCriterion("SF42 is not null");
            return (Criteria) this;
        }

        public Criteria andSf42EqualTo(String value) {
            addCriterion("SF42 =", value, "sf42");
            return (Criteria) this;
        }

        public Criteria andSf42NotEqualTo(String value) {
            addCriterion("SF42 <>", value, "sf42");
            return (Criteria) this;
        }

        public Criteria andSf42GreaterThan(String value) {
            addCriterion("SF42 >", value, "sf42");
            return (Criteria) this;
        }

        public Criteria andSf42GreaterThanOrEqualTo(String value) {
            addCriterion("SF42 >=", value, "sf42");
            return (Criteria) this;
        }

        public Criteria andSf42LessThan(String value) {
            addCriterion("SF42 <", value, "sf42");
            return (Criteria) this;
        }

        public Criteria andSf42LessThanOrEqualTo(String value) {
            addCriterion("SF42 <=", value, "sf42");
            return (Criteria) this;
        }

        public Criteria andSf42Like(String value) {
            addCriterion("SF42 like", value, "sf42");
            return (Criteria) this;
        }

        public Criteria andSf42NotLike(String value) {
            addCriterion("SF42 not like", value, "sf42");
            return (Criteria) this;
        }

        public Criteria andSf42In(List<String> values) {
            addCriterion("SF42 in", values, "sf42");
            return (Criteria) this;
        }

        public Criteria andSf42NotIn(List<String> values) {
            addCriterion("SF42 not in", values, "sf42");
            return (Criteria) this;
        }

        public Criteria andSf42Between(String value1, String value2) {
            addCriterion("SF42 between", value1, value2, "sf42");
            return (Criteria) this;
        }

        public Criteria andSf42NotBetween(String value1, String value2) {
            addCriterion("SF42 not between", value1, value2, "sf42");
            return (Criteria) this;
        }

        public Criteria andSf43IsNull() {
            addCriterion("SF43 is null");
            return (Criteria) this;
        }

        public Criteria andSf43IsNotNull() {
            addCriterion("SF43 is not null");
            return (Criteria) this;
        }

        public Criteria andSf43EqualTo(String value) {
            addCriterion("SF43 =", value, "sf43");
            return (Criteria) this;
        }

        public Criteria andSf43NotEqualTo(String value) {
            addCriterion("SF43 <>", value, "sf43");
            return (Criteria) this;
        }

        public Criteria andSf43GreaterThan(String value) {
            addCriterion("SF43 >", value, "sf43");
            return (Criteria) this;
        }

        public Criteria andSf43GreaterThanOrEqualTo(String value) {
            addCriterion("SF43 >=", value, "sf43");
            return (Criteria) this;
        }

        public Criteria andSf43LessThan(String value) {
            addCriterion("SF43 <", value, "sf43");
            return (Criteria) this;
        }

        public Criteria andSf43LessThanOrEqualTo(String value) {
            addCriterion("SF43 <=", value, "sf43");
            return (Criteria) this;
        }

        public Criteria andSf43Like(String value) {
            addCriterion("SF43 like", value, "sf43");
            return (Criteria) this;
        }

        public Criteria andSf43NotLike(String value) {
            addCriterion("SF43 not like", value, "sf43");
            return (Criteria) this;
        }

        public Criteria andSf43In(List<String> values) {
            addCriterion("SF43 in", values, "sf43");
            return (Criteria) this;
        }

        public Criteria andSf43NotIn(List<String> values) {
            addCriterion("SF43 not in", values, "sf43");
            return (Criteria) this;
        }

        public Criteria andSf43Between(String value1, String value2) {
            addCriterion("SF43 between", value1, value2, "sf43");
            return (Criteria) this;
        }

        public Criteria andSf43NotBetween(String value1, String value2) {
            addCriterion("SF43 not between", value1, value2, "sf43");
            return (Criteria) this;
        }

        public Criteria andSf44IsNull() {
            addCriterion("SF44 is null");
            return (Criteria) this;
        }

        public Criteria andSf44IsNotNull() {
            addCriterion("SF44 is not null");
            return (Criteria) this;
        }

        public Criteria andSf44EqualTo(String value) {
            addCriterion("SF44 =", value, "sf44");
            return (Criteria) this;
        }

        public Criteria andSf44NotEqualTo(String value) {
            addCriterion("SF44 <>", value, "sf44");
            return (Criteria) this;
        }

        public Criteria andSf44GreaterThan(String value) {
            addCriterion("SF44 >", value, "sf44");
            return (Criteria) this;
        }

        public Criteria andSf44GreaterThanOrEqualTo(String value) {
            addCriterion("SF44 >=", value, "sf44");
            return (Criteria) this;
        }

        public Criteria andSf44LessThan(String value) {
            addCriterion("SF44 <", value, "sf44");
            return (Criteria) this;
        }

        public Criteria andSf44LessThanOrEqualTo(String value) {
            addCriterion("SF44 <=", value, "sf44");
            return (Criteria) this;
        }

        public Criteria andSf44Like(String value) {
            addCriterion("SF44 like", value, "sf44");
            return (Criteria) this;
        }

        public Criteria andSf44NotLike(String value) {
            addCriterion("SF44 not like", value, "sf44");
            return (Criteria) this;
        }

        public Criteria andSf44In(List<String> values) {
            addCriterion("SF44 in", values, "sf44");
            return (Criteria) this;
        }

        public Criteria andSf44NotIn(List<String> values) {
            addCriterion("SF44 not in", values, "sf44");
            return (Criteria) this;
        }

        public Criteria andSf44Between(String value1, String value2) {
            addCriterion("SF44 between", value1, value2, "sf44");
            return (Criteria) this;
        }

        public Criteria andSf44NotBetween(String value1, String value2) {
            addCriterion("SF44 not between", value1, value2, "sf44");
            return (Criteria) this;
        }

        public Criteria andSf45IsNull() {
            addCriterion("SF45 is null");
            return (Criteria) this;
        }

        public Criteria andSf45IsNotNull() {
            addCriterion("SF45 is not null");
            return (Criteria) this;
        }

        public Criteria andSf45EqualTo(String value) {
            addCriterion("SF45 =", value, "sf45");
            return (Criteria) this;
        }

        public Criteria andSf45NotEqualTo(String value) {
            addCriterion("SF45 <>", value, "sf45");
            return (Criteria) this;
        }

        public Criteria andSf45GreaterThan(String value) {
            addCriterion("SF45 >", value, "sf45");
            return (Criteria) this;
        }

        public Criteria andSf45GreaterThanOrEqualTo(String value) {
            addCriterion("SF45 >=", value, "sf45");
            return (Criteria) this;
        }

        public Criteria andSf45LessThan(String value) {
            addCriterion("SF45 <", value, "sf45");
            return (Criteria) this;
        }

        public Criteria andSf45LessThanOrEqualTo(String value) {
            addCriterion("SF45 <=", value, "sf45");
            return (Criteria) this;
        }

        public Criteria andSf45Like(String value) {
            addCriterion("SF45 like", value, "sf45");
            return (Criteria) this;
        }

        public Criteria andSf45NotLike(String value) {
            addCriterion("SF45 not like", value, "sf45");
            return (Criteria) this;
        }

        public Criteria andSf45In(List<String> values) {
            addCriterion("SF45 in", values, "sf45");
            return (Criteria) this;
        }

        public Criteria andSf45NotIn(List<String> values) {
            addCriterion("SF45 not in", values, "sf45");
            return (Criteria) this;
        }

        public Criteria andSf45Between(String value1, String value2) {
            addCriterion("SF45 between", value1, value2, "sf45");
            return (Criteria) this;
        }

        public Criteria andSf45NotBetween(String value1, String value2) {
            addCriterion("SF45 not between", value1, value2, "sf45");
            return (Criteria) this;
        }

        public Criteria andSf46IsNull() {
            addCriterion("SF46 is null");
            return (Criteria) this;
        }

        public Criteria andSf46IsNotNull() {
            addCriterion("SF46 is not null");
            return (Criteria) this;
        }

        public Criteria andSf46EqualTo(String value) {
            addCriterion("SF46 =", value, "sf46");
            return (Criteria) this;
        }

        public Criteria andSf46NotEqualTo(String value) {
            addCriterion("SF46 <>", value, "sf46");
            return (Criteria) this;
        }

        public Criteria andSf46GreaterThan(String value) {
            addCriterion("SF46 >", value, "sf46");
            return (Criteria) this;
        }

        public Criteria andSf46GreaterThanOrEqualTo(String value) {
            addCriterion("SF46 >=", value, "sf46");
            return (Criteria) this;
        }

        public Criteria andSf46LessThan(String value) {
            addCriterion("SF46 <", value, "sf46");
            return (Criteria) this;
        }

        public Criteria andSf46LessThanOrEqualTo(String value) {
            addCriterion("SF46 <=", value, "sf46");
            return (Criteria) this;
        }

        public Criteria andSf46Like(String value) {
            addCriterion("SF46 like", value, "sf46");
            return (Criteria) this;
        }

        public Criteria andSf46NotLike(String value) {
            addCriterion("SF46 not like", value, "sf46");
            return (Criteria) this;
        }

        public Criteria andSf46In(List<String> values) {
            addCriterion("SF46 in", values, "sf46");
            return (Criteria) this;
        }

        public Criteria andSf46NotIn(List<String> values) {
            addCriterion("SF46 not in", values, "sf46");
            return (Criteria) this;
        }

        public Criteria andSf46Between(String value1, String value2) {
            addCriterion("SF46 between", value1, value2, "sf46");
            return (Criteria) this;
        }

        public Criteria andSf46NotBetween(String value1, String value2) {
            addCriterion("SF46 not between", value1, value2, "sf46");
            return (Criteria) this;
        }

        public Criteria andSf47IsNull() {
            addCriterion("SF47 is null");
            return (Criteria) this;
        }

        public Criteria andSf47IsNotNull() {
            addCriterion("SF47 is not null");
            return (Criteria) this;
        }

        public Criteria andSf47EqualTo(String value) {
            addCriterion("SF47 =", value, "sf47");
            return (Criteria) this;
        }

        public Criteria andSf47NotEqualTo(String value) {
            addCriterion("SF47 <>", value, "sf47");
            return (Criteria) this;
        }

        public Criteria andSf47GreaterThan(String value) {
            addCriterion("SF47 >", value, "sf47");
            return (Criteria) this;
        }

        public Criteria andSf47GreaterThanOrEqualTo(String value) {
            addCriterion("SF47 >=", value, "sf47");
            return (Criteria) this;
        }

        public Criteria andSf47LessThan(String value) {
            addCriterion("SF47 <", value, "sf47");
            return (Criteria) this;
        }

        public Criteria andSf47LessThanOrEqualTo(String value) {
            addCriterion("SF47 <=", value, "sf47");
            return (Criteria) this;
        }

        public Criteria andSf47Like(String value) {
            addCriterion("SF47 like", value, "sf47");
            return (Criteria) this;
        }

        public Criteria andSf47NotLike(String value) {
            addCriterion("SF47 not like", value, "sf47");
            return (Criteria) this;
        }

        public Criteria andSf47In(List<String> values) {
            addCriterion("SF47 in", values, "sf47");
            return (Criteria) this;
        }

        public Criteria andSf47NotIn(List<String> values) {
            addCriterion("SF47 not in", values, "sf47");
            return (Criteria) this;
        }

        public Criteria andSf47Between(String value1, String value2) {
            addCriterion("SF47 between", value1, value2, "sf47");
            return (Criteria) this;
        }

        public Criteria andSf47NotBetween(String value1, String value2) {
            addCriterion("SF47 not between", value1, value2, "sf47");
            return (Criteria) this;
        }

        public Criteria andSf48IsNull() {
            addCriterion("SF48 is null");
            return (Criteria) this;
        }

        public Criteria andSf48IsNotNull() {
            addCriterion("SF48 is not null");
            return (Criteria) this;
        }

        public Criteria andSf48EqualTo(String value) {
            addCriterion("SF48 =", value, "sf48");
            return (Criteria) this;
        }

        public Criteria andSf48NotEqualTo(String value) {
            addCriterion("SF48 <>", value, "sf48");
            return (Criteria) this;
        }

        public Criteria andSf48GreaterThan(String value) {
            addCriterion("SF48 >", value, "sf48");
            return (Criteria) this;
        }

        public Criteria andSf48GreaterThanOrEqualTo(String value) {
            addCriterion("SF48 >=", value, "sf48");
            return (Criteria) this;
        }

        public Criteria andSf48LessThan(String value) {
            addCriterion("SF48 <", value, "sf48");
            return (Criteria) this;
        }

        public Criteria andSf48LessThanOrEqualTo(String value) {
            addCriterion("SF48 <=", value, "sf48");
            return (Criteria) this;
        }

        public Criteria andSf48Like(String value) {
            addCriterion("SF48 like", value, "sf48");
            return (Criteria) this;
        }

        public Criteria andSf48NotLike(String value) {
            addCriterion("SF48 not like", value, "sf48");
            return (Criteria) this;
        }

        public Criteria andSf48In(List<String> values) {
            addCriterion("SF48 in", values, "sf48");
            return (Criteria) this;
        }

        public Criteria andSf48NotIn(List<String> values) {
            addCriterion("SF48 not in", values, "sf48");
            return (Criteria) this;
        }

        public Criteria andSf48Between(String value1, String value2) {
            addCriterion("SF48 between", value1, value2, "sf48");
            return (Criteria) this;
        }

        public Criteria andSf48NotBetween(String value1, String value2) {
            addCriterion("SF48 not between", value1, value2, "sf48");
            return (Criteria) this;
        }

        public Criteria andSf49IsNull() {
            addCriterion("SF49 is null");
            return (Criteria) this;
        }

        public Criteria andSf49IsNotNull() {
            addCriterion("SF49 is not null");
            return (Criteria) this;
        }

        public Criteria andSf49EqualTo(String value) {
            addCriterion("SF49 =", value, "sf49");
            return (Criteria) this;
        }

        public Criteria andSf49NotEqualTo(String value) {
            addCriterion("SF49 <>", value, "sf49");
            return (Criteria) this;
        }

        public Criteria andSf49GreaterThan(String value) {
            addCriterion("SF49 >", value, "sf49");
            return (Criteria) this;
        }

        public Criteria andSf49GreaterThanOrEqualTo(String value) {
            addCriterion("SF49 >=", value, "sf49");
            return (Criteria) this;
        }

        public Criteria andSf49LessThan(String value) {
            addCriterion("SF49 <", value, "sf49");
            return (Criteria) this;
        }

        public Criteria andSf49LessThanOrEqualTo(String value) {
            addCriterion("SF49 <=", value, "sf49");
            return (Criteria) this;
        }

        public Criteria andSf49Like(String value) {
            addCriterion("SF49 like", value, "sf49");
            return (Criteria) this;
        }

        public Criteria andSf49NotLike(String value) {
            addCriterion("SF49 not like", value, "sf49");
            return (Criteria) this;
        }

        public Criteria andSf49In(List<String> values) {
            addCriterion("SF49 in", values, "sf49");
            return (Criteria) this;
        }

        public Criteria andSf49NotIn(List<String> values) {
            addCriterion("SF49 not in", values, "sf49");
            return (Criteria) this;
        }

        public Criteria andSf49Between(String value1, String value2) {
            addCriterion("SF49 between", value1, value2, "sf49");
            return (Criteria) this;
        }

        public Criteria andSf49NotBetween(String value1, String value2) {
            addCriterion("SF49 not between", value1, value2, "sf49");
            return (Criteria) this;
        }

        public Criteria andSf50IsNull() {
            addCriterion("SF50 is null");
            return (Criteria) this;
        }

        public Criteria andSf50IsNotNull() {
            addCriterion("SF50 is not null");
            return (Criteria) this;
        }

        public Criteria andSf50EqualTo(Date value) {
            addCriterion("SF50 =", value, "sf50");
            return (Criteria) this;
        }

        public Criteria andSf50NotEqualTo(Date value) {
            addCriterion("SF50 <>", value, "sf50");
            return (Criteria) this;
        }

        public Criteria andSf50GreaterThan(Date value) {
            addCriterion("SF50 >", value, "sf50");
            return (Criteria) this;
        }

        public Criteria andSf50GreaterThanOrEqualTo(Date value) {
            addCriterion("SF50 >=", value, "sf50");
            return (Criteria) this;
        }

        public Criteria andSf50LessThan(Date value) {
            addCriterion("SF50 <", value, "sf50");
            return (Criteria) this;
        }

        public Criteria andSf50LessThanOrEqualTo(Date value) {
            addCriterion("SF50 <=", value, "sf50");
            return (Criteria) this;
        }

        public Criteria andSf50In(List<Date> values) {
            addCriterion("SF50 in", values, "sf50");
            return (Criteria) this;
        }

        public Criteria andSf50NotIn(List<Date> values) {
            addCriterion("SF50 not in", values, "sf50");
            return (Criteria) this;
        }

        public Criteria andSf50Between(Date value1, Date value2) {
            addCriterion("SF50 between", value1, value2, "sf50");
            return (Criteria) this;
        }

        public Criteria andSf50NotBetween(Date value1, Date value2) {
            addCriterion("SF50 not between", value1, value2, "sf50");
            return (Criteria) this;
        }

        public Criteria andSf51IsNull() {
            addCriterion("SF51 is null");
            return (Criteria) this;
        }

        public Criteria andSf51IsNotNull() {
            addCriterion("SF51 is not null");
            return (Criteria) this;
        }

        public Criteria andSf51EqualTo(String value) {
            addCriterion("SF51 =", value, "sf51");
            return (Criteria) this;
        }

        public Criteria andSf51NotEqualTo(String value) {
            addCriterion("SF51 <>", value, "sf51");
            return (Criteria) this;
        }

        public Criteria andSf51GreaterThan(String value) {
            addCriterion("SF51 >", value, "sf51");
            return (Criteria) this;
        }

        public Criteria andSf51GreaterThanOrEqualTo(String value) {
            addCriterion("SF51 >=", value, "sf51");
            return (Criteria) this;
        }

        public Criteria andSf51LessThan(String value) {
            addCriterion("SF51 <", value, "sf51");
            return (Criteria) this;
        }

        public Criteria andSf51LessThanOrEqualTo(String value) {
            addCriterion("SF51 <=", value, "sf51");
            return (Criteria) this;
        }

        public Criteria andSf51Like(String value) {
            addCriterion("SF51 like", value, "sf51");
            return (Criteria) this;
        }

        public Criteria andSf51NotLike(String value) {
            addCriterion("SF51 not like", value, "sf51");
            return (Criteria) this;
        }

        public Criteria andSf51In(List<String> values) {
            addCriterion("SF51 in", values, "sf51");
            return (Criteria) this;
        }

        public Criteria andSf51NotIn(List<String> values) {
            addCriterion("SF51 not in", values, "sf51");
            return (Criteria) this;
        }

        public Criteria andSf51Between(String value1, String value2) {
            addCriterion("SF51 between", value1, value2, "sf51");
            return (Criteria) this;
        }

        public Criteria andSf51NotBetween(String value1, String value2) {
            addCriterion("SF51 not between", value1, value2, "sf51");
            return (Criteria) this;
        }

        public Criteria andSf52IsNull() {
            addCriterion("SF52 is null");
            return (Criteria) this;
        }

        public Criteria andSf52IsNotNull() {
            addCriterion("SF52 is not null");
            return (Criteria) this;
        }

        public Criteria andSf52EqualTo(String value) {
            addCriterion("SF52 =", value, "sf52");
            return (Criteria) this;
        }

        public Criteria andSf52NotEqualTo(String value) {
            addCriterion("SF52 <>", value, "sf52");
            return (Criteria) this;
        }

        public Criteria andSf52GreaterThan(String value) {
            addCriterion("SF52 >", value, "sf52");
            return (Criteria) this;
        }

        public Criteria andSf52GreaterThanOrEqualTo(String value) {
            addCriterion("SF52 >=", value, "sf52");
            return (Criteria) this;
        }

        public Criteria andSf52LessThan(String value) {
            addCriterion("SF52 <", value, "sf52");
            return (Criteria) this;
        }

        public Criteria andSf52LessThanOrEqualTo(String value) {
            addCriterion("SF52 <=", value, "sf52");
            return (Criteria) this;
        }

        public Criteria andSf52Like(String value) {
            addCriterion("SF52 like", value, "sf52");
            return (Criteria) this;
        }

        public Criteria andSf52NotLike(String value) {
            addCriterion("SF52 not like", value, "sf52");
            return (Criteria) this;
        }

        public Criteria andSf52In(List<String> values) {
            addCriterion("SF52 in", values, "sf52");
            return (Criteria) this;
        }

        public Criteria andSf52NotIn(List<String> values) {
            addCriterion("SF52 not in", values, "sf52");
            return (Criteria) this;
        }

        public Criteria andSf52Between(String value1, String value2) {
            addCriterion("SF52 between", value1, value2, "sf52");
            return (Criteria) this;
        }

        public Criteria andSf52NotBetween(String value1, String value2) {
            addCriterion("SF52 not between", value1, value2, "sf52");
            return (Criteria) this;
        }

        public Criteria andSf53IsNull() {
            addCriterion("SF53 is null");
            return (Criteria) this;
        }

        public Criteria andSf53IsNotNull() {
            addCriterion("SF53 is not null");
            return (Criteria) this;
        }

        public Criteria andSf53EqualTo(String value) {
            addCriterion("SF53 =", value, "sf53");
            return (Criteria) this;
        }

        public Criteria andSf53NotEqualTo(String value) {
            addCriterion("SF53 <>", value, "sf53");
            return (Criteria) this;
        }

        public Criteria andSf53GreaterThan(String value) {
            addCriterion("SF53 >", value, "sf53");
            return (Criteria) this;
        }

        public Criteria andSf53GreaterThanOrEqualTo(String value) {
            addCriterion("SF53 >=", value, "sf53");
            return (Criteria) this;
        }

        public Criteria andSf53LessThan(String value) {
            addCriterion("SF53 <", value, "sf53");
            return (Criteria) this;
        }

        public Criteria andSf53LessThanOrEqualTo(String value) {
            addCriterion("SF53 <=", value, "sf53");
            return (Criteria) this;
        }

        public Criteria andSf53Like(String value) {
            addCriterion("SF53 like", value, "sf53");
            return (Criteria) this;
        }

        public Criteria andSf53NotLike(String value) {
            addCriterion("SF53 not like", value, "sf53");
            return (Criteria) this;
        }

        public Criteria andSf53In(List<String> values) {
            addCriterion("SF53 in", values, "sf53");
            return (Criteria) this;
        }

        public Criteria andSf53NotIn(List<String> values) {
            addCriterion("SF53 not in", values, "sf53");
            return (Criteria) this;
        }

        public Criteria andSf53Between(String value1, String value2) {
            addCriterion("SF53 between", value1, value2, "sf53");
            return (Criteria) this;
        }

        public Criteria andSf53NotBetween(String value1, String value2) {
            addCriterion("SF53 not between", value1, value2, "sf53");
            return (Criteria) this;
        }

        public Criteria andSf54IsNull() {
            addCriterion("SF54 is null");
            return (Criteria) this;
        }

        public Criteria andSf54IsNotNull() {
            addCriterion("SF54 is not null");
            return (Criteria) this;
        }

        public Criteria andSf54EqualTo(String value) {
            addCriterion("SF54 =", value, "sf54");
            return (Criteria) this;
        }

        public Criteria andSf54NotEqualTo(String value) {
            addCriterion("SF54 <>", value, "sf54");
            return (Criteria) this;
        }

        public Criteria andSf54GreaterThan(String value) {
            addCriterion("SF54 >", value, "sf54");
            return (Criteria) this;
        }

        public Criteria andSf54GreaterThanOrEqualTo(String value) {
            addCriterion("SF54 >=", value, "sf54");
            return (Criteria) this;
        }

        public Criteria andSf54LessThan(String value) {
            addCriterion("SF54 <", value, "sf54");
            return (Criteria) this;
        }

        public Criteria andSf54LessThanOrEqualTo(String value) {
            addCriterion("SF54 <=", value, "sf54");
            return (Criteria) this;
        }

        public Criteria andSf54Like(String value) {
            addCriterion("SF54 like", value, "sf54");
            return (Criteria) this;
        }

        public Criteria andSf54NotLike(String value) {
            addCriterion("SF54 not like", value, "sf54");
            return (Criteria) this;
        }

        public Criteria andSf54In(List<String> values) {
            addCriterion("SF54 in", values, "sf54");
            return (Criteria) this;
        }

        public Criteria andSf54NotIn(List<String> values) {
            addCriterion("SF54 not in", values, "sf54");
            return (Criteria) this;
        }

        public Criteria andSf54Between(String value1, String value2) {
            addCriterion("SF54 between", value1, value2, "sf54");
            return (Criteria) this;
        }

        public Criteria andSf54NotBetween(String value1, String value2) {
            addCriterion("SF54 not between", value1, value2, "sf54");
            return (Criteria) this;
        }

        public Criteria andIsfileIsNull() {
            addCriterion("ISFILE is null");
            return (Criteria) this;
        }

        public Criteria andIsfileIsNotNull() {
            addCriterion("ISFILE is not null");
            return (Criteria) this;
        }

        public Criteria andIsfileEqualTo(String value) {
            addCriterion("ISFILE =", value, "isfile");
            return (Criteria) this;
        }

        public Criteria andIsfileNotEqualTo(String value) {
            addCriterion("ISFILE <>", value, "isfile");
            return (Criteria) this;
        }

        public Criteria andIsfileGreaterThan(String value) {
            addCriterion("ISFILE >", value, "isfile");
            return (Criteria) this;
        }

        public Criteria andIsfileGreaterThanOrEqualTo(String value) {
            addCriterion("ISFILE >=", value, "isfile");
            return (Criteria) this;
        }

        public Criteria andIsfileLessThan(String value) {
            addCriterion("ISFILE <", value, "isfile");
            return (Criteria) this;
        }

        public Criteria andIsfileLessThanOrEqualTo(String value) {
            addCriterion("ISFILE <=", value, "isfile");
            return (Criteria) this;
        }

        public Criteria andIsfileLike(String value) {
            addCriterion("ISFILE like", value, "isfile");
            return (Criteria) this;
        }

        public Criteria andIsfileNotLike(String value) {
            addCriterion("ISFILE not like", value, "isfile");
            return (Criteria) this;
        }

        public Criteria andIsfileIn(List<String> values) {
            addCriterion("ISFILE in", values, "isfile");
            return (Criteria) this;
        }

        public Criteria andIsfileNotIn(List<String> values) {
            addCriterion("ISFILE not in", values, "isfile");
            return (Criteria) this;
        }

        public Criteria andIsfileBetween(String value1, String value2) {
            addCriterion("ISFILE between", value1, value2, "isfile");
            return (Criteria) this;
        }

        public Criteria andIsfileNotBetween(String value1, String value2) {
            addCriterion("ISFILE not between", value1, value2, "isfile");
            return (Criteria) this;
        }

        public Criteria andFiledateIsNull() {
            addCriterion("FILEDATE is null");
            return (Criteria) this;
        }

        public Criteria andFiledateIsNotNull() {
            addCriterion("FILEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andFiledateEqualTo(String value) {
            addCriterion("FILEDATE =", value, "filedate");
            return (Criteria) this;
        }

        public Criteria andFiledateNotEqualTo(String value) {
            addCriterion("FILEDATE <>", value, "filedate");
            return (Criteria) this;
        }

        public Criteria andFiledateGreaterThan(String value) {
            addCriterion("FILEDATE >", value, "filedate");
            return (Criteria) this;
        }

        public Criteria andFiledateGreaterThanOrEqualTo(String value) {
            addCriterion("FILEDATE >=", value, "filedate");
            return (Criteria) this;
        }

        public Criteria andFiledateLessThan(String value) {
            addCriterion("FILEDATE <", value, "filedate");
            return (Criteria) this;
        }

        public Criteria andFiledateLessThanOrEqualTo(String value) {
            addCriterion("FILEDATE <=", value, "filedate");
            return (Criteria) this;
        }

        public Criteria andFiledateLike(String value) {
            addCriterion("FILEDATE like", value, "filedate");
            return (Criteria) this;
        }

        public Criteria andFiledateNotLike(String value) {
            addCriterion("FILEDATE not like", value, "filedate");
            return (Criteria) this;
        }

        public Criteria andFiledateIn(List<String> values) {
            addCriterion("FILEDATE in", values, "filedate");
            return (Criteria) this;
        }

        public Criteria andFiledateNotIn(List<String> values) {
            addCriterion("FILEDATE not in", values, "filedate");
            return (Criteria) this;
        }

        public Criteria andFiledateBetween(String value1, String value2) {
            addCriterion("FILEDATE between", value1, value2, "filedate");
            return (Criteria) this;
        }

        public Criteria andFiledateNotBetween(String value1, String value2) {
            addCriterion("FILEDATE not between", value1, value2, "filedate");
            return (Criteria) this;
        }

        public Criteria andSf55IsNull() {
            addCriterion("SF55 is null");
            return (Criteria) this;
        }

        public Criteria andSf55IsNotNull() {
            addCriterion("SF55 is not null");
            return (Criteria) this;
        }

        public Criteria andSf55EqualTo(String value) {
            addCriterion("SF55 =", value, "sf55");
            return (Criteria) this;
        }

        public Criteria andSf55NotEqualTo(String value) {
            addCriterion("SF55 <>", value, "sf55");
            return (Criteria) this;
        }

        public Criteria andSf55GreaterThan(String value) {
            addCriterion("SF55 >", value, "sf55");
            return (Criteria) this;
        }

        public Criteria andSf55GreaterThanOrEqualTo(String value) {
            addCriterion("SF55 >=", value, "sf55");
            return (Criteria) this;
        }

        public Criteria andSf55LessThan(String value) {
            addCriterion("SF55 <", value, "sf55");
            return (Criteria) this;
        }

        public Criteria andSf55LessThanOrEqualTo(String value) {
            addCriterion("SF55 <=", value, "sf55");
            return (Criteria) this;
        }

        public Criteria andSf55Like(String value) {
            addCriterion("SF55 like", value, "sf55");
            return (Criteria) this;
        }

        public Criteria andSf55NotLike(String value) {
            addCriterion("SF55 not like", value, "sf55");
            return (Criteria) this;
        }

        public Criteria andSf55In(List<String> values) {
            addCriterion("SF55 in", values, "sf55");
            return (Criteria) this;
        }

        public Criteria andSf55NotIn(List<String> values) {
            addCriterion("SF55 not in", values, "sf55");
            return (Criteria) this;
        }

        public Criteria andSf55Between(String value1, String value2) {
            addCriterion("SF55 between", value1, value2, "sf55");
            return (Criteria) this;
        }

        public Criteria andSf55NotBetween(String value1, String value2) {
            addCriterion("SF55 not between", value1, value2, "sf55");
            return (Criteria) this;
        }

        public Criteria andSf56IsNull() {
            addCriterion("SF56 is null");
            return (Criteria) this;
        }

        public Criteria andSf56IsNotNull() {
            addCriterion("SF56 is not null");
            return (Criteria) this;
        }

        public Criteria andSf56EqualTo(String value) {
            addCriterion("SF56 =", value, "sf56");
            return (Criteria) this;
        }

        public Criteria andSf56NotEqualTo(String value) {
            addCriterion("SF56 <>", value, "sf56");
            return (Criteria) this;
        }

        public Criteria andSf56GreaterThan(String value) {
            addCriterion("SF56 >", value, "sf56");
            return (Criteria) this;
        }

        public Criteria andSf56GreaterThanOrEqualTo(String value) {
            addCriterion("SF56 >=", value, "sf56");
            return (Criteria) this;
        }

        public Criteria andSf56LessThan(String value) {
            addCriterion("SF56 <", value, "sf56");
            return (Criteria) this;
        }

        public Criteria andSf56LessThanOrEqualTo(String value) {
            addCriterion("SF56 <=", value, "sf56");
            return (Criteria) this;
        }

        public Criteria andSf56Like(String value) {
            addCriterion("SF56 like", value, "sf56");
            return (Criteria) this;
        }

        public Criteria andSf56NotLike(String value) {
            addCriterion("SF56 not like", value, "sf56");
            return (Criteria) this;
        }

        public Criteria andSf56In(List<String> values) {
            addCriterion("SF56 in", values, "sf56");
            return (Criteria) this;
        }

        public Criteria andSf56NotIn(List<String> values) {
            addCriterion("SF56 not in", values, "sf56");
            return (Criteria) this;
        }

        public Criteria andSf56Between(String value1, String value2) {
            addCriterion("SF56 between", value1, value2, "sf56");
            return (Criteria) this;
        }

        public Criteria andSf56NotBetween(String value1, String value2) {
            addCriterion("SF56 not between", value1, value2, "sf56");
            return (Criteria) this;
        }

        public Criteria andWfTaskidIsNull() {
            addCriterion("WF_TASKID is null");
            return (Criteria) this;
        }

        public Criteria andWfTaskidIsNotNull() {
            addCriterion("WF_TASKID is not null");
            return (Criteria) this;
        }

        public Criteria andWfTaskidEqualTo(String value) {
            addCriterion("WF_TASKID =", value, "wfTaskid");
            return (Criteria) this;
        }

        public Criteria andWfTaskidNotEqualTo(String value) {
            addCriterion("WF_TASKID <>", value, "wfTaskid");
            return (Criteria) this;
        }

        public Criteria andWfTaskidGreaterThan(String value) {
            addCriterion("WF_TASKID >", value, "wfTaskid");
            return (Criteria) this;
        }

        public Criteria andWfTaskidGreaterThanOrEqualTo(String value) {
            addCriterion("WF_TASKID >=", value, "wfTaskid");
            return (Criteria) this;
        }

        public Criteria andWfTaskidLessThan(String value) {
            addCriterion("WF_TASKID <", value, "wfTaskid");
            return (Criteria) this;
        }

        public Criteria andWfTaskidLessThanOrEqualTo(String value) {
            addCriterion("WF_TASKID <=", value, "wfTaskid");
            return (Criteria) this;
        }

        public Criteria andWfTaskidLike(String value) {
            addCriterion("WF_TASKID like", value, "wfTaskid");
            return (Criteria) this;
        }

        public Criteria andWfTaskidNotLike(String value) {
            addCriterion("WF_TASKID not like", value, "wfTaskid");
            return (Criteria) this;
        }

        public Criteria andWfTaskidIn(List<String> values) {
            addCriterion("WF_TASKID in", values, "wfTaskid");
            return (Criteria) this;
        }

        public Criteria andWfTaskidNotIn(List<String> values) {
            addCriterion("WF_TASKID not in", values, "wfTaskid");
            return (Criteria) this;
        }

        public Criteria andWfTaskidBetween(String value1, String value2) {
            addCriterion("WF_TASKID between", value1, value2, "wfTaskid");
            return (Criteria) this;
        }

        public Criteria andWfTaskidNotBetween(String value1, String value2) {
            addCriterion("WF_TASKID not between", value1, value2, "wfTaskid");
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