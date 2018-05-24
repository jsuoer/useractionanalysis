package com.wf.user.dao;

import com.wf.user.model.CityUser;
import com.wf.user.model.DateUser;
import com.wf.user.model.ProvinceUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDate {

    /**
     * 获取前十天的用户注册数目
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
