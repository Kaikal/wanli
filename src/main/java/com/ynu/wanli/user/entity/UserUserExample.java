/**
 * @Copyright: 华为昆明数字经济学院-JAVA课程-高靖博 @Copy   All rights reserved.
 */
package com.ynu.wanli.user.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Date;

public class UserUserExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserUserExample() {
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

        public Criteria andUserAccountIsNull() {
            addCriterion("userAccount is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("userAccount is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("userAccount like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("userAccount not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("userAccount =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("userAccount <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("userAccount >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("userAccount >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("userAccount <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("userAccount <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("userAccount in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("userAccount not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("userAccount between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("userAccount not between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNull() {
            addCriterion("userPwd is null");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNotNull() {
            addCriterion("userPwd is not null");
            return (Criteria) this;
        }

        public Criteria andUserPwdLike(String value) {
            addCriterion("userPwd like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotLike(String value) {
            addCriterion("userPwd not like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdEqualTo(String value) {
            addCriterion("userPwd =", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotEqualTo(String value) {
            addCriterion("userPwd <>", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThan(String value) {
            addCriterion("userPwd >", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("userPwd >=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThan(String value) {
            addCriterion("userPwd <", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThanOrEqualTo(String value) {
            addCriterion("userPwd <=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdIn(List<String> values) {
            addCriterion("userPwd in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotIn(List<String> values) {
            addCriterion("userPwd not in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdBetween(String value1, String value2) {
            addCriterion("userPwd between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotBetween(String value1, String value2) {
            addCriterion("userPwd not between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("userName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("userName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("userName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("userName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("userName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("userName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("userName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("userName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNull() {
            addCriterion("userCode is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("userCode is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("userCode like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("userCode not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("userCode =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("userCode <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("userCode >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("userCode >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("userCode <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("userCode <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("userCode in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("userCode not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("userCode between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
            addCriterion("userCode not between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("userPhone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("userPhone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("userPhone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("userPhone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("userPhone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("userPhone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("userPhone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("userPhone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("userPhone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("userPhone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("userPhone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("userPhone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("userPhone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("userPhone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("userSex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("userSex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("userSex like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("userSex not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("userSex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("userSex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("userSex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("userSex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("userSex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("userSex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("userSex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("userSex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("userSex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("userSex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserPicIsNull() {
            addCriterion("userPic is null");
            return (Criteria) this;
        }

        public Criteria andUserPicIsNotNull() {
            addCriterion("userPic is not null");
            return (Criteria) this;
        }

        public Criteria andUserPicLike(String value) {
            addCriterion("userPic like", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicNotLike(String value) {
            addCriterion("userPic not like", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicEqualTo(String value) {
            addCriterion("userPic =", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicNotEqualTo(String value) {
            addCriterion("userPic <>", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicGreaterThan(String value) {
            addCriterion("userPic >", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicGreaterThanOrEqualTo(String value) {
            addCriterion("userPic >=", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicLessThan(String value) {
            addCriterion("userPic <", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicLessThanOrEqualTo(String value) {
            addCriterion("userPic <=", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicIn(List<String> values) {
            addCriterion("userPic in", values, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicNotIn(List<String> values) {
            addCriterion("userPic not in", values, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicBetween(String value1, String value2) {
            addCriterion("userPic between", value1, value2, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicNotBetween(String value1, String value2) {
            addCriterion("userPic not between", value1, value2, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserBirthIsNull() {
            addCriterion("userBirth is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthIsNotNull() {
            addCriterion("userBirth is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthEqualTo(Date value) {
            addCriterionForJDBCDate("userBirth =", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("userBirth <>", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("userBirth >", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("userBirth >=", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthLessThan(Date value) {
            addCriterionForJDBCDate("userBirth <", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("userBirth <=", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthIn(List<Date> values) {
            addCriterionForJDBCDate("userBirth in", values, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("userBirth not in", values, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("userBirth between", value1, value2, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("userBirth not between", value1, value2, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("userEmail is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("userEmail is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("userEmail like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("userEmail not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("userEmail =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("userEmail <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("userEmail >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("userEmail >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("userEmail <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("userEmail <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("userEmail in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("userEmail not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("userEmail between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("userEmail not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNull() {
            addCriterion("userState is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNotNull() {
            addCriterion("userState is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateLike(String value) {
            addCriterion("userState like", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotLike(String value) {
            addCriterion("userState not like", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateEqualTo(String value) {
            addCriterion("userState =", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotEqualTo(String value) {
            addCriterion("userState <>", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThan(String value) {
            addCriterion("userState >", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThanOrEqualTo(String value) {
            addCriterion("userState >=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThan(String value) {
            addCriterion("userState <", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThanOrEqualTo(String value) {
            addCriterion("userState <=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateIn(List<String> values) {
            addCriterion("userState in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotIn(List<String> values) {
            addCriterion("userState not in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateBetween(String value1, String value2) {
            addCriterion("userState between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotBetween(String value1, String value2) {
            addCriterion("userState not between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIsNull() {
            addCriterion("userCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIsNotNull() {
            addCriterion("userCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeEqualTo(Date value) {
            addCriterion("userCreateTime =", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotEqualTo(Date value) {
            addCriterion("userCreateTime <>", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeGreaterThan(Date value) {
            addCriterion("userCreateTime >", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("userCreateTime >=", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeLessThan(Date value) {
            addCriterion("userCreateTime <", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("userCreateTime <=", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIn(List<Date> values) {
            addCriterion("userCreateTime in", values, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotIn(List<Date> values) {
            addCriterion("userCreateTime not in", values, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeBetween(Date value1, Date value2) {
            addCriterion("userCreateTime between", value1, value2, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("userCreateTime not between", value1, value2, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeIsNull() {
            addCriterion("userUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeIsNotNull() {
            addCriterion("userUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeEqualTo(Date value) {
            addCriterion("userUpdateTime =", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeNotEqualTo(Date value) {
            addCriterion("userUpdateTime <>", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeGreaterThan(Date value) {
            addCriterion("userUpdateTime >", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("userUpdateTime >=", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeLessThan(Date value) {
            addCriterion("userUpdateTime <", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("userUpdateTime <=", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeIn(List<Date> values) {
            addCriterion("userUpdateTime in", values, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeNotIn(List<Date> values) {
            addCriterion("userUpdateTime not in", values, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("userUpdateTime between", value1, value2, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("userUpdateTime not between", value1, value2, "userUpdateTime");
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
