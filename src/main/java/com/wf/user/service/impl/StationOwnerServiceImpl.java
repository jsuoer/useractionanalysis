package com.wf.user.service.impl;

import com.wf.user.common.DateUtils;
import com.wf.user.dao.StationOwnerMapper;
import com.wf.user.service.StationOwnerService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StationOwnerServiceImpl implements StationOwnerService {

    @Autowired
    private StationOwnerMapper stationOwnerMapper;


    /**
     * 计算出 收益站主 和 所有站主的数量
     * @param provinceName
     * @param cityName
     * @param date
     * @return map
     */
    @Override
    public Map stationOwnerEarn(String provinceName, String cityName, String date) {
        if(StringUtils.isBlank(provinceName)){
            provinceName = null;
        }
        if(StringUtils.isBlank(cityName)){
            cityName = null;
        }
        if(StringUtils.isBlank(date)){
            //将date 日期设置为今天
            date = DateUtils.todayStr();

        }

        //先查询所有的站主
        List<String> stationOwnerIds = stationOwnerMapper.allStationOwner(provinceName, cityName);
        int allOwner = stationOwnerIds.size();
        //充钱的用户
        int payUser = stationOwnerMapper.stationearn(date);

        Map map = new HashMap();
        map.put("未收益站主",allOwner-payUser);
        map.put("收益站主",payUser);
        return map;
    }


}
