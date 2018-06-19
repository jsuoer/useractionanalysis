package com.wf.user.dao.userbuydao;

import com.wf.user.model.CityUser;
import com.wf.user.model.DateUser;
import com.wf.user.model.ProvinceUser;
import com.wf.user.model.UserPaydatenametype;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserBuyMapper {

    /**
     * 查询所有的购买记录
     */
    int allpurchaserecoder(@Param("startDate") String startDate, @Param("endDate") String endDate,@Param("provinceName") String provinceName, @Param("cityName") String cityName);

    /**
     * 查询 TV端 的 所有的购买记录
     */
    int userPurchaseTV(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("provinceName") String provinceName, @Param("cityName") String cityName);

    /**
     * 查询全省的消费分布
     */
    List<ProvinceUser> getAllProvinceUserNum(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("type") String type);

    List<CityUser> getUserNumByProvicne(@Param("provinceName") String provinceName, @Param("startDate") String startDate, @Param("endDate") String endDate, @Param("type") String type);

    /**
     * 用户消费走势
     */
    List<DateUser> userPayTrend(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("type") String type, @Param("provinceName") String provinceName, @Param("cityName") String cityName);

    /**
     * 用户充值信息
     */
    List<UserPaydatenametype> userPayList(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("type") String type, @Param("provinceName") String provinceName, @Param("cityName") String cityName);


}
