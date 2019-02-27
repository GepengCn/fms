package com.itonglian.fms.entity;

import java.util.ArrayList;
import java.util.List;

public class CTRLPROPERTY_VIEWExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CTRLPROPERTY_VIEWExample() {
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

        public Criteria andSi00IsNull() {
            addCriterion("SI00 is null");
            return (Criteria) this;
        }

        public Criteria andSi00IsNotNull() {
            addCriterion("SI00 is not null");
            return (Criteria) this;
        }

        public Criteria andSi00EqualTo(Long value) {
            addCriterion("SI00 =", value, "si00");
            return (Criteria) this;
        }

        public Criteria andSi00NotEqualTo(Long value) {
            addCriterion("SI00 <>", value, "si00");
            return (Criteria) this;
        }

        public Criteria andSi00GreaterThan(Long value) {
            addCriterion("SI00 >", value, "si00");
            return (Criteria) this;
        }

        public Criteria andSi00GreaterThanOrEqualTo(Long value) {
            addCriterion("SI00 >=", value, "si00");
            return (Criteria) this;
        }

        public Criteria andSi00LessThan(Long value) {
            addCriterion("SI00 <", value, "si00");
            return (Criteria) this;
        }

        public Criteria andSi00LessThanOrEqualTo(Long value) {
            addCriterion("SI00 <=", value, "si00");
            return (Criteria) this;
        }

        public Criteria andSi00In(List<Long> values) {
            addCriterion("SI00 in", values, "si00");
            return (Criteria) this;
        }

        public Criteria andSi00NotIn(List<Long> values) {
            addCriterion("SI00 not in", values, "si00");
            return (Criteria) this;
        }

        public Criteria andSi00Between(Long value1, Long value2) {
            addCriterion("SI00 between", value1, value2, "si00");
            return (Criteria) this;
        }

        public Criteria andSi00NotBetween(Long value1, Long value2) {
            addCriterion("SI00 not between", value1, value2, "si00");
            return (Criteria) this;
        }

        public Criteria andSi01IsNull() {
            addCriterion("SI01 is null");
            return (Criteria) this;
        }

        public Criteria andSi01IsNotNull() {
            addCriterion("SI01 is not null");
            return (Criteria) this;
        }

        public Criteria andSi01EqualTo(Long value) {
            addCriterion("SI01 =", value, "si01");
            return (Criteria) this;
        }

        public Criteria andSi01NotEqualTo(Long value) {
            addCriterion("SI01 <>", value, "si01");
            return (Criteria) this;
        }

        public Criteria andSi01GreaterThan(Long value) {
            addCriterion("SI01 >", value, "si01");
            return (Criteria) this;
        }

        public Criteria andSi01GreaterThanOrEqualTo(Long value) {
            addCriterion("SI01 >=", value, "si01");
            return (Criteria) this;
        }

        public Criteria andSi01LessThan(Long value) {
            addCriterion("SI01 <", value, "si01");
            return (Criteria) this;
        }

        public Criteria andSi01LessThanOrEqualTo(Long value) {
            addCriterion("SI01 <=", value, "si01");
            return (Criteria) this;
        }

        public Criteria andSi01In(List<Long> values) {
            addCriterion("SI01 in", values, "si01");
            return (Criteria) this;
        }

        public Criteria andSi01NotIn(List<Long> values) {
            addCriterion("SI01 not in", values, "si01");
            return (Criteria) this;
        }

        public Criteria andSi01Between(Long value1, Long value2) {
            addCriterion("SI01 between", value1, value2, "si01");
            return (Criteria) this;
        }

        public Criteria andSi01NotBetween(Long value1, Long value2) {
            addCriterion("SI01 not between", value1, value2, "si01");
            return (Criteria) this;
        }

        public Criteria andSi02IsNull() {
            addCriterion("SI02 is null");
            return (Criteria) this;
        }

        public Criteria andSi02IsNotNull() {
            addCriterion("SI02 is not null");
            return (Criteria) this;
        }

        public Criteria andSi02EqualTo(String value) {
            addCriterion("SI02 =", value, "si02");
            return (Criteria) this;
        }

        public Criteria andSi02NotEqualTo(String value) {
            addCriterion("SI02 <>", value, "si02");
            return (Criteria) this;
        }

        public Criteria andSi02GreaterThan(String value) {
            addCriterion("SI02 >", value, "si02");
            return (Criteria) this;
        }

        public Criteria andSi02GreaterThanOrEqualTo(String value) {
            addCriterion("SI02 >=", value, "si02");
            return (Criteria) this;
        }

        public Criteria andSi02LessThan(String value) {
            addCriterion("SI02 <", value, "si02");
            return (Criteria) this;
        }

        public Criteria andSi02LessThanOrEqualTo(String value) {
            addCriterion("SI02 <=", value, "si02");
            return (Criteria) this;
        }

        public Criteria andSi02Like(String value) {
            addCriterion("SI02 like", value, "si02");
            return (Criteria) this;
        }

        public Criteria andSi02NotLike(String value) {
            addCriterion("SI02 not like", value, "si02");
            return (Criteria) this;
        }

        public Criteria andSi02In(List<String> values) {
            addCriterion("SI02 in", values, "si02");
            return (Criteria) this;
        }

        public Criteria andSi02NotIn(List<String> values) {
            addCriterion("SI02 not in", values, "si02");
            return (Criteria) this;
        }

        public Criteria andSi02Between(String value1, String value2) {
            addCriterion("SI02 between", value1, value2, "si02");
            return (Criteria) this;
        }

        public Criteria andSi02NotBetween(String value1, String value2) {
            addCriterion("SI02 not between", value1, value2, "si02");
            return (Criteria) this;
        }

        public Criteria andSi03IsNull() {
            addCriterion("SI03 is null");
            return (Criteria) this;
        }

        public Criteria andSi03IsNotNull() {
            addCriterion("SI03 is not null");
            return (Criteria) this;
        }

        public Criteria andSi03EqualTo(String value) {
            addCriterion("SI03 =", value, "si03");
            return (Criteria) this;
        }

        public Criteria andSi03NotEqualTo(String value) {
            addCriterion("SI03 <>", value, "si03");
            return (Criteria) this;
        }

        public Criteria andSi03GreaterThan(String value) {
            addCriterion("SI03 >", value, "si03");
            return (Criteria) this;
        }

        public Criteria andSi03GreaterThanOrEqualTo(String value) {
            addCriterion("SI03 >=", value, "si03");
            return (Criteria) this;
        }

        public Criteria andSi03LessThan(String value) {
            addCriterion("SI03 <", value, "si03");
            return (Criteria) this;
        }

        public Criteria andSi03LessThanOrEqualTo(String value) {
            addCriterion("SI03 <=", value, "si03");
            return (Criteria) this;
        }

        public Criteria andSi03Like(String value) {
            addCriterion("SI03 like", value, "si03");
            return (Criteria) this;
        }

        public Criteria andSi03NotLike(String value) {
            addCriterion("SI03 not like", value, "si03");
            return (Criteria) this;
        }

        public Criteria andSi03In(List<String> values) {
            addCriterion("SI03 in", values, "si03");
            return (Criteria) this;
        }

        public Criteria andSi03NotIn(List<String> values) {
            addCriterion("SI03 not in", values, "si03");
            return (Criteria) this;
        }

        public Criteria andSi03Between(String value1, String value2) {
            addCriterion("SI03 between", value1, value2, "si03");
            return (Criteria) this;
        }

        public Criteria andSi03NotBetween(String value1, String value2) {
            addCriterion("SI03 not between", value1, value2, "si03");
            return (Criteria) this;
        }

        public Criteria andSi04IsNull() {
            addCriterion("SI04 is null");
            return (Criteria) this;
        }

        public Criteria andSi04IsNotNull() {
            addCriterion("SI04 is not null");
            return (Criteria) this;
        }

        public Criteria andSi04EqualTo(String value) {
            addCriterion("SI04 =", value, "si04");
            return (Criteria) this;
        }

        public Criteria andSi04NotEqualTo(String value) {
            addCriterion("SI04 <>", value, "si04");
            return (Criteria) this;
        }

        public Criteria andSi04GreaterThan(String value) {
            addCriterion("SI04 >", value, "si04");
            return (Criteria) this;
        }

        public Criteria andSi04GreaterThanOrEqualTo(String value) {
            addCriterion("SI04 >=", value, "si04");
            return (Criteria) this;
        }

        public Criteria andSi04LessThan(String value) {
            addCriterion("SI04 <", value, "si04");
            return (Criteria) this;
        }

        public Criteria andSi04LessThanOrEqualTo(String value) {
            addCriterion("SI04 <=", value, "si04");
            return (Criteria) this;
        }

        public Criteria andSi04Like(String value) {
            addCriterion("SI04 like", value, "si04");
            return (Criteria) this;
        }

        public Criteria andSi04NotLike(String value) {
            addCriterion("SI04 not like", value, "si04");
            return (Criteria) this;
        }

        public Criteria andSi04In(List<String> values) {
            addCriterion("SI04 in", values, "si04");
            return (Criteria) this;
        }

        public Criteria andSi04NotIn(List<String> values) {
            addCriterion("SI04 not in", values, "si04");
            return (Criteria) this;
        }

        public Criteria andSi04Between(String value1, String value2) {
            addCriterion("SI04 between", value1, value2, "si04");
            return (Criteria) this;
        }

        public Criteria andSi04NotBetween(String value1, String value2) {
            addCriterion("SI04 not between", value1, value2, "si04");
            return (Criteria) this;
        }

        public Criteria andSi05IsNull() {
            addCriterion("SI05 is null");
            return (Criteria) this;
        }

        public Criteria andSi05IsNotNull() {
            addCriterion("SI05 is not null");
            return (Criteria) this;
        }

        public Criteria andSi05EqualTo(Integer value) {
            addCriterion("SI05 =", value, "si05");
            return (Criteria) this;
        }

        public Criteria andSi05NotEqualTo(Integer value) {
            addCriterion("SI05 <>", value, "si05");
            return (Criteria) this;
        }

        public Criteria andSi05GreaterThan(Integer value) {
            addCriterion("SI05 >", value, "si05");
            return (Criteria) this;
        }

        public Criteria andSi05GreaterThanOrEqualTo(Integer value) {
            addCriterion("SI05 >=", value, "si05");
            return (Criteria) this;
        }

        public Criteria andSi05LessThan(Integer value) {
            addCriterion("SI05 <", value, "si05");
            return (Criteria) this;
        }

        public Criteria andSi05LessThanOrEqualTo(Integer value) {
            addCriterion("SI05 <=", value, "si05");
            return (Criteria) this;
        }

        public Criteria andSi05In(List<Integer> values) {
            addCriterion("SI05 in", values, "si05");
            return (Criteria) this;
        }

        public Criteria andSi05NotIn(List<Integer> values) {
            addCriterion("SI05 not in", values, "si05");
            return (Criteria) this;
        }

        public Criteria andSi05Between(Integer value1, Integer value2) {
            addCriterion("SI05 between", value1, value2, "si05");
            return (Criteria) this;
        }

        public Criteria andSi05NotBetween(Integer value1, Integer value2) {
            addCriterion("SI05 not between", value1, value2, "si05");
            return (Criteria) this;
        }

        public Criteria andSi06IsNull() {
            addCriterion("SI06 is null");
            return (Criteria) this;
        }

        public Criteria andSi06IsNotNull() {
            addCriterion("SI06 is not null");
            return (Criteria) this;
        }

        public Criteria andSi06EqualTo(Integer value) {
            addCriterion("SI06 =", value, "si06");
            return (Criteria) this;
        }

        public Criteria andSi06NotEqualTo(Integer value) {
            addCriterion("SI06 <>", value, "si06");
            return (Criteria) this;
        }

        public Criteria andSi06GreaterThan(Integer value) {
            addCriterion("SI06 >", value, "si06");
            return (Criteria) this;
        }

        public Criteria andSi06GreaterThanOrEqualTo(Integer value) {
            addCriterion("SI06 >=", value, "si06");
            return (Criteria) this;
        }

        public Criteria andSi06LessThan(Integer value) {
            addCriterion("SI06 <", value, "si06");
            return (Criteria) this;
        }

        public Criteria andSi06LessThanOrEqualTo(Integer value) {
            addCriterion("SI06 <=", value, "si06");
            return (Criteria) this;
        }

        public Criteria andSi06In(List<Integer> values) {
            addCriterion("SI06 in", values, "si06");
            return (Criteria) this;
        }

        public Criteria andSi06NotIn(List<Integer> values) {
            addCriterion("SI06 not in", values, "si06");
            return (Criteria) this;
        }

        public Criteria andSi06Between(Integer value1, Integer value2) {
            addCriterion("SI06 between", value1, value2, "si06");
            return (Criteria) this;
        }

        public Criteria andSi06NotBetween(Integer value1, Integer value2) {
            addCriterion("SI06 not between", value1, value2, "si06");
            return (Criteria) this;
        }

        public Criteria andSi07IsNull() {
            addCriterion("SI07 is null");
            return (Criteria) this;
        }

        public Criteria andSi07IsNotNull() {
            addCriterion("SI07 is not null");
            return (Criteria) this;
        }

        public Criteria andSi07EqualTo(Integer value) {
            addCriterion("SI07 =", value, "si07");
            return (Criteria) this;
        }

        public Criteria andSi07NotEqualTo(Integer value) {
            addCriterion("SI07 <>", value, "si07");
            return (Criteria) this;
        }

        public Criteria andSi07GreaterThan(Integer value) {
            addCriterion("SI07 >", value, "si07");
            return (Criteria) this;
        }

        public Criteria andSi07GreaterThanOrEqualTo(Integer value) {
            addCriterion("SI07 >=", value, "si07");
            return (Criteria) this;
        }

        public Criteria andSi07LessThan(Integer value) {
            addCriterion("SI07 <", value, "si07");
            return (Criteria) this;
        }

        public Criteria andSi07LessThanOrEqualTo(Integer value) {
            addCriterion("SI07 <=", value, "si07");
            return (Criteria) this;
        }

        public Criteria andSi07In(List<Integer> values) {
            addCriterion("SI07 in", values, "si07");
            return (Criteria) this;
        }

        public Criteria andSi07NotIn(List<Integer> values) {
            addCriterion("SI07 not in", values, "si07");
            return (Criteria) this;
        }

        public Criteria andSi07Between(Integer value1, Integer value2) {
            addCriterion("SI07 between", value1, value2, "si07");
            return (Criteria) this;
        }

        public Criteria andSi07NotBetween(Integer value1, Integer value2) {
            addCriterion("SI07 not between", value1, value2, "si07");
            return (Criteria) this;
        }

        public Criteria andSi08IsNull() {
            addCriterion("SI08 is null");
            return (Criteria) this;
        }

        public Criteria andSi08IsNotNull() {
            addCriterion("SI08 is not null");
            return (Criteria) this;
        }

        public Criteria andSi08EqualTo(Integer value) {
            addCriterion("SI08 =", value, "si08");
            return (Criteria) this;
        }

        public Criteria andSi08NotEqualTo(Integer value) {
            addCriterion("SI08 <>", value, "si08");
            return (Criteria) this;
        }

        public Criteria andSi08GreaterThan(Integer value) {
            addCriterion("SI08 >", value, "si08");
            return (Criteria) this;
        }

        public Criteria andSi08GreaterThanOrEqualTo(Integer value) {
            addCriterion("SI08 >=", value, "si08");
            return (Criteria) this;
        }

        public Criteria andSi08LessThan(Integer value) {
            addCriterion("SI08 <", value, "si08");
            return (Criteria) this;
        }

        public Criteria andSi08LessThanOrEqualTo(Integer value) {
            addCriterion("SI08 <=", value, "si08");
            return (Criteria) this;
        }

        public Criteria andSi08In(List<Integer> values) {
            addCriterion("SI08 in", values, "si08");
            return (Criteria) this;
        }

        public Criteria andSi08NotIn(List<Integer> values) {
            addCriterion("SI08 not in", values, "si08");
            return (Criteria) this;
        }

        public Criteria andSi08Between(Integer value1, Integer value2) {
            addCriterion("SI08 between", value1, value2, "si08");
            return (Criteria) this;
        }

        public Criteria andSi08NotBetween(Integer value1, Integer value2) {
            addCriterion("SI08 not between", value1, value2, "si08");
            return (Criteria) this;
        }

        public Criteria andSi09IsNull() {
            addCriterion("SI09 is null");
            return (Criteria) this;
        }

        public Criteria andSi09IsNotNull() {
            addCriterion("SI09 is not null");
            return (Criteria) this;
        }

        public Criteria andSi09EqualTo(String value) {
            addCriterion("SI09 =", value, "si09");
            return (Criteria) this;
        }

        public Criteria andSi09NotEqualTo(String value) {
            addCriterion("SI09 <>", value, "si09");
            return (Criteria) this;
        }

        public Criteria andSi09GreaterThan(String value) {
            addCriterion("SI09 >", value, "si09");
            return (Criteria) this;
        }

        public Criteria andSi09GreaterThanOrEqualTo(String value) {
            addCriterion("SI09 >=", value, "si09");
            return (Criteria) this;
        }

        public Criteria andSi09LessThan(String value) {
            addCriterion("SI09 <", value, "si09");
            return (Criteria) this;
        }

        public Criteria andSi09LessThanOrEqualTo(String value) {
            addCriterion("SI09 <=", value, "si09");
            return (Criteria) this;
        }

        public Criteria andSi09Like(String value) {
            addCriterion("SI09 like", value, "si09");
            return (Criteria) this;
        }

        public Criteria andSi09NotLike(String value) {
            addCriterion("SI09 not like", value, "si09");
            return (Criteria) this;
        }

        public Criteria andSi09In(List<String> values) {
            addCriterion("SI09 in", values, "si09");
            return (Criteria) this;
        }

        public Criteria andSi09NotIn(List<String> values) {
            addCriterion("SI09 not in", values, "si09");
            return (Criteria) this;
        }

        public Criteria andSi09Between(String value1, String value2) {
            addCriterion("SI09 between", value1, value2, "si09");
            return (Criteria) this;
        }

        public Criteria andSi09NotBetween(String value1, String value2) {
            addCriterion("SI09 not between", value1, value2, "si09");
            return (Criteria) this;
        }

        public Criteria andSi10IsNull() {
            addCriterion("SI10 is null");
            return (Criteria) this;
        }

        public Criteria andSi10IsNotNull() {
            addCriterion("SI10 is not null");
            return (Criteria) this;
        }

        public Criteria andSi10EqualTo(String value) {
            addCriterion("SI10 =", value, "si10");
            return (Criteria) this;
        }

        public Criteria andSi10NotEqualTo(String value) {
            addCriterion("SI10 <>", value, "si10");
            return (Criteria) this;
        }

        public Criteria andSi10GreaterThan(String value) {
            addCriterion("SI10 >", value, "si10");
            return (Criteria) this;
        }

        public Criteria andSi10GreaterThanOrEqualTo(String value) {
            addCriterion("SI10 >=", value, "si10");
            return (Criteria) this;
        }

        public Criteria andSi10LessThan(String value) {
            addCriterion("SI10 <", value, "si10");
            return (Criteria) this;
        }

        public Criteria andSi10LessThanOrEqualTo(String value) {
            addCriterion("SI10 <=", value, "si10");
            return (Criteria) this;
        }

        public Criteria andSi10Like(String value) {
            addCriterion("SI10 like", value, "si10");
            return (Criteria) this;
        }

        public Criteria andSi10NotLike(String value) {
            addCriterion("SI10 not like", value, "si10");
            return (Criteria) this;
        }

        public Criteria andSi10In(List<String> values) {
            addCriterion("SI10 in", values, "si10");
            return (Criteria) this;
        }

        public Criteria andSi10NotIn(List<String> values) {
            addCriterion("SI10 not in", values, "si10");
            return (Criteria) this;
        }

        public Criteria andSi10Between(String value1, String value2) {
            addCriterion("SI10 between", value1, value2, "si10");
            return (Criteria) this;
        }

        public Criteria andSi10NotBetween(String value1, String value2) {
            addCriterion("SI10 not between", value1, value2, "si10");
            return (Criteria) this;
        }

        public Criteria andSi11IsNull() {
            addCriterion("SI11 is null");
            return (Criteria) this;
        }

        public Criteria andSi11IsNotNull() {
            addCriterion("SI11 is not null");
            return (Criteria) this;
        }

        public Criteria andSi11EqualTo(Integer value) {
            addCriterion("SI11 =", value, "si11");
            return (Criteria) this;
        }

        public Criteria andSi11NotEqualTo(Integer value) {
            addCriterion("SI11 <>", value, "si11");
            return (Criteria) this;
        }

        public Criteria andSi11GreaterThan(Integer value) {
            addCriterion("SI11 >", value, "si11");
            return (Criteria) this;
        }

        public Criteria andSi11GreaterThanOrEqualTo(Integer value) {
            addCriterion("SI11 >=", value, "si11");
            return (Criteria) this;
        }

        public Criteria andSi11LessThan(Integer value) {
            addCriterion("SI11 <", value, "si11");
            return (Criteria) this;
        }

        public Criteria andSi11LessThanOrEqualTo(Integer value) {
            addCriterion("SI11 <=", value, "si11");
            return (Criteria) this;
        }

        public Criteria andSi11In(List<Integer> values) {
            addCriterion("SI11 in", values, "si11");
            return (Criteria) this;
        }

        public Criteria andSi11NotIn(List<Integer> values) {
            addCriterion("SI11 not in", values, "si11");
            return (Criteria) this;
        }

        public Criteria andSi11Between(Integer value1, Integer value2) {
            addCriterion("SI11 between", value1, value2, "si11");
            return (Criteria) this;
        }

        public Criteria andSi11NotBetween(Integer value1, Integer value2) {
            addCriterion("SI11 not between", value1, value2, "si11");
            return (Criteria) this;
        }

        public Criteria andSp01IsNull() {
            addCriterion("SP01 is null");
            return (Criteria) this;
        }

        public Criteria andSp01IsNotNull() {
            addCriterion("SP01 is not null");
            return (Criteria) this;
        }

        public Criteria andSp01EqualTo(String value) {
            addCriterion("SP01 =", value, "sp01");
            return (Criteria) this;
        }

        public Criteria andSp01NotEqualTo(String value) {
            addCriterion("SP01 <>", value, "sp01");
            return (Criteria) this;
        }

        public Criteria andSp01GreaterThan(String value) {
            addCriterion("SP01 >", value, "sp01");
            return (Criteria) this;
        }

        public Criteria andSp01GreaterThanOrEqualTo(String value) {
            addCriterion("SP01 >=", value, "sp01");
            return (Criteria) this;
        }

        public Criteria andSp01LessThan(String value) {
            addCriterion("SP01 <", value, "sp01");
            return (Criteria) this;
        }

        public Criteria andSp01LessThanOrEqualTo(String value) {
            addCriterion("SP01 <=", value, "sp01");
            return (Criteria) this;
        }

        public Criteria andSp01Like(String value) {
            addCriterion("SP01 like", value, "sp01");
            return (Criteria) this;
        }

        public Criteria andSp01NotLike(String value) {
            addCriterion("SP01 not like", value, "sp01");
            return (Criteria) this;
        }

        public Criteria andSp01In(List<String> values) {
            addCriterion("SP01 in", values, "sp01");
            return (Criteria) this;
        }

        public Criteria andSp01NotIn(List<String> values) {
            addCriterion("SP01 not in", values, "sp01");
            return (Criteria) this;
        }

        public Criteria andSp01Between(String value1, String value2) {
            addCriterion("SP01 between", value1, value2, "sp01");
            return (Criteria) this;
        }

        public Criteria andSp01NotBetween(String value1, String value2) {
            addCriterion("SP01 not between", value1, value2, "sp01");
            return (Criteria) this;
        }

        public Criteria andSp02IsNull() {
            addCriterion("SP02 is null");
            return (Criteria) this;
        }

        public Criteria andSp02IsNotNull() {
            addCriterion("SP02 is not null");
            return (Criteria) this;
        }

        public Criteria andSp02EqualTo(String value) {
            addCriterion("SP02 =", value, "sp02");
            return (Criteria) this;
        }

        public Criteria andSp02NotEqualTo(String value) {
            addCriterion("SP02 <>", value, "sp02");
            return (Criteria) this;
        }

        public Criteria andSp02GreaterThan(String value) {
            addCriterion("SP02 >", value, "sp02");
            return (Criteria) this;
        }

        public Criteria andSp02GreaterThanOrEqualTo(String value) {
            addCriterion("SP02 >=", value, "sp02");
            return (Criteria) this;
        }

        public Criteria andSp02LessThan(String value) {
            addCriterion("SP02 <", value, "sp02");
            return (Criteria) this;
        }

        public Criteria andSp02LessThanOrEqualTo(String value) {
            addCriterion("SP02 <=", value, "sp02");
            return (Criteria) this;
        }

        public Criteria andSp02Like(String value) {
            addCriterion("SP02 like", value, "sp02");
            return (Criteria) this;
        }

        public Criteria andSp02NotLike(String value) {
            addCriterion("SP02 not like", value, "sp02");
            return (Criteria) this;
        }

        public Criteria andSp02In(List<String> values) {
            addCriterion("SP02 in", values, "sp02");
            return (Criteria) this;
        }

        public Criteria andSp02NotIn(List<String> values) {
            addCriterion("SP02 not in", values, "sp02");
            return (Criteria) this;
        }

        public Criteria andSp02Between(String value1, String value2) {
            addCriterion("SP02 between", value1, value2, "sp02");
            return (Criteria) this;
        }

        public Criteria andSp02NotBetween(String value1, String value2) {
            addCriterion("SP02 not between", value1, value2, "sp02");
            return (Criteria) this;
        }

        public Criteria andSp13IsNull() {
            addCriterion("SP13 is null");
            return (Criteria) this;
        }

        public Criteria andSp13IsNotNull() {
            addCriterion("SP13 is not null");
            return (Criteria) this;
        }

        public Criteria andSp13EqualTo(String value) {
            addCriterion("SP13 =", value, "sp13");
            return (Criteria) this;
        }

        public Criteria andSp13NotEqualTo(String value) {
            addCriterion("SP13 <>", value, "sp13");
            return (Criteria) this;
        }

        public Criteria andSp13GreaterThan(String value) {
            addCriterion("SP13 >", value, "sp13");
            return (Criteria) this;
        }

        public Criteria andSp13GreaterThanOrEqualTo(String value) {
            addCriterion("SP13 >=", value, "sp13");
            return (Criteria) this;
        }

        public Criteria andSp13LessThan(String value) {
            addCriterion("SP13 <", value, "sp13");
            return (Criteria) this;
        }

        public Criteria andSp13LessThanOrEqualTo(String value) {
            addCriterion("SP13 <=", value, "sp13");
            return (Criteria) this;
        }

        public Criteria andSp13Like(String value) {
            addCriterion("SP13 like", value, "sp13");
            return (Criteria) this;
        }

        public Criteria andSp13NotLike(String value) {
            addCriterion("SP13 not like", value, "sp13");
            return (Criteria) this;
        }

        public Criteria andSp13In(List<String> values) {
            addCriterion("SP13 in", values, "sp13");
            return (Criteria) this;
        }

        public Criteria andSp13NotIn(List<String> values) {
            addCriterion("SP13 not in", values, "sp13");
            return (Criteria) this;
        }

        public Criteria andSp13Between(String value1, String value2) {
            addCriterion("SP13 between", value1, value2, "sp13");
            return (Criteria) this;
        }

        public Criteria andSp13NotBetween(String value1, String value2) {
            addCriterion("SP13 not between", value1, value2, "sp13");
            return (Criteria) this;
        }

        public Criteria andSp03IsNull() {
            addCriterion("SP03 is null");
            return (Criteria) this;
        }

        public Criteria andSp03IsNotNull() {
            addCriterion("SP03 is not null");
            return (Criteria) this;
        }

        public Criteria andSp03EqualTo(String value) {
            addCriterion("SP03 =", value, "sp03");
            return (Criteria) this;
        }

        public Criteria andSp03NotEqualTo(String value) {
            addCriterion("SP03 <>", value, "sp03");
            return (Criteria) this;
        }

        public Criteria andSp03GreaterThan(String value) {
            addCriterion("SP03 >", value, "sp03");
            return (Criteria) this;
        }

        public Criteria andSp03GreaterThanOrEqualTo(String value) {
            addCriterion("SP03 >=", value, "sp03");
            return (Criteria) this;
        }

        public Criteria andSp03LessThan(String value) {
            addCriterion("SP03 <", value, "sp03");
            return (Criteria) this;
        }

        public Criteria andSp03LessThanOrEqualTo(String value) {
            addCriterion("SP03 <=", value, "sp03");
            return (Criteria) this;
        }

        public Criteria andSp03Like(String value) {
            addCriterion("SP03 like", value, "sp03");
            return (Criteria) this;
        }

        public Criteria andSp03NotLike(String value) {
            addCriterion("SP03 not like", value, "sp03");
            return (Criteria) this;
        }

        public Criteria andSp03In(List<String> values) {
            addCriterion("SP03 in", values, "sp03");
            return (Criteria) this;
        }

        public Criteria andSp03NotIn(List<String> values) {
            addCriterion("SP03 not in", values, "sp03");
            return (Criteria) this;
        }

        public Criteria andSp03Between(String value1, String value2) {
            addCriterion("SP03 between", value1, value2, "sp03");
            return (Criteria) this;
        }

        public Criteria andSp03NotBetween(String value1, String value2) {
            addCriterion("SP03 not between", value1, value2, "sp03");
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