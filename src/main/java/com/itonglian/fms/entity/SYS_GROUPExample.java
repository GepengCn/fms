package com.itonglian.fms.entity;

import java.util.ArrayList;
import java.util.List;

public class SYS_GROUPExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SYS_GROUPExample() {
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

        public Criteria andSg00IsNull() {
            addCriterion("SG00 is null");
            return (Criteria) this;
        }

        public Criteria andSg00IsNotNull() {
            addCriterion("SG00 is not null");
            return (Criteria) this;
        }

        public Criteria andSg00EqualTo(Long value) {
            addCriterion("SG00 =", value, "sg00");
            return (Criteria) this;
        }

        public Criteria andSg00NotEqualTo(Long value) {
            addCriterion("SG00 <>", value, "sg00");
            return (Criteria) this;
        }

        public Criteria andSg00GreaterThan(Long value) {
            addCriterion("SG00 >", value, "sg00");
            return (Criteria) this;
        }

        public Criteria andSg00GreaterThanOrEqualTo(Long value) {
            addCriterion("SG00 >=", value, "sg00");
            return (Criteria) this;
        }

        public Criteria andSg00LessThan(Long value) {
            addCriterion("SG00 <", value, "sg00");
            return (Criteria) this;
        }

        public Criteria andSg00LessThanOrEqualTo(Long value) {
            addCriterion("SG00 <=", value, "sg00");
            return (Criteria) this;
        }

        public Criteria andSg00In(List<Long> values) {
            addCriterion("SG00 in", values, "sg00");
            return (Criteria) this;
        }

        public Criteria andSg00NotIn(List<Long> values) {
            addCriterion("SG00 not in", values, "sg00");
            return (Criteria) this;
        }

        public Criteria andSg00Between(Long value1, Long value2) {
            addCriterion("SG00 between", value1, value2, "sg00");
            return (Criteria) this;
        }

        public Criteria andSg00NotBetween(Long value1, Long value2) {
            addCriterion("SG00 not between", value1, value2, "sg00");
            return (Criteria) this;
        }

        public Criteria andSg01IsNull() {
            addCriterion("SG01 is null");
            return (Criteria) this;
        }

        public Criteria andSg01IsNotNull() {
            addCriterion("SG01 is not null");
            return (Criteria) this;
        }

        public Criteria andSg01EqualTo(String value) {
            addCriterion("SG01 =", value, "sg01");
            return (Criteria) this;
        }

        public Criteria andSg01NotEqualTo(String value) {
            addCriterion("SG01 <>", value, "sg01");
            return (Criteria) this;
        }

        public Criteria andSg01GreaterThan(String value) {
            addCriterion("SG01 >", value, "sg01");
            return (Criteria) this;
        }

        public Criteria andSg01GreaterThanOrEqualTo(String value) {
            addCriterion("SG01 >=", value, "sg01");
            return (Criteria) this;
        }

        public Criteria andSg01LessThan(String value) {
            addCriterion("SG01 <", value, "sg01");
            return (Criteria) this;
        }

        public Criteria andSg01LessThanOrEqualTo(String value) {
            addCriterion("SG01 <=", value, "sg01");
            return (Criteria) this;
        }

        public Criteria andSg01Like(String value) {
            addCriterion("SG01 like", value, "sg01");
            return (Criteria) this;
        }

        public Criteria andSg01NotLike(String value) {
            addCriterion("SG01 not like", value, "sg01");
            return (Criteria) this;
        }

        public Criteria andSg01In(List<String> values) {
            addCriterion("SG01 in", values, "sg01");
            return (Criteria) this;
        }

        public Criteria andSg01NotIn(List<String> values) {
            addCriterion("SG01 not in", values, "sg01");
            return (Criteria) this;
        }

        public Criteria andSg01Between(String value1, String value2) {
            addCriterion("SG01 between", value1, value2, "sg01");
            return (Criteria) this;
        }

        public Criteria andSg01NotBetween(String value1, String value2) {
            addCriterion("SG01 not between", value1, value2, "sg01");
            return (Criteria) this;
        }

        public Criteria andSg02IsNull() {
            addCriterion("SG02 is null");
            return (Criteria) this;
        }

        public Criteria andSg02IsNotNull() {
            addCriterion("SG02 is not null");
            return (Criteria) this;
        }

        public Criteria andSg02EqualTo(String value) {
            addCriterion("SG02 =", value, "sg02");
            return (Criteria) this;
        }

        public Criteria andSg02NotEqualTo(String value) {
            addCriterion("SG02 <>", value, "sg02");
            return (Criteria) this;
        }

        public Criteria andSg02GreaterThan(String value) {
            addCriterion("SG02 >", value, "sg02");
            return (Criteria) this;
        }

        public Criteria andSg02GreaterThanOrEqualTo(String value) {
            addCriterion("SG02 >=", value, "sg02");
            return (Criteria) this;
        }

        public Criteria andSg02LessThan(String value) {
            addCriterion("SG02 <", value, "sg02");
            return (Criteria) this;
        }

        public Criteria andSg02LessThanOrEqualTo(String value) {
            addCriterion("SG02 <=", value, "sg02");
            return (Criteria) this;
        }

        public Criteria andSg02Like(String value) {
            addCriterion("SG02 like", value, "sg02");
            return (Criteria) this;
        }

        public Criteria andSg02NotLike(String value) {
            addCriterion("SG02 not like", value, "sg02");
            return (Criteria) this;
        }

        public Criteria andSg02In(List<String> values) {
            addCriterion("SG02 in", values, "sg02");
            return (Criteria) this;
        }

        public Criteria andSg02NotIn(List<String> values) {
            addCriterion("SG02 not in", values, "sg02");
            return (Criteria) this;
        }

        public Criteria andSg02Between(String value1, String value2) {
            addCriterion("SG02 between", value1, value2, "sg02");
            return (Criteria) this;
        }

        public Criteria andSg02NotBetween(String value1, String value2) {
            addCriterion("SG02 not between", value1, value2, "sg02");
            return (Criteria) this;
        }

        public Criteria andSg03IsNull() {
            addCriterion("SG03 is null");
            return (Criteria) this;
        }

        public Criteria andSg03IsNotNull() {
            addCriterion("SG03 is not null");
            return (Criteria) this;
        }

        public Criteria andSg03EqualTo(String value) {
            addCriterion("SG03 =", value, "sg03");
            return (Criteria) this;
        }

        public Criteria andSg03NotEqualTo(String value) {
            addCriterion("SG03 <>", value, "sg03");
            return (Criteria) this;
        }

        public Criteria andSg03GreaterThan(String value) {
            addCriterion("SG03 >", value, "sg03");
            return (Criteria) this;
        }

        public Criteria andSg03GreaterThanOrEqualTo(String value) {
            addCriterion("SG03 >=", value, "sg03");
            return (Criteria) this;
        }

        public Criteria andSg03LessThan(String value) {
            addCriterion("SG03 <", value, "sg03");
            return (Criteria) this;
        }

        public Criteria andSg03LessThanOrEqualTo(String value) {
            addCriterion("SG03 <=", value, "sg03");
            return (Criteria) this;
        }

        public Criteria andSg03Like(String value) {
            addCriterion("SG03 like", value, "sg03");
            return (Criteria) this;
        }

        public Criteria andSg03NotLike(String value) {
            addCriterion("SG03 not like", value, "sg03");
            return (Criteria) this;
        }

        public Criteria andSg03In(List<String> values) {
            addCriterion("SG03 in", values, "sg03");
            return (Criteria) this;
        }

        public Criteria andSg03NotIn(List<String> values) {
            addCriterion("SG03 not in", values, "sg03");
            return (Criteria) this;
        }

        public Criteria andSg03Between(String value1, String value2) {
            addCriterion("SG03 between", value1, value2, "sg03");
            return (Criteria) this;
        }

        public Criteria andSg03NotBetween(String value1, String value2) {
            addCriterion("SG03 not between", value1, value2, "sg03");
            return (Criteria) this;
        }

        public Criteria andSg04IsNull() {
            addCriterion("SG04 is null");
            return (Criteria) this;
        }

        public Criteria andSg04IsNotNull() {
            addCriterion("SG04 is not null");
            return (Criteria) this;
        }

        public Criteria andSg04EqualTo(String value) {
            addCriterion("SG04 =", value, "sg04");
            return (Criteria) this;
        }

        public Criteria andSg04NotEqualTo(String value) {
            addCriterion("SG04 <>", value, "sg04");
            return (Criteria) this;
        }

        public Criteria andSg04GreaterThan(String value) {
            addCriterion("SG04 >", value, "sg04");
            return (Criteria) this;
        }

        public Criteria andSg04GreaterThanOrEqualTo(String value) {
            addCriterion("SG04 >=", value, "sg04");
            return (Criteria) this;
        }

        public Criteria andSg04LessThan(String value) {
            addCriterion("SG04 <", value, "sg04");
            return (Criteria) this;
        }

        public Criteria andSg04LessThanOrEqualTo(String value) {
            addCriterion("SG04 <=", value, "sg04");
            return (Criteria) this;
        }

        public Criteria andSg04Like(String value) {
            addCriterion("SG04 like", value, "sg04");
            return (Criteria) this;
        }

        public Criteria andSg04NotLike(String value) {
            addCriterion("SG04 not like", value, "sg04");
            return (Criteria) this;
        }

        public Criteria andSg04In(List<String> values) {
            addCriterion("SG04 in", values, "sg04");
            return (Criteria) this;
        }

        public Criteria andSg04NotIn(List<String> values) {
            addCriterion("SG04 not in", values, "sg04");
            return (Criteria) this;
        }

        public Criteria andSg04Between(String value1, String value2) {
            addCriterion("SG04 between", value1, value2, "sg04");
            return (Criteria) this;
        }

        public Criteria andSg04NotBetween(String value1, String value2) {
            addCriterion("SG04 not between", value1, value2, "sg04");
            return (Criteria) this;
        }

        public Criteria andSg05IsNull() {
            addCriterion("SG05 is null");
            return (Criteria) this;
        }

        public Criteria andSg05IsNotNull() {
            addCriterion("SG05 is not null");
            return (Criteria) this;
        }

        public Criteria andSg05EqualTo(String value) {
            addCriterion("SG05 =", value, "sg05");
            return (Criteria) this;
        }

        public Criteria andSg05NotEqualTo(String value) {
            addCriterion("SG05 <>", value, "sg05");
            return (Criteria) this;
        }

        public Criteria andSg05GreaterThan(String value) {
            addCriterion("SG05 >", value, "sg05");
            return (Criteria) this;
        }

        public Criteria andSg05GreaterThanOrEqualTo(String value) {
            addCriterion("SG05 >=", value, "sg05");
            return (Criteria) this;
        }

        public Criteria andSg05LessThan(String value) {
            addCriterion("SG05 <", value, "sg05");
            return (Criteria) this;
        }

        public Criteria andSg05LessThanOrEqualTo(String value) {
            addCriterion("SG05 <=", value, "sg05");
            return (Criteria) this;
        }

        public Criteria andSg05Like(String value) {
            addCriterion("SG05 like", value, "sg05");
            return (Criteria) this;
        }

        public Criteria andSg05NotLike(String value) {
            addCriterion("SG05 not like", value, "sg05");
            return (Criteria) this;
        }

        public Criteria andSg05In(List<String> values) {
            addCriterion("SG05 in", values, "sg05");
            return (Criteria) this;
        }

        public Criteria andSg05NotIn(List<String> values) {
            addCriterion("SG05 not in", values, "sg05");
            return (Criteria) this;
        }

        public Criteria andSg05Between(String value1, String value2) {
            addCriterion("SG05 between", value1, value2, "sg05");
            return (Criteria) this;
        }

        public Criteria andSg05NotBetween(String value1, String value2) {
            addCriterion("SG05 not between", value1, value2, "sg05");
            return (Criteria) this;
        }

        public Criteria andSg06IsNull() {
            addCriterion("SG06 is null");
            return (Criteria) this;
        }

        public Criteria andSg06IsNotNull() {
            addCriterion("SG06 is not null");
            return (Criteria) this;
        }

        public Criteria andSg06EqualTo(String value) {
            addCriterion("SG06 =", value, "sg06");
            return (Criteria) this;
        }

        public Criteria andSg06NotEqualTo(String value) {
            addCriterion("SG06 <>", value, "sg06");
            return (Criteria) this;
        }

        public Criteria andSg06GreaterThan(String value) {
            addCriterion("SG06 >", value, "sg06");
            return (Criteria) this;
        }

        public Criteria andSg06GreaterThanOrEqualTo(String value) {
            addCriterion("SG06 >=", value, "sg06");
            return (Criteria) this;
        }

        public Criteria andSg06LessThan(String value) {
            addCriterion("SG06 <", value, "sg06");
            return (Criteria) this;
        }

        public Criteria andSg06LessThanOrEqualTo(String value) {
            addCriterion("SG06 <=", value, "sg06");
            return (Criteria) this;
        }

        public Criteria andSg06Like(String value) {
            addCriterion("SG06 like", value, "sg06");
            return (Criteria) this;
        }

        public Criteria andSg06NotLike(String value) {
            addCriterion("SG06 not like", value, "sg06");
            return (Criteria) this;
        }

        public Criteria andSg06In(List<String> values) {
            addCriterion("SG06 in", values, "sg06");
            return (Criteria) this;
        }

        public Criteria andSg06NotIn(List<String> values) {
            addCriterion("SG06 not in", values, "sg06");
            return (Criteria) this;
        }

        public Criteria andSg06Between(String value1, String value2) {
            addCriterion("SG06 between", value1, value2, "sg06");
            return (Criteria) this;
        }

        public Criteria andSg06NotBetween(String value1, String value2) {
            addCriterion("SG06 not between", value1, value2, "sg06");
            return (Criteria) this;
        }

        public Criteria andSg07IsNull() {
            addCriterion("SG07 is null");
            return (Criteria) this;
        }

        public Criteria andSg07IsNotNull() {
            addCriterion("SG07 is not null");
            return (Criteria) this;
        }

        public Criteria andSg07EqualTo(Integer value) {
            addCriterion("SG07 =", value, "sg07");
            return (Criteria) this;
        }

        public Criteria andSg07NotEqualTo(Integer value) {
            addCriterion("SG07 <>", value, "sg07");
            return (Criteria) this;
        }

        public Criteria andSg07GreaterThan(Integer value) {
            addCriterion("SG07 >", value, "sg07");
            return (Criteria) this;
        }

        public Criteria andSg07GreaterThanOrEqualTo(Integer value) {
            addCriterion("SG07 >=", value, "sg07");
            return (Criteria) this;
        }

        public Criteria andSg07LessThan(Integer value) {
            addCriterion("SG07 <", value, "sg07");
            return (Criteria) this;
        }

        public Criteria andSg07LessThanOrEqualTo(Integer value) {
            addCriterion("SG07 <=", value, "sg07");
            return (Criteria) this;
        }

        public Criteria andSg07In(List<Integer> values) {
            addCriterion("SG07 in", values, "sg07");
            return (Criteria) this;
        }

        public Criteria andSg07NotIn(List<Integer> values) {
            addCriterion("SG07 not in", values, "sg07");
            return (Criteria) this;
        }

        public Criteria andSg07Between(Integer value1, Integer value2) {
            addCriterion("SG07 between", value1, value2, "sg07");
            return (Criteria) this;
        }

        public Criteria andSg07NotBetween(Integer value1, Integer value2) {
            addCriterion("SG07 not between", value1, value2, "sg07");
            return (Criteria) this;
        }

        public Criteria andSg08IsNull() {
            addCriterion("SG08 is null");
            return (Criteria) this;
        }

        public Criteria andSg08IsNotNull() {
            addCriterion("SG08 is not null");
            return (Criteria) this;
        }

        public Criteria andSg08EqualTo(String value) {
            addCriterion("SG08 =", value, "sg08");
            return (Criteria) this;
        }

        public Criteria andSg08NotEqualTo(String value) {
            addCriterion("SG08 <>", value, "sg08");
            return (Criteria) this;
        }

        public Criteria andSg08GreaterThan(String value) {
            addCriterion("SG08 >", value, "sg08");
            return (Criteria) this;
        }

        public Criteria andSg08GreaterThanOrEqualTo(String value) {
            addCriterion("SG08 >=", value, "sg08");
            return (Criteria) this;
        }

        public Criteria andSg08LessThan(String value) {
            addCriterion("SG08 <", value, "sg08");
            return (Criteria) this;
        }

        public Criteria andSg08LessThanOrEqualTo(String value) {
            addCriterion("SG08 <=", value, "sg08");
            return (Criteria) this;
        }

        public Criteria andSg08Like(String value) {
            addCriterion("SG08 like", value, "sg08");
            return (Criteria) this;
        }

        public Criteria andSg08NotLike(String value) {
            addCriterion("SG08 not like", value, "sg08");
            return (Criteria) this;
        }

        public Criteria andSg08In(List<String> values) {
            addCriterion("SG08 in", values, "sg08");
            return (Criteria) this;
        }

        public Criteria andSg08NotIn(List<String> values) {
            addCriterion("SG08 not in", values, "sg08");
            return (Criteria) this;
        }

        public Criteria andSg08Between(String value1, String value2) {
            addCriterion("SG08 between", value1, value2, "sg08");
            return (Criteria) this;
        }

        public Criteria andSg08NotBetween(String value1, String value2) {
            addCriterion("SG08 not between", value1, value2, "sg08");
            return (Criteria) this;
        }

        public Criteria andSg09IsNull() {
            addCriterion("SG09 is null");
            return (Criteria) this;
        }

        public Criteria andSg09IsNotNull() {
            addCriterion("SG09 is not null");
            return (Criteria) this;
        }

        public Criteria andSg09EqualTo(String value) {
            addCriterion("SG09 =", value, "sg09");
            return (Criteria) this;
        }

        public Criteria andSg09NotEqualTo(String value) {
            addCriterion("SG09 <>", value, "sg09");
            return (Criteria) this;
        }

        public Criteria andSg09GreaterThan(String value) {
            addCriterion("SG09 >", value, "sg09");
            return (Criteria) this;
        }

        public Criteria andSg09GreaterThanOrEqualTo(String value) {
            addCriterion("SG09 >=", value, "sg09");
            return (Criteria) this;
        }

        public Criteria andSg09LessThan(String value) {
            addCriterion("SG09 <", value, "sg09");
            return (Criteria) this;
        }

        public Criteria andSg09LessThanOrEqualTo(String value) {
            addCriterion("SG09 <=", value, "sg09");
            return (Criteria) this;
        }

        public Criteria andSg09Like(String value) {
            addCriterion("SG09 like", value, "sg09");
            return (Criteria) this;
        }

        public Criteria andSg09NotLike(String value) {
            addCriterion("SG09 not like", value, "sg09");
            return (Criteria) this;
        }

        public Criteria andSg09In(List<String> values) {
            addCriterion("SG09 in", values, "sg09");
            return (Criteria) this;
        }

        public Criteria andSg09NotIn(List<String> values) {
            addCriterion("SG09 not in", values, "sg09");
            return (Criteria) this;
        }

        public Criteria andSg09Between(String value1, String value2) {
            addCriterion("SG09 between", value1, value2, "sg09");
            return (Criteria) this;
        }

        public Criteria andSg09NotBetween(String value1, String value2) {
            addCriterion("SG09 not between", value1, value2, "sg09");
            return (Criteria) this;
        }

        public Criteria andSg10IsNull() {
            addCriterion("SG10 is null");
            return (Criteria) this;
        }

        public Criteria andSg10IsNotNull() {
            addCriterion("SG10 is not null");
            return (Criteria) this;
        }

        public Criteria andSg10EqualTo(String value) {
            addCriterion("SG10 =", value, "sg10");
            return (Criteria) this;
        }

        public Criteria andSg10NotEqualTo(String value) {
            addCriterion("SG10 <>", value, "sg10");
            return (Criteria) this;
        }

        public Criteria andSg10GreaterThan(String value) {
            addCriterion("SG10 >", value, "sg10");
            return (Criteria) this;
        }

        public Criteria andSg10GreaterThanOrEqualTo(String value) {
            addCriterion("SG10 >=", value, "sg10");
            return (Criteria) this;
        }

        public Criteria andSg10LessThan(String value) {
            addCriterion("SG10 <", value, "sg10");
            return (Criteria) this;
        }

        public Criteria andSg10LessThanOrEqualTo(String value) {
            addCriterion("SG10 <=", value, "sg10");
            return (Criteria) this;
        }

        public Criteria andSg10Like(String value) {
            addCriterion("SG10 like", value, "sg10");
            return (Criteria) this;
        }

        public Criteria andSg10NotLike(String value) {
            addCriterion("SG10 not like", value, "sg10");
            return (Criteria) this;
        }

        public Criteria andSg10In(List<String> values) {
            addCriterion("SG10 in", values, "sg10");
            return (Criteria) this;
        }

        public Criteria andSg10NotIn(List<String> values) {
            addCriterion("SG10 not in", values, "sg10");
            return (Criteria) this;
        }

        public Criteria andSg10Between(String value1, String value2) {
            addCriterion("SG10 between", value1, value2, "sg10");
            return (Criteria) this;
        }

        public Criteria andSg10NotBetween(String value1, String value2) {
            addCriterion("SG10 not between", value1, value2, "sg10");
            return (Criteria) this;
        }

        public Criteria andSg11IsNull() {
            addCriterion("SG11 is null");
            return (Criteria) this;
        }

        public Criteria andSg11IsNotNull() {
            addCriterion("SG11 is not null");
            return (Criteria) this;
        }

        public Criteria andSg11EqualTo(String value) {
            addCriterion("SG11 =", value, "sg11");
            return (Criteria) this;
        }

        public Criteria andSg11NotEqualTo(String value) {
            addCriterion("SG11 <>", value, "sg11");
            return (Criteria) this;
        }

        public Criteria andSg11GreaterThan(String value) {
            addCriterion("SG11 >", value, "sg11");
            return (Criteria) this;
        }

        public Criteria andSg11GreaterThanOrEqualTo(String value) {
            addCriterion("SG11 >=", value, "sg11");
            return (Criteria) this;
        }

        public Criteria andSg11LessThan(String value) {
            addCriterion("SG11 <", value, "sg11");
            return (Criteria) this;
        }

        public Criteria andSg11LessThanOrEqualTo(String value) {
            addCriterion("SG11 <=", value, "sg11");
            return (Criteria) this;
        }

        public Criteria andSg11Like(String value) {
            addCriterion("SG11 like", value, "sg11");
            return (Criteria) this;
        }

        public Criteria andSg11NotLike(String value) {
            addCriterion("SG11 not like", value, "sg11");
            return (Criteria) this;
        }

        public Criteria andSg11In(List<String> values) {
            addCriterion("SG11 in", values, "sg11");
            return (Criteria) this;
        }

        public Criteria andSg11NotIn(List<String> values) {
            addCriterion("SG11 not in", values, "sg11");
            return (Criteria) this;
        }

        public Criteria andSg11Between(String value1, String value2) {
            addCriterion("SG11 between", value1, value2, "sg11");
            return (Criteria) this;
        }

        public Criteria andSg11NotBetween(String value1, String value2) {
            addCriterion("SG11 not between", value1, value2, "sg11");
            return (Criteria) this;
        }

        public Criteria andSg12IsNull() {
            addCriterion("SG12 is null");
            return (Criteria) this;
        }

        public Criteria andSg12IsNotNull() {
            addCriterion("SG12 is not null");
            return (Criteria) this;
        }

        public Criteria andSg12EqualTo(String value) {
            addCriterion("SG12 =", value, "sg12");
            return (Criteria) this;
        }

        public Criteria andSg12NotEqualTo(String value) {
            addCriterion("SG12 <>", value, "sg12");
            return (Criteria) this;
        }

        public Criteria andSg12GreaterThan(String value) {
            addCriterion("SG12 >", value, "sg12");
            return (Criteria) this;
        }

        public Criteria andSg12GreaterThanOrEqualTo(String value) {
            addCriterion("SG12 >=", value, "sg12");
            return (Criteria) this;
        }

        public Criteria andSg12LessThan(String value) {
            addCriterion("SG12 <", value, "sg12");
            return (Criteria) this;
        }

        public Criteria andSg12LessThanOrEqualTo(String value) {
            addCriterion("SG12 <=", value, "sg12");
            return (Criteria) this;
        }

        public Criteria andSg12Like(String value) {
            addCriterion("SG12 like", value, "sg12");
            return (Criteria) this;
        }

        public Criteria andSg12NotLike(String value) {
            addCriterion("SG12 not like", value, "sg12");
            return (Criteria) this;
        }

        public Criteria andSg12In(List<String> values) {
            addCriterion("SG12 in", values, "sg12");
            return (Criteria) this;
        }

        public Criteria andSg12NotIn(List<String> values) {
            addCriterion("SG12 not in", values, "sg12");
            return (Criteria) this;
        }

        public Criteria andSg12Between(String value1, String value2) {
            addCriterion("SG12 between", value1, value2, "sg12");
            return (Criteria) this;
        }

        public Criteria andSg12NotBetween(String value1, String value2) {
            addCriterion("SG12 not between", value1, value2, "sg12");
            return (Criteria) this;
        }

        public Criteria andSg13IsNull() {
            addCriterion("SG13 is null");
            return (Criteria) this;
        }

        public Criteria andSg13IsNotNull() {
            addCriterion("SG13 is not null");
            return (Criteria) this;
        }

        public Criteria andSg13EqualTo(String value) {
            addCriterion("SG13 =", value, "sg13");
            return (Criteria) this;
        }

        public Criteria andSg13NotEqualTo(String value) {
            addCriterion("SG13 <>", value, "sg13");
            return (Criteria) this;
        }

        public Criteria andSg13GreaterThan(String value) {
            addCriterion("SG13 >", value, "sg13");
            return (Criteria) this;
        }

        public Criteria andSg13GreaterThanOrEqualTo(String value) {
            addCriterion("SG13 >=", value, "sg13");
            return (Criteria) this;
        }

        public Criteria andSg13LessThan(String value) {
            addCriterion("SG13 <", value, "sg13");
            return (Criteria) this;
        }

        public Criteria andSg13LessThanOrEqualTo(String value) {
            addCriterion("SG13 <=", value, "sg13");
            return (Criteria) this;
        }

        public Criteria andSg13Like(String value) {
            addCriterion("SG13 like", value, "sg13");
            return (Criteria) this;
        }

        public Criteria andSg13NotLike(String value) {
            addCriterion("SG13 not like", value, "sg13");
            return (Criteria) this;
        }

        public Criteria andSg13In(List<String> values) {
            addCriterion("SG13 in", values, "sg13");
            return (Criteria) this;
        }

        public Criteria andSg13NotIn(List<String> values) {
            addCriterion("SG13 not in", values, "sg13");
            return (Criteria) this;
        }

        public Criteria andSg13Between(String value1, String value2) {
            addCriterion("SG13 between", value1, value2, "sg13");
            return (Criteria) this;
        }

        public Criteria andSg13NotBetween(String value1, String value2) {
            addCriterion("SG13 not between", value1, value2, "sg13");
            return (Criteria) this;
        }

        public Criteria andSg14IsNull() {
            addCriterion("SG14 is null");
            return (Criteria) this;
        }

        public Criteria andSg14IsNotNull() {
            addCriterion("SG14 is not null");
            return (Criteria) this;
        }

        public Criteria andSg14EqualTo(String value) {
            addCriterion("SG14 =", value, "sg14");
            return (Criteria) this;
        }

        public Criteria andSg14NotEqualTo(String value) {
            addCriterion("SG14 <>", value, "sg14");
            return (Criteria) this;
        }

        public Criteria andSg14GreaterThan(String value) {
            addCriterion("SG14 >", value, "sg14");
            return (Criteria) this;
        }

        public Criteria andSg14GreaterThanOrEqualTo(String value) {
            addCriterion("SG14 >=", value, "sg14");
            return (Criteria) this;
        }

        public Criteria andSg14LessThan(String value) {
            addCriterion("SG14 <", value, "sg14");
            return (Criteria) this;
        }

        public Criteria andSg14LessThanOrEqualTo(String value) {
            addCriterion("SG14 <=", value, "sg14");
            return (Criteria) this;
        }

        public Criteria andSg14Like(String value) {
            addCriterion("SG14 like", value, "sg14");
            return (Criteria) this;
        }

        public Criteria andSg14NotLike(String value) {
            addCriterion("SG14 not like", value, "sg14");
            return (Criteria) this;
        }

        public Criteria andSg14In(List<String> values) {
            addCriterion("SG14 in", values, "sg14");
            return (Criteria) this;
        }

        public Criteria andSg14NotIn(List<String> values) {
            addCriterion("SG14 not in", values, "sg14");
            return (Criteria) this;
        }

        public Criteria andSg14Between(String value1, String value2) {
            addCriterion("SG14 between", value1, value2, "sg14");
            return (Criteria) this;
        }

        public Criteria andSg14NotBetween(String value1, String value2) {
            addCriterion("SG14 not between", value1, value2, "sg14");
            return (Criteria) this;
        }

        public Criteria andSg15IsNull() {
            addCriterion("SG15 is null");
            return (Criteria) this;
        }

        public Criteria andSg15IsNotNull() {
            addCriterion("SG15 is not null");
            return (Criteria) this;
        }

        public Criteria andSg15EqualTo(String value) {
            addCriterion("SG15 =", value, "sg15");
            return (Criteria) this;
        }

        public Criteria andSg15NotEqualTo(String value) {
            addCriterion("SG15 <>", value, "sg15");
            return (Criteria) this;
        }

        public Criteria andSg15GreaterThan(String value) {
            addCriterion("SG15 >", value, "sg15");
            return (Criteria) this;
        }

        public Criteria andSg15GreaterThanOrEqualTo(String value) {
            addCriterion("SG15 >=", value, "sg15");
            return (Criteria) this;
        }

        public Criteria andSg15LessThan(String value) {
            addCriterion("SG15 <", value, "sg15");
            return (Criteria) this;
        }

        public Criteria andSg15LessThanOrEqualTo(String value) {
            addCriterion("SG15 <=", value, "sg15");
            return (Criteria) this;
        }

        public Criteria andSg15Like(String value) {
            addCriterion("SG15 like", value, "sg15");
            return (Criteria) this;
        }

        public Criteria andSg15NotLike(String value) {
            addCriterion("SG15 not like", value, "sg15");
            return (Criteria) this;
        }

        public Criteria andSg15In(List<String> values) {
            addCriterion("SG15 in", values, "sg15");
            return (Criteria) this;
        }

        public Criteria andSg15NotIn(List<String> values) {
            addCriterion("SG15 not in", values, "sg15");
            return (Criteria) this;
        }

        public Criteria andSg15Between(String value1, String value2) {
            addCriterion("SG15 between", value1, value2, "sg15");
            return (Criteria) this;
        }

        public Criteria andSg15NotBetween(String value1, String value2) {
            addCriterion("SG15 not between", value1, value2, "sg15");
            return (Criteria) this;
        }

        public Criteria andSg16IsNull() {
            addCriterion("SG16 is null");
            return (Criteria) this;
        }

        public Criteria andSg16IsNotNull() {
            addCriterion("SG16 is not null");
            return (Criteria) this;
        }

        public Criteria andSg16EqualTo(String value) {
            addCriterion("SG16 =", value, "sg16");
            return (Criteria) this;
        }

        public Criteria andSg16NotEqualTo(String value) {
            addCriterion("SG16 <>", value, "sg16");
            return (Criteria) this;
        }

        public Criteria andSg16GreaterThan(String value) {
            addCriterion("SG16 >", value, "sg16");
            return (Criteria) this;
        }

        public Criteria andSg16GreaterThanOrEqualTo(String value) {
            addCriterion("SG16 >=", value, "sg16");
            return (Criteria) this;
        }

        public Criteria andSg16LessThan(String value) {
            addCriterion("SG16 <", value, "sg16");
            return (Criteria) this;
        }

        public Criteria andSg16LessThanOrEqualTo(String value) {
            addCriterion("SG16 <=", value, "sg16");
            return (Criteria) this;
        }

        public Criteria andSg16Like(String value) {
            addCriterion("SG16 like", value, "sg16");
            return (Criteria) this;
        }

        public Criteria andSg16NotLike(String value) {
            addCriterion("SG16 not like", value, "sg16");
            return (Criteria) this;
        }

        public Criteria andSg16In(List<String> values) {
            addCriterion("SG16 in", values, "sg16");
            return (Criteria) this;
        }

        public Criteria andSg16NotIn(List<String> values) {
            addCriterion("SG16 not in", values, "sg16");
            return (Criteria) this;
        }

        public Criteria andSg16Between(String value1, String value2) {
            addCriterion("SG16 between", value1, value2, "sg16");
            return (Criteria) this;
        }

        public Criteria andSg16NotBetween(String value1, String value2) {
            addCriterion("SG16 not between", value1, value2, "sg16");
            return (Criteria) this;
        }

        public Criteria andSg17IsNull() {
            addCriterion("SG17 is null");
            return (Criteria) this;
        }

        public Criteria andSg17IsNotNull() {
            addCriterion("SG17 is not null");
            return (Criteria) this;
        }

        public Criteria andSg17EqualTo(String value) {
            addCriterion("SG17 =", value, "sg17");
            return (Criteria) this;
        }

        public Criteria andSg17NotEqualTo(String value) {
            addCriterion("SG17 <>", value, "sg17");
            return (Criteria) this;
        }

        public Criteria andSg17GreaterThan(String value) {
            addCriterion("SG17 >", value, "sg17");
            return (Criteria) this;
        }

        public Criteria andSg17GreaterThanOrEqualTo(String value) {
            addCriterion("SG17 >=", value, "sg17");
            return (Criteria) this;
        }

        public Criteria andSg17LessThan(String value) {
            addCriterion("SG17 <", value, "sg17");
            return (Criteria) this;
        }

        public Criteria andSg17LessThanOrEqualTo(String value) {
            addCriterion("SG17 <=", value, "sg17");
            return (Criteria) this;
        }

        public Criteria andSg17Like(String value) {
            addCriterion("SG17 like", value, "sg17");
            return (Criteria) this;
        }

        public Criteria andSg17NotLike(String value) {
            addCriterion("SG17 not like", value, "sg17");
            return (Criteria) this;
        }

        public Criteria andSg17In(List<String> values) {
            addCriterion("SG17 in", values, "sg17");
            return (Criteria) this;
        }

        public Criteria andSg17NotIn(List<String> values) {
            addCriterion("SG17 not in", values, "sg17");
            return (Criteria) this;
        }

        public Criteria andSg17Between(String value1, String value2) {
            addCriterion("SG17 between", value1, value2, "sg17");
            return (Criteria) this;
        }

        public Criteria andSg17NotBetween(String value1, String value2) {
            addCriterion("SG17 not between", value1, value2, "sg17");
            return (Criteria) this;
        }

        public Criteria andSg18IsNull() {
            addCriterion("SG18 is null");
            return (Criteria) this;
        }

        public Criteria andSg18IsNotNull() {
            addCriterion("SG18 is not null");
            return (Criteria) this;
        }

        public Criteria andSg18EqualTo(String value) {
            addCriterion("SG18 =", value, "sg18");
            return (Criteria) this;
        }

        public Criteria andSg18NotEqualTo(String value) {
            addCriterion("SG18 <>", value, "sg18");
            return (Criteria) this;
        }

        public Criteria andSg18GreaterThan(String value) {
            addCriterion("SG18 >", value, "sg18");
            return (Criteria) this;
        }

        public Criteria andSg18GreaterThanOrEqualTo(String value) {
            addCriterion("SG18 >=", value, "sg18");
            return (Criteria) this;
        }

        public Criteria andSg18LessThan(String value) {
            addCriterion("SG18 <", value, "sg18");
            return (Criteria) this;
        }

        public Criteria andSg18LessThanOrEqualTo(String value) {
            addCriterion("SG18 <=", value, "sg18");
            return (Criteria) this;
        }

        public Criteria andSg18Like(String value) {
            addCriterion("SG18 like", value, "sg18");
            return (Criteria) this;
        }

        public Criteria andSg18NotLike(String value) {
            addCriterion("SG18 not like", value, "sg18");
            return (Criteria) this;
        }

        public Criteria andSg18In(List<String> values) {
            addCriterion("SG18 in", values, "sg18");
            return (Criteria) this;
        }

        public Criteria andSg18NotIn(List<String> values) {
            addCriterion("SG18 not in", values, "sg18");
            return (Criteria) this;
        }

        public Criteria andSg18Between(String value1, String value2) {
            addCriterion("SG18 between", value1, value2, "sg18");
            return (Criteria) this;
        }

        public Criteria andSg18NotBetween(String value1, String value2) {
            addCriterion("SG18 not between", value1, value2, "sg18");
            return (Criteria) this;
        }

        public Criteria andSg19IsNull() {
            addCriterion("SG19 is null");
            return (Criteria) this;
        }

        public Criteria andSg19IsNotNull() {
            addCriterion("SG19 is not null");
            return (Criteria) this;
        }

        public Criteria andSg19EqualTo(String value) {
            addCriterion("SG19 =", value, "sg19");
            return (Criteria) this;
        }

        public Criteria andSg19NotEqualTo(String value) {
            addCriterion("SG19 <>", value, "sg19");
            return (Criteria) this;
        }

        public Criteria andSg19GreaterThan(String value) {
            addCriterion("SG19 >", value, "sg19");
            return (Criteria) this;
        }

        public Criteria andSg19GreaterThanOrEqualTo(String value) {
            addCriterion("SG19 >=", value, "sg19");
            return (Criteria) this;
        }

        public Criteria andSg19LessThan(String value) {
            addCriterion("SG19 <", value, "sg19");
            return (Criteria) this;
        }

        public Criteria andSg19LessThanOrEqualTo(String value) {
            addCriterion("SG19 <=", value, "sg19");
            return (Criteria) this;
        }

        public Criteria andSg19Like(String value) {
            addCriterion("SG19 like", value, "sg19");
            return (Criteria) this;
        }

        public Criteria andSg19NotLike(String value) {
            addCriterion("SG19 not like", value, "sg19");
            return (Criteria) this;
        }

        public Criteria andSg19In(List<String> values) {
            addCriterion("SG19 in", values, "sg19");
            return (Criteria) this;
        }

        public Criteria andSg19NotIn(List<String> values) {
            addCriterion("SG19 not in", values, "sg19");
            return (Criteria) this;
        }

        public Criteria andSg19Between(String value1, String value2) {
            addCriterion("SG19 between", value1, value2, "sg19");
            return (Criteria) this;
        }

        public Criteria andSg19NotBetween(String value1, String value2) {
            addCriterion("SG19 not between", value1, value2, "sg19");
            return (Criteria) this;
        }

        public Criteria andSg20IsNull() {
            addCriterion("SG20 is null");
            return (Criteria) this;
        }

        public Criteria andSg20IsNotNull() {
            addCriterion("SG20 is not null");
            return (Criteria) this;
        }

        public Criteria andSg20EqualTo(String value) {
            addCriterion("SG20 =", value, "sg20");
            return (Criteria) this;
        }

        public Criteria andSg20NotEqualTo(String value) {
            addCriterion("SG20 <>", value, "sg20");
            return (Criteria) this;
        }

        public Criteria andSg20GreaterThan(String value) {
            addCriterion("SG20 >", value, "sg20");
            return (Criteria) this;
        }

        public Criteria andSg20GreaterThanOrEqualTo(String value) {
            addCriterion("SG20 >=", value, "sg20");
            return (Criteria) this;
        }

        public Criteria andSg20LessThan(String value) {
            addCriterion("SG20 <", value, "sg20");
            return (Criteria) this;
        }

        public Criteria andSg20LessThanOrEqualTo(String value) {
            addCriterion("SG20 <=", value, "sg20");
            return (Criteria) this;
        }

        public Criteria andSg20Like(String value) {
            addCriterion("SG20 like", value, "sg20");
            return (Criteria) this;
        }

        public Criteria andSg20NotLike(String value) {
            addCriterion("SG20 not like", value, "sg20");
            return (Criteria) this;
        }

        public Criteria andSg20In(List<String> values) {
            addCriterion("SG20 in", values, "sg20");
            return (Criteria) this;
        }

        public Criteria andSg20NotIn(List<String> values) {
            addCriterion("SG20 not in", values, "sg20");
            return (Criteria) this;
        }

        public Criteria andSg20Between(String value1, String value2) {
            addCriterion("SG20 between", value1, value2, "sg20");
            return (Criteria) this;
        }

        public Criteria andSg20NotBetween(String value1, String value2) {
            addCriterion("SG20 not between", value1, value2, "sg20");
            return (Criteria) this;
        }

        public Criteria andSg21IsNull() {
            addCriterion("SG21 is null");
            return (Criteria) this;
        }

        public Criteria andSg21IsNotNull() {
            addCriterion("SG21 is not null");
            return (Criteria) this;
        }

        public Criteria andSg21EqualTo(String value) {
            addCriterion("SG21 =", value, "sg21");
            return (Criteria) this;
        }

        public Criteria andSg21NotEqualTo(String value) {
            addCriterion("SG21 <>", value, "sg21");
            return (Criteria) this;
        }

        public Criteria andSg21GreaterThan(String value) {
            addCriterion("SG21 >", value, "sg21");
            return (Criteria) this;
        }

        public Criteria andSg21GreaterThanOrEqualTo(String value) {
            addCriterion("SG21 >=", value, "sg21");
            return (Criteria) this;
        }

        public Criteria andSg21LessThan(String value) {
            addCriterion("SG21 <", value, "sg21");
            return (Criteria) this;
        }

        public Criteria andSg21LessThanOrEqualTo(String value) {
            addCriterion("SG21 <=", value, "sg21");
            return (Criteria) this;
        }

        public Criteria andSg21Like(String value) {
            addCriterion("SG21 like", value, "sg21");
            return (Criteria) this;
        }

        public Criteria andSg21NotLike(String value) {
            addCriterion("SG21 not like", value, "sg21");
            return (Criteria) this;
        }

        public Criteria andSg21In(List<String> values) {
            addCriterion("SG21 in", values, "sg21");
            return (Criteria) this;
        }

        public Criteria andSg21NotIn(List<String> values) {
            addCriterion("SG21 not in", values, "sg21");
            return (Criteria) this;
        }

        public Criteria andSg21Between(String value1, String value2) {
            addCriterion("SG21 between", value1, value2, "sg21");
            return (Criteria) this;
        }

        public Criteria andSg21NotBetween(String value1, String value2) {
            addCriterion("SG21 not between", value1, value2, "sg21");
            return (Criteria) this;
        }

        public Criteria andSg22IsNull() {
            addCriterion("SG22 is null");
            return (Criteria) this;
        }

        public Criteria andSg22IsNotNull() {
            addCriterion("SG22 is not null");
            return (Criteria) this;
        }

        public Criteria andSg22EqualTo(String value) {
            addCriterion("SG22 =", value, "sg22");
            return (Criteria) this;
        }

        public Criteria andSg22NotEqualTo(String value) {
            addCriterion("SG22 <>", value, "sg22");
            return (Criteria) this;
        }

        public Criteria andSg22GreaterThan(String value) {
            addCriterion("SG22 >", value, "sg22");
            return (Criteria) this;
        }

        public Criteria andSg22GreaterThanOrEqualTo(String value) {
            addCriterion("SG22 >=", value, "sg22");
            return (Criteria) this;
        }

        public Criteria andSg22LessThan(String value) {
            addCriterion("SG22 <", value, "sg22");
            return (Criteria) this;
        }

        public Criteria andSg22LessThanOrEqualTo(String value) {
            addCriterion("SG22 <=", value, "sg22");
            return (Criteria) this;
        }

        public Criteria andSg22Like(String value) {
            addCriterion("SG22 like", value, "sg22");
            return (Criteria) this;
        }

        public Criteria andSg22NotLike(String value) {
            addCriterion("SG22 not like", value, "sg22");
            return (Criteria) this;
        }

        public Criteria andSg22In(List<String> values) {
            addCriterion("SG22 in", values, "sg22");
            return (Criteria) this;
        }

        public Criteria andSg22NotIn(List<String> values) {
            addCriterion("SG22 not in", values, "sg22");
            return (Criteria) this;
        }

        public Criteria andSg22Between(String value1, String value2) {
            addCriterion("SG22 between", value1, value2, "sg22");
            return (Criteria) this;
        }

        public Criteria andSg22NotBetween(String value1, String value2) {
            addCriterion("SG22 not between", value1, value2, "sg22");
            return (Criteria) this;
        }

        public Criteria andSg23IsNull() {
            addCriterion("SG23 is null");
            return (Criteria) this;
        }

        public Criteria andSg23IsNotNull() {
            addCriterion("SG23 is not null");
            return (Criteria) this;
        }

        public Criteria andSg23EqualTo(String value) {
            addCriterion("SG23 =", value, "sg23");
            return (Criteria) this;
        }

        public Criteria andSg23NotEqualTo(String value) {
            addCriterion("SG23 <>", value, "sg23");
            return (Criteria) this;
        }

        public Criteria andSg23GreaterThan(String value) {
            addCriterion("SG23 >", value, "sg23");
            return (Criteria) this;
        }

        public Criteria andSg23GreaterThanOrEqualTo(String value) {
            addCriterion("SG23 >=", value, "sg23");
            return (Criteria) this;
        }

        public Criteria andSg23LessThan(String value) {
            addCriterion("SG23 <", value, "sg23");
            return (Criteria) this;
        }

        public Criteria andSg23LessThanOrEqualTo(String value) {
            addCriterion("SG23 <=", value, "sg23");
            return (Criteria) this;
        }

        public Criteria andSg23Like(String value) {
            addCriterion("SG23 like", value, "sg23");
            return (Criteria) this;
        }

        public Criteria andSg23NotLike(String value) {
            addCriterion("SG23 not like", value, "sg23");
            return (Criteria) this;
        }

        public Criteria andSg23In(List<String> values) {
            addCriterion("SG23 in", values, "sg23");
            return (Criteria) this;
        }

        public Criteria andSg23NotIn(List<String> values) {
            addCriterion("SG23 not in", values, "sg23");
            return (Criteria) this;
        }

        public Criteria andSg23Between(String value1, String value2) {
            addCriterion("SG23 between", value1, value2, "sg23");
            return (Criteria) this;
        }

        public Criteria andSg23NotBetween(String value1, String value2) {
            addCriterion("SG23 not between", value1, value2, "sg23");
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