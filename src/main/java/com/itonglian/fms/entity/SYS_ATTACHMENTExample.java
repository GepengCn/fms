package com.itonglian.fms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SYS_ATTACHMENTExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SYS_ATTACHMENTExample() {
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

        public Criteria andSa00IsNull() {
            addCriterion("SA00 is null");
            return (Criteria) this;
        }

        public Criteria andSa00IsNotNull() {
            addCriterion("SA00 is not null");
            return (Criteria) this;
        }

        public Criteria andSa00EqualTo(Long value) {
            addCriterion("SA00 =", value, "sa00");
            return (Criteria) this;
        }

        public Criteria andSa00NotEqualTo(Long value) {
            addCriterion("SA00 <>", value, "sa00");
            return (Criteria) this;
        }

        public Criteria andSa00GreaterThan(Long value) {
            addCriterion("SA00 >", value, "sa00");
            return (Criteria) this;
        }

        public Criteria andSa00GreaterThanOrEqualTo(Long value) {
            addCriterion("SA00 >=", value, "sa00");
            return (Criteria) this;
        }

        public Criteria andSa00LessThan(Long value) {
            addCriterion("SA00 <", value, "sa00");
            return (Criteria) this;
        }

        public Criteria andSa00LessThanOrEqualTo(Long value) {
            addCriterion("SA00 <=", value, "sa00");
            return (Criteria) this;
        }

        public Criteria andSa00In(List<Long> values) {
            addCriterion("SA00 in", values, "sa00");
            return (Criteria) this;
        }

        public Criteria andSa00NotIn(List<Long> values) {
            addCriterion("SA00 not in", values, "sa00");
            return (Criteria) this;
        }

        public Criteria andSa00Between(Long value1, Long value2) {
            addCriterion("SA00 between", value1, value2, "sa00");
            return (Criteria) this;
        }

        public Criteria andSa00NotBetween(Long value1, Long value2) {
            addCriterion("SA00 not between", value1, value2, "sa00");
            return (Criteria) this;
        }

        public Criteria andSa01IsNull() {
            addCriterion("SA01 is null");
            return (Criteria) this;
        }

        public Criteria andSa01IsNotNull() {
            addCriterion("SA01 is not null");
            return (Criteria) this;
        }

        public Criteria andSa01EqualTo(String value) {
            addCriterion("SA01 =", value, "sa01");
            return (Criteria) this;
        }

        public Criteria andSa01NotEqualTo(String value) {
            addCriterion("SA01 <>", value, "sa01");
            return (Criteria) this;
        }

        public Criteria andSa01GreaterThan(String value) {
            addCriterion("SA01 >", value, "sa01");
            return (Criteria) this;
        }

        public Criteria andSa01GreaterThanOrEqualTo(String value) {
            addCriterion("SA01 >=", value, "sa01");
            return (Criteria) this;
        }

        public Criteria andSa01LessThan(String value) {
            addCriterion("SA01 <", value, "sa01");
            return (Criteria) this;
        }

        public Criteria andSa01LessThanOrEqualTo(String value) {
            addCriterion("SA01 <=", value, "sa01");
            return (Criteria) this;
        }

        public Criteria andSa01Like(String value) {
            addCriterion("SA01 like", value, "sa01");
            return (Criteria) this;
        }

        public Criteria andSa01NotLike(String value) {
            addCriterion("SA01 not like", value, "sa01");
            return (Criteria) this;
        }

        public Criteria andSa01In(List<String> values) {
            addCriterion("SA01 in", values, "sa01");
            return (Criteria) this;
        }

        public Criteria andSa01NotIn(List<String> values) {
            addCriterion("SA01 not in", values, "sa01");
            return (Criteria) this;
        }

        public Criteria andSa01Between(String value1, String value2) {
            addCriterion("SA01 between", value1, value2, "sa01");
            return (Criteria) this;
        }

        public Criteria andSa01NotBetween(String value1, String value2) {
            addCriterion("SA01 not between", value1, value2, "sa01");
            return (Criteria) this;
        }

        public Criteria andSa02IsNull() {
            addCriterion("SA02 is null");
            return (Criteria) this;
        }

        public Criteria andSa02IsNotNull() {
            addCriterion("SA02 is not null");
            return (Criteria) this;
        }

        public Criteria andSa02EqualTo(String value) {
            addCriterion("SA02 =", value, "sa02");
            return (Criteria) this;
        }

        public Criteria andSa02NotEqualTo(String value) {
            addCriterion("SA02 <>", value, "sa02");
            return (Criteria) this;
        }

        public Criteria andSa02GreaterThan(String value) {
            addCriterion("SA02 >", value, "sa02");
            return (Criteria) this;
        }

        public Criteria andSa02GreaterThanOrEqualTo(String value) {
            addCriterion("SA02 >=", value, "sa02");
            return (Criteria) this;
        }

        public Criteria andSa02LessThan(String value) {
            addCriterion("SA02 <", value, "sa02");
            return (Criteria) this;
        }

        public Criteria andSa02LessThanOrEqualTo(String value) {
            addCriterion("SA02 <=", value, "sa02");
            return (Criteria) this;
        }

        public Criteria andSa02Like(String value) {
            addCriterion("SA02 like", value, "sa02");
            return (Criteria) this;
        }

        public Criteria andSa02NotLike(String value) {
            addCriterion("SA02 not like", value, "sa02");
            return (Criteria) this;
        }

        public Criteria andSa02In(List<String> values) {
            addCriterion("SA02 in", values, "sa02");
            return (Criteria) this;
        }

        public Criteria andSa02NotIn(List<String> values) {
            addCriterion("SA02 not in", values, "sa02");
            return (Criteria) this;
        }

        public Criteria andSa02Between(String value1, String value2) {
            addCriterion("SA02 between", value1, value2, "sa02");
            return (Criteria) this;
        }

        public Criteria andSa02NotBetween(String value1, String value2) {
            addCriterion("SA02 not between", value1, value2, "sa02");
            return (Criteria) this;
        }

        public Criteria andSa03IsNull() {
            addCriterion("SA03 is null");
            return (Criteria) this;
        }

        public Criteria andSa03IsNotNull() {
            addCriterion("SA03 is not null");
            return (Criteria) this;
        }

        public Criteria andSa03EqualTo(String value) {
            addCriterion("SA03 =", value, "sa03");
            return (Criteria) this;
        }

        public Criteria andSa03NotEqualTo(String value) {
            addCriterion("SA03 <>", value, "sa03");
            return (Criteria) this;
        }

        public Criteria andSa03GreaterThan(String value) {
            addCriterion("SA03 >", value, "sa03");
            return (Criteria) this;
        }

        public Criteria andSa03GreaterThanOrEqualTo(String value) {
            addCriterion("SA03 >=", value, "sa03");
            return (Criteria) this;
        }

        public Criteria andSa03LessThan(String value) {
            addCriterion("SA03 <", value, "sa03");
            return (Criteria) this;
        }

        public Criteria andSa03LessThanOrEqualTo(String value) {
            addCriterion("SA03 <=", value, "sa03");
            return (Criteria) this;
        }

        public Criteria andSa03Like(String value) {
            addCriterion("SA03 like", value, "sa03");
            return (Criteria) this;
        }

        public Criteria andSa03NotLike(String value) {
            addCriterion("SA03 not like", value, "sa03");
            return (Criteria) this;
        }

        public Criteria andSa03In(List<String> values) {
            addCriterion("SA03 in", values, "sa03");
            return (Criteria) this;
        }

        public Criteria andSa03NotIn(List<String> values) {
            addCriterion("SA03 not in", values, "sa03");
            return (Criteria) this;
        }

        public Criteria andSa03Between(String value1, String value2) {
            addCriterion("SA03 between", value1, value2, "sa03");
            return (Criteria) this;
        }

        public Criteria andSa03NotBetween(String value1, String value2) {
            addCriterion("SA03 not between", value1, value2, "sa03");
            return (Criteria) this;
        }

        public Criteria andSa04IsNull() {
            addCriterion("SA04 is null");
            return (Criteria) this;
        }

        public Criteria andSa04IsNotNull() {
            addCriterion("SA04 is not null");
            return (Criteria) this;
        }

        public Criteria andSa04EqualTo(String value) {
            addCriterion("SA04 =", value, "sa04");
            return (Criteria) this;
        }

        public Criteria andSa04NotEqualTo(String value) {
            addCriterion("SA04 <>", value, "sa04");
            return (Criteria) this;
        }

        public Criteria andSa04GreaterThan(String value) {
            addCriterion("SA04 >", value, "sa04");
            return (Criteria) this;
        }

        public Criteria andSa04GreaterThanOrEqualTo(String value) {
            addCriterion("SA04 >=", value, "sa04");
            return (Criteria) this;
        }

        public Criteria andSa04LessThan(String value) {
            addCriterion("SA04 <", value, "sa04");
            return (Criteria) this;
        }

        public Criteria andSa04LessThanOrEqualTo(String value) {
            addCriterion("SA04 <=", value, "sa04");
            return (Criteria) this;
        }

        public Criteria andSa04Like(String value) {
            addCriterion("SA04 like", value, "sa04");
            return (Criteria) this;
        }

        public Criteria andSa04NotLike(String value) {
            addCriterion("SA04 not like", value, "sa04");
            return (Criteria) this;
        }

        public Criteria andSa04In(List<String> values) {
            addCriterion("SA04 in", values, "sa04");
            return (Criteria) this;
        }

        public Criteria andSa04NotIn(List<String> values) {
            addCriterion("SA04 not in", values, "sa04");
            return (Criteria) this;
        }

        public Criteria andSa04Between(String value1, String value2) {
            addCriterion("SA04 between", value1, value2, "sa04");
            return (Criteria) this;
        }

        public Criteria andSa04NotBetween(String value1, String value2) {
            addCriterion("SA04 not between", value1, value2, "sa04");
            return (Criteria) this;
        }

        public Criteria andSa05IsNull() {
            addCriterion("SA05 is null");
            return (Criteria) this;
        }

        public Criteria andSa05IsNotNull() {
            addCriterion("SA05 is not null");
            return (Criteria) this;
        }

        public Criteria andSa05EqualTo(Date value) {
            addCriterion("SA05 =", value, "sa05");
            return (Criteria) this;
        }

        public Criteria andSa05NotEqualTo(Date value) {
            addCriterion("SA05 <>", value, "sa05");
            return (Criteria) this;
        }

        public Criteria andSa05GreaterThan(Date value) {
            addCriterion("SA05 >", value, "sa05");
            return (Criteria) this;
        }

        public Criteria andSa05GreaterThanOrEqualTo(Date value) {
            addCriterion("SA05 >=", value, "sa05");
            return (Criteria) this;
        }

        public Criteria andSa05LessThan(Date value) {
            addCriterion("SA05 <", value, "sa05");
            return (Criteria) this;
        }

        public Criteria andSa05LessThanOrEqualTo(Date value) {
            addCriterion("SA05 <=", value, "sa05");
            return (Criteria) this;
        }

        public Criteria andSa05In(List<Date> values) {
            addCriterion("SA05 in", values, "sa05");
            return (Criteria) this;
        }

        public Criteria andSa05NotIn(List<Date> values) {
            addCriterion("SA05 not in", values, "sa05");
            return (Criteria) this;
        }

        public Criteria andSa05Between(Date value1, Date value2) {
            addCriterion("SA05 between", value1, value2, "sa05");
            return (Criteria) this;
        }

        public Criteria andSa05NotBetween(Date value1, Date value2) {
            addCriterion("SA05 not between", value1, value2, "sa05");
            return (Criteria) this;
        }

        public Criteria andSa06IsNull() {
            addCriterion("SA06 is null");
            return (Criteria) this;
        }

        public Criteria andSa06IsNotNull() {
            addCriterion("SA06 is not null");
            return (Criteria) this;
        }

        public Criteria andSa06EqualTo(String value) {
            addCriterion("SA06 =", value, "sa06");
            return (Criteria) this;
        }

        public Criteria andSa06NotEqualTo(String value) {
            addCriterion("SA06 <>", value, "sa06");
            return (Criteria) this;
        }

        public Criteria andSa06GreaterThan(String value) {
            addCriterion("SA06 >", value, "sa06");
            return (Criteria) this;
        }

        public Criteria andSa06GreaterThanOrEqualTo(String value) {
            addCriterion("SA06 >=", value, "sa06");
            return (Criteria) this;
        }

        public Criteria andSa06LessThan(String value) {
            addCriterion("SA06 <", value, "sa06");
            return (Criteria) this;
        }

        public Criteria andSa06LessThanOrEqualTo(String value) {
            addCriterion("SA06 <=", value, "sa06");
            return (Criteria) this;
        }

        public Criteria andSa06Like(String value) {
            addCriterion("SA06 like", value, "sa06");
            return (Criteria) this;
        }

        public Criteria andSa06NotLike(String value) {
            addCriterion("SA06 not like", value, "sa06");
            return (Criteria) this;
        }

        public Criteria andSa06In(List<String> values) {
            addCriterion("SA06 in", values, "sa06");
            return (Criteria) this;
        }

        public Criteria andSa06NotIn(List<String> values) {
            addCriterion("SA06 not in", values, "sa06");
            return (Criteria) this;
        }

        public Criteria andSa06Between(String value1, String value2) {
            addCriterion("SA06 between", value1, value2, "sa06");
            return (Criteria) this;
        }

        public Criteria andSa06NotBetween(String value1, String value2) {
            addCriterion("SA06 not between", value1, value2, "sa06");
            return (Criteria) this;
        }

        public Criteria andSa07IsNull() {
            addCriterion("SA07 is null");
            return (Criteria) this;
        }

        public Criteria andSa07IsNotNull() {
            addCriterion("SA07 is not null");
            return (Criteria) this;
        }

        public Criteria andSa07EqualTo(String value) {
            addCriterion("SA07 =", value, "sa07");
            return (Criteria) this;
        }

        public Criteria andSa07NotEqualTo(String value) {
            addCriterion("SA07 <>", value, "sa07");
            return (Criteria) this;
        }

        public Criteria andSa07GreaterThan(String value) {
            addCriterion("SA07 >", value, "sa07");
            return (Criteria) this;
        }

        public Criteria andSa07GreaterThanOrEqualTo(String value) {
            addCriterion("SA07 >=", value, "sa07");
            return (Criteria) this;
        }

        public Criteria andSa07LessThan(String value) {
            addCriterion("SA07 <", value, "sa07");
            return (Criteria) this;
        }

        public Criteria andSa07LessThanOrEqualTo(String value) {
            addCriterion("SA07 <=", value, "sa07");
            return (Criteria) this;
        }

        public Criteria andSa07Like(String value) {
            addCriterion("SA07 like", value, "sa07");
            return (Criteria) this;
        }

        public Criteria andSa07NotLike(String value) {
            addCriterion("SA07 not like", value, "sa07");
            return (Criteria) this;
        }

        public Criteria andSa07In(List<String> values) {
            addCriterion("SA07 in", values, "sa07");
            return (Criteria) this;
        }

        public Criteria andSa07NotIn(List<String> values) {
            addCriterion("SA07 not in", values, "sa07");
            return (Criteria) this;
        }

        public Criteria andSa07Between(String value1, String value2) {
            addCriterion("SA07 between", value1, value2, "sa07");
            return (Criteria) this;
        }

        public Criteria andSa07NotBetween(String value1, String value2) {
            addCriterion("SA07 not between", value1, value2, "sa07");
            return (Criteria) this;
        }

        public Criteria andSa08IsNull() {
            addCriterion("SA08 is null");
            return (Criteria) this;
        }

        public Criteria andSa08IsNotNull() {
            addCriterion("SA08 is not null");
            return (Criteria) this;
        }

        public Criteria andSa08EqualTo(String value) {
            addCriterion("SA08 =", value, "sa08");
            return (Criteria) this;
        }

        public Criteria andSa08NotEqualTo(String value) {
            addCriterion("SA08 <>", value, "sa08");
            return (Criteria) this;
        }

        public Criteria andSa08GreaterThan(String value) {
            addCriterion("SA08 >", value, "sa08");
            return (Criteria) this;
        }

        public Criteria andSa08GreaterThanOrEqualTo(String value) {
            addCriterion("SA08 >=", value, "sa08");
            return (Criteria) this;
        }

        public Criteria andSa08LessThan(String value) {
            addCriterion("SA08 <", value, "sa08");
            return (Criteria) this;
        }

        public Criteria andSa08LessThanOrEqualTo(String value) {
            addCriterion("SA08 <=", value, "sa08");
            return (Criteria) this;
        }

        public Criteria andSa08Like(String value) {
            addCriterion("SA08 like", value, "sa08");
            return (Criteria) this;
        }

        public Criteria andSa08NotLike(String value) {
            addCriterion("SA08 not like", value, "sa08");
            return (Criteria) this;
        }

        public Criteria andSa08In(List<String> values) {
            addCriterion("SA08 in", values, "sa08");
            return (Criteria) this;
        }

        public Criteria andSa08NotIn(List<String> values) {
            addCriterion("SA08 not in", values, "sa08");
            return (Criteria) this;
        }

        public Criteria andSa08Between(String value1, String value2) {
            addCriterion("SA08 between", value1, value2, "sa08");
            return (Criteria) this;
        }

        public Criteria andSa08NotBetween(String value1, String value2) {
            addCriterion("SA08 not between", value1, value2, "sa08");
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