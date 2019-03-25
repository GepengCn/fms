package com.itonglian.fms.entity;

import java.util.ArrayList;
import java.util.List;

public class FMS_TASKExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FMS_TASKExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
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

        public Criteria andFiletypeIsNull() {
            addCriterion("FILETYPE is null");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNotNull() {
            addCriterion("FILETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFiletypeEqualTo(String value) {
            addCriterion("FILETYPE =", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotEqualTo(String value) {
            addCriterion("FILETYPE <>", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThan(String value) {
            addCriterion("FILETYPE >", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThanOrEqualTo(String value) {
            addCriterion("FILETYPE >=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThan(String value) {
            addCriterion("FILETYPE <", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThanOrEqualTo(String value) {
            addCriterion("FILETYPE <=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLike(String value) {
            addCriterion("FILETYPE like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotLike(String value) {
            addCriterion("FILETYPE not like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeIn(List<String> values) {
            addCriterion("FILETYPE in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotIn(List<String> values) {
            addCriterion("FILETYPE not in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeBetween(String value1, String value2) {
            addCriterion("FILETYPE between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotBetween(String value1, String value2) {
            addCriterion("FILETYPE not between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTextnameIsNull() {
            addCriterion("TEXTNAME is null");
            return (Criteria) this;
        }

        public Criteria andTextnameIsNotNull() {
            addCriterion("TEXTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTextnameEqualTo(String value) {
            addCriterion("TEXTNAME =", value, "textname");
            return (Criteria) this;
        }

        public Criteria andTextnameNotEqualTo(String value) {
            addCriterion("TEXTNAME <>", value, "textname");
            return (Criteria) this;
        }

        public Criteria andTextnameGreaterThan(String value) {
            addCriterion("TEXTNAME >", value, "textname");
            return (Criteria) this;
        }

        public Criteria andTextnameGreaterThanOrEqualTo(String value) {
            addCriterion("TEXTNAME >=", value, "textname");
            return (Criteria) this;
        }

        public Criteria andTextnameLessThan(String value) {
            addCriterion("TEXTNAME <", value, "textname");
            return (Criteria) this;
        }

        public Criteria andTextnameLessThanOrEqualTo(String value) {
            addCriterion("TEXTNAME <=", value, "textname");
            return (Criteria) this;
        }

        public Criteria andTextnameLike(String value) {
            addCriterion("TEXTNAME like", value, "textname");
            return (Criteria) this;
        }

        public Criteria andTextnameNotLike(String value) {
            addCriterion("TEXTNAME not like", value, "textname");
            return (Criteria) this;
        }

        public Criteria andTextnameIn(List<String> values) {
            addCriterion("TEXTNAME in", values, "textname");
            return (Criteria) this;
        }

        public Criteria andTextnameNotIn(List<String> values) {
            addCriterion("TEXTNAME not in", values, "textname");
            return (Criteria) this;
        }

        public Criteria andTextnameBetween(String value1, String value2) {
            addCriterion("TEXTNAME between", value1, value2, "textname");
            return (Criteria) this;
        }

        public Criteria andTextnameNotBetween(String value1, String value2) {
            addCriterion("TEXTNAME not between", value1, value2, "textname");
            return (Criteria) this;
        }

        public Criteria andAttachnameIsNull() {
            addCriterion("ATTACHNAME is null");
            return (Criteria) this;
        }

        public Criteria andAttachnameIsNotNull() {
            addCriterion("ATTACHNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAttachnameEqualTo(String value) {
            addCriterion("ATTACHNAME =", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameNotEqualTo(String value) {
            addCriterion("ATTACHNAME <>", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameGreaterThan(String value) {
            addCriterion("ATTACHNAME >", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACHNAME >=", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameLessThan(String value) {
            addCriterion("ATTACHNAME <", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameLessThanOrEqualTo(String value) {
            addCriterion("ATTACHNAME <=", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameLike(String value) {
            addCriterion("ATTACHNAME like", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameNotLike(String value) {
            addCriterion("ATTACHNAME not like", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameIn(List<String> values) {
            addCriterion("ATTACHNAME in", values, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameNotIn(List<String> values) {
            addCriterion("ATTACHNAME not in", values, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameBetween(String value1, String value2) {
            addCriterion("ATTACHNAME between", value1, value2, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameNotBetween(String value1, String value2) {
            addCriterion("ATTACHNAME not between", value1, value2, "attachname");
            return (Criteria) this;
        }

        public Criteria andParentrootIsNull() {
            addCriterion("PARENTROOT is null");
            return (Criteria) this;
        }

        public Criteria andParentrootIsNotNull() {
            addCriterion("PARENTROOT is not null");
            return (Criteria) this;
        }

        public Criteria andParentrootEqualTo(String value) {
            addCriterion("PARENTROOT =", value, "parentroot");
            return (Criteria) this;
        }

        public Criteria andParentrootNotEqualTo(String value) {
            addCriterion("PARENTROOT <>", value, "parentroot");
            return (Criteria) this;
        }

        public Criteria andParentrootGreaterThan(String value) {
            addCriterion("PARENTROOT >", value, "parentroot");
            return (Criteria) this;
        }

        public Criteria andParentrootGreaterThanOrEqualTo(String value) {
            addCriterion("PARENTROOT >=", value, "parentroot");
            return (Criteria) this;
        }

        public Criteria andParentrootLessThan(String value) {
            addCriterion("PARENTROOT <", value, "parentroot");
            return (Criteria) this;
        }

        public Criteria andParentrootLessThanOrEqualTo(String value) {
            addCriterion("PARENTROOT <=", value, "parentroot");
            return (Criteria) this;
        }

        public Criteria andParentrootLike(String value) {
            addCriterion("PARENTROOT like", value, "parentroot");
            return (Criteria) this;
        }

        public Criteria andParentrootNotLike(String value) {
            addCriterion("PARENTROOT not like", value, "parentroot");
            return (Criteria) this;
        }

        public Criteria andParentrootIn(List<String> values) {
            addCriterion("PARENTROOT in", values, "parentroot");
            return (Criteria) this;
        }

        public Criteria andParentrootNotIn(List<String> values) {
            addCriterion("PARENTROOT not in", values, "parentroot");
            return (Criteria) this;
        }

        public Criteria andParentrootBetween(String value1, String value2) {
            addCriterion("PARENTROOT between", value1, value2, "parentroot");
            return (Criteria) this;
        }

        public Criteria andParentrootNotBetween(String value1, String value2) {
            addCriterion("PARENTROOT not between", value1, value2, "parentroot");
            return (Criteria) this;
        }

        public Criteria andDataidIsNull() {
            addCriterion("DATAID is null");
            return (Criteria) this;
        }

        public Criteria andDataidIsNotNull() {
            addCriterion("DATAID is not null");
            return (Criteria) this;
        }

        public Criteria andDataidEqualTo(String value) {
            addCriterion("DATAID =", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotEqualTo(String value) {
            addCriterion("DATAID <>", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidGreaterThan(String value) {
            addCriterion("DATAID >", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidGreaterThanOrEqualTo(String value) {
            addCriterion("DATAID >=", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidLessThan(String value) {
            addCriterion("DATAID <", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidLessThanOrEqualTo(String value) {
            addCriterion("DATAID <=", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidLike(String value) {
            addCriterion("DATAID like", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotLike(String value) {
            addCriterion("DATAID not like", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidIn(List<String> values) {
            addCriterion("DATAID in", values, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotIn(List<String> values) {
            addCriterion("DATAID not in", values, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidBetween(String value1, String value2) {
            addCriterion("DATAID between", value1, value2, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotBetween(String value1, String value2) {
            addCriterion("DATAID not between", value1, value2, "dataid");
            return (Criteria) this;
        }

        public Criteria andProloginIsNull() {
            addCriterion("PROLOGIN is null");
            return (Criteria) this;
        }

        public Criteria andProloginIsNotNull() {
            addCriterion("PROLOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andProloginEqualTo(String value) {
            addCriterion("PROLOGIN =", value, "prologin");
            return (Criteria) this;
        }

        public Criteria andProloginNotEqualTo(String value) {
            addCriterion("PROLOGIN <>", value, "prologin");
            return (Criteria) this;
        }

        public Criteria andProloginGreaterThan(String value) {
            addCriterion("PROLOGIN >", value, "prologin");
            return (Criteria) this;
        }

        public Criteria andProloginGreaterThanOrEqualTo(String value) {
            addCriterion("PROLOGIN >=", value, "prologin");
            return (Criteria) this;
        }

        public Criteria andProloginLessThan(String value) {
            addCriterion("PROLOGIN <", value, "prologin");
            return (Criteria) this;
        }

        public Criteria andProloginLessThanOrEqualTo(String value) {
            addCriterion("PROLOGIN <=", value, "prologin");
            return (Criteria) this;
        }

        public Criteria andProloginLike(String value) {
            addCriterion("PROLOGIN like", value, "prologin");
            return (Criteria) this;
        }

        public Criteria andProloginNotLike(String value) {
            addCriterion("PROLOGIN not like", value, "prologin");
            return (Criteria) this;
        }

        public Criteria andProloginIn(List<String> values) {
            addCriterion("PROLOGIN in", values, "prologin");
            return (Criteria) this;
        }

        public Criteria andProloginNotIn(List<String> values) {
            addCriterion("PROLOGIN not in", values, "prologin");
            return (Criteria) this;
        }

        public Criteria andProloginBetween(String value1, String value2) {
            addCriterion("PROLOGIN between", value1, value2, "prologin");
            return (Criteria) this;
        }

        public Criteria andProloginNotBetween(String value1, String value2) {
            addCriterion("PROLOGIN not between", value1, value2, "prologin");
            return (Criteria) this;
        }

        public Criteria andPronameIsNull() {
            addCriterion("PRONAME is null");
            return (Criteria) this;
        }

        public Criteria andPronameIsNotNull() {
            addCriterion("PRONAME is not null");
            return (Criteria) this;
        }

        public Criteria andPronameEqualTo(String value) {
            addCriterion("PRONAME =", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotEqualTo(String value) {
            addCriterion("PRONAME <>", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThan(String value) {
            addCriterion("PRONAME >", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThanOrEqualTo(String value) {
            addCriterion("PRONAME >=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThan(String value) {
            addCriterion("PRONAME <", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThanOrEqualTo(String value) {
            addCriterion("PRONAME <=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLike(String value) {
            addCriterion("PRONAME like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotLike(String value) {
            addCriterion("PRONAME not like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameIn(List<String> values) {
            addCriterion("PRONAME in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotIn(List<String> values) {
            addCriterion("PRONAME not in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameBetween(String value1, String value2) {
            addCriterion("PRONAME between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotBetween(String value1, String value2) {
            addCriterion("PRONAME not between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andProtimeIsNull() {
            addCriterion("PROTIME is null");
            return (Criteria) this;
        }

        public Criteria andProtimeIsNotNull() {
            addCriterion("PROTIME is not null");
            return (Criteria) this;
        }

        public Criteria andProtimeEqualTo(String value) {
            addCriterion("PROTIME =", value, "protime");
            return (Criteria) this;
        }

        public Criteria andProtimeNotEqualTo(String value) {
            addCriterion("PROTIME <>", value, "protime");
            return (Criteria) this;
        }

        public Criteria andProtimeGreaterThan(String value) {
            addCriterion("PROTIME >", value, "protime");
            return (Criteria) this;
        }

        public Criteria andProtimeGreaterThanOrEqualTo(String value) {
            addCriterion("PROTIME >=", value, "protime");
            return (Criteria) this;
        }

        public Criteria andProtimeLessThan(String value) {
            addCriterion("PROTIME <", value, "protime");
            return (Criteria) this;
        }

        public Criteria andProtimeLessThanOrEqualTo(String value) {
            addCriterion("PROTIME <=", value, "protime");
            return (Criteria) this;
        }

        public Criteria andProtimeLike(String value) {
            addCriterion("PROTIME like", value, "protime");
            return (Criteria) this;
        }

        public Criteria andProtimeNotLike(String value) {
            addCriterion("PROTIME not like", value, "protime");
            return (Criteria) this;
        }

        public Criteria andProtimeIn(List<String> values) {
            addCriterion("PROTIME in", values, "protime");
            return (Criteria) this;
        }

        public Criteria andProtimeNotIn(List<String> values) {
            addCriterion("PROTIME not in", values, "protime");
            return (Criteria) this;
        }

        public Criteria andProtimeBetween(String value1, String value2) {
            addCriterion("PROTIME between", value1, value2, "protime");
            return (Criteria) this;
        }

        public Criteria andProtimeNotBetween(String value1, String value2) {
            addCriterion("PROTIME not between", value1, value2, "protime");
            return (Criteria) this;
        }

        public Criteria andHandlersizeIsNull() {
            addCriterion("HANDLERSIZE is null");
            return (Criteria) this;
        }

        public Criteria andHandlersizeIsNotNull() {
            addCriterion("HANDLERSIZE is not null");
            return (Criteria) this;
        }

        public Criteria andHandlersizeEqualTo(Long value) {
            addCriterion("HANDLERSIZE =", value, "handlersize");
            return (Criteria) this;
        }

        public Criteria andHandlersizeNotEqualTo(Long value) {
            addCriterion("HANDLERSIZE <>", value, "handlersize");
            return (Criteria) this;
        }

        public Criteria andHandlersizeGreaterThan(Long value) {
            addCriterion("HANDLERSIZE >", value, "handlersize");
            return (Criteria) this;
        }

        public Criteria andHandlersizeGreaterThanOrEqualTo(Long value) {
            addCriterion("HANDLERSIZE >=", value, "handlersize");
            return (Criteria) this;
        }

        public Criteria andHandlersizeLessThan(Long value) {
            addCriterion("HANDLERSIZE <", value, "handlersize");
            return (Criteria) this;
        }

        public Criteria andHandlersizeLessThanOrEqualTo(Long value) {
            addCriterion("HANDLERSIZE <=", value, "handlersize");
            return (Criteria) this;
        }

        public Criteria andHandlersizeIn(List<Long> values) {
            addCriterion("HANDLERSIZE in", values, "handlersize");
            return (Criteria) this;
        }

        public Criteria andHandlersizeNotIn(List<Long> values) {
            addCriterion("HANDLERSIZE not in", values, "handlersize");
            return (Criteria) this;
        }

        public Criteria andHandlersizeBetween(Long value1, Long value2) {
            addCriterion("HANDLERSIZE between", value1, value2, "handlersize");
            return (Criteria) this;
        }

        public Criteria andHandlersizeNotBetween(Long value1, Long value2) {
            addCriterion("HANDLERSIZE not between", value1, value2, "handlersize");
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