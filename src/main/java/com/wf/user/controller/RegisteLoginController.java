package com.wf.user.controller;

import com.wf.user.service.RegisterLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

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


}
