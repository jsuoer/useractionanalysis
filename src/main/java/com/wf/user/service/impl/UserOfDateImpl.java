package com.wf.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wf.user.common.PageResult;
import com.wf.user.dao.UserDate;
import com.wf.user.model.CityUser;
import com.wf.user.model.DateUser;
import com.wf.user.model.ProvinceUser;
import com.wf.user.service.UserOfDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 与用户的时间相关的服务
 */
@Service
public class UserOfDateImpl implements UserOfDate {

    @Autowired
    private UserDate userDate;


    @Override
    public List<DateUser> getLast10Dayregister() {
        List<DateUser> last10DayRegisterUser = userDate.last10DayRegisterUser();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(new Date());

        List<DateUser> list = new ArrayList<>();

        for(int i=0; i<10; i++){
            rightNow.add(Calendar.DAY_OF_YEAR,-1);
            Date dt1=rightNow.getTime();
            String day = sdf.format(dt1);
            boolean flag = true;

            for(int j=0; j<last10DayRegisterUser.size(); j++){
                DateUser u = last10DayRegisterUser.get(j);
                if(u.getDate().equals(day)){
                    list.add(u);
                    last10DayRegisterUser.remove(j);
                    flag = false;
                }
            }
            //  没有这个日期对应注册的用户
            if(flag){
                DateUser dateUser = new DateUser();
                dateUser.setDate(day);
                dateUser.setNum(0);
                list.add(dateUser);
            }
        }
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setDate(list.get(i).getDate().substring(5));

        }
        return list;
    }

    @Override
    public PageResult getLast10Dayregister2(int limit, int offset) {
        PageHelper.startPage(offset,limit);
        List<DateUser> last10DayRegisterUser = userDate.last10DayRegisterUser();
        PageInfo<DateUser> pageInfo = new PageInfo<>(last10DayRegisterUser);
        PageResult pageResult = new PageResult();
        pageResult.setTotal((int) pageInfo.getTotal());
        pageResult.setRows(pageInfo.getList());

        return pageResult;
    }

    @Override
    public List<DateUser> getUserByTime(String startDate, String endDate) {
        List<DateUser> users = userDate.userByTime(startDate, endDate);
        return users;
    }

    @Override
    public PageResult getUserByTimep(String startDate, String endDate, int limit, int offset) {
        PageHelper.startPage(offset,limit);
        List<DateUser> users = userDate.userByTime(startDate, endDate);
        PageInfo<DateUser> pageInfo = new PageInfo<>(users);
        PageResult pageResult = new PageResult();
        pageResult.setTotal((int) pageInfo.getTotal());
        pageResult.setRows(pageInfo.getList());
        return pageResult;
    }

    @Override
    public List<DateUser> getUserByTimeProvince(String startDate, String endDate, String provinceName) {
        List<DateUser> list = userDate.userByTimeProvince(startDate, endDate, provinceName);
        return list;

    }

    @Override
    public PageResult getUserByTimeProvincep(String startDate, String endDate, String provinceName, int limit, int offset) {
        PageHelper.startPage(offset,limit);
        List<DateUser> list = userDate.userByTimeProvince(startDate, endDate, provinceName);
        PageInfo<DateUser> pageInfo = new PageInfo<>(list);
        PageResult pageResult = new PageResult();
        pageResult.setTotal((int) pageInfo.getTotal());
        pageResult.setRows(pageInfo.getList());
        return pageResult;
    }

    @Override
    public List<DateUser> getUserByTimeProvinceCity(String startDate, String endDate, String provinceName, String cityName) {
        List<DateUser> list = userDate.userByTimeProvinceCity(startDate, endDate, provinceName, cityName);
        return list;
    }

    @Override
    public PageResult getUserByTimeProvinceCityp(String startDate, String endDate,
                                                 String provinceName, String cityName, int limit, int offset) {
        PageHelper.startPage(offset,limit);
        List<DateUser> list = userDate.userByTimeProvinceCity(startDate, endDate, provinceName, cityName);
        PageInfo pageInfo = new PageInfo(list);
        PageResult result = new PageResult();
        result.setTotal((int) pageInfo.getTotal());
        result.setRows(pageInfo.getList());
        return result;
    }


    @Override
    public List<ProvinceUser> getProvinceUserBetweenDate(String startDate, String endDate) {
        List<ProvinceUser> list = userDate.getProvinceUserBetweenDate(startDate, endDate);
        return list;

    }

    @Override
    public List<CityUser> getCityUserBetweenDateWithProvince(String startDate, String endDate, String provinceName) {
        List<CityUser> list = userDate.getCityUserBetweenDateWithProvince(startDate, endDate, provinceName);
        return list;
    }
}
