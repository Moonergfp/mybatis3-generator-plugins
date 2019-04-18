package com.github.oceanc.mybatis3.generator.plugin.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.github.oceanc.mybatis3.generator.plugin.model.Paper;
import com.github.oceanc.mybatis3.generator.plugin.model.PaperExample.Criteria;
import com.github.oceanc.mybatis3.generator.plugin.model.PaperExample.Criterion;
import com.github.oceanc.mybatis3.generator.plugin.model.PaperExample;
import java.util.List;
import java.util.Map;

public class PaperSqlProvider {

    public String countByExample(PaperExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("paper");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(PaperExample example) {
        BEGIN();
        DELETE_FROM("paper");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Paper record) {
        BEGIN();
        INSERT_INTO("paper");
        
        if (record.getName() != null) {
            VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getCityId() != null) {
            VALUES("city_id", "#{cityId,jdbcType=INTEGER}");
        }
        
        if (record.getCityName() != null) {
            VALUES("city_name", "#{cityName,jdbcType=VARCHAR}");
        }
        
        if (record.getStartDate() != null) {
            VALUES("start_date", "#{startDate,jdbcType=BIGINT}");
        }
        
        if (record.getEndDate() != null) {
            VALUES("end_date", "#{endDate,jdbcType=BIGINT}");
        }
        
        if (record.getCurrentIdentity() != null) {
            VALUES("current_identity", "#{currentIdentity,jdbcType=BIGINT}");
        }
        
        if (record.getTargetIdentity() != null) {
            VALUES("target_identity", "#{targetIdentity,jdbcType=BIGINT}");
        }
        
        if (record.getAssessmentCycle() != null) {
            VALUES("assessment_cycle", "#{assessmentCycle,jdbcType=INTEGER}");
        }
        
        if (record.getStartPushId() != null) {
            VALUES("start_push_id", "#{startPushId,jdbcType=BIGINT}");
        }
        
        if (record.getPassedPushId() != null) {
            VALUES("passed_push_id", "#{passedPushId,jdbcType=BIGINT}");
        }
        
        if (record.getCtime() != null) {
            VALUES("ctime", "#{ctime,jdbcType=BIGINT}");
        }
        
        if (record.getUtime() != null) {
            VALUES("utime", "#{utime,jdbcType=BIGINT}");
        }
        
        if (record.getValid() != null) {
            VALUES("valid", "#{valid,jdbcType=BIT}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getEffective() != null) {
            VALUES("effective", "#{effective,jdbcType=BIT}");
        }
        
        if (record.getCreator() != null) {
            VALUES("creator", "#{creator,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentIdentityName() != null) {
            VALUES("current_identity_name", "#{currentIdentityName,jdbcType=VARCHAR}");
        }
        
        if (record.getTargetIdentityName() != null) {
            VALUES("target_identity_name", "#{targetIdentityName,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExample(PaperExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("name");
        SELECT("city_id");
        SELECT("city_name");
        SELECT("start_date");
        SELECT("end_date");
        SELECT("current_identity");
        SELECT("target_identity");
        SELECT("assessment_cycle");
        SELECT("start_push_id");
        SELECT("passed_push_id");
        SELECT("ctime");
        SELECT("utime");
        SELECT("valid");
        SELECT("status");
        SELECT("effective");
        SELECT("creator");
        SELECT("current_identity_name");
        SELECT("target_identity_name");
        FROM("paper");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Paper record = (Paper) parameter.get("record");
        PaperExample example = (PaperExample) parameter.get("example");
        
        BEGIN();
        UPDATE("paper");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getCityId() != null) {
            SET("city_id = #{record.cityId,jdbcType=INTEGER}");
        }
        
        if (record.getCityName() != null) {
            SET("city_name = #{record.cityName,jdbcType=VARCHAR}");
        }
        
        if (record.getStartDate() != null) {
            SET("start_date = #{record.startDate,jdbcType=BIGINT}");
        }
        
        if (record.getEndDate() != null) {
            SET("end_date = #{record.endDate,jdbcType=BIGINT}");
        }
        
        if (record.getCurrentIdentity() != null) {
            SET("current_identity = #{record.currentIdentity,jdbcType=BIGINT}");
        }
        
        if (record.getTargetIdentity() != null) {
            SET("target_identity = #{record.targetIdentity,jdbcType=BIGINT}");
        }
        
        if (record.getAssessmentCycle() != null) {
            SET("assessment_cycle = #{record.assessmentCycle,jdbcType=INTEGER}");
        }
        
        if (record.getStartPushId() != null) {
            SET("start_push_id = #{record.startPushId,jdbcType=BIGINT}");
        }
        
        if (record.getPassedPushId() != null) {
            SET("passed_push_id = #{record.passedPushId,jdbcType=BIGINT}");
        }
        
        if (record.getCtime() != null) {
            SET("ctime = #{record.ctime,jdbcType=BIGINT}");
        }
        
        if (record.getUtime() != null) {
            SET("utime = #{record.utime,jdbcType=BIGINT}");
        }
        
        if (record.getValid() != null) {
            SET("valid = #{record.valid,jdbcType=BIT}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getEffective() != null) {
            SET("effective = #{record.effective,jdbcType=BIT}");
        }
        
        if (record.getCreator() != null) {
            SET("creator = #{record.creator,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentIdentityName() != null) {
            SET("current_identity_name = #{record.currentIdentityName,jdbcType=VARCHAR}");
        }
        
        if (record.getTargetIdentityName() != null) {
            SET("target_identity_name = #{record.targetIdentityName,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("paper");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("name = #{record.name,jdbcType=VARCHAR}");
        SET("city_id = #{record.cityId,jdbcType=INTEGER}");
        SET("city_name = #{record.cityName,jdbcType=VARCHAR}");
        SET("start_date = #{record.startDate,jdbcType=BIGINT}");
        SET("end_date = #{record.endDate,jdbcType=BIGINT}");
        SET("current_identity = #{record.currentIdentity,jdbcType=BIGINT}");
        SET("target_identity = #{record.targetIdentity,jdbcType=BIGINT}");
        SET("assessment_cycle = #{record.assessmentCycle,jdbcType=INTEGER}");
        SET("start_push_id = #{record.startPushId,jdbcType=BIGINT}");
        SET("passed_push_id = #{record.passedPushId,jdbcType=BIGINT}");
        SET("ctime = #{record.ctime,jdbcType=BIGINT}");
        SET("utime = #{record.utime,jdbcType=BIGINT}");
        SET("valid = #{record.valid,jdbcType=BIT}");
        SET("status = #{record.status,jdbcType=INTEGER}");
        SET("effective = #{record.effective,jdbcType=BIT}");
        SET("creator = #{record.creator,jdbcType=VARCHAR}");
        SET("current_identity_name = #{record.currentIdentityName,jdbcType=VARCHAR}");
        SET("target_identity_name = #{record.targetIdentityName,jdbcType=VARCHAR}");
        
        PaperExample example = (PaperExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Paper record) {
        BEGIN();
        UPDATE("paper");
        
        if (record.getName() != null) {
            SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getCityId() != null) {
            SET("city_id = #{cityId,jdbcType=INTEGER}");
        }
        
        if (record.getCityName() != null) {
            SET("city_name = #{cityName,jdbcType=VARCHAR}");
        }
        
        if (record.getStartDate() != null) {
            SET("start_date = #{startDate,jdbcType=BIGINT}");
        }
        
        if (record.getEndDate() != null) {
            SET("end_date = #{endDate,jdbcType=BIGINT}");
        }
        
        if (record.getCurrentIdentity() != null) {
            SET("current_identity = #{currentIdentity,jdbcType=BIGINT}");
        }
        
        if (record.getTargetIdentity() != null) {
            SET("target_identity = #{targetIdentity,jdbcType=BIGINT}");
        }
        
        if (record.getAssessmentCycle() != null) {
            SET("assessment_cycle = #{assessmentCycle,jdbcType=INTEGER}");
        }
        
        if (record.getStartPushId() != null) {
            SET("start_push_id = #{startPushId,jdbcType=BIGINT}");
        }
        
        if (record.getPassedPushId() != null) {
            SET("passed_push_id = #{passedPushId,jdbcType=BIGINT}");
        }
        
        if (record.getCtime() != null) {
            SET("ctime = #{ctime,jdbcType=BIGINT}");
        }
        
        if (record.getUtime() != null) {
            SET("utime = #{utime,jdbcType=BIGINT}");
        }
        
        if (record.getValid() != null) {
            SET("valid = #{valid,jdbcType=BIT}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getEffective() != null) {
            SET("effective = #{effective,jdbcType=BIT}");
        }
        
        if (record.getCreator() != null) {
            SET("creator = #{creator,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentIdentityName() != null) {
            SET("current_identity_name = #{currentIdentityName,jdbcType=VARCHAR}");
        }
        
        if (record.getTargetIdentityName() != null) {
            SET("target_identity_name = #{targetIdentityName,jdbcType=VARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }

    protected void applyWhere(PaperExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}