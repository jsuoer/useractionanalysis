package com.wf.user.controller;

import com.wf.user.common.PageResult;
import com.wf.user.service.UserFromService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/userfrom")
public class UserFromController {

    @Autowired
    private UserFromService userFromService;

    @ResponseBody
    @RequestMapping("/alltpc")
    public List a(){
        return userFromService.userFromNum();
    }

    private List listForPageResult(List<Map> list){
        List list1 = new ArrayList();
        for(Map map:list){
            Map map1 = new HashMap();
            map1.put("type",map.get("name"));
            map1.put("num",map.get("value"));
            list1.add(map1);
        }
        return list1;
    }

    @ResponseBody
    @RequestMapping("/alltpcfort")
    public PageResult alltpcfort(){
        List list = userFromService.userFromNum();
        PageResult pageResult = new PageResult();
        pageResult.setTotal(list.size());
        pageResult.setRows(listForPageResult(list));
        return pageResult;
    }

    @ResponseBody
    @RequestMapping("/alltpcinp")
    public List ainp(String provinceName){
        return userFromService.userFromNuminp(provinceName);
    }

    @ResponseBody
    @RequestMapping("/alltpcinc")
    public List ainc(String cityName){
        return userFromService.userFromNuminc(cityName);
    }

    @ResponseBody
    @RequestMapping("/alltpcdate")
    public List ac(String startDate,String endDate){
        return userFromService.userFromNumDur(startDate, endDate);
    }

    @ResponseBody
    @RequestMapping("/alltpcdatefort")
    public PageResult alltpcdatefort(String startDate, String endDate){
        List list = userFromService.userFromNumDur(startDate, endDate);
        PageResult pageResult  = new PageResult();
        pageResult.setTotal(list.size());
        pageResult.setRows(listForPageResult(list));
        return pageResult;
    }

    @ResponseBody
    @RequestMapping("/alltpcdateinc")
    public List acc(String startDate,String endDate,String cityName){
        return userFromService.userFromNumDurinc(startDate, endDate, cityName);
    }

    @ResponseBody
    @RequestMapping("/alltpcdateinp")
    public List acp(String startDate,String endDate,String provinceName){
        return userFromService.userFromNumDurinp(startDate, endDate, provinceName);
    }


}
