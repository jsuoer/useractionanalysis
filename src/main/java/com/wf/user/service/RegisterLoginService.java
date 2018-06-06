package com.wf.user.service;

import com.wf.user.model.UserRegisteNoLogin;

import java.util.List;
import java.util.Map;

public interface RegisterLoginService {

    /**
     * 注册未登陆的比例 默认前十天
     */
    Map registeNologin(String startDate,String endDate,String procinceName,String cityName);

    /**
     * 获取未登录用户的信息
     * @param startDate
     * @param endDate
     * @param procinceName
     * @param cityName
     * @return
     */
    List<UserRegisteNoLogin> registeNoLoginInfo(String startDate,String endDate,String procinceName,String cityName);

    /**
     * 查询出 男性用户，女性用户，总用户 数量
     */
    Map getusernumBysex(String procinceName,String cityName);


}
