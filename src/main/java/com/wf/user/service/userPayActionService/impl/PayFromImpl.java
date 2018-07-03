package com.wf.user.service.userPayActionService.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wf.user.dao.userPayActionDao.PayFromDao;
import com.wf.user.dao.userPayActionDao.UserVipMapper;
import com.wf.user.model.*;
import com.wf.user.service.userPayActionService.PayFrom;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PayFromImpl implements PayFrom {

    @Autowired
    private PayFromDao payFromDao;

    @Autowired
    private UserVipMapper userVipMapper;

    @Override
    public Map userpayInfo(String min, String max, String startDate, String endDate, String provinceName, String cityName) {
        if(StringUtils.isBlank(min) || StringUtils.isBlank(max)){
            min = null;
            max = null;
        }
        if(StringUtils.isBlank(startDate) || StringUtils.isBlank(endDate)){
            startDate = null;
            endDate = null;
        }
        if(StringUtils.isNotBlank(provinceName) && StringUtils.isNotBlank(cityName)){
            provinceName = null;
        }
        if(StringUtils.isBlank(provinceName)){
            provinceName = null;
        }
        if(StringUtils.isBlank(cityName)){
            cityName = null;
        }
        int i = payFromDao.userPayType(min, max, startDate, endDate, provinceName, cityName, 1);
        int j = payFromDao.userPayType(min, max, startDate, endDate, provinceName, cityName, 2);
        Map map = new HashMap();
        map.put("微信",i);
        map.put("支付宝",j);
        return map;


    }

    @Override
    public PageInfo getuserpayInfo(int size, int page, String min, String max, String startDate, String endDate, String provinceName, String cityName) {
        if(StringUtils.isBlank(min) || StringUtils.isBlank(max)){
            min = null;
            max = null;
        }
        if(StringUtils.isBlank(startDate) || StringUtils.isBlank(endDate)){
            startDate = null;
            endDate = null;
        }
        if(StringUtils.isBlank(provinceName)){
            provinceName = null;
        }
        if(StringUtils.isBlank(cityName)){
            cityName = null;
        }

        PageHelper.startPage(page,size);
        List<UserPayInfo> info = payFromDao.getUserPayInfo(min, max, startDate, endDate, provinceName, cityName);

        return new PageInfo(info);
    }

    @Override
    public List<Map> getuserpayNum( String min, String max, String startDate, String endDate, String provinceName) {
        if(StringUtils.isBlank(min) || StringUtils.isBlank(max)){
            min = null;
            max = null;
        }
        if(StringUtils.isBlank(startDate) || StringUtils.isBlank(endDate)){
            startDate = null;
            endDate = null;
        }
        if(StringUtils.isBlank(provinceName)){
            provinceName = null;
        }
        List<AreaUserNum> userNums = payFromDao.getUserPayNumP(min, max, startDate, endDate, provinceName);
        List list = new ArrayList();
        for(AreaUserNum areaUserNum:userNums){
            Map map = new HashMap();
            map.put("name",areaUserNum.getAreaName());
            map.put("value",areaUserNum.getNum());
            list.add(map);
        }
        return list;
    }

    @Override
    public Map userpaySuccessOrNo(String startDate, String endDate, String provinceName, String cityName) {
        if(StringUtils.isBlank(startDate) || StringUtils.isBlank(endDate)){
            startDate = null;
            endDate = null;
        }
        if(StringUtils.isBlank(provinceName)){
            provinceName = null;
        }
        if(StringUtils.isBlank(cityName)){
            cityName = null;
        }
        if(StringUtils.isNotBlank(cityName) && StringUtils.isNotBlank(provinceName)){
            provinceName = null;
        }

        List<UserPaydatenametype> paysuccess = payFromDao.getUserPaysuccess(startDate, endDate, provinceName, cityName);
        List<UserPaydatenametype> payfail = payFromDao.getUserPayfail(startDate, endDate, provinceName, cityName);
        Map map = new HashMap();
        map.put("success",paysuccess.size());
        map.put("fail",payfail.size());

        return map;
    }

    @Override
    public PageInfo userPayFailInfo(String startDate, String endDate, String provinceName, String cityName, int page, int size) {
        if(StringUtils.isBlank(startDate) || StringUtils.isBlank(endDate)){
            startDate = null;
            endDate = null;
        }
        if(StringUtils.isBlank(provinceName)){
            provinceName = null;
        }
        if(StringUtils.isBlank(cityName)){
            cityName = null;
        }
        if(StringUtils.isNotBlank(cityName) && StringUtils.isNotBlank(provinceName)){
            provinceName = null;
        }

        PageHelper.startPage(page,size);
        List<UserPaydatenametype> users = payFromDao.getUserPayfail(startDate, endDate, provinceName, cityName);
        for(int i=0; i<users.size(); i++){
            UserPaydatenametype user = users.get(i);
            if(user.getType().equals("1")){
                user.setType("微信");
            }else {
                user.setType("支付宝");
            }
        }


        return new PageInfo(users);
    }

    @Override
    public List vip2SvipNum(String startDate, String endDate, String provinceName, String cityName) {
        if(StringUtils.isBlank(startDate) || StringUtils.isBlank(endDate)){
            startDate = null;
            endDate = null;
        }
        if(StringUtils.isBlank(provinceName)){
            provinceName = null;
        }
        if(StringUtils.isBlank(cityName)){
            cityName = null;
        }
        if(StringUtils.isNotBlank(cityName) && StringUtils.isNotBlank(provinceName)){
            provinceName = null;
        }

        int vipUserNum = userVipMapper.vipUserNum(startDate, endDate, provinceName, cityName);
        int vipUserToSVIPNum = userVipMapper.vipUserToSVIP(startDate, endDate, provinceName, cityName);
        List list = new ArrayList();
        Map map1 = new HashMap();
        map1.put("name","vip数量");
        map1.put("value",vipUserNum);
        Map map2 = new HashMap();
        map2.put("name","vip升级到svip的数量");
        map2.put("value",vipUserToSVIPNum);
        list.add(map1);
        list.add(map2);
        return list;
    }

    @Override
    public List vipOrsvipUserArea(String startDate, String endDate, String type) {
        if(StringUtils.isBlank(startDate) || StringUtils.isBlank(endDate)){
            startDate = null;
            endDate = null;
        }
        if(StringUtils.isBlank(type)){
            type="vip";
        }
        return userVipMapper.getVipOrSvipNum(startDate, endDate, type);

    }

    @Override
    public PageInfo userAndHisFrom(String startDate, String endDate, String provinceName, String cityName, String type, int limit, int offset) {
        if(StringUtils.isBlank(startDate) || StringUtils.isBlank(endDate)){
            startDate = null;
            endDate = null;
        }
        if(StringUtils.isBlank(provinceName)){
            provinceName = null;
        }
        if(StringUtils.isBlank(cityName)){
            cityName = null;
        }
        if(StringUtils.isNotBlank(cityName) && StringUtils.isNotBlank(provinceName)){
            provinceName = null;
        }
        if(StringUtils.isBlank(type)){
            type="vip";
        }
        PageHelper.startPage(offset,limit);
        List<UserInviteProxyCode> userCodeinfos = userVipMapper.getUserCodeinfo(startDate, endDate, provinceName, cityName, type);
        PageInfo pageInfo = new PageInfo(userCodeinfos);
        List list = new ArrayList();
        for(UserInviteProxyCode user:userCodeinfos){
            UserWithFrominfo userWithFrominfo = new UserWithFrominfo();
            userWithFrominfo.setDate(user.getDate());
            userWithFrominfo.setName(user.getName());
            if(StringUtils.isNotBlank(user.getInviteCode())){
                userWithFrominfo.setInvited(userVipMapper.getNameBystation(user.getInviteCode()));
            }
            if(StringUtils.isNotBlank(user.getProxy())){
                userWithFrominfo.setProxy(userVipMapper.getNameByproxycode(user.getProxy()));
            }
            list.add(userWithFrominfo);
        }
        pageInfo.setList(list);
        return pageInfo;
    }


}
