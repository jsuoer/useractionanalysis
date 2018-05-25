package com.wf.user.service;

import com.wf.user.common.PageResult;
import com.wf.user.model.CityUser;
import com.wf.user.model.DateUser;
import com.wf.user.model.ProvinceUser;

import java.util.List;

public interface UserOfDate {

    /**
     * 获取前十天的用户注册信息
     * @return
     */
    List<DateUser> getLast10Dayregister();
    PageResult getLast10Dayregister2(int limit, int offset);

    /**
     * 查询指定时间段的 全国 的注册信息
     * @param startDate
     * @param endDate
     * @return
     */
    List<DateUser> getUserByTime(String startDate,String endDate);
    PageResult getUserByTimep(String startDate, String endDate, int limit, int offset);

    /**
     * 根据时间段查询 指定省份 的所有用户
     * @return
     */
    List<DateUser> getUserByTimeProvince(String startDate,String endDate,String provinceName);
    PageResult getUserByTimeProvincep(String startDate, String endDate, String provinceName, int limit, int offset);

    /**
     * 根据时间段查询 指定省份 指定市 的所有用户
     * @return
     */
    List<DateUser> getUserByTimeProvinceCity(String startDate,String endDate,String provinceName,String cityName);
    PageResult getUserByTimeProvinceCityp(String startDate, String endDate, String provinceName, String cityName, int limit, int offset);

    /**
     * 查询  日期段 之间的 所有省用户
     * @param startDate
     * @param endDate
     * @return
     */
    List<ProvinceUser> getProvinceUserBetweenDate(String startDate,String endDate);

    /**
     * 查询指定时间段的某个省份的 城市用户情况。。。
     * @param startDate
     * @param endDate
     * @param provinceName
     * @return
     */
    List<CityUser> getCityUserBetweenDateWithProvince(String startDate, String endDate,String provinceName);





}
