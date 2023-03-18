/**
 * @Copyright: 华为昆明数字经济学院-JAVA课程-高靖博 @Copy   All rights reserved.
 */
package com.ynu.wanli.user.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Date;

public class UserOrderExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserOrderExample() {
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
        public Criteria andOrderIdIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("orderId <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIsNull() {
            addCriterion("orderUser is null");
            return (Criteria) this;
        }

        public Criteria andOrderUserIsNotNull() {
            addCriterion("orderUser is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUserLike(String value) {
            addCriterion("orderUser like", value, "orderUser");
            return (Criteria) this;
        }

        public Criteria andOrderUserNotLike(String value) {
            addCriterion("orderUser not like", value, "orderUser");
            return (Criteria) this;
        }

        public Criteria andOrderUserEqualTo(String value) {
            addCriterion("orderUser =", value, "orderUser");
            return (Criteria) this;
        }

        public Criteria andOrderUserNotEqualTo(String value) {
            addCriterion("orderUser <>", value, "orderUser");
            return (Criteria) this;
        }

        public Criteria andOrderUserGreaterThan(String value) {
            addCriterion("orderUser >", value, "orderUser");
            return (Criteria) this;
        }

        public Criteria andOrderUserGreaterThanOrEqualTo(String value) {
            addCriterion("orderUser >=", value, "orderUser");
            return (Criteria) this;
        }

        public Criteria andOrderUserLessThan(String value) {
            addCriterion("orderUser <", value, "orderUser");
            return (Criteria) this;
        }

        public Criteria andOrderUserLessThanOrEqualTo(String value) {
            addCriterion("orderUser <=", value, "orderUser");
            return (Criteria) this;
        }

        public Criteria andOrderUserIn(List<String> values) {
            addCriterion("orderUser in", values, "orderUser");
            return (Criteria) this;
        }

        public Criteria andOrderUserNotIn(List<String> values) {
            addCriterion("orderUser not in", values, "orderUser");
            return (Criteria) this;
        }

        public Criteria andOrderUserBetween(String value1, String value2) {
            addCriterion("orderUser between", value1, value2, "orderUser");
            return (Criteria) this;
        }

        public Criteria andOrderUserNotBetween(String value1, String value2) {
            addCriterion("orderUser not between", value1, value2, "orderUser");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeIsNull() {
            addCriterion("orderStartTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeIsNotNull() {
            addCriterion("orderStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeEqualTo(Date value) {
            addCriterion("orderStartTime =", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeNotEqualTo(Date value) {
            addCriterion("orderStartTime <>", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeGreaterThan(Date value) {
            addCriterion("orderStartTime >", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orderStartTime >=", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeLessThan(Date value) {
            addCriterion("orderStartTime <", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("orderStartTime <=", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeIn(List<Date> values) {
            addCriterion("orderStartTime in", values, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeNotIn(List<Date> values) {
            addCriterion("orderStartTime not in", values, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeBetween(Date value1, Date value2) {
            addCriterion("orderStartTime between", value1, value2, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("orderStartTime not between", value1, value2, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderCardIsNull() {
            addCriterion("orderCard is null");
            return (Criteria) this;
        }

        public Criteria andOrderCardIsNotNull() {
            addCriterion("orderCard is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCardLike(String value) {
            addCriterion("orderCard like", value, "orderCard");
            return (Criteria) this;
        }

        public Criteria andOrderCardNotLike(String value) {
            addCriterion("orderCard not like", value, "orderCard");
            return (Criteria) this;
        }

        public Criteria andOrderCardEqualTo(String value) {
            addCriterion("orderCard =", value, "orderCard");
            return (Criteria) this;
        }

        public Criteria andOrderCardNotEqualTo(String value) {
            addCriterion("orderCard <>", value, "orderCard");
            return (Criteria) this;
        }

        public Criteria andOrderCardGreaterThan(String value) {
            addCriterion("orderCard >", value, "orderCard");
            return (Criteria) this;
        }

        public Criteria andOrderCardGreaterThanOrEqualTo(String value) {
            addCriterion("orderCard >=", value, "orderCard");
            return (Criteria) this;
        }

        public Criteria andOrderCardLessThan(String value) {
            addCriterion("orderCard <", value, "orderCard");
            return (Criteria) this;
        }

        public Criteria andOrderCardLessThanOrEqualTo(String value) {
            addCriterion("orderCard <=", value, "orderCard");
            return (Criteria) this;
        }

        public Criteria andOrderCardIn(List<String> values) {
            addCriterion("orderCard in", values, "orderCard");
            return (Criteria) this;
        }

        public Criteria andOrderCardNotIn(List<String> values) {
            addCriterion("orderCard not in", values, "orderCard");
            return (Criteria) this;
        }

        public Criteria andOrderCardBetween(String value1, String value2) {
            addCriterion("orderCard between", value1, value2, "orderCard");
            return (Criteria) this;
        }

        public Criteria andOrderCardNotBetween(String value1, String value2) {
            addCriterion("orderCard not between", value1, value2, "orderCard");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeIsNull() {
            addCriterion("orderEndTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeIsNotNull() {
            addCriterion("orderEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeEqualTo(Date value) {
            addCriterion("orderEndTime =", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeNotEqualTo(Date value) {
            addCriterion("orderEndTime <>", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeGreaterThan(Date value) {
            addCriterion("orderEndTime >", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orderEndTime >=", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeLessThan(Date value) {
            addCriterion("orderEndTime <", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("orderEndTime <=", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeIn(List<Date> values) {
            addCriterion("orderEndTime in", values, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeNotIn(List<Date> values) {
            addCriterion("orderEndTime not in", values, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeBetween(Date value1, Date value2) {
            addCriterion("orderEndTime between", value1, value2, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("orderEndTime not between", value1, value2, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderVipSiteIsNull() {
            addCriterion("orderVipSite is null");
            return (Criteria) this;
        }

        public Criteria andOrderVipSiteIsNotNull() {
            addCriterion("orderVipSite is not null");
            return (Criteria) this;
        }

        public Criteria andOrderVipSiteEqualTo(Integer value) {
            addCriterion("orderVipSite =", value, "orderVipSite");
            return (Criteria) this;
        }

        public Criteria andOrderVipSiteNotEqualTo(Integer value) {
            addCriterion("orderVipSite <>", value, "orderVipSite");
            return (Criteria) this;
        }

        public Criteria andOrderVipSiteGreaterThan(Integer value) {
            addCriterion("orderVipSite >", value, "orderVipSite");
            return (Criteria) this;
        }

        public Criteria andOrderVipSiteGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderVipSite >=", value, "orderVipSite");
            return (Criteria) this;
        }

        public Criteria andOrderVipSiteLessThan(Integer value) {
            addCriterion("orderVipSite <", value, "orderVipSite");
            return (Criteria) this;
        }

        public Criteria andOrderVipSiteLessThanOrEqualTo(Integer value) {
            addCriterion("orderVipSite <=", value, "orderVipSite");
            return (Criteria) this;
        }

        public Criteria andOrderVipSiteIn(List<Integer> values) {
            addCriterion("orderVipSite in", values, "orderVipSite");
            return (Criteria) this;
        }

        public Criteria andOrderVipSiteNotIn(List<Integer> values) {
            addCriterion("orderVipSite not in", values, "orderVipSite");
            return (Criteria) this;
        }

        public Criteria andOrderVipSiteBetween(Integer value1, Integer value2) {
            addCriterion("orderVipSite between", value1, value2, "orderVipSite");
            return (Criteria) this;
        }

        public Criteria andOrderVipSiteNotBetween(Integer value1, Integer value2) {
            addCriterion("orderVipSite not between", value1, value2, "orderVipSite");
            return (Criteria) this;
        }

        public Criteria andOrderOrdinaryIsNull() {
            addCriterion("orderOrdinary is null");
            return (Criteria) this;
        }

        public Criteria andOrderOrdinaryIsNotNull() {
            addCriterion("orderOrdinary is not null");
            return (Criteria) this;
        }

        public Criteria andOrderOrdinaryEqualTo(Integer value) {
            addCriterion("orderOrdinary =", value, "orderOrdinary");
            return (Criteria) this;
        }

        public Criteria andOrderOrdinaryNotEqualTo(Integer value) {
            addCriterion("orderOrdinary <>", value, "orderOrdinary");
            return (Criteria) this;
        }

        public Criteria andOrderOrdinaryGreaterThan(Integer value) {
            addCriterion("orderOrdinary >", value, "orderOrdinary");
            return (Criteria) this;
        }

        public Criteria andOrderOrdinaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderOrdinary >=", value, "orderOrdinary");
            return (Criteria) this;
        }

        public Criteria andOrderOrdinaryLessThan(Integer value) {
            addCriterion("orderOrdinary <", value, "orderOrdinary");
            return (Criteria) this;
        }

        public Criteria andOrderOrdinaryLessThanOrEqualTo(Integer value) {
            addCriterion("orderOrdinary <=", value, "orderOrdinary");
            return (Criteria) this;
        }

        public Criteria andOrderOrdinaryIn(List<Integer> values) {
            addCriterion("orderOrdinary in", values, "orderOrdinary");
            return (Criteria) this;
        }

        public Criteria andOrderOrdinaryNotIn(List<Integer> values) {
            addCriterion("orderOrdinary not in", values, "orderOrdinary");
            return (Criteria) this;
        }

        public Criteria andOrderOrdinaryBetween(Integer value1, Integer value2) {
            addCriterion("orderOrdinary between", value1, value2, "orderOrdinary");
            return (Criteria) this;
        }

        public Criteria andOrderOrdinaryNotBetween(Integer value1, Integer value2) {
            addCriterion("orderOrdinary not between", value1, value2, "orderOrdinary");
            return (Criteria) this;
        }

        public Criteria andOrderNoSiteIsNull() {
            addCriterion("orderNoSite is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoSiteIsNotNull() {
            addCriterion("orderNoSite is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoSiteEqualTo(Integer value) {
            addCriterion("orderNoSite =", value, "orderNoSite");
            return (Criteria) this;
        }

        public Criteria andOrderNoSiteNotEqualTo(Integer value) {
            addCriterion("orderNoSite <>", value, "orderNoSite");
            return (Criteria) this;
        }

        public Criteria andOrderNoSiteGreaterThan(Integer value) {
            addCriterion("orderNoSite >", value, "orderNoSite");
            return (Criteria) this;
        }

        public Criteria andOrderNoSiteGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderNoSite >=", value, "orderNoSite");
            return (Criteria) this;
        }

        public Criteria andOrderNoSiteLessThan(Integer value) {
            addCriterion("orderNoSite <", value, "orderNoSite");
            return (Criteria) this;
        }

        public Criteria andOrderNoSiteLessThanOrEqualTo(Integer value) {
            addCriterion("orderNoSite <=", value, "orderNoSite");
            return (Criteria) this;
        }

        public Criteria andOrderNoSiteIn(List<Integer> values) {
            addCriterion("orderNoSite in", values, "orderNoSite");
            return (Criteria) this;
        }

        public Criteria andOrderNoSiteNotIn(List<Integer> values) {
            addCriterion("orderNoSite not in", values, "orderNoSite");
            return (Criteria) this;
        }

        public Criteria andOrderNoSiteBetween(Integer value1, Integer value2) {
            addCriterion("orderNoSite between", value1, value2, "orderNoSite");
            return (Criteria) this;
        }

        public Criteria andOrderNoSiteNotBetween(Integer value1, Integer value2) {
            addCriterion("orderNoSite not between", value1, value2, "orderNoSite");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("orderState is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("orderState is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateLike(String value) {
            addCriterion("orderState like", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotLike(String value) {
            addCriterion("orderState not like", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(String value) {
            addCriterion("orderState =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(String value) {
            addCriterion("orderState <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(String value) {
            addCriterion("orderState >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(String value) {
            addCriterion("orderState >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(String value) {
            addCriterion("orderState <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(String value) {
            addCriterion("orderState <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<String> values) {
            addCriterion("orderState in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<String> values) {
            addCriterion("orderState not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(String value1, String value2) {
            addCriterion("orderState between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(String value1, String value2) {
            addCriterion("orderState not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderPersonIsNull() {
            addCriterion("orderPerson is null");
            return (Criteria) this;
        }

        public Criteria andOrderPersonIsNotNull() {
            addCriterion("orderPerson is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPersonLike(String value) {
            addCriterion("orderPerson like", value, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderPersonNotLike(String value) {
            addCriterion("orderPerson not like", value, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderPersonEqualTo(String value) {
            addCriterion("orderPerson =", value, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderPersonNotEqualTo(String value) {
            addCriterion("orderPerson <>", value, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderPersonGreaterThan(String value) {
            addCriterion("orderPerson >", value, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderPersonGreaterThanOrEqualTo(String value) {
            addCriterion("orderPerson >=", value, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderPersonLessThan(String value) {
            addCriterion("orderPerson <", value, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderPersonLessThanOrEqualTo(String value) {
            addCriterion("orderPerson <=", value, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderPersonIn(List<String> values) {
            addCriterion("orderPerson in", values, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderPersonNotIn(List<String> values) {
            addCriterion("orderPerson not in", values, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderPersonBetween(String value1, String value2) {
            addCriterion("orderPerson between", value1, value2, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderPersonNotBetween(String value1, String value2) {
            addCriterion("orderPerson not between", value1, value2, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderInsertTimeIsNull() {
            addCriterion("orderInsertTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderInsertTimeIsNotNull() {
            addCriterion("orderInsertTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderInsertTimeEqualTo(Date value) {
            addCriterion("orderInsertTime =", value, "orderInsertTime");
            return (Criteria) this;
        }

        public Criteria andOrderInsertTimeNotEqualTo(Date value) {
            addCriterion("orderInsertTime <>", value, "orderInsertTime");
            return (Criteria) this;
        }

        public Criteria andOrderInsertTimeGreaterThan(Date value) {
            addCriterion("orderInsertTime >", value, "orderInsertTime");
            return (Criteria) this;
        }

        public Criteria andOrderInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orderInsertTime >=", value, "orderInsertTime");
            return (Criteria) this;
        }

        public Criteria andOrderInsertTimeLessThan(Date value) {
            addCriterion("orderInsertTime <", value, "orderInsertTime");
            return (Criteria) this;
        }

        public Criteria andOrderInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("orderInsertTime <=", value, "orderInsertTime");
            return (Criteria) this;
        }

        public Criteria andOrderInsertTimeIn(List<Date> values) {
            addCriterion("orderInsertTime in", values, "orderInsertTime");
            return (Criteria) this;
        }

        public Criteria andOrderInsertTimeNotIn(List<Date> values) {
            addCriterion("orderInsertTime not in", values, "orderInsertTime");
            return (Criteria) this;
        }

        public Criteria andOrderInsertTimeBetween(Date value1, Date value2) {
            addCriterion("orderInsertTime between", value1, value2, "orderInsertTime");
            return (Criteria) this;
        }

        public Criteria andOrderInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("orderInsertTime not between", value1, value2, "orderInsertTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeIsNull() {
            addCriterion("orderUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeIsNotNull() {
            addCriterion("orderUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeEqualTo(Date value) {
            addCriterion("orderUpdateTime =", value, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeNotEqualTo(Date value) {
            addCriterion("orderUpdateTime <>", value, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeGreaterThan(Date value) {
            addCriterion("orderUpdateTime >", value, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orderUpdateTime >=", value, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeLessThan(Date value) {
            addCriterion("orderUpdateTime <", value, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("orderUpdateTime <=", value, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeIn(List<Date> values) {
            addCriterion("orderUpdateTime in", values, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeNotIn(List<Date> values) {
            addCriterion("orderUpdateTime not in", values, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("orderUpdateTime between", value1, value2, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("orderUpdateTime not between", value1, value2, "orderUpdateTime");
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
