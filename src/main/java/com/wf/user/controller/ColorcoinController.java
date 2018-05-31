package com.wf.user.controller;

import com.wf.user.common.PageResult;
import com.wf.user.service.ColorcoinService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/coin")
public class ColorcoinController {

    @Autowired
    private ColorcoinService colorcoinService;

    @ResponseBody
    @RequestMapping("/coinzerorate")
    public List coinzerorate(){
        return colorcoinService.colorcoin0rate();
    }
    @ResponseBody
    @RequestMapping("/coinzeroratefort")
    public PageResult coinzeroratefort(){
        List list = colorcoinService.colorcoin0rate();
        return listToResult(list);

    }

    /**
     * 将查询到的结果封装成pageresult,用于table
     * @param list
     * @return
     */
    private PageResult listToResult(List<Map> list){
        PageResult pageResult = new PageResult();
        List list1 = new ArrayList();
        for(Map map:list){
            Map map1 = new HashMap();
            map1.put("type",map.get("name"));
            map1.put("num",map.get("value"));
            list1.add(map1);
        }
        pageResult.setTotal(list.size());
        pageResult.setRows(list1);
        return pageResult;
    }

    @ResponseBody
    @RequestMapping("/coininfo")
    public List coininfo(String min,String max,String provinceName,String cityName){
        int i=0;
        int j=0;
        if(StringUtils.isNotBlank(min)){
            i=Integer.parseInt(min);
        }
        if(StringUtils.isNotBlank(max)){
            j=Integer.parseInt(max);
        }
        return colorcoinService.colorcoinCondition(i, j, provinceName, cityName);
    }

    @ResponseBody
    @RequestMapping("/coininfofort")
    public PageResult coininfofort(String min, String max, String provinceName, String cityName){
        int i=0;
        int j=0;
        if(StringUtils.isNotBlank(min)){
            i=Integer.parseInt(min);
        }
        if(StringUtils.isNotBlank(max)){
            j=Integer.parseInt(max);
        }
        List list = colorcoinService.colorcoinCondition(i, j, provinceName, cityName);
        return listToResult(list);
    }
}
