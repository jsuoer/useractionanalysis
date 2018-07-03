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

    /**
     *
     * @param cityName
     * @return
     */
    Map userpaySuccessOrNo(String startDate, String endDate,String provinceName,String cityName);

    PageInfo userPayFailInfo(String startDate, String endDate, String provinceName, String cityName, int page, int size);

    /**
     * 用户vip的数量，从vip升级到svip的数量
     */
    List vip2SvipNum(String startDate, String endDate,String provinceName,String cityName);

    /**
     * 购买vip/svip 用户区域分布
     */
    List vipOrsvipUserArea(String startDate, String endDate,String type);


    PageInfo userAndHisFrom(String startDate, String endDate, String provinceName, String cityName, String type, int limit, int offset );

}
