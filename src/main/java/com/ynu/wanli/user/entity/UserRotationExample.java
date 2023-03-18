/**
 * @Copyright: 华为昆明数字经济学院-JAVA课程-高靖博 @Copy   All rights reserved.
 */
package com.ynu.wanli.user.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Date;

public class UserRotationExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserRotationExample() {
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
        public Criteria andRotationIDIsNull() {
            addCriterion("rotationID is null");
            return (Criteria) this;
        }

        public Criteria andRotationIDIsNotNull() {
            addCriterion("rotationID is not null");
            return (Criteria) this;
        }

        public Criteria andRotationIDEqualTo(Integer value) {
            addCriterion("rotationID =", value, "rotationID");
            return (Criteria) this;
        }

        public Criteria andRotationIDNotEqualTo(Integer value) {
            addCriterion("rotationID <>", value, "rotationID");
            return (Criteria) this;
        }

        public Criteria andRotationIDGreaterThan(Integer value) {
            addCriterion("rotationID >", value, "rotationID");
            return (Criteria) this;
        }

        public Criteria andRotationIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("rotationID >=", value, "rotationID");
            return (Criteria) this;
        }

        public Criteria andRotationIDLessThan(Integer value) {
            addCriterion("rotationID <", value, "rotationID");
            return (Criteria) this;
        }

        public Criteria andRotationIDLessThanOrEqualTo(Integer value) {
            addCriterion("rotationID <=", value, "rotationID");
            return (Criteria) this;
        }

        public Criteria andRotationIDIn(List<Integer> values) {
            addCriterion("rotationID in", values, "rotationID");
            return (Criteria) this;
        }

        public Criteria andRotationIDNotIn(List<Integer> values) {
            addCriterion("rotationID not in", values, "rotationID");
            return (Criteria) this;
        }

        public Criteria andRotationIDBetween(Integer value1, Integer value2) {
            addCriterion("rotationID between", value1, value2, "rotationID");
            return (Criteria) this;
        }

        public Criteria andRotationIDNotBetween(Integer value1, Integer value2) {
            addCriterion("rotationID not between", value1, value2, "rotationID");
            return (Criteria) this;
        }

        public Criteria andRotationLocationIsNull() {
            addCriterion("rotationLocation is null");
            return (Criteria) this;
        }

        public Criteria andRotationLocationIsNotNull() {
            addCriterion("rotationLocation is not null");
            return (Criteria) this;
        }

        public Criteria andRotationLocationLike(String value) {
            addCriterion("rotationLocation like", value, "rotationLocation");
            return (Criteria) this;
        }

        public Criteria andRotationLocationNotLike(String value) {
            addCriterion("rotationLocation not like", value, "rotationLocation");
            return (Criteria) this;
        }

        public Criteria andRotationLocationEqualTo(String value) {
            addCriterion("rotationLocation =", value, "rotationLocation");
            return (Criteria) this;
        }

        public Criteria andRotationLocationNotEqualTo(String value) {
            addCriterion("rotationLocation <>", value, "rotationLocation");
            return (Criteria) this;
        }

        public Criteria andRotationLocationGreaterThan(String value) {
            addCriterion("rotationLocation >", value, "rotationLocation");
            return (Criteria) this;
        }

        public Criteria andRotationLocationGreaterThanOrEqualTo(String value) {
            addCriterion("rotationLocation >=", value, "rotationLocation");
            return (Criteria) this;
        }

        public Criteria andRotationLocationLessThan(String value) {
            addCriterion("rotationLocation <", value, "rotationLocation");
            return (Criteria) this;
        }

        public Criteria andRotationLocationLessThanOrEqualTo(String value) {
            addCriterion("rotationLocation <=", value, "rotationLocation");
            return (Criteria) this;
        }

        public Criteria andRotationLocationIn(List<String> values) {
            addCriterion("rotationLocation in", values, "rotationLocation");
            return (Criteria) this;
        }

        public Criteria andRotationLocationNotIn(List<String> values) {
            addCriterion("rotationLocation not in", values, "rotationLocation");
            return (Criteria) this;
        }

        public Criteria andRotationLocationBetween(String value1, String value2) {
            addCriterion("rotationLocation between", value1, value2, "rotationLocation");
            return (Criteria) this;
        }

        public Criteria andRotationLocationNotBetween(String value1, String value2) {
            addCriterion("rotationLocation not between", value1, value2, "rotationLocation");
            return (Criteria) this;
        }

        public Criteria andRotationUrlIsNull() {
            addCriterion("rotationUrl is null");
            return (Criteria) this;
        }

        public Criteria andRotationUrlIsNotNull() {
            addCriterion("rotationUrl is not null");
            return (Criteria) this;
        }

        public Criteria andRotationUrlLike(String value) {
            addCriterion("rotationUrl like", value, "rotationUrl");
            return (Criteria) this;
        }

        public Criteria andRotationUrlNotLike(String value) {
            addCriterion("rotationUrl not like", value, "rotationUrl");
            return (Criteria) this;
        }

        public Criteria andRotationUrlEqualTo(String value) {
            addCriterion("rotationUrl =", value, "rotationUrl");
            return (Criteria) this;
        }

        public Criteria andRotationUrlNotEqualTo(String value) {
            addCriterion("rotationUrl <>", value, "rotationUrl");
            return (Criteria) this;
        }

        public Criteria andRotationUrlGreaterThan(String value) {
            addCriterion("rotationUrl >", value, "rotationUrl");
            return (Criteria) this;
        }

        public Criteria andRotationUrlGreaterThanOrEqualTo(String value) {
            addCriterion("rotationUrl >=", value, "rotationUrl");
            return (Criteria) this;
        }

        public Criteria andRotationUrlLessThan(String value) {
            addCriterion("rotationUrl <", value, "rotationUrl");
            return (Criteria) this;
        }

        public Criteria andRotationUrlLessThanOrEqualTo(String value) {
            addCriterion("rotationUrl <=", value, "rotationUrl");
            return (Criteria) this;
        }

        public Criteria andRotationUrlIn(List<String> values) {
            addCriterion("rotationUrl in", values, "rotationUrl");
            return (Criteria) this;
        }

        public Criteria andRotationUrlNotIn(List<String> values) {
            addCriterion("rotationUrl not in", values, "rotationUrl");
            return (Criteria) this;
        }

        public Criteria andRotationUrlBetween(String value1, String value2) {
            addCriterion("rotationUrl between", value1, value2, "rotationUrl");
            return (Criteria) this;
        }

        public Criteria andRotationUrlNotBetween(String value1, String value2) {
            addCriterion("rotationUrl not between", value1, value2, "rotationUrl");
            return (Criteria) this;
        }

        public Criteria andRotationStateIsNull() {
            addCriterion("rotationState is null");
            return (Criteria) this;
        }

        public Criteria andRotationStateIsNotNull() {
            addCriterion("rotationState is not null");
            return (Criteria) this;
        }

        public Criteria andRotationStateLike(String value) {
            addCriterion("rotationState like", value, "rotationState");
            return (Criteria) this;
        }

        public Criteria andRotationStateNotLike(String value) {
            addCriterion("rotationState not like", value, "rotationState");
            return (Criteria) this;
        }

        public Criteria andRotationStateEqualTo(String value) {
            addCriterion("rotationState =", value, "rotationState");
            return (Criteria) this;
        }

        public Criteria andRotationStateNotEqualTo(String value) {
            addCriterion("rotationState <>", value, "rotationState");
            return (Criteria) this;
        }

        public Criteria andRotationStateGreaterThan(String value) {
            addCriterion("rotationState >", value, "rotationState");
            return (Criteria) this;
        }

        public Criteria andRotationStateGreaterThanOrEqualTo(String value) {
            addCriterion("rotationState >=", value, "rotationState");
            return (Criteria) this;
        }

        public Criteria andRotationStateLessThan(String value) {
            addCriterion("rotationState <", value, "rotationState");
            return (Criteria) this;
        }

        public Criteria andRotationStateLessThanOrEqualTo(String value) {
            addCriterion("rotationState <=", value, "rotationState");
            return (Criteria) this;
        }

        public Criteria andRotationStateIn(List<String> values) {
            addCriterion("rotationState in", values, "rotationState");
            return (Criteria) this;
        }

        public Criteria andRotationStateNotIn(List<String> values) {
            addCriterion("rotationState not in", values, "rotationState");
            return (Criteria) this;
        }

        public Criteria andRotationStateBetween(String value1, String value2) {
            addCriterion("rotationState between", value1, value2, "rotationState");
            return (Criteria) this;
        }

        public Criteria andRotationStateNotBetween(String value1, String value2) {
            addCriterion("rotationState not between", value1, value2, "rotationState");
            return (Criteria) this;
        }

        public Criteria andRotationCreateTimeIsNull() {
            addCriterion("rotationCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andRotationCreateTimeIsNotNull() {
            addCriterion("rotationCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andRotationCreateTimeEqualTo(Date value) {
            addCriterion("rotationCreateTime =", value, "rotationCreateTime");
            return (Criteria) this;
        }

        public Criteria andRotationCreateTimeNotEqualTo(Date value) {
            addCriterion("rotationCreateTime <>", value, "rotationCreateTime");
            return (Criteria) this;
        }

        public Criteria andRotationCreateTimeGreaterThan(Date value) {
            addCriterion("rotationCreateTime >", value, "rotationCreateTime");
            return (Criteria) this;
        }

        public Criteria andRotationCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rotationCreateTime >=", value, "rotationCreateTime");
            return (Criteria) this;
        }

        public Criteria andRotationCreateTimeLessThan(Date value) {
            addCriterion("rotationCreateTime <", value, "rotationCreateTime");
            return (Criteria) this;
        }

        public Criteria andRotationCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("rotationCreateTime <=", value, "rotationCreateTime");
            return (Criteria) this;
        }

        public Criteria andRotationCreateTimeIn(List<Date> values) {
            addCriterion("rotationCreateTime in", values, "rotationCreateTime");
            return (Criteria) this;
        }

        public Criteria andRotationCreateTimeNotIn(List<Date> values) {
            addCriterion("rotationCreateTime not in", values, "rotationCreateTime");
            return (Criteria) this;
        }

        public Criteria andRotationCreateTimeBetween(Date value1, Date value2) {
            addCriterion("rotationCreateTime between", value1, value2, "rotationCreateTime");
            return (Criteria) this;
        }

        public Criteria andRotationCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("rotationCreateTime not between", value1, value2, "rotationCreateTime");
            return (Criteria) this;
        }

        public Criteria andRotationUpdateTimeIsNull() {
            addCriterion("rotationUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andRotationUpdateTimeIsNotNull() {
            addCriterion("rotationUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andRotationUpdateTimeEqualTo(Date value) {
            addCriterion("rotationUpdateTime =", value, "rotationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRotationUpdateTimeNotEqualTo(Date value) {
            addCriterion("rotationUpdateTime <>", value, "rotationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRotationUpdateTimeGreaterThan(Date value) {
            addCriterion("rotationUpdateTime >", value, "rotationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRotationUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rotationUpdateTime >=", value, "rotationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRotationUpdateTimeLessThan(Date value) {
            addCriterion("rotationUpdateTime <", value, "rotationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRotationUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("rotationUpdateTime <=", value, "rotationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRotationUpdateTimeIn(List<Date> values) {
            addCriterion("rotationUpdateTime in", values, "rotationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRotationUpdateTimeNotIn(List<Date> values) {
            addCriterion("rotationUpdateTime not in", values, "rotationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRotationUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("rotationUpdateTime between", value1, value2, "rotationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRotationUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("rotationUpdateTime not between", value1, value2, "rotationUpdateTime");
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
