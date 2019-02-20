package com.itonglian.fms.entity;

import java.util.ArrayList;
import java.util.List;

public class FFGLExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FFGLExample() {
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

        public Criteria andFf00IsNull() {
            addCriterion("FF00 is null");
            return (Criteria) this;
        }

        public Criteria andFf00IsNotNull() {
            addCriterion("FF00 is not null");
            return (Criteria) this;
        }

        public Criteria andFf00EqualTo(Long value) {
            addCriterion("FF00 =", value, "ff00");
            return (Criteria) this;
        }

        public Criteria andFf00NotEqualTo(Long value) {
            addCriterion("FF00 <>", value, "ff00");
            return (Criteria) this;
        }

        public Criteria andFf00GreaterThan(Long value) {
            addCriterion("FF00 >", value, "ff00");
            return (Criteria) this;
        }

        public Criteria andFf00GreaterThanOrEqualTo(Long value) {
            addCriterion("FF00 >=", value, "ff00");
            return (Criteria) this;
        }

        public Criteria andFf00LessThan(Long value) {
            addCriterion("FF00 <", value, "ff00");
            return (Criteria) this;
        }

        public Criteria andFf00LessThanOrEqualTo(Long value) {
            addCriterion("FF00 <=", value, "ff00");
            return (Criteria) this;
        }

        public Criteria andFf00In(List<Long> values) {
            addCriterion("FF00 in", values, "ff00");
            return (Criteria) this;
        }

        public Criteria andFf00NotIn(List<Long> values) {
            addCriterion("FF00 not in", values, "ff00");
            return (Criteria) this;
        }

        public Criteria andFf00Between(Long value1, Long value2) {
            addCriterion("FF00 between", value1, value2, "ff00");
            return (Criteria) this;
        }

        public Criteria andFf00NotBetween(Long value1, Long value2) {
            addCriterion("FF00 not between", value1, value2, "ff00");
            return (Criteria) this;
        }

        public Criteria andFf01IsNull() {
            addCriterion("FF01 is null");
            return (Criteria) this;
        }

        public Criteria andFf01IsNotNull() {
            addCriterion("FF01 is not null");
            return (Criteria) this;
        }

        public Criteria andFf01EqualTo(String value) {
            addCriterion("FF01 =", value, "ff01");
            return (Criteria) this;
        }

        public Criteria andFf01NotEqualTo(String value) {
            addCriterion("FF01 <>", value, "ff01");
            return (Criteria) this;
        }

        public Criteria andFf01GreaterThan(String value) {
            addCriterion("FF01 >", value, "ff01");
            return (Criteria) this;
        }

        public Criteria andFf01GreaterThanOrEqualTo(String value) {
            addCriterion("FF01 >=", value, "ff01");
            return (Criteria) this;
        }

        public Criteria andFf01LessThan(String value) {
            addCriterion("FF01 <", value, "ff01");
            return (Criteria) this;
        }

        public Criteria andFf01LessThanOrEqualTo(String value) {
            addCriterion("FF01 <=", value, "ff01");
            return (Criteria) this;
        }

        public Criteria andFf01Like(String value) {
            addCriterion("FF01 like", value, "ff01");
            return (Criteria) this;
        }

        public Criteria andFf01NotLike(String value) {
            addCriterion("FF01 not like", value, "ff01");
            return (Criteria) this;
        }

        public Criteria andFf01In(List<String> values) {
            addCriterion("FF01 in", values, "ff01");
            return (Criteria) this;
        }

        public Criteria andFf01NotIn(List<String> values) {
            addCriterion("FF01 not in", values, "ff01");
            return (Criteria) this;
        }

        public Criteria andFf01Between(String value1, String value2) {
            addCriterion("FF01 between", value1, value2, "ff01");
            return (Criteria) this;
        }

        public Criteria andFf01NotBetween(String value1, String value2) {
            addCriterion("FF01 not between", value1, value2, "ff01");
            return (Criteria) this;
        }

        public Criteria andFf02IsNull() {
            addCriterion("FF02 is null");
            return (Criteria) this;
        }

        public Criteria andFf02IsNotNull() {
            addCriterion("FF02 is not null");
            return (Criteria) this;
        }

        public Criteria andFf02EqualTo(String value) {
            addCriterion("FF02 =", value, "ff02");
            return (Criteria) this;
        }

        public Criteria andFf02NotEqualTo(String value) {
            addCriterion("FF02 <>", value, "ff02");
            return (Criteria) this;
        }

        public Criteria andFf02GreaterThan(String value) {
            addCriterion("FF02 >", value, "ff02");
            return (Criteria) this;
        }

        public Criteria andFf02GreaterThanOrEqualTo(String value) {
            addCriterion("FF02 >=", value, "ff02");
            return (Criteria) this;
        }

        public Criteria andFf02LessThan(String value) {
            addCriterion("FF02 <", value, "ff02");
            return (Criteria) this;
        }

        public Criteria andFf02LessThanOrEqualTo(String value) {
            addCriterion("FF02 <=", value, "ff02");
            return (Criteria) this;
        }

        public Criteria andFf02Like(String value) {
            addCriterion("FF02 like", value, "ff02");
            return (Criteria) this;
        }

        public Criteria andFf02NotLike(String value) {
            addCriterion("FF02 not like", value, "ff02");
            return (Criteria) this;
        }

        public Criteria andFf02In(List<String> values) {
            addCriterion("FF02 in", values, "ff02");
            return (Criteria) this;
        }

        public Criteria andFf02NotIn(List<String> values) {
            addCriterion("FF02 not in", values, "ff02");
            return (Criteria) this;
        }

        public Criteria andFf02Between(String value1, String value2) {
            addCriterion("FF02 between", value1, value2, "ff02");
            return (Criteria) this;
        }

        public Criteria andFf02NotBetween(String value1, String value2) {
            addCriterion("FF02 not between", value1, value2, "ff02");
            return (Criteria) this;
        }

        public Criteria andFf03IsNull() {
            addCriterion("FF03 is null");
            return (Criteria) this;
        }

        public Criteria andFf03IsNotNull() {
            addCriterion("FF03 is not null");
            return (Criteria) this;
        }

        public Criteria andFf03EqualTo(String value) {
            addCriterion("FF03 =", value, "ff03");
            return (Criteria) this;
        }

        public Criteria andFf03NotEqualTo(String value) {
            addCriterion("FF03 <>", value, "ff03");
            return (Criteria) this;
        }

        public Criteria andFf03GreaterThan(String value) {
            addCriterion("FF03 >", value, "ff03");
            return (Criteria) this;
        }

        public Criteria andFf03GreaterThanOrEqualTo(String value) {
            addCriterion("FF03 >=", value, "ff03");
            return (Criteria) this;
        }

        public Criteria andFf03LessThan(String value) {
            addCriterion("FF03 <", value, "ff03");
            return (Criteria) this;
        }

        public Criteria andFf03LessThanOrEqualTo(String value) {
            addCriterion("FF03 <=", value, "ff03");
            return (Criteria) this;
        }

        public Criteria andFf03Like(String value) {
            addCriterion("FF03 like", value, "ff03");
            return (Criteria) this;
        }

        public Criteria andFf03NotLike(String value) {
            addCriterion("FF03 not like", value, "ff03");
            return (Criteria) this;
        }

        public Criteria andFf03In(List<String> values) {
            addCriterion("FF03 in", values, "ff03");
            return (Criteria) this;
        }

        public Criteria andFf03NotIn(List<String> values) {
            addCriterion("FF03 not in", values, "ff03");
            return (Criteria) this;
        }

        public Criteria andFf03Between(String value1, String value2) {
            addCriterion("FF03 between", value1, value2, "ff03");
            return (Criteria) this;
        }

        public Criteria andFf03NotBetween(String value1, String value2) {
            addCriterion("FF03 not between", value1, value2, "ff03");
            return (Criteria) this;
        }

        public Criteria andFf04IsNull() {
            addCriterion("FF04 is null");
            return (Criteria) this;
        }

        public Criteria andFf04IsNotNull() {
            addCriterion("FF04 is not null");
            return (Criteria) this;
        }

        public Criteria andFf04EqualTo(String value) {
            addCriterion("FF04 =", value, "ff04");
            return (Criteria) this;
        }

        public Criteria andFf04NotEqualTo(String value) {
            addCriterion("FF04 <>", value, "ff04");
            return (Criteria) this;
        }

        public Criteria andFf04GreaterThan(String value) {
            addCriterion("FF04 >", value, "ff04");
            return (Criteria) this;
        }

        public Criteria andFf04GreaterThanOrEqualTo(String value) {
            addCriterion("FF04 >=", value, "ff04");
            return (Criteria) this;
        }

        public Criteria andFf04LessThan(String value) {
            addCriterion("FF04 <", value, "ff04");
            return (Criteria) this;
        }

        public Criteria andFf04LessThanOrEqualTo(String value) {
            addCriterion("FF04 <=", value, "ff04");
            return (Criteria) this;
        }

        public Criteria andFf04Like(String value) {
            addCriterion("FF04 like", value, "ff04");
            return (Criteria) this;
        }

        public Criteria andFf04NotLike(String value) {
            addCriterion("FF04 not like", value, "ff04");
            return (Criteria) this;
        }

        public Criteria andFf04In(List<String> values) {
            addCriterion("FF04 in", values, "ff04");
            return (Criteria) this;
        }

        public Criteria andFf04NotIn(List<String> values) {
            addCriterion("FF04 not in", values, "ff04");
            return (Criteria) this;
        }

        public Criteria andFf04Between(String value1, String value2) {
            addCriterion("FF04 between", value1, value2, "ff04");
            return (Criteria) this;
        }

        public Criteria andFf04NotBetween(String value1, String value2) {
            addCriterion("FF04 not between", value1, value2, "ff04");
            return (Criteria) this;
        }

        public Criteria andFf05IsNull() {
            addCriterion("FF05 is null");
            return (Criteria) this;
        }

        public Criteria andFf05IsNotNull() {
            addCriterion("FF05 is not null");
            return (Criteria) this;
        }

        public Criteria andFf05EqualTo(String value) {
            addCriterion("FF05 =", value, "ff05");
            return (Criteria) this;
        }

        public Criteria andFf05NotEqualTo(String value) {
            addCriterion("FF05 <>", value, "ff05");
            return (Criteria) this;
        }

        public Criteria andFf05GreaterThan(String value) {
            addCriterion("FF05 >", value, "ff05");
            return (Criteria) this;
        }

        public Criteria andFf05GreaterThanOrEqualTo(String value) {
            addCriterion("FF05 >=", value, "ff05");
            return (Criteria) this;
        }

        public Criteria andFf05LessThan(String value) {
            addCriterion("FF05 <", value, "ff05");
            return (Criteria) this;
        }

        public Criteria andFf05LessThanOrEqualTo(String value) {
            addCriterion("FF05 <=", value, "ff05");
            return (Criteria) this;
        }

        public Criteria andFf05Like(String value) {
            addCriterion("FF05 like", value, "ff05");
            return (Criteria) this;
        }

        public Criteria andFf05NotLike(String value) {
            addCriterion("FF05 not like", value, "ff05");
            return (Criteria) this;
        }

        public Criteria andFf05In(List<String> values) {
            addCriterion("FF05 in", values, "ff05");
            return (Criteria) this;
        }

        public Criteria andFf05NotIn(List<String> values) {
            addCriterion("FF05 not in", values, "ff05");
            return (Criteria) this;
        }

        public Criteria andFf05Between(String value1, String value2) {
            addCriterion("FF05 between", value1, value2, "ff05");
            return (Criteria) this;
        }

        public Criteria andFf05NotBetween(String value1, String value2) {
            addCriterion("FF05 not between", value1, value2, "ff05");
            return (Criteria) this;
        }

        public Criteria andFf06IsNull() {
            addCriterion("FF06 is null");
            return (Criteria) this;
        }

        public Criteria andFf06IsNotNull() {
            addCriterion("FF06 is not null");
            return (Criteria) this;
        }

        public Criteria andFf06EqualTo(String value) {
            addCriterion("FF06 =", value, "ff06");
            return (Criteria) this;
        }

        public Criteria andFf06NotEqualTo(String value) {
            addCriterion("FF06 <>", value, "ff06");
            return (Criteria) this;
        }

        public Criteria andFf06GreaterThan(String value) {
            addCriterion("FF06 >", value, "ff06");
            return (Criteria) this;
        }

        public Criteria andFf06GreaterThanOrEqualTo(String value) {
            addCriterion("FF06 >=", value, "ff06");
            return (Criteria) this;
        }

        public Criteria andFf06LessThan(String value) {
            addCriterion("FF06 <", value, "ff06");
            return (Criteria) this;
        }

        public Criteria andFf06LessThanOrEqualTo(String value) {
            addCriterion("FF06 <=", value, "ff06");
            return (Criteria) this;
        }

        public Criteria andFf06Like(String value) {
            addCriterion("FF06 like", value, "ff06");
            return (Criteria) this;
        }

        public Criteria andFf06NotLike(String value) {
            addCriterion("FF06 not like", value, "ff06");
            return (Criteria) this;
        }

        public Criteria andFf06In(List<String> values) {
            addCriterion("FF06 in", values, "ff06");
            return (Criteria) this;
        }

        public Criteria andFf06NotIn(List<String> values) {
            addCriterion("FF06 not in", values, "ff06");
            return (Criteria) this;
        }

        public Criteria andFf06Between(String value1, String value2) {
            addCriterion("FF06 between", value1, value2, "ff06");
            return (Criteria) this;
        }

        public Criteria andFf06NotBetween(String value1, String value2) {
            addCriterion("FF06 not between", value1, value2, "ff06");
            return (Criteria) this;
        }

        public Criteria andFf07IsNull() {
            addCriterion("FF07 is null");
            return (Criteria) this;
        }

        public Criteria andFf07IsNotNull() {
            addCriterion("FF07 is not null");
            return (Criteria) this;
        }

        public Criteria andFf07EqualTo(String value) {
            addCriterion("FF07 =", value, "ff07");
            return (Criteria) this;
        }

        public Criteria andFf07NotEqualTo(String value) {
            addCriterion("FF07 <>", value, "ff07");
            return (Criteria) this;
        }

        public Criteria andFf07GreaterThan(String value) {
            addCriterion("FF07 >", value, "ff07");
            return (Criteria) this;
        }

        public Criteria andFf07GreaterThanOrEqualTo(String value) {
            addCriterion("FF07 >=", value, "ff07");
            return (Criteria) this;
        }

        public Criteria andFf07LessThan(String value) {
            addCriterion("FF07 <", value, "ff07");
            return (Criteria) this;
        }

        public Criteria andFf07LessThanOrEqualTo(String value) {
            addCriterion("FF07 <=", value, "ff07");
            return (Criteria) this;
        }

        public Criteria andFf07Like(String value) {
            addCriterion("FF07 like", value, "ff07");
            return (Criteria) this;
        }

        public Criteria andFf07NotLike(String value) {
            addCriterion("FF07 not like", value, "ff07");
            return (Criteria) this;
        }

        public Criteria andFf07In(List<String> values) {
            addCriterion("FF07 in", values, "ff07");
            return (Criteria) this;
        }

        public Criteria andFf07NotIn(List<String> values) {
            addCriterion("FF07 not in", values, "ff07");
            return (Criteria) this;
        }

        public Criteria andFf07Between(String value1, String value2) {
            addCriterion("FF07 between", value1, value2, "ff07");
            return (Criteria) this;
        }

        public Criteria andFf07NotBetween(String value1, String value2) {
            addCriterion("FF07 not between", value1, value2, "ff07");
            return (Criteria) this;
        }

        public Criteria andFf08IsNull() {
            addCriterion("FF08 is null");
            return (Criteria) this;
        }

        public Criteria andFf08IsNotNull() {
            addCriterion("FF08 is not null");
            return (Criteria) this;
        }

        public Criteria andFf08EqualTo(String value) {
            addCriterion("FF08 =", value, "ff08");
            return (Criteria) this;
        }

        public Criteria andFf08NotEqualTo(String value) {
            addCriterion("FF08 <>", value, "ff08");
            return (Criteria) this;
        }

        public Criteria andFf08GreaterThan(String value) {
            addCriterion("FF08 >", value, "ff08");
            return (Criteria) this;
        }

        public Criteria andFf08GreaterThanOrEqualTo(String value) {
            addCriterion("FF08 >=", value, "ff08");
            return (Criteria) this;
        }

        public Criteria andFf08LessThan(String value) {
            addCriterion("FF08 <", value, "ff08");
            return (Criteria) this;
        }

        public Criteria andFf08LessThanOrEqualTo(String value) {
            addCriterion("FF08 <=", value, "ff08");
            return (Criteria) this;
        }

        public Criteria andFf08Like(String value) {
            addCriterion("FF08 like", value, "ff08");
            return (Criteria) this;
        }

        public Criteria andFf08NotLike(String value) {
            addCriterion("FF08 not like", value, "ff08");
            return (Criteria) this;
        }

        public Criteria andFf08In(List<String> values) {
            addCriterion("FF08 in", values, "ff08");
            return (Criteria) this;
        }

        public Criteria andFf08NotIn(List<String> values) {
            addCriterion("FF08 not in", values, "ff08");
            return (Criteria) this;
        }

        public Criteria andFf08Between(String value1, String value2) {
            addCriterion("FF08 between", value1, value2, "ff08");
            return (Criteria) this;
        }

        public Criteria andFf08NotBetween(String value1, String value2) {
            addCriterion("FF08 not between", value1, value2, "ff08");
            return (Criteria) this;
        }

        public Criteria andFf09IsNull() {
            addCriterion("FF09 is null");
            return (Criteria) this;
        }

        public Criteria andFf09IsNotNull() {
            addCriterion("FF09 is not null");
            return (Criteria) this;
        }

        public Criteria andFf09EqualTo(String value) {
            addCriterion("FF09 =", value, "ff09");
            return (Criteria) this;
        }

        public Criteria andFf09NotEqualTo(String value) {
            addCriterion("FF09 <>", value, "ff09");
            return (Criteria) this;
        }

        public Criteria andFf09GreaterThan(String value) {
            addCriterion("FF09 >", value, "ff09");
            return (Criteria) this;
        }

        public Criteria andFf09GreaterThanOrEqualTo(String value) {
            addCriterion("FF09 >=", value, "ff09");
            return (Criteria) this;
        }

        public Criteria andFf09LessThan(String value) {
            addCriterion("FF09 <", value, "ff09");
            return (Criteria) this;
        }

        public Criteria andFf09LessThanOrEqualTo(String value) {
            addCriterion("FF09 <=", value, "ff09");
            return (Criteria) this;
        }

        public Criteria andFf09Like(String value) {
            addCriterion("FF09 like", value, "ff09");
            return (Criteria) this;
        }

        public Criteria andFf09NotLike(String value) {
            addCriterion("FF09 not like", value, "ff09");
            return (Criteria) this;
        }

        public Criteria andFf09In(List<String> values) {
            addCriterion("FF09 in", values, "ff09");
            return (Criteria) this;
        }

        public Criteria andFf09NotIn(List<String> values) {
            addCriterion("FF09 not in", values, "ff09");
            return (Criteria) this;
        }

        public Criteria andFf09Between(String value1, String value2) {
            addCriterion("FF09 between", value1, value2, "ff09");
            return (Criteria) this;
        }

        public Criteria andFf09NotBetween(String value1, String value2) {
            addCriterion("FF09 not between", value1, value2, "ff09");
            return (Criteria) this;
        }

        public Criteria andFf10IsNull() {
            addCriterion("FF10 is null");
            return (Criteria) this;
        }

        public Criteria andFf10IsNotNull() {
            addCriterion("FF10 is not null");
            return (Criteria) this;
        }

        public Criteria andFf10EqualTo(String value) {
            addCriterion("FF10 =", value, "ff10");
            return (Criteria) this;
        }

        public Criteria andFf10NotEqualTo(String value) {
            addCriterion("FF10 <>", value, "ff10");
            return (Criteria) this;
        }

        public Criteria andFf10GreaterThan(String value) {
            addCriterion("FF10 >", value, "ff10");
            return (Criteria) this;
        }

        public Criteria andFf10GreaterThanOrEqualTo(String value) {
            addCriterion("FF10 >=", value, "ff10");
            return (Criteria) this;
        }

        public Criteria andFf10LessThan(String value) {
            addCriterion("FF10 <", value, "ff10");
            return (Criteria) this;
        }

        public Criteria andFf10LessThanOrEqualTo(String value) {
            addCriterion("FF10 <=", value, "ff10");
            return (Criteria) this;
        }

        public Criteria andFf10Like(String value) {
            addCriterion("FF10 like", value, "ff10");
            return (Criteria) this;
        }

        public Criteria andFf10NotLike(String value) {
            addCriterion("FF10 not like", value, "ff10");
            return (Criteria) this;
        }

        public Criteria andFf10In(List<String> values) {
            addCriterion("FF10 in", values, "ff10");
            return (Criteria) this;
        }

        public Criteria andFf10NotIn(List<String> values) {
            addCriterion("FF10 not in", values, "ff10");
            return (Criteria) this;
        }

        public Criteria andFf10Between(String value1, String value2) {
            addCriterion("FF10 between", value1, value2, "ff10");
            return (Criteria) this;
        }

        public Criteria andFf10NotBetween(String value1, String value2) {
            addCriterion("FF10 not between", value1, value2, "ff10");
            return (Criteria) this;
        }

        public Criteria andFf11IsNull() {
            addCriterion("FF11 is null");
            return (Criteria) this;
        }

        public Criteria andFf11IsNotNull() {
            addCriterion("FF11 is not null");
            return (Criteria) this;
        }

        public Criteria andFf11EqualTo(String value) {
            addCriterion("FF11 =", value, "ff11");
            return (Criteria) this;
        }

        public Criteria andFf11NotEqualTo(String value) {
            addCriterion("FF11 <>", value, "ff11");
            return (Criteria) this;
        }

        public Criteria andFf11GreaterThan(String value) {
            addCriterion("FF11 >", value, "ff11");
            return (Criteria) this;
        }

        public Criteria andFf11GreaterThanOrEqualTo(String value) {
            addCriterion("FF11 >=", value, "ff11");
            return (Criteria) this;
        }

        public Criteria andFf11LessThan(String value) {
            addCriterion("FF11 <", value, "ff11");
            return (Criteria) this;
        }

        public Criteria andFf11LessThanOrEqualTo(String value) {
            addCriterion("FF11 <=", value, "ff11");
            return (Criteria) this;
        }

        public Criteria andFf11Like(String value) {
            addCriterion("FF11 like", value, "ff11");
            return (Criteria) this;
        }

        public Criteria andFf11NotLike(String value) {
            addCriterion("FF11 not like", value, "ff11");
            return (Criteria) this;
        }

        public Criteria andFf11In(List<String> values) {
            addCriterion("FF11 in", values, "ff11");
            return (Criteria) this;
        }

        public Criteria andFf11NotIn(List<String> values) {
            addCriterion("FF11 not in", values, "ff11");
            return (Criteria) this;
        }

        public Criteria andFf11Between(String value1, String value2) {
            addCriterion("FF11 between", value1, value2, "ff11");
            return (Criteria) this;
        }

        public Criteria andFf11NotBetween(String value1, String value2) {
            addCriterion("FF11 not between", value1, value2, "ff11");
            return (Criteria) this;
        }

        public Criteria andFf12IsNull() {
            addCriterion("FF12 is null");
            return (Criteria) this;
        }

        public Criteria andFf12IsNotNull() {
            addCriterion("FF12 is not null");
            return (Criteria) this;
        }

        public Criteria andFf12EqualTo(String value) {
            addCriterion("FF12 =", value, "ff12");
            return (Criteria) this;
        }

        public Criteria andFf12NotEqualTo(String value) {
            addCriterion("FF12 <>", value, "ff12");
            return (Criteria) this;
        }

        public Criteria andFf12GreaterThan(String value) {
            addCriterion("FF12 >", value, "ff12");
            return (Criteria) this;
        }

        public Criteria andFf12GreaterThanOrEqualTo(String value) {
            addCriterion("FF12 >=", value, "ff12");
            return (Criteria) this;
        }

        public Criteria andFf12LessThan(String value) {
            addCriterion("FF12 <", value, "ff12");
            return (Criteria) this;
        }

        public Criteria andFf12LessThanOrEqualTo(String value) {
            addCriterion("FF12 <=", value, "ff12");
            return (Criteria) this;
        }

        public Criteria andFf12Like(String value) {
            addCriterion("FF12 like", value, "ff12");
            return (Criteria) this;
        }

        public Criteria andFf12NotLike(String value) {
            addCriterion("FF12 not like", value, "ff12");
            return (Criteria) this;
        }

        public Criteria andFf12In(List<String> values) {
            addCriterion("FF12 in", values, "ff12");
            return (Criteria) this;
        }

        public Criteria andFf12NotIn(List<String> values) {
            addCriterion("FF12 not in", values, "ff12");
            return (Criteria) this;
        }

        public Criteria andFf12Between(String value1, String value2) {
            addCriterion("FF12 between", value1, value2, "ff12");
            return (Criteria) this;
        }

        public Criteria andFf12NotBetween(String value1, String value2) {
            addCriterion("FF12 not between", value1, value2, "ff12");
            return (Criteria) this;
        }

        public Criteria andFf13IsNull() {
            addCriterion("FF13 is null");
            return (Criteria) this;
        }

        public Criteria andFf13IsNotNull() {
            addCriterion("FF13 is not null");
            return (Criteria) this;
        }

        public Criteria andFf13EqualTo(String value) {
            addCriterion("FF13 =", value, "ff13");
            return (Criteria) this;
        }

        public Criteria andFf13NotEqualTo(String value) {
            addCriterion("FF13 <>", value, "ff13");
            return (Criteria) this;
        }

        public Criteria andFf13GreaterThan(String value) {
            addCriterion("FF13 >", value, "ff13");
            return (Criteria) this;
        }

        public Criteria andFf13GreaterThanOrEqualTo(String value) {
            addCriterion("FF13 >=", value, "ff13");
            return (Criteria) this;
        }

        public Criteria andFf13LessThan(String value) {
            addCriterion("FF13 <", value, "ff13");
            return (Criteria) this;
        }

        public Criteria andFf13LessThanOrEqualTo(String value) {
            addCriterion("FF13 <=", value, "ff13");
            return (Criteria) this;
        }

        public Criteria andFf13Like(String value) {
            addCriterion("FF13 like", value, "ff13");
            return (Criteria) this;
        }

        public Criteria andFf13NotLike(String value) {
            addCriterion("FF13 not like", value, "ff13");
            return (Criteria) this;
        }

        public Criteria andFf13In(List<String> values) {
            addCriterion("FF13 in", values, "ff13");
            return (Criteria) this;
        }

        public Criteria andFf13NotIn(List<String> values) {
            addCriterion("FF13 not in", values, "ff13");
            return (Criteria) this;
        }

        public Criteria andFf13Between(String value1, String value2) {
            addCriterion("FF13 between", value1, value2, "ff13");
            return (Criteria) this;
        }

        public Criteria andFf13NotBetween(String value1, String value2) {
            addCriterion("FF13 not between", value1, value2, "ff13");
            return (Criteria) this;
        }

        public Criteria andFf14IsNull() {
            addCriterion("FF14 is null");
            return (Criteria) this;
        }

        public Criteria andFf14IsNotNull() {
            addCriterion("FF14 is not null");
            return (Criteria) this;
        }

        public Criteria andFf14EqualTo(String value) {
            addCriterion("FF14 =", value, "ff14");
            return (Criteria) this;
        }

        public Criteria andFf14NotEqualTo(String value) {
            addCriterion("FF14 <>", value, "ff14");
            return (Criteria) this;
        }

        public Criteria andFf14GreaterThan(String value) {
            addCriterion("FF14 >", value, "ff14");
            return (Criteria) this;
        }

        public Criteria andFf14GreaterThanOrEqualTo(String value) {
            addCriterion("FF14 >=", value, "ff14");
            return (Criteria) this;
        }

        public Criteria andFf14LessThan(String value) {
            addCriterion("FF14 <", value, "ff14");
            return (Criteria) this;
        }

        public Criteria andFf14LessThanOrEqualTo(String value) {
            addCriterion("FF14 <=", value, "ff14");
            return (Criteria) this;
        }

        public Criteria andFf14Like(String value) {
            addCriterion("FF14 like", value, "ff14");
            return (Criteria) this;
        }

        public Criteria andFf14NotLike(String value) {
            addCriterion("FF14 not like", value, "ff14");
            return (Criteria) this;
        }

        public Criteria andFf14In(List<String> values) {
            addCriterion("FF14 in", values, "ff14");
            return (Criteria) this;
        }

        public Criteria andFf14NotIn(List<String> values) {
            addCriterion("FF14 not in", values, "ff14");
            return (Criteria) this;
        }

        public Criteria andFf14Between(String value1, String value2) {
            addCriterion("FF14 between", value1, value2, "ff14");
            return (Criteria) this;
        }

        public Criteria andFf14NotBetween(String value1, String value2) {
            addCriterion("FF14 not between", value1, value2, "ff14");
            return (Criteria) this;
        }

        public Criteria andFf15IsNull() {
            addCriterion("FF15 is null");
            return (Criteria) this;
        }

        public Criteria andFf15IsNotNull() {
            addCriterion("FF15 is not null");
            return (Criteria) this;
        }

        public Criteria andFf15EqualTo(String value) {
            addCriterion("FF15 =", value, "ff15");
            return (Criteria) this;
        }

        public Criteria andFf15NotEqualTo(String value) {
            addCriterion("FF15 <>", value, "ff15");
            return (Criteria) this;
        }

        public Criteria andFf15GreaterThan(String value) {
            addCriterion("FF15 >", value, "ff15");
            return (Criteria) this;
        }

        public Criteria andFf15GreaterThanOrEqualTo(String value) {
            addCriterion("FF15 >=", value, "ff15");
            return (Criteria) this;
        }

        public Criteria andFf15LessThan(String value) {
            addCriterion("FF15 <", value, "ff15");
            return (Criteria) this;
        }

        public Criteria andFf15LessThanOrEqualTo(String value) {
            addCriterion("FF15 <=", value, "ff15");
            return (Criteria) this;
        }

        public Criteria andFf15Like(String value) {
            addCriterion("FF15 like", value, "ff15");
            return (Criteria) this;
        }

        public Criteria andFf15NotLike(String value) {
            addCriterion("FF15 not like", value, "ff15");
            return (Criteria) this;
        }

        public Criteria andFf15In(List<String> values) {
            addCriterion("FF15 in", values, "ff15");
            return (Criteria) this;
        }

        public Criteria andFf15NotIn(List<String> values) {
            addCriterion("FF15 not in", values, "ff15");
            return (Criteria) this;
        }

        public Criteria andFf15Between(String value1, String value2) {
            addCriterion("FF15 between", value1, value2, "ff15");
            return (Criteria) this;
        }

        public Criteria andFf15NotBetween(String value1, String value2) {
            addCriterion("FF15 not between", value1, value2, "ff15");
            return (Criteria) this;
        }

        public Criteria andFf16IsNull() {
            addCriterion("FF16 is null");
            return (Criteria) this;
        }

        public Criteria andFf16IsNotNull() {
            addCriterion("FF16 is not null");
            return (Criteria) this;
        }

        public Criteria andFf16EqualTo(String value) {
            addCriterion("FF16 =", value, "ff16");
            return (Criteria) this;
        }

        public Criteria andFf16NotEqualTo(String value) {
            addCriterion("FF16 <>", value, "ff16");
            return (Criteria) this;
        }

        public Criteria andFf16GreaterThan(String value) {
            addCriterion("FF16 >", value, "ff16");
            return (Criteria) this;
        }

        public Criteria andFf16GreaterThanOrEqualTo(String value) {
            addCriterion("FF16 >=", value, "ff16");
            return (Criteria) this;
        }

        public Criteria andFf16LessThan(String value) {
            addCriterion("FF16 <", value, "ff16");
            return (Criteria) this;
        }

        public Criteria andFf16LessThanOrEqualTo(String value) {
            addCriterion("FF16 <=", value, "ff16");
            return (Criteria) this;
        }

        public Criteria andFf16Like(String value) {
            addCriterion("FF16 like", value, "ff16");
            return (Criteria) this;
        }

        public Criteria andFf16NotLike(String value) {
            addCriterion("FF16 not like", value, "ff16");
            return (Criteria) this;
        }

        public Criteria andFf16In(List<String> values) {
            addCriterion("FF16 in", values, "ff16");
            return (Criteria) this;
        }

        public Criteria andFf16NotIn(List<String> values) {
            addCriterion("FF16 not in", values, "ff16");
            return (Criteria) this;
        }

        public Criteria andFf16Between(String value1, String value2) {
            addCriterion("FF16 between", value1, value2, "ff16");
            return (Criteria) this;
        }

        public Criteria andFf16NotBetween(String value1, String value2) {
            addCriterion("FF16 not between", value1, value2, "ff16");
            return (Criteria) this;
        }

        public Criteria andFf17IsNull() {
            addCriterion("FF17 is null");
            return (Criteria) this;
        }

        public Criteria andFf17IsNotNull() {
            addCriterion("FF17 is not null");
            return (Criteria) this;
        }

        public Criteria andFf17EqualTo(String value) {
            addCriterion("FF17 =", value, "ff17");
            return (Criteria) this;
        }

        public Criteria andFf17NotEqualTo(String value) {
            addCriterion("FF17 <>", value, "ff17");
            return (Criteria) this;
        }

        public Criteria andFf17GreaterThan(String value) {
            addCriterion("FF17 >", value, "ff17");
            return (Criteria) this;
        }

        public Criteria andFf17GreaterThanOrEqualTo(String value) {
            addCriterion("FF17 >=", value, "ff17");
            return (Criteria) this;
        }

        public Criteria andFf17LessThan(String value) {
            addCriterion("FF17 <", value, "ff17");
            return (Criteria) this;
        }

        public Criteria andFf17LessThanOrEqualTo(String value) {
            addCriterion("FF17 <=", value, "ff17");
            return (Criteria) this;
        }

        public Criteria andFf17Like(String value) {
            addCriterion("FF17 like", value, "ff17");
            return (Criteria) this;
        }

        public Criteria andFf17NotLike(String value) {
            addCriterion("FF17 not like", value, "ff17");
            return (Criteria) this;
        }

        public Criteria andFf17In(List<String> values) {
            addCriterion("FF17 in", values, "ff17");
            return (Criteria) this;
        }

        public Criteria andFf17NotIn(List<String> values) {
            addCriterion("FF17 not in", values, "ff17");
            return (Criteria) this;
        }

        public Criteria andFf17Between(String value1, String value2) {
            addCriterion("FF17 between", value1, value2, "ff17");
            return (Criteria) this;
        }

        public Criteria andFf17NotBetween(String value1, String value2) {
            addCriterion("FF17 not between", value1, value2, "ff17");
            return (Criteria) this;
        }

        public Criteria andFf18IsNull() {
            addCriterion("FF18 is null");
            return (Criteria) this;
        }

        public Criteria andFf18IsNotNull() {
            addCriterion("FF18 is not null");
            return (Criteria) this;
        }

        public Criteria andFf18EqualTo(String value) {
            addCriterion("FF18 =", value, "ff18");
            return (Criteria) this;
        }

        public Criteria andFf18NotEqualTo(String value) {
            addCriterion("FF18 <>", value, "ff18");
            return (Criteria) this;
        }

        public Criteria andFf18GreaterThan(String value) {
            addCriterion("FF18 >", value, "ff18");
            return (Criteria) this;
        }

        public Criteria andFf18GreaterThanOrEqualTo(String value) {
            addCriterion("FF18 >=", value, "ff18");
            return (Criteria) this;
        }

        public Criteria andFf18LessThan(String value) {
            addCriterion("FF18 <", value, "ff18");
            return (Criteria) this;
        }

        public Criteria andFf18LessThanOrEqualTo(String value) {
            addCriterion("FF18 <=", value, "ff18");
            return (Criteria) this;
        }

        public Criteria andFf18Like(String value) {
            addCriterion("FF18 like", value, "ff18");
            return (Criteria) this;
        }

        public Criteria andFf18NotLike(String value) {
            addCriterion("FF18 not like", value, "ff18");
            return (Criteria) this;
        }

        public Criteria andFf18In(List<String> values) {
            addCriterion("FF18 in", values, "ff18");
            return (Criteria) this;
        }

        public Criteria andFf18NotIn(List<String> values) {
            addCriterion("FF18 not in", values, "ff18");
            return (Criteria) this;
        }

        public Criteria andFf18Between(String value1, String value2) {
            addCriterion("FF18 between", value1, value2, "ff18");
            return (Criteria) this;
        }

        public Criteria andFf18NotBetween(String value1, String value2) {
            addCriterion("FF18 not between", value1, value2, "ff18");
            return (Criteria) this;
        }

        public Criteria andFf19IsNull() {
            addCriterion("FF19 is null");
            return (Criteria) this;
        }

        public Criteria andFf19IsNotNull() {
            addCriterion("FF19 is not null");
            return (Criteria) this;
        }

        public Criteria andFf19EqualTo(String value) {
            addCriterion("FF19 =", value, "ff19");
            return (Criteria) this;
        }

        public Criteria andFf19NotEqualTo(String value) {
            addCriterion("FF19 <>", value, "ff19");
            return (Criteria) this;
        }

        public Criteria andFf19GreaterThan(String value) {
            addCriterion("FF19 >", value, "ff19");
            return (Criteria) this;
        }

        public Criteria andFf19GreaterThanOrEqualTo(String value) {
            addCriterion("FF19 >=", value, "ff19");
            return (Criteria) this;
        }

        public Criteria andFf19LessThan(String value) {
            addCriterion("FF19 <", value, "ff19");
            return (Criteria) this;
        }

        public Criteria andFf19LessThanOrEqualTo(String value) {
            addCriterion("FF19 <=", value, "ff19");
            return (Criteria) this;
        }

        public Criteria andFf19Like(String value) {
            addCriterion("FF19 like", value, "ff19");
            return (Criteria) this;
        }

        public Criteria andFf19NotLike(String value) {
            addCriterion("FF19 not like", value, "ff19");
            return (Criteria) this;
        }

        public Criteria andFf19In(List<String> values) {
            addCriterion("FF19 in", values, "ff19");
            return (Criteria) this;
        }

        public Criteria andFf19NotIn(List<String> values) {
            addCriterion("FF19 not in", values, "ff19");
            return (Criteria) this;
        }

        public Criteria andFf19Between(String value1, String value2) {
            addCriterion("FF19 between", value1, value2, "ff19");
            return (Criteria) this;
        }

        public Criteria andFf19NotBetween(String value1, String value2) {
            addCriterion("FF19 not between", value1, value2, "ff19");
            return (Criteria) this;
        }

        public Criteria andFf20IsNull() {
            addCriterion("FF20 is null");
            return (Criteria) this;
        }

        public Criteria andFf20IsNotNull() {
            addCriterion("FF20 is not null");
            return (Criteria) this;
        }

        public Criteria andFf20EqualTo(String value) {
            addCriterion("FF20 =", value, "ff20");
            return (Criteria) this;
        }

        public Criteria andFf20NotEqualTo(String value) {
            addCriterion("FF20 <>", value, "ff20");
            return (Criteria) this;
        }

        public Criteria andFf20GreaterThan(String value) {
            addCriterion("FF20 >", value, "ff20");
            return (Criteria) this;
        }

        public Criteria andFf20GreaterThanOrEqualTo(String value) {
            addCriterion("FF20 >=", value, "ff20");
            return (Criteria) this;
        }

        public Criteria andFf20LessThan(String value) {
            addCriterion("FF20 <", value, "ff20");
            return (Criteria) this;
        }

        public Criteria andFf20LessThanOrEqualTo(String value) {
            addCriterion("FF20 <=", value, "ff20");
            return (Criteria) this;
        }

        public Criteria andFf20Like(String value) {
            addCriterion("FF20 like", value, "ff20");
            return (Criteria) this;
        }

        public Criteria andFf20NotLike(String value) {
            addCriterion("FF20 not like", value, "ff20");
            return (Criteria) this;
        }

        public Criteria andFf20In(List<String> values) {
            addCriterion("FF20 in", values, "ff20");
            return (Criteria) this;
        }

        public Criteria andFf20NotIn(List<String> values) {
            addCriterion("FF20 not in", values, "ff20");
            return (Criteria) this;
        }

        public Criteria andFf20Between(String value1, String value2) {
            addCriterion("FF20 between", value1, value2, "ff20");
            return (Criteria) this;
        }

        public Criteria andFf20NotBetween(String value1, String value2) {
            addCriterion("FF20 not between", value1, value2, "ff20");
            return (Criteria) this;
        }

        public Criteria andFf21IsNull() {
            addCriterion("FF21 is null");
            return (Criteria) this;
        }

        public Criteria andFf21IsNotNull() {
            addCriterion("FF21 is not null");
            return (Criteria) this;
        }

        public Criteria andFf21EqualTo(String value) {
            addCriterion("FF21 =", value, "ff21");
            return (Criteria) this;
        }

        public Criteria andFf21NotEqualTo(String value) {
            addCriterion("FF21 <>", value, "ff21");
            return (Criteria) this;
        }

        public Criteria andFf21GreaterThan(String value) {
            addCriterion("FF21 >", value, "ff21");
            return (Criteria) this;
        }

        public Criteria andFf21GreaterThanOrEqualTo(String value) {
            addCriterion("FF21 >=", value, "ff21");
            return (Criteria) this;
        }

        public Criteria andFf21LessThan(String value) {
            addCriterion("FF21 <", value, "ff21");
            return (Criteria) this;
        }

        public Criteria andFf21LessThanOrEqualTo(String value) {
            addCriterion("FF21 <=", value, "ff21");
            return (Criteria) this;
        }

        public Criteria andFf21Like(String value) {
            addCriterion("FF21 like", value, "ff21");
            return (Criteria) this;
        }

        public Criteria andFf21NotLike(String value) {
            addCriterion("FF21 not like", value, "ff21");
            return (Criteria) this;
        }

        public Criteria andFf21In(List<String> values) {
            addCriterion("FF21 in", values, "ff21");
            return (Criteria) this;
        }

        public Criteria andFf21NotIn(List<String> values) {
            addCriterion("FF21 not in", values, "ff21");
            return (Criteria) this;
        }

        public Criteria andFf21Between(String value1, String value2) {
            addCriterion("FF21 between", value1, value2, "ff21");
            return (Criteria) this;
        }

        public Criteria andFf21NotBetween(String value1, String value2) {
            addCriterion("FF21 not between", value1, value2, "ff21");
            return (Criteria) this;
        }

        public Criteria andFf22IsNull() {
            addCriterion("FF22 is null");
            return (Criteria) this;
        }

        public Criteria andFf22IsNotNull() {
            addCriterion("FF22 is not null");
            return (Criteria) this;
        }

        public Criteria andFf22EqualTo(String value) {
            addCriterion("FF22 =", value, "ff22");
            return (Criteria) this;
        }

        public Criteria andFf22NotEqualTo(String value) {
            addCriterion("FF22 <>", value, "ff22");
            return (Criteria) this;
        }

        public Criteria andFf22GreaterThan(String value) {
            addCriterion("FF22 >", value, "ff22");
            return (Criteria) this;
        }

        public Criteria andFf22GreaterThanOrEqualTo(String value) {
            addCriterion("FF22 >=", value, "ff22");
            return (Criteria) this;
        }

        public Criteria andFf22LessThan(String value) {
            addCriterion("FF22 <", value, "ff22");
            return (Criteria) this;
        }

        public Criteria andFf22LessThanOrEqualTo(String value) {
            addCriterion("FF22 <=", value, "ff22");
            return (Criteria) this;
        }

        public Criteria andFf22Like(String value) {
            addCriterion("FF22 like", value, "ff22");
            return (Criteria) this;
        }

        public Criteria andFf22NotLike(String value) {
            addCriterion("FF22 not like", value, "ff22");
            return (Criteria) this;
        }

        public Criteria andFf22In(List<String> values) {
            addCriterion("FF22 in", values, "ff22");
            return (Criteria) this;
        }

        public Criteria andFf22NotIn(List<String> values) {
            addCriterion("FF22 not in", values, "ff22");
            return (Criteria) this;
        }

        public Criteria andFf22Between(String value1, String value2) {
            addCriterion("FF22 between", value1, value2, "ff22");
            return (Criteria) this;
        }

        public Criteria andFf22NotBetween(String value1, String value2) {
            addCriterion("FF22 not between", value1, value2, "ff22");
            return (Criteria) this;
        }

        public Criteria andFf23IsNull() {
            addCriterion("FF23 is null");
            return (Criteria) this;
        }

        public Criteria andFf23IsNotNull() {
            addCriterion("FF23 is not null");
            return (Criteria) this;
        }

        public Criteria andFf23EqualTo(String value) {
            addCriterion("FF23 =", value, "ff23");
            return (Criteria) this;
        }

        public Criteria andFf23NotEqualTo(String value) {
            addCriterion("FF23 <>", value, "ff23");
            return (Criteria) this;
        }

        public Criteria andFf23GreaterThan(String value) {
            addCriterion("FF23 >", value, "ff23");
            return (Criteria) this;
        }

        public Criteria andFf23GreaterThanOrEqualTo(String value) {
            addCriterion("FF23 >=", value, "ff23");
            return (Criteria) this;
        }

        public Criteria andFf23LessThan(String value) {
            addCriterion("FF23 <", value, "ff23");
            return (Criteria) this;
        }

        public Criteria andFf23LessThanOrEqualTo(String value) {
            addCriterion("FF23 <=", value, "ff23");
            return (Criteria) this;
        }

        public Criteria andFf23Like(String value) {
            addCriterion("FF23 like", value, "ff23");
            return (Criteria) this;
        }

        public Criteria andFf23NotLike(String value) {
            addCriterion("FF23 not like", value, "ff23");
            return (Criteria) this;
        }

        public Criteria andFf23In(List<String> values) {
            addCriterion("FF23 in", values, "ff23");
            return (Criteria) this;
        }

        public Criteria andFf23NotIn(List<String> values) {
            addCriterion("FF23 not in", values, "ff23");
            return (Criteria) this;
        }

        public Criteria andFf23Between(String value1, String value2) {
            addCriterion("FF23 between", value1, value2, "ff23");
            return (Criteria) this;
        }

        public Criteria andFf23NotBetween(String value1, String value2) {
            addCriterion("FF23 not between", value1, value2, "ff23");
            return (Criteria) this;
        }

        public Criteria andFf24IsNull() {
            addCriterion("FF24 is null");
            return (Criteria) this;
        }

        public Criteria andFf24IsNotNull() {
            addCriterion("FF24 is not null");
            return (Criteria) this;
        }

        public Criteria andFf24EqualTo(Integer value) {
            addCriterion("FF24 =", value, "ff24");
            return (Criteria) this;
        }

        public Criteria andFf24NotEqualTo(Integer value) {
            addCriterion("FF24 <>", value, "ff24");
            return (Criteria) this;
        }

        public Criteria andFf24GreaterThan(Integer value) {
            addCriterion("FF24 >", value, "ff24");
            return (Criteria) this;
        }

        public Criteria andFf24GreaterThanOrEqualTo(Integer value) {
            addCriterion("FF24 >=", value, "ff24");
            return (Criteria) this;
        }

        public Criteria andFf24LessThan(Integer value) {
            addCriterion("FF24 <", value, "ff24");
            return (Criteria) this;
        }

        public Criteria andFf24LessThanOrEqualTo(Integer value) {
            addCriterion("FF24 <=", value, "ff24");
            return (Criteria) this;
        }

        public Criteria andFf24In(List<Integer> values) {
            addCriterion("FF24 in", values, "ff24");
            return (Criteria) this;
        }

        public Criteria andFf24NotIn(List<Integer> values) {
            addCriterion("FF24 not in", values, "ff24");
            return (Criteria) this;
        }

        public Criteria andFf24Between(Integer value1, Integer value2) {
            addCriterion("FF24 between", value1, value2, "ff24");
            return (Criteria) this;
        }

        public Criteria andFf24NotBetween(Integer value1, Integer value2) {
            addCriterion("FF24 not between", value1, value2, "ff24");
            return (Criteria) this;
        }

        public Criteria andFf25IsNull() {
            addCriterion("FF25 is null");
            return (Criteria) this;
        }

        public Criteria andFf25IsNotNull() {
            addCriterion("FF25 is not null");
            return (Criteria) this;
        }

        public Criteria andFf25EqualTo(Integer value) {
            addCriterion("FF25 =", value, "ff25");
            return (Criteria) this;
        }

        public Criteria andFf25NotEqualTo(Integer value) {
            addCriterion("FF25 <>", value, "ff25");
            return (Criteria) this;
        }

        public Criteria andFf25GreaterThan(Integer value) {
            addCriterion("FF25 >", value, "ff25");
            return (Criteria) this;
        }

        public Criteria andFf25GreaterThanOrEqualTo(Integer value) {
            addCriterion("FF25 >=", value, "ff25");
            return (Criteria) this;
        }

        public Criteria andFf25LessThan(Integer value) {
            addCriterion("FF25 <", value, "ff25");
            return (Criteria) this;
        }

        public Criteria andFf25LessThanOrEqualTo(Integer value) {
            addCriterion("FF25 <=", value, "ff25");
            return (Criteria) this;
        }

        public Criteria andFf25In(List<Integer> values) {
            addCriterion("FF25 in", values, "ff25");
            return (Criteria) this;
        }

        public Criteria andFf25NotIn(List<Integer> values) {
            addCriterion("FF25 not in", values, "ff25");
            return (Criteria) this;
        }

        public Criteria andFf25Between(Integer value1, Integer value2) {
            addCriterion("FF25 between", value1, value2, "ff25");
            return (Criteria) this;
        }

        public Criteria andFf25NotBetween(Integer value1, Integer value2) {
            addCriterion("FF25 not between", value1, value2, "ff25");
            return (Criteria) this;
        }

        public Criteria andFf26IsNull() {
            addCriterion("FF26 is null");
            return (Criteria) this;
        }

        public Criteria andFf26IsNotNull() {
            addCriterion("FF26 is not null");
            return (Criteria) this;
        }

        public Criteria andFf26EqualTo(String value) {
            addCriterion("FF26 =", value, "ff26");
            return (Criteria) this;
        }

        public Criteria andFf26NotEqualTo(String value) {
            addCriterion("FF26 <>", value, "ff26");
            return (Criteria) this;
        }

        public Criteria andFf26GreaterThan(String value) {
            addCriterion("FF26 >", value, "ff26");
            return (Criteria) this;
        }

        public Criteria andFf26GreaterThanOrEqualTo(String value) {
            addCriterion("FF26 >=", value, "ff26");
            return (Criteria) this;
        }

        public Criteria andFf26LessThan(String value) {
            addCriterion("FF26 <", value, "ff26");
            return (Criteria) this;
        }

        public Criteria andFf26LessThanOrEqualTo(String value) {
            addCriterion("FF26 <=", value, "ff26");
            return (Criteria) this;
        }

        public Criteria andFf26Like(String value) {
            addCriterion("FF26 like", value, "ff26");
            return (Criteria) this;
        }

        public Criteria andFf26NotLike(String value) {
            addCriterion("FF26 not like", value, "ff26");
            return (Criteria) this;
        }

        public Criteria andFf26In(List<String> values) {
            addCriterion("FF26 in", values, "ff26");
            return (Criteria) this;
        }

        public Criteria andFf26NotIn(List<String> values) {
            addCriterion("FF26 not in", values, "ff26");
            return (Criteria) this;
        }

        public Criteria andFf26Between(String value1, String value2) {
            addCriterion("FF26 between", value1, value2, "ff26");
            return (Criteria) this;
        }

        public Criteria andFf26NotBetween(String value1, String value2) {
            addCriterion("FF26 not between", value1, value2, "ff26");
            return (Criteria) this;
        }

        public Criteria andFf27IsNull() {
            addCriterion("FF27 is null");
            return (Criteria) this;
        }

        public Criteria andFf27IsNotNull() {
            addCriterion("FF27 is not null");
            return (Criteria) this;
        }

        public Criteria andFf27EqualTo(Short value) {
            addCriterion("FF27 =", value, "ff27");
            return (Criteria) this;
        }

        public Criteria andFf27NotEqualTo(Short value) {
            addCriterion("FF27 <>", value, "ff27");
            return (Criteria) this;
        }

        public Criteria andFf27GreaterThan(Short value) {
            addCriterion("FF27 >", value, "ff27");
            return (Criteria) this;
        }

        public Criteria andFf27GreaterThanOrEqualTo(Short value) {
            addCriterion("FF27 >=", value, "ff27");
            return (Criteria) this;
        }

        public Criteria andFf27LessThan(Short value) {
            addCriterion("FF27 <", value, "ff27");
            return (Criteria) this;
        }

        public Criteria andFf27LessThanOrEqualTo(Short value) {
            addCriterion("FF27 <=", value, "ff27");
            return (Criteria) this;
        }

        public Criteria andFf27In(List<Short> values) {
            addCriterion("FF27 in", values, "ff27");
            return (Criteria) this;
        }

        public Criteria andFf27NotIn(List<Short> values) {
            addCriterion("FF27 not in", values, "ff27");
            return (Criteria) this;
        }

        public Criteria andFf27Between(Short value1, Short value2) {
            addCriterion("FF27 between", value1, value2, "ff27");
            return (Criteria) this;
        }

        public Criteria andFf27NotBetween(Short value1, Short value2) {
            addCriterion("FF27 not between", value1, value2, "ff27");
            return (Criteria) this;
        }

        public Criteria andFf28IsNull() {
            addCriterion("FF28 is null");
            return (Criteria) this;
        }

        public Criteria andFf28IsNotNull() {
            addCriterion("FF28 is not null");
            return (Criteria) this;
        }

        public Criteria andFf28EqualTo(String value) {
            addCriterion("FF28 =", value, "ff28");
            return (Criteria) this;
        }

        public Criteria andFf28NotEqualTo(String value) {
            addCriterion("FF28 <>", value, "ff28");
            return (Criteria) this;
        }

        public Criteria andFf28GreaterThan(String value) {
            addCriterion("FF28 >", value, "ff28");
            return (Criteria) this;
        }

        public Criteria andFf28GreaterThanOrEqualTo(String value) {
            addCriterion("FF28 >=", value, "ff28");
            return (Criteria) this;
        }

        public Criteria andFf28LessThan(String value) {
            addCriterion("FF28 <", value, "ff28");
            return (Criteria) this;
        }

        public Criteria andFf28LessThanOrEqualTo(String value) {
            addCriterion("FF28 <=", value, "ff28");
            return (Criteria) this;
        }

        public Criteria andFf28Like(String value) {
            addCriterion("FF28 like", value, "ff28");
            return (Criteria) this;
        }

        public Criteria andFf28NotLike(String value) {
            addCriterion("FF28 not like", value, "ff28");
            return (Criteria) this;
        }

        public Criteria andFf28In(List<String> values) {
            addCriterion("FF28 in", values, "ff28");
            return (Criteria) this;
        }

        public Criteria andFf28NotIn(List<String> values) {
            addCriterion("FF28 not in", values, "ff28");
            return (Criteria) this;
        }

        public Criteria andFf28Between(String value1, String value2) {
            addCriterion("FF28 between", value1, value2, "ff28");
            return (Criteria) this;
        }

        public Criteria andFf28NotBetween(String value1, String value2) {
            addCriterion("FF28 not between", value1, value2, "ff28");
            return (Criteria) this;
        }

        public Criteria andFf29IsNull() {
            addCriterion("FF29 is null");
            return (Criteria) this;
        }

        public Criteria andFf29IsNotNull() {
            addCriterion("FF29 is not null");
            return (Criteria) this;
        }

        public Criteria andFf29EqualTo(String value) {
            addCriterion("FF29 =", value, "ff29");
            return (Criteria) this;
        }

        public Criteria andFf29NotEqualTo(String value) {
            addCriterion("FF29 <>", value, "ff29");
            return (Criteria) this;
        }

        public Criteria andFf29GreaterThan(String value) {
            addCriterion("FF29 >", value, "ff29");
            return (Criteria) this;
        }

        public Criteria andFf29GreaterThanOrEqualTo(String value) {
            addCriterion("FF29 >=", value, "ff29");
            return (Criteria) this;
        }

        public Criteria andFf29LessThan(String value) {
            addCriterion("FF29 <", value, "ff29");
            return (Criteria) this;
        }

        public Criteria andFf29LessThanOrEqualTo(String value) {
            addCriterion("FF29 <=", value, "ff29");
            return (Criteria) this;
        }

        public Criteria andFf29Like(String value) {
            addCriterion("FF29 like", value, "ff29");
            return (Criteria) this;
        }

        public Criteria andFf29NotLike(String value) {
            addCriterion("FF29 not like", value, "ff29");
            return (Criteria) this;
        }

        public Criteria andFf29In(List<String> values) {
            addCriterion("FF29 in", values, "ff29");
            return (Criteria) this;
        }

        public Criteria andFf29NotIn(List<String> values) {
            addCriterion("FF29 not in", values, "ff29");
            return (Criteria) this;
        }

        public Criteria andFf29Between(String value1, String value2) {
            addCriterion("FF29 between", value1, value2, "ff29");
            return (Criteria) this;
        }

        public Criteria andFf29NotBetween(String value1, String value2) {
            addCriterion("FF29 not between", value1, value2, "ff29");
            return (Criteria) this;
        }

        public Criteria andFf30IsNull() {
            addCriterion("FF30 is null");
            return (Criteria) this;
        }

        public Criteria andFf30IsNotNull() {
            addCriterion("FF30 is not null");
            return (Criteria) this;
        }

        public Criteria andFf30EqualTo(String value) {
            addCriterion("FF30 =", value, "ff30");
            return (Criteria) this;
        }

        public Criteria andFf30NotEqualTo(String value) {
            addCriterion("FF30 <>", value, "ff30");
            return (Criteria) this;
        }

        public Criteria andFf30GreaterThan(String value) {
            addCriterion("FF30 >", value, "ff30");
            return (Criteria) this;
        }

        public Criteria andFf30GreaterThanOrEqualTo(String value) {
            addCriterion("FF30 >=", value, "ff30");
            return (Criteria) this;
        }

        public Criteria andFf30LessThan(String value) {
            addCriterion("FF30 <", value, "ff30");
            return (Criteria) this;
        }

        public Criteria andFf30LessThanOrEqualTo(String value) {
            addCriterion("FF30 <=", value, "ff30");
            return (Criteria) this;
        }

        public Criteria andFf30Like(String value) {
            addCriterion("FF30 like", value, "ff30");
            return (Criteria) this;
        }

        public Criteria andFf30NotLike(String value) {
            addCriterion("FF30 not like", value, "ff30");
            return (Criteria) this;
        }

        public Criteria andFf30In(List<String> values) {
            addCriterion("FF30 in", values, "ff30");
            return (Criteria) this;
        }

        public Criteria andFf30NotIn(List<String> values) {
            addCriterion("FF30 not in", values, "ff30");
            return (Criteria) this;
        }

        public Criteria andFf30Between(String value1, String value2) {
            addCriterion("FF30 between", value1, value2, "ff30");
            return (Criteria) this;
        }

        public Criteria andFf30NotBetween(String value1, String value2) {
            addCriterion("FF30 not between", value1, value2, "ff30");
            return (Criteria) this;
        }

        public Criteria andFf31IsNull() {
            addCriterion("FF31 is null");
            return (Criteria) this;
        }

        public Criteria andFf31IsNotNull() {
            addCriterion("FF31 is not null");
            return (Criteria) this;
        }

        public Criteria andFf31EqualTo(String value) {
            addCriterion("FF31 =", value, "ff31");
            return (Criteria) this;
        }

        public Criteria andFf31NotEqualTo(String value) {
            addCriterion("FF31 <>", value, "ff31");
            return (Criteria) this;
        }

        public Criteria andFf31GreaterThan(String value) {
            addCriterion("FF31 >", value, "ff31");
            return (Criteria) this;
        }

        public Criteria andFf31GreaterThanOrEqualTo(String value) {
            addCriterion("FF31 >=", value, "ff31");
            return (Criteria) this;
        }

        public Criteria andFf31LessThan(String value) {
            addCriterion("FF31 <", value, "ff31");
            return (Criteria) this;
        }

        public Criteria andFf31LessThanOrEqualTo(String value) {
            addCriterion("FF31 <=", value, "ff31");
            return (Criteria) this;
        }

        public Criteria andFf31Like(String value) {
            addCriterion("FF31 like", value, "ff31");
            return (Criteria) this;
        }

        public Criteria andFf31NotLike(String value) {
            addCriterion("FF31 not like", value, "ff31");
            return (Criteria) this;
        }

        public Criteria andFf31In(List<String> values) {
            addCriterion("FF31 in", values, "ff31");
            return (Criteria) this;
        }

        public Criteria andFf31NotIn(List<String> values) {
            addCriterion("FF31 not in", values, "ff31");
            return (Criteria) this;
        }

        public Criteria andFf31Between(String value1, String value2) {
            addCriterion("FF31 between", value1, value2, "ff31");
            return (Criteria) this;
        }

        public Criteria andFf31NotBetween(String value1, String value2) {
            addCriterion("FF31 not between", value1, value2, "ff31");
            return (Criteria) this;
        }

        public Criteria andFf32IsNull() {
            addCriterion("FF32 is null");
            return (Criteria) this;
        }

        public Criteria andFf32IsNotNull() {
            addCriterion("FF32 is not null");
            return (Criteria) this;
        }

        public Criteria andFf32EqualTo(String value) {
            addCriterion("FF32 =", value, "ff32");
            return (Criteria) this;
        }

        public Criteria andFf32NotEqualTo(String value) {
            addCriterion("FF32 <>", value, "ff32");
            return (Criteria) this;
        }

        public Criteria andFf32GreaterThan(String value) {
            addCriterion("FF32 >", value, "ff32");
            return (Criteria) this;
        }

        public Criteria andFf32GreaterThanOrEqualTo(String value) {
            addCriterion("FF32 >=", value, "ff32");
            return (Criteria) this;
        }

        public Criteria andFf32LessThan(String value) {
            addCriterion("FF32 <", value, "ff32");
            return (Criteria) this;
        }

        public Criteria andFf32LessThanOrEqualTo(String value) {
            addCriterion("FF32 <=", value, "ff32");
            return (Criteria) this;
        }

        public Criteria andFf32Like(String value) {
            addCriterion("FF32 like", value, "ff32");
            return (Criteria) this;
        }

        public Criteria andFf32NotLike(String value) {
            addCriterion("FF32 not like", value, "ff32");
            return (Criteria) this;
        }

        public Criteria andFf32In(List<String> values) {
            addCriterion("FF32 in", values, "ff32");
            return (Criteria) this;
        }

        public Criteria andFf32NotIn(List<String> values) {
            addCriterion("FF32 not in", values, "ff32");
            return (Criteria) this;
        }

        public Criteria andFf32Between(String value1, String value2) {
            addCriterion("FF32 between", value1, value2, "ff32");
            return (Criteria) this;
        }

        public Criteria andFf32NotBetween(String value1, String value2) {
            addCriterion("FF32 not between", value1, value2, "ff32");
            return (Criteria) this;
        }

        public Criteria andFf33IsNull() {
            addCriterion("FF33 is null");
            return (Criteria) this;
        }

        public Criteria andFf33IsNotNull() {
            addCriterion("FF33 is not null");
            return (Criteria) this;
        }

        public Criteria andFf33EqualTo(String value) {
            addCriterion("FF33 =", value, "ff33");
            return (Criteria) this;
        }

        public Criteria andFf33NotEqualTo(String value) {
            addCriterion("FF33 <>", value, "ff33");
            return (Criteria) this;
        }

        public Criteria andFf33GreaterThan(String value) {
            addCriterion("FF33 >", value, "ff33");
            return (Criteria) this;
        }

        public Criteria andFf33GreaterThanOrEqualTo(String value) {
            addCriterion("FF33 >=", value, "ff33");
            return (Criteria) this;
        }

        public Criteria andFf33LessThan(String value) {
            addCriterion("FF33 <", value, "ff33");
            return (Criteria) this;
        }

        public Criteria andFf33LessThanOrEqualTo(String value) {
            addCriterion("FF33 <=", value, "ff33");
            return (Criteria) this;
        }

        public Criteria andFf33Like(String value) {
            addCriterion("FF33 like", value, "ff33");
            return (Criteria) this;
        }

        public Criteria andFf33NotLike(String value) {
            addCriterion("FF33 not like", value, "ff33");
            return (Criteria) this;
        }

        public Criteria andFf33In(List<String> values) {
            addCriterion("FF33 in", values, "ff33");
            return (Criteria) this;
        }

        public Criteria andFf33NotIn(List<String> values) {
            addCriterion("FF33 not in", values, "ff33");
            return (Criteria) this;
        }

        public Criteria andFf33Between(String value1, String value2) {
            addCriterion("FF33 between", value1, value2, "ff33");
            return (Criteria) this;
        }

        public Criteria andFf33NotBetween(String value1, String value2) {
            addCriterion("FF33 not between", value1, value2, "ff33");
            return (Criteria) this;
        }

        public Criteria andFf34IsNull() {
            addCriterion("FF34 is null");
            return (Criteria) this;
        }

        public Criteria andFf34IsNotNull() {
            addCriterion("FF34 is not null");
            return (Criteria) this;
        }

        public Criteria andFf34EqualTo(String value) {
            addCriterion("FF34 =", value, "ff34");
            return (Criteria) this;
        }

        public Criteria andFf34NotEqualTo(String value) {
            addCriterion("FF34 <>", value, "ff34");
            return (Criteria) this;
        }

        public Criteria andFf34GreaterThan(String value) {
            addCriterion("FF34 >", value, "ff34");
            return (Criteria) this;
        }

        public Criteria andFf34GreaterThanOrEqualTo(String value) {
            addCriterion("FF34 >=", value, "ff34");
            return (Criteria) this;
        }

        public Criteria andFf34LessThan(String value) {
            addCriterion("FF34 <", value, "ff34");
            return (Criteria) this;
        }

        public Criteria andFf34LessThanOrEqualTo(String value) {
            addCriterion("FF34 <=", value, "ff34");
            return (Criteria) this;
        }

        public Criteria andFf34Like(String value) {
            addCriterion("FF34 like", value, "ff34");
            return (Criteria) this;
        }

        public Criteria andFf34NotLike(String value) {
            addCriterion("FF34 not like", value, "ff34");
            return (Criteria) this;
        }

        public Criteria andFf34In(List<String> values) {
            addCriterion("FF34 in", values, "ff34");
            return (Criteria) this;
        }

        public Criteria andFf34NotIn(List<String> values) {
            addCriterion("FF34 not in", values, "ff34");
            return (Criteria) this;
        }

        public Criteria andFf34Between(String value1, String value2) {
            addCriterion("FF34 between", value1, value2, "ff34");
            return (Criteria) this;
        }

        public Criteria andFf34NotBetween(String value1, String value2) {
            addCriterion("FF34 not between", value1, value2, "ff34");
            return (Criteria) this;
        }

        public Criteria andFf35IsNull() {
            addCriterion("FF35 is null");
            return (Criteria) this;
        }

        public Criteria andFf35IsNotNull() {
            addCriterion("FF35 is not null");
            return (Criteria) this;
        }

        public Criteria andFf35EqualTo(String value) {
            addCriterion("FF35 =", value, "ff35");
            return (Criteria) this;
        }

        public Criteria andFf35NotEqualTo(String value) {
            addCriterion("FF35 <>", value, "ff35");
            return (Criteria) this;
        }

        public Criteria andFf35GreaterThan(String value) {
            addCriterion("FF35 >", value, "ff35");
            return (Criteria) this;
        }

        public Criteria andFf35GreaterThanOrEqualTo(String value) {
            addCriterion("FF35 >=", value, "ff35");
            return (Criteria) this;
        }

        public Criteria andFf35LessThan(String value) {
            addCriterion("FF35 <", value, "ff35");
            return (Criteria) this;
        }

        public Criteria andFf35LessThanOrEqualTo(String value) {
            addCriterion("FF35 <=", value, "ff35");
            return (Criteria) this;
        }

        public Criteria andFf35Like(String value) {
            addCriterion("FF35 like", value, "ff35");
            return (Criteria) this;
        }

        public Criteria andFf35NotLike(String value) {
            addCriterion("FF35 not like", value, "ff35");
            return (Criteria) this;
        }

        public Criteria andFf35In(List<String> values) {
            addCriterion("FF35 in", values, "ff35");
            return (Criteria) this;
        }

        public Criteria andFf35NotIn(List<String> values) {
            addCriterion("FF35 not in", values, "ff35");
            return (Criteria) this;
        }

        public Criteria andFf35Between(String value1, String value2) {
            addCriterion("FF35 between", value1, value2, "ff35");
            return (Criteria) this;
        }

        public Criteria andFf35NotBetween(String value1, String value2) {
            addCriterion("FF35 not between", value1, value2, "ff35");
            return (Criteria) this;
        }

        public Criteria andFf36IsNull() {
            addCriterion("FF36 is null");
            return (Criteria) this;
        }

        public Criteria andFf36IsNotNull() {
            addCriterion("FF36 is not null");
            return (Criteria) this;
        }

        public Criteria andFf36EqualTo(String value) {
            addCriterion("FF36 =", value, "ff36");
            return (Criteria) this;
        }

        public Criteria andFf36NotEqualTo(String value) {
            addCriterion("FF36 <>", value, "ff36");
            return (Criteria) this;
        }

        public Criteria andFf36GreaterThan(String value) {
            addCriterion("FF36 >", value, "ff36");
            return (Criteria) this;
        }

        public Criteria andFf36GreaterThanOrEqualTo(String value) {
            addCriterion("FF36 >=", value, "ff36");
            return (Criteria) this;
        }

        public Criteria andFf36LessThan(String value) {
            addCriterion("FF36 <", value, "ff36");
            return (Criteria) this;
        }

        public Criteria andFf36LessThanOrEqualTo(String value) {
            addCriterion("FF36 <=", value, "ff36");
            return (Criteria) this;
        }

        public Criteria andFf36Like(String value) {
            addCriterion("FF36 like", value, "ff36");
            return (Criteria) this;
        }

        public Criteria andFf36NotLike(String value) {
            addCriterion("FF36 not like", value, "ff36");
            return (Criteria) this;
        }

        public Criteria andFf36In(List<String> values) {
            addCriterion("FF36 in", values, "ff36");
            return (Criteria) this;
        }

        public Criteria andFf36NotIn(List<String> values) {
            addCriterion("FF36 not in", values, "ff36");
            return (Criteria) this;
        }

        public Criteria andFf36Between(String value1, String value2) {
            addCriterion("FF36 between", value1, value2, "ff36");
            return (Criteria) this;
        }

        public Criteria andFf36NotBetween(String value1, String value2) {
            addCriterion("FF36 not between", value1, value2, "ff36");
            return (Criteria) this;
        }

        public Criteria andFf37IsNull() {
            addCriterion("FF37 is null");
            return (Criteria) this;
        }

        public Criteria andFf37IsNotNull() {
            addCriterion("FF37 is not null");
            return (Criteria) this;
        }

        public Criteria andFf37EqualTo(String value) {
            addCriterion("FF37 =", value, "ff37");
            return (Criteria) this;
        }

        public Criteria andFf37NotEqualTo(String value) {
            addCriterion("FF37 <>", value, "ff37");
            return (Criteria) this;
        }

        public Criteria andFf37GreaterThan(String value) {
            addCriterion("FF37 >", value, "ff37");
            return (Criteria) this;
        }

        public Criteria andFf37GreaterThanOrEqualTo(String value) {
            addCriterion("FF37 >=", value, "ff37");
            return (Criteria) this;
        }

        public Criteria andFf37LessThan(String value) {
            addCriterion("FF37 <", value, "ff37");
            return (Criteria) this;
        }

        public Criteria andFf37LessThanOrEqualTo(String value) {
            addCriterion("FF37 <=", value, "ff37");
            return (Criteria) this;
        }

        public Criteria andFf37Like(String value) {
            addCriterion("FF37 like", value, "ff37");
            return (Criteria) this;
        }

        public Criteria andFf37NotLike(String value) {
            addCriterion("FF37 not like", value, "ff37");
            return (Criteria) this;
        }

        public Criteria andFf37In(List<String> values) {
            addCriterion("FF37 in", values, "ff37");
            return (Criteria) this;
        }

        public Criteria andFf37NotIn(List<String> values) {
            addCriterion("FF37 not in", values, "ff37");
            return (Criteria) this;
        }

        public Criteria andFf37Between(String value1, String value2) {
            addCriterion("FF37 between", value1, value2, "ff37");
            return (Criteria) this;
        }

        public Criteria andFf37NotBetween(String value1, String value2) {
            addCriterion("FF37 not between", value1, value2, "ff37");
            return (Criteria) this;
        }

        public Criteria andFf38IsNull() {
            addCriterion("FF38 is null");
            return (Criteria) this;
        }

        public Criteria andFf38IsNotNull() {
            addCriterion("FF38 is not null");
            return (Criteria) this;
        }

        public Criteria andFf38EqualTo(String value) {
            addCriterion("FF38 =", value, "ff38");
            return (Criteria) this;
        }

        public Criteria andFf38NotEqualTo(String value) {
            addCriterion("FF38 <>", value, "ff38");
            return (Criteria) this;
        }

        public Criteria andFf38GreaterThan(String value) {
            addCriterion("FF38 >", value, "ff38");
            return (Criteria) this;
        }

        public Criteria andFf38GreaterThanOrEqualTo(String value) {
            addCriterion("FF38 >=", value, "ff38");
            return (Criteria) this;
        }

        public Criteria andFf38LessThan(String value) {
            addCriterion("FF38 <", value, "ff38");
            return (Criteria) this;
        }

        public Criteria andFf38LessThanOrEqualTo(String value) {
            addCriterion("FF38 <=", value, "ff38");
            return (Criteria) this;
        }

        public Criteria andFf38Like(String value) {
            addCriterion("FF38 like", value, "ff38");
            return (Criteria) this;
        }

        public Criteria andFf38NotLike(String value) {
            addCriterion("FF38 not like", value, "ff38");
            return (Criteria) this;
        }

        public Criteria andFf38In(List<String> values) {
            addCriterion("FF38 in", values, "ff38");
            return (Criteria) this;
        }

        public Criteria andFf38NotIn(List<String> values) {
            addCriterion("FF38 not in", values, "ff38");
            return (Criteria) this;
        }

        public Criteria andFf38Between(String value1, String value2) {
            addCriterion("FF38 between", value1, value2, "ff38");
            return (Criteria) this;
        }

        public Criteria andFf38NotBetween(String value1, String value2) {
            addCriterion("FF38 not between", value1, value2, "ff38");
            return (Criteria) this;
        }

        public Criteria andFf39IsNull() {
            addCriterion("FF39 is null");
            return (Criteria) this;
        }

        public Criteria andFf39IsNotNull() {
            addCriterion("FF39 is not null");
            return (Criteria) this;
        }

        public Criteria andFf39EqualTo(String value) {
            addCriterion("FF39 =", value, "ff39");
            return (Criteria) this;
        }

        public Criteria andFf39NotEqualTo(String value) {
            addCriterion("FF39 <>", value, "ff39");
            return (Criteria) this;
        }

        public Criteria andFf39GreaterThan(String value) {
            addCriterion("FF39 >", value, "ff39");
            return (Criteria) this;
        }

        public Criteria andFf39GreaterThanOrEqualTo(String value) {
            addCriterion("FF39 >=", value, "ff39");
            return (Criteria) this;
        }

        public Criteria andFf39LessThan(String value) {
            addCriterion("FF39 <", value, "ff39");
            return (Criteria) this;
        }

        public Criteria andFf39LessThanOrEqualTo(String value) {
            addCriterion("FF39 <=", value, "ff39");
            return (Criteria) this;
        }

        public Criteria andFf39Like(String value) {
            addCriterion("FF39 like", value, "ff39");
            return (Criteria) this;
        }

        public Criteria andFf39NotLike(String value) {
            addCriterion("FF39 not like", value, "ff39");
            return (Criteria) this;
        }

        public Criteria andFf39In(List<String> values) {
            addCriterion("FF39 in", values, "ff39");
            return (Criteria) this;
        }

        public Criteria andFf39NotIn(List<String> values) {
            addCriterion("FF39 not in", values, "ff39");
            return (Criteria) this;
        }

        public Criteria andFf39Between(String value1, String value2) {
            addCriterion("FF39 between", value1, value2, "ff39");
            return (Criteria) this;
        }

        public Criteria andFf39NotBetween(String value1, String value2) {
            addCriterion("FF39 not between", value1, value2, "ff39");
            return (Criteria) this;
        }

        public Criteria andFf40IsNull() {
            addCriterion("FF40 is null");
            return (Criteria) this;
        }

        public Criteria andFf40IsNotNull() {
            addCriterion("FF40 is not null");
            return (Criteria) this;
        }

        public Criteria andFf40EqualTo(String value) {
            addCriterion("FF40 =", value, "ff40");
            return (Criteria) this;
        }

        public Criteria andFf40NotEqualTo(String value) {
            addCriterion("FF40 <>", value, "ff40");
            return (Criteria) this;
        }

        public Criteria andFf40GreaterThan(String value) {
            addCriterion("FF40 >", value, "ff40");
            return (Criteria) this;
        }

        public Criteria andFf40GreaterThanOrEqualTo(String value) {
            addCriterion("FF40 >=", value, "ff40");
            return (Criteria) this;
        }

        public Criteria andFf40LessThan(String value) {
            addCriterion("FF40 <", value, "ff40");
            return (Criteria) this;
        }

        public Criteria andFf40LessThanOrEqualTo(String value) {
            addCriterion("FF40 <=", value, "ff40");
            return (Criteria) this;
        }

        public Criteria andFf40Like(String value) {
            addCriterion("FF40 like", value, "ff40");
            return (Criteria) this;
        }

        public Criteria andFf40NotLike(String value) {
            addCriterion("FF40 not like", value, "ff40");
            return (Criteria) this;
        }

        public Criteria andFf40In(List<String> values) {
            addCriterion("FF40 in", values, "ff40");
            return (Criteria) this;
        }

        public Criteria andFf40NotIn(List<String> values) {
            addCriterion("FF40 not in", values, "ff40");
            return (Criteria) this;
        }

        public Criteria andFf40Between(String value1, String value2) {
            addCriterion("FF40 between", value1, value2, "ff40");
            return (Criteria) this;
        }

        public Criteria andFf40NotBetween(String value1, String value2) {
            addCriterion("FF40 not between", value1, value2, "ff40");
            return (Criteria) this;
        }

        public Criteria andFf41IsNull() {
            addCriterion("FF41 is null");
            return (Criteria) this;
        }

        public Criteria andFf41IsNotNull() {
            addCriterion("FF41 is not null");
            return (Criteria) this;
        }

        public Criteria andFf41EqualTo(String value) {
            addCriterion("FF41 =", value, "ff41");
            return (Criteria) this;
        }

        public Criteria andFf41NotEqualTo(String value) {
            addCriterion("FF41 <>", value, "ff41");
            return (Criteria) this;
        }

        public Criteria andFf41GreaterThan(String value) {
            addCriterion("FF41 >", value, "ff41");
            return (Criteria) this;
        }

        public Criteria andFf41GreaterThanOrEqualTo(String value) {
            addCriterion("FF41 >=", value, "ff41");
            return (Criteria) this;
        }

        public Criteria andFf41LessThan(String value) {
            addCriterion("FF41 <", value, "ff41");
            return (Criteria) this;
        }

        public Criteria andFf41LessThanOrEqualTo(String value) {
            addCriterion("FF41 <=", value, "ff41");
            return (Criteria) this;
        }

        public Criteria andFf41Like(String value) {
            addCriterion("FF41 like", value, "ff41");
            return (Criteria) this;
        }

        public Criteria andFf41NotLike(String value) {
            addCriterion("FF41 not like", value, "ff41");
            return (Criteria) this;
        }

        public Criteria andFf41In(List<String> values) {
            addCriterion("FF41 in", values, "ff41");
            return (Criteria) this;
        }

        public Criteria andFf41NotIn(List<String> values) {
            addCriterion("FF41 not in", values, "ff41");
            return (Criteria) this;
        }

        public Criteria andFf41Between(String value1, String value2) {
            addCriterion("FF41 between", value1, value2, "ff41");
            return (Criteria) this;
        }

        public Criteria andFf41NotBetween(String value1, String value2) {
            addCriterion("FF41 not between", value1, value2, "ff41");
            return (Criteria) this;
        }

        public Criteria andFf42IsNull() {
            addCriterion("FF42 is null");
            return (Criteria) this;
        }

        public Criteria andFf42IsNotNull() {
            addCriterion("FF42 is not null");
            return (Criteria) this;
        }

        public Criteria andFf42EqualTo(String value) {
            addCriterion("FF42 =", value, "ff42");
            return (Criteria) this;
        }

        public Criteria andFf42NotEqualTo(String value) {
            addCriterion("FF42 <>", value, "ff42");
            return (Criteria) this;
        }

        public Criteria andFf42GreaterThan(String value) {
            addCriterion("FF42 >", value, "ff42");
            return (Criteria) this;
        }

        public Criteria andFf42GreaterThanOrEqualTo(String value) {
            addCriterion("FF42 >=", value, "ff42");
            return (Criteria) this;
        }

        public Criteria andFf42LessThan(String value) {
            addCriterion("FF42 <", value, "ff42");
            return (Criteria) this;
        }

        public Criteria andFf42LessThanOrEqualTo(String value) {
            addCriterion("FF42 <=", value, "ff42");
            return (Criteria) this;
        }

        public Criteria andFf42Like(String value) {
            addCriterion("FF42 like", value, "ff42");
            return (Criteria) this;
        }

        public Criteria andFf42NotLike(String value) {
            addCriterion("FF42 not like", value, "ff42");
            return (Criteria) this;
        }

        public Criteria andFf42In(List<String> values) {
            addCriterion("FF42 in", values, "ff42");
            return (Criteria) this;
        }

        public Criteria andFf42NotIn(List<String> values) {
            addCriterion("FF42 not in", values, "ff42");
            return (Criteria) this;
        }

        public Criteria andFf42Between(String value1, String value2) {
            addCriterion("FF42 between", value1, value2, "ff42");
            return (Criteria) this;
        }

        public Criteria andFf42NotBetween(String value1, String value2) {
            addCriterion("FF42 not between", value1, value2, "ff42");
            return (Criteria) this;
        }

        public Criteria andFf43IsNull() {
            addCriterion("FF43 is null");
            return (Criteria) this;
        }

        public Criteria andFf43IsNotNull() {
            addCriterion("FF43 is not null");
            return (Criteria) this;
        }

        public Criteria andFf43EqualTo(String value) {
            addCriterion("FF43 =", value, "ff43");
            return (Criteria) this;
        }

        public Criteria andFf43NotEqualTo(String value) {
            addCriterion("FF43 <>", value, "ff43");
            return (Criteria) this;
        }

        public Criteria andFf43GreaterThan(String value) {
            addCriterion("FF43 >", value, "ff43");
            return (Criteria) this;
        }

        public Criteria andFf43GreaterThanOrEqualTo(String value) {
            addCriterion("FF43 >=", value, "ff43");
            return (Criteria) this;
        }

        public Criteria andFf43LessThan(String value) {
            addCriterion("FF43 <", value, "ff43");
            return (Criteria) this;
        }

        public Criteria andFf43LessThanOrEqualTo(String value) {
            addCriterion("FF43 <=", value, "ff43");
            return (Criteria) this;
        }

        public Criteria andFf43Like(String value) {
            addCriterion("FF43 like", value, "ff43");
            return (Criteria) this;
        }

        public Criteria andFf43NotLike(String value) {
            addCriterion("FF43 not like", value, "ff43");
            return (Criteria) this;
        }

        public Criteria andFf43In(List<String> values) {
            addCriterion("FF43 in", values, "ff43");
            return (Criteria) this;
        }

        public Criteria andFf43NotIn(List<String> values) {
            addCriterion("FF43 not in", values, "ff43");
            return (Criteria) this;
        }

        public Criteria andFf43Between(String value1, String value2) {
            addCriterion("FF43 between", value1, value2, "ff43");
            return (Criteria) this;
        }

        public Criteria andFf43NotBetween(String value1, String value2) {
            addCriterion("FF43 not between", value1, value2, "ff43");
            return (Criteria) this;
        }

        public Criteria andFf44IsNull() {
            addCriterion("FF44 is null");
            return (Criteria) this;
        }

        public Criteria andFf44IsNotNull() {
            addCriterion("FF44 is not null");
            return (Criteria) this;
        }

        public Criteria andFf44EqualTo(String value) {
            addCriterion("FF44 =", value, "ff44");
            return (Criteria) this;
        }

        public Criteria andFf44NotEqualTo(String value) {
            addCriterion("FF44 <>", value, "ff44");
            return (Criteria) this;
        }

        public Criteria andFf44GreaterThan(String value) {
            addCriterion("FF44 >", value, "ff44");
            return (Criteria) this;
        }

        public Criteria andFf44GreaterThanOrEqualTo(String value) {
            addCriterion("FF44 >=", value, "ff44");
            return (Criteria) this;
        }

        public Criteria andFf44LessThan(String value) {
            addCriterion("FF44 <", value, "ff44");
            return (Criteria) this;
        }

        public Criteria andFf44LessThanOrEqualTo(String value) {
            addCriterion("FF44 <=", value, "ff44");
            return (Criteria) this;
        }

        public Criteria andFf44Like(String value) {
            addCriterion("FF44 like", value, "ff44");
            return (Criteria) this;
        }

        public Criteria andFf44NotLike(String value) {
            addCriterion("FF44 not like", value, "ff44");
            return (Criteria) this;
        }

        public Criteria andFf44In(List<String> values) {
            addCriterion("FF44 in", values, "ff44");
            return (Criteria) this;
        }

        public Criteria andFf44NotIn(List<String> values) {
            addCriterion("FF44 not in", values, "ff44");
            return (Criteria) this;
        }

        public Criteria andFf44Between(String value1, String value2) {
            addCriterion("FF44 between", value1, value2, "ff44");
            return (Criteria) this;
        }

        public Criteria andFf44NotBetween(String value1, String value2) {
            addCriterion("FF44 not between", value1, value2, "ff44");
            return (Criteria) this;
        }

        public Criteria andFf45IsNull() {
            addCriterion("FF45 is null");
            return (Criteria) this;
        }

        public Criteria andFf45IsNotNull() {
            addCriterion("FF45 is not null");
            return (Criteria) this;
        }

        public Criteria andFf45EqualTo(String value) {
            addCriterion("FF45 =", value, "ff45");
            return (Criteria) this;
        }

        public Criteria andFf45NotEqualTo(String value) {
            addCriterion("FF45 <>", value, "ff45");
            return (Criteria) this;
        }

        public Criteria andFf45GreaterThan(String value) {
            addCriterion("FF45 >", value, "ff45");
            return (Criteria) this;
        }

        public Criteria andFf45GreaterThanOrEqualTo(String value) {
            addCriterion("FF45 >=", value, "ff45");
            return (Criteria) this;
        }

        public Criteria andFf45LessThan(String value) {
            addCriterion("FF45 <", value, "ff45");
            return (Criteria) this;
        }

        public Criteria andFf45LessThanOrEqualTo(String value) {
            addCriterion("FF45 <=", value, "ff45");
            return (Criteria) this;
        }

        public Criteria andFf45Like(String value) {
            addCriterion("FF45 like", value, "ff45");
            return (Criteria) this;
        }

        public Criteria andFf45NotLike(String value) {
            addCriterion("FF45 not like", value, "ff45");
            return (Criteria) this;
        }

        public Criteria andFf45In(List<String> values) {
            addCriterion("FF45 in", values, "ff45");
            return (Criteria) this;
        }

        public Criteria andFf45NotIn(List<String> values) {
            addCriterion("FF45 not in", values, "ff45");
            return (Criteria) this;
        }

        public Criteria andFf45Between(String value1, String value2) {
            addCriterion("FF45 between", value1, value2, "ff45");
            return (Criteria) this;
        }

        public Criteria andFf45NotBetween(String value1, String value2) {
            addCriterion("FF45 not between", value1, value2, "ff45");
            return (Criteria) this;
        }

        public Criteria andFf46IsNull() {
            addCriterion("FF46 is null");
            return (Criteria) this;
        }

        public Criteria andFf46IsNotNull() {
            addCriterion("FF46 is not null");
            return (Criteria) this;
        }

        public Criteria andFf46EqualTo(String value) {
            addCriterion("FF46 =", value, "ff46");
            return (Criteria) this;
        }

        public Criteria andFf46NotEqualTo(String value) {
            addCriterion("FF46 <>", value, "ff46");
            return (Criteria) this;
        }

        public Criteria andFf46GreaterThan(String value) {
            addCriterion("FF46 >", value, "ff46");
            return (Criteria) this;
        }

        public Criteria andFf46GreaterThanOrEqualTo(String value) {
            addCriterion("FF46 >=", value, "ff46");
            return (Criteria) this;
        }

        public Criteria andFf46LessThan(String value) {
            addCriterion("FF46 <", value, "ff46");
            return (Criteria) this;
        }

        public Criteria andFf46LessThanOrEqualTo(String value) {
            addCriterion("FF46 <=", value, "ff46");
            return (Criteria) this;
        }

        public Criteria andFf46Like(String value) {
            addCriterion("FF46 like", value, "ff46");
            return (Criteria) this;
        }

        public Criteria andFf46NotLike(String value) {
            addCriterion("FF46 not like", value, "ff46");
            return (Criteria) this;
        }

        public Criteria andFf46In(List<String> values) {
            addCriterion("FF46 in", values, "ff46");
            return (Criteria) this;
        }

        public Criteria andFf46NotIn(List<String> values) {
            addCriterion("FF46 not in", values, "ff46");
            return (Criteria) this;
        }

        public Criteria andFf46Between(String value1, String value2) {
            addCriterion("FF46 between", value1, value2, "ff46");
            return (Criteria) this;
        }

        public Criteria andFf46NotBetween(String value1, String value2) {
            addCriterion("FF46 not between", value1, value2, "ff46");
            return (Criteria) this;
        }

        public Criteria andFf47IsNull() {
            addCriterion("FF47 is null");
            return (Criteria) this;
        }

        public Criteria andFf47IsNotNull() {
            addCriterion("FF47 is not null");
            return (Criteria) this;
        }

        public Criteria andFf47EqualTo(String value) {
            addCriterion("FF47 =", value, "ff47");
            return (Criteria) this;
        }

        public Criteria andFf47NotEqualTo(String value) {
            addCriterion("FF47 <>", value, "ff47");
            return (Criteria) this;
        }

        public Criteria andFf47GreaterThan(String value) {
            addCriterion("FF47 >", value, "ff47");
            return (Criteria) this;
        }

        public Criteria andFf47GreaterThanOrEqualTo(String value) {
            addCriterion("FF47 >=", value, "ff47");
            return (Criteria) this;
        }

        public Criteria andFf47LessThan(String value) {
            addCriterion("FF47 <", value, "ff47");
            return (Criteria) this;
        }

        public Criteria andFf47LessThanOrEqualTo(String value) {
            addCriterion("FF47 <=", value, "ff47");
            return (Criteria) this;
        }

        public Criteria andFf47Like(String value) {
            addCriterion("FF47 like", value, "ff47");
            return (Criteria) this;
        }

        public Criteria andFf47NotLike(String value) {
            addCriterion("FF47 not like", value, "ff47");
            return (Criteria) this;
        }

        public Criteria andFf47In(List<String> values) {
            addCriterion("FF47 in", values, "ff47");
            return (Criteria) this;
        }

        public Criteria andFf47NotIn(List<String> values) {
            addCriterion("FF47 not in", values, "ff47");
            return (Criteria) this;
        }

        public Criteria andFf47Between(String value1, String value2) {
            addCriterion("FF47 between", value1, value2, "ff47");
            return (Criteria) this;
        }

        public Criteria andFf47NotBetween(String value1, String value2) {
            addCriterion("FF47 not between", value1, value2, "ff47");
            return (Criteria) this;
        }

        public Criteria andFf48IsNull() {
            addCriterion("FF48 is null");
            return (Criteria) this;
        }

        public Criteria andFf48IsNotNull() {
            addCriterion("FF48 is not null");
            return (Criteria) this;
        }

        public Criteria andFf48EqualTo(String value) {
            addCriterion("FF48 =", value, "ff48");
            return (Criteria) this;
        }

        public Criteria andFf48NotEqualTo(String value) {
            addCriterion("FF48 <>", value, "ff48");
            return (Criteria) this;
        }

        public Criteria andFf48GreaterThan(String value) {
            addCriterion("FF48 >", value, "ff48");
            return (Criteria) this;
        }

        public Criteria andFf48GreaterThanOrEqualTo(String value) {
            addCriterion("FF48 >=", value, "ff48");
            return (Criteria) this;
        }

        public Criteria andFf48LessThan(String value) {
            addCriterion("FF48 <", value, "ff48");
            return (Criteria) this;
        }

        public Criteria andFf48LessThanOrEqualTo(String value) {
            addCriterion("FF48 <=", value, "ff48");
            return (Criteria) this;
        }

        public Criteria andFf48Like(String value) {
            addCriterion("FF48 like", value, "ff48");
            return (Criteria) this;
        }

        public Criteria andFf48NotLike(String value) {
            addCriterion("FF48 not like", value, "ff48");
            return (Criteria) this;
        }

        public Criteria andFf48In(List<String> values) {
            addCriterion("FF48 in", values, "ff48");
            return (Criteria) this;
        }

        public Criteria andFf48NotIn(List<String> values) {
            addCriterion("FF48 not in", values, "ff48");
            return (Criteria) this;
        }

        public Criteria andFf48Between(String value1, String value2) {
            addCriterion("FF48 between", value1, value2, "ff48");
            return (Criteria) this;
        }

        public Criteria andFf48NotBetween(String value1, String value2) {
            addCriterion("FF48 not between", value1, value2, "ff48");
            return (Criteria) this;
        }

        public Criteria andFf49IsNull() {
            addCriterion("FF49 is null");
            return (Criteria) this;
        }

        public Criteria andFf49IsNotNull() {
            addCriterion("FF49 is not null");
            return (Criteria) this;
        }

        public Criteria andFf49EqualTo(String value) {
            addCriterion("FF49 =", value, "ff49");
            return (Criteria) this;
        }

        public Criteria andFf49NotEqualTo(String value) {
            addCriterion("FF49 <>", value, "ff49");
            return (Criteria) this;
        }

        public Criteria andFf49GreaterThan(String value) {
            addCriterion("FF49 >", value, "ff49");
            return (Criteria) this;
        }

        public Criteria andFf49GreaterThanOrEqualTo(String value) {
            addCriterion("FF49 >=", value, "ff49");
            return (Criteria) this;
        }

        public Criteria andFf49LessThan(String value) {
            addCriterion("FF49 <", value, "ff49");
            return (Criteria) this;
        }

        public Criteria andFf49LessThanOrEqualTo(String value) {
            addCriterion("FF49 <=", value, "ff49");
            return (Criteria) this;
        }

        public Criteria andFf49Like(String value) {
            addCriterion("FF49 like", value, "ff49");
            return (Criteria) this;
        }

        public Criteria andFf49NotLike(String value) {
            addCriterion("FF49 not like", value, "ff49");
            return (Criteria) this;
        }

        public Criteria andFf49In(List<String> values) {
            addCriterion("FF49 in", values, "ff49");
            return (Criteria) this;
        }

        public Criteria andFf49NotIn(List<String> values) {
            addCriterion("FF49 not in", values, "ff49");
            return (Criteria) this;
        }

        public Criteria andFf49Between(String value1, String value2) {
            addCriterion("FF49 between", value1, value2, "ff49");
            return (Criteria) this;
        }

        public Criteria andFf49NotBetween(String value1, String value2) {
            addCriterion("FF49 not between", value1, value2, "ff49");
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

        public Criteria andFf50IsNull() {
            addCriterion("FF50 is null");
            return (Criteria) this;
        }

        public Criteria andFf50IsNotNull() {
            addCriterion("FF50 is not null");
            return (Criteria) this;
        }

        public Criteria andFf50EqualTo(String value) {
            addCriterion("FF50 =", value, "ff50");
            return (Criteria) this;
        }

        public Criteria andFf50NotEqualTo(String value) {
            addCriterion("FF50 <>", value, "ff50");
            return (Criteria) this;
        }

        public Criteria andFf50GreaterThan(String value) {
            addCriterion("FF50 >", value, "ff50");
            return (Criteria) this;
        }

        public Criteria andFf50GreaterThanOrEqualTo(String value) {
            addCriterion("FF50 >=", value, "ff50");
            return (Criteria) this;
        }

        public Criteria andFf50LessThan(String value) {
            addCriterion("FF50 <", value, "ff50");
            return (Criteria) this;
        }

        public Criteria andFf50LessThanOrEqualTo(String value) {
            addCriterion("FF50 <=", value, "ff50");
            return (Criteria) this;
        }

        public Criteria andFf50Like(String value) {
            addCriterion("FF50 like", value, "ff50");
            return (Criteria) this;
        }

        public Criteria andFf50NotLike(String value) {
            addCriterion("FF50 not like", value, "ff50");
            return (Criteria) this;
        }

        public Criteria andFf50In(List<String> values) {
            addCriterion("FF50 in", values, "ff50");
            return (Criteria) this;
        }

        public Criteria andFf50NotIn(List<String> values) {
            addCriterion("FF50 not in", values, "ff50");
            return (Criteria) this;
        }

        public Criteria andFf50Between(String value1, String value2) {
            addCriterion("FF50 between", value1, value2, "ff50");
            return (Criteria) this;
        }

        public Criteria andFf50NotBetween(String value1, String value2) {
            addCriterion("FF50 not between", value1, value2, "ff50");
            return (Criteria) this;
        }

        public Criteria andFf51IsNull() {
            addCriterion("FF51 is null");
            return (Criteria) this;
        }

        public Criteria andFf51IsNotNull() {
            addCriterion("FF51 is not null");
            return (Criteria) this;
        }

        public Criteria andFf51EqualTo(String value) {
            addCriterion("FF51 =", value, "ff51");
            return (Criteria) this;
        }

        public Criteria andFf51NotEqualTo(String value) {
            addCriterion("FF51 <>", value, "ff51");
            return (Criteria) this;
        }

        public Criteria andFf51GreaterThan(String value) {
            addCriterion("FF51 >", value, "ff51");
            return (Criteria) this;
        }

        public Criteria andFf51GreaterThanOrEqualTo(String value) {
            addCriterion("FF51 >=", value, "ff51");
            return (Criteria) this;
        }

        public Criteria andFf51LessThan(String value) {
            addCriterion("FF51 <", value, "ff51");
            return (Criteria) this;
        }

        public Criteria andFf51LessThanOrEqualTo(String value) {
            addCriterion("FF51 <=", value, "ff51");
            return (Criteria) this;
        }

        public Criteria andFf51Like(String value) {
            addCriterion("FF51 like", value, "ff51");
            return (Criteria) this;
        }

        public Criteria andFf51NotLike(String value) {
            addCriterion("FF51 not like", value, "ff51");
            return (Criteria) this;
        }

        public Criteria andFf51In(List<String> values) {
            addCriterion("FF51 in", values, "ff51");
            return (Criteria) this;
        }

        public Criteria andFf51NotIn(List<String> values) {
            addCriterion("FF51 not in", values, "ff51");
            return (Criteria) this;
        }

        public Criteria andFf51Between(String value1, String value2) {
            addCriterion("FF51 between", value1, value2, "ff51");
            return (Criteria) this;
        }

        public Criteria andFf51NotBetween(String value1, String value2) {
            addCriterion("FF51 not between", value1, value2, "ff51");
            return (Criteria) this;
        }

        public Criteria andFf52IsNull() {
            addCriterion("FF52 is null");
            return (Criteria) this;
        }

        public Criteria andFf52IsNotNull() {
            addCriterion("FF52 is not null");
            return (Criteria) this;
        }

        public Criteria andFf52EqualTo(String value) {
            addCriterion("FF52 =", value, "ff52");
            return (Criteria) this;
        }

        public Criteria andFf52NotEqualTo(String value) {
            addCriterion("FF52 <>", value, "ff52");
            return (Criteria) this;
        }

        public Criteria andFf52GreaterThan(String value) {
            addCriterion("FF52 >", value, "ff52");
            return (Criteria) this;
        }

        public Criteria andFf52GreaterThanOrEqualTo(String value) {
            addCriterion("FF52 >=", value, "ff52");
            return (Criteria) this;
        }

        public Criteria andFf52LessThan(String value) {
            addCriterion("FF52 <", value, "ff52");
            return (Criteria) this;
        }

        public Criteria andFf52LessThanOrEqualTo(String value) {
            addCriterion("FF52 <=", value, "ff52");
            return (Criteria) this;
        }

        public Criteria andFf52Like(String value) {
            addCriterion("FF52 like", value, "ff52");
            return (Criteria) this;
        }

        public Criteria andFf52NotLike(String value) {
            addCriterion("FF52 not like", value, "ff52");
            return (Criteria) this;
        }

        public Criteria andFf52In(List<String> values) {
            addCriterion("FF52 in", values, "ff52");
            return (Criteria) this;
        }

        public Criteria andFf52NotIn(List<String> values) {
            addCriterion("FF52 not in", values, "ff52");
            return (Criteria) this;
        }

        public Criteria andFf52Between(String value1, String value2) {
            addCriterion("FF52 between", value1, value2, "ff52");
            return (Criteria) this;
        }

        public Criteria andFf52NotBetween(String value1, String value2) {
            addCriterion("FF52 not between", value1, value2, "ff52");
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

        public Criteria andFf53IsNull() {
            addCriterion("FF53 is null");
            return (Criteria) this;
        }

        public Criteria andFf53IsNotNull() {
            addCriterion("FF53 is not null");
            return (Criteria) this;
        }

        public Criteria andFf53EqualTo(String value) {
            addCriterion("FF53 =", value, "ff53");
            return (Criteria) this;
        }

        public Criteria andFf53NotEqualTo(String value) {
            addCriterion("FF53 <>", value, "ff53");
            return (Criteria) this;
        }

        public Criteria andFf53GreaterThan(String value) {
            addCriterion("FF53 >", value, "ff53");
            return (Criteria) this;
        }

        public Criteria andFf53GreaterThanOrEqualTo(String value) {
            addCriterion("FF53 >=", value, "ff53");
            return (Criteria) this;
        }

        public Criteria andFf53LessThan(String value) {
            addCriterion("FF53 <", value, "ff53");
            return (Criteria) this;
        }

        public Criteria andFf53LessThanOrEqualTo(String value) {
            addCriterion("FF53 <=", value, "ff53");
            return (Criteria) this;
        }

        public Criteria andFf53Like(String value) {
            addCriterion("FF53 like", value, "ff53");
            return (Criteria) this;
        }

        public Criteria andFf53NotLike(String value) {
            addCriterion("FF53 not like", value, "ff53");
            return (Criteria) this;
        }

        public Criteria andFf53In(List<String> values) {
            addCriterion("FF53 in", values, "ff53");
            return (Criteria) this;
        }

        public Criteria andFf53NotIn(List<String> values) {
            addCriterion("FF53 not in", values, "ff53");
            return (Criteria) this;
        }

        public Criteria andFf53Between(String value1, String value2) {
            addCriterion("FF53 between", value1, value2, "ff53");
            return (Criteria) this;
        }

        public Criteria andFf53NotBetween(String value1, String value2) {
            addCriterion("FF53 not between", value1, value2, "ff53");
            return (Criteria) this;
        }

        public Criteria andFf54IsNull() {
            addCriterion("FF54 is null");
            return (Criteria) this;
        }

        public Criteria andFf54IsNotNull() {
            addCriterion("FF54 is not null");
            return (Criteria) this;
        }

        public Criteria andFf54EqualTo(String value) {
            addCriterion("FF54 =", value, "ff54");
            return (Criteria) this;
        }

        public Criteria andFf54NotEqualTo(String value) {
            addCriterion("FF54 <>", value, "ff54");
            return (Criteria) this;
        }

        public Criteria andFf54GreaterThan(String value) {
            addCriterion("FF54 >", value, "ff54");
            return (Criteria) this;
        }

        public Criteria andFf54GreaterThanOrEqualTo(String value) {
            addCriterion("FF54 >=", value, "ff54");
            return (Criteria) this;
        }

        public Criteria andFf54LessThan(String value) {
            addCriterion("FF54 <", value, "ff54");
            return (Criteria) this;
        }

        public Criteria andFf54LessThanOrEqualTo(String value) {
            addCriterion("FF54 <=", value, "ff54");
            return (Criteria) this;
        }

        public Criteria andFf54Like(String value) {
            addCriterion("FF54 like", value, "ff54");
            return (Criteria) this;
        }

        public Criteria andFf54NotLike(String value) {
            addCriterion("FF54 not like", value, "ff54");
            return (Criteria) this;
        }

        public Criteria andFf54In(List<String> values) {
            addCriterion("FF54 in", values, "ff54");
            return (Criteria) this;
        }

        public Criteria andFf54NotIn(List<String> values) {
            addCriterion("FF54 not in", values, "ff54");
            return (Criteria) this;
        }

        public Criteria andFf54Between(String value1, String value2) {
            addCriterion("FF54 between", value1, value2, "ff54");
            return (Criteria) this;
        }

        public Criteria andFf54NotBetween(String value1, String value2) {
            addCriterion("FF54 not between", value1, value2, "ff54");
            return (Criteria) this;
        }

        public Criteria andFf55IsNull() {
            addCriterion("FF55 is null");
            return (Criteria) this;
        }

        public Criteria andFf55IsNotNull() {
            addCriterion("FF55 is not null");
            return (Criteria) this;
        }

        public Criteria andFf55EqualTo(Long value) {
            addCriterion("FF55 =", value, "ff55");
            return (Criteria) this;
        }

        public Criteria andFf55NotEqualTo(Long value) {
            addCriterion("FF55 <>", value, "ff55");
            return (Criteria) this;
        }

        public Criteria andFf55GreaterThan(Long value) {
            addCriterion("FF55 >", value, "ff55");
            return (Criteria) this;
        }

        public Criteria andFf55GreaterThanOrEqualTo(Long value) {
            addCriterion("FF55 >=", value, "ff55");
            return (Criteria) this;
        }

        public Criteria andFf55LessThan(Long value) {
            addCriterion("FF55 <", value, "ff55");
            return (Criteria) this;
        }

        public Criteria andFf55LessThanOrEqualTo(Long value) {
            addCriterion("FF55 <=", value, "ff55");
            return (Criteria) this;
        }

        public Criteria andFf55In(List<Long> values) {
            addCriterion("FF55 in", values, "ff55");
            return (Criteria) this;
        }

        public Criteria andFf55NotIn(List<Long> values) {
            addCriterion("FF55 not in", values, "ff55");
            return (Criteria) this;
        }

        public Criteria andFf55Between(Long value1, Long value2) {
            addCriterion("FF55 between", value1, value2, "ff55");
            return (Criteria) this;
        }

        public Criteria andFf55NotBetween(Long value1, Long value2) {
            addCriterion("FF55 not between", value1, value2, "ff55");
            return (Criteria) this;
        }

        public Criteria andFf56IsNull() {
            addCriterion("FF56 is null");
            return (Criteria) this;
        }

        public Criteria andFf56IsNotNull() {
            addCriterion("FF56 is not null");
            return (Criteria) this;
        }

        public Criteria andFf56EqualTo(String value) {
            addCriterion("FF56 =", value, "ff56");
            return (Criteria) this;
        }

        public Criteria andFf56NotEqualTo(String value) {
            addCriterion("FF56 <>", value, "ff56");
            return (Criteria) this;
        }

        public Criteria andFf56GreaterThan(String value) {
            addCriterion("FF56 >", value, "ff56");
            return (Criteria) this;
        }

        public Criteria andFf56GreaterThanOrEqualTo(String value) {
            addCriterion("FF56 >=", value, "ff56");
            return (Criteria) this;
        }

        public Criteria andFf56LessThan(String value) {
            addCriterion("FF56 <", value, "ff56");
            return (Criteria) this;
        }

        public Criteria andFf56LessThanOrEqualTo(String value) {
            addCriterion("FF56 <=", value, "ff56");
            return (Criteria) this;
        }

        public Criteria andFf56Like(String value) {
            addCriterion("FF56 like", value, "ff56");
            return (Criteria) this;
        }

        public Criteria andFf56NotLike(String value) {
            addCriterion("FF56 not like", value, "ff56");
            return (Criteria) this;
        }

        public Criteria andFf56In(List<String> values) {
            addCriterion("FF56 in", values, "ff56");
            return (Criteria) this;
        }

        public Criteria andFf56NotIn(List<String> values) {
            addCriterion("FF56 not in", values, "ff56");
            return (Criteria) this;
        }

        public Criteria andFf56Between(String value1, String value2) {
            addCriterion("FF56 between", value1, value2, "ff56");
            return (Criteria) this;
        }

        public Criteria andFf56NotBetween(String value1, String value2) {
            addCriterion("FF56 not between", value1, value2, "ff56");
            return (Criteria) this;
        }

        public Criteria andFf57IsNull() {
            addCriterion("FF57 is null");
            return (Criteria) this;
        }

        public Criteria andFf57IsNotNull() {
            addCriterion("FF57 is not null");
            return (Criteria) this;
        }

        public Criteria andFf57EqualTo(String value) {
            addCriterion("FF57 =", value, "ff57");
            return (Criteria) this;
        }

        public Criteria andFf57NotEqualTo(String value) {
            addCriterion("FF57 <>", value, "ff57");
            return (Criteria) this;
        }

        public Criteria andFf57GreaterThan(String value) {
            addCriterion("FF57 >", value, "ff57");
            return (Criteria) this;
        }

        public Criteria andFf57GreaterThanOrEqualTo(String value) {
            addCriterion("FF57 >=", value, "ff57");
            return (Criteria) this;
        }

        public Criteria andFf57LessThan(String value) {
            addCriterion("FF57 <", value, "ff57");
            return (Criteria) this;
        }

        public Criteria andFf57LessThanOrEqualTo(String value) {
            addCriterion("FF57 <=", value, "ff57");
            return (Criteria) this;
        }

        public Criteria andFf57Like(String value) {
            addCriterion("FF57 like", value, "ff57");
            return (Criteria) this;
        }

        public Criteria andFf57NotLike(String value) {
            addCriterion("FF57 not like", value, "ff57");
            return (Criteria) this;
        }

        public Criteria andFf57In(List<String> values) {
            addCriterion("FF57 in", values, "ff57");
            return (Criteria) this;
        }

        public Criteria andFf57NotIn(List<String> values) {
            addCriterion("FF57 not in", values, "ff57");
            return (Criteria) this;
        }

        public Criteria andFf57Between(String value1, String value2) {
            addCriterion("FF57 between", value1, value2, "ff57");
            return (Criteria) this;
        }

        public Criteria andFf57NotBetween(String value1, String value2) {
            addCriterion("FF57 not between", value1, value2, "ff57");
            return (Criteria) this;
        }

        public Criteria andFf58IsNull() {
            addCriterion("FF58 is null");
            return (Criteria) this;
        }

        public Criteria andFf58IsNotNull() {
            addCriterion("FF58 is not null");
            return (Criteria) this;
        }

        public Criteria andFf58EqualTo(String value) {
            addCriterion("FF58 =", value, "ff58");
            return (Criteria) this;
        }

        public Criteria andFf58NotEqualTo(String value) {
            addCriterion("FF58 <>", value, "ff58");
            return (Criteria) this;
        }

        public Criteria andFf58GreaterThan(String value) {
            addCriterion("FF58 >", value, "ff58");
            return (Criteria) this;
        }

        public Criteria andFf58GreaterThanOrEqualTo(String value) {
            addCriterion("FF58 >=", value, "ff58");
            return (Criteria) this;
        }

        public Criteria andFf58LessThan(String value) {
            addCriterion("FF58 <", value, "ff58");
            return (Criteria) this;
        }

        public Criteria andFf58LessThanOrEqualTo(String value) {
            addCriterion("FF58 <=", value, "ff58");
            return (Criteria) this;
        }

        public Criteria andFf58Like(String value) {
            addCriterion("FF58 like", value, "ff58");
            return (Criteria) this;
        }

        public Criteria andFf58NotLike(String value) {
            addCriterion("FF58 not like", value, "ff58");
            return (Criteria) this;
        }

        public Criteria andFf58In(List<String> values) {
            addCriterion("FF58 in", values, "ff58");
            return (Criteria) this;
        }

        public Criteria andFf58NotIn(List<String> values) {
            addCriterion("FF58 not in", values, "ff58");
            return (Criteria) this;
        }

        public Criteria andFf58Between(String value1, String value2) {
            addCriterion("FF58 between", value1, value2, "ff58");
            return (Criteria) this;
        }

        public Criteria andFf58NotBetween(String value1, String value2) {
            addCriterion("FF58 not between", value1, value2, "ff58");
            return (Criteria) this;
        }

        public Criteria andFf59IsNull() {
            addCriterion("FF59 is null");
            return (Criteria) this;
        }

        public Criteria andFf59IsNotNull() {
            addCriterion("FF59 is not null");
            return (Criteria) this;
        }

        public Criteria andFf59EqualTo(String value) {
            addCriterion("FF59 =", value, "ff59");
            return (Criteria) this;
        }

        public Criteria andFf59NotEqualTo(String value) {
            addCriterion("FF59 <>", value, "ff59");
            return (Criteria) this;
        }

        public Criteria andFf59GreaterThan(String value) {
            addCriterion("FF59 >", value, "ff59");
            return (Criteria) this;
        }

        public Criteria andFf59GreaterThanOrEqualTo(String value) {
            addCriterion("FF59 >=", value, "ff59");
            return (Criteria) this;
        }

        public Criteria andFf59LessThan(String value) {
            addCriterion("FF59 <", value, "ff59");
            return (Criteria) this;
        }

        public Criteria andFf59LessThanOrEqualTo(String value) {
            addCriterion("FF59 <=", value, "ff59");
            return (Criteria) this;
        }

        public Criteria andFf59Like(String value) {
            addCriterion("FF59 like", value, "ff59");
            return (Criteria) this;
        }

        public Criteria andFf59NotLike(String value) {
            addCriterion("FF59 not like", value, "ff59");
            return (Criteria) this;
        }

        public Criteria andFf59In(List<String> values) {
            addCriterion("FF59 in", values, "ff59");
            return (Criteria) this;
        }

        public Criteria andFf59NotIn(List<String> values) {
            addCriterion("FF59 not in", values, "ff59");
            return (Criteria) this;
        }

        public Criteria andFf59Between(String value1, String value2) {
            addCriterion("FF59 between", value1, value2, "ff59");
            return (Criteria) this;
        }

        public Criteria andFf59NotBetween(String value1, String value2) {
            addCriterion("FF59 not between", value1, value2, "ff59");
            return (Criteria) this;
        }

        public Criteria andFf60IsNull() {
            addCriterion("FF60 is null");
            return (Criteria) this;
        }

        public Criteria andFf60IsNotNull() {
            addCriterion("FF60 is not null");
            return (Criteria) this;
        }

        public Criteria andFf60EqualTo(String value) {
            addCriterion("FF60 =", value, "ff60");
            return (Criteria) this;
        }

        public Criteria andFf60NotEqualTo(String value) {
            addCriterion("FF60 <>", value, "ff60");
            return (Criteria) this;
        }

        public Criteria andFf60GreaterThan(String value) {
            addCriterion("FF60 >", value, "ff60");
            return (Criteria) this;
        }

        public Criteria andFf60GreaterThanOrEqualTo(String value) {
            addCriterion("FF60 >=", value, "ff60");
            return (Criteria) this;
        }

        public Criteria andFf60LessThan(String value) {
            addCriterion("FF60 <", value, "ff60");
            return (Criteria) this;
        }

        public Criteria andFf60LessThanOrEqualTo(String value) {
            addCriterion("FF60 <=", value, "ff60");
            return (Criteria) this;
        }

        public Criteria andFf60Like(String value) {
            addCriterion("FF60 like", value, "ff60");
            return (Criteria) this;
        }

        public Criteria andFf60NotLike(String value) {
            addCriterion("FF60 not like", value, "ff60");
            return (Criteria) this;
        }

        public Criteria andFf60In(List<String> values) {
            addCriterion("FF60 in", values, "ff60");
            return (Criteria) this;
        }

        public Criteria andFf60NotIn(List<String> values) {
            addCriterion("FF60 not in", values, "ff60");
            return (Criteria) this;
        }

        public Criteria andFf60Between(String value1, String value2) {
            addCriterion("FF60 between", value1, value2, "ff60");
            return (Criteria) this;
        }

        public Criteria andFf60NotBetween(String value1, String value2) {
            addCriterion("FF60 not between", value1, value2, "ff60");
            return (Criteria) this;
        }

        public Criteria andFf61IsNull() {
            addCriterion("FF61 is null");
            return (Criteria) this;
        }

        public Criteria andFf61IsNotNull() {
            addCriterion("FF61 is not null");
            return (Criteria) this;
        }

        public Criteria andFf61EqualTo(String value) {
            addCriterion("FF61 =", value, "ff61");
            return (Criteria) this;
        }

        public Criteria andFf61NotEqualTo(String value) {
            addCriterion("FF61 <>", value, "ff61");
            return (Criteria) this;
        }

        public Criteria andFf61GreaterThan(String value) {
            addCriterion("FF61 >", value, "ff61");
            return (Criteria) this;
        }

        public Criteria andFf61GreaterThanOrEqualTo(String value) {
            addCriterion("FF61 >=", value, "ff61");
            return (Criteria) this;
        }

        public Criteria andFf61LessThan(String value) {
            addCriterion("FF61 <", value, "ff61");
            return (Criteria) this;
        }

        public Criteria andFf61LessThanOrEqualTo(String value) {
            addCriterion("FF61 <=", value, "ff61");
            return (Criteria) this;
        }

        public Criteria andFf61Like(String value) {
            addCriterion("FF61 like", value, "ff61");
            return (Criteria) this;
        }

        public Criteria andFf61NotLike(String value) {
            addCriterion("FF61 not like", value, "ff61");
            return (Criteria) this;
        }

        public Criteria andFf61In(List<String> values) {
            addCriterion("FF61 in", values, "ff61");
            return (Criteria) this;
        }

        public Criteria andFf61NotIn(List<String> values) {
            addCriterion("FF61 not in", values, "ff61");
            return (Criteria) this;
        }

        public Criteria andFf61Between(String value1, String value2) {
            addCriterion("FF61 between", value1, value2, "ff61");
            return (Criteria) this;
        }

        public Criteria andFf61NotBetween(String value1, String value2) {
            addCriterion("FF61 not between", value1, value2, "ff61");
            return (Criteria) this;
        }

        public Criteria andFf62IsNull() {
            addCriterion("FF62 is null");
            return (Criteria) this;
        }

        public Criteria andFf62IsNotNull() {
            addCriterion("FF62 is not null");
            return (Criteria) this;
        }

        public Criteria andFf62EqualTo(String value) {
            addCriterion("FF62 =", value, "ff62");
            return (Criteria) this;
        }

        public Criteria andFf62NotEqualTo(String value) {
            addCriterion("FF62 <>", value, "ff62");
            return (Criteria) this;
        }

        public Criteria andFf62GreaterThan(String value) {
            addCriterion("FF62 >", value, "ff62");
            return (Criteria) this;
        }

        public Criteria andFf62GreaterThanOrEqualTo(String value) {
            addCriterion("FF62 >=", value, "ff62");
            return (Criteria) this;
        }

        public Criteria andFf62LessThan(String value) {
            addCriterion("FF62 <", value, "ff62");
            return (Criteria) this;
        }

        public Criteria andFf62LessThanOrEqualTo(String value) {
            addCriterion("FF62 <=", value, "ff62");
            return (Criteria) this;
        }

        public Criteria andFf62Like(String value) {
            addCriterion("FF62 like", value, "ff62");
            return (Criteria) this;
        }

        public Criteria andFf62NotLike(String value) {
            addCriterion("FF62 not like", value, "ff62");
            return (Criteria) this;
        }

        public Criteria andFf62In(List<String> values) {
            addCriterion("FF62 in", values, "ff62");
            return (Criteria) this;
        }

        public Criteria andFf62NotIn(List<String> values) {
            addCriterion("FF62 not in", values, "ff62");
            return (Criteria) this;
        }

        public Criteria andFf62Between(String value1, String value2) {
            addCriterion("FF62 between", value1, value2, "ff62");
            return (Criteria) this;
        }

        public Criteria andFf62NotBetween(String value1, String value2) {
            addCriterion("FF62 not between", value1, value2, "ff62");
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