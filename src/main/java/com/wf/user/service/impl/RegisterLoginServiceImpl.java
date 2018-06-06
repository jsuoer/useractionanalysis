package com.wf.user.service.impl;

import com.wf.user.common.DateUtils;
import com.wf.user.dao.RegisterLoginMapper;
import com.wf.user.model.UserRegisteNoLogin;
import com.wf.user.service.RegisterLoginService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class RegisterLoginServiceImpl implements RegisterLoginService {

    @Autowired
    private RegisterLoginMapper registerLoginMapper;

    @Override
    public Map registeNologin(String startDate, String endDate, String procinceName, String cityName) {
        if(StringUtils.isBlank(startDate) || StringUtils.isBlank(endDate)){
            endDate = DateUtils.todayStr();
            startDate = DateUtils.datecalculByDay(endDate,-10);
        }
        if(StringUtils.isNotBlank(procinceName) && StringUtils.isNotBlank(cityName)){
            procinceName = null;
        }
        if(StringUtils.isBlank(procinceName)){
            procinceName = null;
        }
        if(StringUtils.isBlank(cityName)){
            cityName = null;
        }

        int userregistenum = registerLoginMapper.userregistenum(startDate, endDate, procinceName, cityName);
        int userloginnum = registerLoginMapper.userloginnum(startDate, endDate, procinceName, cityName);
        Map map = new HashMap();
        map.put("yes",userloginnum);
        map.put("no",userregistenum-userloginnum);
        return map;
    }

    @Override
    public List<UserRegisteNoLogin> registeNoLoginInfo(String startDate, String endDate, String procinceName, String cityName) {
        if(StringUtils.isBlank(startDate) || StringUtils.isBlank(endDate)){
            endDate = DateUtils.todayStr();
            startDate = DateUtils.datecalculByDay(endDate,-10);
        }
        if(StringUtils.isNotBlank(procinceName) && StringUtils.isNotBlank(cityName)){
            procinceName = null;
        }
        if(StringUtils.isBlank(procinceName)){
            procinceName = null;
        }
        if(StringUtils.isBlank(cityName)){
            cityName = null;
        }

        List<UserRegisteNoLogin> usersRegisteNoLogin = registerLoginMapper.getUserRegisteNoLogin(startDate, endDate, procinceName, cityName);


        return usersRegisteNoLogin;
    }

    @Override
    public Map getusernumBysex(String procinceName, String cityName) {
        int man = registerLoginMapper.selectSexUser(procinceName, cityName, 1);
        int woman = registerLoginMapper.selectSexUser(procinceName, cityName, 0);
        Map map = new HashMap();
        map.put("man",man);
        map.put("woman",woman);
        map.put("total",woman+man);
        return map;
    }

}
