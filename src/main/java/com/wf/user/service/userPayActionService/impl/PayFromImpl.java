package com.wf.user.service.userPayActionService.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wf.user.dao.userPayActionDao.PayFromDao;
import com.wf.user.model.AreaUserNum;
import com.wf.user.model.ProvinceUser;
import com.wf.user.model.UserPayInfo;
import com.wf.user.service.userPayActionService.PayFrom;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PayFromImpl implements PayFrom {

    @Autowired
    private PayFromDao payFromDao;

    @Override
    public Map userpayInfo(String min, String max, String startDate, String endDate, String provinceName, String cityName) {
        if(StringUtils.isBlank(min) || StringUtils.isBlank(max)){
            min = null;
            max = null;
        }
        if(StringUtils.isBlank(startDate) || StringUtils.isBlank(endDate)){
            startDate = null;
            endDate = null;
        }
        if(StringUtils.isNotBlank(provinceName) && StringUtils.isNotBlank(cityName)){
            provinceName = null;
        }
        if(StringUtils.isBlank(provinceName)){
            provinceName = null;
        }
        if(StringUtils.isBlank(cityName)){
            cityName = null;
        }
        int i = payFromDao.userPayType(min, max, startDate, endDate, provinceName, cityName, 1);
        int j = payFromDao.userPayType(min, max, startDate, endDate, provinceName, cityName, 2);
        Map map = new HashMap();
        map.put("微信",i);
        map.put("支付宝",j);
        return map;


    }

    @Override
    public PageInfo getuserpayInfo(int size, int page, String min, String max, String startDate, String endDate, String provinceName, String cityName) {
        if(StringUtils.isBlank(min) || StringUtils.isBlank(max)){
            min = null;
            max = null;
        }
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

        PageHelper.startPage(page,size);
        List<UserPayInfo> info = payFromDao.getUserPayInfo(min, max, startDate, endDate, provinceName, cityName);

        return new PageInfo(info);
    }

    @Override
    public List<Map> getuserpayNum( String min, String max, String startDate, String endDate, String provinceName) {
        if(StringUtils.isBlank(min) || StringUtils.isBlank(max)){
            min = null;
            max = null;
        }
        if(StringUtils.isBlank(startDate) || StringUtils.isBlank(endDate)){
            startDate = null;
            endDate = null;
        }
        if(StringUtils.isBlank(provinceName)){
            provinceName = null;
        }
        List<AreaUserNum> userNums = payFromDao.getUserPayNumP(min, max, startDate, endDate, provinceName);
        List list = new ArrayList();
        for(AreaUserNum areaUserNum:userNums){
            Map map = new HashMap();
            map.put("name",areaUserNum.getAreaName());
            map.put("value",areaUserNum.getNum());
            list.add(map);
        }
        return list;
    }
}
