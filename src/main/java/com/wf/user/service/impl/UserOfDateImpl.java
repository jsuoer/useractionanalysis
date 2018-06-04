package com.wf.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wf.user.common.DateUtils;
import com.wf.user.common.PageResult;
import com.wf.user.dao.UserDate;
import com.wf.user.model.CityUser;
import com.wf.user.model.DateUser;
import com.wf.user.model.ProvinceUser;
import com.wf.user.service.UserOfDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 与用户的时间相关的服务
 */
@Service
public class UserOfDateImpl implements UserOfDate {

    @Autowired
    private UserDate userDate;

    /**
     * 计算出昨天和今天的比例
     * @param i 今天
     * @param j 昨天
     * @return
     */
    private  String getRate(int i,int j){
        double rate = 0;
        if(j > i){
            rate = -(double) (j-i) / (double) j;
        }
        if(j < i){
            rate = (double) (i-j) / (double) j;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(rate);
    }


    @Override
    public List getUserBacthDays(List days) {
        List<DateUser> users = userDate.userBatchDay(days);
        Map map = new HashMap();
        for(DateUser user:users){
            map.put(user.getDate(),user.getNum());
        }
        List list = new ArrayList();
        for(DateUser user:users){
            String date = user.getDate();
            String subDay = DateUtils.datecalculByDay(date, -1);
            if(map.get(subDay) != null){
                Map map1 = new HashMap();
                map1.put(user.getDate(),getRate((int)map.get(date),(int)map.get(subDay)));
                list.add(map1);
            }
        }
        return list;
    }

    /**
     * 将数据库查询的结果List<DateUser> 封装成 list<map>
     * @param users
     * @return
     */
    private List dateusersTolistmap(List<DateUser> users){
        //封装map  key->date value->num
        Map map = new HashMap();
        for(DateUser user:users){
            map.put(user.getDate(),user.getNum());
        }

        List list = new ArrayList();
        for(DateUser user:users){
            String date = user.getDate();
            String subDay = DateUtils.datecalculByDay(date, -1);
            if(map.get(subDay) != null){
                Map map1 = new HashMap();
                map1.put(user.getDate(),getRate((int)map.get(date),(int)map.get(subDay)));
                list.add(map1);
            }
        }
        return list;
    }

    @Override
    public List getUserBacthDaysinp(List days, String provinceName) {
        List<DateUser> users = userDate.userBatchDayinp(days, provinceName);
        return dateusersTolistmap(users);
    }

    @Override
    public List getUserBacthDaysinc(List days, String cityName) {
        List<DateUser> dateUsers = userDate.userBatchDayinc(days, cityName);
        return dateusersTolistmap(dateUsers);
    }

    @Override
    public String getRegisterByDay(String date) {
        double rate = 0;
        int i;
        i = userDate.userRegisterInSameDay(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        int j = 0 ;
        try {
            Date day = simpleDateFormat.parse(date);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(day);
            calendar.add(Calendar.DAY_OF_YEAR,-1);
            Date calendarTime = calendar.getTime();
            String yesterday = simpleDateFormat.format(calendarTime);
            j = userDate.userRegisterInSameDay(yesterday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(j > i){
            rate = -(double) (j-i) / (double) j;
        }
        if(j < i){
            rate = (double) (i-j) / (double) j;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String s = decimalFormat.format(rate);
        return s;

    }

    @Override
    public String getRegisterByDayinp(String date, String provinceName) {
        double rate = 0;
        int i;
        i = userDate.userRegisterInSameDayinp(date, provinceName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        int j = 0 ;
        try {
            Date day = simpleDateFormat.parse(date);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(day);
            calendar.add(Calendar.DAY_OF_YEAR,-1);
            Date calendarTime = calendar.getTime();
            String yesterday = simpleDateFormat.format(calendarTime);
            j = userDate.userRegisterInSameDayinp(yesterday,provinceName);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(j > i){
            rate = -(double) (j-i) / (double) j;
        }
        if(j < i){
            rate = (double) (i-j) / (double) j;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String s = decimalFormat.format(rate);
        return s;

    }

    @Override
    public String getRegisterByDayinpc(String date, String cityName) {
        double rate = 0;
        int i;
        i = userDate.userRegisterInSameDayinpc(date, cityName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        int j = 0 ;
        try {
            Date day = simpleDateFormat.parse(date);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(day);
            calendar.add(Calendar.DAY_OF_YEAR,-1);
            Date calendarTime = calendar.getTime();
            String yesterday = simpleDateFormat.format(calendarTime);
            j = userDate.userRegisterInSameDayinpc(yesterday,cityName);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(j > i){
            rate = -(double) (j-i) / (double) j;
        }
        if(j < i){
            rate = (double) (i-j) / (double) j;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String s = decimalFormat.format(rate);
        return s;

    }

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
