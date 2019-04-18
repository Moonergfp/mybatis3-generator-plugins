package com.github.oceanc.mybatis3.generator.plugin.model;

import java.util.ArrayList;
import java.util.List;

public class PaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private String sumCol;

    public PaperExample() {
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
        this.sumCol = null;
    }

    public String getSumCol() {
        return this.sumCol;
    }

    public void setSumCol(String sumCol) {
        this.sumCol = sumCol;
    }

    public PaperExample sumId() {
        this.sumCol="id";
        return this;
    }

    public PaperExample sumName() {
        this.sumCol="name";
        return this;
    }

    public PaperExample sumCityId() {
        this.sumCol="city_id";
        return this;
    }

    public PaperExample sumCityName() {
        this.sumCol="city_name";
        return this;
    }

    public PaperExample sumStartDate() {
        this.sumCol="start_date";
        return this;
    }

    public PaperExample sumEndDate() {
        this.sumCol="end_date";
        return this;
    }

    public PaperExample sumCurrentIdentity() {
        this.sumCol="current_identity";
        return this;
    }

    public PaperExample sumTargetIdentity() {
        this.sumCol="target_identity";
        return this;
    }

    public PaperExample sumAssessmentCycle() {
        this.sumCol="assessment_cycle";
        return this;
    }

    public PaperExample sumStartPushId() {
        this.sumCol="start_push_id";
        return this;
    }

    public PaperExample sumPassedPushId() {
        this.sumCol="passed_push_id";
        return this;
    }

    public PaperExample sumCtime() {
        this.sumCol="ctime";
        return this;
    }

    public PaperExample sumUtime() {
        this.sumCol="utime";
        return this;
    }

    public PaperExample sumValid() {
        this.sumCol="valid";
        return this;
    }

    public PaperExample sumStatus() {
        this.sumCol="status";
        return this;
    }

    public PaperExample sumEffective() {
        this.sumCol="effective";
        return this;
    }

    public PaperExample sumCreator() {
        this.sumCol="creator";
        return this;
    }

    public PaperExample sumCurrentIdentityName() {
        this.sumCol="current_identity_name";
        return this;
    }

    public PaperExample sumTargetIdentityName() {
        this.sumCol="target_identity_name";
        return this;
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Long value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Long value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Long value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Long value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Long value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Long value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Long> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Long> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Long value1, Long value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Long value1, Long value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Long value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Long value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Long value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Long value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Long value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Long value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Long> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Long> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Long value1, Long value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Long value1, Long value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityIsNull() {
            addCriterion("current_identity is null");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityIsNotNull() {
            addCriterion("current_identity is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityEqualTo(Long value) {
            addCriterion("current_identity =", value, "currentIdentity");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityNotEqualTo(Long value) {
            addCriterion("current_identity <>", value, "currentIdentity");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityGreaterThan(Long value) {
            addCriterion("current_identity >", value, "currentIdentity");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityGreaterThanOrEqualTo(Long value) {
            addCriterion("current_identity >=", value, "currentIdentity");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityLessThan(Long value) {
            addCriterion("current_identity <", value, "currentIdentity");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityLessThanOrEqualTo(Long value) {
            addCriterion("current_identity <=", value, "currentIdentity");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityIn(List<Long> values) {
            addCriterion("current_identity in", values, "currentIdentity");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityNotIn(List<Long> values) {
            addCriterion("current_identity not in", values, "currentIdentity");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityBetween(Long value1, Long value2) {
            addCriterion("current_identity between", value1, value2, "currentIdentity");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityNotBetween(Long value1, Long value2) {
            addCriterion("current_identity not between", value1, value2, "currentIdentity");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityIsNull() {
            addCriterion("target_identity is null");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityIsNotNull() {
            addCriterion("target_identity is not null");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityEqualTo(Long value) {
            addCriterion("target_identity =", value, "targetIdentity");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityNotEqualTo(Long value) {
            addCriterion("target_identity <>", value, "targetIdentity");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityGreaterThan(Long value) {
            addCriterion("target_identity >", value, "targetIdentity");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityGreaterThanOrEqualTo(Long value) {
            addCriterion("target_identity >=", value, "targetIdentity");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityLessThan(Long value) {
            addCriterion("target_identity <", value, "targetIdentity");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityLessThanOrEqualTo(Long value) {
            addCriterion("target_identity <=", value, "targetIdentity");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityIn(List<Long> values) {
            addCriterion("target_identity in", values, "targetIdentity");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityNotIn(List<Long> values) {
            addCriterion("target_identity not in", values, "targetIdentity");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityBetween(Long value1, Long value2) {
            addCriterion("target_identity between", value1, value2, "targetIdentity");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityNotBetween(Long value1, Long value2) {
            addCriterion("target_identity not between", value1, value2, "targetIdentity");
            return (Criteria) this;
        }

        public Criteria andAssessmentCycleIsNull() {
            addCriterion("assessment_cycle is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentCycleIsNotNull() {
            addCriterion("assessment_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentCycleEqualTo(Integer value) {
            addCriterion("assessment_cycle =", value, "assessmentCycle");
            return (Criteria) this;
        }

        public Criteria andAssessmentCycleNotEqualTo(Integer value) {
            addCriterion("assessment_cycle <>", value, "assessmentCycle");
            return (Criteria) this;
        }

        public Criteria andAssessmentCycleGreaterThan(Integer value) {
            addCriterion("assessment_cycle >", value, "assessmentCycle");
            return (Criteria) this;
        }

        public Criteria andAssessmentCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("assessment_cycle >=", value, "assessmentCycle");
            return (Criteria) this;
        }

        public Criteria andAssessmentCycleLessThan(Integer value) {
            addCriterion("assessment_cycle <", value, "assessmentCycle");
            return (Criteria) this;
        }

        public Criteria andAssessmentCycleLessThanOrEqualTo(Integer value) {
            addCriterion("assessment_cycle <=", value, "assessmentCycle");
            return (Criteria) this;
        }

        public Criteria andAssessmentCycleIn(List<Integer> values) {
            addCriterion("assessment_cycle in", values, "assessmentCycle");
            return (Criteria) this;
        }

        public Criteria andAssessmentCycleNotIn(List<Integer> values) {
            addCriterion("assessment_cycle not in", values, "assessmentCycle");
            return (Criteria) this;
        }

        public Criteria andAssessmentCycleBetween(Integer value1, Integer value2) {
            addCriterion("assessment_cycle between", value1, value2, "assessmentCycle");
            return (Criteria) this;
        }

        public Criteria andAssessmentCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("assessment_cycle not between", value1, value2, "assessmentCycle");
            return (Criteria) this;
        }

        public Criteria andStartPushIdIsNull() {
            addCriterion("start_push_id is null");
            return (Criteria) this;
        }

        public Criteria andStartPushIdIsNotNull() {
            addCriterion("start_push_id is not null");
            return (Criteria) this;
        }

        public Criteria andStartPushIdEqualTo(Long value) {
            addCriterion("start_push_id =", value, "startPushId");
            return (Criteria) this;
        }

        public Criteria andStartPushIdNotEqualTo(Long value) {
            addCriterion("start_push_id <>", value, "startPushId");
            return (Criteria) this;
        }

        public Criteria andStartPushIdGreaterThan(Long value) {
            addCriterion("start_push_id >", value, "startPushId");
            return (Criteria) this;
        }

        public Criteria andStartPushIdGreaterThanOrEqualTo(Long value) {
            addCriterion("start_push_id >=", value, "startPushId");
            return (Criteria) this;
        }

        public Criteria andStartPushIdLessThan(Long value) {
            addCriterion("start_push_id <", value, "startPushId");
            return (Criteria) this;
        }

        public Criteria andStartPushIdLessThanOrEqualTo(Long value) {
            addCriterion("start_push_id <=", value, "startPushId");
            return (Criteria) this;
        }

        public Criteria andStartPushIdIn(List<Long> values) {
            addCriterion("start_push_id in", values, "startPushId");
            return (Criteria) this;
        }

        public Criteria andStartPushIdNotIn(List<Long> values) {
            addCriterion("start_push_id not in", values, "startPushId");
            return (Criteria) this;
        }

        public Criteria andStartPushIdBetween(Long value1, Long value2) {
            addCriterion("start_push_id between", value1, value2, "startPushId");
            return (Criteria) this;
        }

        public Criteria andStartPushIdNotBetween(Long value1, Long value2) {
            addCriterion("start_push_id not between", value1, value2, "startPushId");
            return (Criteria) this;
        }

        public Criteria andPassedPushIdIsNull() {
            addCriterion("passed_push_id is null");
            return (Criteria) this;
        }

        public Criteria andPassedPushIdIsNotNull() {
            addCriterion("passed_push_id is not null");
            return (Criteria) this;
        }

        public Criteria andPassedPushIdEqualTo(Long value) {
            addCriterion("passed_push_id =", value, "passedPushId");
            return (Criteria) this;
        }

        public Criteria andPassedPushIdNotEqualTo(Long value) {
            addCriterion("passed_push_id <>", value, "passedPushId");
            return (Criteria) this;
        }

        public Criteria andPassedPushIdGreaterThan(Long value) {
            addCriterion("passed_push_id >", value, "passedPushId");
            return (Criteria) this;
        }

        public Criteria andPassedPushIdGreaterThanOrEqualTo(Long value) {
            addCriterion("passed_push_id >=", value, "passedPushId");
            return (Criteria) this;
        }

        public Criteria andPassedPushIdLessThan(Long value) {
            addCriterion("passed_push_id <", value, "passedPushId");
            return (Criteria) this;
        }

        public Criteria andPassedPushIdLessThanOrEqualTo(Long value) {
            addCriterion("passed_push_id <=", value, "passedPushId");
            return (Criteria) this;
        }

        public Criteria andPassedPushIdIn(List<Long> values) {
            addCriterion("passed_push_id in", values, "passedPushId");
            return (Criteria) this;
        }

        public Criteria andPassedPushIdNotIn(List<Long> values) {
            addCriterion("passed_push_id not in", values, "passedPushId");
            return (Criteria) this;
        }

        public Criteria andPassedPushIdBetween(Long value1, Long value2) {
            addCriterion("passed_push_id between", value1, value2, "passedPushId");
            return (Criteria) this;
        }

        public Criteria andPassedPushIdNotBetween(Long value1, Long value2) {
            addCriterion("passed_push_id not between", value1, value2, "passedPushId");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Long value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Long value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Long value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Long value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Long value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Long value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Long> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Long> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Long value1, Long value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Long value1, Long value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNull() {
            addCriterion("utime is null");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNotNull() {
            addCriterion("utime is not null");
            return (Criteria) this;
        }

        public Criteria andUtimeEqualTo(Long value) {
            addCriterion("utime =", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotEqualTo(Long value) {
            addCriterion("utime <>", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThan(Long value) {
            addCriterion("utime >", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThanOrEqualTo(Long value) {
            addCriterion("utime >=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThan(Long value) {
            addCriterion("utime <", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThanOrEqualTo(Long value) {
            addCriterion("utime <=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeIn(List<Long> values) {
            addCriterion("utime in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotIn(List<Long> values) {
            addCriterion("utime not in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeBetween(Long value1, Long value2) {
            addCriterion("utime between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotBetween(Long value1, Long value2) {
            addCriterion("utime not between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("valid is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("valid is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(Boolean value) {
            addCriterion("valid =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(Boolean value) {
            addCriterion("valid <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(Boolean value) {
            addCriterion("valid >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(Boolean value) {
            addCriterion("valid >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(Boolean value) {
            addCriterion("valid <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(Boolean value) {
            addCriterion("valid <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<Boolean> values) {
            addCriterion("valid in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<Boolean> values) {
            addCriterion("valid not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(Boolean value1, Boolean value2) {
            addCriterion("valid between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(Boolean value1, Boolean value2) {
            addCriterion("valid not between", value1, value2, "valid");
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

        public Criteria andEffectiveIsNull() {
            addCriterion("effective is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveIsNotNull() {
            addCriterion("effective is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveEqualTo(Boolean value) {
            addCriterion("effective =", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveNotEqualTo(Boolean value) {
            addCriterion("effective <>", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveGreaterThan(Boolean value) {
            addCriterion("effective >", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("effective >=", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveLessThan(Boolean value) {
            addCriterion("effective <", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveLessThanOrEqualTo(Boolean value) {
            addCriterion("effective <=", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveIn(List<Boolean> values) {
            addCriterion("effective in", values, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveNotIn(List<Boolean> values) {
            addCriterion("effective not in", values, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveBetween(Boolean value1, Boolean value2) {
            addCriterion("effective between", value1, value2, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("effective not between", value1, value2, "effective");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityNameIsNull() {
            addCriterion("current_identity_name is null");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityNameIsNotNull() {
            addCriterion("current_identity_name is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityNameEqualTo(String value) {
            addCriterion("current_identity_name =", value, "currentIdentityName");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityNameNotEqualTo(String value) {
            addCriterion("current_identity_name <>", value, "currentIdentityName");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityNameGreaterThan(String value) {
            addCriterion("current_identity_name >", value, "currentIdentityName");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityNameGreaterThanOrEqualTo(String value) {
            addCriterion("current_identity_name >=", value, "currentIdentityName");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityNameLessThan(String value) {
            addCriterion("current_identity_name <", value, "currentIdentityName");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityNameLessThanOrEqualTo(String value) {
            addCriterion("current_identity_name <=", value, "currentIdentityName");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityNameLike(String value) {
            addCriterion("current_identity_name like", value, "currentIdentityName");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityNameNotLike(String value) {
            addCriterion("current_identity_name not like", value, "currentIdentityName");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityNameIn(List<String> values) {
            addCriterion("current_identity_name in", values, "currentIdentityName");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityNameNotIn(List<String> values) {
            addCriterion("current_identity_name not in", values, "currentIdentityName");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityNameBetween(String value1, String value2) {
            addCriterion("current_identity_name between", value1, value2, "currentIdentityName");
            return (Criteria) this;
        }

        public Criteria andCurrentIdentityNameNotBetween(String value1, String value2) {
            addCriterion("current_identity_name not between", value1, value2, "currentIdentityName");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityNameIsNull() {
            addCriterion("target_identity_name is null");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityNameIsNotNull() {
            addCriterion("target_identity_name is not null");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityNameEqualTo(String value) {
            addCriterion("target_identity_name =", value, "targetIdentityName");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityNameNotEqualTo(String value) {
            addCriterion("target_identity_name <>", value, "targetIdentityName");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityNameGreaterThan(String value) {
            addCriterion("target_identity_name >", value, "targetIdentityName");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityNameGreaterThanOrEqualTo(String value) {
            addCriterion("target_identity_name >=", value, "targetIdentityName");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityNameLessThan(String value) {
            addCriterion("target_identity_name <", value, "targetIdentityName");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityNameLessThanOrEqualTo(String value) {
            addCriterion("target_identity_name <=", value, "targetIdentityName");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityNameLike(String value) {
            addCriterion("target_identity_name like", value, "targetIdentityName");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityNameNotLike(String value) {
            addCriterion("target_identity_name not like", value, "targetIdentityName");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityNameIn(List<String> values) {
            addCriterion("target_identity_name in", values, "targetIdentityName");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityNameNotIn(List<String> values) {
            addCriterion("target_identity_name not in", values, "targetIdentityName");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityNameBetween(String value1, String value2) {
            addCriterion("target_identity_name between", value1, value2, "targetIdentityName");
            return (Criteria) this;
        }

        public Criteria andTargetIdentityNameNotBetween(String value1, String value2) {
            addCriterion("target_identity_name not between", value1, value2, "targetIdentityName");
            return (Criteria) this;
        }

        public Criteria addConditionSql(String conditionSql) {
            addCriterion(conditionSql);
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