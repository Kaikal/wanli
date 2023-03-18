/**
 * @Copyright: 华为昆明数字经济学院-JAVA课程-高靖博 @Copy   All rights reserved.
 */
package com.ynu.wanli.user.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Date;

public class UserAccountExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAccountExample() {
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
        public Criteria andUserMessIdIsNull() {
            addCriterion("userMessId is null");
            return (Criteria) this;
        }

        public Criteria andUserMessIdIsNotNull() {
            addCriterion("userMessId is not null");
            return (Criteria) this;
        }

        public Criteria andUserMessIdEqualTo(Integer value) {
            addCriterion("userMessId =", value, "userMessId");
            return (Criteria) this;
        }

        public Criteria andUserMessIdNotEqualTo(Integer value) {
            addCriterion("userMessId <>", value, "userMessId");
            return (Criteria) this;
        }

        public Criteria andUserMessIdGreaterThan(Integer value) {
            addCriterion("userMessId >", value, "userMessId");
            return (Criteria) this;
        }

        public Criteria andUserMessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userMessId >=", value, "userMessId");
            return (Criteria) this;
        }

        public Criteria andUserMessIdLessThan(Integer value) {
            addCriterion("userMessId <", value, "userMessId");
            return (Criteria) this;
        }

        public Criteria andUserMessIdLessThanOrEqualTo(Integer value) {
            addCriterion("userMessId <=", value, "userMessId");
            return (Criteria) this;
        }

        public Criteria andUserMessIdIn(List<Integer> values) {
            addCriterion("userMessId in", values, "userMessId");
            return (Criteria) this;
        }

        public Criteria andUserMessIdNotIn(List<Integer> values) {
            addCriterion("userMessId not in", values, "userMessId");
            return (Criteria) this;
        }

        public Criteria andUserMessIdBetween(Integer value1, Integer value2) {
            addCriterion("userMessId between", value1, value2, "userMessId");
            return (Criteria) this;
        }

        public Criteria andUserMessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userMessId not between", value1, value2, "userMessId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("userId like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("userId not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("userId =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("userId <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("userId >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("userId <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("userId in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("userId not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserMessStateIconIsNull() {
            addCriterion("userMessStateIcon is null");
            return (Criteria) this;
        }

        public Criteria andUserMessStateIconIsNotNull() {
            addCriterion("userMessStateIcon is not null");
            return (Criteria) this;
        }

        public Criteria andUserMessStateIconLike(String value) {
            addCriterion("userMessStateIcon like", value, "userMessStateIcon");
            return (Criteria) this;
        }

        public Criteria andUserMessStateIconNotLike(String value) {
            addCriterion("userMessStateIcon not like", value, "userMessStateIcon");
            return (Criteria) this;
        }

        public Criteria andUserMessStateIconEqualTo(String value) {
            addCriterion("userMessStateIcon =", value, "userMessStateIcon");
            return (Criteria) this;
        }

        public Criteria andUserMessStateIconNotEqualTo(String value) {
            addCriterion("userMessStateIcon <>", value, "userMessStateIcon");
            return (Criteria) this;
        }

        public Criteria andUserMessStateIconGreaterThan(String value) {
            addCriterion("userMessStateIcon >", value, "userMessStateIcon");
            return (Criteria) this;
        }

        public Criteria andUserMessStateIconGreaterThanOrEqualTo(String value) {
            addCriterion("userMessStateIcon >=", value, "userMessStateIcon");
            return (Criteria) this;
        }

        public Criteria andUserMessStateIconLessThan(String value) {
            addCriterion("userMessStateIcon <", value, "userMessStateIcon");
            return (Criteria) this;
        }

        public Criteria andUserMessStateIconLessThanOrEqualTo(String value) {
            addCriterion("userMessStateIcon <=", value, "userMessStateIcon");
            return (Criteria) this;
        }

        public Criteria andUserMessStateIconIn(List<String> values) {
            addCriterion("userMessStateIcon in", values, "userMessStateIcon");
            return (Criteria) this;
        }

        public Criteria andUserMessStateIconNotIn(List<String> values) {
            addCriterion("userMessStateIcon not in", values, "userMessStateIcon");
            return (Criteria) this;
        }

        public Criteria andUserMessStateIconBetween(String value1, String value2) {
            addCriterion("userMessStateIcon between", value1, value2, "userMessStateIcon");
            return (Criteria) this;
        }

        public Criteria andUserMessStateIconNotBetween(String value1, String value2) {
            addCriterion("userMessStateIcon not between", value1, value2, "userMessStateIcon");
            return (Criteria) this;
        }

        public Criteria andUserMessStateIsNull() {
            addCriterion("userMessState is null");
            return (Criteria) this;
        }

        public Criteria andUserMessStateIsNotNull() {
            addCriterion("userMessState is not null");
            return (Criteria) this;
        }

        public Criteria andUserMessStateLike(String value) {
            addCriterion("userMessState like", value, "userMessState");
            return (Criteria) this;
        }

        public Criteria andUserMessStateNotLike(String value) {
            addCriterion("userMessState not like", value, "userMessState");
            return (Criteria) this;
        }

        public Criteria andUserMessStateEqualTo(String value) {
            addCriterion("userMessState =", value, "userMessState");
            return (Criteria) this;
        }

        public Criteria andUserMessStateNotEqualTo(String value) {
            addCriterion("userMessState <>", value, "userMessState");
            return (Criteria) this;
        }

        public Criteria andUserMessStateGreaterThan(String value) {
            addCriterion("userMessState >", value, "userMessState");
            return (Criteria) this;
        }

        public Criteria andUserMessStateGreaterThanOrEqualTo(String value) {
            addCriterion("userMessState >=", value, "userMessState");
            return (Criteria) this;
        }

        public Criteria andUserMessStateLessThan(String value) {
            addCriterion("userMessState <", value, "userMessState");
            return (Criteria) this;
        }

        public Criteria andUserMessStateLessThanOrEqualTo(String value) {
            addCriterion("userMessState <=", value, "userMessState");
            return (Criteria) this;
        }

        public Criteria andUserMessStateIn(List<String> values) {
            addCriterion("userMessState in", values, "userMessState");
            return (Criteria) this;
        }

        public Criteria andUserMessStateNotIn(List<String> values) {
            addCriterion("userMessState not in", values, "userMessState");
            return (Criteria) this;
        }

        public Criteria andUserMessStateBetween(String value1, String value2) {
            addCriterion("userMessState between", value1, value2, "userMessState");
            return (Criteria) this;
        }

        public Criteria andUserMessStateNotBetween(String value1, String value2) {
            addCriterion("userMessState not between", value1, value2, "userMessState");
            return (Criteria) this;
        }

        public Criteria andUserTitleIsNull() {
            addCriterion("userTitle is null");
            return (Criteria) this;
        }

        public Criteria andUserTitleIsNotNull() {
            addCriterion("userTitle is not null");
            return (Criteria) this;
        }

        public Criteria andUserTitleLike(String value) {
            addCriterion("userTitle like", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleNotLike(String value) {
            addCriterion("userTitle not like", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleEqualTo(String value) {
            addCriterion("userTitle =", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleNotEqualTo(String value) {
            addCriterion("userTitle <>", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleGreaterThan(String value) {
            addCriterion("userTitle >", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleGreaterThanOrEqualTo(String value) {
            addCriterion("userTitle >=", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleLessThan(String value) {
            addCriterion("userTitle <", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleLessThanOrEqualTo(String value) {
            addCriterion("userTitle <=", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleIn(List<String> values) {
            addCriterion("userTitle in", values, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleNotIn(List<String> values) {
            addCriterion("userTitle not in", values, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleBetween(String value1, String value2) {
            addCriterion("userTitle between", value1, value2, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleNotBetween(String value1, String value2) {
            addCriterion("userTitle not between", value1, value2, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTextIsNull() {
            addCriterion("userText is null");
            return (Criteria) this;
        }

        public Criteria andUserTextIsNotNull() {
            addCriterion("userText is not null");
            return (Criteria) this;
        }

        public Criteria andUserTextLike(String value) {
            addCriterion("userText like", value, "userText");
            return (Criteria) this;
        }

        public Criteria andUserTextNotLike(String value) {
            addCriterion("userText not like", value, "userText");
            return (Criteria) this;
        }

        public Criteria andUserTextEqualTo(String value) {
            addCriterion("userText =", value, "userText");
            return (Criteria) this;
        }

        public Criteria andUserTextNotEqualTo(String value) {
            addCriterion("userText <>", value, "userText");
            return (Criteria) this;
        }

        public Criteria andUserTextGreaterThan(String value) {
            addCriterion("userText >", value, "userText");
            return (Criteria) this;
        }

        public Criteria andUserTextGreaterThanOrEqualTo(String value) {
            addCriterion("userText >=", value, "userText");
            return (Criteria) this;
        }

        public Criteria andUserTextLessThan(String value) {
            addCriterion("userText <", value, "userText");
            return (Criteria) this;
        }

        public Criteria andUserTextLessThanOrEqualTo(String value) {
            addCriterion("userText <=", value, "userText");
            return (Criteria) this;
        }

        public Criteria andUserTextIn(List<String> values) {
            addCriterion("userText in", values, "userText");
            return (Criteria) this;
        }

        public Criteria andUserTextNotIn(List<String> values) {
            addCriterion("userText not in", values, "userText");
            return (Criteria) this;
        }

        public Criteria andUserTextBetween(String value1, String value2) {
            addCriterion("userText between", value1, value2, "userText");
            return (Criteria) this;
        }

        public Criteria andUserTextNotBetween(String value1, String value2) {
            addCriterion("userText not between", value1, value2, "userText");
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
