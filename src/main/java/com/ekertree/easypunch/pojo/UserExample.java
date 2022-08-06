package com.ekertree.easypunch.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    public UserExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSessionUrlIsNull() {
            addCriterion("session_url is null");
            return (Criteria) this;
        }

        public Criteria andSessionUrlIsNotNull() {
            addCriterion("session_url is not null");
            return (Criteria) this;
        }

        public Criteria andSessionUrlEqualTo(String value) {
            addCriterion("session_url =", value, "sessionUrl");
            return (Criteria) this;
        }

        public Criteria andSessionUrlNotEqualTo(String value) {
            addCriterion("session_url <>", value, "sessionUrl");
            return (Criteria) this;
        }

        public Criteria andSessionUrlGreaterThan(String value) {
            addCriterion("session_url >", value, "sessionUrl");
            return (Criteria) this;
        }

        public Criteria andSessionUrlGreaterThanOrEqualTo(String value) {
            addCriterion("session_url >=", value, "sessionUrl");
            return (Criteria) this;
        }

        public Criteria andSessionUrlLessThan(String value) {
            addCriterion("session_url <", value, "sessionUrl");
            return (Criteria) this;
        }

        public Criteria andSessionUrlLessThanOrEqualTo(String value) {
            addCriterion("session_url <=", value, "sessionUrl");
            return (Criteria) this;
        }

        public Criteria andSessionUrlLike(String value) {
            addCriterion("session_url like", value, "sessionUrl");
            return (Criteria) this;
        }

        public Criteria andSessionUrlNotLike(String value) {
            addCriterion("session_url not like", value, "sessionUrl");
            return (Criteria) this;
        }

        public Criteria andSessionUrlIn(List<String> values) {
            addCriterion("session_url in", values, "sessionUrl");
            return (Criteria) this;
        }

        public Criteria andSessionUrlNotIn(List<String> values) {
            addCriterion("session_url not in", values, "sessionUrl");
            return (Criteria) this;
        }

        public Criteria andSessionUrlBetween(String value1, String value2) {
            addCriterion("session_url between", value1, value2, "sessionUrl");
            return (Criteria) this;
        }

        public Criteria andSessionUrlNotBetween(String value1, String value2) {
            addCriterion("session_url not between", value1, value2, "sessionUrl");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNull() {
            addCriterion("home_address is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNotNull() {
            addCriterion("home_address is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressEqualTo(String value) {
            addCriterion("home_address =", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotEqualTo(String value) {
            addCriterion("home_address <>", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThan(String value) {
            addCriterion("home_address >", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("home_address >=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThan(String value) {
            addCriterion("home_address <", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThanOrEqualTo(String value) {
            addCriterion("home_address <=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLike(String value) {
            addCriterion("home_address like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotLike(String value) {
            addCriterion("home_address not like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIn(List<String> values) {
            addCriterion("home_address in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotIn(List<String> values) {
            addCriterion("home_address not in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressBetween(String value1, String value2) {
            addCriterion("home_address between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotBetween(String value1, String value2) {
            addCriterion("home_address not between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andUserAgentIsNull() {
            addCriterion("user_agent is null");
            return (Criteria) this;
        }

        public Criteria andUserAgentIsNotNull() {
            addCriterion("user_agent is not null");
            return (Criteria) this;
        }

        public Criteria andUserAgentEqualTo(String value) {
            addCriterion("user_agent =", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentNotEqualTo(String value) {
            addCriterion("user_agent <>", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentGreaterThan(String value) {
            addCriterion("user_agent >", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentGreaterThanOrEqualTo(String value) {
            addCriterion("user_agent >=", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentLessThan(String value) {
            addCriterion("user_agent <", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentLessThanOrEqualTo(String value) {
            addCriterion("user_agent <=", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentLike(String value) {
            addCriterion("user_agent like", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentNotLike(String value) {
            addCriterion("user_agent not like", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentIn(List<String> values) {
            addCriterion("user_agent in", values, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentNotIn(List<String> values) {
            addCriterion("user_agent not in", values, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentBetween(String value1, String value2) {
            addCriterion("user_agent between", value1, value2, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentNotBetween(String value1, String value2) {
            addCriterion("user_agent not between", value1, value2, "userAgent");
            return (Criteria) this;
        }

        public Criteria andIfSendEmailIsNull() {
            addCriterion("if_send_Email is null");
            return (Criteria) this;
        }

        public Criteria andIfSendEmailIsNotNull() {
            addCriterion("if_send_Email is not null");
            return (Criteria) this;
        }

        public Criteria andIfSendEmailEqualTo(Integer value) {
            addCriterion("if_send_Email =", value, "ifSendEmail");
            return (Criteria) this;
        }

        public Criteria andIfSendEmailNotEqualTo(Integer value) {
            addCriterion("if_send_Email <>", value, "ifSendEmail");
            return (Criteria) this;
        }

        public Criteria andIfSendEmailGreaterThan(Integer value) {
            addCriterion("if_send_Email >", value, "ifSendEmail");
            return (Criteria) this;
        }

        public Criteria andIfSendEmailGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_send_Email >=", value, "ifSendEmail");
            return (Criteria) this;
        }

        public Criteria andIfSendEmailLessThan(Integer value) {
            addCriterion("if_send_Email <", value, "ifSendEmail");
            return (Criteria) this;
        }

        public Criteria andIfSendEmailLessThanOrEqualTo(Integer value) {
            addCriterion("if_send_Email <=", value, "ifSendEmail");
            return (Criteria) this;
        }

        public Criteria andIfSendEmailIn(List<Integer> values) {
            addCriterion("if_send_Email in", values, "ifSendEmail");
            return (Criteria) this;
        }

        public Criteria andIfSendEmailNotIn(List<Integer> values) {
            addCriterion("if_send_Email not in", values, "ifSendEmail");
            return (Criteria) this;
        }

        public Criteria andIfSendEmailBetween(Integer value1, Integer value2) {
            addCriterion("if_send_Email between", value1, value2, "ifSendEmail");
            return (Criteria) this;
        }

        public Criteria andIfSendEmailNotBetween(Integer value1, Integer value2) {
            addCriterion("if_send_Email not between", value1, value2, "ifSendEmail");
            return (Criteria) this;
        }

        public Criteria andIfSendWecheatIsNull() {
            addCriterion("if_send_wecheat is null");
            return (Criteria) this;
        }

        public Criteria andIfSendWecheatIsNotNull() {
            addCriterion("if_send_wecheat is not null");
            return (Criteria) this;
        }

        public Criteria andIfSendWecheatEqualTo(Integer value) {
            addCriterion("if_send_wecheat =", value, "ifSendWecheat");
            return (Criteria) this;
        }

        public Criteria andIfSendWecheatNotEqualTo(Integer value) {
            addCriterion("if_send_wecheat <>", value, "ifSendWecheat");
            return (Criteria) this;
        }

        public Criteria andIfSendWecheatGreaterThan(Integer value) {
            addCriterion("if_send_wecheat >", value, "ifSendWecheat");
            return (Criteria) this;
        }

        public Criteria andIfSendWecheatGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_send_wecheat >=", value, "ifSendWecheat");
            return (Criteria) this;
        }

        public Criteria andIfSendWecheatLessThan(Integer value) {
            addCriterion("if_send_wecheat <", value, "ifSendWecheat");
            return (Criteria) this;
        }

        public Criteria andIfSendWecheatLessThanOrEqualTo(Integer value) {
            addCriterion("if_send_wecheat <=", value, "ifSendWecheat");
            return (Criteria) this;
        }

        public Criteria andIfSendWecheatIn(List<Integer> values) {
            addCriterion("if_send_wecheat in", values, "ifSendWecheat");
            return (Criteria) this;
        }

        public Criteria andIfSendWecheatNotIn(List<Integer> values) {
            addCriterion("if_send_wecheat not in", values, "ifSendWecheat");
            return (Criteria) this;
        }

        public Criteria andIfSendWecheatBetween(Integer value1, Integer value2) {
            addCriterion("if_send_wecheat between", value1, value2, "ifSendWecheat");
            return (Criteria) this;
        }

        public Criteria andIfSendWecheatNotBetween(Integer value1, Integer value2) {
            addCriterion("if_send_wecheat not between", value1, value2, "ifSendWecheat");
            return (Criteria) this;
        }

        public Criteria andIfPunchIsNull() {
            addCriterion("if_punch is null");
            return (Criteria) this;
        }

        public Criteria andIfPunchIsNotNull() {
            addCriterion("if_punch is not null");
            return (Criteria) this;
        }

        public Criteria andIfPunchEqualTo(Integer value) {
            addCriterion("if_punch =", value, "ifPunch");
            return (Criteria) this;
        }

        public Criteria andIfPunchNotEqualTo(Integer value) {
            addCriterion("if_punch <>", value, "ifPunch");
            return (Criteria) this;
        }

        public Criteria andIfPunchGreaterThan(Integer value) {
            addCriterion("if_punch >", value, "ifPunch");
            return (Criteria) this;
        }

        public Criteria andIfPunchGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_punch >=", value, "ifPunch");
            return (Criteria) this;
        }

        public Criteria andIfPunchLessThan(Integer value) {
            addCriterion("if_punch <", value, "ifPunch");
            return (Criteria) this;
        }

        public Criteria andIfPunchLessThanOrEqualTo(Integer value) {
            addCriterion("if_punch <=", value, "ifPunch");
            return (Criteria) this;
        }

        public Criteria andIfPunchIn(List<Integer> values) {
            addCriterion("if_punch in", values, "ifPunch");
            return (Criteria) this;
        }

        public Criteria andIfPunchNotIn(List<Integer> values) {
            addCriterion("if_punch not in", values, "ifPunch");
            return (Criteria) this;
        }

        public Criteria andIfPunchBetween(Integer value1, Integer value2) {
            addCriterion("if_punch between", value1, value2, "ifPunch");
            return (Criteria) this;
        }

        public Criteria andIfPunchNotBetween(Integer value1, Integer value2) {
            addCriterion("if_punch not between", value1, value2, "ifPunch");
            return (Criteria) this;
        }

        public Criteria andMorningIsNull() {
            addCriterion("morning is null");
            return (Criteria) this;
        }

        public Criteria andMorningIsNotNull() {
            addCriterion("morning is not null");
            return (Criteria) this;
        }

        public Criteria andMorningEqualTo(Integer value) {
            addCriterion("morning =", value, "morning");
            return (Criteria) this;
        }

        public Criteria andMorningNotEqualTo(Integer value) {
            addCriterion("morning <>", value, "morning");
            return (Criteria) this;
        }

        public Criteria andMorningGreaterThan(Integer value) {
            addCriterion("morning >", value, "morning");
            return (Criteria) this;
        }

        public Criteria andMorningGreaterThanOrEqualTo(Integer value) {
            addCriterion("morning >=", value, "morning");
            return (Criteria) this;
        }

        public Criteria andMorningLessThan(Integer value) {
            addCriterion("morning <", value, "morning");
            return (Criteria) this;
        }

        public Criteria andMorningLessThanOrEqualTo(Integer value) {
            addCriterion("morning <=", value, "morning");
            return (Criteria) this;
        }

        public Criteria andMorningIn(List<Integer> values) {
            addCriterion("morning in", values, "morning");
            return (Criteria) this;
        }

        public Criteria andMorningNotIn(List<Integer> values) {
            addCriterion("morning not in", values, "morning");
            return (Criteria) this;
        }

        public Criteria andMorningBetween(Integer value1, Integer value2) {
            addCriterion("morning between", value1, value2, "morning");
            return (Criteria) this;
        }

        public Criteria andMorningNotBetween(Integer value1, Integer value2) {
            addCriterion("morning not between", value1, value2, "morning");
            return (Criteria) this;
        }

        public Criteria andNoonIsNull() {
            addCriterion("noon is null");
            return (Criteria) this;
        }

        public Criteria andNoonIsNotNull() {
            addCriterion("noon is not null");
            return (Criteria) this;
        }

        public Criteria andNoonEqualTo(Integer value) {
            addCriterion("noon =", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonNotEqualTo(Integer value) {
            addCriterion("noon <>", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonGreaterThan(Integer value) {
            addCriterion("noon >", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonGreaterThanOrEqualTo(Integer value) {
            addCriterion("noon >=", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonLessThan(Integer value) {
            addCriterion("noon <", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonLessThanOrEqualTo(Integer value) {
            addCriterion("noon <=", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonIn(List<Integer> values) {
            addCriterion("noon in", values, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonNotIn(List<Integer> values) {
            addCriterion("noon not in", values, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonBetween(Integer value1, Integer value2) {
            addCriterion("noon between", value1, value2, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonNotBetween(Integer value1, Integer value2) {
            addCriterion("noon not between", value1, value2, "noon");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user
     *
     * @mbg.generated
     */
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