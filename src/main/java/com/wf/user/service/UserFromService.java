package com.wf.user.service;

import java.util.List;

public interface UserFromService {
    /**
     * 用户来源  (站主推荐  代理推荐 自主注册) 以及数目
     * 全国 全时间
     * @return
     */
    List userFromNum();

    /**
     * 用户来源  (站主推荐  代理推荐 自主注册) 以及数目
     * 省 全时间
     * @return
     */
    List userFromNuminp(String provinceName);
    /**
     * 用户来源  (站主推荐  代理推荐 自主注册) 以及数目
     * 市 全时间
     * @return
     */
    List userFromNuminc(String cityName);

    /**
     * 用户来源  (站主推荐  代理推荐 自主注册) 以及数目
     * 全国 时间范围内
     * @return
     */
    List userFromNumDur(String startDate,String endDate);

    /**
     * 用户来源  (站主推荐  代理推荐 自主注册) 以及数目
     * 省 时间范围内
     * @return
     */
    List userFromNumDurinp(String startDate,String endDate,String provinceName);

    /**
     * 用户来源  (站主推荐  代理推荐 自主注册) 以及数目
     * 市 时间范围内
     * @return
     */
    List userFromNumDurinc(String startDate,String endDate,String cityName);



}
