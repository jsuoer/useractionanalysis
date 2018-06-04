package com.wf.user.controller;

import com.wf.user.common.PageResult;
import com.wf.user.service.StationOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/stationowner")
public class StationOwnerController {

    @Autowired
    private StationOwnerService stationOwnerService;

    @ResponseBody
    @RequestMapping("/earnowner")
    public List a(String provinceName,String cityName,String date){
        Map map = stationOwnerService.stationOwnerEarn(provinceName, cityName, date);
        List list = new ArrayList();
        Map map1 = new HashMap();
        Map map2 = new HashMap();
        map1.put("name","未收益站主");
        map1.put("value",map.get("未收益站主"));
        map2.put("name","收益站主");
        map2.put("value",map.get("收益站主"));
        list.add(map1);
        list.add(map2);
        return list;
    }

    @ResponseBody
    @RequestMapping("/earnownerfort")
    public PageResult as(String provinceName, String cityName, String date){
        Map map = stationOwnerService.stationOwnerEarn(provinceName, cityName, date);
        List list = new ArrayList();
        Map map1 = new HashMap();
        map1.put("no",map.get("未收益站主"));
        map1.put("yes",map.get("收益站主"));
        list.add(map1);
        PageResult pageResult = new PageResult();
        pageResult.setTotal(list.size());
        pageResult.setRows(list);
        return pageResult;
    }


}
