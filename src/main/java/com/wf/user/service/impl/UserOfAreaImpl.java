package com.wf.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wf.user.common.PageResult;
import com.wf.user.dao.UserArea;
import com.wf.user.model.CityUser;
import com.wf.user.model.ProvinceUser;
import com.wf.user.service.UserOfArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 按城市区分用户
 */
@Service
public class UserOfAreaImpl implements UserOfArea {

    @Autowired
    private UserArea userArea;

    /**
     * 获取每个城市的所有用户
     * @return
     */
    @Override
    public List<CityUser> getAllCityUser() {
        List<CityUser> userBycity = userArea.getUserBycity();
        return userBycity;
    }

    @Override
    public PageResult getAllProvinceUserPage(int pageSize, int offset) {
        PageHelper.startPage(offset, pageSize);
        List<ProvinceUser> userList = userArea.getUserByProvince();
        PageInfo<ProvinceUser> p = new PageInfo<>(userList);

        List<ProvinceUser> userList2 = p.getList();

        double totalNum = 0;
        for(ProvinceUser user:userList2){
            totalNum += (double) user.getNum();
        }

        List list = new ArrayList();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        for(ProvinceUser user:userList2){
            Map map = new HashMap();
            map.put("areaName",user.getProvincename());
            map.put("num",user.getNum());

            map.put("percent",decimalFormat.format((double) (user.getNum()*100)/totalNum));
            list.add(map);
        }

        PageResult pageResult = new PageResult();
        pageResult.setTotal((int)p.getTotal());
        pageResult.setRows(list);

        return pageResult;

    }


    @Override
    public List<ProvinceUser> getAllProvinceUser() {
        List<ProvinceUser> userList = userArea.getUserByProvince();
        return userList;
    }

    @Override
    public List<CityUser> getCityUsersByProvinceName(String provinceName) {
        List<CityUser> list = userArea.getCityUsersByProvince(provinceName);
        return list;
    }
}
