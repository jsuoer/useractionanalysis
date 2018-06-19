package com.wf.user.service.userpurchaseservice;

import com.github.pagehelper.PageInfo;
import com.wf.user.model.CityUser;
import com.wf.user.model.DateUser;
import com.wf.user.model.ProvinceUser;

import java.util.List;
import java.util.Map;

public interface UserBuyService {

    /**
     * 查询 TV 端和app 端的消费数量
     *
     */
    Map TVandAppNum(String startDate,String endDate,String provinceName,String cityName);

    /**
     * 省份区域 用户消费  分布
     * 默认 app
     */
    List<ProvinceUser> buyInAllProvince(String startDate,String endDate,String type);

    List<CityUser> getbuyersByProvince(String startDate, String endDate, String provinceName, String type);

    /**
     * 用户购买走势 默认前十天
     */
    List<DateUser> getbuyerTrend(String startDate, String endDate, String type, String provinceName, String cityName);

    /**
     * 查询购买的用户信息
     */
    PageInfo getbuyerinfo(String startDate, String endDate, String type, String provinceName, String cityName, int limit, int offset);


}
