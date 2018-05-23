package com.wf.user.service.impl;

import com.wf.user.dao.UserArea;
import com.wf.user.model.CityUser;
import com.wf.user.model.ProvinceUser;
import com.wf.user.service.UserOfArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 按城市区分用户
 */
@Service
public class UserOfAreaImpl implements UserOfArea {

    @Autowired
    private UserArea userArea;

    /**
     * 获取每个城市的所有用户
     * @return
     */
    @Override
    public List<CityUser> getAllCityUser() {
        List<CityUser> userBycity = userArea.getUserBycity();
        return userBycity;
    }


    @Override
    public List<ProvinceUser> getAllProvinceUser() {
        List<ProvinceUser> userList = userArea.getUserByProvince();
        return userList;
    }

    @Override
    public List<CityUser> getCityUsersByProvinceName(String provinceName) {
        List<CityUser> list = userArea.getCityUsersByProvince(provinceName);
        return list;
    }
}
