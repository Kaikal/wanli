/**
 * @Copyright: 华为昆明数字经济学院-JAVA课程-高靖博 @Copy   All rights reserved.
 */
package com.ynu.wanli.user.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Date;

public class UserDriverExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserDriverExample() {
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
        public Criteria andDriverIdIsNull() {
            addCriterion("driverId is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNotNull() {
            addCriterion("driverId is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdLike(String value) {
            addCriterion("driverId like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotLike(String value) {
            addCriterion("driverId not like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdEqualTo(String value) {
            addCriterion("driverId =", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotEqualTo(String value) {
            addCriterion("driverId <>", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThan(String value) {
            addCriterion("driverId >", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThanOrEqualTo(String value) {
            addCriterion("driverId >=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThan(String value) {
            addCriterion("driverId <", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThanOrEqualTo(String value) {
            addCriterion("driverId <=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIn(List<String> values) {
            addCriterion("driverId in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotIn(List<String> values) {
            addCriterion("driverId not in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdBetween(String value1, String value2) {
            addCriterion("driverId between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotBetween(String value1, String value2) {
            addCriterion("driverId not between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNull() {
            addCriterion("driverName is null");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNotNull() {
            addCriterion("driverName is not null");
            return (Criteria) this;
        }

        public Criteria andDriverNameLike(String value) {
            addCriterion("driverName like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotLike(String value) {
            addCriterion("driverName not like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameEqualTo(String value) {
            addCriterion("driverName =", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotEqualTo(String value) {
            addCriterion("driverName <>", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThan(String value) {
            addCriterion("driverName >", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThanOrEqualTo(String value) {
            addCriterion("driverName >=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThan(String value) {
            addCriterion("driverName <", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThanOrEqualTo(String value) {
            addCriterion("driverName <=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameIn(List<String> values) {
            addCriterion("driverName in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotIn(List<String> values) {
            addCriterion("driverName not in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameBetween(String value1, String value2) {
            addCriterion("driverName between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotBetween(String value1, String value2) {
            addCriterion("driverName not between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverPicIsNull() {
            addCriterion("driverPic is null");
            return (Criteria) this;
        }

        public Criteria andDriverPicIsNotNull() {
            addCriterion("driverPic is not null");
            return (Criteria) this;
        }

        public Criteria andDriverPicLike(String value) {
            addCriterion("driverPic like", value, "driverPic");
            return (Criteria) this;
        }

        public Criteria andDriverPicNotLike(String value) {
            addCriterion("driverPic not like", value, "driverPic");
            return (Criteria) this;
        }

        public Criteria andDriverPicEqualTo(String value) {
            addCriterion("driverPic =", value, "driverPic");
            return (Criteria) this;
        }

        public Criteria andDriverPicNotEqualTo(String value) {
            addCriterion("driverPic <>", value, "driverPic");
            return (Criteria) this;
        }

        public Criteria andDriverPicGreaterThan(String value) {
            addCriterion("driverPic >", value, "driverPic");
            return (Criteria) this;
        }

        public Criteria andDriverPicGreaterThanOrEqualTo(String value) {
            addCriterion("driverPic >=", value, "driverPic");
            return (Criteria) this;
        }

        public Criteria andDriverPicLessThan(String value) {
            addCriterion("driverPic <", value, "driverPic");
            return (Criteria) this;
        }

        public Criteria andDriverPicLessThanOrEqualTo(String value) {
            addCriterion("driverPic <=", value, "driverPic");
            return (Criteria) this;
        }

        public Criteria andDriverPicIn(List<String> values) {
            addCriterion("driverPic in", values, "driverPic");
            return (Criteria) this;
        }

        public Criteria andDriverPicNotIn(List<String> values) {
            addCriterion("driverPic not in", values, "driverPic");
            return (Criteria) this;
        }

        public Criteria andDriverPicBetween(String value1, String value2) {
            addCriterion("driverPic between", value1, value2, "driverPic");
            return (Criteria) this;
        }

        public Criteria andDriverPicNotBetween(String value1, String value2) {
            addCriterion("driverPic not between", value1, value2, "driverPic");
            return (Criteria) this;
        }

        public Criteria andDriverSexIsNull() {
            addCriterion("driverSex is null");
            return (Criteria) this;
        }

        public Criteria andDriverSexIsNotNull() {
            addCriterion("driverSex is not null");
            return (Criteria) this;
        }

        public Criteria andDriverSexLike(String value) {
            addCriterion("driverSex like", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexNotLike(String value) {
            addCriterion("driverSex not like", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexEqualTo(String value) {
            addCriterion("driverSex =", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexNotEqualTo(String value) {
            addCriterion("driverSex <>", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexGreaterThan(String value) {
            addCriterion("driverSex >", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexGreaterThanOrEqualTo(String value) {
            addCriterion("driverSex >=", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexLessThan(String value) {
            addCriterion("driverSex <", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexLessThanOrEqualTo(String value) {
            addCriterion("driverSex <=", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexIn(List<String> values) {
            addCriterion("driverSex in", values, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexNotIn(List<String> values) {
            addCriterion("driverSex not in", values, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexBetween(String value1, String value2) {
            addCriterion("driverSex between", value1, value2, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexNotBetween(String value1, String value2) {
            addCriterion("driverSex not between", value1, value2, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverBirthIsNull() {
            addCriterion("driverBirth is null");
            return (Criteria) this;
        }

        public Criteria andDriverBirthIsNotNull() {
            addCriterion("driverBirth is not null");
            return (Criteria) this;
        }

        public Criteria andDriverBirthEqualTo(Date value) {
            addCriterionForJDBCDate("driverBirth =", value, "driverBirth");
            return (Criteria) this;
        }

        public Criteria andDriverBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("driverBirth <>", value, "driverBirth");
            return (Criteria) this;
        }

        public Criteria andDriverBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("driverBirth >", value, "driverBirth");
            return (Criteria) this;
        }

        public Criteria andDriverBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("driverBirth >=", value, "driverBirth");
            return (Criteria) this;
        }

        public Criteria andDriverBirthLessThan(Date value) {
            addCriterionForJDBCDate("driverBirth <", value, "driverBirth");
            return (Criteria) this;
        }

        public Criteria andDriverBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("driverBirth <=", value, "driverBirth");
            return (Criteria) this;
        }

        public Criteria andDriverBirthIn(List<Date> values) {
            addCriterionForJDBCDate("driverBirth in", values, "driverBirth");
            return (Criteria) this;
        }

        public Criteria andDriverBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("driverBirth not in", values, "driverBirth");
            return (Criteria) this;
        }

        public Criteria andDriverBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("driverBirth between", value1, value2, "driverBirth");
            return (Criteria) this;
        }

        public Criteria andDriverBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("driverBirth not between", value1, value2, "driverBirth");
            return (Criteria) this;
        }

        public Criteria andDriverStateIsNull() {
            addCriterion("driverState is null");
            return (Criteria) this;
        }

        public Criteria andDriverStateIsNotNull() {
            addCriterion("driverState is not null");
            return (Criteria) this;
        }

        public Criteria andDriverStateLike(String value) {
            addCriterion("driverState like", value, "driverState");
            return (Criteria) this;
        }

        public Criteria andDriverStateNotLike(String value) {
            addCriterion("driverState not like", value, "driverState");
            return (Criteria) this;
        }

        public Criteria andDriverStateEqualTo(String value) {
            addCriterion("driverState =", value, "driverState");
            return (Criteria) this;
        }

        public Criteria andDriverStateNotEqualTo(String value) {
            addCriterion("driverState <>", value, "driverState");
            return (Criteria) this;
        }

        public Criteria andDriverStateGreaterThan(String value) {
            addCriterion("driverState >", value, "driverState");
            return (Criteria) this;
        }

        public Criteria andDriverStateGreaterThanOrEqualTo(String value) {
            addCriterion("driverState >=", value, "driverState");
            return (Criteria) this;
        }

        public Criteria andDriverStateLessThan(String value) {
            addCriterion("driverState <", value, "driverState");
            return (Criteria) this;
        }

        public Criteria andDriverStateLessThanOrEqualTo(String value) {
            addCriterion("driverState <=", value, "driverState");
            return (Criteria) this;
        }

        public Criteria andDriverStateIn(List<String> values) {
            addCriterion("driverState in", values, "driverState");
            return (Criteria) this;
        }

        public Criteria andDriverStateNotIn(List<String> values) {
            addCriterion("driverState not in", values, "driverState");
            return (Criteria) this;
        }

        public Criteria andDriverStateBetween(String value1, String value2) {
            addCriterion("driverState between", value1, value2, "driverState");
            return (Criteria) this;
        }

        public Criteria andDriverStateNotBetween(String value1, String value2) {
            addCriterion("driverState not between", value1, value2, "driverState");
            return (Criteria) this;
        }

        public Criteria andDriverCreateTimeIsNull() {
            addCriterion("driverCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andDriverCreateTimeIsNotNull() {
            addCriterion("driverCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andDriverCreateTimeEqualTo(Date value) {
            addCriterion("driverCreateTime =", value, "driverCreateTime");
            return (Criteria) this;
        }

        public Criteria andDriverCreateTimeNotEqualTo(Date value) {
            addCriterion("driverCreateTime <>", value, "driverCreateTime");
            return (Criteria) this;
        }

        public Criteria andDriverCreateTimeGreaterThan(Date value) {
            addCriterion("driverCreateTime >", value, "driverCreateTime");
            return (Criteria) this;
        }

        public Criteria andDriverCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("driverCreateTime >=", value, "driverCreateTime");
            return (Criteria) this;
        }

        public Criteria andDriverCreateTimeLessThan(Date value) {
            addCriterion("driverCreateTime <", value, "driverCreateTime");
            return (Criteria) this;
        }

        public Criteria andDriverCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("driverCreateTime <=", value, "driverCreateTime");
            return (Criteria) this;
        }

        public Criteria andDriverCreateTimeIn(List<Date> values) {
            addCriterion("driverCreateTime in", values, "driverCreateTime");
            return (Criteria) this;
        }

        public Criteria andDriverCreateTimeNotIn(List<Date> values) {
            addCriterion("driverCreateTime not in", values, "driverCreateTime");
            return (Criteria) this;
        }

        public Criteria andDriverCreateTimeBetween(Date value1, Date value2) {
            addCriterion("driverCreateTime between", value1, value2, "driverCreateTime");
            return (Criteria) this;
        }

        public Criteria andDriverCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("driverCreateTime not between", value1, value2, "driverCreateTime");
            return (Criteria) this;
        }

        public Criteria andDriverUpdateTimeIsNull() {
            addCriterion("driverUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andDriverUpdateTimeIsNotNull() {
            addCriterion("driverUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andDriverUpdateTimeEqualTo(Date value) {
            addCriterion("driverUpdateTime =", value, "driverUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDriverUpdateTimeNotEqualTo(Date value) {
            addCriterion("driverUpdateTime <>", value, "driverUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDriverUpdateTimeGreaterThan(Date value) {
            addCriterion("driverUpdateTime >", value, "driverUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDriverUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("driverUpdateTime >=", value, "driverUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDriverUpdateTimeLessThan(Date value) {
            addCriterion("driverUpdateTime <", value, "driverUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDriverUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("driverUpdateTime <=", value, "driverUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDriverUpdateTimeIn(List<Date> values) {
            addCriterion("driverUpdateTime in", values, "driverUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDriverUpdateTimeNotIn(List<Date> values) {
            addCriterion("driverUpdateTime not in", values, "driverUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDriverUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("driverUpdateTime between", value1, value2, "driverUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDriverUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("driverUpdateTime not between", value1, value2, "driverUpdateTime");
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
