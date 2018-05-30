package com.wf.user.dao;

import org.apache.ibatis.annotations.Param;

public interface UserFromMapper {

    /**
     * 查询代理推荐用户 全国，全时间
     */
    int userProxy();
    /**
     * 查询代理推荐用户 全市，全时间
     */
    int userProxyinc(@Param("cityName") String cityName);
    /**
     * 查询代理推荐用户 全省，全时间
     */
    int userProxyinp(@Param("provinceName") String provinceName);
    /**
     * 查询代理推荐用户 全国，时间范围内
     */
    int userProxyDur(@Param("startDate") String startDate, @Param("endDate") String endDate);
    /**
     * 查询代理推荐用户 省，时间范围内
     */
    int userProxyDurinp(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("provinceName") String provinceName);
    /**
     * 查询代理推荐用户 市，时间范围内
     */
    int userProxyDurinc(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("cityName") String cityName);


    /**
     * 站主推荐 全国 全时间
     */
    int userStationOwner();
    /**
     * 站主推荐 全市 全时间
     */
    int userStationOwnerinc(@Param("cityName") String cityName);
    /**
     * 站主推荐 全省 全时间
     */
    int userStationOwnerinp(@Param("provinceName") String provinceName);
    /**
     * 查询站主推荐用户 全国，时间范围内
     */
    int userStationOwnerDur(@Param("startDate") String startDate, @Param("endDate") String endDate);
    /**
     * 查询站主推荐用户 省，时间范围内
     */
    int userStationOwnerDurinp(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("provinceName") String provinceName);
    /**
     * 查询站主推荐用户 市，时间范围内
     */
    int userStationOwnerDurinc(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("cityName") String cityName);

    /**
     * 自主注册  全国  全时间
     */
    int userSelf();
    /**
     * 自主注册  全市  全时间
     */
    int userSelfinc(@Param("cityName") String cityName);
    /**
     * 自主注册  全省  全时间
     */
    int userSelfinp(@Param("provinceName") String provinceName);
    /**
     * 自主注册  全国  时间范围内
     */
    int userSelfDur(@Param("startDate") String startDate, @Param("endDate") String endDate);
    /**
     * 自主注册  省  时间范围内
     */
    int userSelfDurinp(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("provinceName") String provinceName);
    /**
     * 自主注册  市  时间范围内
     */
    int userSelfDurinc(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("cityName") String cityName);


}
