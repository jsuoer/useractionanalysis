package com.wf.user.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProvinceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProvinceExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("PID like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("PID not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("PID not between", value1, value2, "pid");
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

        public Criteria andNationcodeIsNull() {
            addCriterion("NationCode is null");
            return (Criteria) this;
        }

        public Criteria andNationcodeIsNotNull() {
            addCriterion("NationCode is not null");
            return (Criteria) this;
        }

        public Criteria andNationcodeEqualTo(String value) {
            addCriterion("NationCode =", value, "nationcode");
            return (Criteria) this;
        }

        public Criteria andNationcodeNotEqualTo(String value) {
            addCriterion("NationCode <>", value, "nationcode");
            return (Criteria) this;
        }

        public Criteria andNationcodeGreaterThan(String value) {
            addCriterion("NationCode >", value, "nationcode");
            return (Criteria) this;
        }

        public Criteria andNationcodeGreaterThanOrEqualTo(String value) {
            addCriterion("NationCode >=", value, "nationcode");
            return (Criteria) this;
        }

        public Criteria andNationcodeLessThan(String value) {
            addCriterion("NationCode <", value, "nationcode");
            return (Criteria) this;
        }

        public Criteria andNationcodeLessThanOrEqualTo(String value) {
            addCriterion("NationCode <=", value, "nationcode");
            return (Criteria) this;
        }

        public Criteria andNationcodeLike(String value) {
            addCriterion("NationCode like", value, "nationcode");
            return (Criteria) this;
        }

        public Criteria andNationcodeNotLike(String value) {
            addCriterion("NationCode not like", value, "nationcode");
            return (Criteria) this;
        }

        public Criteria andNationcodeIn(List<String> values) {
            addCriterion("NationCode in", values, "nationcode");
            return (Criteria) this;
        }

        public Criteria andNationcodeNotIn(List<String> values) {
            addCriterion("NationCode not in", values, "nationcode");
            return (Criteria) this;
        }

        public Criteria andNationcodeBetween(String value1, String value2) {
            addCriterion("NationCode between", value1, value2, "nationcode");
            return (Criteria) this;
        }

        public Criteria andNationcodeNotBetween(String value1, String value2) {
            addCriterion("NationCode not between", value1, value2, "nationcode");
            return (Criteria) this;
        }

        public Criteria andPcodeIsNull() {
            addCriterion("Pcode is null");
            return (Criteria) this;
        }

        public Criteria andPcodeIsNotNull() {
            addCriterion("Pcode is not null");
            return (Criteria) this;
        }

        public Criteria andPcodeEqualTo(String value) {
            addCriterion("Pcode =", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotEqualTo(String value) {
            addCriterion("Pcode <>", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeGreaterThan(String value) {
            addCriterion("Pcode >", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeGreaterThanOrEqualTo(String value) {
            addCriterion("Pcode >=", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeLessThan(String value) {
            addCriterion("Pcode <", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeLessThanOrEqualTo(String value) {
            addCriterion("Pcode <=", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeLike(String value) {
            addCriterion("Pcode like", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotLike(String value) {
            addCriterion("Pcode not like", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeIn(List<String> values) {
            addCriterion("Pcode in", values, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotIn(List<String> values) {
            addCriterion("Pcode not in", values, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeBetween(String value1, String value2) {
            addCriterion("Pcode between", value1, value2, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotBetween(String value1, String value2) {
            addCriterion("Pcode not between", value1, value2, "pcode");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("Pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("Pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("Pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("Pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("Pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("Pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("Pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("Pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("Pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("Pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("Pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("Pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("Pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("Pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPrecordcreationdateIsNull() {
            addCriterion("PrecordCreationDate is null");
            return (Criteria) this;
        }

        public Criteria andPrecordcreationdateIsNotNull() {
            addCriterion("PrecordCreationDate is not null");
            return (Criteria) this;
        }

        public Criteria andPrecordcreationdateEqualTo(Date value) {
            addCriterion("PrecordCreationDate =", value, "precordcreationdate");
            return (Criteria) this;
        }

        public Criteria andPrecordcreationdateNotEqualTo(Date value) {
            addCriterion("PrecordCreationDate <>", value, "precordcreationdate");
            return (Criteria) this;
        }

        public Criteria andPrecordcreationdateGreaterThan(Date value) {
            addCriterion("PrecordCreationDate >", value, "precordcreationdate");
            return (Criteria) this;
        }

        public Criteria andPrecordcreationdateGreaterThanOrEqualTo(Date value) {
            addCriterion("PrecordCreationDate >=", value, "precordcreationdate");
            return (Criteria) this;
        }

        public Criteria andPrecordcreationdateLessThan(Date value) {
            addCriterion("PrecordCreationDate <", value, "precordcreationdate");
            return (Criteria) this;
        }

        public Criteria andPrecordcreationdateLessThanOrEqualTo(Date value) {
            addCriterion("PrecordCreationDate <=", value, "precordcreationdate");
            return (Criteria) this;
        }

        public Criteria andPrecordcreationdateIn(List<Date> values) {
            addCriterion("PrecordCreationDate in", values, "precordcreationdate");
            return (Criteria) this;
        }

        public Criteria andPrecordcreationdateNotIn(List<Date> values) {
            addCriterion("PrecordCreationDate not in", values, "precordcreationdate");
            return (Criteria) this;
        }

        public Criteria andPrecordcreationdateBetween(Date value1, Date value2) {
            addCriterion("PrecordCreationDate between", value1, value2, "precordcreationdate");
            return (Criteria) this;
        }

        public Criteria andPrecordcreationdateNotBetween(Date value1, Date value2) {
            addCriterion("PrecordCreationDate not between", value1, value2, "precordcreationdate");
            return (Criteria) this;
        }

        public Criteria andPrecordcreatorIsNull() {
            addCriterion("PrecordCreator is null");
            return (Criteria) this;
        }

        public Criteria andPrecordcreatorIsNotNull() {
            addCriterion("PrecordCreator is not null");
            return (Criteria) this;
        }

        public Criteria andPrecordcreatorEqualTo(String value) {
            addCriterion("PrecordCreator =", value, "precordcreator");
            return (Criteria) this;
        }

        public Criteria andPrecordcreatorNotEqualTo(String value) {
            addCriterion("PrecordCreator <>", value, "precordcreator");
            return (Criteria) this;
        }

        public Criteria andPrecordcreatorGreaterThan(String value) {
            addCriterion("PrecordCreator >", value, "precordcreator");
            return (Criteria) this;
        }

        public Criteria andPrecordcreatorGreaterThanOrEqualTo(String value) {
            addCriterion("PrecordCreator >=", value, "precordcreator");
            return (Criteria) this;
        }

        public Criteria andPrecordcreatorLessThan(String value) {
            addCriterion("PrecordCreator <", value, "precordcreator");
            return (Criteria) this;
        }

        public Criteria andPrecordcreatorLessThanOrEqualTo(String value) {
            addCriterion("PrecordCreator <=", value, "precordcreator");
            return (Criteria) this;
        }

        public Criteria andPrecordcreatorLike(String value) {
            addCriterion("PrecordCreator like", value, "precordcreator");
            return (Criteria) this;
        }

        public Criteria andPrecordcreatorNotLike(String value) {
            addCriterion("PrecordCreator not like", value, "precordcreator");
            return (Criteria) this;
        }

        public Criteria andPrecordcreatorIn(List<String> values) {
            addCriterion("PrecordCreator in", values, "precordcreator");
            return (Criteria) this;
        }

        public Criteria andPrecordcreatorNotIn(List<String> values) {
            addCriterion("PrecordCreator not in", values, "precordcreator");
            return (Criteria) this;
        }

        public Criteria andPrecordcreatorBetween(String value1, String value2) {
            addCriterion("PrecordCreator between", value1, value2, "precordcreator");
            return (Criteria) this;
        }

        public Criteria andPrecordcreatorNotBetween(String value1, String value2) {
            addCriterion("PrecordCreator not between", value1, value2, "precordcreator");
            return (Criteria) this;
        }

        public Criteria andPrecordversionIsNull() {
            addCriterion("PrecordVersion is null");
            return (Criteria) this;
        }

        public Criteria andPrecordversionIsNotNull() {
            addCriterion("PrecordVersion is not null");
            return (Criteria) this;
        }

        public Criteria andPrecordversionEqualTo(String value) {
            addCriterion("PrecordVersion =", value, "precordversion");
            return (Criteria) this;
        }

        public Criteria andPrecordversionNotEqualTo(String value) {
            addCriterion("PrecordVersion <>", value, "precordversion");
            return (Criteria) this;
        }

        public Criteria andPrecordversionGreaterThan(String value) {
            addCriterion("PrecordVersion >", value, "precordversion");
            return (Criteria) this;
        }

        public Criteria andPrecordversionGreaterThanOrEqualTo(String value) {
            addCriterion("PrecordVersion >=", value, "precordversion");
            return (Criteria) this;
        }

        public Criteria andPrecordversionLessThan(String value) {
            addCriterion("PrecordVersion <", value, "precordversion");
            return (Criteria) this;
        }

        public Criteria andPrecordversionLessThanOrEqualTo(String value) {
            addCriterion("PrecordVersion <=", value, "precordversion");
            return (Criteria) this;
        }

        public Criteria andPrecordversionLike(String value) {
            addCriterion("PrecordVersion like", value, "precordversion");
            return (Criteria) this;
        }

        public Criteria andPrecordversionNotLike(String value) {
            addCriterion("PrecordVersion not like", value, "precordversion");
            return (Criteria) this;
        }

        public Criteria andPrecordversionIn(List<String> values) {
            addCriterion("PrecordVersion in", values, "precordversion");
            return (Criteria) this;
        }

        public Criteria andPrecordversionNotIn(List<String> values) {
            addCriterion("PrecordVersion not in", values, "precordversion");
            return (Criteria) this;
        }

        public Criteria andPrecordversionBetween(String value1, String value2) {
            addCriterion("PrecordVersion between", value1, value2, "precordversion");
            return (Criteria) this;
        }

        public Criteria andPrecordversionNotBetween(String value1, String value2) {
            addCriterion("PrecordVersion not between", value1, value2, "precordversion");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("CREATER is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("CREATER is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("CREATER =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("CREATER <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("CREATER >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("CREATER >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("CREATER <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("CREATER <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("CREATER like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("CREATER not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("CREATER in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("CREATER not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("CREATER between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("CREATER not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIsNull() {
            addCriterion("CREATER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIsNotNull() {
            addCriterion("CREATER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeEqualTo(Date value) {
            addCriterion("CREATER_TIME =", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotEqualTo(Date value) {
            addCriterion("CREATER_TIME <>", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeGreaterThan(Date value) {
            addCriterion("CREATER_TIME >", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATER_TIME >=", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeLessThan(Date value) {
            addCriterion("CREATER_TIME <", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATER_TIME <=", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIn(List<Date> values) {
            addCriterion("CREATER_TIME in", values, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotIn(List<Date> values) {
            addCriterion("CREATER_TIME not in", values, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeBetween(Date value1, Date value2) {
            addCriterion("CREATER_TIME between", value1, value2, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATER_TIME not between", value1, value2, "createrTime");
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