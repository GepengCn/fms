package com.itonglian.fms.entity;

import java.util.ArrayList;
import java.util.List;

public class FmsFileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmsFileExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNull() {
            addCriterion("taskId is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("taskId is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(String value) {
            addCriterion("taskId =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(String value) {
            addCriterion("taskId <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(String value) {
            addCriterion("taskId >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(String value) {
            addCriterion("taskId >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(String value) {
            addCriterion("taskId <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(String value) {
            addCriterion("taskId <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLike(String value) {
            addCriterion("taskId like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotLike(String value) {
            addCriterion("taskId not like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<String> values) {
            addCriterion("taskId in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<String> values) {
            addCriterion("taskId not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(String value1, String value2) {
            addCriterion("taskId between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(String value1, String value2) {
            addCriterion("taskId not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andDraftloginIsNull() {
            addCriterion("draftLogin is null");
            return (Criteria) this;
        }

        public Criteria andDraftloginIsNotNull() {
            addCriterion("draftLogin is not null");
            return (Criteria) this;
        }

        public Criteria andDraftloginEqualTo(String value) {
            addCriterion("draftLogin =", value, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftloginNotEqualTo(String value) {
            addCriterion("draftLogin <>", value, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftloginGreaterThan(String value) {
            addCriterion("draftLogin >", value, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftloginGreaterThanOrEqualTo(String value) {
            addCriterion("draftLogin >=", value, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftloginLessThan(String value) {
            addCriterion("draftLogin <", value, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftloginLessThanOrEqualTo(String value) {
            addCriterion("draftLogin <=", value, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftloginLike(String value) {
            addCriterion("draftLogin like", value, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftloginNotLike(String value) {
            addCriterion("draftLogin not like", value, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftloginIn(List<String> values) {
            addCriterion("draftLogin in", values, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftloginNotIn(List<String> values) {
            addCriterion("draftLogin not in", values, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftloginBetween(String value1, String value2) {
            addCriterion("draftLogin between", value1, value2, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftloginNotBetween(String value1, String value2) {
            addCriterion("draftLogin not between", value1, value2, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftnameIsNull() {
            addCriterion("draftName is null");
            return (Criteria) this;
        }

        public Criteria andDraftnameIsNotNull() {
            addCriterion("draftName is not null");
            return (Criteria) this;
        }

        public Criteria andDraftnameEqualTo(String value) {
            addCriterion("draftName =", value, "draftname");
            return (Criteria) this;
        }

        public Criteria andDraftnameNotEqualTo(String value) {
            addCriterion("draftName <>", value, "draftname");
            return (Criteria) this;
        }

        public Criteria andDraftnameGreaterThan(String value) {
            addCriterion("draftName >", value, "draftname");
            return (Criteria) this;
        }

        public Criteria andDraftnameGreaterThanOrEqualTo(String value) {
            addCriterion("draftName >=", value, "draftname");
            return (Criteria) this;
        }

        public Criteria andDraftnameLessThan(String value) {
            addCriterion("draftName <", value, "draftname");
            return (Criteria) this;
        }

        public Criteria andDraftnameLessThanOrEqualTo(String value) {
            addCriterion("draftName <=", value, "draftname");
            return (Criteria) this;
        }

        public Criteria andDraftnameLike(String value) {
            addCriterion("draftName like", value, "draftname");
            return (Criteria) this;
        }

        public Criteria andDraftnameNotLike(String value) {
            addCriterion("draftName not like", value, "draftname");
            return (Criteria) this;
        }

        public Criteria andDraftnameIn(List<String> values) {
            addCriterion("draftName in", values, "draftname");
            return (Criteria) this;
        }

        public Criteria andDraftnameNotIn(List<String> values) {
            addCriterion("draftName not in", values, "draftname");
            return (Criteria) this;
        }

        public Criteria andDraftnameBetween(String value1, String value2) {
            addCriterion("draftName between", value1, value2, "draftname");
            return (Criteria) this;
        }

        public Criteria andDraftnameNotBetween(String value1, String value2) {
            addCriterion("draftName not between", value1, value2, "draftname");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("createTime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("createTime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("modifyTime is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("modifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(String value) {
            addCriterion("modifyTime =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(String value) {
            addCriterion("modifyTime <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(String value) {
            addCriterion("modifyTime >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("modifyTime >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(String value) {
            addCriterion("modifyTime <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(String value) {
            addCriterion("modifyTime <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLike(String value) {
            addCriterion("modifyTime like", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotLike(String value) {
            addCriterion("modifyTime not like", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<String> values) {
            addCriterion("modifyTime in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<String> values) {
            addCriterion("modifyTime not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(String value1, String value2) {
            addCriterion("modifyTime between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(String value1, String value2) {
            addCriterion("modifyTime not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andTextpathIsNull() {
            addCriterion("textPath is null");
            return (Criteria) this;
        }

        public Criteria andTextpathIsNotNull() {
            addCriterion("textPath is not null");
            return (Criteria) this;
        }

        public Criteria andTextpathEqualTo(String value) {
            addCriterion("textPath =", value, "textpath");
            return (Criteria) this;
        }

        public Criteria andTextpathNotEqualTo(String value) {
            addCriterion("textPath <>", value, "textpath");
            return (Criteria) this;
        }

        public Criteria andTextpathGreaterThan(String value) {
            addCriterion("textPath >", value, "textpath");
            return (Criteria) this;
        }

        public Criteria andTextpathGreaterThanOrEqualTo(String value) {
            addCriterion("textPath >=", value, "textpath");
            return (Criteria) this;
        }

        public Criteria andTextpathLessThan(String value) {
            addCriterion("textPath <", value, "textpath");
            return (Criteria) this;
        }

        public Criteria andTextpathLessThanOrEqualTo(String value) {
            addCriterion("textPath <=", value, "textpath");
            return (Criteria) this;
        }

        public Criteria andTextpathLike(String value) {
            addCriterion("textPath like", value, "textpath");
            return (Criteria) this;
        }

        public Criteria andTextpathNotLike(String value) {
            addCriterion("textPath not like", value, "textpath");
            return (Criteria) this;
        }

        public Criteria andTextpathIn(List<String> values) {
            addCriterion("textPath in", values, "textpath");
            return (Criteria) this;
        }

        public Criteria andTextpathNotIn(List<String> values) {
            addCriterion("textPath not in", values, "textpath");
            return (Criteria) this;
        }

        public Criteria andTextpathBetween(String value1, String value2) {
            addCriterion("textPath between", value1, value2, "textpath");
            return (Criteria) this;
        }

        public Criteria andTextpathNotBetween(String value1, String value2) {
            addCriterion("textPath not between", value1, value2, "textpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathIsNull() {
            addCriterion("attachPath is null");
            return (Criteria) this;
        }

        public Criteria andAttachpathIsNotNull() {
            addCriterion("attachPath is not null");
            return (Criteria) this;
        }

        public Criteria andAttachpathEqualTo(String value) {
            addCriterion("attachPath =", value, "attachpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathNotEqualTo(String value) {
            addCriterion("attachPath <>", value, "attachpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathGreaterThan(String value) {
            addCriterion("attachPath >", value, "attachpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathGreaterThanOrEqualTo(String value) {
            addCriterion("attachPath >=", value, "attachpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathLessThan(String value) {
            addCriterion("attachPath <", value, "attachpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathLessThanOrEqualTo(String value) {
            addCriterion("attachPath <=", value, "attachpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathLike(String value) {
            addCriterion("attachPath like", value, "attachpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathNotLike(String value) {
            addCriterion("attachPath not like", value, "attachpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathIn(List<String> values) {
            addCriterion("attachPath in", values, "attachpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathNotIn(List<String> values) {
            addCriterion("attachPath not in", values, "attachpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathBetween(String value1, String value2) {
            addCriterion("attachPath between", value1, value2, "attachpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathNotBetween(String value1, String value2) {
            addCriterion("attachPath not between", value1, value2, "attachpath");
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