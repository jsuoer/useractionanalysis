package com.wf.user.dao;

import com.wf.user.model.UserRegisteNoLogin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RegisterLoginMapper {

    /**
     * 用户一段时间内注册的情况 省市
     */
    int userregistenum(@Param("startdate") String startdate, @Param("enddate") String enddate, @Param("provinceName") String provinceName, @Param("cityName") String cityName);

    /**
     * 用户一段时间内 登陆 的情况 省市
     */
    int userloginnum(@Param("startdate") String startdate, @Param("enddate") String enddate, @Param("provinceName") String provinceName, @Param("cityName") String cityName);

    /**
     * 获取未登录用户的信息
     */
    List<UserRegisteNoLogin> getUserRegisteNoLogin(@Param("startdate") String startdate, @Param("enddate") String enddate, @Param("provinceName") String provinceName, @Param("cityName") String cityName);


}
