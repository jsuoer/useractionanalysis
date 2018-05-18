package com.wf.user.controller;

import com.wf.user.common.JsonUtils;
import com.wf.user.model.CityUser;
import com.wf.user.model.DateUser;
import com.wf.user.model.InviteUser;
import com.wf.user.model.ProvinceUser;
import com.wf.user.service.InviteUserService;
import com.wf.user.service.UserOfArea;
import com.wf.user.service.UserOfDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户区域管理
 */
@Controller
public class UserAreaController {

    @Autowired
    private UserOfArea userOfCity;

    @Autowired
    private UserOfDate userOfDate;

    @Autowired
    private InviteUserService inviteUserService;

    @ResponseBody
    @RequestMapping("/cityuser")
    public List<CityUser> aa(){
        List<CityUser> allCityUser = userOfCity.getAllCityUser();
        return allCityUser;
    }

    @ResponseBody
    @RequestMapping(value = "/provinceuser")
    public String ab(){
        List<ProvinceUser> allUser = userOfCity.getAllProvinceUser();
        List list = new ArrayList();
        for(ProvinceUser user:allUser){
            Map map = new HashMap();
            map.put("name",user.getProvincename());
            map.put("value",user.getNum());
            list.add(map);
        }
        String objectToJson = JsonUtils.objectToJson(list);

        return objectToJson;
    }

    @ResponseBody
    @RequestMapping("/dateuser")
    public List<DateUser> ad(){
        List<DateUser> users = userOfDate.getLast10Dayregister();
        return users;
    }

    @ResponseBody
    @RequestMapping("/inviteduserProxy")
    public List<InviteUser> ae(){
        List<InviteUser> users = inviteUserService.getInviteUserOfProxy();
        return users;
    }

    @ResponseBody
    @RequestMapping("/inviteduser")
    public List<InviteUser> af(){
        List<InviteUser> users = inviteUserService.getInviteUser();
        return users;
    }

    @ResponseBody
    @RequestMapping("/notinviteduser")
    public List<InviteUser> ag(){
        List<InviteUser> users = inviteUserService.getNotInviteUser();
        return users;
    }

    @ResponseBody
    @RequestMapping("/colorCoinIs0")
    public int ah(){
        int i = inviteUserService.colorCoinIs0();
        return i;
    }

    @ResponseBody
    @RequestMapping("/colorCoinIsNot0")
    public int ai(){
        int i = inviteUserService.colorCoinIsNot0();
        return i;
    }



}
