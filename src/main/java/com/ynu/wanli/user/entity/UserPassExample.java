/**
 * @Copyright: 华为昆明数字经济学院-JAVA课程-高靖博 @Copy   All rights reserved.
 */
package com.ynu.wanli.user.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Date;

public class UserPassExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPassExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }
        public Criteria andPassIdIsNull() {
            addCriterion("passId is null");
            return (Criteria) this;
        }

        public Criteria andPassIdIsNotNull() {
            addCriterion("passId is not null");
            return (Criteria) this;
        }

        public Criteria andPassIdLike(String value) {
            addCriterion("passId like", value, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdNotLike(String value) {
            addCriterion("passId not like", value, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdEqualTo(String value) {
            addCriterion("passId =", value, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdNotEqualTo(String value) {
            addCriterion("passId <>", value, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdGreaterThan(String value) {
            addCriterion("passId >", value, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdGreaterThanOrEqualTo(String value) {
            addCriterion("passId >=", value, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdLessThan(String value) {
            addCriterion("passId <", value, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdLessThanOrEqualTo(String value) {
            addCriterion("passId <=", value, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdIn(List<String> values) {
            addCriterion("passId in", values, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdNotIn(List<String> values) {
            addCriterion("passId not in", values, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdBetween(String value1, String value2) {
            addCriterion("passId between", value1, value2, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdNotBetween(String value1, String value2) {
            addCriterion("passId not between", value1, value2, "passId");
            return (Criteria) this;
        }

        public Criteria andPassUserIsNull() {
            addCriterion("passUser is null");
            return (Criteria) this;
        }

        public Criteria andPassUserIsNotNull() {
            addCriterion("passUser is not null");
            return (Criteria) this;
        }

        public Criteria andPassUserLike(String value) {
            addCriterion("passUser like", value, "passUser");
            return (Criteria) this;
        }

        public Criteria andPassUserNotLike(String value) {
            addCriterion("passUser not like", value, "passUser");
            return (Criteria) this;
        }

        public Criteria andPassUserEqualTo(String value) {
            addCriterion("passUser =", value, "passUser");
            return (Criteria) this;
        }

        public Criteria andPassUserNotEqualTo(String value) {
            addCriterion("passUser <>", value, "passUser");
            return (Criteria) this;
        }

        public Criteria andPassUserGreaterThan(String value) {
            addCriterion("passUser >", value, "passUser");
            return (Criteria) this;
        }

        public Criteria andPassUserGreaterThanOrEqualTo(String value) {
            addCriterion("passUser >=", value, "passUser");
            return (Criteria) this;
        }

        public Criteria andPassUserLessThan(String value) {
            addCriterion("passUser <", value, "passUser");
            return (Criteria) this;
        }

        public Criteria andPassUserLessThanOrEqualTo(String value) {
            addCriterion("passUser <=", value, "passUser");
            return (Criteria) this;
        }

        public Criteria andPassUserIn(List<String> values) {
            addCriterion("passUser in", values, "passUser");
            return (Criteria) this;
        }

        public Criteria andPassUserNotIn(List<String> values) {
            addCriterion("passUser not in", values, "passUser");
            return (Criteria) this;
        }

        public Criteria andPassUserBetween(String value1, String value2) {
            addCriterion("passUser between", value1, value2, "passUser");
            return (Criteria) this;
        }

        public Criteria andPassUserNotBetween(String value1, String value2) {
            addCriterion("passUser not between", value1, value2, "passUser");
            return (Criteria) this;
        }

        public Criteria andPassNameIsNull() {
            addCriterion("passName is null");
            return (Criteria) this;
        }

        public Criteria andPassNameIsNotNull() {
            addCriterion("passName is not null");
            return (Criteria) this;
        }

        public Criteria andPassNameLike(String value) {
            addCriterion("passName like", value, "passName");
            return (Criteria) this;
        }

        public Criteria andPassNameNotLike(String value) {
            addCriterion("passName not like", value, "passName");
            return (Criteria) this;
        }

        public Criteria andPassNameEqualTo(String value) {
            addCriterion("passName =", value, "passName");
            return (Criteria) this;
        }

        public Criteria andPassNameNotEqualTo(String value) {
            addCriterion("passName <>", value, "passName");
            return (Criteria) this;
        }

        public Criteria andPassNameGreaterThan(String value) {
            addCriterion("passName >", value, "passName");
            return (Criteria) this;
        }

        public Criteria andPassNameGreaterThanOrEqualTo(String value) {
            addCriterion("passName >=", value, "passName");
            return (Criteria) this;
        }

        public Criteria andPassNameLessThan(String value) {
            addCriterion("passName <", value, "passName");
            return (Criteria) this;
        }

        public Criteria andPassNameLessThanOrEqualTo(String value) {
            addCriterion("passName <=", value, "passName");
            return (Criteria) this;
        }

        public Criteria andPassNameIn(List<String> values) {
            addCriterion("passName in", values, "passName");
            return (Criteria) this;
        }

        public Criteria andPassNameNotIn(List<String> values) {
            addCriterion("passName not in", values, "passName");
            return (Criteria) this;
        }

        public Criteria andPassNameBetween(String value1, String value2) {
            addCriterion("passName between", value1, value2, "passName");
            return (Criteria) this;
        }

        public Criteria andPassNameNotBetween(String value1, String value2) {
            addCriterion("passName not between", value1, value2, "passName");
            return (Criteria) this;
        }

        public Criteria andPassPhoneIsNull() {
            addCriterion("passPhone is null");
            return (Criteria) this;
        }

        public Criteria andPassPhoneIsNotNull() {
            addCriterion("passPhone is not null");
            return (Criteria) this;
        }

        public Criteria andPassPhoneLike(String value) {
            addCriterion("passPhone like", value, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassPhoneNotLike(String value) {
            addCriterion("passPhone not like", value, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassPhoneEqualTo(String value) {
            addCriterion("passPhone =", value, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassPhoneNotEqualTo(String value) {
            addCriterion("passPhone <>", value, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassPhoneGreaterThan(String value) {
            addCriterion("passPhone >", value, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("passPhone >=", value, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassPhoneLessThan(String value) {
            addCriterion("passPhone <", value, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassPhoneLessThanOrEqualTo(String value) {
            addCriterion("passPhone <=", value, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassPhoneIn(List<String> values) {
            addCriterion("passPhone in", values, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassPhoneNotIn(List<String> values) {
            addCriterion("passPhone not in", values, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassPhoneBetween(String value1, String value2) {
            addCriterion("passPhone between", value1, value2, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassPhoneNotBetween(String value1, String value2) {
            addCriterion("passPhone not between", value1, value2, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassCodeIsNull() {
            addCriterion("passCode is null");
            return (Criteria) this;
        }

        public Criteria andPassCodeIsNotNull() {
            addCriterion("passCode is not null");
            return (Criteria) this;
        }

        public Criteria andPassCodeLike(String value) {
            addCriterion("passCode like", value, "passCode");
            return (Criteria) this;
        }

        public Criteria andPassCodeNotLike(String value) {
            addCriterion("passCode not like", value, "passCode");
            return (Criteria) this;
        }

        public Criteria andPassCodeEqualTo(String value) {
            addCriterion("passCode =", value, "passCode");
            return (Criteria) this;
        }

        public Criteria andPassCodeNotEqualTo(String value) {
            addCriterion("passCode <>", value, "passCode");
            return (Criteria) this;
        }

        public Criteria andPassCodeGreaterThan(String value) {
            addCriterion("passCode >", value, "passCode");
            return (Criteria) this;
        }

        public Criteria andPassCodeGreaterThanOrEqualTo(String value) {
            addCriterion("passCode >=", value, "passCode");
            return (Criteria) this;
        }

        public Criteria andPassCodeLessThan(String value) {
            addCriterion("passCode <", value, "passCode");
            return (Criteria) this;
        }

        public Criteria andPassCodeLessThanOrEqualTo(String value) {
            addCriterion("passCode <=", value, "passCode");
            return (Criteria) this;
        }

        public Criteria andPassCodeIn(List<String> values) {
            addCriterion("passCode in", values, "passCode");
            return (Criteria) this;
        }

        public Criteria andPassCodeNotIn(List<String> values) {
            addCriterion("passCode not in", values, "passCode");
            return (Criteria) this;
        }

        public Criteria andPassCodeBetween(String value1, String value2) {
            addCriterion("passCode between", value1, value2, "passCode");
            return (Criteria) this;
        }

        public Criteria andPassCodeNotBetween(String value1, String value2) {
            addCriterion("passCode not between", value1, value2, "passCode");
            return (Criteria) this;
        }

        public Criteria andPassSexIsNull() {
            addCriterion("passSex is null");
            return (Criteria) this;
        }

        public Criteria andPassSexIsNotNull() {
            addCriterion("passSex is not null");
            return (Criteria) this;
        }

        public Criteria andPassSexLike(String value) {
            addCriterion("passSex like", value, "passSex");
            return (Criteria) this;
        }

        public Criteria andPassSexNotLike(String value) {
            addCriterion("passSex not like", value, "passSex");
            return (Criteria) this;
        }

        public Criteria andPassSexEqualTo(String value) {
            addCriterion("passSex =", value, "passSex");
            return (Criteria) this;
        }

        public Criteria andPassSexNotEqualTo(String value) {
            addCriterion("passSex <>", value, "passSex");
            return (Criteria) this;
        }

        public Criteria andPassSexGreaterThan(String value) {
            addCriterion("passSex >", value, "passSex");
            return (Criteria) this;
        }

        public Criteria andPassSexGreaterThanOrEqualTo(String value) {
            addCriterion("passSex >=", value, "passSex");
            return (Criteria) this;
        }

        public Criteria andPassSexLessThan(String value) {
            addCriterion("passSex <", value, "passSex");
            return (Criteria) this;
        }

        public Criteria andPassSexLessThanOrEqualTo(String value) {
            addCriterion("passSex <=", value, "passSex");
            return (Criteria) this;
        }

        public Criteria andPassSexIn(List<String> values) {
            addCriterion("passSex in", values, "passSex");
            return (Criteria) this;
        }

        public Criteria andPassSexNotIn(List<String> values) {
            addCriterion("passSex not in", values, "passSex");
            return (Criteria) this;
        }

        public Criteria andPassSexBetween(String value1, String value2) {
            addCriterion("passSex between", value1, value2, "passSex");
            return (Criteria) this;
        }

        public Criteria andPassSexNotBetween(String value1, String value2) {
            addCriterion("passSex not between", value1, value2, "passSex");
            return (Criteria) this;
        }

        public Criteria andPassInsertTimeIsNull() {
            addCriterion("passInsertTime is null");
            return (Criteria) this;
        }

        public Criteria andPassInsertTimeIsNotNull() {
            addCriterion("passInsertTime is not null");
            return (Criteria) this;
        }

        public Criteria andPassInsertTimeEqualTo(Date value) {
            addCriterion("passInsertTime =", value, "passInsertTime");
            return (Criteria) this;
        }

        public Criteria andPassInsertTimeNotEqualTo(Date value) {
            addCriterion("passInsertTime <>", value, "passInsertTime");
            return (Criteria) this;
        }

        public Criteria andPassInsertTimeGreaterThan(Date value) {
            addCriterion("passInsertTime >", value, "passInsertTime");
            return (Criteria) this;
        }

        public Criteria andPassInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("passInsertTime >=", value, "passInsertTime");
            return (Criteria) this;
        }

        public Criteria andPassInsertTimeLessThan(Date value) {
            addCriterion("passInsertTime <", value, "passInsertTime");
            return (Criteria) this;
        }

        public Criteria andPassInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("passInsertTime <=", value, "passInsertTime");
            return (Criteria) this;
        }

        public Criteria andPassInsertTimeIn(List<Date> values) {
            addCriterion("passInsertTime in", values, "passInsertTime");
            return (Criteria) this;
        }

        public Criteria andPassInsertTimeNotIn(List<Date> values) {
            addCriterion("passInsertTime not in", values, "passInsertTime");
            return (Criteria) this;
        }

        public Criteria andPassInsertTimeBetween(Date value1, Date value2) {
            addCriterion("passInsertTime between", value1, value2, "passInsertTime");
            return (Criteria) this;
        }

        public Criteria andPassInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("passInsertTime not between", value1, value2, "passInsertTime");
            return (Criteria) this;
        }

        public Criteria andPassUpdateTimeIsNull() {
            addCriterion("passUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andPassUpdateTimeIsNotNull() {
            addCriterion("passUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andPassUpdateTimeEqualTo(Date value) {
            addCriterion("passUpdateTime =", value, "passUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPassUpdateTimeNotEqualTo(Date value) {
            addCriterion("passUpdateTime <>", value, "passUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPassUpdateTimeGreaterThan(Date value) {
            addCriterion("passUpdateTime >", value, "passUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPassUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("passUpdateTime >=", value, "passUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPassUpdateTimeLessThan(Date value) {
            addCriterion("passUpdateTime <", value, "passUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPassUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("passUpdateTime <=", value, "passUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPassUpdateTimeIn(List<Date> values) {
            addCriterion("passUpdateTime in", values, "passUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPassUpdateTimeNotIn(List<Date> values) {
            addCriterion("passUpdateTime not in", values, "passUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPassUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("passUpdateTime between", value1, value2, "passUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPassUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("passUpdateTime not between", value1, value2, "passUpdateTime");
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
