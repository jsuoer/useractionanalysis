package com.wf.user.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StationOwnerMapper {

    /**
     * 查询出所有站主id 可选省市
     */
    List<String> allStationOwner(@Param("provinceName") String provinceName, @Param("cityName") String cityName);

    /**
     * 根据站主的id 去查询站点的邀请码 -> list
     */
    List<String> inviteCodeOfStation(@Param("ownId") String ownId);

    /**
     * 根据多个邀请码获取所有用户id  list
     */
    List<String> getUserIdByInviteCode(@Param("inviteCode") List<String> inviteCode);

    /**
     * 查询昨天有没有成功充值的
     */
    int stationOwnerEarnOrNot(@Param("userId") String userId, @Param("date") String date);

    /**
     * 查询昨天充值的用户id
     */
    List<String> useridofyesterdaypay( @Param("date") String date);


    /**
     * 根据站主id获取TA所有的用户id
     */
    List<String> useridByOwnerid(@Param("id") String id);



    /**
     * 查询昨日有收益的站主数量
     */

    int stationearn(@Param("date") String date);

}
