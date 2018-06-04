package com.wf.user.service;

import java.util.Map;

public interface RegisterLoginService {

    /**
     * 注册未登陆的比例 默认前十天
     */
    Map registeNologin(String startDate,String endDate,String procinceName,String cityName);




}
