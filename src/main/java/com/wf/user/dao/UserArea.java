package com.wf.user.dao;

import com.wf.user.model.CityUser;
import com.wf.user.model.ProvinceUser;

import java.util.List;

public interface UserArea {

    List<CityUser> getUserBycity();

    List<ProvinceUser> getUserByProvince();
}
