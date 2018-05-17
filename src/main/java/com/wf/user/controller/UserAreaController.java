package com.wf.user.controller;

import com.wf.user.model.CityUser;
import com.wf.user.model.DateUser;
import com.wf.user.model.ProvinceUser;
import com.wf.user.service.UserOfArea;
import com.wf.user.service.UserOfDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 用户区域管理
 */
@Controller
public class UserAreaController {

    @Autowired
    private UserOfArea userOfCity;

    @Autowired
    private UserOfDate userOfDate;

    @ResponseBody
    @RequestMapping("/cityuser")
    public List<CityUser> aa(){
        List<CityUser> allCityUser = userOfCity.getAllCityUser();
        return allCityUser;
    }

    @ResponseBody
    @RequestMapping("/provinceuser")
    public List<ProvinceUser> ab(){
        List<ProvinceUser> allUser = userOfCity.getAllProvinceUser();
        return allUser;
    }

    @ResponseBody
    @RequestMapping("/dateuser")
    public List<DateUser> ad(){
        List<DateUser> users = userOfDate.getLast10Dayregister();
        return users;
    }



}
