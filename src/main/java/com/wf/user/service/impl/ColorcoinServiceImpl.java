package com.wf.user.service.impl;

import com.wf.user.dao.ColorcoinMapper;
import com.wf.user.service.ColorcoinService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ColorcoinServiceImpl implements ColorcoinService {

    @Autowired
    private ColorcoinMapper colorcoinMapper;

    @Override
    public List colorcoin0rate() {
        int usersRangeConin = colorcoinMapper.usersRangeConin(0, 0, null, null);
        int users = colorcoinMapper.users(null, null);
        List list = new ArrayList();
        Map map = new HashMap();
        Map map1 = new HashMap();
        map.put("name","用户奖豆数是0的数量");
        map.put("value",usersRangeConin);
        map1.put("name","用户奖豆数不是0数量");
        map1.put("value",users-usersRangeConin);
        list.add(map);
        list.add(map1);
        return list;
    }

    @Override
    public List colorcoinCondition(int min, int max, String provinceName, String cityName) {
        if(StringUtils.isBlank(provinceName)){
            provinceName = null;
        }
        if(StringUtils.isBlank(cityName)){
            cityName = null;
        }
        if(StringUtils.isNotBlank(cityName)){
            provinceName = null;
        }else {
            cityName = null;
        }
        int usersRangeConin = colorcoinMapper.usersRangeConin(min, max, provinceName, cityName);
        int users = colorcoinMapper.users(provinceName, cityName);
        List list = new ArrayList();
        Map map = new HashMap();
        Map map1 = new HashMap();
        map.put("name","用户符合条件的数量");
        map.put("value",usersRangeConin);
        map1.put("name","用户不符合条件的数量");
        map1.put("value",users-usersRangeConin);
        list.add(map);
        list.add(map1);
        return list;


    }
}
