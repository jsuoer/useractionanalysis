package com.wf.user.dao;

import com.wf.user.model.CityUser;
import com.wf.user.model.ProvinceUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserArea {

    List<CityUser> getUserBycity();

    /**
     * 获取所有省份的用户信息
     * @return
     */
    List<ProvinceUser> getUserByProvince();

    /**
     * 根据省份查询每个城市的用户数量
     */
    List<CityUser> getCityUsersByProvince(@Param("provinceName") String provinceName);

}
