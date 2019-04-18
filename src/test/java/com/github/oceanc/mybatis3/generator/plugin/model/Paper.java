package com.github.oceanc.mybatis3.generator.plugin.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.Serializable;
import java.util.TimeZone;

public class Paper implements Serializable {
    private Long id;

    private String name;

    private Integer cityId;

    private String cityName;

    private Long startDate;

    private Long endDate;

    private Long currentIdentity;

    private Long targetIdentity;

    private Integer assessmentCycle;

    private Long startPushId;

    private Long passedPushId;

    private Long ctime;

    private Long utime;

    private Boolean valid;

    private Integer status;

    private Boolean effective;

    private String creator;

    private String currentIdentityName;

    private String targetIdentityName;

    private static final long serialVersionUID = 1L;

    private String updateSql;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public Long getCurrentIdentity() {
        return currentIdentity;
    }

    public void setCurrentIdentity(Long currentIdentity) {
        this.currentIdentity = currentIdentity;
    }

    public Long getTargetIdentity() {
        return targetIdentity;
    }

    public void setTargetIdentity(Long targetIdentity) {
        this.targetIdentity = targetIdentity;
    }

    public Integer getAssessmentCycle() {
        return assessmentCycle;
    }

    public void setAssessmentCycle(Integer assessmentCycle) {
        this.assessmentCycle = assessmentCycle;
    }

    public Long getStartPushId() {
        return startPushId;
    }

    public void setStartPushId(Long startPushId) {
        this.startPushId = startPushId;
    }

    public Long getPassedPushId() {
        return passedPushId;
    }

    public void setPassedPushId(Long passedPushId) {
        this.passedPushId = passedPushId;
    }

    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    public Long getUtime() {
        return utime;
    }

    public void setUtime(Long utime) {
        this.utime = utime;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getEffective() {
        return effective;
    }

    public void setEffective(Boolean effective) {
        this.effective = effective;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getCurrentIdentityName() {
        return currentIdentityName;
    }

    public void setCurrentIdentityName(String currentIdentityName) {
        this.currentIdentityName = currentIdentityName == null ? null : currentIdentityName.trim();
    }

    public String getTargetIdentityName() {
        return targetIdentityName;
    }

    public void setTargetIdentityName(String targetIdentityName) {
        this.targetIdentityName = targetIdentityName == null ? null : targetIdentityName.trim();
    }

    public String toJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setTimeZone(TimeZone.getDefault());
        return mapper.writeValueAsString(this);
    }

    public String getUpdateSql() {
        return this.updateSql;
    }

    public void setUpdateSql(String updateSql) {
        this.updateSql = updateSql;
    }

    @Override
    public String toString() {
        return "com.github.oceanc.mybatis3.generator.plugin.model.Paper{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", currentIdentity=" + currentIdentity +
                ", targetIdentity=" + targetIdentity +
                ", assessmentCycle=" + assessmentCycle +
                ", startPushId=" + startPushId +
                ", passedPushId=" + passedPushId +
                ", ctime=" + ctime +
                ", utime=" + utime +
                ", valid=" + valid +
                ", status=" + status +
                ", effective=" + effective +
                ", creator='" + creator + '\'' +
                ", currentIdentityName='" + currentIdentityName + '\'' +
                ", targetIdentityName='" + targetIdentityName + '\'' +
                ", updateSql='" + updateSql + '\'' +
                '}';
    }
}