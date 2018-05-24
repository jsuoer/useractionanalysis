package com.wf.user.controller;

import com.wf.user.common.PageResult;
import com.wf.user.model.CityUser;
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
}
