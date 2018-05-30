package com.wf.user.service.impl;

import com.wf.user.dao.UserFromMapper;
import com.wf.user.service.UserFromService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserFromServiceImpl implements UserFromService {

    @Autowired
    private UserFromMapper userFromMapper;

    @Override
    public List userFromNum() {
        int userProxy = userFromMapper.userProxy();
        int userStationOwner = userFromMapper.userStationOwner();
        int userSelf = userFromMapper.userSelf();
        List list = new ArrayList();

        Map map = new HashMap();
        Map map1 = new HashMap();
        Map map2 = new HashMap();
        map.put("name","代理推荐");
        map.put("value",userProxy);
        map1.put("name","站主推荐");
        map1.put("value",userStationOwner);
        map2.put("name","自主注册");
        map2.put("value",userSelf);
        list.add(map);
        list.add(map1);
        list.add(map2);
        return list;
    }

    @Override
    public List userFromNuminp(String provinceName) {
        int proxyinp = userFromMapper.userProxyinp(provinceName);
        int selfinp = userFromMapper.userSelfinp(provinceName);
        int stationOwnerinp = userFromMapper.userStationOwnerinp(provinceName);
        List list = new ArrayList();

        Map map = new HashMap();
        Map map1 = new HashMap();
        Map map2 = new HashMap();
        map.put("name","代理推荐");
        map.put("value",proxyinp);
        map1.put("name","站主推荐");
        map1.put("value",stationOwnerinp);
        map2.put("name","自主注册");
        map2.put("value",selfinp);
        list.add(map);
        list.add(map1);
        list.add(map2);
        return list;

    }

    @Override
    public List userFromNuminc(String cityName) {
        int proxyinc = userFromMapper.userProxyinc(cityName);
        int selfinc = userFromMapper.userSelfinc(cityName);
        int ownerinc = userFromMapper.userStationOwnerinc(cityName);
        List list = new ArrayList();

        Map map = new HashMap();
        Map map1 = new HashMap();
        Map map2 = new HashMap();
        map.put("name","代理推荐");
        map.put("value",proxyinc);
        map1.put("name","站主推荐");
        map1.put("value",ownerinc);
        map2.put("name","自主注册");
        map2.put("value",selfinc);
        list.add(map);
        list.add(map1);
        list.add(map2);
        return list;

    }

    @Override
    public List userFromNumDur(String startDate, String endDate) {
        int proxyDur = userFromMapper.userProxyDur(startDate, endDate);
        int selfDur = userFromMapper.userSelfDur(startDate, endDate);
        int stationOwnerDur = userFromMapper.userStationOwnerDur(startDate, endDate);
        List list = new ArrayList();

        Map map = new HashMap();
        Map map1 = new HashMap();
        Map map2 = new HashMap();
        map.put("name","代理推荐");
        map.put("value",proxyDur);
        map1.put("name","站主推荐");
        map1.put("value",stationOwnerDur);
        map2.put("name","自主注册");
        map2.put("value",selfDur);
        list.add(map);
        list.add(map1);
        list.add(map2);
        return list;
    }

    @Override
    public List userFromNumDurinp(String startDate, String endDate, String provinceName) {
        int proxyDurinp = userFromMapper.userProxyDurinp(startDate, endDate, provinceName);
        int selfDurinp = userFromMapper.userSelfDurinp(startDate, endDate, provinceName);
        int stationOwnerDurinp = userFromMapper.userStationOwnerDurinp(startDate, endDate, provinceName);
        List list = new ArrayList();

        Map map = new HashMap();
        Map map1 = new HashMap();
        Map map2 = new HashMap();
        map.put("name","代理推荐");
        map.put("value",proxyDurinp);
        map1.put("name","站主推荐");
        map1.put("value",stationOwnerDurinp);
        map2.put("name","自主注册");
        map2.put("value",selfDurinp);
        list.add(map);
        list.add(map1);
        list.add(map2);
        return list;

    }

    @Override
    public List userFromNumDurinc(String startDate, String endDate, String cityName) {
        int proxyDurinc = userFromMapper.userProxyDurinc(startDate, endDate, cityName);
        int selfDurinc = userFromMapper.userSelfDurinc(startDate, endDate, cityName);
        int stationOwnerDurinc = userFromMapper.userStationOwnerDurinc(startDate, endDate, cityName);
        List list = new ArrayList();

        Map map = new HashMap();
        Map map1 = new HashMap();
        Map map2 = new HashMap();
        map.put("name","代理推荐");
        map.put("value",proxyDurinc);
        map1.put("name","站主推荐");
        map1.put("value",stationOwnerDurinc);
        map2.put("name","自主注册");
        map2.put("value",selfDurinc);
        list.add(map);
        list.add(map1);
        list.add(map2);
        return list;

    }
}
