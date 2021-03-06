package com.wf.user.service;

import com.wf.user.common.PageResult;
import com.wf.user.model.CityUser;
import com.wf.user.model.ProvinceUser;

import java.util.List;

public interface UserOfArea {

    List<CityUser> getAllCityUser();

    /**
     * 获取每个省份的所有用户
     * @return
     */
    PageResult getAllProvinceUserPage(int pageSize, int offset);

    List<ProvinceUser> getAllProvinceUser();

    /**
     *
     * @return
     */
    List<CityUser> getCityUsersByProvinceName(String provinceName);

}
