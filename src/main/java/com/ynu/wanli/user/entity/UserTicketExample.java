/**
 * @Copyright: 华为昆明数字经济学院-JAVA课程-高靖博 @Copy   All rights reserved.
 */
package com.ynu.wanli.user.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Date;

public class UserTicketExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTicketExample() {
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
        public Criteria andTicketIdIsNull() {
            addCriterion("ticketId is null");
            return (Criteria) this;
        }

        public Criteria andTicketIdIsNotNull() {
            addCriterion("ticketId is not null");
            return (Criteria) this;
        }

        public Criteria andTicketIdEqualTo(Integer value) {
            addCriterion("ticketId =", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotEqualTo(Integer value) {
            addCriterion("ticketId <>", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdGreaterThan(Integer value) {
            addCriterion("ticketId >", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticketId >=", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLessThan(Integer value) {
            addCriterion("ticketId <", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLessThanOrEqualTo(Integer value) {
            addCriterion("ticketId <=", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdIn(List<Integer> values) {
            addCriterion("ticketId in", values, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotIn(List<Integer> values) {
            addCriterion("ticketId not in", values, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdBetween(Integer value1, Integer value2) {
            addCriterion("ticketId between", value1, value2, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ticketId not between", value1, value2, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIsNull() {
            addCriterion("ticketType is null");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIsNotNull() {
            addCriterion("ticketType is not null");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLike(String value) {
            addCriterion("ticketType like", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotLike(String value) {
            addCriterion("ticketType not like", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeEqualTo(String value) {
            addCriterion("ticketType =", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotEqualTo(String value) {
            addCriterion("ticketType <>", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeGreaterThan(String value) {
            addCriterion("ticketType >", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ticketType >=", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLessThan(String value) {
            addCriterion("ticketType <", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLessThanOrEqualTo(String value) {
            addCriterion("ticketType <=", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIn(List<String> values) {
            addCriterion("ticketType in", values, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotIn(List<String> values) {
            addCriterion("ticketType not in", values, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeBetween(String value1, String value2) {
            addCriterion("ticketType between", value1, value2, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotBetween(String value1, String value2) {
            addCriterion("ticketType not between", value1, value2, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketNumIsNull() {
            addCriterion("ticketNum is null");
            return (Criteria) this;
        }

        public Criteria andTicketNumIsNotNull() {
            addCriterion("ticketNum is not null");
            return (Criteria) this;
        }

        public Criteria andTicketNumEqualTo(Integer value) {
            addCriterion("ticketNum =", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotEqualTo(Integer value) {
            addCriterion("ticketNum <>", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumGreaterThan(Integer value) {
            addCriterion("ticketNum >", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticketNum >=", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumLessThan(Integer value) {
            addCriterion("ticketNum <", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumLessThanOrEqualTo(Integer value) {
            addCriterion("ticketNum <=", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumIn(List<Integer> values) {
            addCriterion("ticketNum in", values, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotIn(List<Integer> values) {
            addCriterion("ticketNum not in", values, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumBetween(Integer value1, Integer value2) {
            addCriterion("ticketNum between", value1, value2, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ticketNum not between", value1, value2, "ticketNum");
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
