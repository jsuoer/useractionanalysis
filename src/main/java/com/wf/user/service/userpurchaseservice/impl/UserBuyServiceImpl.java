package com.wf.user.service.userpurchaseservice.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wf.user.common.DateUtils;
import com.wf.user.dao.userbuydao.UserBuyMapper;
import com.wf.user.model.CityUser;
import com.wf.user.model.DateUser;
import com.wf.user.model.ProvinceUser;
import com.wf.user.model.UserPaydatenametype;
import com.wf.user.service.userpurchaseservice.UserBuyService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserBuyServiceImpl implements UserBuyService {

    @Autowired
    private UserBuyMapper userBuyMapper;

    @Override
    public Map TVandAppNum(String startDate, String endDate, String provinceName, String cityName) {
        if(StringUtils.isBlank(startDate) || StringUtils.isBlank(endDate)){
            startDate = null;
            endDate = null;
        }
        if(StringUtils.isBlank(provinceName)){
            provinceName = null;
        }
        if(StringUtils.isBlank(cityName)){
            cityName = null;
        }
        if(StringUtils.isNotBlank(provinceName) && StringUtils.isNotBlank(cityName)){
            provinceName = null;
        }
        int total = userBuyMapper.allpurchaserecoder(startDate, endDate, provinceName, cityName);
        int tv = userBuyMapper.userPurchaseTV(startDate, endDate, provinceName, cityName);
        Map map = new HashMap();
        map.put("tv",tv);
        map.put("app",total-tv);
        return map;

    }

    @Override
    public List<ProvinceUser> buyInAllProvince(String startDate, String endDate, String type) {

        if(StringUtils.isBlank(startDate) || StringUtils.isBlank(endDate)){
            startDate = null;
            endDate = null;
        }
        if(StringUtils.isBlank(type)){
            type = "app";
        }
        return userBuyMapper.getAllProvinceUserNum(startDate, endDate, type);
    }

    @Override
    public List<CityUser> getbuyersByProvince(String startDate, String endDate, String provinceName, String type) {
        if(StringUtils.isBlank(startDate) || StringUtils.isBlank(endDate)){
            startDate = null;
            endDate = null;
        }
        if(StringUtils.isBlank(type)){
            type = "app";
        }
        List<CityUser> cityUsers = userBuyMapper.getUserNumByProvicne(provinceName,startDate, endDate,type);
        return  cityUsers;

    }

    @Override
    public List<DateUser> getbuyerTrend(String startDate, String endDate, String type, String provinceName, String cityName) {
        if(StringUtils.isBlank(startDate) || StringUtils.isBlank(endDate)){
            endDate = DateUtils.todayStr();
            startDate = DateUtils.datecalculByDay(endDate,-10);
        }
        if(StringUtils.isBlank(type)){
            type = "app";
        }
        if(StringUtils.isBlank(provinceName)){
            provinceName = null;
            cityName = null;
        } else {
            if(StringUtils.isBlank(cityName)){
                cityName = null;
            }else {
                provinceName = null;
            }
        }
        return userBuyMapper.userPayTrend(startDate, endDate, type, provinceName, cityName);
    }

    @Override
    public PageInfo getbuyerinfo(String startDate, String endDate, String type, String provinceName, String cityName, int limit, int offset) {
        if(StringUtils.isBlank(startDate) || StringUtils.isBlank(endDate)){
            endDate = DateUtils.todayStr();
            startDate = DateUtils.datecalculByDay(endDate,-10);
        }
        if(StringUtils.isBlank(type)){
            type = "app";
        }
        if(StringUtils.isBlank(provinceName)){
            provinceName = null;
            cityName = null;
        } else {
            if(StringUtils.isBlank(cityName)){
                cityName = null;
            }else {
                provinceName = null;
            }
        }
        PageHelper.startPage(offset,limit);
        List<UserPaydatenametype> userPayList = userBuyMapper.userPayList(startDate, endDate, type, provinceName, cityName);
        return new PageInfo(userPayList);

    }
}
