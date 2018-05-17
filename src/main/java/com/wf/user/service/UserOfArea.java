package com.wf.user.service;

import com.wf.user.model.CityUser;
import com.wf.user.model.ProvinceUser;

import java.util.List;

public interface UserOfArea {

    List<CityUser> getAllCityUser();
    List<ProvinceUser> getAllProvinceUser();

}
