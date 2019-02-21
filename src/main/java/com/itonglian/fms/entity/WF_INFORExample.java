package com.itonglian.fms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WF_INFORExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WF_INFORExample() {
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

        public Criteria andWi00IsNull() {
            addCriterion("WI00 is null");
            return (Criteria) this;
        }

        public Criteria andWi00IsNotNull() {
            addCriterion("WI00 is not null");
            return (Criteria) this;
        }

        public Criteria andWi00EqualTo(Long value) {
            addCriterion("WI00 =", value, "wi00");
            return (Criteria) this;
        }

        public Criteria andWi00NotEqualTo(Long value) {
            addCriterion("WI00 <>", value, "wi00");
            return (Criteria) this;
        }

        public Criteria andWi00GreaterThan(Long value) {
            addCriterion("WI00 >", value, "wi00");
            return (Criteria) this;
        }

        public Criteria andWi00GreaterThanOrEqualTo(Long value) {
            addCriterion("WI00 >=", value, "wi00");
            return (Criteria) this;
        }

        public Criteria andWi00LessThan(Long value) {
            addCriterion("WI00 <", value, "wi00");
            return (Criteria) this;
        }

        public Criteria andWi00LessThanOrEqualTo(Long value) {
            addCriterion("WI00 <=", value, "wi00");
            return (Criteria) this;
        }

        public Criteria andWi00In(List<Long> values) {
            addCriterion("WI00 in", values, "wi00");
            return (Criteria) this;
        }

        public Criteria andWi00NotIn(List<Long> values) {
            addCriterion("WI00 not in", values, "wi00");
            return (Criteria) this;
        }

        public Criteria andWi00Between(Long value1, Long value2) {
            addCriterion("WI00 between", value1, value2, "wi00");
            return (Criteria) this;
        }

        public Criteria andWi00NotBetween(Long value1, Long value2) {
            addCriterion("WI00 not between", value1, value2, "wi00");
            return (Criteria) this;
        }

        public Criteria andWi01IsNull() {
            addCriterion("WI01 is null");
            return (Criteria) this;
        }

        public Criteria andWi01IsNotNull() {
            addCriterion("WI01 is not null");
            return (Criteria) this;
        }

        public Criteria andWi01EqualTo(Long value) {
            addCriterion("WI01 =", value, "wi01");
            return (Criteria) this;
        }

        public Criteria andWi01NotEqualTo(Long value) {
            addCriterion("WI01 <>", value, "wi01");
            return (Criteria) this;
        }

        public Criteria andWi01GreaterThan(Long value) {
            addCriterion("WI01 >", value, "wi01");
            return (Criteria) this;
        }

        public Criteria andWi01GreaterThanOrEqualTo(Long value) {
            addCriterion("WI01 >=", value, "wi01");
            return (Criteria) this;
        }

        public Criteria andWi01LessThan(Long value) {
            addCriterion("WI01 <", value, "wi01");
            return (Criteria) this;
        }

        public Criteria andWi01LessThanOrEqualTo(Long value) {
            addCriterion("WI01 <=", value, "wi01");
            return (Criteria) this;
        }

        public Criteria andWi01In(List<Long> values) {
            addCriterion("WI01 in", values, "wi01");
            return (Criteria) this;
        }

        public Criteria andWi01NotIn(List<Long> values) {
            addCriterion("WI01 not in", values, "wi01");
            return (Criteria) this;
        }

        public Criteria andWi01Between(Long value1, Long value2) {
            addCriterion("WI01 between", value1, value2, "wi01");
            return (Criteria) this;
        }

        public Criteria andWi01NotBetween(Long value1, Long value2) {
            addCriterion("WI01 not between", value1, value2, "wi01");
            return (Criteria) this;
        }

        public Criteria andWi02IsNull() {
            addCriterion("WI02 is null");
            return (Criteria) this;
        }

        public Criteria andWi02IsNotNull() {
            addCriterion("WI02 is not null");
            return (Criteria) this;
        }

        public Criteria andWi02EqualTo(String value) {
            addCriterion("WI02 =", value, "wi02");
            return (Criteria) this;
        }

        public Criteria andWi02NotEqualTo(String value) {
            addCriterion("WI02 <>", value, "wi02");
            return (Criteria) this;
        }

        public Criteria andWi02GreaterThan(String value) {
            addCriterion("WI02 >", value, "wi02");
            return (Criteria) this;
        }

        public Criteria andWi02GreaterThanOrEqualTo(String value) {
            addCriterion("WI02 >=", value, "wi02");
            return (Criteria) this;
        }

        public Criteria andWi02LessThan(String value) {
            addCriterion("WI02 <", value, "wi02");
            return (Criteria) this;
        }

        public Criteria andWi02LessThanOrEqualTo(String value) {
            addCriterion("WI02 <=", value, "wi02");
            return (Criteria) this;
        }

        public Criteria andWi02Like(String value) {
            addCriterion("WI02 like", value, "wi02");
            return (Criteria) this;
        }

        public Criteria andWi02NotLike(String value) {
            addCriterion("WI02 not like", value, "wi02");
            return (Criteria) this;
        }

        public Criteria andWi02In(List<String> values) {
            addCriterion("WI02 in", values, "wi02");
            return (Criteria) this;
        }

        public Criteria andWi02NotIn(List<String> values) {
            addCriterion("WI02 not in", values, "wi02");
            return (Criteria) this;
        }

        public Criteria andWi02Between(String value1, String value2) {
            addCriterion("WI02 between", value1, value2, "wi02");
            return (Criteria) this;
        }

        public Criteria andWi02NotBetween(String value1, String value2) {
            addCriterion("WI02 not between", value1, value2, "wi02");
            return (Criteria) this;
        }

        public Criteria andWi03IsNull() {
            addCriterion("WI03 is null");
            return (Criteria) this;
        }

        public Criteria andWi03IsNotNull() {
            addCriterion("WI03 is not null");
            return (Criteria) this;
        }

        public Criteria andWi03EqualTo(Long value) {
            addCriterion("WI03 =", value, "wi03");
            return (Criteria) this;
        }

        public Criteria andWi03NotEqualTo(Long value) {
            addCriterion("WI03 <>", value, "wi03");
            return (Criteria) this;
        }

        public Criteria andWi03GreaterThan(Long value) {
            addCriterion("WI03 >", value, "wi03");
            return (Criteria) this;
        }

        public Criteria andWi03GreaterThanOrEqualTo(Long value) {
            addCriterion("WI03 >=", value, "wi03");
            return (Criteria) this;
        }

        public Criteria andWi03LessThan(Long value) {
            addCriterion("WI03 <", value, "wi03");
            return (Criteria) this;
        }

        public Criteria andWi03LessThanOrEqualTo(Long value) {
            addCriterion("WI03 <=", value, "wi03");
            return (Criteria) this;
        }

        public Criteria andWi03In(List<Long> values) {
            addCriterion("WI03 in", values, "wi03");
            return (Criteria) this;
        }

        public Criteria andWi03NotIn(List<Long> values) {
            addCriterion("WI03 not in", values, "wi03");
            return (Criteria) this;
        }

        public Criteria andWi03Between(Long value1, Long value2) {
            addCriterion("WI03 between", value1, value2, "wi03");
            return (Criteria) this;
        }

        public Criteria andWi03NotBetween(Long value1, Long value2) {
            addCriterion("WI03 not between", value1, value2, "wi03");
            return (Criteria) this;
        }

        public Criteria andWi04IsNull() {
            addCriterion("WI04 is null");
            return (Criteria) this;
        }

        public Criteria andWi04IsNotNull() {
            addCriterion("WI04 is not null");
            return (Criteria) this;
        }

        public Criteria andWi04EqualTo(String value) {
            addCriterion("WI04 =", value, "wi04");
            return (Criteria) this;
        }

        public Criteria andWi04NotEqualTo(String value) {
            addCriterion("WI04 <>", value, "wi04");
            return (Criteria) this;
        }

        public Criteria andWi04GreaterThan(String value) {
            addCriterion("WI04 >", value, "wi04");
            return (Criteria) this;
        }

        public Criteria andWi04GreaterThanOrEqualTo(String value) {
            addCriterion("WI04 >=", value, "wi04");
            return (Criteria) this;
        }

        public Criteria andWi04LessThan(String value) {
            addCriterion("WI04 <", value, "wi04");
            return (Criteria) this;
        }

        public Criteria andWi04LessThanOrEqualTo(String value) {
            addCriterion("WI04 <=", value, "wi04");
            return (Criteria) this;
        }

        public Criteria andWi04Like(String value) {
            addCriterion("WI04 like", value, "wi04");
            return (Criteria) this;
        }

        public Criteria andWi04NotLike(String value) {
            addCriterion("WI04 not like", value, "wi04");
            return (Criteria) this;
        }

        public Criteria andWi04In(List<String> values) {
            addCriterion("WI04 in", values, "wi04");
            return (Criteria) this;
        }

        public Criteria andWi04NotIn(List<String> values) {
            addCriterion("WI04 not in", values, "wi04");
            return (Criteria) this;
        }

        public Criteria andWi04Between(String value1, String value2) {
            addCriterion("WI04 between", value1, value2, "wi04");
            return (Criteria) this;
        }

        public Criteria andWi04NotBetween(String value1, String value2) {
            addCriterion("WI04 not between", value1, value2, "wi04");
            return (Criteria) this;
        }

        public Criteria andWi05IsNull() {
            addCriterion("WI05 is null");
            return (Criteria) this;
        }

        public Criteria andWi05IsNotNull() {
            addCriterion("WI05 is not null");
            return (Criteria) this;
        }

        public Criteria andWi05EqualTo(String value) {
            addCriterion("WI05 =", value, "wi05");
            return (Criteria) this;
        }

        public Criteria andWi05NotEqualTo(String value) {
            addCriterion("WI05 <>", value, "wi05");
            return (Criteria) this;
        }

        public Criteria andWi05GreaterThan(String value) {
            addCriterion("WI05 >", value, "wi05");
            return (Criteria) this;
        }

        public Criteria andWi05GreaterThanOrEqualTo(String value) {
            addCriterion("WI05 >=", value, "wi05");
            return (Criteria) this;
        }

        public Criteria andWi05LessThan(String value) {
            addCriterion("WI05 <", value, "wi05");
            return (Criteria) this;
        }

        public Criteria andWi05LessThanOrEqualTo(String value) {
            addCriterion("WI05 <=", value, "wi05");
            return (Criteria) this;
        }

        public Criteria andWi05Like(String value) {
            addCriterion("WI05 like", value, "wi05");
            return (Criteria) this;
        }

        public Criteria andWi05NotLike(String value) {
            addCriterion("WI05 not like", value, "wi05");
            return (Criteria) this;
        }

        public Criteria andWi05In(List<String> values) {
            addCriterion("WI05 in", values, "wi05");
            return (Criteria) this;
        }

        public Criteria andWi05NotIn(List<String> values) {
            addCriterion("WI05 not in", values, "wi05");
            return (Criteria) this;
        }

        public Criteria andWi05Between(String value1, String value2) {
            addCriterion("WI05 between", value1, value2, "wi05");
            return (Criteria) this;
        }

        public Criteria andWi05NotBetween(String value1, String value2) {
            addCriterion("WI05 not between", value1, value2, "wi05");
            return (Criteria) this;
        }

        public Criteria andWi06IsNull() {
            addCriterion("WI06 is null");
            return (Criteria) this;
        }

        public Criteria andWi06IsNotNull() {
            addCriterion("WI06 is not null");
            return (Criteria) this;
        }

        public Criteria andWi06EqualTo(String value) {
            addCriterion("WI06 =", value, "wi06");
            return (Criteria) this;
        }

        public Criteria andWi06NotEqualTo(String value) {
            addCriterion("WI06 <>", value, "wi06");
            return (Criteria) this;
        }

        public Criteria andWi06GreaterThan(String value) {
            addCriterion("WI06 >", value, "wi06");
            return (Criteria) this;
        }

        public Criteria andWi06GreaterThanOrEqualTo(String value) {
            addCriterion("WI06 >=", value, "wi06");
            return (Criteria) this;
        }

        public Criteria andWi06LessThan(String value) {
            addCriterion("WI06 <", value, "wi06");
            return (Criteria) this;
        }

        public Criteria andWi06LessThanOrEqualTo(String value) {
            addCriterion("WI06 <=", value, "wi06");
            return (Criteria) this;
        }

        public Criteria andWi06Like(String value) {
            addCriterion("WI06 like", value, "wi06");
            return (Criteria) this;
        }

        public Criteria andWi06NotLike(String value) {
            addCriterion("WI06 not like", value, "wi06");
            return (Criteria) this;
        }

        public Criteria andWi06In(List<String> values) {
            addCriterion("WI06 in", values, "wi06");
            return (Criteria) this;
        }

        public Criteria andWi06NotIn(List<String> values) {
            addCriterion("WI06 not in", values, "wi06");
            return (Criteria) this;
        }

        public Criteria andWi06Between(String value1, String value2) {
            addCriterion("WI06 between", value1, value2, "wi06");
            return (Criteria) this;
        }

        public Criteria andWi06NotBetween(String value1, String value2) {
            addCriterion("WI06 not between", value1, value2, "wi06");
            return (Criteria) this;
        }

        public Criteria andWi07IsNull() {
            addCriterion("WI07 is null");
            return (Criteria) this;
        }

        public Criteria andWi07IsNotNull() {
            addCriterion("WI07 is not null");
            return (Criteria) this;
        }

        public Criteria andWi07EqualTo(String value) {
            addCriterion("WI07 =", value, "wi07");
            return (Criteria) this;
        }

        public Criteria andWi07NotEqualTo(String value) {
            addCriterion("WI07 <>", value, "wi07");
            return (Criteria) this;
        }

        public Criteria andWi07GreaterThan(String value) {
            addCriterion("WI07 >", value, "wi07");
            return (Criteria) this;
        }

        public Criteria andWi07GreaterThanOrEqualTo(String value) {
            addCriterion("WI07 >=", value, "wi07");
            return (Criteria) this;
        }

        public Criteria andWi07LessThan(String value) {
            addCriterion("WI07 <", value, "wi07");
            return (Criteria) this;
        }

        public Criteria andWi07LessThanOrEqualTo(String value) {
            addCriterion("WI07 <=", value, "wi07");
            return (Criteria) this;
        }

        public Criteria andWi07Like(String value) {
            addCriterion("WI07 like", value, "wi07");
            return (Criteria) this;
        }

        public Criteria andWi07NotLike(String value) {
            addCriterion("WI07 not like", value, "wi07");
            return (Criteria) this;
        }

        public Criteria andWi07In(List<String> values) {
            addCriterion("WI07 in", values, "wi07");
            return (Criteria) this;
        }

        public Criteria andWi07NotIn(List<String> values) {
            addCriterion("WI07 not in", values, "wi07");
            return (Criteria) this;
        }

        public Criteria andWi07Between(String value1, String value2) {
            addCriterion("WI07 between", value1, value2, "wi07");
            return (Criteria) this;
        }

        public Criteria andWi07NotBetween(String value1, String value2) {
            addCriterion("WI07 not between", value1, value2, "wi07");
            return (Criteria) this;
        }

        public Criteria andWi08IsNull() {
            addCriterion("WI08 is null");
            return (Criteria) this;
        }

        public Criteria andWi08IsNotNull() {
            addCriterion("WI08 is not null");
            return (Criteria) this;
        }

        public Criteria andWi08EqualTo(Date value) {
            addCriterion("WI08 =", value, "wi08");
            return (Criteria) this;
        }

        public Criteria andWi08NotEqualTo(Date value) {
            addCriterion("WI08 <>", value, "wi08");
            return (Criteria) this;
        }

        public Criteria andWi08GreaterThan(Date value) {
            addCriterion("WI08 >", value, "wi08");
            return (Criteria) this;
        }

        public Criteria andWi08GreaterThanOrEqualTo(Date value) {
            addCriterion("WI08 >=", value, "wi08");
            return (Criteria) this;
        }

        public Criteria andWi08LessThan(Date value) {
            addCriterion("WI08 <", value, "wi08");
            return (Criteria) this;
        }

        public Criteria andWi08LessThanOrEqualTo(Date value) {
            addCriterion("WI08 <=", value, "wi08");
            return (Criteria) this;
        }

        public Criteria andWi08In(List<Date> values) {
            addCriterion("WI08 in", values, "wi08");
            return (Criteria) this;
        }

        public Criteria andWi08NotIn(List<Date> values) {
            addCriterion("WI08 not in", values, "wi08");
            return (Criteria) this;
        }

        public Criteria andWi08Between(Date value1, Date value2) {
            addCriterion("WI08 between", value1, value2, "wi08");
            return (Criteria) this;
        }

        public Criteria andWi08NotBetween(Date value1, Date value2) {
            addCriterion("WI08 not between", value1, value2, "wi08");
            return (Criteria) this;
        }

        public Criteria andWi09IsNull() {
            addCriterion("WI09 is null");
            return (Criteria) this;
        }

        public Criteria andWi09IsNotNull() {
            addCriterion("WI09 is not null");
            return (Criteria) this;
        }

        public Criteria andWi09EqualTo(String value) {
            addCriterion("WI09 =", value, "wi09");
            return (Criteria) this;
        }

        public Criteria andWi09NotEqualTo(String value) {
            addCriterion("WI09 <>", value, "wi09");
            return (Criteria) this;
        }

        public Criteria andWi09GreaterThan(String value) {
            addCriterion("WI09 >", value, "wi09");
            return (Criteria) this;
        }

        public Criteria andWi09GreaterThanOrEqualTo(String value) {
            addCriterion("WI09 >=", value, "wi09");
            return (Criteria) this;
        }

        public Criteria andWi09LessThan(String value) {
            addCriterion("WI09 <", value, "wi09");
            return (Criteria) this;
        }

        public Criteria andWi09LessThanOrEqualTo(String value) {
            addCriterion("WI09 <=", value, "wi09");
            return (Criteria) this;
        }

        public Criteria andWi09Like(String value) {
            addCriterion("WI09 like", value, "wi09");
            return (Criteria) this;
        }

        public Criteria andWi09NotLike(String value) {
            addCriterion("WI09 not like", value, "wi09");
            return (Criteria) this;
        }

        public Criteria andWi09In(List<String> values) {
            addCriterion("WI09 in", values, "wi09");
            return (Criteria) this;
        }

        public Criteria andWi09NotIn(List<String> values) {
            addCriterion("WI09 not in", values, "wi09");
            return (Criteria) this;
        }

        public Criteria andWi09Between(String value1, String value2) {
            addCriterion("WI09 between", value1, value2, "wi09");
            return (Criteria) this;
        }

        public Criteria andWi09NotBetween(String value1, String value2) {
            addCriterion("WI09 not between", value1, value2, "wi09");
            return (Criteria) this;
        }

        public Criteria andWi10IsNull() {
            addCriterion("WI10 is null");
            return (Criteria) this;
        }

        public Criteria andWi10IsNotNull() {
            addCriterion("WI10 is not null");
            return (Criteria) this;
        }

        public Criteria andWi10EqualTo(String value) {
            addCriterion("WI10 =", value, "wi10");
            return (Criteria) this;
        }

        public Criteria andWi10NotEqualTo(String value) {
            addCriterion("WI10 <>", value, "wi10");
            return (Criteria) this;
        }

        public Criteria andWi10GreaterThan(String value) {
            addCriterion("WI10 >", value, "wi10");
            return (Criteria) this;
        }

        public Criteria andWi10GreaterThanOrEqualTo(String value) {
            addCriterion("WI10 >=", value, "wi10");
            return (Criteria) this;
        }

        public Criteria andWi10LessThan(String value) {
            addCriterion("WI10 <", value, "wi10");
            return (Criteria) this;
        }

        public Criteria andWi10LessThanOrEqualTo(String value) {
            addCriterion("WI10 <=", value, "wi10");
            return (Criteria) this;
        }

        public Criteria andWi10Like(String value) {
            addCriterion("WI10 like", value, "wi10");
            return (Criteria) this;
        }

        public Criteria andWi10NotLike(String value) {
            addCriterion("WI10 not like", value, "wi10");
            return (Criteria) this;
        }

        public Criteria andWi10In(List<String> values) {
            addCriterion("WI10 in", values, "wi10");
            return (Criteria) this;
        }

        public Criteria andWi10NotIn(List<String> values) {
            addCriterion("WI10 not in", values, "wi10");
            return (Criteria) this;
        }

        public Criteria andWi10Between(String value1, String value2) {
            addCriterion("WI10 between", value1, value2, "wi10");
            return (Criteria) this;
        }

        public Criteria andWi10NotBetween(String value1, String value2) {
            addCriterion("WI10 not between", value1, value2, "wi10");
            return (Criteria) this;
        }

        public Criteria andWi11IsNull() {
            addCriterion("WI11 is null");
            return (Criteria) this;
        }

        public Criteria andWi11IsNotNull() {
            addCriterion("WI11 is not null");
            return (Criteria) this;
        }

        public Criteria andWi11EqualTo(Date value) {
            addCriterion("WI11 =", value, "wi11");
            return (Criteria) this;
        }

        public Criteria andWi11NotEqualTo(Date value) {
            addCriterion("WI11 <>", value, "wi11");
            return (Criteria) this;
        }

        public Criteria andWi11GreaterThan(Date value) {
            addCriterion("WI11 >", value, "wi11");
            return (Criteria) this;
        }

        public Criteria andWi11GreaterThanOrEqualTo(Date value) {
            addCriterion("WI11 >=", value, "wi11");
            return (Criteria) this;
        }

        public Criteria andWi11LessThan(Date value) {
            addCriterion("WI11 <", value, "wi11");
            return (Criteria) this;
        }

        public Criteria andWi11LessThanOrEqualTo(Date value) {
            addCriterion("WI11 <=", value, "wi11");
            return (Criteria) this;
        }

        public Criteria andWi11In(List<Date> values) {
            addCriterion("WI11 in", values, "wi11");
            return (Criteria) this;
        }

        public Criteria andWi11NotIn(List<Date> values) {
            addCriterion("WI11 not in", values, "wi11");
            return (Criteria) this;
        }

        public Criteria andWi11Between(Date value1, Date value2) {
            addCriterion("WI11 between", value1, value2, "wi11");
            return (Criteria) this;
        }

        public Criteria andWi11NotBetween(Date value1, Date value2) {
            addCriterion("WI11 not between", value1, value2, "wi11");
            return (Criteria) this;
        }

        public Criteria andWi12IsNull() {
            addCriterion("WI12 is null");
            return (Criteria) this;
        }

        public Criteria andWi12IsNotNull() {
            addCriterion("WI12 is not null");
            return (Criteria) this;
        }

        public Criteria andWi12EqualTo(String value) {
            addCriterion("WI12 =", value, "wi12");
            return (Criteria) this;
        }

        public Criteria andWi12NotEqualTo(String value) {
            addCriterion("WI12 <>", value, "wi12");
            return (Criteria) this;
        }

        public Criteria andWi12GreaterThan(String value) {
            addCriterion("WI12 >", value, "wi12");
            return (Criteria) this;
        }

        public Criteria andWi12GreaterThanOrEqualTo(String value) {
            addCriterion("WI12 >=", value, "wi12");
            return (Criteria) this;
        }

        public Criteria andWi12LessThan(String value) {
            addCriterion("WI12 <", value, "wi12");
            return (Criteria) this;
        }

        public Criteria andWi12LessThanOrEqualTo(String value) {
            addCriterion("WI12 <=", value, "wi12");
            return (Criteria) this;
        }

        public Criteria andWi12Like(String value) {
            addCriterion("WI12 like", value, "wi12");
            return (Criteria) this;
        }

        public Criteria andWi12NotLike(String value) {
            addCriterion("WI12 not like", value, "wi12");
            return (Criteria) this;
        }

        public Criteria andWi12In(List<String> values) {
            addCriterion("WI12 in", values, "wi12");
            return (Criteria) this;
        }

        public Criteria andWi12NotIn(List<String> values) {
            addCriterion("WI12 not in", values, "wi12");
            return (Criteria) this;
        }

        public Criteria andWi12Between(String value1, String value2) {
            addCriterion("WI12 between", value1, value2, "wi12");
            return (Criteria) this;
        }

        public Criteria andWi12NotBetween(String value1, String value2) {
            addCriterion("WI12 not between", value1, value2, "wi12");
            return (Criteria) this;
        }

        public Criteria andWi13IsNull() {
            addCriterion("WI13 is null");
            return (Criteria) this;
        }

        public Criteria andWi13IsNotNull() {
            addCriterion("WI13 is not null");
            return (Criteria) this;
        }

        public Criteria andWi13EqualTo(String value) {
            addCriterion("WI13 =", value, "wi13");
            return (Criteria) this;
        }

        public Criteria andWi13NotEqualTo(String value) {
            addCriterion("WI13 <>", value, "wi13");
            return (Criteria) this;
        }

        public Criteria andWi13GreaterThan(String value) {
            addCriterion("WI13 >", value, "wi13");
            return (Criteria) this;
        }

        public Criteria andWi13GreaterThanOrEqualTo(String value) {
            addCriterion("WI13 >=", value, "wi13");
            return (Criteria) this;
        }

        public Criteria andWi13LessThan(String value) {
            addCriterion("WI13 <", value, "wi13");
            return (Criteria) this;
        }

        public Criteria andWi13LessThanOrEqualTo(String value) {
            addCriterion("WI13 <=", value, "wi13");
            return (Criteria) this;
        }

        public Criteria andWi13Like(String value) {
            addCriterion("WI13 like", value, "wi13");
            return (Criteria) this;
        }

        public Criteria andWi13NotLike(String value) {
            addCriterion("WI13 not like", value, "wi13");
            return (Criteria) this;
        }

        public Criteria andWi13In(List<String> values) {
            addCriterion("WI13 in", values, "wi13");
            return (Criteria) this;
        }

        public Criteria andWi13NotIn(List<String> values) {
            addCriterion("WI13 not in", values, "wi13");
            return (Criteria) this;
        }

        public Criteria andWi13Between(String value1, String value2) {
            addCriterion("WI13 between", value1, value2, "wi13");
            return (Criteria) this;
        }

        public Criteria andWi13NotBetween(String value1, String value2) {
            addCriterion("WI13 not between", value1, value2, "wi13");
            return (Criteria) this;
        }

        public Criteria andWi14IsNull() {
            addCriterion("WI14 is null");
            return (Criteria) this;
        }

        public Criteria andWi14IsNotNull() {
            addCriterion("WI14 is not null");
            return (Criteria) this;
        }

        public Criteria andWi14EqualTo(Long value) {
            addCriterion("WI14 =", value, "wi14");
            return (Criteria) this;
        }

        public Criteria andWi14NotEqualTo(Long value) {
            addCriterion("WI14 <>", value, "wi14");
            return (Criteria) this;
        }

        public Criteria andWi14GreaterThan(Long value) {
            addCriterion("WI14 >", value, "wi14");
            return (Criteria) this;
        }

        public Criteria andWi14GreaterThanOrEqualTo(Long value) {
            addCriterion("WI14 >=", value, "wi14");
            return (Criteria) this;
        }

        public Criteria andWi14LessThan(Long value) {
            addCriterion("WI14 <", value, "wi14");
            return (Criteria) this;
        }

        public Criteria andWi14LessThanOrEqualTo(Long value) {
            addCriterion("WI14 <=", value, "wi14");
            return (Criteria) this;
        }

        public Criteria andWi14In(List<Long> values) {
            addCriterion("WI14 in", values, "wi14");
            return (Criteria) this;
        }

        public Criteria andWi14NotIn(List<Long> values) {
            addCriterion("WI14 not in", values, "wi14");
            return (Criteria) this;
        }

        public Criteria andWi14Between(Long value1, Long value2) {
            addCriterion("WI14 between", value1, value2, "wi14");
            return (Criteria) this;
        }

        public Criteria andWi14NotBetween(Long value1, Long value2) {
            addCriterion("WI14 not between", value1, value2, "wi14");
            return (Criteria) this;
        }

        public Criteria andWi15IsNull() {
            addCriterion("WI15 is null");
            return (Criteria) this;
        }

        public Criteria andWi15IsNotNull() {
            addCriterion("WI15 is not null");
            return (Criteria) this;
        }

        public Criteria andWi15EqualTo(String value) {
            addCriterion("WI15 =", value, "wi15");
            return (Criteria) this;
        }

        public Criteria andWi15NotEqualTo(String value) {
            addCriterion("WI15 <>", value, "wi15");
            return (Criteria) this;
        }

        public Criteria andWi15GreaterThan(String value) {
            addCriterion("WI15 >", value, "wi15");
            return (Criteria) this;
        }

        public Criteria andWi15GreaterThanOrEqualTo(String value) {
            addCriterion("WI15 >=", value, "wi15");
            return (Criteria) this;
        }

        public Criteria andWi15LessThan(String value) {
            addCriterion("WI15 <", value, "wi15");
            return (Criteria) this;
        }

        public Criteria andWi15LessThanOrEqualTo(String value) {
            addCriterion("WI15 <=", value, "wi15");
            return (Criteria) this;
        }

        public Criteria andWi15Like(String value) {
            addCriterion("WI15 like", value, "wi15");
            return (Criteria) this;
        }

        public Criteria andWi15NotLike(String value) {
            addCriterion("WI15 not like", value, "wi15");
            return (Criteria) this;
        }

        public Criteria andWi15In(List<String> values) {
            addCriterion("WI15 in", values, "wi15");
            return (Criteria) this;
        }

        public Criteria andWi15NotIn(List<String> values) {
            addCriterion("WI15 not in", values, "wi15");
            return (Criteria) this;
        }

        public Criteria andWi15Between(String value1, String value2) {
            addCriterion("WI15 between", value1, value2, "wi15");
            return (Criteria) this;
        }

        public Criteria andWi15NotBetween(String value1, String value2) {
            addCriterion("WI15 not between", value1, value2, "wi15");
            return (Criteria) this;
        }

        public Criteria andWi16IsNull() {
            addCriterion("WI16 is null");
            return (Criteria) this;
        }

        public Criteria andWi16IsNotNull() {
            addCriterion("WI16 is not null");
            return (Criteria) this;
        }

        public Criteria andWi16EqualTo(String value) {
            addCriterion("WI16 =", value, "wi16");
            return (Criteria) this;
        }

        public Criteria andWi16NotEqualTo(String value) {
            addCriterion("WI16 <>", value, "wi16");
            return (Criteria) this;
        }

        public Criteria andWi16GreaterThan(String value) {
            addCriterion("WI16 >", value, "wi16");
            return (Criteria) this;
        }

        public Criteria andWi16GreaterThanOrEqualTo(String value) {
            addCriterion("WI16 >=", value, "wi16");
            return (Criteria) this;
        }

        public Criteria andWi16LessThan(String value) {
            addCriterion("WI16 <", value, "wi16");
            return (Criteria) this;
        }

        public Criteria andWi16LessThanOrEqualTo(String value) {
            addCriterion("WI16 <=", value, "wi16");
            return (Criteria) this;
        }

        public Criteria andWi16Like(String value) {
            addCriterion("WI16 like", value, "wi16");
            return (Criteria) this;
        }

        public Criteria andWi16NotLike(String value) {
            addCriterion("WI16 not like", value, "wi16");
            return (Criteria) this;
        }

        public Criteria andWi16In(List<String> values) {
            addCriterion("WI16 in", values, "wi16");
            return (Criteria) this;
        }

        public Criteria andWi16NotIn(List<String> values) {
            addCriterion("WI16 not in", values, "wi16");
            return (Criteria) this;
        }

        public Criteria andWi16Between(String value1, String value2) {
            addCriterion("WI16 between", value1, value2, "wi16");
            return (Criteria) this;
        }

        public Criteria andWi16NotBetween(String value1, String value2) {
            addCriterion("WI16 not between", value1, value2, "wi16");
            return (Criteria) this;
        }

        public Criteria andWi17IsNull() {
            addCriterion("WI17 is null");
            return (Criteria) this;
        }

        public Criteria andWi17IsNotNull() {
            addCriterion("WI17 is not null");
            return (Criteria) this;
        }

        public Criteria andWi17EqualTo(String value) {
            addCriterion("WI17 =", value, "wi17");
            return (Criteria) this;
        }

        public Criteria andWi17NotEqualTo(String value) {
            addCriterion("WI17 <>", value, "wi17");
            return (Criteria) this;
        }

        public Criteria andWi17GreaterThan(String value) {
            addCriterion("WI17 >", value, "wi17");
            return (Criteria) this;
        }

        public Criteria andWi17GreaterThanOrEqualTo(String value) {
            addCriterion("WI17 >=", value, "wi17");
            return (Criteria) this;
        }

        public Criteria andWi17LessThan(String value) {
            addCriterion("WI17 <", value, "wi17");
            return (Criteria) this;
        }

        public Criteria andWi17LessThanOrEqualTo(String value) {
            addCriterion("WI17 <=", value, "wi17");
            return (Criteria) this;
        }

        public Criteria andWi17Like(String value) {
            addCriterion("WI17 like", value, "wi17");
            return (Criteria) this;
        }

        public Criteria andWi17NotLike(String value) {
            addCriterion("WI17 not like", value, "wi17");
            return (Criteria) this;
        }

        public Criteria andWi17In(List<String> values) {
            addCriterion("WI17 in", values, "wi17");
            return (Criteria) this;
        }

        public Criteria andWi17NotIn(List<String> values) {
            addCriterion("WI17 not in", values, "wi17");
            return (Criteria) this;
        }

        public Criteria andWi17Between(String value1, String value2) {
            addCriterion("WI17 between", value1, value2, "wi17");
            return (Criteria) this;
        }

        public Criteria andWi17NotBetween(String value1, String value2) {
            addCriterion("WI17 not between", value1, value2, "wi17");
            return (Criteria) this;
        }

        public Criteria andWi18IsNull() {
            addCriterion("WI18 is null");
            return (Criteria) this;
        }

        public Criteria andWi18IsNotNull() {
            addCriterion("WI18 is not null");
            return (Criteria) this;
        }

        public Criteria andWi18EqualTo(String value) {
            addCriterion("WI18 =", value, "wi18");
            return (Criteria) this;
        }

        public Criteria andWi18NotEqualTo(String value) {
            addCriterion("WI18 <>", value, "wi18");
            return (Criteria) this;
        }

        public Criteria andWi18GreaterThan(String value) {
            addCriterion("WI18 >", value, "wi18");
            return (Criteria) this;
        }

        public Criteria andWi18GreaterThanOrEqualTo(String value) {
            addCriterion("WI18 >=", value, "wi18");
            return (Criteria) this;
        }

        public Criteria andWi18LessThan(String value) {
            addCriterion("WI18 <", value, "wi18");
            return (Criteria) this;
        }

        public Criteria andWi18LessThanOrEqualTo(String value) {
            addCriterion("WI18 <=", value, "wi18");
            return (Criteria) this;
        }

        public Criteria andWi18Like(String value) {
            addCriterion("WI18 like", value, "wi18");
            return (Criteria) this;
        }

        public Criteria andWi18NotLike(String value) {
            addCriterion("WI18 not like", value, "wi18");
            return (Criteria) this;
        }

        public Criteria andWi18In(List<String> values) {
            addCriterion("WI18 in", values, "wi18");
            return (Criteria) this;
        }

        public Criteria andWi18NotIn(List<String> values) {
            addCriterion("WI18 not in", values, "wi18");
            return (Criteria) this;
        }

        public Criteria andWi18Between(String value1, String value2) {
            addCriterion("WI18 between", value1, value2, "wi18");
            return (Criteria) this;
        }

        public Criteria andWi18NotBetween(String value1, String value2) {
            addCriterion("WI18 not between", value1, value2, "wi18");
            return (Criteria) this;
        }

        public Criteria andWi19IsNull() {
            addCriterion("WI19 is null");
            return (Criteria) this;
        }

        public Criteria andWi19IsNotNull() {
            addCriterion("WI19 is not null");
            return (Criteria) this;
        }

        public Criteria andWi19EqualTo(String value) {
            addCriterion("WI19 =", value, "wi19");
            return (Criteria) this;
        }

        public Criteria andWi19NotEqualTo(String value) {
            addCriterion("WI19 <>", value, "wi19");
            return (Criteria) this;
        }

        public Criteria andWi19GreaterThan(String value) {
            addCriterion("WI19 >", value, "wi19");
            return (Criteria) this;
        }

        public Criteria andWi19GreaterThanOrEqualTo(String value) {
            addCriterion("WI19 >=", value, "wi19");
            return (Criteria) this;
        }

        public Criteria andWi19LessThan(String value) {
            addCriterion("WI19 <", value, "wi19");
            return (Criteria) this;
        }

        public Criteria andWi19LessThanOrEqualTo(String value) {
            addCriterion("WI19 <=", value, "wi19");
            return (Criteria) this;
        }

        public Criteria andWi19Like(String value) {
            addCriterion("WI19 like", value, "wi19");
            return (Criteria) this;
        }

        public Criteria andWi19NotLike(String value) {
            addCriterion("WI19 not like", value, "wi19");
            return (Criteria) this;
        }

        public Criteria andWi19In(List<String> values) {
            addCriterion("WI19 in", values, "wi19");
            return (Criteria) this;
        }

        public Criteria andWi19NotIn(List<String> values) {
            addCriterion("WI19 not in", values, "wi19");
            return (Criteria) this;
        }

        public Criteria andWi19Between(String value1, String value2) {
            addCriterion("WI19 between", value1, value2, "wi19");
            return (Criteria) this;
        }

        public Criteria andWi19NotBetween(String value1, String value2) {
            addCriterion("WI19 not between", value1, value2, "wi19");
            return (Criteria) this;
        }

        public Criteria andWi20IsNull() {
            addCriterion("WI20 is null");
            return (Criteria) this;
        }

        public Criteria andWi20IsNotNull() {
            addCriterion("WI20 is not null");
            return (Criteria) this;
        }

        public Criteria andWi20EqualTo(String value) {
            addCriterion("WI20 =", value, "wi20");
            return (Criteria) this;
        }

        public Criteria andWi20NotEqualTo(String value) {
            addCriterion("WI20 <>", value, "wi20");
            return (Criteria) this;
        }

        public Criteria andWi20GreaterThan(String value) {
            addCriterion("WI20 >", value, "wi20");
            return (Criteria) this;
        }

        public Criteria andWi20GreaterThanOrEqualTo(String value) {
            addCriterion("WI20 >=", value, "wi20");
            return (Criteria) this;
        }

        public Criteria andWi20LessThan(String value) {
            addCriterion("WI20 <", value, "wi20");
            return (Criteria) this;
        }

        public Criteria andWi20LessThanOrEqualTo(String value) {
            addCriterion("WI20 <=", value, "wi20");
            return (Criteria) this;
        }

        public Criteria andWi20Like(String value) {
            addCriterion("WI20 like", value, "wi20");
            return (Criteria) this;
        }

        public Criteria andWi20NotLike(String value) {
            addCriterion("WI20 not like", value, "wi20");
            return (Criteria) this;
        }

        public Criteria andWi20In(List<String> values) {
            addCriterion("WI20 in", values, "wi20");
            return (Criteria) this;
        }

        public Criteria andWi20NotIn(List<String> values) {
            addCriterion("WI20 not in", values, "wi20");
            return (Criteria) this;
        }

        public Criteria andWi20Between(String value1, String value2) {
            addCriterion("WI20 between", value1, value2, "wi20");
            return (Criteria) this;
        }

        public Criteria andWi20NotBetween(String value1, String value2) {
            addCriterion("WI20 not between", value1, value2, "wi20");
            return (Criteria) this;
        }

        public Criteria andWi21IsNull() {
            addCriterion("WI21 is null");
            return (Criteria) this;
        }

        public Criteria andWi21IsNotNull() {
            addCriterion("WI21 is not null");
            return (Criteria) this;
        }

        public Criteria andWi21EqualTo(String value) {
            addCriterion("WI21 =", value, "wi21");
            return (Criteria) this;
        }

        public Criteria andWi21NotEqualTo(String value) {
            addCriterion("WI21 <>", value, "wi21");
            return (Criteria) this;
        }

        public Criteria andWi21GreaterThan(String value) {
            addCriterion("WI21 >", value, "wi21");
            return (Criteria) this;
        }

        public Criteria andWi21GreaterThanOrEqualTo(String value) {
            addCriterion("WI21 >=", value, "wi21");
            return (Criteria) this;
        }

        public Criteria andWi21LessThan(String value) {
            addCriterion("WI21 <", value, "wi21");
            return (Criteria) this;
        }

        public Criteria andWi21LessThanOrEqualTo(String value) {
            addCriterion("WI21 <=", value, "wi21");
            return (Criteria) this;
        }

        public Criteria andWi21Like(String value) {
            addCriterion("WI21 like", value, "wi21");
            return (Criteria) this;
        }

        public Criteria andWi21NotLike(String value) {
            addCriterion("WI21 not like", value, "wi21");
            return (Criteria) this;
        }

        public Criteria andWi21In(List<String> values) {
            addCriterion("WI21 in", values, "wi21");
            return (Criteria) this;
        }

        public Criteria andWi21NotIn(List<String> values) {
            addCriterion("WI21 not in", values, "wi21");
            return (Criteria) this;
        }

        public Criteria andWi21Between(String value1, String value2) {
            addCriterion("WI21 between", value1, value2, "wi21");
            return (Criteria) this;
        }

        public Criteria andWi21NotBetween(String value1, String value2) {
            addCriterion("WI21 not between", value1, value2, "wi21");
            return (Criteria) this;
        }

        public Criteria andWi22IsNull() {
            addCriterion("WI22 is null");
            return (Criteria) this;
        }

        public Criteria andWi22IsNotNull() {
            addCriterion("WI22 is not null");
            return (Criteria) this;
        }

        public Criteria andWi22EqualTo(String value) {
            addCriterion("WI22 =", value, "wi22");
            return (Criteria) this;
        }

        public Criteria andWi22NotEqualTo(String value) {
            addCriterion("WI22 <>", value, "wi22");
            return (Criteria) this;
        }

        public Criteria andWi22GreaterThan(String value) {
            addCriterion("WI22 >", value, "wi22");
            return (Criteria) this;
        }

        public Criteria andWi22GreaterThanOrEqualTo(String value) {
            addCriterion("WI22 >=", value, "wi22");
            return (Criteria) this;
        }

        public Criteria andWi22LessThan(String value) {
            addCriterion("WI22 <", value, "wi22");
            return (Criteria) this;
        }

        public Criteria andWi22LessThanOrEqualTo(String value) {
            addCriterion("WI22 <=", value, "wi22");
            return (Criteria) this;
        }

        public Criteria andWi22Like(String value) {
            addCriterion("WI22 like", value, "wi22");
            return (Criteria) this;
        }

        public Criteria andWi22NotLike(String value) {
            addCriterion("WI22 not like", value, "wi22");
            return (Criteria) this;
        }

        public Criteria andWi22In(List<String> values) {
            addCriterion("WI22 in", values, "wi22");
            return (Criteria) this;
        }

        public Criteria andWi22NotIn(List<String> values) {
            addCriterion("WI22 not in", values, "wi22");
            return (Criteria) this;
        }

        public Criteria andWi22Between(String value1, String value2) {
            addCriterion("WI22 between", value1, value2, "wi22");
            return (Criteria) this;
        }

        public Criteria andWi22NotBetween(String value1, String value2) {
            addCriterion("WI22 not between", value1, value2, "wi22");
            return (Criteria) this;
        }

        public Criteria andWi23IsNull() {
            addCriterion("WI23 is null");
            return (Criteria) this;
        }

        public Criteria andWi23IsNotNull() {
            addCriterion("WI23 is not null");
            return (Criteria) this;
        }

        public Criteria andWi23EqualTo(String value) {
            addCriterion("WI23 =", value, "wi23");
            return (Criteria) this;
        }

        public Criteria andWi23NotEqualTo(String value) {
            addCriterion("WI23 <>", value, "wi23");
            return (Criteria) this;
        }

        public Criteria andWi23GreaterThan(String value) {
            addCriterion("WI23 >", value, "wi23");
            return (Criteria) this;
        }

        public Criteria andWi23GreaterThanOrEqualTo(String value) {
            addCriterion("WI23 >=", value, "wi23");
            return (Criteria) this;
        }

        public Criteria andWi23LessThan(String value) {
            addCriterion("WI23 <", value, "wi23");
            return (Criteria) this;
        }

        public Criteria andWi23LessThanOrEqualTo(String value) {
            addCriterion("WI23 <=", value, "wi23");
            return (Criteria) this;
        }

        public Criteria andWi23Like(String value) {
            addCriterion("WI23 like", value, "wi23");
            return (Criteria) this;
        }

        public Criteria andWi23NotLike(String value) {
            addCriterion("WI23 not like", value, "wi23");
            return (Criteria) this;
        }

        public Criteria andWi23In(List<String> values) {
            addCriterion("WI23 in", values, "wi23");
            return (Criteria) this;
        }

        public Criteria andWi23NotIn(List<String> values) {
            addCriterion("WI23 not in", values, "wi23");
            return (Criteria) this;
        }

        public Criteria andWi23Between(String value1, String value2) {
            addCriterion("WI23 between", value1, value2, "wi23");
            return (Criteria) this;
        }

        public Criteria andWi23NotBetween(String value1, String value2) {
            addCriterion("WI23 not between", value1, value2, "wi23");
            return (Criteria) this;
        }

        public Criteria andWi24IsNull() {
            addCriterion("WI24 is null");
            return (Criteria) this;
        }

        public Criteria andWi24IsNotNull() {
            addCriterion("WI24 is not null");
            return (Criteria) this;
        }

        public Criteria andWi24EqualTo(String value) {
            addCriterion("WI24 =", value, "wi24");
            return (Criteria) this;
        }

        public Criteria andWi24NotEqualTo(String value) {
            addCriterion("WI24 <>", value, "wi24");
            return (Criteria) this;
        }

        public Criteria andWi24GreaterThan(String value) {
            addCriterion("WI24 >", value, "wi24");
            return (Criteria) this;
        }

        public Criteria andWi24GreaterThanOrEqualTo(String value) {
            addCriterion("WI24 >=", value, "wi24");
            return (Criteria) this;
        }

        public Criteria andWi24LessThan(String value) {
            addCriterion("WI24 <", value, "wi24");
            return (Criteria) this;
        }

        public Criteria andWi24LessThanOrEqualTo(String value) {
            addCriterion("WI24 <=", value, "wi24");
            return (Criteria) this;
        }

        public Criteria andWi24Like(String value) {
            addCriterion("WI24 like", value, "wi24");
            return (Criteria) this;
        }

        public Criteria andWi24NotLike(String value) {
            addCriterion("WI24 not like", value, "wi24");
            return (Criteria) this;
        }

        public Criteria andWi24In(List<String> values) {
            addCriterion("WI24 in", values, "wi24");
            return (Criteria) this;
        }

        public Criteria andWi24NotIn(List<String> values) {
            addCriterion("WI24 not in", values, "wi24");
            return (Criteria) this;
        }

        public Criteria andWi24Between(String value1, String value2) {
            addCriterion("WI24 between", value1, value2, "wi24");
            return (Criteria) this;
        }

        public Criteria andWi24NotBetween(String value1, String value2) {
            addCriterion("WI24 not between", value1, value2, "wi24");
            return (Criteria) this;
        }

        public Criteria andWi25IsNull() {
            addCriterion("WI25 is null");
            return (Criteria) this;
        }

        public Criteria andWi25IsNotNull() {
            addCriterion("WI25 is not null");
            return (Criteria) this;
        }

        public Criteria andWi25EqualTo(String value) {
            addCriterion("WI25 =", value, "wi25");
            return (Criteria) this;
        }

        public Criteria andWi25NotEqualTo(String value) {
            addCriterion("WI25 <>", value, "wi25");
            return (Criteria) this;
        }

        public Criteria andWi25GreaterThan(String value) {
            addCriterion("WI25 >", value, "wi25");
            return (Criteria) this;
        }

        public Criteria andWi25GreaterThanOrEqualTo(String value) {
            addCriterion("WI25 >=", value, "wi25");
            return (Criteria) this;
        }

        public Criteria andWi25LessThan(String value) {
            addCriterion("WI25 <", value, "wi25");
            return (Criteria) this;
        }

        public Criteria andWi25LessThanOrEqualTo(String value) {
            addCriterion("WI25 <=", value, "wi25");
            return (Criteria) this;
        }

        public Criteria andWi25Like(String value) {
            addCriterion("WI25 like", value, "wi25");
            return (Criteria) this;
        }

        public Criteria andWi25NotLike(String value) {
            addCriterion("WI25 not like", value, "wi25");
            return (Criteria) this;
        }

        public Criteria andWi25In(List<String> values) {
            addCriterion("WI25 in", values, "wi25");
            return (Criteria) this;
        }

        public Criteria andWi25NotIn(List<String> values) {
            addCriterion("WI25 not in", values, "wi25");
            return (Criteria) this;
        }

        public Criteria andWi25Between(String value1, String value2) {
            addCriterion("WI25 between", value1, value2, "wi25");
            return (Criteria) this;
        }

        public Criteria andWi25NotBetween(String value1, String value2) {
            addCriterion("WI25 not between", value1, value2, "wi25");
            return (Criteria) this;
        }

        public Criteria andWi26IsNull() {
            addCriterion("WI26 is null");
            return (Criteria) this;
        }

        public Criteria andWi26IsNotNull() {
            addCriterion("WI26 is not null");
            return (Criteria) this;
        }

        public Criteria andWi26EqualTo(String value) {
            addCriterion("WI26 =", value, "wi26");
            return (Criteria) this;
        }

        public Criteria andWi26NotEqualTo(String value) {
            addCriterion("WI26 <>", value, "wi26");
            return (Criteria) this;
        }

        public Criteria andWi26GreaterThan(String value) {
            addCriterion("WI26 >", value, "wi26");
            return (Criteria) this;
        }

        public Criteria andWi26GreaterThanOrEqualTo(String value) {
            addCriterion("WI26 >=", value, "wi26");
            return (Criteria) this;
        }

        public Criteria andWi26LessThan(String value) {
            addCriterion("WI26 <", value, "wi26");
            return (Criteria) this;
        }

        public Criteria andWi26LessThanOrEqualTo(String value) {
            addCriterion("WI26 <=", value, "wi26");
            return (Criteria) this;
        }

        public Criteria andWi26Like(String value) {
            addCriterion("WI26 like", value, "wi26");
            return (Criteria) this;
        }

        public Criteria andWi26NotLike(String value) {
            addCriterion("WI26 not like", value, "wi26");
            return (Criteria) this;
        }

        public Criteria andWi26In(List<String> values) {
            addCriterion("WI26 in", values, "wi26");
            return (Criteria) this;
        }

        public Criteria andWi26NotIn(List<String> values) {
            addCriterion("WI26 not in", values, "wi26");
            return (Criteria) this;
        }

        public Criteria andWi26Between(String value1, String value2) {
            addCriterion("WI26 between", value1, value2, "wi26");
            return (Criteria) this;
        }

        public Criteria andWi26NotBetween(String value1, String value2) {
            addCriterion("WI26 not between", value1, value2, "wi26");
            return (Criteria) this;
        }

        public Criteria andWi27IsNull() {
            addCriterion("WI27 is null");
            return (Criteria) this;
        }

        public Criteria andWi27IsNotNull() {
            addCriterion("WI27 is not null");
            return (Criteria) this;
        }

        public Criteria andWi27EqualTo(String value) {
            addCriterion("WI27 =", value, "wi27");
            return (Criteria) this;
        }

        public Criteria andWi27NotEqualTo(String value) {
            addCriterion("WI27 <>", value, "wi27");
            return (Criteria) this;
        }

        public Criteria andWi27GreaterThan(String value) {
            addCriterion("WI27 >", value, "wi27");
            return (Criteria) this;
        }

        public Criteria andWi27GreaterThanOrEqualTo(String value) {
            addCriterion("WI27 >=", value, "wi27");
            return (Criteria) this;
        }

        public Criteria andWi27LessThan(String value) {
            addCriterion("WI27 <", value, "wi27");
            return (Criteria) this;
        }

        public Criteria andWi27LessThanOrEqualTo(String value) {
            addCriterion("WI27 <=", value, "wi27");
            return (Criteria) this;
        }

        public Criteria andWi27Like(String value) {
            addCriterion("WI27 like", value, "wi27");
            return (Criteria) this;
        }

        public Criteria andWi27NotLike(String value) {
            addCriterion("WI27 not like", value, "wi27");
            return (Criteria) this;
        }

        public Criteria andWi27In(List<String> values) {
            addCriterion("WI27 in", values, "wi27");
            return (Criteria) this;
        }

        public Criteria andWi27NotIn(List<String> values) {
            addCriterion("WI27 not in", values, "wi27");
            return (Criteria) this;
        }

        public Criteria andWi27Between(String value1, String value2) {
            addCriterion("WI27 between", value1, value2, "wi27");
            return (Criteria) this;
        }

        public Criteria andWi27NotBetween(String value1, String value2) {
            addCriterion("WI27 not between", value1, value2, "wi27");
            return (Criteria) this;
        }

        public Criteria andWi28IsNull() {
            addCriterion("WI28 is null");
            return (Criteria) this;
        }

        public Criteria andWi28IsNotNull() {
            addCriterion("WI28 is not null");
            return (Criteria) this;
        }

        public Criteria andWi28EqualTo(String value) {
            addCriterion("WI28 =", value, "wi28");
            return (Criteria) this;
        }

        public Criteria andWi28NotEqualTo(String value) {
            addCriterion("WI28 <>", value, "wi28");
            return (Criteria) this;
        }

        public Criteria andWi28GreaterThan(String value) {
            addCriterion("WI28 >", value, "wi28");
            return (Criteria) this;
        }

        public Criteria andWi28GreaterThanOrEqualTo(String value) {
            addCriterion("WI28 >=", value, "wi28");
            return (Criteria) this;
        }

        public Criteria andWi28LessThan(String value) {
            addCriterion("WI28 <", value, "wi28");
            return (Criteria) this;
        }

        public Criteria andWi28LessThanOrEqualTo(String value) {
            addCriterion("WI28 <=", value, "wi28");
            return (Criteria) this;
        }

        public Criteria andWi28Like(String value) {
            addCriterion("WI28 like", value, "wi28");
            return (Criteria) this;
        }

        public Criteria andWi28NotLike(String value) {
            addCriterion("WI28 not like", value, "wi28");
            return (Criteria) this;
        }

        public Criteria andWi28In(List<String> values) {
            addCriterion("WI28 in", values, "wi28");
            return (Criteria) this;
        }

        public Criteria andWi28NotIn(List<String> values) {
            addCriterion("WI28 not in", values, "wi28");
            return (Criteria) this;
        }

        public Criteria andWi28Between(String value1, String value2) {
            addCriterion("WI28 between", value1, value2, "wi28");
            return (Criteria) this;
        }

        public Criteria andWi28NotBetween(String value1, String value2) {
            addCriterion("WI28 not between", value1, value2, "wi28");
            return (Criteria) this;
        }

        public Criteria andWi29IsNull() {
            addCriterion("WI29 is null");
            return (Criteria) this;
        }

        public Criteria andWi29IsNotNull() {
            addCriterion("WI29 is not null");
            return (Criteria) this;
        }

        public Criteria andWi29EqualTo(Long value) {
            addCriterion("WI29 =", value, "wi29");
            return (Criteria) this;
        }

        public Criteria andWi29NotEqualTo(Long value) {
            addCriterion("WI29 <>", value, "wi29");
            return (Criteria) this;
        }

        public Criteria andWi29GreaterThan(Long value) {
            addCriterion("WI29 >", value, "wi29");
            return (Criteria) this;
        }

        public Criteria andWi29GreaterThanOrEqualTo(Long value) {
            addCriterion("WI29 >=", value, "wi29");
            return (Criteria) this;
        }

        public Criteria andWi29LessThan(Long value) {
            addCriterion("WI29 <", value, "wi29");
            return (Criteria) this;
        }

        public Criteria andWi29LessThanOrEqualTo(Long value) {
            addCriterion("WI29 <=", value, "wi29");
            return (Criteria) this;
        }

        public Criteria andWi29In(List<Long> values) {
            addCriterion("WI29 in", values, "wi29");
            return (Criteria) this;
        }

        public Criteria andWi29NotIn(List<Long> values) {
            addCriterion("WI29 not in", values, "wi29");
            return (Criteria) this;
        }

        public Criteria andWi29Between(Long value1, Long value2) {
            addCriterion("WI29 between", value1, value2, "wi29");
            return (Criteria) this;
        }

        public Criteria andWi29NotBetween(Long value1, Long value2) {
            addCriterion("WI29 not between", value1, value2, "wi29");
            return (Criteria) this;
        }

        public Criteria andWi30IsNull() {
            addCriterion("WI30 is null");
            return (Criteria) this;
        }

        public Criteria andWi30IsNotNull() {
            addCriterion("WI30 is not null");
            return (Criteria) this;
        }

        public Criteria andWi30EqualTo(String value) {
            addCriterion("WI30 =", value, "wi30");
            return (Criteria) this;
        }

        public Criteria andWi30NotEqualTo(String value) {
            addCriterion("WI30 <>", value, "wi30");
            return (Criteria) this;
        }

        public Criteria andWi30GreaterThan(String value) {
            addCriterion("WI30 >", value, "wi30");
            return (Criteria) this;
        }

        public Criteria andWi30GreaterThanOrEqualTo(String value) {
            addCriterion("WI30 >=", value, "wi30");
            return (Criteria) this;
        }

        public Criteria andWi30LessThan(String value) {
            addCriterion("WI30 <", value, "wi30");
            return (Criteria) this;
        }

        public Criteria andWi30LessThanOrEqualTo(String value) {
            addCriterion("WI30 <=", value, "wi30");
            return (Criteria) this;
        }

        public Criteria andWi30Like(String value) {
            addCriterion("WI30 like", value, "wi30");
            return (Criteria) this;
        }

        public Criteria andWi30NotLike(String value) {
            addCriterion("WI30 not like", value, "wi30");
            return (Criteria) this;
        }

        public Criteria andWi30In(List<String> values) {
            addCriterion("WI30 in", values, "wi30");
            return (Criteria) this;
        }

        public Criteria andWi30NotIn(List<String> values) {
            addCriterion("WI30 not in", values, "wi30");
            return (Criteria) this;
        }

        public Criteria andWi30Between(String value1, String value2) {
            addCriterion("WI30 between", value1, value2, "wi30");
            return (Criteria) this;
        }

        public Criteria andWi30NotBetween(String value1, String value2) {
            addCriterion("WI30 not between", value1, value2, "wi30");
            return (Criteria) this;
        }

        public Criteria andWi32IsNull() {
            addCriterion("WI32 is null");
            return (Criteria) this;
        }

        public Criteria andWi32IsNotNull() {
            addCriterion("WI32 is not null");
            return (Criteria) this;
        }

        public Criteria andWi32EqualTo(String value) {
            addCriterion("WI32 =", value, "wi32");
            return (Criteria) this;
        }

        public Criteria andWi32NotEqualTo(String value) {
            addCriterion("WI32 <>", value, "wi32");
            return (Criteria) this;
        }

        public Criteria andWi32GreaterThan(String value) {
            addCriterion("WI32 >", value, "wi32");
            return (Criteria) this;
        }

        public Criteria andWi32GreaterThanOrEqualTo(String value) {
            addCriterion("WI32 >=", value, "wi32");
            return (Criteria) this;
        }

        public Criteria andWi32LessThan(String value) {
            addCriterion("WI32 <", value, "wi32");
            return (Criteria) this;
        }

        public Criteria andWi32LessThanOrEqualTo(String value) {
            addCriterion("WI32 <=", value, "wi32");
            return (Criteria) this;
        }

        public Criteria andWi32Like(String value) {
            addCriterion("WI32 like", value, "wi32");
            return (Criteria) this;
        }

        public Criteria andWi32NotLike(String value) {
            addCriterion("WI32 not like", value, "wi32");
            return (Criteria) this;
        }

        public Criteria andWi32In(List<String> values) {
            addCriterion("WI32 in", values, "wi32");
            return (Criteria) this;
        }

        public Criteria andWi32NotIn(List<String> values) {
            addCriterion("WI32 not in", values, "wi32");
            return (Criteria) this;
        }

        public Criteria andWi32Between(String value1, String value2) {
            addCriterion("WI32 between", value1, value2, "wi32");
            return (Criteria) this;
        }

        public Criteria andWi32NotBetween(String value1, String value2) {
            addCriterion("WI32 not between", value1, value2, "wi32");
            return (Criteria) this;
        }

        public Criteria andWi33IsNull() {
            addCriterion("WI33 is null");
            return (Criteria) this;
        }

        public Criteria andWi33IsNotNull() {
            addCriterion("WI33 is not null");
            return (Criteria) this;
        }

        public Criteria andWi33EqualTo(String value) {
            addCriterion("WI33 =", value, "wi33");
            return (Criteria) this;
        }

        public Criteria andWi33NotEqualTo(String value) {
            addCriterion("WI33 <>", value, "wi33");
            return (Criteria) this;
        }

        public Criteria andWi33GreaterThan(String value) {
            addCriterion("WI33 >", value, "wi33");
            return (Criteria) this;
        }

        public Criteria andWi33GreaterThanOrEqualTo(String value) {
            addCriterion("WI33 >=", value, "wi33");
            return (Criteria) this;
        }

        public Criteria andWi33LessThan(String value) {
            addCriterion("WI33 <", value, "wi33");
            return (Criteria) this;
        }

        public Criteria andWi33LessThanOrEqualTo(String value) {
            addCriterion("WI33 <=", value, "wi33");
            return (Criteria) this;
        }

        public Criteria andWi33Like(String value) {
            addCriterion("WI33 like", value, "wi33");
            return (Criteria) this;
        }

        public Criteria andWi33NotLike(String value) {
            addCriterion("WI33 not like", value, "wi33");
            return (Criteria) this;
        }

        public Criteria andWi33In(List<String> values) {
            addCriterion("WI33 in", values, "wi33");
            return (Criteria) this;
        }

        public Criteria andWi33NotIn(List<String> values) {
            addCriterion("WI33 not in", values, "wi33");
            return (Criteria) this;
        }

        public Criteria andWi33Between(String value1, String value2) {
            addCriterion("WI33 between", value1, value2, "wi33");
            return (Criteria) this;
        }

        public Criteria andWi33NotBetween(String value1, String value2) {
            addCriterion("WI33 not between", value1, value2, "wi33");
            return (Criteria) this;
        }

        public Criteria andWi34IsNull() {
            addCriterion("WI34 is null");
            return (Criteria) this;
        }

        public Criteria andWi34IsNotNull() {
            addCriterion("WI34 is not null");
            return (Criteria) this;
        }

        public Criteria andWi34EqualTo(String value) {
            addCriterion("WI34 =", value, "wi34");
            return (Criteria) this;
        }

        public Criteria andWi34NotEqualTo(String value) {
            addCriterion("WI34 <>", value, "wi34");
            return (Criteria) this;
        }

        public Criteria andWi34GreaterThan(String value) {
            addCriterion("WI34 >", value, "wi34");
            return (Criteria) this;
        }

        public Criteria andWi34GreaterThanOrEqualTo(String value) {
            addCriterion("WI34 >=", value, "wi34");
            return (Criteria) this;
        }

        public Criteria andWi34LessThan(String value) {
            addCriterion("WI34 <", value, "wi34");
            return (Criteria) this;
        }

        public Criteria andWi34LessThanOrEqualTo(String value) {
            addCriterion("WI34 <=", value, "wi34");
            return (Criteria) this;
        }

        public Criteria andWi34Like(String value) {
            addCriterion("WI34 like", value, "wi34");
            return (Criteria) this;
        }

        public Criteria andWi34NotLike(String value) {
            addCriterion("WI34 not like", value, "wi34");
            return (Criteria) this;
        }

        public Criteria andWi34In(List<String> values) {
            addCriterion("WI34 in", values, "wi34");
            return (Criteria) this;
        }

        public Criteria andWi34NotIn(List<String> values) {
            addCriterion("WI34 not in", values, "wi34");
            return (Criteria) this;
        }

        public Criteria andWi34Between(String value1, String value2) {
            addCriterion("WI34 between", value1, value2, "wi34");
            return (Criteria) this;
        }

        public Criteria andWi34NotBetween(String value1, String value2) {
            addCriterion("WI34 not between", value1, value2, "wi34");
            return (Criteria) this;
        }

        public Criteria andWi35IsNull() {
            addCriterion("WI35 is null");
            return (Criteria) this;
        }

        public Criteria andWi35IsNotNull() {
            addCriterion("WI35 is not null");
            return (Criteria) this;
        }

        public Criteria andWi35EqualTo(String value) {
            addCriterion("WI35 =", value, "wi35");
            return (Criteria) this;
        }

        public Criteria andWi35NotEqualTo(String value) {
            addCriterion("WI35 <>", value, "wi35");
            return (Criteria) this;
        }

        public Criteria andWi35GreaterThan(String value) {
            addCriterion("WI35 >", value, "wi35");
            return (Criteria) this;
        }

        public Criteria andWi35GreaterThanOrEqualTo(String value) {
            addCriterion("WI35 >=", value, "wi35");
            return (Criteria) this;
        }

        public Criteria andWi35LessThan(String value) {
            addCriterion("WI35 <", value, "wi35");
            return (Criteria) this;
        }

        public Criteria andWi35LessThanOrEqualTo(String value) {
            addCriterion("WI35 <=", value, "wi35");
            return (Criteria) this;
        }

        public Criteria andWi35Like(String value) {
            addCriterion("WI35 like", value, "wi35");
            return (Criteria) this;
        }

        public Criteria andWi35NotLike(String value) {
            addCriterion("WI35 not like", value, "wi35");
            return (Criteria) this;
        }

        public Criteria andWi35In(List<String> values) {
            addCriterion("WI35 in", values, "wi35");
            return (Criteria) this;
        }

        public Criteria andWi35NotIn(List<String> values) {
            addCriterion("WI35 not in", values, "wi35");
            return (Criteria) this;
        }

        public Criteria andWi35Between(String value1, String value2) {
            addCriterion("WI35 between", value1, value2, "wi35");
            return (Criteria) this;
        }

        public Criteria andWi35NotBetween(String value1, String value2) {
            addCriterion("WI35 not between", value1, value2, "wi35");
            return (Criteria) this;
        }

        public Criteria andWi36IsNull() {
            addCriterion("WI36 is null");
            return (Criteria) this;
        }

        public Criteria andWi36IsNotNull() {
            addCriterion("WI36 is not null");
            return (Criteria) this;
        }

        public Criteria andWi36EqualTo(String value) {
            addCriterion("WI36 =", value, "wi36");
            return (Criteria) this;
        }

        public Criteria andWi36NotEqualTo(String value) {
            addCriterion("WI36 <>", value, "wi36");
            return (Criteria) this;
        }

        public Criteria andWi36GreaterThan(String value) {
            addCriterion("WI36 >", value, "wi36");
            return (Criteria) this;
        }

        public Criteria andWi36GreaterThanOrEqualTo(String value) {
            addCriterion("WI36 >=", value, "wi36");
            return (Criteria) this;
        }

        public Criteria andWi36LessThan(String value) {
            addCriterion("WI36 <", value, "wi36");
            return (Criteria) this;
        }

        public Criteria andWi36LessThanOrEqualTo(String value) {
            addCriterion("WI36 <=", value, "wi36");
            return (Criteria) this;
        }

        public Criteria andWi36Like(String value) {
            addCriterion("WI36 like", value, "wi36");
            return (Criteria) this;
        }

        public Criteria andWi36NotLike(String value) {
            addCriterion("WI36 not like", value, "wi36");
            return (Criteria) this;
        }

        public Criteria andWi36In(List<String> values) {
            addCriterion("WI36 in", values, "wi36");
            return (Criteria) this;
        }

        public Criteria andWi36NotIn(List<String> values) {
            addCriterion("WI36 not in", values, "wi36");
            return (Criteria) this;
        }

        public Criteria andWi36Between(String value1, String value2) {
            addCriterion("WI36 between", value1, value2, "wi36");
            return (Criteria) this;
        }

        public Criteria andWi36NotBetween(String value1, String value2) {
            addCriterion("WI36 not between", value1, value2, "wi36");
            return (Criteria) this;
        }

        public Criteria andWi37IsNull() {
            addCriterion("WI37 is null");
            return (Criteria) this;
        }

        public Criteria andWi37IsNotNull() {
            addCriterion("WI37 is not null");
            return (Criteria) this;
        }

        public Criteria andWi37EqualTo(String value) {
            addCriterion("WI37 =", value, "wi37");
            return (Criteria) this;
        }

        public Criteria andWi37NotEqualTo(String value) {
            addCriterion("WI37 <>", value, "wi37");
            return (Criteria) this;
        }

        public Criteria andWi37GreaterThan(String value) {
            addCriterion("WI37 >", value, "wi37");
            return (Criteria) this;
        }

        public Criteria andWi37GreaterThanOrEqualTo(String value) {
            addCriterion("WI37 >=", value, "wi37");
            return (Criteria) this;
        }

        public Criteria andWi37LessThan(String value) {
            addCriterion("WI37 <", value, "wi37");
            return (Criteria) this;
        }

        public Criteria andWi37LessThanOrEqualTo(String value) {
            addCriterion("WI37 <=", value, "wi37");
            return (Criteria) this;
        }

        public Criteria andWi37Like(String value) {
            addCriterion("WI37 like", value, "wi37");
            return (Criteria) this;
        }

        public Criteria andWi37NotLike(String value) {
            addCriterion("WI37 not like", value, "wi37");
            return (Criteria) this;
        }

        public Criteria andWi37In(List<String> values) {
            addCriterion("WI37 in", values, "wi37");
            return (Criteria) this;
        }

        public Criteria andWi37NotIn(List<String> values) {
            addCriterion("WI37 not in", values, "wi37");
            return (Criteria) this;
        }

        public Criteria andWi37Between(String value1, String value2) {
            addCriterion("WI37 between", value1, value2, "wi37");
            return (Criteria) this;
        }

        public Criteria andWi37NotBetween(String value1, String value2) {
            addCriterion("WI37 not between", value1, value2, "wi37");
            return (Criteria) this;
        }

        public Criteria andWi38IsNull() {
            addCriterion("WI38 is null");
            return (Criteria) this;
        }

        public Criteria andWi38IsNotNull() {
            addCriterion("WI38 is not null");
            return (Criteria) this;
        }

        public Criteria andWi38EqualTo(String value) {
            addCriterion("WI38 =", value, "wi38");
            return (Criteria) this;
        }

        public Criteria andWi38NotEqualTo(String value) {
            addCriterion("WI38 <>", value, "wi38");
            return (Criteria) this;
        }

        public Criteria andWi38GreaterThan(String value) {
            addCriterion("WI38 >", value, "wi38");
            return (Criteria) this;
        }

        public Criteria andWi38GreaterThanOrEqualTo(String value) {
            addCriterion("WI38 >=", value, "wi38");
            return (Criteria) this;
        }

        public Criteria andWi38LessThan(String value) {
            addCriterion("WI38 <", value, "wi38");
            return (Criteria) this;
        }

        public Criteria andWi38LessThanOrEqualTo(String value) {
            addCriterion("WI38 <=", value, "wi38");
            return (Criteria) this;
        }

        public Criteria andWi38Like(String value) {
            addCriterion("WI38 like", value, "wi38");
            return (Criteria) this;
        }

        public Criteria andWi38NotLike(String value) {
            addCriterion("WI38 not like", value, "wi38");
            return (Criteria) this;
        }

        public Criteria andWi38In(List<String> values) {
            addCriterion("WI38 in", values, "wi38");
            return (Criteria) this;
        }

        public Criteria andWi38NotIn(List<String> values) {
            addCriterion("WI38 not in", values, "wi38");
            return (Criteria) this;
        }

        public Criteria andWi38Between(String value1, String value2) {
            addCriterion("WI38 between", value1, value2, "wi38");
            return (Criteria) this;
        }

        public Criteria andWi38NotBetween(String value1, String value2) {
            addCriterion("WI38 not between", value1, value2, "wi38");
            return (Criteria) this;
        }

        public Criteria andWi39IsNull() {
            addCriterion("WI39 is null");
            return (Criteria) this;
        }

        public Criteria andWi39IsNotNull() {
            addCriterion("WI39 is not null");
            return (Criteria) this;
        }

        public Criteria andWi39EqualTo(String value) {
            addCriterion("WI39 =", value, "wi39");
            return (Criteria) this;
        }

        public Criteria andWi39NotEqualTo(String value) {
            addCriterion("WI39 <>", value, "wi39");
            return (Criteria) this;
        }

        public Criteria andWi39GreaterThan(String value) {
            addCriterion("WI39 >", value, "wi39");
            return (Criteria) this;
        }

        public Criteria andWi39GreaterThanOrEqualTo(String value) {
            addCriterion("WI39 >=", value, "wi39");
            return (Criteria) this;
        }

        public Criteria andWi39LessThan(String value) {
            addCriterion("WI39 <", value, "wi39");
            return (Criteria) this;
        }

        public Criteria andWi39LessThanOrEqualTo(String value) {
            addCriterion("WI39 <=", value, "wi39");
            return (Criteria) this;
        }

        public Criteria andWi39Like(String value) {
            addCriterion("WI39 like", value, "wi39");
            return (Criteria) this;
        }

        public Criteria andWi39NotLike(String value) {
            addCriterion("WI39 not like", value, "wi39");
            return (Criteria) this;
        }

        public Criteria andWi39In(List<String> values) {
            addCriterion("WI39 in", values, "wi39");
            return (Criteria) this;
        }

        public Criteria andWi39NotIn(List<String> values) {
            addCriterion("WI39 not in", values, "wi39");
            return (Criteria) this;
        }

        public Criteria andWi39Between(String value1, String value2) {
            addCriterion("WI39 between", value1, value2, "wi39");
            return (Criteria) this;
        }

        public Criteria andWi39NotBetween(String value1, String value2) {
            addCriterion("WI39 not between", value1, value2, "wi39");
            return (Criteria) this;
        }

        public Criteria andWi40IsNull() {
            addCriterion("WI40 is null");
            return (Criteria) this;
        }

        public Criteria andWi40IsNotNull() {
            addCriterion("WI40 is not null");
            return (Criteria) this;
        }

        public Criteria andWi40EqualTo(String value) {
            addCriterion("WI40 =", value, "wi40");
            return (Criteria) this;
        }

        public Criteria andWi40NotEqualTo(String value) {
            addCriterion("WI40 <>", value, "wi40");
            return (Criteria) this;
        }

        public Criteria andWi40GreaterThan(String value) {
            addCriterion("WI40 >", value, "wi40");
            return (Criteria) this;
        }

        public Criteria andWi40GreaterThanOrEqualTo(String value) {
            addCriterion("WI40 >=", value, "wi40");
            return (Criteria) this;
        }

        public Criteria andWi40LessThan(String value) {
            addCriterion("WI40 <", value, "wi40");
            return (Criteria) this;
        }

        public Criteria andWi40LessThanOrEqualTo(String value) {
            addCriterion("WI40 <=", value, "wi40");
            return (Criteria) this;
        }

        public Criteria andWi40Like(String value) {
            addCriterion("WI40 like", value, "wi40");
            return (Criteria) this;
        }

        public Criteria andWi40NotLike(String value) {
            addCriterion("WI40 not like", value, "wi40");
            return (Criteria) this;
        }

        public Criteria andWi40In(List<String> values) {
            addCriterion("WI40 in", values, "wi40");
            return (Criteria) this;
        }

        public Criteria andWi40NotIn(List<String> values) {
            addCriterion("WI40 not in", values, "wi40");
            return (Criteria) this;
        }

        public Criteria andWi40Between(String value1, String value2) {
            addCriterion("WI40 between", value1, value2, "wi40");
            return (Criteria) this;
        }

        public Criteria andWi40NotBetween(String value1, String value2) {
            addCriterion("WI40 not between", value1, value2, "wi40");
            return (Criteria) this;
        }

        public Criteria andWi41IsNull() {
            addCriterion("WI41 is null");
            return (Criteria) this;
        }

        public Criteria andWi41IsNotNull() {
            addCriterion("WI41 is not null");
            return (Criteria) this;
        }

        public Criteria andWi41EqualTo(String value) {
            addCriterion("WI41 =", value, "wi41");
            return (Criteria) this;
        }

        public Criteria andWi41NotEqualTo(String value) {
            addCriterion("WI41 <>", value, "wi41");
            return (Criteria) this;
        }

        public Criteria andWi41GreaterThan(String value) {
            addCriterion("WI41 >", value, "wi41");
            return (Criteria) this;
        }

        public Criteria andWi41GreaterThanOrEqualTo(String value) {
            addCriterion("WI41 >=", value, "wi41");
            return (Criteria) this;
        }

        public Criteria andWi41LessThan(String value) {
            addCriterion("WI41 <", value, "wi41");
            return (Criteria) this;
        }

        public Criteria andWi41LessThanOrEqualTo(String value) {
            addCriterion("WI41 <=", value, "wi41");
            return (Criteria) this;
        }

        public Criteria andWi41Like(String value) {
            addCriterion("WI41 like", value, "wi41");
            return (Criteria) this;
        }

        public Criteria andWi41NotLike(String value) {
            addCriterion("WI41 not like", value, "wi41");
            return (Criteria) this;
        }

        public Criteria andWi41In(List<String> values) {
            addCriterion("WI41 in", values, "wi41");
            return (Criteria) this;
        }

        public Criteria andWi41NotIn(List<String> values) {
            addCriterion("WI41 not in", values, "wi41");
            return (Criteria) this;
        }

        public Criteria andWi41Between(String value1, String value2) {
            addCriterion("WI41 between", value1, value2, "wi41");
            return (Criteria) this;
        }

        public Criteria andWi41NotBetween(String value1, String value2) {
            addCriterion("WI41 not between", value1, value2, "wi41");
            return (Criteria) this;
        }

        public Criteria andWi42IsNull() {
            addCriterion("WI42 is null");
            return (Criteria) this;
        }

        public Criteria andWi42IsNotNull() {
            addCriterion("WI42 is not null");
            return (Criteria) this;
        }

        public Criteria andWi42EqualTo(String value) {
            addCriterion("WI42 =", value, "wi42");
            return (Criteria) this;
        }

        public Criteria andWi42NotEqualTo(String value) {
            addCriterion("WI42 <>", value, "wi42");
            return (Criteria) this;
        }

        public Criteria andWi42GreaterThan(String value) {
            addCriterion("WI42 >", value, "wi42");
            return (Criteria) this;
        }

        public Criteria andWi42GreaterThanOrEqualTo(String value) {
            addCriterion("WI42 >=", value, "wi42");
            return (Criteria) this;
        }

        public Criteria andWi42LessThan(String value) {
            addCriterion("WI42 <", value, "wi42");
            return (Criteria) this;
        }

        public Criteria andWi42LessThanOrEqualTo(String value) {
            addCriterion("WI42 <=", value, "wi42");
            return (Criteria) this;
        }

        public Criteria andWi42Like(String value) {
            addCriterion("WI42 like", value, "wi42");
            return (Criteria) this;
        }

        public Criteria andWi42NotLike(String value) {
            addCriterion("WI42 not like", value, "wi42");
            return (Criteria) this;
        }

        public Criteria andWi42In(List<String> values) {
            addCriterion("WI42 in", values, "wi42");
            return (Criteria) this;
        }

        public Criteria andWi42NotIn(List<String> values) {
            addCriterion("WI42 not in", values, "wi42");
            return (Criteria) this;
        }

        public Criteria andWi42Between(String value1, String value2) {
            addCriterion("WI42 between", value1, value2, "wi42");
            return (Criteria) this;
        }

        public Criteria andWi42NotBetween(String value1, String value2) {
            addCriterion("WI42 not between", value1, value2, "wi42");
            return (Criteria) this;
        }

        public Criteria andWi43IsNull() {
            addCriterion("WI43 is null");
            return (Criteria) this;
        }

        public Criteria andWi43IsNotNull() {
            addCriterion("WI43 is not null");
            return (Criteria) this;
        }

        public Criteria andWi43EqualTo(String value) {
            addCriterion("WI43 =", value, "wi43");
            return (Criteria) this;
        }

        public Criteria andWi43NotEqualTo(String value) {
            addCriterion("WI43 <>", value, "wi43");
            return (Criteria) this;
        }

        public Criteria andWi43GreaterThan(String value) {
            addCriterion("WI43 >", value, "wi43");
            return (Criteria) this;
        }

        public Criteria andWi43GreaterThanOrEqualTo(String value) {
            addCriterion("WI43 >=", value, "wi43");
            return (Criteria) this;
        }

        public Criteria andWi43LessThan(String value) {
            addCriterion("WI43 <", value, "wi43");
            return (Criteria) this;
        }

        public Criteria andWi43LessThanOrEqualTo(String value) {
            addCriterion("WI43 <=", value, "wi43");
            return (Criteria) this;
        }

        public Criteria andWi43Like(String value) {
            addCriterion("WI43 like", value, "wi43");
            return (Criteria) this;
        }

        public Criteria andWi43NotLike(String value) {
            addCriterion("WI43 not like", value, "wi43");
            return (Criteria) this;
        }

        public Criteria andWi43In(List<String> values) {
            addCriterion("WI43 in", values, "wi43");
            return (Criteria) this;
        }

        public Criteria andWi43NotIn(List<String> values) {
            addCriterion("WI43 not in", values, "wi43");
            return (Criteria) this;
        }

        public Criteria andWi43Between(String value1, String value2) {
            addCriterion("WI43 between", value1, value2, "wi43");
            return (Criteria) this;
        }

        public Criteria andWi43NotBetween(String value1, String value2) {
            addCriterion("WI43 not between", value1, value2, "wi43");
            return (Criteria) this;
        }

        public Criteria andWi44IsNull() {
            addCriterion("WI44 is null");
            return (Criteria) this;
        }

        public Criteria andWi44IsNotNull() {
            addCriterion("WI44 is not null");
            return (Criteria) this;
        }

        public Criteria andWi44EqualTo(String value) {
            addCriterion("WI44 =", value, "wi44");
            return (Criteria) this;
        }

        public Criteria andWi44NotEqualTo(String value) {
            addCriterion("WI44 <>", value, "wi44");
            return (Criteria) this;
        }

        public Criteria andWi44GreaterThan(String value) {
            addCriterion("WI44 >", value, "wi44");
            return (Criteria) this;
        }

        public Criteria andWi44GreaterThanOrEqualTo(String value) {
            addCriterion("WI44 >=", value, "wi44");
            return (Criteria) this;
        }

        public Criteria andWi44LessThan(String value) {
            addCriterion("WI44 <", value, "wi44");
            return (Criteria) this;
        }

        public Criteria andWi44LessThanOrEqualTo(String value) {
            addCriterion("WI44 <=", value, "wi44");
            return (Criteria) this;
        }

        public Criteria andWi44Like(String value) {
            addCriterion("WI44 like", value, "wi44");
            return (Criteria) this;
        }

        public Criteria andWi44NotLike(String value) {
            addCriterion("WI44 not like", value, "wi44");
            return (Criteria) this;
        }

        public Criteria andWi44In(List<String> values) {
            addCriterion("WI44 in", values, "wi44");
            return (Criteria) this;
        }

        public Criteria andWi44NotIn(List<String> values) {
            addCriterion("WI44 not in", values, "wi44");
            return (Criteria) this;
        }

        public Criteria andWi44Between(String value1, String value2) {
            addCriterion("WI44 between", value1, value2, "wi44");
            return (Criteria) this;
        }

        public Criteria andWi44NotBetween(String value1, String value2) {
            addCriterion("WI44 not between", value1, value2, "wi44");
            return (Criteria) this;
        }

        public Criteria andWi45IsNull() {
            addCriterion("WI45 is null");
            return (Criteria) this;
        }

        public Criteria andWi45IsNotNull() {
            addCriterion("WI45 is not null");
            return (Criteria) this;
        }

        public Criteria andWi45EqualTo(String value) {
            addCriterion("WI45 =", value, "wi45");
            return (Criteria) this;
        }

        public Criteria andWi45NotEqualTo(String value) {
            addCriterion("WI45 <>", value, "wi45");
            return (Criteria) this;
        }

        public Criteria andWi45GreaterThan(String value) {
            addCriterion("WI45 >", value, "wi45");
            return (Criteria) this;
        }

        public Criteria andWi45GreaterThanOrEqualTo(String value) {
            addCriterion("WI45 >=", value, "wi45");
            return (Criteria) this;
        }

        public Criteria andWi45LessThan(String value) {
            addCriterion("WI45 <", value, "wi45");
            return (Criteria) this;
        }

        public Criteria andWi45LessThanOrEqualTo(String value) {
            addCriterion("WI45 <=", value, "wi45");
            return (Criteria) this;
        }

        public Criteria andWi45Like(String value) {
            addCriterion("WI45 like", value, "wi45");
            return (Criteria) this;
        }

        public Criteria andWi45NotLike(String value) {
            addCriterion("WI45 not like", value, "wi45");
            return (Criteria) this;
        }

        public Criteria andWi45In(List<String> values) {
            addCriterion("WI45 in", values, "wi45");
            return (Criteria) this;
        }

        public Criteria andWi45NotIn(List<String> values) {
            addCriterion("WI45 not in", values, "wi45");
            return (Criteria) this;
        }

        public Criteria andWi45Between(String value1, String value2) {
            addCriterion("WI45 between", value1, value2, "wi45");
            return (Criteria) this;
        }

        public Criteria andWi45NotBetween(String value1, String value2) {
            addCriterion("WI45 not between", value1, value2, "wi45");
            return (Criteria) this;
        }

        public Criteria andWi46IsNull() {
            addCriterion("WI46 is null");
            return (Criteria) this;
        }

        public Criteria andWi46IsNotNull() {
            addCriterion("WI46 is not null");
            return (Criteria) this;
        }

        public Criteria andWi46EqualTo(Long value) {
            addCriterion("WI46 =", value, "wi46");
            return (Criteria) this;
        }

        public Criteria andWi46NotEqualTo(Long value) {
            addCriterion("WI46 <>", value, "wi46");
            return (Criteria) this;
        }

        public Criteria andWi46GreaterThan(Long value) {
            addCriterion("WI46 >", value, "wi46");
            return (Criteria) this;
        }

        public Criteria andWi46GreaterThanOrEqualTo(Long value) {
            addCriterion("WI46 >=", value, "wi46");
            return (Criteria) this;
        }

        public Criteria andWi46LessThan(Long value) {
            addCriterion("WI46 <", value, "wi46");
            return (Criteria) this;
        }

        public Criteria andWi46LessThanOrEqualTo(Long value) {
            addCriterion("WI46 <=", value, "wi46");
            return (Criteria) this;
        }

        public Criteria andWi46In(List<Long> values) {
            addCriterion("WI46 in", values, "wi46");
            return (Criteria) this;
        }

        public Criteria andWi46NotIn(List<Long> values) {
            addCriterion("WI46 not in", values, "wi46");
            return (Criteria) this;
        }

        public Criteria andWi46Between(Long value1, Long value2) {
            addCriterion("WI46 between", value1, value2, "wi46");
            return (Criteria) this;
        }

        public Criteria andWi46NotBetween(Long value1, Long value2) {
            addCriterion("WI46 not between", value1, value2, "wi46");
            return (Criteria) this;
        }

        public Criteria andWi47IsNull() {
            addCriterion("WI47 is null");
            return (Criteria) this;
        }

        public Criteria andWi47IsNotNull() {
            addCriterion("WI47 is not null");
            return (Criteria) this;
        }

        public Criteria andWi47EqualTo(Long value) {
            addCriterion("WI47 =", value, "wi47");
            return (Criteria) this;
        }

        public Criteria andWi47NotEqualTo(Long value) {
            addCriterion("WI47 <>", value, "wi47");
            return (Criteria) this;
        }

        public Criteria andWi47GreaterThan(Long value) {
            addCriterion("WI47 >", value, "wi47");
            return (Criteria) this;
        }

        public Criteria andWi47GreaterThanOrEqualTo(Long value) {
            addCriterion("WI47 >=", value, "wi47");
            return (Criteria) this;
        }

        public Criteria andWi47LessThan(Long value) {
            addCriterion("WI47 <", value, "wi47");
            return (Criteria) this;
        }

        public Criteria andWi47LessThanOrEqualTo(Long value) {
            addCriterion("WI47 <=", value, "wi47");
            return (Criteria) this;
        }

        public Criteria andWi47In(List<Long> values) {
            addCriterion("WI47 in", values, "wi47");
            return (Criteria) this;
        }

        public Criteria andWi47NotIn(List<Long> values) {
            addCriterion("WI47 not in", values, "wi47");
            return (Criteria) this;
        }

        public Criteria andWi47Between(Long value1, Long value2) {
            addCriterion("WI47 between", value1, value2, "wi47");
            return (Criteria) this;
        }

        public Criteria andWi47NotBetween(Long value1, Long value2) {
            addCriterion("WI47 not between", value1, value2, "wi47");
            return (Criteria) this;
        }

        public Criteria andWi48IsNull() {
            addCriterion("WI48 is null");
            return (Criteria) this;
        }

        public Criteria andWi48IsNotNull() {
            addCriterion("WI48 is not null");
            return (Criteria) this;
        }

        public Criteria andWi48EqualTo(Long value) {
            addCriterion("WI48 =", value, "wi48");
            return (Criteria) this;
        }

        public Criteria andWi48NotEqualTo(Long value) {
            addCriterion("WI48 <>", value, "wi48");
            return (Criteria) this;
        }

        public Criteria andWi48GreaterThan(Long value) {
            addCriterion("WI48 >", value, "wi48");
            return (Criteria) this;
        }

        public Criteria andWi48GreaterThanOrEqualTo(Long value) {
            addCriterion("WI48 >=", value, "wi48");
            return (Criteria) this;
        }

        public Criteria andWi48LessThan(Long value) {
            addCriterion("WI48 <", value, "wi48");
            return (Criteria) this;
        }

        public Criteria andWi48LessThanOrEqualTo(Long value) {
            addCriterion("WI48 <=", value, "wi48");
            return (Criteria) this;
        }

        public Criteria andWi48In(List<Long> values) {
            addCriterion("WI48 in", values, "wi48");
            return (Criteria) this;
        }

        public Criteria andWi48NotIn(List<Long> values) {
            addCriterion("WI48 not in", values, "wi48");
            return (Criteria) this;
        }

        public Criteria andWi48Between(Long value1, Long value2) {
            addCriterion("WI48 between", value1, value2, "wi48");
            return (Criteria) this;
        }

        public Criteria andWi48NotBetween(Long value1, Long value2) {
            addCriterion("WI48 not between", value1, value2, "wi48");
            return (Criteria) this;
        }

        public Criteria andWi49IsNull() {
            addCriterion("WI49 is null");
            return (Criteria) this;
        }

        public Criteria andWi49IsNotNull() {
            addCriterion("WI49 is not null");
            return (Criteria) this;
        }

        public Criteria andWi49EqualTo(Long value) {
            addCriterion("WI49 =", value, "wi49");
            return (Criteria) this;
        }

        public Criteria andWi49NotEqualTo(Long value) {
            addCriterion("WI49 <>", value, "wi49");
            return (Criteria) this;
        }

        public Criteria andWi49GreaterThan(Long value) {
            addCriterion("WI49 >", value, "wi49");
            return (Criteria) this;
        }

        public Criteria andWi49GreaterThanOrEqualTo(Long value) {
            addCriterion("WI49 >=", value, "wi49");
            return (Criteria) this;
        }

        public Criteria andWi49LessThan(Long value) {
            addCriterion("WI49 <", value, "wi49");
            return (Criteria) this;
        }

        public Criteria andWi49LessThanOrEqualTo(Long value) {
            addCriterion("WI49 <=", value, "wi49");
            return (Criteria) this;
        }

        public Criteria andWi49In(List<Long> values) {
            addCriterion("WI49 in", values, "wi49");
            return (Criteria) this;
        }

        public Criteria andWi49NotIn(List<Long> values) {
            addCriterion("WI49 not in", values, "wi49");
            return (Criteria) this;
        }

        public Criteria andWi49Between(Long value1, Long value2) {
            addCriterion("WI49 between", value1, value2, "wi49");
            return (Criteria) this;
        }

        public Criteria andWi49NotBetween(Long value1, Long value2) {
            addCriterion("WI49 not between", value1, value2, "wi49");
            return (Criteria) this;
        }

        public Criteria andWi50IsNull() {
            addCriterion("WI50 is null");
            return (Criteria) this;
        }

        public Criteria andWi50IsNotNull() {
            addCriterion("WI50 is not null");
            return (Criteria) this;
        }

        public Criteria andWi50EqualTo(String value) {
            addCriterion("WI50 =", value, "wi50");
            return (Criteria) this;
        }

        public Criteria andWi50NotEqualTo(String value) {
            addCriterion("WI50 <>", value, "wi50");
            return (Criteria) this;
        }

        public Criteria andWi50GreaterThan(String value) {
            addCriterion("WI50 >", value, "wi50");
            return (Criteria) this;
        }

        public Criteria andWi50GreaterThanOrEqualTo(String value) {
            addCriterion("WI50 >=", value, "wi50");
            return (Criteria) this;
        }

        public Criteria andWi50LessThan(String value) {
            addCriterion("WI50 <", value, "wi50");
            return (Criteria) this;
        }

        public Criteria andWi50LessThanOrEqualTo(String value) {
            addCriterion("WI50 <=", value, "wi50");
            return (Criteria) this;
        }

        public Criteria andWi50Like(String value) {
            addCriterion("WI50 like", value, "wi50");
            return (Criteria) this;
        }

        public Criteria andWi50NotLike(String value) {
            addCriterion("WI50 not like", value, "wi50");
            return (Criteria) this;
        }

        public Criteria andWi50In(List<String> values) {
            addCriterion("WI50 in", values, "wi50");
            return (Criteria) this;
        }

        public Criteria andWi50NotIn(List<String> values) {
            addCriterion("WI50 not in", values, "wi50");
            return (Criteria) this;
        }

        public Criteria andWi50Between(String value1, String value2) {
            addCriterion("WI50 between", value1, value2, "wi50");
            return (Criteria) this;
        }

        public Criteria andWi50NotBetween(String value1, String value2) {
            addCriterion("WI50 not between", value1, value2, "wi50");
            return (Criteria) this;
        }

        public Criteria andWi51IsNull() {
            addCriterion("WI51 is null");
            return (Criteria) this;
        }

        public Criteria andWi51IsNotNull() {
            addCriterion("WI51 is not null");
            return (Criteria) this;
        }

        public Criteria andWi51EqualTo(Date value) {
            addCriterion("WI51 =", value, "wi51");
            return (Criteria) this;
        }

        public Criteria andWi51NotEqualTo(Date value) {
            addCriterion("WI51 <>", value, "wi51");
            return (Criteria) this;
        }

        public Criteria andWi51GreaterThan(Date value) {
            addCriterion("WI51 >", value, "wi51");
            return (Criteria) this;
        }

        public Criteria andWi51GreaterThanOrEqualTo(Date value) {
            addCriterion("WI51 >=", value, "wi51");
            return (Criteria) this;
        }

        public Criteria andWi51LessThan(Date value) {
            addCriterion("WI51 <", value, "wi51");
            return (Criteria) this;
        }

        public Criteria andWi51LessThanOrEqualTo(Date value) {
            addCriterion("WI51 <=", value, "wi51");
            return (Criteria) this;
        }

        public Criteria andWi51In(List<Date> values) {
            addCriterion("WI51 in", values, "wi51");
            return (Criteria) this;
        }

        public Criteria andWi51NotIn(List<Date> values) {
            addCriterion("WI51 not in", values, "wi51");
            return (Criteria) this;
        }

        public Criteria andWi51Between(Date value1, Date value2) {
            addCriterion("WI51 between", value1, value2, "wi51");
            return (Criteria) this;
        }

        public Criteria andWi51NotBetween(Date value1, Date value2) {
            addCriterion("WI51 not between", value1, value2, "wi51");
            return (Criteria) this;
        }

        public Criteria andWi52IsNull() {
            addCriterion("WI52 is null");
            return (Criteria) this;
        }

        public Criteria andWi52IsNotNull() {
            addCriterion("WI52 is not null");
            return (Criteria) this;
        }

        public Criteria andWi52EqualTo(String value) {
            addCriterion("WI52 =", value, "wi52");
            return (Criteria) this;
        }

        public Criteria andWi52NotEqualTo(String value) {
            addCriterion("WI52 <>", value, "wi52");
            return (Criteria) this;
        }

        public Criteria andWi52GreaterThan(String value) {
            addCriterion("WI52 >", value, "wi52");
            return (Criteria) this;
        }

        public Criteria andWi52GreaterThanOrEqualTo(String value) {
            addCriterion("WI52 >=", value, "wi52");
            return (Criteria) this;
        }

        public Criteria andWi52LessThan(String value) {
            addCriterion("WI52 <", value, "wi52");
            return (Criteria) this;
        }

        public Criteria andWi52LessThanOrEqualTo(String value) {
            addCriterion("WI52 <=", value, "wi52");
            return (Criteria) this;
        }

        public Criteria andWi52Like(String value) {
            addCriterion("WI52 like", value, "wi52");
            return (Criteria) this;
        }

        public Criteria andWi52NotLike(String value) {
            addCriterion("WI52 not like", value, "wi52");
            return (Criteria) this;
        }

        public Criteria andWi52In(List<String> values) {
            addCriterion("WI52 in", values, "wi52");
            return (Criteria) this;
        }

        public Criteria andWi52NotIn(List<String> values) {
            addCriterion("WI52 not in", values, "wi52");
            return (Criteria) this;
        }

        public Criteria andWi52Between(String value1, String value2) {
            addCriterion("WI52 between", value1, value2, "wi52");
            return (Criteria) this;
        }

        public Criteria andWi52NotBetween(String value1, String value2) {
            addCriterion("WI52 not between", value1, value2, "wi52");
            return (Criteria) this;
        }

        public Criteria andWi53IsNull() {
            addCriterion("WI53 is null");
            return (Criteria) this;
        }

        public Criteria andWi53IsNotNull() {
            addCriterion("WI53 is not null");
            return (Criteria) this;
        }

        public Criteria andWi53EqualTo(String value) {
            addCriterion("WI53 =", value, "wi53");
            return (Criteria) this;
        }

        public Criteria andWi53NotEqualTo(String value) {
            addCriterion("WI53 <>", value, "wi53");
            return (Criteria) this;
        }

        public Criteria andWi53GreaterThan(String value) {
            addCriterion("WI53 >", value, "wi53");
            return (Criteria) this;
        }

        public Criteria andWi53GreaterThanOrEqualTo(String value) {
            addCriterion("WI53 >=", value, "wi53");
            return (Criteria) this;
        }

        public Criteria andWi53LessThan(String value) {
            addCriterion("WI53 <", value, "wi53");
            return (Criteria) this;
        }

        public Criteria andWi53LessThanOrEqualTo(String value) {
            addCriterion("WI53 <=", value, "wi53");
            return (Criteria) this;
        }

        public Criteria andWi53Like(String value) {
            addCriterion("WI53 like", value, "wi53");
            return (Criteria) this;
        }

        public Criteria andWi53NotLike(String value) {
            addCriterion("WI53 not like", value, "wi53");
            return (Criteria) this;
        }

        public Criteria andWi53In(List<String> values) {
            addCriterion("WI53 in", values, "wi53");
            return (Criteria) this;
        }

        public Criteria andWi53NotIn(List<String> values) {
            addCriterion("WI53 not in", values, "wi53");
            return (Criteria) this;
        }

        public Criteria andWi53Between(String value1, String value2) {
            addCriterion("WI53 between", value1, value2, "wi53");
            return (Criteria) this;
        }

        public Criteria andWi53NotBetween(String value1, String value2) {
            addCriterion("WI53 not between", value1, value2, "wi53");
            return (Criteria) this;
        }

        public Criteria andWi54IsNull() {
            addCriterion("WI54 is null");
            return (Criteria) this;
        }

        public Criteria andWi54IsNotNull() {
            addCriterion("WI54 is not null");
            return (Criteria) this;
        }

        public Criteria andWi54EqualTo(String value) {
            addCriterion("WI54 =", value, "wi54");
            return (Criteria) this;
        }

        public Criteria andWi54NotEqualTo(String value) {
            addCriterion("WI54 <>", value, "wi54");
            return (Criteria) this;
        }

        public Criteria andWi54GreaterThan(String value) {
            addCriterion("WI54 >", value, "wi54");
            return (Criteria) this;
        }

        public Criteria andWi54GreaterThanOrEqualTo(String value) {
            addCriterion("WI54 >=", value, "wi54");
            return (Criteria) this;
        }

        public Criteria andWi54LessThan(String value) {
            addCriterion("WI54 <", value, "wi54");
            return (Criteria) this;
        }

        public Criteria andWi54LessThanOrEqualTo(String value) {
            addCriterion("WI54 <=", value, "wi54");
            return (Criteria) this;
        }

        public Criteria andWi54Like(String value) {
            addCriterion("WI54 like", value, "wi54");
            return (Criteria) this;
        }

        public Criteria andWi54NotLike(String value) {
            addCriterion("WI54 not like", value, "wi54");
            return (Criteria) this;
        }

        public Criteria andWi54In(List<String> values) {
            addCriterion("WI54 in", values, "wi54");
            return (Criteria) this;
        }

        public Criteria andWi54NotIn(List<String> values) {
            addCriterion("WI54 not in", values, "wi54");
            return (Criteria) this;
        }

        public Criteria andWi54Between(String value1, String value2) {
            addCriterion("WI54 between", value1, value2, "wi54");
            return (Criteria) this;
        }

        public Criteria andWi54NotBetween(String value1, String value2) {
            addCriterion("WI54 not between", value1, value2, "wi54");
            return (Criteria) this;
        }

        public Criteria andWi55IsNull() {
            addCriterion("WI55 is null");
            return (Criteria) this;
        }

        public Criteria andWi55IsNotNull() {
            addCriterion("WI55 is not null");
            return (Criteria) this;
        }

        public Criteria andWi55EqualTo(String value) {
            addCriterion("WI55 =", value, "wi55");
            return (Criteria) this;
        }

        public Criteria andWi55NotEqualTo(String value) {
            addCriterion("WI55 <>", value, "wi55");
            return (Criteria) this;
        }

        public Criteria andWi55GreaterThan(String value) {
            addCriterion("WI55 >", value, "wi55");
            return (Criteria) this;
        }

        public Criteria andWi55GreaterThanOrEqualTo(String value) {
            addCriterion("WI55 >=", value, "wi55");
            return (Criteria) this;
        }

        public Criteria andWi55LessThan(String value) {
            addCriterion("WI55 <", value, "wi55");
            return (Criteria) this;
        }

        public Criteria andWi55LessThanOrEqualTo(String value) {
            addCriterion("WI55 <=", value, "wi55");
            return (Criteria) this;
        }

        public Criteria andWi55Like(String value) {
            addCriterion("WI55 like", value, "wi55");
            return (Criteria) this;
        }

        public Criteria andWi55NotLike(String value) {
            addCriterion("WI55 not like", value, "wi55");
            return (Criteria) this;
        }

        public Criteria andWi55In(List<String> values) {
            addCriterion("WI55 in", values, "wi55");
            return (Criteria) this;
        }

        public Criteria andWi55NotIn(List<String> values) {
            addCriterion("WI55 not in", values, "wi55");
            return (Criteria) this;
        }

        public Criteria andWi55Between(String value1, String value2) {
            addCriterion("WI55 between", value1, value2, "wi55");
            return (Criteria) this;
        }

        public Criteria andWi55NotBetween(String value1, String value2) {
            addCriterion("WI55 not between", value1, value2, "wi55");
            return (Criteria) this;
        }

        public Criteria andWi56IsNull() {
            addCriterion("WI56 is null");
            return (Criteria) this;
        }

        public Criteria andWi56IsNotNull() {
            addCriterion("WI56 is not null");
            return (Criteria) this;
        }

        public Criteria andWi56EqualTo(String value) {
            addCriterion("WI56 =", value, "wi56");
            return (Criteria) this;
        }

        public Criteria andWi56NotEqualTo(String value) {
            addCriterion("WI56 <>", value, "wi56");
            return (Criteria) this;
        }

        public Criteria andWi56GreaterThan(String value) {
            addCriterion("WI56 >", value, "wi56");
            return (Criteria) this;
        }

        public Criteria andWi56GreaterThanOrEqualTo(String value) {
            addCriterion("WI56 >=", value, "wi56");
            return (Criteria) this;
        }

        public Criteria andWi56LessThan(String value) {
            addCriterion("WI56 <", value, "wi56");
            return (Criteria) this;
        }

        public Criteria andWi56LessThanOrEqualTo(String value) {
            addCriterion("WI56 <=", value, "wi56");
            return (Criteria) this;
        }

        public Criteria andWi56Like(String value) {
            addCriterion("WI56 like", value, "wi56");
            return (Criteria) this;
        }

        public Criteria andWi56NotLike(String value) {
            addCriterion("WI56 not like", value, "wi56");
            return (Criteria) this;
        }

        public Criteria andWi56In(List<String> values) {
            addCriterion("WI56 in", values, "wi56");
            return (Criteria) this;
        }

        public Criteria andWi56NotIn(List<String> values) {
            addCriterion("WI56 not in", values, "wi56");
            return (Criteria) this;
        }

        public Criteria andWi56Between(String value1, String value2) {
            addCriterion("WI56 between", value1, value2, "wi56");
            return (Criteria) this;
        }

        public Criteria andWi56NotBetween(String value1, String value2) {
            addCriterion("WI56 not between", value1, value2, "wi56");
            return (Criteria) this;
        }

        public Criteria andWi57IsNull() {
            addCriterion("WI57 is null");
            return (Criteria) this;
        }

        public Criteria andWi57IsNotNull() {
            addCriterion("WI57 is not null");
            return (Criteria) this;
        }

        public Criteria andWi57EqualTo(String value) {
            addCriterion("WI57 =", value, "wi57");
            return (Criteria) this;
        }

        public Criteria andWi57NotEqualTo(String value) {
            addCriterion("WI57 <>", value, "wi57");
            return (Criteria) this;
        }

        public Criteria andWi57GreaterThan(String value) {
            addCriterion("WI57 >", value, "wi57");
            return (Criteria) this;
        }

        public Criteria andWi57GreaterThanOrEqualTo(String value) {
            addCriterion("WI57 >=", value, "wi57");
            return (Criteria) this;
        }

        public Criteria andWi57LessThan(String value) {
            addCriterion("WI57 <", value, "wi57");
            return (Criteria) this;
        }

        public Criteria andWi57LessThanOrEqualTo(String value) {
            addCriterion("WI57 <=", value, "wi57");
            return (Criteria) this;
        }

        public Criteria andWi57Like(String value) {
            addCriterion("WI57 like", value, "wi57");
            return (Criteria) this;
        }

        public Criteria andWi57NotLike(String value) {
            addCriterion("WI57 not like", value, "wi57");
            return (Criteria) this;
        }

        public Criteria andWi57In(List<String> values) {
            addCriterion("WI57 in", values, "wi57");
            return (Criteria) this;
        }

        public Criteria andWi57NotIn(List<String> values) {
            addCriterion("WI57 not in", values, "wi57");
            return (Criteria) this;
        }

        public Criteria andWi57Between(String value1, String value2) {
            addCriterion("WI57 between", value1, value2, "wi57");
            return (Criteria) this;
        }

        public Criteria andWi57NotBetween(String value1, String value2) {
            addCriterion("WI57 not between", value1, value2, "wi57");
            return (Criteria) this;
        }

        public Criteria andWi58IsNull() {
            addCriterion("WI58 is null");
            return (Criteria) this;
        }

        public Criteria andWi58IsNotNull() {
            addCriterion("WI58 is not null");
            return (Criteria) this;
        }

        public Criteria andWi58EqualTo(String value) {
            addCriterion("WI58 =", value, "wi58");
            return (Criteria) this;
        }

        public Criteria andWi58NotEqualTo(String value) {
            addCriterion("WI58 <>", value, "wi58");
            return (Criteria) this;
        }

        public Criteria andWi58GreaterThan(String value) {
            addCriterion("WI58 >", value, "wi58");
            return (Criteria) this;
        }

        public Criteria andWi58GreaterThanOrEqualTo(String value) {
            addCriterion("WI58 >=", value, "wi58");
            return (Criteria) this;
        }

        public Criteria andWi58LessThan(String value) {
            addCriterion("WI58 <", value, "wi58");
            return (Criteria) this;
        }

        public Criteria andWi58LessThanOrEqualTo(String value) {
            addCriterion("WI58 <=", value, "wi58");
            return (Criteria) this;
        }

        public Criteria andWi58Like(String value) {
            addCriterion("WI58 like", value, "wi58");
            return (Criteria) this;
        }

        public Criteria andWi58NotLike(String value) {
            addCriterion("WI58 not like", value, "wi58");
            return (Criteria) this;
        }

        public Criteria andWi58In(List<String> values) {
            addCriterion("WI58 in", values, "wi58");
            return (Criteria) this;
        }

        public Criteria andWi58NotIn(List<String> values) {
            addCriterion("WI58 not in", values, "wi58");
            return (Criteria) this;
        }

        public Criteria andWi58Between(String value1, String value2) {
            addCriterion("WI58 between", value1, value2, "wi58");
            return (Criteria) this;
        }

        public Criteria andWi58NotBetween(String value1, String value2) {
            addCriterion("WI58 not between", value1, value2, "wi58");
            return (Criteria) this;
        }

        public Criteria andWi59IsNull() {
            addCriterion("WI59 is null");
            return (Criteria) this;
        }

        public Criteria andWi59IsNotNull() {
            addCriterion("WI59 is not null");
            return (Criteria) this;
        }

        public Criteria andWi59EqualTo(String value) {
            addCriterion("WI59 =", value, "wi59");
            return (Criteria) this;
        }

        public Criteria andWi59NotEqualTo(String value) {
            addCriterion("WI59 <>", value, "wi59");
            return (Criteria) this;
        }

        public Criteria andWi59GreaterThan(String value) {
            addCriterion("WI59 >", value, "wi59");
            return (Criteria) this;
        }

        public Criteria andWi59GreaterThanOrEqualTo(String value) {
            addCriterion("WI59 >=", value, "wi59");
            return (Criteria) this;
        }

        public Criteria andWi59LessThan(String value) {
            addCriterion("WI59 <", value, "wi59");
            return (Criteria) this;
        }

        public Criteria andWi59LessThanOrEqualTo(String value) {
            addCriterion("WI59 <=", value, "wi59");
            return (Criteria) this;
        }

        public Criteria andWi59Like(String value) {
            addCriterion("WI59 like", value, "wi59");
            return (Criteria) this;
        }

        public Criteria andWi59NotLike(String value) {
            addCriterion("WI59 not like", value, "wi59");
            return (Criteria) this;
        }

        public Criteria andWi59In(List<String> values) {
            addCriterion("WI59 in", values, "wi59");
            return (Criteria) this;
        }

        public Criteria andWi59NotIn(List<String> values) {
            addCriterion("WI59 not in", values, "wi59");
            return (Criteria) this;
        }

        public Criteria andWi59Between(String value1, String value2) {
            addCriterion("WI59 between", value1, value2, "wi59");
            return (Criteria) this;
        }

        public Criteria andWi59NotBetween(String value1, String value2) {
            addCriterion("WI59 not between", value1, value2, "wi59");
            return (Criteria) this;
        }

        public Criteria andWi60IsNull() {
            addCriterion("WI60 is null");
            return (Criteria) this;
        }

        public Criteria andWi60IsNotNull() {
            addCriterion("WI60 is not null");
            return (Criteria) this;
        }

        public Criteria andWi60EqualTo(String value) {
            addCriterion("WI60 =", value, "wi60");
            return (Criteria) this;
        }

        public Criteria andWi60NotEqualTo(String value) {
            addCriterion("WI60 <>", value, "wi60");
            return (Criteria) this;
        }

        public Criteria andWi60GreaterThan(String value) {
            addCriterion("WI60 >", value, "wi60");
            return (Criteria) this;
        }

        public Criteria andWi60GreaterThanOrEqualTo(String value) {
            addCriterion("WI60 >=", value, "wi60");
            return (Criteria) this;
        }

        public Criteria andWi60LessThan(String value) {
            addCriterion("WI60 <", value, "wi60");
            return (Criteria) this;
        }

        public Criteria andWi60LessThanOrEqualTo(String value) {
            addCriterion("WI60 <=", value, "wi60");
            return (Criteria) this;
        }

        public Criteria andWi60Like(String value) {
            addCriterion("WI60 like", value, "wi60");
            return (Criteria) this;
        }

        public Criteria andWi60NotLike(String value) {
            addCriterion("WI60 not like", value, "wi60");
            return (Criteria) this;
        }

        public Criteria andWi60In(List<String> values) {
            addCriterion("WI60 in", values, "wi60");
            return (Criteria) this;
        }

        public Criteria andWi60NotIn(List<String> values) {
            addCriterion("WI60 not in", values, "wi60");
            return (Criteria) this;
        }

        public Criteria andWi60Between(String value1, String value2) {
            addCriterion("WI60 between", value1, value2, "wi60");
            return (Criteria) this;
        }

        public Criteria andWi60NotBetween(String value1, String value2) {
            addCriterion("WI60 not between", value1, value2, "wi60");
            return (Criteria) this;
        }

        public Criteria andWi61IsNull() {
            addCriterion("WI61 is null");
            return (Criteria) this;
        }

        public Criteria andWi61IsNotNull() {
            addCriterion("WI61 is not null");
            return (Criteria) this;
        }

        public Criteria andWi61EqualTo(String value) {
            addCriterion("WI61 =", value, "wi61");
            return (Criteria) this;
        }

        public Criteria andWi61NotEqualTo(String value) {
            addCriterion("WI61 <>", value, "wi61");
            return (Criteria) this;
        }

        public Criteria andWi61GreaterThan(String value) {
            addCriterion("WI61 >", value, "wi61");
            return (Criteria) this;
        }

        public Criteria andWi61GreaterThanOrEqualTo(String value) {
            addCriterion("WI61 >=", value, "wi61");
            return (Criteria) this;
        }

        public Criteria andWi61LessThan(String value) {
            addCriterion("WI61 <", value, "wi61");
            return (Criteria) this;
        }

        public Criteria andWi61LessThanOrEqualTo(String value) {
            addCriterion("WI61 <=", value, "wi61");
            return (Criteria) this;
        }

        public Criteria andWi61Like(String value) {
            addCriterion("WI61 like", value, "wi61");
            return (Criteria) this;
        }

        public Criteria andWi61NotLike(String value) {
            addCriterion("WI61 not like", value, "wi61");
            return (Criteria) this;
        }

        public Criteria andWi61In(List<String> values) {
            addCriterion("WI61 in", values, "wi61");
            return (Criteria) this;
        }

        public Criteria andWi61NotIn(List<String> values) {
            addCriterion("WI61 not in", values, "wi61");
            return (Criteria) this;
        }

        public Criteria andWi61Between(String value1, String value2) {
            addCriterion("WI61 between", value1, value2, "wi61");
            return (Criteria) this;
        }

        public Criteria andWi61NotBetween(String value1, String value2) {
            addCriterion("WI61 not between", value1, value2, "wi61");
            return (Criteria) this;
        }

        public Criteria andWi62IsNull() {
            addCriterion("WI62 is null");
            return (Criteria) this;
        }

        public Criteria andWi62IsNotNull() {
            addCriterion("WI62 is not null");
            return (Criteria) this;
        }

        public Criteria andWi62EqualTo(String value) {
            addCriterion("WI62 =", value, "wi62");
            return (Criteria) this;
        }

        public Criteria andWi62NotEqualTo(String value) {
            addCriterion("WI62 <>", value, "wi62");
            return (Criteria) this;
        }

        public Criteria andWi62GreaterThan(String value) {
            addCriterion("WI62 >", value, "wi62");
            return (Criteria) this;
        }

        public Criteria andWi62GreaterThanOrEqualTo(String value) {
            addCriterion("WI62 >=", value, "wi62");
            return (Criteria) this;
        }

        public Criteria andWi62LessThan(String value) {
            addCriterion("WI62 <", value, "wi62");
            return (Criteria) this;
        }

        public Criteria andWi62LessThanOrEqualTo(String value) {
            addCriterion("WI62 <=", value, "wi62");
            return (Criteria) this;
        }

        public Criteria andWi62Like(String value) {
            addCriterion("WI62 like", value, "wi62");
            return (Criteria) this;
        }

        public Criteria andWi62NotLike(String value) {
            addCriterion("WI62 not like", value, "wi62");
            return (Criteria) this;
        }

        public Criteria andWi62In(List<String> values) {
            addCriterion("WI62 in", values, "wi62");
            return (Criteria) this;
        }

        public Criteria andWi62NotIn(List<String> values) {
            addCriterion("WI62 not in", values, "wi62");
            return (Criteria) this;
        }

        public Criteria andWi62Between(String value1, String value2) {
            addCriterion("WI62 between", value1, value2, "wi62");
            return (Criteria) this;
        }

        public Criteria andWi62NotBetween(String value1, String value2) {
            addCriterion("WI62 not between", value1, value2, "wi62");
            return (Criteria) this;
        }

        public Criteria andWi31IsNull() {
            addCriterion("WI31 is null");
            return (Criteria) this;
        }

        public Criteria andWi31IsNotNull() {
            addCriterion("WI31 is not null");
            return (Criteria) this;
        }

        public Criteria andWi31EqualTo(String value) {
            addCriterion("WI31 =", value, "wi31");
            return (Criteria) this;
        }

        public Criteria andWi31NotEqualTo(String value) {
            addCriterion("WI31 <>", value, "wi31");
            return (Criteria) this;
        }

        public Criteria andWi31GreaterThan(String value) {
            addCriterion("WI31 >", value, "wi31");
            return (Criteria) this;
        }

        public Criteria andWi31GreaterThanOrEqualTo(String value) {
            addCriterion("WI31 >=", value, "wi31");
            return (Criteria) this;
        }

        public Criteria andWi31LessThan(String value) {
            addCriterion("WI31 <", value, "wi31");
            return (Criteria) this;
        }

        public Criteria andWi31LessThanOrEqualTo(String value) {
            addCriterion("WI31 <=", value, "wi31");
            return (Criteria) this;
        }

        public Criteria andWi31Like(String value) {
            addCriterion("WI31 like", value, "wi31");
            return (Criteria) this;
        }

        public Criteria andWi31NotLike(String value) {
            addCriterion("WI31 not like", value, "wi31");
            return (Criteria) this;
        }

        public Criteria andWi31In(List<String> values) {
            addCriterion("WI31 in", values, "wi31");
            return (Criteria) this;
        }

        public Criteria andWi31NotIn(List<String> values) {
            addCriterion("WI31 not in", values, "wi31");
            return (Criteria) this;
        }

        public Criteria andWi31Between(String value1, String value2) {
            addCriterion("WI31 between", value1, value2, "wi31");
            return (Criteria) this;
        }

        public Criteria andWi31NotBetween(String value1, String value2) {
            addCriterion("WI31 not between", value1, value2, "wi31");
            return (Criteria) this;
        }

        public Criteria andWi63IsNull() {
            addCriterion("WI63 is null");
            return (Criteria) this;
        }

        public Criteria andWi63IsNotNull() {
            addCriterion("WI63 is not null");
            return (Criteria) this;
        }

        public Criteria andWi63EqualTo(String value) {
            addCriterion("WI63 =", value, "wi63");
            return (Criteria) this;
        }

        public Criteria andWi63NotEqualTo(String value) {
            addCriterion("WI63 <>", value, "wi63");
            return (Criteria) this;
        }

        public Criteria andWi63GreaterThan(String value) {
            addCriterion("WI63 >", value, "wi63");
            return (Criteria) this;
        }

        public Criteria andWi63GreaterThanOrEqualTo(String value) {
            addCriterion("WI63 >=", value, "wi63");
            return (Criteria) this;
        }

        public Criteria andWi63LessThan(String value) {
            addCriterion("WI63 <", value, "wi63");
            return (Criteria) this;
        }

        public Criteria andWi63LessThanOrEqualTo(String value) {
            addCriterion("WI63 <=", value, "wi63");
            return (Criteria) this;
        }

        public Criteria andWi63Like(String value) {
            addCriterion("WI63 like", value, "wi63");
            return (Criteria) this;
        }

        public Criteria andWi63NotLike(String value) {
            addCriterion("WI63 not like", value, "wi63");
            return (Criteria) this;
        }

        public Criteria andWi63In(List<String> values) {
            addCriterion("WI63 in", values, "wi63");
            return (Criteria) this;
        }

        public Criteria andWi63NotIn(List<String> values) {
            addCriterion("WI63 not in", values, "wi63");
            return (Criteria) this;
        }

        public Criteria andWi63Between(String value1, String value2) {
            addCriterion("WI63 between", value1, value2, "wi63");
            return (Criteria) this;
        }

        public Criteria andWi63NotBetween(String value1, String value2) {
            addCriterion("WI63 not between", value1, value2, "wi63");
            return (Criteria) this;
        }

        public Criteria andWi64IsNull() {
            addCriterion("WI64 is null");
            return (Criteria) this;
        }

        public Criteria andWi64IsNotNull() {
            addCriterion("WI64 is not null");
            return (Criteria) this;
        }

        public Criteria andWi64EqualTo(String value) {
            addCriterion("WI64 =", value, "wi64");
            return (Criteria) this;
        }

        public Criteria andWi64NotEqualTo(String value) {
            addCriterion("WI64 <>", value, "wi64");
            return (Criteria) this;
        }

        public Criteria andWi64GreaterThan(String value) {
            addCriterion("WI64 >", value, "wi64");
            return (Criteria) this;
        }

        public Criteria andWi64GreaterThanOrEqualTo(String value) {
            addCriterion("WI64 >=", value, "wi64");
            return (Criteria) this;
        }

        public Criteria andWi64LessThan(String value) {
            addCriterion("WI64 <", value, "wi64");
            return (Criteria) this;
        }

        public Criteria andWi64LessThanOrEqualTo(String value) {
            addCriterion("WI64 <=", value, "wi64");
            return (Criteria) this;
        }

        public Criteria andWi64Like(String value) {
            addCriterion("WI64 like", value, "wi64");
            return (Criteria) this;
        }

        public Criteria andWi64NotLike(String value) {
            addCriterion("WI64 not like", value, "wi64");
            return (Criteria) this;
        }

        public Criteria andWi64In(List<String> values) {
            addCriterion("WI64 in", values, "wi64");
            return (Criteria) this;
        }

        public Criteria andWi64NotIn(List<String> values) {
            addCriterion("WI64 not in", values, "wi64");
            return (Criteria) this;
        }

        public Criteria andWi64Between(String value1, String value2) {
            addCriterion("WI64 between", value1, value2, "wi64");
            return (Criteria) this;
        }

        public Criteria andWi64NotBetween(String value1, String value2) {
            addCriterion("WI64 not between", value1, value2, "wi64");
            return (Criteria) this;
        }

        public Criteria andWi65IsNull() {
            addCriterion("WI65 is null");
            return (Criteria) this;
        }

        public Criteria andWi65IsNotNull() {
            addCriterion("WI65 is not null");
            return (Criteria) this;
        }

        public Criteria andWi65EqualTo(Date value) {
            addCriterion("WI65 =", value, "wi65");
            return (Criteria) this;
        }

        public Criteria andWi65NotEqualTo(Date value) {
            addCriterion("WI65 <>", value, "wi65");
            return (Criteria) this;
        }

        public Criteria andWi65GreaterThan(Date value) {
            addCriterion("WI65 >", value, "wi65");
            return (Criteria) this;
        }

        public Criteria andWi65GreaterThanOrEqualTo(Date value) {
            addCriterion("WI65 >=", value, "wi65");
            return (Criteria) this;
        }

        public Criteria andWi65LessThan(Date value) {
            addCriterion("WI65 <", value, "wi65");
            return (Criteria) this;
        }

        public Criteria andWi65LessThanOrEqualTo(Date value) {
            addCriterion("WI65 <=", value, "wi65");
            return (Criteria) this;
        }

        public Criteria andWi65In(List<Date> values) {
            addCriterion("WI65 in", values, "wi65");
            return (Criteria) this;
        }

        public Criteria andWi65NotIn(List<Date> values) {
            addCriterion("WI65 not in", values, "wi65");
            return (Criteria) this;
        }

        public Criteria andWi65Between(Date value1, Date value2) {
            addCriterion("WI65 between", value1, value2, "wi65");
            return (Criteria) this;
        }

        public Criteria andWi65NotBetween(Date value1, Date value2) {
            addCriterion("WI65 not between", value1, value2, "wi65");
            return (Criteria) this;
        }

        public Criteria andWi66IsNull() {
            addCriterion("WI66 is null");
            return (Criteria) this;
        }

        public Criteria andWi66IsNotNull() {
            addCriterion("WI66 is not null");
            return (Criteria) this;
        }

        public Criteria andWi66EqualTo(String value) {
            addCriterion("WI66 =", value, "wi66");
            return (Criteria) this;
        }

        public Criteria andWi66NotEqualTo(String value) {
            addCriterion("WI66 <>", value, "wi66");
            return (Criteria) this;
        }

        public Criteria andWi66GreaterThan(String value) {
            addCriterion("WI66 >", value, "wi66");
            return (Criteria) this;
        }

        public Criteria andWi66GreaterThanOrEqualTo(String value) {
            addCriterion("WI66 >=", value, "wi66");
            return (Criteria) this;
        }

        public Criteria andWi66LessThan(String value) {
            addCriterion("WI66 <", value, "wi66");
            return (Criteria) this;
        }

        public Criteria andWi66LessThanOrEqualTo(String value) {
            addCriterion("WI66 <=", value, "wi66");
            return (Criteria) this;
        }

        public Criteria andWi66Like(String value) {
            addCriterion("WI66 like", value, "wi66");
            return (Criteria) this;
        }

        public Criteria andWi66NotLike(String value) {
            addCriterion("WI66 not like", value, "wi66");
            return (Criteria) this;
        }

        public Criteria andWi66In(List<String> values) {
            addCriterion("WI66 in", values, "wi66");
            return (Criteria) this;
        }

        public Criteria andWi66NotIn(List<String> values) {
            addCriterion("WI66 not in", values, "wi66");
            return (Criteria) this;
        }

        public Criteria andWi66Between(String value1, String value2) {
            addCriterion("WI66 between", value1, value2, "wi66");
            return (Criteria) this;
        }

        public Criteria andWi66NotBetween(String value1, String value2) {
            addCriterion("WI66 not between", value1, value2, "wi66");
            return (Criteria) this;
        }

        public Criteria andWi67IsNull() {
            addCriterion("WI67 is null");
            return (Criteria) this;
        }

        public Criteria andWi67IsNotNull() {
            addCriterion("WI67 is not null");
            return (Criteria) this;
        }

        public Criteria andWi67EqualTo(String value) {
            addCriterion("WI67 =", value, "wi67");
            return (Criteria) this;
        }

        public Criteria andWi67NotEqualTo(String value) {
            addCriterion("WI67 <>", value, "wi67");
            return (Criteria) this;
        }

        public Criteria andWi67GreaterThan(String value) {
            addCriterion("WI67 >", value, "wi67");
            return (Criteria) this;
        }

        public Criteria andWi67GreaterThanOrEqualTo(String value) {
            addCriterion("WI67 >=", value, "wi67");
            return (Criteria) this;
        }

        public Criteria andWi67LessThan(String value) {
            addCriterion("WI67 <", value, "wi67");
            return (Criteria) this;
        }

        public Criteria andWi67LessThanOrEqualTo(String value) {
            addCriterion("WI67 <=", value, "wi67");
            return (Criteria) this;
        }

        public Criteria andWi67Like(String value) {
            addCriterion("WI67 like", value, "wi67");
            return (Criteria) this;
        }

        public Criteria andWi67NotLike(String value) {
            addCriterion("WI67 not like", value, "wi67");
            return (Criteria) this;
        }

        public Criteria andWi67In(List<String> values) {
            addCriterion("WI67 in", values, "wi67");
            return (Criteria) this;
        }

        public Criteria andWi67NotIn(List<String> values) {
            addCriterion("WI67 not in", values, "wi67");
            return (Criteria) this;
        }

        public Criteria andWi67Between(String value1, String value2) {
            addCriterion("WI67 between", value1, value2, "wi67");
            return (Criteria) this;
        }

        public Criteria andWi67NotBetween(String value1, String value2) {
            addCriterion("WI67 not between", value1, value2, "wi67");
            return (Criteria) this;
        }

        public Criteria andWi68IsNull() {
            addCriterion("WI68 is null");
            return (Criteria) this;
        }

        public Criteria andWi68IsNotNull() {
            addCriterion("WI68 is not null");
            return (Criteria) this;
        }

        public Criteria andWi68EqualTo(String value) {
            addCriterion("WI68 =", value, "wi68");
            return (Criteria) this;
        }

        public Criteria andWi68NotEqualTo(String value) {
            addCriterion("WI68 <>", value, "wi68");
            return (Criteria) this;
        }

        public Criteria andWi68GreaterThan(String value) {
            addCriterion("WI68 >", value, "wi68");
            return (Criteria) this;
        }

        public Criteria andWi68GreaterThanOrEqualTo(String value) {
            addCriterion("WI68 >=", value, "wi68");
            return (Criteria) this;
        }

        public Criteria andWi68LessThan(String value) {
            addCriterion("WI68 <", value, "wi68");
            return (Criteria) this;
        }

        public Criteria andWi68LessThanOrEqualTo(String value) {
            addCriterion("WI68 <=", value, "wi68");
            return (Criteria) this;
        }

        public Criteria andWi68Like(String value) {
            addCriterion("WI68 like", value, "wi68");
            return (Criteria) this;
        }

        public Criteria andWi68NotLike(String value) {
            addCriterion("WI68 not like", value, "wi68");
            return (Criteria) this;
        }

        public Criteria andWi68In(List<String> values) {
            addCriterion("WI68 in", values, "wi68");
            return (Criteria) this;
        }

        public Criteria andWi68NotIn(List<String> values) {
            addCriterion("WI68 not in", values, "wi68");
            return (Criteria) this;
        }

        public Criteria andWi68Between(String value1, String value2) {
            addCriterion("WI68 between", value1, value2, "wi68");
            return (Criteria) this;
        }

        public Criteria andWi68NotBetween(String value1, String value2) {
            addCriterion("WI68 not between", value1, value2, "wi68");
            return (Criteria) this;
        }

        public Criteria andWi69IsNull() {
            addCriterion("WI69 is null");
            return (Criteria) this;
        }

        public Criteria andWi69IsNotNull() {
            addCriterion("WI69 is not null");
            return (Criteria) this;
        }

        public Criteria andWi69EqualTo(String value) {
            addCriterion("WI69 =", value, "wi69");
            return (Criteria) this;
        }

        public Criteria andWi69NotEqualTo(String value) {
            addCriterion("WI69 <>", value, "wi69");
            return (Criteria) this;
        }

        public Criteria andWi69GreaterThan(String value) {
            addCriterion("WI69 >", value, "wi69");
            return (Criteria) this;
        }

        public Criteria andWi69GreaterThanOrEqualTo(String value) {
            addCriterion("WI69 >=", value, "wi69");
            return (Criteria) this;
        }

        public Criteria andWi69LessThan(String value) {
            addCriterion("WI69 <", value, "wi69");
            return (Criteria) this;
        }

        public Criteria andWi69LessThanOrEqualTo(String value) {
            addCriterion("WI69 <=", value, "wi69");
            return (Criteria) this;
        }

        public Criteria andWi69Like(String value) {
            addCriterion("WI69 like", value, "wi69");
            return (Criteria) this;
        }

        public Criteria andWi69NotLike(String value) {
            addCriterion("WI69 not like", value, "wi69");
            return (Criteria) this;
        }

        public Criteria andWi69In(List<String> values) {
            addCriterion("WI69 in", values, "wi69");
            return (Criteria) this;
        }

        public Criteria andWi69NotIn(List<String> values) {
            addCriterion("WI69 not in", values, "wi69");
            return (Criteria) this;
        }

        public Criteria andWi69Between(String value1, String value2) {
            addCriterion("WI69 between", value1, value2, "wi69");
            return (Criteria) this;
        }

        public Criteria andWi69NotBetween(String value1, String value2) {
            addCriterion("WI69 not between", value1, value2, "wi69");
            return (Criteria) this;
        }

        public Criteria andWi70IsNull() {
            addCriterion("WI70 is null");
            return (Criteria) this;
        }

        public Criteria andWi70IsNotNull() {
            addCriterion("WI70 is not null");
            return (Criteria) this;
        }

        public Criteria andWi70EqualTo(String value) {
            addCriterion("WI70 =", value, "wi70");
            return (Criteria) this;
        }

        public Criteria andWi70NotEqualTo(String value) {
            addCriterion("WI70 <>", value, "wi70");
            return (Criteria) this;
        }

        public Criteria andWi70GreaterThan(String value) {
            addCriterion("WI70 >", value, "wi70");
            return (Criteria) this;
        }

        public Criteria andWi70GreaterThanOrEqualTo(String value) {
            addCriterion("WI70 >=", value, "wi70");
            return (Criteria) this;
        }

        public Criteria andWi70LessThan(String value) {
            addCriterion("WI70 <", value, "wi70");
            return (Criteria) this;
        }

        public Criteria andWi70LessThanOrEqualTo(String value) {
            addCriterion("WI70 <=", value, "wi70");
            return (Criteria) this;
        }

        public Criteria andWi70Like(String value) {
            addCriterion("WI70 like", value, "wi70");
            return (Criteria) this;
        }

        public Criteria andWi70NotLike(String value) {
            addCriterion("WI70 not like", value, "wi70");
            return (Criteria) this;
        }

        public Criteria andWi70In(List<String> values) {
            addCriterion("WI70 in", values, "wi70");
            return (Criteria) this;
        }

        public Criteria andWi70NotIn(List<String> values) {
            addCriterion("WI70 not in", values, "wi70");
            return (Criteria) this;
        }

        public Criteria andWi70Between(String value1, String value2) {
            addCriterion("WI70 between", value1, value2, "wi70");
            return (Criteria) this;
        }

        public Criteria andWi70NotBetween(String value1, String value2) {
            addCriterion("WI70 not between", value1, value2, "wi70");
            return (Criteria) this;
        }

        public Criteria andWi71IsNull() {
            addCriterion("WI71 is null");
            return (Criteria) this;
        }

        public Criteria andWi71IsNotNull() {
            addCriterion("WI71 is not null");
            return (Criteria) this;
        }

        public Criteria andWi71EqualTo(String value) {
            addCriterion("WI71 =", value, "wi71");
            return (Criteria) this;
        }

        public Criteria andWi71NotEqualTo(String value) {
            addCriterion("WI71 <>", value, "wi71");
            return (Criteria) this;
        }

        public Criteria andWi71GreaterThan(String value) {
            addCriterion("WI71 >", value, "wi71");
            return (Criteria) this;
        }

        public Criteria andWi71GreaterThanOrEqualTo(String value) {
            addCriterion("WI71 >=", value, "wi71");
            return (Criteria) this;
        }

        public Criteria andWi71LessThan(String value) {
            addCriterion("WI71 <", value, "wi71");
            return (Criteria) this;
        }

        public Criteria andWi71LessThanOrEqualTo(String value) {
            addCriterion("WI71 <=", value, "wi71");
            return (Criteria) this;
        }

        public Criteria andWi71Like(String value) {
            addCriterion("WI71 like", value, "wi71");
            return (Criteria) this;
        }

        public Criteria andWi71NotLike(String value) {
            addCriterion("WI71 not like", value, "wi71");
            return (Criteria) this;
        }

        public Criteria andWi71In(List<String> values) {
            addCriterion("WI71 in", values, "wi71");
            return (Criteria) this;
        }

        public Criteria andWi71NotIn(List<String> values) {
            addCriterion("WI71 not in", values, "wi71");
            return (Criteria) this;
        }

        public Criteria andWi71Between(String value1, String value2) {
            addCriterion("WI71 between", value1, value2, "wi71");
            return (Criteria) this;
        }

        public Criteria andWi71NotBetween(String value1, String value2) {
            addCriterion("WI71 not between", value1, value2, "wi71");
            return (Criteria) this;
        }

        public Criteria andWi72IsNull() {
            addCriterion("WI72 is null");
            return (Criteria) this;
        }

        public Criteria andWi72IsNotNull() {
            addCriterion("WI72 is not null");
            return (Criteria) this;
        }

        public Criteria andWi72EqualTo(String value) {
            addCriterion("WI72 =", value, "wi72");
            return (Criteria) this;
        }

        public Criteria andWi72NotEqualTo(String value) {
            addCriterion("WI72 <>", value, "wi72");
            return (Criteria) this;
        }

        public Criteria andWi72GreaterThan(String value) {
            addCriterion("WI72 >", value, "wi72");
            return (Criteria) this;
        }

        public Criteria andWi72GreaterThanOrEqualTo(String value) {
            addCriterion("WI72 >=", value, "wi72");
            return (Criteria) this;
        }

        public Criteria andWi72LessThan(String value) {
            addCriterion("WI72 <", value, "wi72");
            return (Criteria) this;
        }

        public Criteria andWi72LessThanOrEqualTo(String value) {
            addCriterion("WI72 <=", value, "wi72");
            return (Criteria) this;
        }

        public Criteria andWi72Like(String value) {
            addCriterion("WI72 like", value, "wi72");
            return (Criteria) this;
        }

        public Criteria andWi72NotLike(String value) {
            addCriterion("WI72 not like", value, "wi72");
            return (Criteria) this;
        }

        public Criteria andWi72In(List<String> values) {
            addCriterion("WI72 in", values, "wi72");
            return (Criteria) this;
        }

        public Criteria andWi72NotIn(List<String> values) {
            addCriterion("WI72 not in", values, "wi72");
            return (Criteria) this;
        }

        public Criteria andWi72Between(String value1, String value2) {
            addCriterion("WI72 between", value1, value2, "wi72");
            return (Criteria) this;
        }

        public Criteria andWi72NotBetween(String value1, String value2) {
            addCriterion("WI72 not between", value1, value2, "wi72");
            return (Criteria) this;
        }

        public Criteria andWi73IsNull() {
            addCriterion("WI73 is null");
            return (Criteria) this;
        }

        public Criteria andWi73IsNotNull() {
            addCriterion("WI73 is not null");
            return (Criteria) this;
        }

        public Criteria andWi73EqualTo(String value) {
            addCriterion("WI73 =", value, "wi73");
            return (Criteria) this;
        }

        public Criteria andWi73NotEqualTo(String value) {
            addCriterion("WI73 <>", value, "wi73");
            return (Criteria) this;
        }

        public Criteria andWi73GreaterThan(String value) {
            addCriterion("WI73 >", value, "wi73");
            return (Criteria) this;
        }

        public Criteria andWi73GreaterThanOrEqualTo(String value) {
            addCriterion("WI73 >=", value, "wi73");
            return (Criteria) this;
        }

        public Criteria andWi73LessThan(String value) {
            addCriterion("WI73 <", value, "wi73");
            return (Criteria) this;
        }

        public Criteria andWi73LessThanOrEqualTo(String value) {
            addCriterion("WI73 <=", value, "wi73");
            return (Criteria) this;
        }

        public Criteria andWi73Like(String value) {
            addCriterion("WI73 like", value, "wi73");
            return (Criteria) this;
        }

        public Criteria andWi73NotLike(String value) {
            addCriterion("WI73 not like", value, "wi73");
            return (Criteria) this;
        }

        public Criteria andWi73In(List<String> values) {
            addCriterion("WI73 in", values, "wi73");
            return (Criteria) this;
        }

        public Criteria andWi73NotIn(List<String> values) {
            addCriterion("WI73 not in", values, "wi73");
            return (Criteria) this;
        }

        public Criteria andWi73Between(String value1, String value2) {
            addCriterion("WI73 between", value1, value2, "wi73");
            return (Criteria) this;
        }

        public Criteria andWi73NotBetween(String value1, String value2) {
            addCriterion("WI73 not between", value1, value2, "wi73");
            return (Criteria) this;
        }

        public Criteria andWi74IsNull() {
            addCriterion("WI74 is null");
            return (Criteria) this;
        }

        public Criteria andWi74IsNotNull() {
            addCriterion("WI74 is not null");
            return (Criteria) this;
        }

        public Criteria andWi74EqualTo(String value) {
            addCriterion("WI74 =", value, "wi74");
            return (Criteria) this;
        }

        public Criteria andWi74NotEqualTo(String value) {
            addCriterion("WI74 <>", value, "wi74");
            return (Criteria) this;
        }

        public Criteria andWi74GreaterThan(String value) {
            addCriterion("WI74 >", value, "wi74");
            return (Criteria) this;
        }

        public Criteria andWi74GreaterThanOrEqualTo(String value) {
            addCriterion("WI74 >=", value, "wi74");
            return (Criteria) this;
        }

        public Criteria andWi74LessThan(String value) {
            addCriterion("WI74 <", value, "wi74");
            return (Criteria) this;
        }

        public Criteria andWi74LessThanOrEqualTo(String value) {
            addCriterion("WI74 <=", value, "wi74");
            return (Criteria) this;
        }

        public Criteria andWi74Like(String value) {
            addCriterion("WI74 like", value, "wi74");
            return (Criteria) this;
        }

        public Criteria andWi74NotLike(String value) {
            addCriterion("WI74 not like", value, "wi74");
            return (Criteria) this;
        }

        public Criteria andWi74In(List<String> values) {
            addCriterion("WI74 in", values, "wi74");
            return (Criteria) this;
        }

        public Criteria andWi74NotIn(List<String> values) {
            addCriterion("WI74 not in", values, "wi74");
            return (Criteria) this;
        }

        public Criteria andWi74Between(String value1, String value2) {
            addCriterion("WI74 between", value1, value2, "wi74");
            return (Criteria) this;
        }

        public Criteria andWi74NotBetween(String value1, String value2) {
            addCriterion("WI74 not between", value1, value2, "wi74");
            return (Criteria) this;
        }

        public Criteria andWi75IsNull() {
            addCriterion("WI75 is null");
            return (Criteria) this;
        }

        public Criteria andWi75IsNotNull() {
            addCriterion("WI75 is not null");
            return (Criteria) this;
        }

        public Criteria andWi75EqualTo(String value) {
            addCriterion("WI75 =", value, "wi75");
            return (Criteria) this;
        }

        public Criteria andWi75NotEqualTo(String value) {
            addCriterion("WI75 <>", value, "wi75");
            return (Criteria) this;
        }

        public Criteria andWi75GreaterThan(String value) {
            addCriterion("WI75 >", value, "wi75");
            return (Criteria) this;
        }

        public Criteria andWi75GreaterThanOrEqualTo(String value) {
            addCriterion("WI75 >=", value, "wi75");
            return (Criteria) this;
        }

        public Criteria andWi75LessThan(String value) {
            addCriterion("WI75 <", value, "wi75");
            return (Criteria) this;
        }

        public Criteria andWi75LessThanOrEqualTo(String value) {
            addCriterion("WI75 <=", value, "wi75");
            return (Criteria) this;
        }

        public Criteria andWi75Like(String value) {
            addCriterion("WI75 like", value, "wi75");
            return (Criteria) this;
        }

        public Criteria andWi75NotLike(String value) {
            addCriterion("WI75 not like", value, "wi75");
            return (Criteria) this;
        }

        public Criteria andWi75In(List<String> values) {
            addCriterion("WI75 in", values, "wi75");
            return (Criteria) this;
        }

        public Criteria andWi75NotIn(List<String> values) {
            addCriterion("WI75 not in", values, "wi75");
            return (Criteria) this;
        }

        public Criteria andWi75Between(String value1, String value2) {
            addCriterion("WI75 between", value1, value2, "wi75");
            return (Criteria) this;
        }

        public Criteria andWi75NotBetween(String value1, String value2) {
            addCriterion("WI75 not between", value1, value2, "wi75");
            return (Criteria) this;
        }

        public Criteria andWi76IsNull() {
            addCriterion("WI76 is null");
            return (Criteria) this;
        }

        public Criteria andWi76IsNotNull() {
            addCriterion("WI76 is not null");
            return (Criteria) this;
        }

        public Criteria andWi76EqualTo(String value) {
            addCriterion("WI76 =", value, "wi76");
            return (Criteria) this;
        }

        public Criteria andWi76NotEqualTo(String value) {
            addCriterion("WI76 <>", value, "wi76");
            return (Criteria) this;
        }

        public Criteria andWi76GreaterThan(String value) {
            addCriterion("WI76 >", value, "wi76");
            return (Criteria) this;
        }

        public Criteria andWi76GreaterThanOrEqualTo(String value) {
            addCriterion("WI76 >=", value, "wi76");
            return (Criteria) this;
        }

        public Criteria andWi76LessThan(String value) {
            addCriterion("WI76 <", value, "wi76");
            return (Criteria) this;
        }

        public Criteria andWi76LessThanOrEqualTo(String value) {
            addCriterion("WI76 <=", value, "wi76");
            return (Criteria) this;
        }

        public Criteria andWi76Like(String value) {
            addCriterion("WI76 like", value, "wi76");
            return (Criteria) this;
        }

        public Criteria andWi76NotLike(String value) {
            addCriterion("WI76 not like", value, "wi76");
            return (Criteria) this;
        }

        public Criteria andWi76In(List<String> values) {
            addCriterion("WI76 in", values, "wi76");
            return (Criteria) this;
        }

        public Criteria andWi76NotIn(List<String> values) {
            addCriterion("WI76 not in", values, "wi76");
            return (Criteria) this;
        }

        public Criteria andWi76Between(String value1, String value2) {
            addCriterion("WI76 between", value1, value2, "wi76");
            return (Criteria) this;
        }

        public Criteria andWi76NotBetween(String value1, String value2) {
            addCriterion("WI76 not between", value1, value2, "wi76");
            return (Criteria) this;
        }

        public Criteria andWi77IsNull() {
            addCriterion("WI77 is null");
            return (Criteria) this;
        }

        public Criteria andWi77IsNotNull() {
            addCriterion("WI77 is not null");
            return (Criteria) this;
        }

        public Criteria andWi77EqualTo(String value) {
            addCriterion("WI77 =", value, "wi77");
            return (Criteria) this;
        }

        public Criteria andWi77NotEqualTo(String value) {
            addCriterion("WI77 <>", value, "wi77");
            return (Criteria) this;
        }

        public Criteria andWi77GreaterThan(String value) {
            addCriterion("WI77 >", value, "wi77");
            return (Criteria) this;
        }

        public Criteria andWi77GreaterThanOrEqualTo(String value) {
            addCriterion("WI77 >=", value, "wi77");
            return (Criteria) this;
        }

        public Criteria andWi77LessThan(String value) {
            addCriterion("WI77 <", value, "wi77");
            return (Criteria) this;
        }

        public Criteria andWi77LessThanOrEqualTo(String value) {
            addCriterion("WI77 <=", value, "wi77");
            return (Criteria) this;
        }

        public Criteria andWi77Like(String value) {
            addCriterion("WI77 like", value, "wi77");
            return (Criteria) this;
        }

        public Criteria andWi77NotLike(String value) {
            addCriterion("WI77 not like", value, "wi77");
            return (Criteria) this;
        }

        public Criteria andWi77In(List<String> values) {
            addCriterion("WI77 in", values, "wi77");
            return (Criteria) this;
        }

        public Criteria andWi77NotIn(List<String> values) {
            addCriterion("WI77 not in", values, "wi77");
            return (Criteria) this;
        }

        public Criteria andWi77Between(String value1, String value2) {
            addCriterion("WI77 between", value1, value2, "wi77");
            return (Criteria) this;
        }

        public Criteria andWi77NotBetween(String value1, String value2) {
            addCriterion("WI77 not between", value1, value2, "wi77");
            return (Criteria) this;
        }

        public Criteria andSmstrackingIsNull() {
            addCriterion("SMSTRACKING is null");
            return (Criteria) this;
        }

        public Criteria andSmstrackingIsNotNull() {
            addCriterion("SMSTRACKING is not null");
            return (Criteria) this;
        }

        public Criteria andSmstrackingEqualTo(String value) {
            addCriterion("SMSTRACKING =", value, "smstracking");
            return (Criteria) this;
        }

        public Criteria andSmstrackingNotEqualTo(String value) {
            addCriterion("SMSTRACKING <>", value, "smstracking");
            return (Criteria) this;
        }

        public Criteria andSmstrackingGreaterThan(String value) {
            addCriterion("SMSTRACKING >", value, "smstracking");
            return (Criteria) this;
        }

        public Criteria andSmstrackingGreaterThanOrEqualTo(String value) {
            addCriterion("SMSTRACKING >=", value, "smstracking");
            return (Criteria) this;
        }

        public Criteria andSmstrackingLessThan(String value) {
            addCriterion("SMSTRACKING <", value, "smstracking");
            return (Criteria) this;
        }

        public Criteria andSmstrackingLessThanOrEqualTo(String value) {
            addCriterion("SMSTRACKING <=", value, "smstracking");
            return (Criteria) this;
        }

        public Criteria andSmstrackingLike(String value) {
            addCriterion("SMSTRACKING like", value, "smstracking");
            return (Criteria) this;
        }

        public Criteria andSmstrackingNotLike(String value) {
            addCriterion("SMSTRACKING not like", value, "smstracking");
            return (Criteria) this;
        }

        public Criteria andSmstrackingIn(List<String> values) {
            addCriterion("SMSTRACKING in", values, "smstracking");
            return (Criteria) this;
        }

        public Criteria andSmstrackingNotIn(List<String> values) {
            addCriterion("SMSTRACKING not in", values, "smstracking");
            return (Criteria) this;
        }

        public Criteria andSmstrackingBetween(String value1, String value2) {
            addCriterion("SMSTRACKING between", value1, value2, "smstracking");
            return (Criteria) this;
        }

        public Criteria andSmstrackingNotBetween(String value1, String value2) {
            addCriterion("SMSTRACKING not between", value1, value2, "smstracking");
            return (Criteria) this;
        }

        public Criteria andSentSendMorePeopleIsNull() {
            addCriterion("SENT_SEND_MORE_PEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andSentSendMorePeopleIsNotNull() {
            addCriterion("SENT_SEND_MORE_PEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andSentSendMorePeopleEqualTo(String value) {
            addCriterion("SENT_SEND_MORE_PEOPLE =", value, "sentSendMorePeople");
            return (Criteria) this;
        }

        public Criteria andSentSendMorePeopleNotEqualTo(String value) {
            addCriterion("SENT_SEND_MORE_PEOPLE <>", value, "sentSendMorePeople");
            return (Criteria) this;
        }

        public Criteria andSentSendMorePeopleGreaterThan(String value) {
            addCriterion("SENT_SEND_MORE_PEOPLE >", value, "sentSendMorePeople");
            return (Criteria) this;
        }

        public Criteria andSentSendMorePeopleGreaterThanOrEqualTo(String value) {
            addCriterion("SENT_SEND_MORE_PEOPLE >=", value, "sentSendMorePeople");
            return (Criteria) this;
        }

        public Criteria andSentSendMorePeopleLessThan(String value) {
            addCriterion("SENT_SEND_MORE_PEOPLE <", value, "sentSendMorePeople");
            return (Criteria) this;
        }

        public Criteria andSentSendMorePeopleLessThanOrEqualTo(String value) {
            addCriterion("SENT_SEND_MORE_PEOPLE <=", value, "sentSendMorePeople");
            return (Criteria) this;
        }

        public Criteria andSentSendMorePeopleLike(String value) {
            addCriterion("SENT_SEND_MORE_PEOPLE like", value, "sentSendMorePeople");
            return (Criteria) this;
        }

        public Criteria andSentSendMorePeopleNotLike(String value) {
            addCriterion("SENT_SEND_MORE_PEOPLE not like", value, "sentSendMorePeople");
            return (Criteria) this;
        }

        public Criteria andSentSendMorePeopleIn(List<String> values) {
            addCriterion("SENT_SEND_MORE_PEOPLE in", values, "sentSendMorePeople");
            return (Criteria) this;
        }

        public Criteria andSentSendMorePeopleNotIn(List<String> values) {
            addCriterion("SENT_SEND_MORE_PEOPLE not in", values, "sentSendMorePeople");
            return (Criteria) this;
        }

        public Criteria andSentSendMorePeopleBetween(String value1, String value2) {
            addCriterion("SENT_SEND_MORE_PEOPLE between", value1, value2, "sentSendMorePeople");
            return (Criteria) this;
        }

        public Criteria andSentSendMorePeopleNotBetween(String value1, String value2) {
            addCriterion("SENT_SEND_MORE_PEOPLE not between", value1, value2, "sentSendMorePeople");
            return (Criteria) this;
        }

        public Criteria andWi78IsNull() {
            addCriterion("WI78 is null");
            return (Criteria) this;
        }

        public Criteria andWi78IsNotNull() {
            addCriterion("WI78 is not null");
            return (Criteria) this;
        }

        public Criteria andWi78EqualTo(Date value) {
            addCriterion("WI78 =", value, "wi78");
            return (Criteria) this;
        }

        public Criteria andWi78NotEqualTo(Date value) {
            addCriterion("WI78 <>", value, "wi78");
            return (Criteria) this;
        }

        public Criteria andWi78GreaterThan(Date value) {
            addCriterion("WI78 >", value, "wi78");
            return (Criteria) this;
        }

        public Criteria andWi78GreaterThanOrEqualTo(Date value) {
            addCriterion("WI78 >=", value, "wi78");
            return (Criteria) this;
        }

        public Criteria andWi78LessThan(Date value) {
            addCriterion("WI78 <", value, "wi78");
            return (Criteria) this;
        }

        public Criteria andWi78LessThanOrEqualTo(Date value) {
            addCriterion("WI78 <=", value, "wi78");
            return (Criteria) this;
        }

        public Criteria andWi78In(List<Date> values) {
            addCriterion("WI78 in", values, "wi78");
            return (Criteria) this;
        }

        public Criteria andWi78NotIn(List<Date> values) {
            addCriterion("WI78 not in", values, "wi78");
            return (Criteria) this;
        }

        public Criteria andWi78Between(Date value1, Date value2) {
            addCriterion("WI78 between", value1, value2, "wi78");
            return (Criteria) this;
        }

        public Criteria andWi78NotBetween(Date value1, Date value2) {
            addCriterion("WI78 not between", value1, value2, "wi78");
            return (Criteria) this;
        }

        public Criteria andWi79IsNull() {
            addCriterion("WI79 is null");
            return (Criteria) this;
        }

        public Criteria andWi79IsNotNull() {
            addCriterion("WI79 is not null");
            return (Criteria) this;
        }

        public Criteria andWi79EqualTo(String value) {
            addCriterion("WI79 =", value, "wi79");
            return (Criteria) this;
        }

        public Criteria andWi79NotEqualTo(String value) {
            addCriterion("WI79 <>", value, "wi79");
            return (Criteria) this;
        }

        public Criteria andWi79GreaterThan(String value) {
            addCriterion("WI79 >", value, "wi79");
            return (Criteria) this;
        }

        public Criteria andWi79GreaterThanOrEqualTo(String value) {
            addCriterion("WI79 >=", value, "wi79");
            return (Criteria) this;
        }

        public Criteria andWi79LessThan(String value) {
            addCriterion("WI79 <", value, "wi79");
            return (Criteria) this;
        }

        public Criteria andWi79LessThanOrEqualTo(String value) {
            addCriterion("WI79 <=", value, "wi79");
            return (Criteria) this;
        }

        public Criteria andWi79Like(String value) {
            addCriterion("WI79 like", value, "wi79");
            return (Criteria) this;
        }

        public Criteria andWi79NotLike(String value) {
            addCriterion("WI79 not like", value, "wi79");
            return (Criteria) this;
        }

        public Criteria andWi79In(List<String> values) {
            addCriterion("WI79 in", values, "wi79");
            return (Criteria) this;
        }

        public Criteria andWi79NotIn(List<String> values) {
            addCriterion("WI79 not in", values, "wi79");
            return (Criteria) this;
        }

        public Criteria andWi79Between(String value1, String value2) {
            addCriterion("WI79 between", value1, value2, "wi79");
            return (Criteria) this;
        }

        public Criteria andWi79NotBetween(String value1, String value2) {
            addCriterion("WI79 not between", value1, value2, "wi79");
            return (Criteria) this;
        }

        public Criteria andWi80IsNull() {
            addCriterion("WI80 is null");
            return (Criteria) this;
        }

        public Criteria andWi80IsNotNull() {
            addCriterion("WI80 is not null");
            return (Criteria) this;
        }

        public Criteria andWi80EqualTo(String value) {
            addCriterion("WI80 =", value, "wi80");
            return (Criteria) this;
        }

        public Criteria andWi80NotEqualTo(String value) {
            addCriterion("WI80 <>", value, "wi80");
            return (Criteria) this;
        }

        public Criteria andWi80GreaterThan(String value) {
            addCriterion("WI80 >", value, "wi80");
            return (Criteria) this;
        }

        public Criteria andWi80GreaterThanOrEqualTo(String value) {
            addCriterion("WI80 >=", value, "wi80");
            return (Criteria) this;
        }

        public Criteria andWi80LessThan(String value) {
            addCriterion("WI80 <", value, "wi80");
            return (Criteria) this;
        }

        public Criteria andWi80LessThanOrEqualTo(String value) {
            addCriterion("WI80 <=", value, "wi80");
            return (Criteria) this;
        }

        public Criteria andWi80Like(String value) {
            addCriterion("WI80 like", value, "wi80");
            return (Criteria) this;
        }

        public Criteria andWi80NotLike(String value) {
            addCriterion("WI80 not like", value, "wi80");
            return (Criteria) this;
        }

        public Criteria andWi80In(List<String> values) {
            addCriterion("WI80 in", values, "wi80");
            return (Criteria) this;
        }

        public Criteria andWi80NotIn(List<String> values) {
            addCriterion("WI80 not in", values, "wi80");
            return (Criteria) this;
        }

        public Criteria andWi80Between(String value1, String value2) {
            addCriterion("WI80 between", value1, value2, "wi80");
            return (Criteria) this;
        }

        public Criteria andWi80NotBetween(String value1, String value2) {
            addCriterion("WI80 not between", value1, value2, "wi80");
            return (Criteria) this;
        }

        public Criteria andHistoryIsNull() {
            addCriterion("HISTORY is null");
            return (Criteria) this;
        }

        public Criteria andHistoryIsNotNull() {
            addCriterion("HISTORY is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryEqualTo(String value) {
            addCriterion("HISTORY =", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotEqualTo(String value) {
            addCriterion("HISTORY <>", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryGreaterThan(String value) {
            addCriterion("HISTORY >", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("HISTORY >=", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLessThan(String value) {
            addCriterion("HISTORY <", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLessThanOrEqualTo(String value) {
            addCriterion("HISTORY <=", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLike(String value) {
            addCriterion("HISTORY like", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotLike(String value) {
            addCriterion("HISTORY not like", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryIn(List<String> values) {
            addCriterion("HISTORY in", values, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotIn(List<String> values) {
            addCriterion("HISTORY not in", values, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryBetween(String value1, String value2) {
            addCriterion("HISTORY between", value1, value2, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotBetween(String value1, String value2) {
            addCriterion("HISTORY not between", value1, value2, "history");
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