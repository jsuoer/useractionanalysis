package com.wf.user.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuyerOrExpertExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuyerOrExpertExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("IS_DELETED is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("IS_DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("IS_DELETED =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("IS_DELETED <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("IS_DELETED >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DELETED >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("IS_DELETED <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("IS_DELETED <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("IS_DELETED like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("IS_DELETED not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("IS_DELETED in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("IS_DELETED not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("IS_DELETED between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("IS_DELETED not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andModifyIsNull() {
            addCriterion("MODIFY is null");
            return (Criteria) this;
        }

        public Criteria andModifyIsNotNull() {
            addCriterion("MODIFY is not null");
            return (Criteria) this;
        }

        public Criteria andModifyEqualTo(String value) {
            addCriterion("MODIFY =", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyNotEqualTo(String value) {
            addCriterion("MODIFY <>", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyGreaterThan(String value) {
            addCriterion("MODIFY >", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY >=", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyLessThan(String value) {
            addCriterion("MODIFY <", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyLessThanOrEqualTo(String value) {
            addCriterion("MODIFY <=", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyLike(String value) {
            addCriterion("MODIFY like", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyNotLike(String value) {
            addCriterion("MODIFY not like", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyIn(List<String> values) {
            addCriterion("MODIFY in", values, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyNotIn(List<String> values) {
            addCriterion("MODIFY not in", values, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyBetween(String value1, String value2) {
            addCriterion("MODIFY between", value1, value2, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyNotBetween(String value1, String value2) {
            addCriterion("MODIFY not between", value1, value2, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("CITY_CODE =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("CITY_CODE <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("CITY_CODE >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_CODE >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("CITY_CODE <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("CITY_CODE <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("CITY_CODE like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("CITY_CODE not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("CITY_CODE in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("CITY_CODE not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("CITY_CODE between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("CITY_CODE not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andColorCoinsIsNull() {
            addCriterion("COLOR_COINS is null");
            return (Criteria) this;
        }

        public Criteria andColorCoinsIsNotNull() {
            addCriterion("COLOR_COINS is not null");
            return (Criteria) this;
        }

        public Criteria andColorCoinsEqualTo(BigDecimal value) {
            addCriterion("COLOR_COINS =", value, "colorCoins");
            return (Criteria) this;
        }

        public Criteria andColorCoinsNotEqualTo(BigDecimal value) {
            addCriterion("COLOR_COINS <>", value, "colorCoins");
            return (Criteria) this;
        }

        public Criteria andColorCoinsGreaterThan(BigDecimal value) {
            addCriterion("COLOR_COINS >", value, "colorCoins");
            return (Criteria) this;
        }

        public Criteria andColorCoinsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COLOR_COINS >=", value, "colorCoins");
            return (Criteria) this;
        }

        public Criteria andColorCoinsLessThan(BigDecimal value) {
            addCriterion("COLOR_COINS <", value, "colorCoins");
            return (Criteria) this;
        }

        public Criteria andColorCoinsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COLOR_COINS <=", value, "colorCoins");
            return (Criteria) this;
        }

        public Criteria andColorCoinsIn(List<BigDecimal> values) {
            addCriterion("COLOR_COINS in", values, "colorCoins");
            return (Criteria) this;
        }

        public Criteria andColorCoinsNotIn(List<BigDecimal> values) {
            addCriterion("COLOR_COINS not in", values, "colorCoins");
            return (Criteria) this;
        }

        public Criteria andColorCoinsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COLOR_COINS between", value1, value2, "colorCoins");
            return (Criteria) this;
        }

        public Criteria andColorCoinsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COLOR_COINS not between", value1, value2, "colorCoins");
            return (Criteria) this;
        }

        public Criteria andCoordinateIsNull() {
            addCriterion("COORDINATE is null");
            return (Criteria) this;
        }

        public Criteria andCoordinateIsNotNull() {
            addCriterion("COORDINATE is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinateEqualTo(String value) {
            addCriterion("COORDINATE =", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotEqualTo(String value) {
            addCriterion("COORDINATE <>", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateGreaterThan(String value) {
            addCriterion("COORDINATE >", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateGreaterThanOrEqualTo(String value) {
            addCriterion("COORDINATE >=", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLessThan(String value) {
            addCriterion("COORDINATE <", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLessThanOrEqualTo(String value) {
            addCriterion("COORDINATE <=", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLike(String value) {
            addCriterion("COORDINATE like", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotLike(String value) {
            addCriterion("COORDINATE not like", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateIn(List<String> values) {
            addCriterion("COORDINATE in", values, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotIn(List<String> values) {
            addCriterion("COORDINATE not in", values, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateBetween(String value1, String value2) {
            addCriterion("COORDINATE between", value1, value2, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotBetween(String value1, String value2) {
            addCriterion("COORDINATE not between", value1, value2, "coordinate");
            return (Criteria) this;
        }

        public Criteria andHandselIsNull() {
            addCriterion("HANDSEL is null");
            return (Criteria) this;
        }

        public Criteria andHandselIsNotNull() {
            addCriterion("HANDSEL is not null");
            return (Criteria) this;
        }

        public Criteria andHandselEqualTo(BigDecimal value) {
            addCriterion("HANDSEL =", value, "handsel");
            return (Criteria) this;
        }

        public Criteria andHandselNotEqualTo(BigDecimal value) {
            addCriterion("HANDSEL <>", value, "handsel");
            return (Criteria) this;
        }

        public Criteria andHandselGreaterThan(BigDecimal value) {
            addCriterion("HANDSEL >", value, "handsel");
            return (Criteria) this;
        }

        public Criteria andHandselGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HANDSEL >=", value, "handsel");
            return (Criteria) this;
        }

        public Criteria andHandselLessThan(BigDecimal value) {
            addCriterion("HANDSEL <", value, "handsel");
            return (Criteria) this;
        }

        public Criteria andHandselLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HANDSEL <=", value, "handsel");
            return (Criteria) this;
        }

        public Criteria andHandselIn(List<BigDecimal> values) {
            addCriterion("HANDSEL in", values, "handsel");
            return (Criteria) this;
        }

        public Criteria andHandselNotIn(List<BigDecimal> values) {
            addCriterion("HANDSEL not in", values, "handsel");
            return (Criteria) this;
        }

        public Criteria andHandselBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HANDSEL between", value1, value2, "handsel");
            return (Criteria) this;
        }

        public Criteria andHandselNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HANDSEL not between", value1, value2, "handsel");
            return (Criteria) this;
        }

        public Criteria andIsExpertIsNull() {
            addCriterion("IS_EXPERT is null");
            return (Criteria) this;
        }

        public Criteria andIsExpertIsNotNull() {
            addCriterion("IS_EXPERT is not null");
            return (Criteria) this;
        }

        public Criteria andIsExpertEqualTo(String value) {
            addCriterion("IS_EXPERT =", value, "isExpert");
            return (Criteria) this;
        }

        public Criteria andIsExpertNotEqualTo(String value) {
            addCriterion("IS_EXPERT <>", value, "isExpert");
            return (Criteria) this;
        }

        public Criteria andIsExpertGreaterThan(String value) {
            addCriterion("IS_EXPERT >", value, "isExpert");
            return (Criteria) this;
        }

        public Criteria andIsExpertGreaterThanOrEqualTo(String value) {
            addCriterion("IS_EXPERT >=", value, "isExpert");
            return (Criteria) this;
        }

        public Criteria andIsExpertLessThan(String value) {
            addCriterion("IS_EXPERT <", value, "isExpert");
            return (Criteria) this;
        }

        public Criteria andIsExpertLessThanOrEqualTo(String value) {
            addCriterion("IS_EXPERT <=", value, "isExpert");
            return (Criteria) this;
        }

        public Criteria andIsExpertLike(String value) {
            addCriterion("IS_EXPERT like", value, "isExpert");
            return (Criteria) this;
        }

        public Criteria andIsExpertNotLike(String value) {
            addCriterion("IS_EXPERT not like", value, "isExpert");
            return (Criteria) this;
        }

        public Criteria andIsExpertIn(List<String> values) {
            addCriterion("IS_EXPERT in", values, "isExpert");
            return (Criteria) this;
        }

        public Criteria andIsExpertNotIn(List<String> values) {
            addCriterion("IS_EXPERT not in", values, "isExpert");
            return (Criteria) this;
        }

        public Criteria andIsExpertBetween(String value1, String value2) {
            addCriterion("IS_EXPERT between", value1, value2, "isExpert");
            return (Criteria) this;
        }

        public Criteria andIsExpertNotBetween(String value1, String value2) {
            addCriterion("IS_EXPERT not between", value1, value2, "isExpert");
            return (Criteria) this;
        }

        public Criteria andIsPhoneIsNull() {
            addCriterion("IS_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andIsPhoneIsNotNull() {
            addCriterion("IS_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andIsPhoneEqualTo(String value) {
            addCriterion("IS_PHONE =", value, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneNotEqualTo(String value) {
            addCriterion("IS_PHONE <>", value, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneGreaterThan(String value) {
            addCriterion("IS_PHONE >", value, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PHONE >=", value, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneLessThan(String value) {
            addCriterion("IS_PHONE <", value, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneLessThanOrEqualTo(String value) {
            addCriterion("IS_PHONE <=", value, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneLike(String value) {
            addCriterion("IS_PHONE like", value, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneNotLike(String value) {
            addCriterion("IS_PHONE not like", value, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneIn(List<String> values) {
            addCriterion("IS_PHONE in", values, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneNotIn(List<String> values) {
            addCriterion("IS_PHONE not in", values, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneBetween(String value1, String value2) {
            addCriterion("IS_PHONE between", value1, value2, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneNotBetween(String value1, String value2) {
            addCriterion("IS_PHONE not between", value1, value2, "isPhone");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNull() {
            addCriterion("PROVINCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("PROVINCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(String value) {
            addCriterion("PROVINCE_CODE =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(String value) {
            addCriterion("PROVINCE_CODE <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(String value) {
            addCriterion("PROVINCE_CODE >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CODE >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(String value) {
            addCriterion("PROVINCE_CODE <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CODE <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLike(String value) {
            addCriterion("PROVINCE_CODE like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotLike(String value) {
            addCriterion("PROVINCE_CODE not like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<String> values) {
            addCriterion("PROVINCE_CODE in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<String> values) {
            addCriterion("PROVINCE_CODE not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(String value1, String value2) {
            addCriterion("PROVINCE_CODE between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_CODE not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNull() {
            addCriterion("REGION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNotNull() {
            addCriterion("REGION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeEqualTo(String value) {
            addCriterion("REGION_CODE =", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotEqualTo(String value) {
            addCriterion("REGION_CODE <>", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThan(String value) {
            addCriterion("REGION_CODE >", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REGION_CODE >=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThan(String value) {
            addCriterion("REGION_CODE <", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThanOrEqualTo(String value) {
            addCriterion("REGION_CODE <=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLike(String value) {
            addCriterion("REGION_CODE like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotLike(String value) {
            addCriterion("REGION_CODE not like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIn(List<String> values) {
            addCriterion("REGION_CODE in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotIn(List<String> values) {
            addCriterion("REGION_CODE not in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeBetween(String value1, String value2) {
            addCriterion("REGION_CODE between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotBetween(String value1, String value2) {
            addCriterion("REGION_CODE not between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("TELEPHONE =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("TELEPHONE <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("TELEPHONE >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("TELEPHONE >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("TELEPHONE <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("TELEPHONE <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("TELEPHONE like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("TELEPHONE not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("TELEPHONE in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("TELEPHONE not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("TELEPHONE between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("TELEPHONE not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andRongyunIdIsNull() {
            addCriterion("RONGYUN_ID is null");
            return (Criteria) this;
        }

        public Criteria andRongyunIdIsNotNull() {
            addCriterion("RONGYUN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRongyunIdEqualTo(String value) {
            addCriterion("RONGYUN_ID =", value, "rongyunId");
            return (Criteria) this;
        }

        public Criteria andRongyunIdNotEqualTo(String value) {
            addCriterion("RONGYUN_ID <>", value, "rongyunId");
            return (Criteria) this;
        }

        public Criteria andRongyunIdGreaterThan(String value) {
            addCriterion("RONGYUN_ID >", value, "rongyunId");
            return (Criteria) this;
        }

        public Criteria andRongyunIdGreaterThanOrEqualTo(String value) {
            addCriterion("RONGYUN_ID >=", value, "rongyunId");
            return (Criteria) this;
        }

        public Criteria andRongyunIdLessThan(String value) {
            addCriterion("RONGYUN_ID <", value, "rongyunId");
            return (Criteria) this;
        }

        public Criteria andRongyunIdLessThanOrEqualTo(String value) {
            addCriterion("RONGYUN_ID <=", value, "rongyunId");
            return (Criteria) this;
        }

        public Criteria andRongyunIdLike(String value) {
            addCriterion("RONGYUN_ID like", value, "rongyunId");
            return (Criteria) this;
        }

        public Criteria andRongyunIdNotLike(String value) {
            addCriterion("RONGYUN_ID not like", value, "rongyunId");
            return (Criteria) this;
        }

        public Criteria andRongyunIdIn(List<String> values) {
            addCriterion("RONGYUN_ID in", values, "rongyunId");
            return (Criteria) this;
        }

        public Criteria andRongyunIdNotIn(List<String> values) {
            addCriterion("RONGYUN_ID not in", values, "rongyunId");
            return (Criteria) this;
        }

        public Criteria andRongyunIdBetween(String value1, String value2) {
            addCriterion("RONGYUN_ID between", value1, value2, "rongyunId");
            return (Criteria) this;
        }

        public Criteria andRongyunIdNotBetween(String value1, String value2) {
            addCriterion("RONGYUN_ID not between", value1, value2, "rongyunId");
            return (Criteria) this;
        }

        public Criteria andCailiaoNameIsNull() {
            addCriterion("CAILIAO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCailiaoNameIsNotNull() {
            addCriterion("CAILIAO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCailiaoNameEqualTo(String value) {
            addCriterion("CAILIAO_NAME =", value, "cailiaoName");
            return (Criteria) this;
        }

        public Criteria andCailiaoNameNotEqualTo(String value) {
            addCriterion("CAILIAO_NAME <>", value, "cailiaoName");
            return (Criteria) this;
        }

        public Criteria andCailiaoNameGreaterThan(String value) {
            addCriterion("CAILIAO_NAME >", value, "cailiaoName");
            return (Criteria) this;
        }

        public Criteria andCailiaoNameGreaterThanOrEqualTo(String value) {
            addCriterion("CAILIAO_NAME >=", value, "cailiaoName");
            return (Criteria) this;
        }

        public Criteria andCailiaoNameLessThan(String value) {
            addCriterion("CAILIAO_NAME <", value, "cailiaoName");
            return (Criteria) this;
        }

        public Criteria andCailiaoNameLessThanOrEqualTo(String value) {
            addCriterion("CAILIAO_NAME <=", value, "cailiaoName");
            return (Criteria) this;
        }

        public Criteria andCailiaoNameLike(String value) {
            addCriterion("CAILIAO_NAME like", value, "cailiaoName");
            return (Criteria) this;
        }

        public Criteria andCailiaoNameNotLike(String value) {
            addCriterion("CAILIAO_NAME not like", value, "cailiaoName");
            return (Criteria) this;
        }

        public Criteria andCailiaoNameIn(List<String> values) {
            addCriterion("CAILIAO_NAME in", values, "cailiaoName");
            return (Criteria) this;
        }

        public Criteria andCailiaoNameNotIn(List<String> values) {
            addCriterion("CAILIAO_NAME not in", values, "cailiaoName");
            return (Criteria) this;
        }

        public Criteria andCailiaoNameBetween(String value1, String value2) {
            addCriterion("CAILIAO_NAME between", value1, value2, "cailiaoName");
            return (Criteria) this;
        }

        public Criteria andCailiaoNameNotBetween(String value1, String value2) {
            addCriterion("CAILIAO_NAME not between", value1, value2, "cailiaoName");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("ID_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("ID_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("ID_NUMBER =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("ID_NUMBER <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("ID_NUMBER >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NUMBER >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("ID_NUMBER <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("ID_NUMBER <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("ID_NUMBER like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("ID_NUMBER not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("ID_NUMBER in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("ID_NUMBER not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("ID_NUMBER between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("ID_NUMBER not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBackImgIsNull() {
            addCriterion("ID_NUMBER_BACK_IMG is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberBackImgIsNotNull() {
            addCriterion("ID_NUMBER_BACK_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberBackImgEqualTo(String value) {
            addCriterion("ID_NUMBER_BACK_IMG =", value, "idNumberBackImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberBackImgNotEqualTo(String value) {
            addCriterion("ID_NUMBER_BACK_IMG <>", value, "idNumberBackImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberBackImgGreaterThan(String value) {
            addCriterion("ID_NUMBER_BACK_IMG >", value, "idNumberBackImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberBackImgGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NUMBER_BACK_IMG >=", value, "idNumberBackImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberBackImgLessThan(String value) {
            addCriterion("ID_NUMBER_BACK_IMG <", value, "idNumberBackImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberBackImgLessThanOrEqualTo(String value) {
            addCriterion("ID_NUMBER_BACK_IMG <=", value, "idNumberBackImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberBackImgLike(String value) {
            addCriterion("ID_NUMBER_BACK_IMG like", value, "idNumberBackImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberBackImgNotLike(String value) {
            addCriterion("ID_NUMBER_BACK_IMG not like", value, "idNumberBackImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberBackImgIn(List<String> values) {
            addCriterion("ID_NUMBER_BACK_IMG in", values, "idNumberBackImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberBackImgNotIn(List<String> values) {
            addCriterion("ID_NUMBER_BACK_IMG not in", values, "idNumberBackImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberBackImgBetween(String value1, String value2) {
            addCriterion("ID_NUMBER_BACK_IMG between", value1, value2, "idNumberBackImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberBackImgNotBetween(String value1, String value2) {
            addCriterion("ID_NUMBER_BACK_IMG not between", value1, value2, "idNumberBackImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberFrontImgIsNull() {
            addCriterion("ID_NUMBER_FRONT_IMG is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberFrontImgIsNotNull() {
            addCriterion("ID_NUMBER_FRONT_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberFrontImgEqualTo(String value) {
            addCriterion("ID_NUMBER_FRONT_IMG =", value, "idNumberFrontImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberFrontImgNotEqualTo(String value) {
            addCriterion("ID_NUMBER_FRONT_IMG <>", value, "idNumberFrontImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberFrontImgGreaterThan(String value) {
            addCriterion("ID_NUMBER_FRONT_IMG >", value, "idNumberFrontImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberFrontImgGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NUMBER_FRONT_IMG >=", value, "idNumberFrontImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberFrontImgLessThan(String value) {
            addCriterion("ID_NUMBER_FRONT_IMG <", value, "idNumberFrontImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberFrontImgLessThanOrEqualTo(String value) {
            addCriterion("ID_NUMBER_FRONT_IMG <=", value, "idNumberFrontImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberFrontImgLike(String value) {
            addCriterion("ID_NUMBER_FRONT_IMG like", value, "idNumberFrontImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberFrontImgNotLike(String value) {
            addCriterion("ID_NUMBER_FRONT_IMG not like", value, "idNumberFrontImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberFrontImgIn(List<String> values) {
            addCriterion("ID_NUMBER_FRONT_IMG in", values, "idNumberFrontImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberFrontImgNotIn(List<String> values) {
            addCriterion("ID_NUMBER_FRONT_IMG not in", values, "idNumberFrontImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberFrontImgBetween(String value1, String value2) {
            addCriterion("ID_NUMBER_FRONT_IMG between", value1, value2, "idNumberFrontImg");
            return (Criteria) this;
        }

        public Criteria andIdNumberFrontImgNotBetween(String value1, String value2) {
            addCriterion("ID_NUMBER_FRONT_IMG not between", value1, value2, "idNumberFrontImg");
            return (Criteria) this;
        }

        public Criteria andIsRobotIsNull() {
            addCriterion("IS_ROBOT is null");
            return (Criteria) this;
        }

        public Criteria andIsRobotIsNotNull() {
            addCriterion("IS_ROBOT is not null");
            return (Criteria) this;
        }

        public Criteria andIsRobotEqualTo(String value) {
            addCriterion("IS_ROBOT =", value, "isRobot");
            return (Criteria) this;
        }

        public Criteria andIsRobotNotEqualTo(String value) {
            addCriterion("IS_ROBOT <>", value, "isRobot");
            return (Criteria) this;
        }

        public Criteria andIsRobotGreaterThan(String value) {
            addCriterion("IS_ROBOT >", value, "isRobot");
            return (Criteria) this;
        }

        public Criteria andIsRobotGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ROBOT >=", value, "isRobot");
            return (Criteria) this;
        }

        public Criteria andIsRobotLessThan(String value) {
            addCriterion("IS_ROBOT <", value, "isRobot");
            return (Criteria) this;
        }

        public Criteria andIsRobotLessThanOrEqualTo(String value) {
            addCriterion("IS_ROBOT <=", value, "isRobot");
            return (Criteria) this;
        }

        public Criteria andIsRobotLike(String value) {
            addCriterion("IS_ROBOT like", value, "isRobot");
            return (Criteria) this;
        }

        public Criteria andIsRobotNotLike(String value) {
            addCriterion("IS_ROBOT not like", value, "isRobot");
            return (Criteria) this;
        }

        public Criteria andIsRobotIn(List<String> values) {
            addCriterion("IS_ROBOT in", values, "isRobot");
            return (Criteria) this;
        }

        public Criteria andIsRobotNotIn(List<String> values) {
            addCriterion("IS_ROBOT not in", values, "isRobot");
            return (Criteria) this;
        }

        public Criteria andIsRobotBetween(String value1, String value2) {
            addCriterion("IS_ROBOT between", value1, value2, "isRobot");
            return (Criteria) this;
        }

        public Criteria andIsRobotNotBetween(String value1, String value2) {
            addCriterion("IS_ROBOT not between", value1, value2, "isRobot");
            return (Criteria) this;
        }

        public Criteria andIsStationOwnerIsNull() {
            addCriterion("IS_STATION_OWNER is null");
            return (Criteria) this;
        }

        public Criteria andIsStationOwnerIsNotNull() {
            addCriterion("IS_STATION_OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andIsStationOwnerEqualTo(String value) {
            addCriterion("IS_STATION_OWNER =", value, "isStationOwner");
            return (Criteria) this;
        }

        public Criteria andIsStationOwnerNotEqualTo(String value) {
            addCriterion("IS_STATION_OWNER <>", value, "isStationOwner");
            return (Criteria) this;
        }

        public Criteria andIsStationOwnerGreaterThan(String value) {
            addCriterion("IS_STATION_OWNER >", value, "isStationOwner");
            return (Criteria) this;
        }

        public Criteria andIsStationOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("IS_STATION_OWNER >=", value, "isStationOwner");
            return (Criteria) this;
        }

        public Criteria andIsStationOwnerLessThan(String value) {
            addCriterion("IS_STATION_OWNER <", value, "isStationOwner");
            return (Criteria) this;
        }

        public Criteria andIsStationOwnerLessThanOrEqualTo(String value) {
            addCriterion("IS_STATION_OWNER <=", value, "isStationOwner");
            return (Criteria) this;
        }

        public Criteria andIsStationOwnerLike(String value) {
            addCriterion("IS_STATION_OWNER like", value, "isStationOwner");
            return (Criteria) this;
        }

        public Criteria andIsStationOwnerNotLike(String value) {
            addCriterion("IS_STATION_OWNER not like", value, "isStationOwner");
            return (Criteria) this;
        }

        public Criteria andIsStationOwnerIn(List<String> values) {
            addCriterion("IS_STATION_OWNER in", values, "isStationOwner");
            return (Criteria) this;
        }

        public Criteria andIsStationOwnerNotIn(List<String> values) {
            addCriterion("IS_STATION_OWNER not in", values, "isStationOwner");
            return (Criteria) this;
        }

        public Criteria andIsStationOwnerBetween(String value1, String value2) {
            addCriterion("IS_STATION_OWNER between", value1, value2, "isStationOwner");
            return (Criteria) this;
        }

        public Criteria andIsStationOwnerNotBetween(String value1, String value2) {
            addCriterion("IS_STATION_OWNER not between", value1, value2, "isStationOwner");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("POST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("POST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("POST_CODE =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("POST_CODE <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("POST_CODE >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("POST_CODE >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("POST_CODE <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("POST_CODE <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("POST_CODE like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("POST_CODE not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("POST_CODE in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("POST_CODE not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("POST_CODE between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("POST_CODE not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNull() {
            addCriterion("SIGNATURE is null");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNotNull() {
            addCriterion("SIGNATURE is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureEqualTo(String value) {
            addCriterion("SIGNATURE =", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotEqualTo(String value) {
            addCriterion("SIGNATURE <>", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThan(String value) {
            addCriterion("SIGNATURE >", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNATURE >=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThan(String value) {
            addCriterion("SIGNATURE <", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThanOrEqualTo(String value) {
            addCriterion("SIGNATURE <=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLike(String value) {
            addCriterion("SIGNATURE like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotLike(String value) {
            addCriterion("SIGNATURE not like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureIn(List<String> values) {
            addCriterion("SIGNATURE in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotIn(List<String> values) {
            addCriterion("SIGNATURE not in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureBetween(String value1, String value2) {
            addCriterion("SIGNATURE between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotBetween(String value1, String value2) {
            addCriterion("SIGNATURE not between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("TOKEN =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("TOKEN <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("TOKEN >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("TOKEN >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("TOKEN <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("TOKEN <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("TOKEN like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("TOKEN not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("TOKEN in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("TOKEN not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("TOKEN between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("TOKEN not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTouXiangIsNull() {
            addCriterion("TOU_XIANG is null");
            return (Criteria) this;
        }

        public Criteria andTouXiangIsNotNull() {
            addCriterion("TOU_XIANG is not null");
            return (Criteria) this;
        }

        public Criteria andTouXiangEqualTo(String value) {
            addCriterion("TOU_XIANG =", value, "touXiang");
            return (Criteria) this;
        }

        public Criteria andTouXiangNotEqualTo(String value) {
            addCriterion("TOU_XIANG <>", value, "touXiang");
            return (Criteria) this;
        }

        public Criteria andTouXiangGreaterThan(String value) {
            addCriterion("TOU_XIANG >", value, "touXiang");
            return (Criteria) this;
        }

        public Criteria andTouXiangGreaterThanOrEqualTo(String value) {
            addCriterion("TOU_XIANG >=", value, "touXiang");
            return (Criteria) this;
        }

        public Criteria andTouXiangLessThan(String value) {
            addCriterion("TOU_XIANG <", value, "touXiang");
            return (Criteria) this;
        }

        public Criteria andTouXiangLessThanOrEqualTo(String value) {
            addCriterion("TOU_XIANG <=", value, "touXiang");
            return (Criteria) this;
        }

        public Criteria andTouXiangLike(String value) {
            addCriterion("TOU_XIANG like", value, "touXiang");
            return (Criteria) this;
        }

        public Criteria andTouXiangNotLike(String value) {
            addCriterion("TOU_XIANG not like", value, "touXiang");
            return (Criteria) this;
        }

        public Criteria andTouXiangIn(List<String> values) {
            addCriterion("TOU_XIANG in", values, "touXiang");
            return (Criteria) this;
        }

        public Criteria andTouXiangNotIn(List<String> values) {
            addCriterion("TOU_XIANG not in", values, "touXiang");
            return (Criteria) this;
        }

        public Criteria andTouXiangBetween(String value1, String value2) {
            addCriterion("TOU_XIANG between", value1, value2, "touXiang");
            return (Criteria) this;
        }

        public Criteria andTouXiangNotBetween(String value1, String value2) {
            addCriterion("TOU_XIANG not between", value1, value2, "touXiang");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIsNull() {
            addCriterion("INVITE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIsNotNull() {
            addCriterion("INVITE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeEqualTo(String value) {
            addCriterion("INVITE_CODE =", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotEqualTo(String value) {
            addCriterion("INVITE_CODE <>", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeGreaterThan(String value) {
            addCriterion("INVITE_CODE >", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INVITE_CODE >=", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLessThan(String value) {
            addCriterion("INVITE_CODE <", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLessThanOrEqualTo(String value) {
            addCriterion("INVITE_CODE <=", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLike(String value) {
            addCriterion("INVITE_CODE like", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotLike(String value) {
            addCriterion("INVITE_CODE not like", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIn(List<String> values) {
            addCriterion("INVITE_CODE in", values, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotIn(List<String> values) {
            addCriterion("INVITE_CODE not in", values, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeBetween(String value1, String value2) {
            addCriterion("INVITE_CODE between", value1, value2, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotBetween(String value1, String value2) {
            addCriterion("INVITE_CODE not between", value1, value2, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andIsVirtualIsNull() {
            addCriterion("IS_VIRTUAL is null");
            return (Criteria) this;
        }

        public Criteria andIsVirtualIsNotNull() {
            addCriterion("IS_VIRTUAL is not null");
            return (Criteria) this;
        }

        public Criteria andIsVirtualEqualTo(String value) {
            addCriterion("IS_VIRTUAL =", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotEqualTo(String value) {
            addCriterion("IS_VIRTUAL <>", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualGreaterThan(String value) {
            addCriterion("IS_VIRTUAL >", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualGreaterThanOrEqualTo(String value) {
            addCriterion("IS_VIRTUAL >=", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualLessThan(String value) {
            addCriterion("IS_VIRTUAL <", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualLessThanOrEqualTo(String value) {
            addCriterion("IS_VIRTUAL <=", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualLike(String value) {
            addCriterion("IS_VIRTUAL like", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotLike(String value) {
            addCriterion("IS_VIRTUAL not like", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualIn(List<String> values) {
            addCriterion("IS_VIRTUAL in", values, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotIn(List<String> values) {
            addCriterion("IS_VIRTUAL not in", values, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualBetween(String value1, String value2) {
            addCriterion("IS_VIRTUAL between", value1, value2, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotBetween(String value1, String value2) {
            addCriterion("IS_VIRTUAL not between", value1, value2, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andFromAppIsNull() {
            addCriterion("FROM_APP is null");
            return (Criteria) this;
        }

        public Criteria andFromAppIsNotNull() {
            addCriterion("FROM_APP is not null");
            return (Criteria) this;
        }

        public Criteria andFromAppEqualTo(String value) {
            addCriterion("FROM_APP =", value, "fromApp");
            return (Criteria) this;
        }

        public Criteria andFromAppNotEqualTo(String value) {
            addCriterion("FROM_APP <>", value, "fromApp");
            return (Criteria) this;
        }

        public Criteria andFromAppGreaterThan(String value) {
            addCriterion("FROM_APP >", value, "fromApp");
            return (Criteria) this;
        }

        public Criteria andFromAppGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_APP >=", value, "fromApp");
            return (Criteria) this;
        }

        public Criteria andFromAppLessThan(String value) {
            addCriterion("FROM_APP <", value, "fromApp");
            return (Criteria) this;
        }

        public Criteria andFromAppLessThanOrEqualTo(String value) {
            addCriterion("FROM_APP <=", value, "fromApp");
            return (Criteria) this;
        }

        public Criteria andFromAppLike(String value) {
            addCriterion("FROM_APP like", value, "fromApp");
            return (Criteria) this;
        }

        public Criteria andFromAppNotLike(String value) {
            addCriterion("FROM_APP not like", value, "fromApp");
            return (Criteria) this;
        }

        public Criteria andFromAppIn(List<String> values) {
            addCriterion("FROM_APP in", values, "fromApp");
            return (Criteria) this;
        }

        public Criteria andFromAppNotIn(List<String> values) {
            addCriterion("FROM_APP not in", values, "fromApp");
            return (Criteria) this;
        }

        public Criteria andFromAppBetween(String value1, String value2) {
            addCriterion("FROM_APP between", value1, value2, "fromApp");
            return (Criteria) this;
        }

        public Criteria andFromAppNotBetween(String value1, String value2) {
            addCriterion("FROM_APP not between", value1, value2, "fromApp");
            return (Criteria) this;
        }

        public Criteria andUserTokenIsNull() {
            addCriterion("USER_TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andUserTokenIsNotNull() {
            addCriterion("USER_TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andUserTokenEqualTo(String value) {
            addCriterion("USER_TOKEN =", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenNotEqualTo(String value) {
            addCriterion("USER_TOKEN <>", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenGreaterThan(String value) {
            addCriterion("USER_TOKEN >", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TOKEN >=", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenLessThan(String value) {
            addCriterion("USER_TOKEN <", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenLessThanOrEqualTo(String value) {
            addCriterion("USER_TOKEN <=", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenLike(String value) {
            addCriterion("USER_TOKEN like", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenNotLike(String value) {
            addCriterion("USER_TOKEN not like", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenIn(List<String> values) {
            addCriterion("USER_TOKEN in", values, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenNotIn(List<String> values) {
            addCriterion("USER_TOKEN not in", values, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenBetween(String value1, String value2) {
            addCriterion("USER_TOKEN between", value1, value2, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenNotBetween(String value1, String value2) {
            addCriterion("USER_TOKEN not between", value1, value2, "userToken");
            return (Criteria) this;
        }

        public Criteria andAlreadyLoginIsNull() {
            addCriterion("ALREADY_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andAlreadyLoginIsNotNull() {
            addCriterion("ALREADY_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadyLoginEqualTo(Integer value) {
            addCriterion("ALREADY_LOGIN =", value, "alreadyLogin");
            return (Criteria) this;
        }

        public Criteria andAlreadyLoginNotEqualTo(Integer value) {
            addCriterion("ALREADY_LOGIN <>", value, "alreadyLogin");
            return (Criteria) this;
        }

        public Criteria andAlreadyLoginGreaterThan(Integer value) {
            addCriterion("ALREADY_LOGIN >", value, "alreadyLogin");
            return (Criteria) this;
        }

        public Criteria andAlreadyLoginGreaterThanOrEqualTo(Integer value) {
            addCriterion("ALREADY_LOGIN >=", value, "alreadyLogin");
            return (Criteria) this;
        }

        public Criteria andAlreadyLoginLessThan(Integer value) {
            addCriterion("ALREADY_LOGIN <", value, "alreadyLogin");
            return (Criteria) this;
        }

        public Criteria andAlreadyLoginLessThanOrEqualTo(Integer value) {
            addCriterion("ALREADY_LOGIN <=", value, "alreadyLogin");
            return (Criteria) this;
        }

        public Criteria andAlreadyLoginIn(List<Integer> values) {
            addCriterion("ALREADY_LOGIN in", values, "alreadyLogin");
            return (Criteria) this;
        }

        public Criteria andAlreadyLoginNotIn(List<Integer> values) {
            addCriterion("ALREADY_LOGIN not in", values, "alreadyLogin");
            return (Criteria) this;
        }

        public Criteria andAlreadyLoginBetween(Integer value1, Integer value2) {
            addCriterion("ALREADY_LOGIN between", value1, value2, "alreadyLogin");
            return (Criteria) this;
        }

        public Criteria andAlreadyLoginNotBetween(Integer value1, Integer value2) {
            addCriterion("ALREADY_LOGIN not between", value1, value2, "alreadyLogin");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdIsNull() {
            addCriterion("WX_OPEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdIsNotNull() {
            addCriterion("WX_OPEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdEqualTo(String value) {
            addCriterion("WX_OPEN_ID =", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotEqualTo(String value) {
            addCriterion("WX_OPEN_ID <>", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdGreaterThan(String value) {
            addCriterion("WX_OPEN_ID >", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("WX_OPEN_ID >=", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdLessThan(String value) {
            addCriterion("WX_OPEN_ID <", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdLessThanOrEqualTo(String value) {
            addCriterion("WX_OPEN_ID <=", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdLike(String value) {
            addCriterion("WX_OPEN_ID like", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotLike(String value) {
            addCriterion("WX_OPEN_ID not like", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdIn(List<String> values) {
            addCriterion("WX_OPEN_ID in", values, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotIn(List<String> values) {
            addCriterion("WX_OPEN_ID not in", values, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdBetween(String value1, String value2) {
            addCriterion("WX_OPEN_ID between", value1, value2, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotBetween(String value1, String value2) {
            addCriterion("WX_OPEN_ID not between", value1, value2, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andColume1IsNull() {
            addCriterion("COLUME1 is null");
            return (Criteria) this;
        }

        public Criteria andColume1IsNotNull() {
            addCriterion("COLUME1 is not null");
            return (Criteria) this;
        }

        public Criteria andColume1EqualTo(String value) {
            addCriterion("COLUME1 =", value, "colume1");
            return (Criteria) this;
        }

        public Criteria andColume1NotEqualTo(String value) {
            addCriterion("COLUME1 <>", value, "colume1");
            return (Criteria) this;
        }

        public Criteria andColume1GreaterThan(String value) {
            addCriterion("COLUME1 >", value, "colume1");
            return (Criteria) this;
        }

        public Criteria andColume1GreaterThanOrEqualTo(String value) {
            addCriterion("COLUME1 >=", value, "colume1");
            return (Criteria) this;
        }

        public Criteria andColume1LessThan(String value) {
            addCriterion("COLUME1 <", value, "colume1");
            return (Criteria) this;
        }

        public Criteria andColume1LessThanOrEqualTo(String value) {
            addCriterion("COLUME1 <=", value, "colume1");
            return (Criteria) this;
        }

        public Criteria andColume1Like(String value) {
            addCriterion("COLUME1 like", value, "colume1");
            return (Criteria) this;
        }

        public Criteria andColume1NotLike(String value) {
            addCriterion("COLUME1 not like", value, "colume1");
            return (Criteria) this;
        }

        public Criteria andColume1In(List<String> values) {
            addCriterion("COLUME1 in", values, "colume1");
            return (Criteria) this;
        }

        public Criteria andColume1NotIn(List<String> values) {
            addCriterion("COLUME1 not in", values, "colume1");
            return (Criteria) this;
        }

        public Criteria andColume1Between(String value1, String value2) {
            addCriterion("COLUME1 between", value1, value2, "colume1");
            return (Criteria) this;
        }

        public Criteria andColume1NotBetween(String value1, String value2) {
            addCriterion("COLUME1 not between", value1, value2, "colume1");
            return (Criteria) this;
        }

        public Criteria andColume2IsNull() {
            addCriterion("COLUME2 is null");
            return (Criteria) this;
        }

        public Criteria andColume2IsNotNull() {
            addCriterion("COLUME2 is not null");
            return (Criteria) this;
        }

        public Criteria andColume2EqualTo(String value) {
            addCriterion("COLUME2 =", value, "colume2");
            return (Criteria) this;
        }

        public Criteria andColume2NotEqualTo(String value) {
            addCriterion("COLUME2 <>", value, "colume2");
            return (Criteria) this;
        }

        public Criteria andColume2GreaterThan(String value) {
            addCriterion("COLUME2 >", value, "colume2");
            return (Criteria) this;
        }

        public Criteria andColume2GreaterThanOrEqualTo(String value) {
            addCriterion("COLUME2 >=", value, "colume2");
            return (Criteria) this;
        }

        public Criteria andColume2LessThan(String value) {
            addCriterion("COLUME2 <", value, "colume2");
            return (Criteria) this;
        }

        public Criteria andColume2LessThanOrEqualTo(String value) {
            addCriterion("COLUME2 <=", value, "colume2");
            return (Criteria) this;
        }

        public Criteria andColume2Like(String value) {
            addCriterion("COLUME2 like", value, "colume2");
            return (Criteria) this;
        }

        public Criteria andColume2NotLike(String value) {
            addCriterion("COLUME2 not like", value, "colume2");
            return (Criteria) this;
        }

        public Criteria andColume2In(List<String> values) {
            addCriterion("COLUME2 in", values, "colume2");
            return (Criteria) this;
        }

        public Criteria andColume2NotIn(List<String> values) {
            addCriterion("COLUME2 not in", values, "colume2");
            return (Criteria) this;
        }

        public Criteria andColume2Between(String value1, String value2) {
            addCriterion("COLUME2 between", value1, value2, "colume2");
            return (Criteria) this;
        }

        public Criteria andColume2NotBetween(String value1, String value2) {
            addCriterion("COLUME2 not between", value1, value2, "colume2");
            return (Criteria) this;
        }

        public Criteria andColume3IsNull() {
            addCriterion("COLUME3 is null");
            return (Criteria) this;
        }

        public Criteria andColume3IsNotNull() {
            addCriterion("COLUME3 is not null");
            return (Criteria) this;
        }

        public Criteria andColume3EqualTo(String value) {
            addCriterion("COLUME3 =", value, "colume3");
            return (Criteria) this;
        }

        public Criteria andColume3NotEqualTo(String value) {
            addCriterion("COLUME3 <>", value, "colume3");
            return (Criteria) this;
        }

        public Criteria andColume3GreaterThan(String value) {
            addCriterion("COLUME3 >", value, "colume3");
            return (Criteria) this;
        }

        public Criteria andColume3GreaterThanOrEqualTo(String value) {
            addCriterion("COLUME3 >=", value, "colume3");
            return (Criteria) this;
        }

        public Criteria andColume3LessThan(String value) {
            addCriterion("COLUME3 <", value, "colume3");
            return (Criteria) this;
        }

        public Criteria andColume3LessThanOrEqualTo(String value) {
            addCriterion("COLUME3 <=", value, "colume3");
            return (Criteria) this;
        }

        public Criteria andColume3Like(String value) {
            addCriterion("COLUME3 like", value, "colume3");
            return (Criteria) this;
        }

        public Criteria andColume3NotLike(String value) {
            addCriterion("COLUME3 not like", value, "colume3");
            return (Criteria) this;
        }

        public Criteria andColume3In(List<String> values) {
            addCriterion("COLUME3 in", values, "colume3");
            return (Criteria) this;
        }

        public Criteria andColume3NotIn(List<String> values) {
            addCriterion("COLUME3 not in", values, "colume3");
            return (Criteria) this;
        }

        public Criteria andColume3Between(String value1, String value2) {
            addCriterion("COLUME3 between", value1, value2, "colume3");
            return (Criteria) this;
        }

        public Criteria andColume3NotBetween(String value1, String value2) {
            addCriterion("COLUME3 not between", value1, value2, "colume3");
            return (Criteria) this;
        }

        public Criteria andInviteCodeOfProxyIsNull() {
            addCriterion("INVITE_CODE_OF_PROXY is null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeOfProxyIsNotNull() {
            addCriterion("INVITE_CODE_OF_PROXY is not null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeOfProxyEqualTo(String value) {
            addCriterion("INVITE_CODE_OF_PROXY =", value, "inviteCodeOfProxy");
            return (Criteria) this;
        }

        public Criteria andInviteCodeOfProxyNotEqualTo(String value) {
            addCriterion("INVITE_CODE_OF_PROXY <>", value, "inviteCodeOfProxy");
            return (Criteria) this;
        }

        public Criteria andInviteCodeOfProxyGreaterThan(String value) {
            addCriterion("INVITE_CODE_OF_PROXY >", value, "inviteCodeOfProxy");
            return (Criteria) this;
        }

        public Criteria andInviteCodeOfProxyGreaterThanOrEqualTo(String value) {
            addCriterion("INVITE_CODE_OF_PROXY >=", value, "inviteCodeOfProxy");
            return (Criteria) this;
        }

        public Criteria andInviteCodeOfProxyLessThan(String value) {
            addCriterion("INVITE_CODE_OF_PROXY <", value, "inviteCodeOfProxy");
            return (Criteria) this;
        }

        public Criteria andInviteCodeOfProxyLessThanOrEqualTo(String value) {
            addCriterion("INVITE_CODE_OF_PROXY <=", value, "inviteCodeOfProxy");
            return (Criteria) this;
        }

        public Criteria andInviteCodeOfProxyLike(String value) {
            addCriterion("INVITE_CODE_OF_PROXY like", value, "inviteCodeOfProxy");
            return (Criteria) this;
        }

        public Criteria andInviteCodeOfProxyNotLike(String value) {
            addCriterion("INVITE_CODE_OF_PROXY not like", value, "inviteCodeOfProxy");
            return (Criteria) this;
        }

        public Criteria andInviteCodeOfProxyIn(List<String> values) {
            addCriterion("INVITE_CODE_OF_PROXY in", values, "inviteCodeOfProxy");
            return (Criteria) this;
        }

        public Criteria andInviteCodeOfProxyNotIn(List<String> values) {
            addCriterion("INVITE_CODE_OF_PROXY not in", values, "inviteCodeOfProxy");
            return (Criteria) this;
        }

        public Criteria andInviteCodeOfProxyBetween(String value1, String value2) {
            addCriterion("INVITE_CODE_OF_PROXY between", value1, value2, "inviteCodeOfProxy");
            return (Criteria) this;
        }

        public Criteria andInviteCodeOfProxyNotBetween(String value1, String value2) {
            addCriterion("INVITE_CODE_OF_PROXY not between", value1, value2, "inviteCodeOfProxy");
            return (Criteria) this;
        }

        public Criteria andIsProxyIsNull() {
            addCriterion("IS_PROXY is null");
            return (Criteria) this;
        }

        public Criteria andIsProxyIsNotNull() {
            addCriterion("IS_PROXY is not null");
            return (Criteria) this;
        }

        public Criteria andIsProxyEqualTo(String value) {
            addCriterion("IS_PROXY =", value, "isProxy");
            return (Criteria) this;
        }

        public Criteria andIsProxyNotEqualTo(String value) {
            addCriterion("IS_PROXY <>", value, "isProxy");
            return (Criteria) this;
        }

        public Criteria andIsProxyGreaterThan(String value) {
            addCriterion("IS_PROXY >", value, "isProxy");
            return (Criteria) this;
        }

        public Criteria andIsProxyGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PROXY >=", value, "isProxy");
            return (Criteria) this;
        }

        public Criteria andIsProxyLessThan(String value) {
            addCriterion("IS_PROXY <", value, "isProxy");
            return (Criteria) this;
        }

        public Criteria andIsProxyLessThanOrEqualTo(String value) {
            addCriterion("IS_PROXY <=", value, "isProxy");
            return (Criteria) this;
        }

        public Criteria andIsProxyLike(String value) {
            addCriterion("IS_PROXY like", value, "isProxy");
            return (Criteria) this;
        }

        public Criteria andIsProxyNotLike(String value) {
            addCriterion("IS_PROXY not like", value, "isProxy");
            return (Criteria) this;
        }

        public Criteria andIsProxyIn(List<String> values) {
            addCriterion("IS_PROXY in", values, "isProxy");
            return (Criteria) this;
        }

        public Criteria andIsProxyNotIn(List<String> values) {
            addCriterion("IS_PROXY not in", values, "isProxy");
            return (Criteria) this;
        }

        public Criteria andIsProxyBetween(String value1, String value2) {
            addCriterion("IS_PROXY between", value1, value2, "isProxy");
            return (Criteria) this;
        }

        public Criteria andIsProxyNotBetween(String value1, String value2) {
            addCriterion("IS_PROXY not between", value1, value2, "isProxy");
            return (Criteria) this;
        }

        public Criteria andProxyInvitecodeIsNull() {
            addCriterion("PROXY_INVITECODE is null");
            return (Criteria) this;
        }

        public Criteria andProxyInvitecodeIsNotNull() {
            addCriterion("PROXY_INVITECODE is not null");
            return (Criteria) this;
        }

        public Criteria andProxyInvitecodeEqualTo(String value) {
            addCriterion("PROXY_INVITECODE =", value, "proxyInvitecode");
            return (Criteria) this;
        }

        public Criteria andProxyInvitecodeNotEqualTo(String value) {
            addCriterion("PROXY_INVITECODE <>", value, "proxyInvitecode");
            return (Criteria) this;
        }

        public Criteria andProxyInvitecodeGreaterThan(String value) {
            addCriterion("PROXY_INVITECODE >", value, "proxyInvitecode");
            return (Criteria) this;
        }

        public Criteria andProxyInvitecodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROXY_INVITECODE >=", value, "proxyInvitecode");
            return (Criteria) this;
        }

        public Criteria andProxyInvitecodeLessThan(String value) {
            addCriterion("PROXY_INVITECODE <", value, "proxyInvitecode");
            return (Criteria) this;
        }

        public Criteria andProxyInvitecodeLessThanOrEqualTo(String value) {
            addCriterion("PROXY_INVITECODE <=", value, "proxyInvitecode");
            return (Criteria) this;
        }

        public Criteria andProxyInvitecodeLike(String value) {
            addCriterion("PROXY_INVITECODE like", value, "proxyInvitecode");
            return (Criteria) this;
        }

        public Criteria andProxyInvitecodeNotLike(String value) {
            addCriterion("PROXY_INVITECODE not like", value, "proxyInvitecode");
            return (Criteria) this;
        }

        public Criteria andProxyInvitecodeIn(List<String> values) {
            addCriterion("PROXY_INVITECODE in", values, "proxyInvitecode");
            return (Criteria) this;
        }

        public Criteria andProxyInvitecodeNotIn(List<String> values) {
            addCriterion("PROXY_INVITECODE not in", values, "proxyInvitecode");
            return (Criteria) this;
        }

        public Criteria andProxyInvitecodeBetween(String value1, String value2) {
            addCriterion("PROXY_INVITECODE between", value1, value2, "proxyInvitecode");
            return (Criteria) this;
        }

        public Criteria andProxyInvitecodeNotBetween(String value1, String value2) {
            addCriterion("PROXY_INVITECODE not between", value1, value2, "proxyInvitecode");
            return (Criteria) this;
        }

        public Criteria andTvLoginIsNull() {
            addCriterion("TV_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andTvLoginIsNotNull() {
            addCriterion("TV_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andTvLoginEqualTo(String value) {
            addCriterion("TV_LOGIN =", value, "tvLogin");
            return (Criteria) this;
        }

        public Criteria andTvLoginNotEqualTo(String value) {
            addCriterion("TV_LOGIN <>", value, "tvLogin");
            return (Criteria) this;
        }

        public Criteria andTvLoginGreaterThan(String value) {
            addCriterion("TV_LOGIN >", value, "tvLogin");
            return (Criteria) this;
        }

        public Criteria andTvLoginGreaterThanOrEqualTo(String value) {
            addCriterion("TV_LOGIN >=", value, "tvLogin");
            return (Criteria) this;
        }

        public Criteria andTvLoginLessThan(String value) {
            addCriterion("TV_LOGIN <", value, "tvLogin");
            return (Criteria) this;
        }

        public Criteria andTvLoginLessThanOrEqualTo(String value) {
            addCriterion("TV_LOGIN <=", value, "tvLogin");
            return (Criteria) this;
        }

        public Criteria andTvLoginLike(String value) {
            addCriterion("TV_LOGIN like", value, "tvLogin");
            return (Criteria) this;
        }

        public Criteria andTvLoginNotLike(String value) {
            addCriterion("TV_LOGIN not like", value, "tvLogin");
            return (Criteria) this;
        }

        public Criteria andTvLoginIn(List<String> values) {
            addCriterion("TV_LOGIN in", values, "tvLogin");
            return (Criteria) this;
        }

        public Criteria andTvLoginNotIn(List<String> values) {
            addCriterion("TV_LOGIN not in", values, "tvLogin");
            return (Criteria) this;
        }

        public Criteria andTvLoginBetween(String value1, String value2) {
            addCriterion("TV_LOGIN between", value1, value2, "tvLogin");
            return (Criteria) this;
        }

        public Criteria andTvLoginNotBetween(String value1, String value2) {
            addCriterion("TV_LOGIN not between", value1, value2, "tvLogin");
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