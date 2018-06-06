package com.wf.user.service.userPayActionService;

import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public interface PayFrom {

    /**
     * 查询用户充值方式信息
     * 可选： 时间段，金额，省，市
     * @return
     */
    Map userpayInfo(String min, String max, String startDate, String endDate, String provinceName, String cityName);

    /**
     * 根据条件查询用户支付的的信息
     * @param min
     * @param max
     * @param startDate
     * @param endDate
     * @param provinceName
     * @param cityName
     * @return
     */
    PageInfo getuserpayInfo(int size, int page, String min, String max, String startDate, String endDate, String provinceName, String cityName);

    /**
     * 查询充值用户的数量
     */
    List<Map> getuserpayNum(String min, String max, String startDate, String endDate, String provinceName);

}
