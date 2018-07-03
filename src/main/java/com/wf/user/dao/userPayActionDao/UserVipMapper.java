package com.wf.user.dao.userPayActionDao;

import com.wf.user.model.ProvinceUser;
import com.wf.user.model.UserInviteProxyCode;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserVipMapper {

    /**
     * 获取购买vip的数量
     */
    int vipUserNum(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("provinceName") String provinceName, @Param("cityName") String cityName);

    /**
     * 从vip升级到svip
     */
    int vipUserToSVIP(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("provinceName") String provinceName, @Param("cityName") String cityName);

    /**
     * vip&svip usernum by provicne
     */
    List<ProvinceUser> getVipOrSvipNum(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("type") String type);


    /**
     * 获取用户的 代理推荐码 站长推荐码
     */
    List<UserInviteProxyCode> getUserCodeinfo(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("provinceName") String provinceName, @Param("cityName") String cityName, @Param("type") String type);

    /**
     * 根据代理号码 获取 代理人
     */
    String getNameByproxycode(@Param("proxycode") String proxycode);

    /**
     * 根据站长推荐码 获取 站长
     */
    String getNameBystation(@Param("stationcode") String stationcode);


}
