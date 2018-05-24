package com.wf.user.service;

import com.wf.user.model.CityUser;
import com.wf.user.model.DateUser;
import com.wf.user.model.ProvinceUser;

import java.util.List;

public interface UserOfDate {

    List<DateUser> getLast10Dayregister();

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
