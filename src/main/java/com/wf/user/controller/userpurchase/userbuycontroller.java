package com.wf.user.controller.userpurchase;

import com.github.pagehelper.PageInfo;
import com.wf.user.common.PageResult;
import com.wf.user.model.CityUser;
import com.wf.user.model.DateUser;
import com.wf.user.model.ProvinceUser;
import com.wf.user.service.userpurchaseservice.UserBuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/buy")
public class userbuycontroller {

    @Autowired
    private UserBuyService userBuyService;

    @ResponseBody
    @RequestMapping("/tvapp")
    public List a(String startDate,String endDate,String provinceName,String cityName){
        Map map = userBuyService.TVandAppNum(startDate, endDate, provinceName, cityName);
        List list = new ArrayList();
        for(Object s:map.keySet()){
            Map map1  = new HashMap();
            map1.put("name",s);
            map1.put("value",map.get(s));
            list.add(map1);
        }
        return  list;
    }

    @ResponseBody
    @RequestMapping("/provincebuyer")
    public List b(String startDate,String endDate,String type){
        List<ProvinceUser> userList = userBuyService.buyInAllProvince(startDate, endDate, type);
        List list = new ArrayList();
        for(ProvinceUser user:userList){
            Map map = new HashMap();
            map.put("name",user.getProvincename());
            map.put("value",user.getNum());
            list.add(map);
        }
        return list;
    }

    @ResponseBody
    @RequestMapping("/buyerinprovince")
    public List b(String startDate,String endDate,String type,String provinceName){
        List<CityUser> userList = userBuyService.getbuyersByProvince(startDate, endDate, provinceName, type);
        List list = new ArrayList();
        for(CityUser user:userList){
            Map map = new HashMap();
            map.put("name",user.getCityName());
            map.put("value",user.getNum());
            list.add(map);
        }
        return list;
    }

    @ResponseBody
    @RequestMapping("/userTrend")
    public List trend(String startDate,String endDate,String type,String provinceName,String cityName){
        List<DateUser> dateUsers = userBuyService.getbuyerTrend(startDate, endDate, type, provinceName, cityName);
        List list = new ArrayList();
        if(dateUsers != null && dateUsers.size() > 0) {
            for (DateUser user : dateUsers) {
                Map map = new HashMap();
                map.put("date", user.getDate());
                map.put("num", user.getNum());
                list.add(map);
            }
        }
        return list;
    }

    @ResponseBody
    @RequestMapping("/buyerinfo")
    public PageResult buyerinfo(String startDate, String endDate, String type, String provinceName, String cityName, int limit, int offset){
        PageInfo pageInfo = userBuyService.getbuyerinfo(startDate, endDate, type, provinceName, cityName, limit, offset);
        PageResult pageResult = new PageResult();
        pageResult.setRows(pageInfo.getList());
        pageResult.setTotal((int) pageInfo.getTotal());
        return pageResult;
    }

}
