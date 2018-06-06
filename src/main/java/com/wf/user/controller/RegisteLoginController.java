package com.wf.user.controller;

import com.wf.user.common.PageResult;
import com.wf.user.model.UserRegisteNoLogin;
import com.wf.user.service.RegisterLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/rl")
public class RegisteLoginController {
    @Autowired
    private RegisterLoginService registerLoginService;

    @ResponseBody
    @RequestMapping("/rlrate")
    public List ssas(String startDate, String endDate, String provinceName, String cityName) {
        Map map = registerLoginService.registeNologin(startDate, endDate, provinceName, cityName);
        Map map1 = new HashMap();
        Map map2 = new HashMap();
        map1.put("name", "未登录");
        map1.put("value", map.get("no"));
        map2.put("name", "已登录");
        map2.put("value", map.get("yes"));
        List list = new ArrayList();
        list.add(map1);
        list.add(map2);
        return list;
    }

    @ResponseBody
    @RequestMapping("/nologininfo")
    public PageResult psas(String startDate, String endDate, String provinceName, String cityName) {
        List<UserRegisteNoLogin> logins = registerLoginService.registeNoLoginInfo(startDate, endDate, provinceName, cityName);
        PageResult pageResult = new PageResult();
        pageResult.setTotal(logins.size());
        pageResult.setRows(logins);
        return pageResult;
    }

    @ResponseBody
    @RequestMapping("/sexrate")
    public List ax(String provinceName, String cityName){
        Map map = registerLoginService.getusernumBysex(provinceName, cityName);
        Map map1 = new HashMap();
        Map map2 = new HashMap();
        map1.put("name", "男");
        map1.put("value", map.get("man"));
        map2.put("name", "女");
        map2.put("value", map.get("woman"));
        List list = new ArrayList();
        list.add(map1);
        list.add(map2);
        return list;
    }

    @ResponseBody
    @RequestMapping("/sexratefort")
    public PageResult sexratefort(String provinceName, String cityName){
        Map map = registerLoginService.getusernumBysex(provinceName, cityName);
        Map map1 = new HashMap();
        Map map2 = new HashMap();
        map1.put("sex", "男");
        map1.put("num", map.get("man"));
        map2.put("sex", "女");
        map2.put("num", map.get("woman"));
        List list = new ArrayList();
        list.add(map1);
        list.add(map2);
        PageResult pageResult = new PageResult();
        pageResult.setTotal(list.size());
        pageResult.setRows(list);
        return pageResult;
    }


}
