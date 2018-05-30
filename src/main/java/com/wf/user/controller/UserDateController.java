package com.wf.user.controller;

import com.wf.user.common.DateUtils;
import com.wf.user.common.PageResult;
import com.wf.user.model.CityUser;
import com.wf.user.model.DateUser;
import com.wf.user.model.ProvinceUser;
import com.wf.user.service.UserOfDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserDateController {

    @Autowired
    private UserOfDate userOfDate;

    @ResponseBody
    @RequestMapping("/usersinbatchdays")
    public List rateb(String startDate, String endDate){
        List everyDay = DateUtils.getEveryDay(startDate, endDate);
        List rate = userOfDate.getUserBacthDays(everyDay);
        return  rate;
    }

    private PageResult listmapToPageResult(List<Map> list){
        PageResult pageResult = new PageResult();
        pageResult.setTotal(list.size());
        List rowList = new ArrayList<>();
        for (int i=0; i<list.size(); i++){
            Map map = list.get(i);
            Map map1 = new HashMap();
            for(Object key:map.keySet()){
                map1.put("date",key);
                map1.put("num",map.get(key));
            }
            rowList.add(map1);
        }
        pageResult.setRows(rowList);
        return pageResult;
    }

    @ResponseBody
    @RequestMapping("/userrateinpfort")
    public PageResult rss(String startDate, String endDate,String provinceName){
        List everyDay = DateUtils.getEveryDay(startDate, endDate);
        List rate = userOfDate.getUserBacthDaysinp(everyDay,provinceName);
        return  listmapToPageResult(rate);
    }

    @ResponseBody
    @RequestMapping("/userrateincfort")
    public PageResult rate1bs(String startDate, String endDate,String cityName){
        List everyDay = DateUtils.getEveryDay(startDate, endDate);
        List rate = userOfDate.getUserBacthDaysinc(everyDay,cityName);
        return  listmapToPageResult(rate);
    }

    @ResponseBody
    @RequestMapping("/userratefort")
    public PageResult rate1b(String startDate, String endDate){
        List everyDay = DateUtils.getEveryDay(startDate, endDate);
        List<Map> rate = userOfDate.getUserBacthDays(everyDay);
        return  listmapToPageResult(rate);
    }

    @ResponseBody
    @RequestMapping("/usersinbatchdaysinp")
    public List ratesb(String startDate, String endDate,String provinceName){
        List everyDay = DateUtils.getEveryDay(startDate, endDate);
        List rate = userOfDate.getUserBacthDaysinp(everyDay,provinceName);
        return  rate;
    }

    @ResponseBody
    @RequestMapping("/usersinbatchdaysinc")
    public List ratesb1(String startDate, String endDate,String cityName){
        List everyDay = DateUtils.getEveryDay(startDate, endDate);
        List rate = userOfDate.getUserBacthDaysinc(everyDay,cityName);
        return  rate;
    }


    @ResponseBody
    @RequestMapping("/growthrate")
    public String rate(String date){
        String rate = userOfDate.getRegisterByDay(date);
        return  rate;
    }

    @ResponseBody
    @RequestMapping("/growthrateinp")
    public String raste(String date,String provinceName){
        String rate = userOfDate.getRegisterByDayinp(date, provinceName);
        return  rate;
    }

    @ResponseBody
    @RequestMapping("/growthrateinc")
    public String rastes(String date,String cityName){
        String rate = userOfDate.getRegisterByDayinpc(date, cityName);
        return  rate;
    }


    @ResponseBody
    @RequestMapping("/userpbetweendate")
    public PageResult aa(String startDate, String endDate){
        List<ProvinceUser> allProvinceUser = userOfDate.getProvinceUserBetweenDate(startDate,endDate);
        double totalNum = 0;
        for(ProvinceUser user:allProvinceUser){
            totalNum += (double) user.getNum();
        }
        List list = new ArrayList();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        for(ProvinceUser user:allProvinceUser){
            Map map = new HashMap();
            map.put("areaName",user.getProvincename());
            map.put("num",user.getNum());

            map.put("percent",decimalFormat.format((double) (user.getNum()*100)/totalNum));
            list.add(map);
        }

        PageResult pageResult = new PageResult();
        pageResult.setTotal(list.size());
        pageResult.setRows(list);

        return pageResult;

    }

    @ResponseBody
    @RequestMapping("/cusertimeprov")
    public PageResult aa(String startDate, String endDate,String provinceName){
        List<CityUser> users = userOfDate.getCityUserBetweenDateWithProvince(startDate, endDate, provinceName);
        //-----------------------
        double totalNum = 0;
        // 计算总数值
        for(CityUser user:users){
            totalNum += (double) user.getNum();
        }

        List list = new ArrayList();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        for(CityUser user:users){
            Map map = new HashMap();
            map.put("areaName",user.getCityName());
            map.put("num",user.getNum());

            map.put("percent",decimalFormat.format((double) (user.getNum()*100)/totalNum));
            list.add(map);
        }

        PageResult pageResult = new PageResult();
        pageResult.setTotal(list.size());
        pageResult.setRows(list);
        return pageResult;
    }

    @ResponseBody
    @RequestMapping("/last10daynum")
    public List<DateUser> ss(){
        List<DateUser> list = userOfDate.getLast10Dayregister();
        return list;
    }

    @ResponseBody
    @RequestMapping("/last10daynum2")
    public PageResult sls(int offset,int limit){
        PageResult pageResult = userOfDate.getLast10Dayregister2(limit, offset);
        return pageResult;
    }


    @ResponseBody
    @RequestMapping("/userbytime")
    public List<DateUser> sss(String startDate, String endDate){
        List<DateUser> list = userOfDate.getUserByTime(startDate, endDate);
        return list;
    }

    @ResponseBody
    @RequestMapping("/userbytimep")
    public PageResult sds(String startDate, String endDate, int offset, int limit){
        PageResult user = userOfDate.getUserByTimep(startDate, endDate, limit, offset);
        return user;
    }


    @ResponseBody
    @RequestMapping("/userbytimeprovince")
    public List<DateUser> ssss(String startDate, String endDate,String provinceName){
        List<DateUser> list = userOfDate.getUserByTimeProvince(startDate, endDate, provinceName);
        return list;
    }

    @ResponseBody
    @RequestMapping("/userbytimeprovincep")
    public PageResult ssrss(String startDate, String endDate, String provinceName, int limit, int offset){
        PageResult result = userOfDate.getUserByTimeProvincep(startDate, endDate, provinceName, limit, offset);
        return result;
    }

    @ResponseBody
    @RequestMapping("/userbytimepandc")
    public List<DateUser> ssvs(String startDate, String endDate,String provinceName,String cityName){
        List<DateUser> list = userOfDate.getUserByTimeProvinceCity(startDate, endDate, provinceName, cityName);
        return list;
    }

    @ResponseBody
    @RequestMapping("/userbytimepandcp")
    public PageResult sssvs(String startDate, String endDate, String provinceName, String cityName, int limit, int offset){
        PageResult result = userOfDate.getUserByTimeProvinceCityp(startDate, endDate, provinceName, cityName, limit, offset);
        return result;
    }





}
