/**
 * @Copyright: 华为昆明数字经济学院-JAVA课程-高靖博 @Copy   All rights reserved.
 */
package com.ynu.wanli.user.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Date;

public class UserAddrExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAddrExample() {
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
        public Criteria andAddrIdIsNull() {
            addCriterion("addrId is null");
            return (Criteria) this;
        }

        public Criteria andAddrIdIsNotNull() {
            addCriterion("addrId is not null");
            return (Criteria) this;
        }

        public Criteria andAddrIdEqualTo(Integer value) {
            addCriterion("addrId =", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdNotEqualTo(Integer value) {
            addCriterion("addrId <>", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdGreaterThan(Integer value) {
            addCriterion("addrId >", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("addrId >=", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdLessThan(Integer value) {
            addCriterion("addrId <", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdLessThanOrEqualTo(Integer value) {
            addCriterion("addrId <=", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdIn(List<Integer> values) {
            addCriterion("addrId in", values, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdNotIn(List<Integer> values) {
            addCriterion("addrId not in", values, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdBetween(Integer value1, Integer value2) {
            addCriterion("addrId between", value1, value2, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("addrId not between", value1, value2, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrUserIsNull() {
            addCriterion("addrUser is null");
            return (Criteria) this;
        }

        public Criteria andAddrUserIsNotNull() {
            addCriterion("addrUser is not null");
            return (Criteria) this;
        }

        public Criteria andAddrUserLike(String value) {
            addCriterion("addrUser like", value, "addrUser");
            return (Criteria) this;
        }

        public Criteria andAddrUserNotLike(String value) {
            addCriterion("addrUser not like", value, "addrUser");
            return (Criteria) this;
        }

        public Criteria andAddrUserEqualTo(String value) {
            addCriterion("addrUser =", value, "addrUser");
            return (Criteria) this;
        }

        public Criteria andAddrUserNotEqualTo(String value) {
            addCriterion("addrUser <>", value, "addrUser");
            return (Criteria) this;
        }

        public Criteria andAddrUserGreaterThan(String value) {
            addCriterion("addrUser >", value, "addrUser");
            return (Criteria) this;
        }

        public Criteria andAddrUserGreaterThanOrEqualTo(String value) {
            addCriterion("addrUser >=", value, "addrUser");
            return (Criteria) this;
        }

        public Criteria andAddrUserLessThan(String value) {
            addCriterion("addrUser <", value, "addrUser");
            return (Criteria) this;
        }

        public Criteria andAddrUserLessThanOrEqualTo(String value) {
            addCriterion("addrUser <=", value, "addrUser");
            return (Criteria) this;
        }

        public Criteria andAddrUserIn(List<String> values) {
            addCriterion("addrUser in", values, "addrUser");
            return (Criteria) this;
        }

        public Criteria andAddrUserNotIn(List<String> values) {
            addCriterion("addrUser not in", values, "addrUser");
            return (Criteria) this;
        }

        public Criteria andAddrUserBetween(String value1, String value2) {
            addCriterion("addrUser between", value1, value2, "addrUser");
            return (Criteria) this;
        }

        public Criteria andAddrUserNotBetween(String value1, String value2) {
            addCriterion("addrUser not between", value1, value2, "addrUser");
            return (Criteria) this;
        }

        public Criteria andAddrNameIsNull() {
            addCriterion("addrName is null");
            return (Criteria) this;
        }

        public Criteria andAddrNameIsNotNull() {
            addCriterion("addrName is not null");
            return (Criteria) this;
        }

        public Criteria andAddrNameLike(String value) {
            addCriterion("addrName like", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameNotLike(String value) {
            addCriterion("addrName not like", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameEqualTo(String value) {
            addCriterion("addrName =", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameNotEqualTo(String value) {
            addCriterion("addrName <>", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameGreaterThan(String value) {
            addCriterion("addrName >", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameGreaterThanOrEqualTo(String value) {
            addCriterion("addrName >=", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameLessThan(String value) {
            addCriterion("addrName <", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameLessThanOrEqualTo(String value) {
            addCriterion("addrName <=", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameIn(List<String> values) {
            addCriterion("addrName in", values, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameNotIn(List<String> values) {
            addCriterion("addrName not in", values, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameBetween(String value1, String value2) {
            addCriterion("addrName between", value1, value2, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameNotBetween(String value1, String value2) {
            addCriterion("addrName not between", value1, value2, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceIsNull() {
            addCriterion("addrProvince is null");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceIsNotNull() {
            addCriterion("addrProvince is not null");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceLike(String value) {
            addCriterion("addrProvince like", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNotLike(String value) {
            addCriterion("addrProvince not like", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceEqualTo(String value) {
            addCriterion("addrProvince =", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNotEqualTo(String value) {
            addCriterion("addrProvince <>", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceGreaterThan(String value) {
            addCriterion("addrProvince >", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("addrProvince >=", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceLessThan(String value) {
            addCriterion("addrProvince <", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceLessThanOrEqualTo(String value) {
            addCriterion("addrProvince <=", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceIn(List<String> values) {
            addCriterion("addrProvince in", values, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNotIn(List<String> values) {
            addCriterion("addrProvince not in", values, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceBetween(String value1, String value2) {
            addCriterion("addrProvince between", value1, value2, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNotBetween(String value1, String value2) {
            addCriterion("addrProvince not between", value1, value2, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrCityIsNull() {
            addCriterion("addrCity is null");
            return (Criteria) this;
        }

        public Criteria andAddrCityIsNotNull() {
            addCriterion("addrCity is not null");
            return (Criteria) this;
        }

        public Criteria andAddrCityLike(String value) {
            addCriterion("addrCity like", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityNotLike(String value) {
            addCriterion("addrCity not like", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityEqualTo(String value) {
            addCriterion("addrCity =", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityNotEqualTo(String value) {
            addCriterion("addrCity <>", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityGreaterThan(String value) {
            addCriterion("addrCity >", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityGreaterThanOrEqualTo(String value) {
            addCriterion("addrCity >=", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityLessThan(String value) {
            addCriterion("addrCity <", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityLessThanOrEqualTo(String value) {
            addCriterion("addrCity <=", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityIn(List<String> values) {
            addCriterion("addrCity in", values, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityNotIn(List<String> values) {
            addCriterion("addrCity not in", values, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityBetween(String value1, String value2) {
            addCriterion("addrCity between", value1, value2, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityNotBetween(String value1, String value2) {
            addCriterion("addrCity not between", value1, value2, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCountyIsNull() {
            addCriterion("addrCounty is null");
            return (Criteria) this;
        }

        public Criteria andAddrCountyIsNotNull() {
            addCriterion("addrCounty is not null");
            return (Criteria) this;
        }

        public Criteria andAddrCountyLike(String value) {
            addCriterion("addrCounty like", value, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrCountyNotLike(String value) {
            addCriterion("addrCounty not like", value, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrCountyEqualTo(String value) {
            addCriterion("addrCounty =", value, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrCountyNotEqualTo(String value) {
            addCriterion("addrCounty <>", value, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrCountyGreaterThan(String value) {
            addCriterion("addrCounty >", value, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrCountyGreaterThanOrEqualTo(String value) {
            addCriterion("addrCounty >=", value, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrCountyLessThan(String value) {
            addCriterion("addrCounty <", value, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrCountyLessThanOrEqualTo(String value) {
            addCriterion("addrCounty <=", value, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrCountyIn(List<String> values) {
            addCriterion("addrCounty in", values, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrCountyNotIn(List<String> values) {
            addCriterion("addrCounty not in", values, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrCountyBetween(String value1, String value2) {
            addCriterion("addrCounty between", value1, value2, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrCountyNotBetween(String value1, String value2) {
            addCriterion("addrCounty not between", value1, value2, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrDetailIsNull() {
            addCriterion("addrDetail is null");
            return (Criteria) this;
        }

        public Criteria andAddrDetailIsNotNull() {
            addCriterion("addrDetail is not null");
            return (Criteria) this;
        }

        public Criteria andAddrDetailLike(String value) {
            addCriterion("addrDetail like", value, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrDetailNotLike(String value) {
            addCriterion("addrDetail not like", value, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrDetailEqualTo(String value) {
            addCriterion("addrDetail =", value, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrDetailNotEqualTo(String value) {
            addCriterion("addrDetail <>", value, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrDetailGreaterThan(String value) {
            addCriterion("addrDetail >", value, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrDetailGreaterThanOrEqualTo(String value) {
            addCriterion("addrDetail >=", value, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrDetailLessThan(String value) {
            addCriterion("addrDetail <", value, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrDetailLessThanOrEqualTo(String value) {
            addCriterion("addrDetail <=", value, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrDetailIn(List<String> values) {
            addCriterion("addrDetail in", values, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrDetailNotIn(List<String> values) {
            addCriterion("addrDetail not in", values, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrDetailBetween(String value1, String value2) {
            addCriterion("addrDetail between", value1, value2, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrDetailNotBetween(String value1, String value2) {
            addCriterion("addrDetail not between", value1, value2, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrCodeIsNull() {
            addCriterion("addrCode is null");
            return (Criteria) this;
        }

        public Criteria andAddrCodeIsNotNull() {
            addCriterion("addrCode is not null");
            return (Criteria) this;
        }

        public Criteria andAddrCodeLike(String value) {
            addCriterion("addrCode like", value, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeNotLike(String value) {
            addCriterion("addrCode not like", value, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeEqualTo(String value) {
            addCriterion("addrCode =", value, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeNotEqualTo(String value) {
            addCriterion("addrCode <>", value, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeGreaterThan(String value) {
            addCriterion("addrCode >", value, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("addrCode >=", value, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeLessThan(String value) {
            addCriterion("addrCode <", value, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeLessThanOrEqualTo(String value) {
            addCriterion("addrCode <=", value, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeIn(List<String> values) {
            addCriterion("addrCode in", values, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeNotIn(List<String> values) {
            addCriterion("addrCode not in", values, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeBetween(String value1, String value2) {
            addCriterion("addrCode between", value1, value2, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeNotBetween(String value1, String value2) {
            addCriterion("addrCode not between", value1, value2, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrInsertTimeIsNull() {
            addCriterion("addrInsertTime is null");
            return (Criteria) this;
        }

        public Criteria andAddrInsertTimeIsNotNull() {
            addCriterion("addrInsertTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddrInsertTimeEqualTo(Date value) {
            addCriterion("addrInsertTime =", value, "addrInsertTime");
            return (Criteria) this;
        }

        public Criteria andAddrInsertTimeNotEqualTo(Date value) {
            addCriterion("addrInsertTime <>", value, "addrInsertTime");
            return (Criteria) this;
        }

        public Criteria andAddrInsertTimeGreaterThan(Date value) {
            addCriterion("addrInsertTime >", value, "addrInsertTime");
            return (Criteria) this;
        }

        public Criteria andAddrInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addrInsertTime >=", value, "addrInsertTime");
            return (Criteria) this;
        }

        public Criteria andAddrInsertTimeLessThan(Date value) {
            addCriterion("addrInsertTime <", value, "addrInsertTime");
            return (Criteria) this;
        }

        public Criteria andAddrInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("addrInsertTime <=", value, "addrInsertTime");
            return (Criteria) this;
        }

        public Criteria andAddrInsertTimeIn(List<Date> values) {
            addCriterion("addrInsertTime in", values, "addrInsertTime");
            return (Criteria) this;
        }

        public Criteria andAddrInsertTimeNotIn(List<Date> values) {
            addCriterion("addrInsertTime not in", values, "addrInsertTime");
            return (Criteria) this;
        }

        public Criteria andAddrInsertTimeBetween(Date value1, Date value2) {
            addCriterion("addrInsertTime between", value1, value2, "addrInsertTime");
            return (Criteria) this;
        }

        public Criteria andAddrInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("addrInsertTime not between", value1, value2, "addrInsertTime");
            return (Criteria) this;
        }

        public Criteria andAddrUpdateTimeIsNull() {
            addCriterion("addrUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andAddrUpdateTimeIsNotNull() {
            addCriterion("addrUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddrUpdateTimeEqualTo(Date value) {
            addCriterion("addrUpdateTime =", value, "addrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAddrUpdateTimeNotEqualTo(Date value) {
            addCriterion("addrUpdateTime <>", value, "addrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAddrUpdateTimeGreaterThan(Date value) {
            addCriterion("addrUpdateTime >", value, "addrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAddrUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addrUpdateTime >=", value, "addrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAddrUpdateTimeLessThan(Date value) {
            addCriterion("addrUpdateTime <", value, "addrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAddrUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("addrUpdateTime <=", value, "addrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAddrUpdateTimeIn(List<Date> values) {
            addCriterion("addrUpdateTime in", values, "addrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAddrUpdateTimeNotIn(List<Date> values) {
            addCriterion("addrUpdateTime not in", values, "addrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAddrUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("addrUpdateTime between", value1, value2, "addrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAddrUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("addrUpdateTime not between", value1, value2, "addrUpdateTime");
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
