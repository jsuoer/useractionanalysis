package com.wf.user.controller;

import com.wf.user.common.JsonUtils;
import com.wf.user.common.PageResult;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 用户区域管理
 */
@Controller
public class UserAreaController {

    @Autowired
    private UserOfArea UserOfArea;

    @Autowired
    private UserOfDate userOfDate;

    @Autowired
    private InviteUserService inviteUserService;

    @ResponseBody
    @RequestMapping("/cityuser")
    public List<CityUser> aa(){
        List<CityUser> allCityUser = UserOfArea.getAllCityUser();
        return allCityUser;
    }

    @ResponseBody
    @RequestMapping(value = "/provinceuser")
    public String ab(){
        List<ProvinceUser> allUser = UserOfArea.getAllProvinceUser();
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
    @RequestMapping(value = "/provinceUserInfo")
    public PageResult abs(@RequestParam(name = "limit",defaultValue = "5") int limit,
                          @RequestParam(name = "offset",defaultValue = "0") int offset){
        PageResult page = UserOfArea.getAllProvinceUserPage(limit, offset);


        return page;
    }

    @ResponseBody
    @RequestMapping("/last10dayuser")
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

    @ResponseBody
    @RequestMapping("/cityusersinprovince")
    public List aia(String provinceName){
        List<CityUser> users = UserOfArea.getCityUsersByProvinceName(provinceName);
        List list = new ArrayList();
        for (CityUser user:users){
            Map map = new HashMap();
            map.put("name",user.getCityName());
            map.put("value",user.getNum());
            list.add(map);
        }
        return list;
    }

    @ResponseBody
    @RequestMapping("/cityusersTable")
    public PageResult aaa(String provinceName){
        List<CityUser> allProvinceUser = UserOfArea.getCityUsersByProvinceName(provinceName);
        double totalNum = 0;
        for(CityUser user:allProvinceUser){
            totalNum += (double) user.getNum();
        }
        List list = new ArrayList();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        for(CityUser user:allProvinceUser){
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
