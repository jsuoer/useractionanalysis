package com.wf.user.controller.userPayController;

import com.github.pagehelper.PageInfo;
import com.wf.user.common.PageResult;
import com.wf.user.service.userPayActionService.PayFrom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/userpay")
public class PayTypeController {

    @Autowired
    private PayFrom payFrom;

    @ResponseBody
    @RequestMapping("/typenum")
    public List paytype(String min, String max, String startDate, String endDate, String provinceName, String cityName){
        Map map = payFrom.userpayInfo(min, max, startDate, endDate, provinceName, cityName);
        Map map1 = new HashMap();
        Map map2 = new HashMap();
        map1.put("name","微信支付");
        map1.put("value",map.get("微信"));
        map2.put("name","支付宝支付");
        map2.put("value",map.get("支付宝"));
        List list = new ArrayList();
        list.add(map1);
        list.add(map2);
        return list;
    }

    @ResponseBody
    @RequestMapping("/payuserinfo")
    public PageResult payuserinfo(int limit,int offset,String min, String max, String startDate, String endDate, String provinceName, String cityName){
        PageInfo infos = payFrom.getuserpayInfo(limit, offset, min, max, startDate, endDate, provinceName, cityName);
        PageResult pageResult = new PageResult();
        pageResult.setTotal((int) infos.getTotal());
        pageResult.setRows(infos.getList());
        return pageResult;
    }

    @ResponseBody
    @RequestMapping("/payusernum")
    public List<Map> payuserinfo(String min, String max, String startDate, String endDate, String provinceName){
        List<Map> maps = payFrom.getuserpayNum(min, max, startDate, endDate, provinceName);
        return maps;
    }

    @ResponseBody
    @RequestMapping("/payusersuccessrate")
    public List<Map> payuserinfos(String startDate, String endDate, String provinceName,String cityName){
        Map map = payFrom.userpaySuccessOrNo(startDate, endDate, provinceName, cityName);

        Map map1 = new HashMap();
        Map map2 = new HashMap();
        map1.put("name","充值成功");
        map1.put("value",map.get("success"));
        map2.put("name","充值失败");
        map2.put("value",map.get("fail"));
        List list = new ArrayList();
        list.add(map1);
        list.add(map2);
        return list;
    }


    @ResponseBody
    @RequestMapping("/payfailuser")
    public PageResult payuserinfos(String startDate, String endDate, String provinceName, String cityName, int limit, int offset){
        PageInfo pageInfo = payFrom.userPayFailInfo(startDate, endDate, provinceName, cityName, offset, limit);
        PageResult pageResult = new PageResult();
        pageResult.setTotal((int) pageInfo.getTotal());
        pageResult.setRows(pageInfo.getList());
        return  pageResult;
    }







    }
