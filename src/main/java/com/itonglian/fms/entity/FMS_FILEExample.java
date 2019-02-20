package com.itonglian.fms.entity;

import java.util.ArrayList;
import java.util.List;

public class FMS_FILEExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FMS_FILEExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNull() {
            addCriterion("TASKID is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("TASKID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(String value) {
            addCriterion("TASKID =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(String value) {
            addCriterion("TASKID <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(String value) {
            addCriterion("TASKID >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(String value) {
            addCriterion("TASKID >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(String value) {
            addCriterion("TASKID <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(String value) {
            addCriterion("TASKID <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLike(String value) {
            addCriterion("TASKID like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotLike(String value) {
            addCriterion("TASKID not like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<String> values) {
            addCriterion("TASKID in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<String> values) {
            addCriterion("TASKID not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(String value1, String value2) {
            addCriterion("TASKID between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(String value1, String value2) {
            addCriterion("TASKID not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andDraftloginIsNull() {
            addCriterion("DRAFTLOGIN is null");
            return (Criteria) this;
        }

        public Criteria andDraftloginIsNotNull() {
            addCriterion("DRAFTLOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andDraftloginEqualTo(String value) {
            addCriterion("DRAFTLOGIN =", value, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftloginNotEqualTo(String value) {
            addCriterion("DRAFTLOGIN <>", value, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftloginGreaterThan(String value) {
            addCriterion("DRAFTLOGIN >", value, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftloginGreaterThanOrEqualTo(String value) {
            addCriterion("DRAFTLOGIN >=", value, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftloginLessThan(String value) {
            addCriterion("DRAFTLOGIN <", value, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftloginLessThanOrEqualTo(String value) {
            addCriterion("DRAFTLOGIN <=", value, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftloginLike(String value) {
            addCriterion("DRAFTLOGIN like", value, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftloginNotLike(String value) {
            addCriterion("DRAFTLOGIN not like", value, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftloginIn(List<String> values) {
            addCriterion("DRAFTLOGIN in", values, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftloginNotIn(List<String> values) {
            addCriterion("DRAFTLOGIN not in", values, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftloginBetween(String value1, String value2) {
            addCriterion("DRAFTLOGIN between", value1, value2, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftloginNotBetween(String value1, String value2) {
            addCriterion("DRAFTLOGIN not between", value1, value2, "draftlogin");
            return (Criteria) this;
        }

        public Criteria andDraftnameIsNull() {
            addCriterion("DRAFTNAME is null");
            return (Criteria) this;
        }

        public Criteria andDraftnameIsNotNull() {
            addCriterion("DRAFTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDraftnameEqualTo(String value) {
            addCriterion("DRAFTNAME =", value, "draftname");
            return (Criteria) this;
        }

        public Criteria andDraftnameNotEqualTo(String value) {
            addCriterion("DRAFTNAME <>", value, "draftname");
            return (Criteria) this;
        }

        public Criteria andDraftnameGreaterThan(String value) {
            addCriterion("DRAFTNAME >", value, "draftname");
            return (Criteria) this;
        }

        public Criteria andDraftnameGreaterThanOrEqualTo(String value) {
            addCriterion("DRAFTNAME >=", value, "draftname");
            return (Criteria) this;
        }

        public Criteria andDraftnameLessThan(String value) {
            addCriterion("DRAFTNAME <", value, "draftname");
            return (Criteria) this;
        }

        public Criteria andDraftnameLessThanOrEqualTo(String value) {
            addCriterion("DRAFTNAME <=", value, "draftname");
            return (Criteria) this;
        }

        public Criteria andDraftnameLike(String value) {
            addCriterion("DRAFTNAME like", value, "draftname");
            return (Criteria) this;
        }

        public Criteria andDraftnameNotLike(String value) {
            addCriterion("DRAFTNAME not like", value, "draftname");
            return (Criteria) this;
        }

        public Criteria andDraftnameIn(List<String> values) {
            addCriterion("DRAFTNAME in", values, "draftname");
            return (Criteria) this;
        }

        public Criteria andDraftnameNotIn(List<String> values) {
            addCriterion("DRAFTNAME not in", values, "draftname");
            return (Criteria) this;
        }

        public Criteria andDraftnameBetween(String value1, String value2) {
            addCriterion("DRAFTNAME between", value1, value2, "draftname");
            return (Criteria) this;
        }

        public Criteria andDraftnameNotBetween(String value1, String value2) {
            addCriterion("DRAFTNAME not between", value1, value2, "draftname");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Long value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Long value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Long value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Long value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Long value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Long> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Long> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Long value1, Long value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Long value1, Long value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("CREATETIME like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("CREATETIME not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("MODIFYTIME is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("MODIFYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(String value) {
            addCriterion("MODIFYTIME =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(String value) {
            addCriterion("MODIFYTIME <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(String value) {
            addCriterion("MODIFYTIME >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFYTIME >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(String value) {
            addCriterion("MODIFYTIME <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(String value) {
            addCriterion("MODIFYTIME <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLike(String value) {
            addCriterion("MODIFYTIME like", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotLike(String value) {
            addCriterion("MODIFYTIME not like", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<String> values) {
            addCriterion("MODIFYTIME in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<String> values) {
            addCriterion("MODIFYTIME not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(String value1, String value2) {
            addCriterion("MODIFYTIME between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(String value1, String value2) {
            addCriterion("MODIFYTIME not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andTextpathIsNull() {
            addCriterion("TEXTPATH is null");
            return (Criteria) this;
        }

        public Criteria andTextpathIsNotNull() {
            addCriterion("TEXTPATH is not null");
            return (Criteria) this;
        }

        public Criteria andTextpathEqualTo(String value) {
            addCriterion("TEXTPATH =", value, "textpath");
            return (Criteria) this;
        }

        public Criteria andTextpathNotEqualTo(String value) {
            addCriterion("TEXTPATH <>", value, "textpath");
            return (Criteria) this;
        }

        public Criteria andTextpathGreaterThan(String value) {
            addCriterion("TEXTPATH >", value, "textpath");
            return (Criteria) this;
        }

        public Criteria andTextpathGreaterThanOrEqualTo(String value) {
            addCriterion("TEXTPATH >=", value, "textpath");
            return (Criteria) this;
        }

        public Criteria andTextpathLessThan(String value) {
            addCriterion("TEXTPATH <", value, "textpath");
            return (Criteria) this;
        }

        public Criteria andTextpathLessThanOrEqualTo(String value) {
            addCriterion("TEXTPATH <=", value, "textpath");
            return (Criteria) this;
        }

        public Criteria andTextpathLike(String value) {
            addCriterion("TEXTPATH like", value, "textpath");
            return (Criteria) this;
        }

        public Criteria andTextpathNotLike(String value) {
            addCriterion("TEXTPATH not like", value, "textpath");
            return (Criteria) this;
        }

        public Criteria andTextpathIn(List<String> values) {
            addCriterion("TEXTPATH in", values, "textpath");
            return (Criteria) this;
        }

        public Criteria andTextpathNotIn(List<String> values) {
            addCriterion("TEXTPATH not in", values, "textpath");
            return (Criteria) this;
        }

        public Criteria andTextpathBetween(String value1, String value2) {
            addCriterion("TEXTPATH between", value1, value2, "textpath");
            return (Criteria) this;
        }

        public Criteria andTextpathNotBetween(String value1, String value2) {
            addCriterion("TEXTPATH not between", value1, value2, "textpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathIsNull() {
            addCriterion("ATTACHPATH is null");
            return (Criteria) this;
        }

        public Criteria andAttachpathIsNotNull() {
            addCriterion("ATTACHPATH is not null");
            return (Criteria) this;
        }

        public Criteria andAttachpathEqualTo(String value) {
            addCriterion("ATTACHPATH =", value, "attachpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathNotEqualTo(String value) {
            addCriterion("ATTACHPATH <>", value, "attachpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathGreaterThan(String value) {
            addCriterion("ATTACHPATH >", value, "attachpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACHPATH >=", value, "attachpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathLessThan(String value) {
            addCriterion("ATTACHPATH <", value, "attachpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathLessThanOrEqualTo(String value) {
            addCriterion("ATTACHPATH <=", value, "attachpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathLike(String value) {
            addCriterion("ATTACHPATH like", value, "attachpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathNotLike(String value) {
            addCriterion("ATTACHPATH not like", value, "attachpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathIn(List<String> values) {
            addCriterion("ATTACHPATH in", values, "attachpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathNotIn(List<String> values) {
            addCriterion("ATTACHPATH not in", values, "attachpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathBetween(String value1, String value2) {
            addCriterion("ATTACHPATH between", value1, value2, "attachpath");
            return (Criteria) this;
        }

        public Criteria andAttachpathNotBetween(String value1, String value2) {
            addCriterion("ATTACHPATH not between", value1, value2, "attachpath");
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