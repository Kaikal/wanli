/**
 * @Copyright: 华为昆明数字经济学院-JAVA课程-高靖博 @Copy   All rights reserved.
 */
package com.ynu.wanli.user.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Date;

public class UserContExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserContExample() {
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
        public Criteria andContIdIsNull() {
            addCriterion("contId is null");
            return (Criteria) this;
        }

        public Criteria andContIdIsNotNull() {
            addCriterion("contId is not null");
            return (Criteria) this;
        }

        public Criteria andContIdEqualTo(Integer value) {
            addCriterion("contId =", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdNotEqualTo(Integer value) {
            addCriterion("contId <>", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdGreaterThan(Integer value) {
            addCriterion("contId >", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("contId >=", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdLessThan(Integer value) {
            addCriterion("contId <", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdLessThanOrEqualTo(Integer value) {
            addCriterion("contId <=", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdIn(List<Integer> values) {
            addCriterion("contId in", values, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdNotIn(List<Integer> values) {
            addCriterion("contId not in", values, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdBetween(Integer value1, Integer value2) {
            addCriterion("contId between", value1, value2, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdNotBetween(Integer value1, Integer value2) {
            addCriterion("contId not between", value1, value2, "contId");
            return (Criteria) this;
        }

        public Criteria andContUserIsNull() {
            addCriterion("contUser is null");
            return (Criteria) this;
        }

        public Criteria andContUserIsNotNull() {
            addCriterion("contUser is not null");
            return (Criteria) this;
        }

        public Criteria andContUserLike(String value) {
            addCriterion("contUser like", value, "contUser");
            return (Criteria) this;
        }

        public Criteria andContUserNotLike(String value) {
            addCriterion("contUser not like", value, "contUser");
            return (Criteria) this;
        }

        public Criteria andContUserEqualTo(String value) {
            addCriterion("contUser =", value, "contUser");
            return (Criteria) this;
        }

        public Criteria andContUserNotEqualTo(String value) {
            addCriterion("contUser <>", value, "contUser");
            return (Criteria) this;
        }

        public Criteria andContUserGreaterThan(String value) {
            addCriterion("contUser >", value, "contUser");
            return (Criteria) this;
        }

        public Criteria andContUserGreaterThanOrEqualTo(String value) {
            addCriterion("contUser >=", value, "contUser");
            return (Criteria) this;
        }

        public Criteria andContUserLessThan(String value) {
            addCriterion("contUser <", value, "contUser");
            return (Criteria) this;
        }

        public Criteria andContUserLessThanOrEqualTo(String value) {
            addCriterion("contUser <=", value, "contUser");
            return (Criteria) this;
        }

        public Criteria andContUserIn(List<String> values) {
            addCriterion("contUser in", values, "contUser");
            return (Criteria) this;
        }

        public Criteria andContUserNotIn(List<String> values) {
            addCriterion("contUser not in", values, "contUser");
            return (Criteria) this;
        }

        public Criteria andContUserBetween(String value1, String value2) {
            addCriterion("contUser between", value1, value2, "contUser");
            return (Criteria) this;
        }

        public Criteria andContUserNotBetween(String value1, String value2) {
            addCriterion("contUser not between", value1, value2, "contUser");
            return (Criteria) this;
        }

        public Criteria andContNameIsNull() {
            addCriterion("contName is null");
            return (Criteria) this;
        }

        public Criteria andContNameIsNotNull() {
            addCriterion("contName is not null");
            return (Criteria) this;
        }

        public Criteria andContNameLike(String value) {
            addCriterion("contName like", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotLike(String value) {
            addCriterion("contName not like", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameEqualTo(String value) {
            addCriterion("contName =", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotEqualTo(String value) {
            addCriterion("contName <>", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameGreaterThan(String value) {
            addCriterion("contName >", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameGreaterThanOrEqualTo(String value) {
            addCriterion("contName >=", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameLessThan(String value) {
            addCriterion("contName <", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameLessThanOrEqualTo(String value) {
            addCriterion("contName <=", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameIn(List<String> values) {
            addCriterion("contName in", values, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotIn(List<String> values) {
            addCriterion("contName not in", values, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameBetween(String value1, String value2) {
            addCriterion("contName between", value1, value2, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotBetween(String value1, String value2) {
            addCriterion("contName not between", value1, value2, "contName");
            return (Criteria) this;
        }

        public Criteria andContPhoneIsNull() {
            addCriterion("contPhone is null");
            return (Criteria) this;
        }

        public Criteria andContPhoneIsNotNull() {
            addCriterion("contPhone is not null");
            return (Criteria) this;
        }

        public Criteria andContPhoneLike(String value) {
            addCriterion("contPhone like", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneNotLike(String value) {
            addCriterion("contPhone not like", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneEqualTo(String value) {
            addCriterion("contPhone =", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneNotEqualTo(String value) {
            addCriterion("contPhone <>", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneGreaterThan(String value) {
            addCriterion("contPhone >", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contPhone >=", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneLessThan(String value) {
            addCriterion("contPhone <", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneLessThanOrEqualTo(String value) {
            addCriterion("contPhone <=", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneIn(List<String> values) {
            addCriterion("contPhone in", values, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneNotIn(List<String> values) {
            addCriterion("contPhone not in", values, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneBetween(String value1, String value2) {
            addCriterion("contPhone between", value1, value2, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneNotBetween(String value1, String value2) {
            addCriterion("contPhone not between", value1, value2, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContEmailIsNull() {
            addCriterion("contEmail is null");
            return (Criteria) this;
        }

        public Criteria andContEmailIsNotNull() {
            addCriterion("contEmail is not null");
            return (Criteria) this;
        }

        public Criteria andContEmailLike(String value) {
            addCriterion("contEmail like", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailNotLike(String value) {
            addCriterion("contEmail not like", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailEqualTo(String value) {
            addCriterion("contEmail =", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailNotEqualTo(String value) {
            addCriterion("contEmail <>", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailGreaterThan(String value) {
            addCriterion("contEmail >", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailGreaterThanOrEqualTo(String value) {
            addCriterion("contEmail >=", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailLessThan(String value) {
            addCriterion("contEmail <", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailLessThanOrEqualTo(String value) {
            addCriterion("contEmail <=", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailIn(List<String> values) {
            addCriterion("contEmail in", values, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailNotIn(List<String> values) {
            addCriterion("contEmail not in", values, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailBetween(String value1, String value2) {
            addCriterion("contEmail between", value1, value2, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailNotBetween(String value1, String value2) {
            addCriterion("contEmail not between", value1, value2, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContInsertTimeIsNull() {
            addCriterion("contInsertTime is null");
            return (Criteria) this;
        }

        public Criteria andContInsertTimeIsNotNull() {
            addCriterion("contInsertTime is not null");
            return (Criteria) this;
        }

        public Criteria andContInsertTimeEqualTo(Date value) {
            addCriterion("contInsertTime =", value, "contInsertTime");
            return (Criteria) this;
        }

        public Criteria andContInsertTimeNotEqualTo(Date value) {
            addCriterion("contInsertTime <>", value, "contInsertTime");
            return (Criteria) this;
        }

        public Criteria andContInsertTimeGreaterThan(Date value) {
            addCriterion("contInsertTime >", value, "contInsertTime");
            return (Criteria) this;
        }

        public Criteria andContInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("contInsertTime >=", value, "contInsertTime");
            return (Criteria) this;
        }

        public Criteria andContInsertTimeLessThan(Date value) {
            addCriterion("contInsertTime <", value, "contInsertTime");
            return (Criteria) this;
        }

        public Criteria andContInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("contInsertTime <=", value, "contInsertTime");
            return (Criteria) this;
        }

        public Criteria andContInsertTimeIn(List<Date> values) {
            addCriterion("contInsertTime in", values, "contInsertTime");
            return (Criteria) this;
        }

        public Criteria andContInsertTimeNotIn(List<Date> values) {
            addCriterion("contInsertTime not in", values, "contInsertTime");
            return (Criteria) this;
        }

        public Criteria andContInsertTimeBetween(Date value1, Date value2) {
            addCriterion("contInsertTime between", value1, value2, "contInsertTime");
            return (Criteria) this;
        }

        public Criteria andContInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("contInsertTime not between", value1, value2, "contInsertTime");
            return (Criteria) this;
        }

        public Criteria andContUpdateTimeIsNull() {
            addCriterion("contUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andContUpdateTimeIsNotNull() {
            addCriterion("contUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andContUpdateTimeEqualTo(Date value) {
            addCriterion("contUpdateTime =", value, "contUpdateTime");
            return (Criteria) this;
        }

        public Criteria andContUpdateTimeNotEqualTo(Date value) {
            addCriterion("contUpdateTime <>", value, "contUpdateTime");
            return (Criteria) this;
        }

        public Criteria andContUpdateTimeGreaterThan(Date value) {
            addCriterion("contUpdateTime >", value, "contUpdateTime");
            return (Criteria) this;
        }

        public Criteria andContUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("contUpdateTime >=", value, "contUpdateTime");
            return (Criteria) this;
        }

        public Criteria andContUpdateTimeLessThan(Date value) {
            addCriterion("contUpdateTime <", value, "contUpdateTime");
            return (Criteria) this;
        }

        public Criteria andContUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("contUpdateTime <=", value, "contUpdateTime");
            return (Criteria) this;
        }

        public Criteria andContUpdateTimeIn(List<Date> values) {
            addCriterion("contUpdateTime in", values, "contUpdateTime");
            return (Criteria) this;
        }

        public Criteria andContUpdateTimeNotIn(List<Date> values) {
            addCriterion("contUpdateTime not in", values, "contUpdateTime");
            return (Criteria) this;
        }

        public Criteria andContUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("contUpdateTime between", value1, value2, "contUpdateTime");
            return (Criteria) this;
        }

        public Criteria andContUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("contUpdateTime not between", value1, value2, "contUpdateTime");
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
