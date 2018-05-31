package com.wf.user.dao;

import org.apache.ibatis.annotations.Param;

public interface ColorcoinMapper {

    /**
     * 省，市，范围  查找
     * @return
     */
    int usersRangeConin(@Param("min") int min, @Param("max") int max, @Param("provinceName") String provinceName, @Param("cityName") String cityName);


    /**
     * 省，市 所有用户
     * @return
     */
    int users(@Param("provinceName") String provinceName, @Param("cityName") String cityName);
}
