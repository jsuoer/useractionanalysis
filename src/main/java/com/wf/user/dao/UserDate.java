package com.wf.user.dao;

import com.wf.user.model.CityUser;
import com.wf.user.model.DateUser;
import com.wf.user.model.ProvinceUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDate {

    /**
     * 获取某一天注册用户的数量
     */
    int userRegisterInSameDay(@Param("date") String date);

    /**
     * 获取某一天,某个省的注册用户的数量
     */
    int userRegisterInSameDayinp(@Param("date") String date, @Param("provinceName") String provinceName);

    /**
     * 获取某一天,某个省，某个市，的注册用户的数量
     */
    int userRegisterInSameDayinpc(@Param("date") String date, @Param("cityName") String cityName);

    /**
     * 批量获取 指定某几天的用户数量 全国
     * @param days
     * @return
     */
    List<DateUser> userBatchDay(List days);
    /**
     * 批量获取 指定某几天的用户数量 城市
     * @param days
     * @return
     */
    List<DateUser> userBatchDayinc(@Param("days") List days, @Param("cityName") String cityName);

    /**
     * 批量获取 指定某几天的用户数量 某个省份
     * @param days
     * @return
     */
    List<DateUser> userBatchDayinp(@Param("days") List days, @Param("provinceName") String provinceName);



    /**
     * 根据时间段查询全国的所有用户
     * @return
     */
    List<DateUser> userByTime(@Param("startDate") String startDate, @Param("endDate") String endDate);

    /**
     * 根据时间段查询 指定省份 的所有用户
     * @return
     */
    List<DateUser> userByTimeProvince(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("provinceName") String provinceName);

    /**
     * 根据时间段查询 指定省份 指定市 的所有用户
     * @return
     */
    List<DateUser> userByTimeProvinceCity(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("provinceName") String provinceName, @Param("cityName") String cityName);

    /**
     * 获取前十天所有的用户注册数目
     */
    List<DateUser> last10DayRegisterUser();

    /**
     * 获取时间范围内的省用户
     * @param startDate
     * @param endDate
     * @return
     */
    List<ProvinceUser> getProvinceUserBetweenDate(@Param("startDate") String startDate, @Param("endDate") String endDate);

    /**
     * 查询指定时间段的某个省份的 城市用户情况。。。
     * @param startDate
     * @param endDate
     * @param provinceName
     * @return
     */
    List<CityUser> getCityUserBetweenDateWithProvince(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("provinceName") String provinceName);

}
