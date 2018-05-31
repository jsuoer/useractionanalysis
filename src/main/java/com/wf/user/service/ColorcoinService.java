package com.wf.user.service;

import java.util.List;

public interface ColorcoinService {

    /**
     * 获取全国奖豆为0 和 不为0 的比例
     */
    List colorcoin0rate();

    /**
     * 根据各种条件情况查询比例
     * @param min
     * @param max
     * @param provinceName
     * @param cityName
     * @return
     */
    List colorcoinCondition(int min,int max,String provinceName,String cityName);
}
