/**
 * @Copyright: 华为昆明数字经济学院-JAVA课程-高靖博 @Copy   All rights reserved.
 */
package com.ynu.wanli.user.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Date;
import java.math.BigDecimal;

public class UserCarExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCarExample() {
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
        public Criteria andCarIdIsNull() {
            addCriterion("carId is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("carId is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdLike(String value) {
            addCriterion("carId like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotLike(String value) {
            addCriterion("carId not like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(String value) {
            addCriterion("carId =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(String value) {
            addCriterion("carId <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(String value) {
            addCriterion("carId >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(String value) {
            addCriterion("carId >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(String value) {
            addCriterion("carId <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(String value) {
            addCriterion("carId <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<String> values) {
            addCriterion("carId in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<String> values) {
            addCriterion("carId not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(String value1, String value2) {
            addCriterion("carId between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(String value1, String value2) {
            addCriterion("carId not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarPriceIsNull() {
            addCriterion("carPrice is null");
            return (Criteria) this;
        }

        public Criteria andCarPriceIsNotNull() {
            addCriterion("carPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCarPriceEqualTo(BigDecimal value) {
            addCriterion("carPrice =", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotEqualTo(BigDecimal value) {
            addCriterion("carPrice <>", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceGreaterThan(BigDecimal value) {
            addCriterion("carPrice >", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("carPrice >=", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceLessThan(BigDecimal value) {
            addCriterion("carPrice <", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("carPrice <=", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceIn(List<BigDecimal> values) {
            addCriterion("carPrice in", values, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotIn(List<BigDecimal> values) {
            addCriterion("carPrice not in", values, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("carPrice between", value1, value2, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("carPrice not between", value1, value2, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPicIsNull() {
            addCriterion("carPic is null");
            return (Criteria) this;
        }

        public Criteria andCarPicIsNotNull() {
            addCriterion("carPic is not null");
            return (Criteria) this;
        }

        public Criteria andCarPicLike(String value) {
            addCriterion("carPic like", value, "carPic");
            return (Criteria) this;
        }

        public Criteria andCarPicNotLike(String value) {
            addCriterion("carPic not like", value, "carPic");
            return (Criteria) this;
        }

        public Criteria andCarPicEqualTo(String value) {
            addCriterion("carPic =", value, "carPic");
            return (Criteria) this;
        }

        public Criteria andCarPicNotEqualTo(String value) {
            addCriterion("carPic <>", value, "carPic");
            return (Criteria) this;
        }

        public Criteria andCarPicGreaterThan(String value) {
            addCriterion("carPic >", value, "carPic");
            return (Criteria) this;
        }

        public Criteria andCarPicGreaterThanOrEqualTo(String value) {
            addCriterion("carPic >=", value, "carPic");
            return (Criteria) this;
        }

        public Criteria andCarPicLessThan(String value) {
            addCriterion("carPic <", value, "carPic");
            return (Criteria) this;
        }

        public Criteria andCarPicLessThanOrEqualTo(String value) {
            addCriterion("carPic <=", value, "carPic");
            return (Criteria) this;
        }

        public Criteria andCarPicIn(List<String> values) {
            addCriterion("carPic in", values, "carPic");
            return (Criteria) this;
        }

        public Criteria andCarPicNotIn(List<String> values) {
            addCriterion("carPic not in", values, "carPic");
            return (Criteria) this;
        }

        public Criteria andCarPicBetween(String value1, String value2) {
            addCriterion("carPic between", value1, value2, "carPic");
            return (Criteria) this;
        }

        public Criteria andCarPicNotBetween(String value1, String value2) {
            addCriterion("carPic not between", value1, value2, "carPic");
            return (Criteria) this;
        }

        public Criteria andCarCardIsNull() {
            addCriterion("carCard is null");
            return (Criteria) this;
        }

        public Criteria andCarCardIsNotNull() {
            addCriterion("carCard is not null");
            return (Criteria) this;
        }

        public Criteria andCarCardLike(String value) {
            addCriterion("carCard like", value, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarCardNotLike(String value) {
            addCriterion("carCard not like", value, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarCardEqualTo(String value) {
            addCriterion("carCard =", value, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarCardNotEqualTo(String value) {
            addCriterion("carCard <>", value, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarCardGreaterThan(String value) {
            addCriterion("carCard >", value, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarCardGreaterThanOrEqualTo(String value) {
            addCriterion("carCard >=", value, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarCardLessThan(String value) {
            addCriterion("carCard <", value, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarCardLessThanOrEqualTo(String value) {
            addCriterion("carCard <=", value, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarCardIn(List<String> values) {
            addCriterion("carCard in", values, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarCardNotIn(List<String> values) {
            addCriterion("carCard not in", values, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarCardBetween(String value1, String value2) {
            addCriterion("carCard between", value1, value2, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarCardNotBetween(String value1, String value2) {
            addCriterion("carCard not between", value1, value2, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarPhoneIsNull() {
            addCriterion("carPhone is null");
            return (Criteria) this;
        }

        public Criteria andCarPhoneIsNotNull() {
            addCriterion("carPhone is not null");
            return (Criteria) this;
        }

        public Criteria andCarPhoneLike(String value) {
            addCriterion("carPhone like", value, "carPhone");
            return (Criteria) this;
        }

        public Criteria andCarPhoneNotLike(String value) {
            addCriterion("carPhone not like", value, "carPhone");
            return (Criteria) this;
        }

        public Criteria andCarPhoneEqualTo(String value) {
            addCriterion("carPhone =", value, "carPhone");
            return (Criteria) this;
        }

        public Criteria andCarPhoneNotEqualTo(String value) {
            addCriterion("carPhone <>", value, "carPhone");
            return (Criteria) this;
        }

        public Criteria andCarPhoneGreaterThan(String value) {
            addCriterion("carPhone >", value, "carPhone");
            return (Criteria) this;
        }

        public Criteria andCarPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("carPhone >=", value, "carPhone");
            return (Criteria) this;
        }

        public Criteria andCarPhoneLessThan(String value) {
            addCriterion("carPhone <", value, "carPhone");
            return (Criteria) this;
        }

        public Criteria andCarPhoneLessThanOrEqualTo(String value) {
            addCriterion("carPhone <=", value, "carPhone");
            return (Criteria) this;
        }

        public Criteria andCarPhoneIn(List<String> values) {
            addCriterion("carPhone in", values, "carPhone");
            return (Criteria) this;
        }

        public Criteria andCarPhoneNotIn(List<String> values) {
            addCriterion("carPhone not in", values, "carPhone");
            return (Criteria) this;
        }

        public Criteria andCarPhoneBetween(String value1, String value2) {
            addCriterion("carPhone between", value1, value2, "carPhone");
            return (Criteria) this;
        }

        public Criteria andCarPhoneNotBetween(String value1, String value2) {
            addCriterion("carPhone not between", value1, value2, "carPhone");
            return (Criteria) this;
        }

        public Criteria andCarPersonIsNull() {
            addCriterion("carPerson is null");
            return (Criteria) this;
        }

        public Criteria andCarPersonIsNotNull() {
            addCriterion("carPerson is not null");
            return (Criteria) this;
        }

        public Criteria andCarPersonLike(String value) {
            addCriterion("carPerson like", value, "carPerson");
            return (Criteria) this;
        }

        public Criteria andCarPersonNotLike(String value) {
            addCriterion("carPerson not like", value, "carPerson");
            return (Criteria) this;
        }

        public Criteria andCarPersonEqualTo(String value) {
            addCriterion("carPerson =", value, "carPerson");
            return (Criteria) this;
        }

        public Criteria andCarPersonNotEqualTo(String value) {
            addCriterion("carPerson <>", value, "carPerson");
            return (Criteria) this;
        }

        public Criteria andCarPersonGreaterThan(String value) {
            addCriterion("carPerson >", value, "carPerson");
            return (Criteria) this;
        }

        public Criteria andCarPersonGreaterThanOrEqualTo(String value) {
            addCriterion("carPerson >=", value, "carPerson");
            return (Criteria) this;
        }

        public Criteria andCarPersonLessThan(String value) {
            addCriterion("carPerson <", value, "carPerson");
            return (Criteria) this;
        }

        public Criteria andCarPersonLessThanOrEqualTo(String value) {
            addCriterion("carPerson <=", value, "carPerson");
            return (Criteria) this;
        }

        public Criteria andCarPersonIn(List<String> values) {
            addCriterion("carPerson in", values, "carPerson");
            return (Criteria) this;
        }

        public Criteria andCarPersonNotIn(List<String> values) {
            addCriterion("carPerson not in", values, "carPerson");
            return (Criteria) this;
        }

        public Criteria andCarPersonBetween(String value1, String value2) {
            addCriterion("carPerson between", value1, value2, "carPerson");
            return (Criteria) this;
        }

        public Criteria andCarPersonNotBetween(String value1, String value2) {
            addCriterion("carPerson not between", value1, value2, "carPerson");
            return (Criteria) this;
        }

        public Criteria andCarRouteIsNull() {
            addCriterion("carRoute is null");
            return (Criteria) this;
        }

        public Criteria andCarRouteIsNotNull() {
            addCriterion("carRoute is not null");
            return (Criteria) this;
        }

        public Criteria andCarRouteEqualTo(Integer value) {
            addCriterion("carRoute =", value, "carRoute");
            return (Criteria) this;
        }

        public Criteria andCarRouteNotEqualTo(Integer value) {
            addCriterion("carRoute <>", value, "carRoute");
            return (Criteria) this;
        }

        public Criteria andCarRouteGreaterThan(Integer value) {
            addCriterion("carRoute >", value, "carRoute");
            return (Criteria) this;
        }

        public Criteria andCarRouteGreaterThanOrEqualTo(Integer value) {
            addCriterion("carRoute >=", value, "carRoute");
            return (Criteria) this;
        }

        public Criteria andCarRouteLessThan(Integer value) {
            addCriterion("carRoute <", value, "carRoute");
            return (Criteria) this;
        }

        public Criteria andCarRouteLessThanOrEqualTo(Integer value) {
            addCriterion("carRoute <=", value, "carRoute");
            return (Criteria) this;
        }

        public Criteria andCarRouteIn(List<Integer> values) {
            addCriterion("carRoute in", values, "carRoute");
            return (Criteria) this;
        }

        public Criteria andCarRouteNotIn(List<Integer> values) {
            addCriterion("carRoute not in", values, "carRoute");
            return (Criteria) this;
        }

        public Criteria andCarRouteBetween(Integer value1, Integer value2) {
            addCriterion("carRoute between", value1, value2, "carRoute");
            return (Criteria) this;
        }

        public Criteria andCarRouteNotBetween(Integer value1, Integer value2) {
            addCriterion("carRoute not between", value1, value2, "carRoute");
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
