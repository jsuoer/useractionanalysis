package com.wf.user.dao.userPayActionDao;

import com.wf.user.model.AreaUserNum;
import com.wf.user.model.ProvinceUser;
import com.wf.user.model.UserPayInfo;
import com.wf.user.model.UserPaydatenametype;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PayFromDao {

    /**
     * 支付成功的方式类型，1：微信支付 2：支付宝
     * 省市选择
     * 充值范围
     * @param provinceName
     * @param cityName
     * @param payType
     * @return
     */
    int userPayType(@Param("min") String min, @Param("max") String max, @Param("startDate") String startDate, @Param("endDate") String endDate, @Param("provinceName") String provinceName, @Param("cityName") String cityName, @Param("payType") int payType);

    /**
     * 查询支付人的信息
     */
    List<UserPayInfo> getUserPayInfo(@Param("min") String min, @Param("max") String max, @Param("startDate") String startDate, @Param("endDate") String endDate, @Param("provinceName") String provinceName, @Param("cityName") String cityName);


    /**
     * 查询出地区的充值用户数量  省，，市
     */
    List<AreaUserNum> getUserPayNumP(@Param("min") String min, @Param("max") String max, @Param("startDate") String startDate, @Param("endDate") String endDate, @Param("provinceName") String provinceName);

    /**
     * 查询付款成功的用户信息
     */
    List<UserPaydatenametype> getUserPaysuccess(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("provinceName") String provinceName, @Param("cityName") String cityName);

    /**
     * 查询付款失败的用户信息
     */
    List<UserPaydatenametype> getUserPayfail(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("provinceName") String provinceName, @Param("cityName") String cityName);


}
