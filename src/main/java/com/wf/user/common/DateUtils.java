package com.wf.user.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateUtils {

    /**
     * 获取两个时间段的（包括起始日期和结束日期）每一天  的 str
     * 参数格式  "yyyy-MM-dd"
     * @param startday 起始日期
     * @param endday 结束日期
     * @return  list<string>
     */
    public static List getEveryDay(String startday,String endday){
        List<String> list = new ArrayList();
        if(startday.equals(endday)){
            list.add(startday);
            return list;
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        list.add(startday);
        while (true) {
            Date date = null;
            try {
                date = simpleDateFormat.parse(startday);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            startday = simpleDateFormat.format(calendar.getTime());
            list.add(startday);
            if(startday.equals(endday)){
                break;
            }
        }

        return list;
    }

    /**
     * 计算给出日期减去对应的天数
     * 日期格式  "yyyy-MM-dd"
     * @param date 日期字符串
     * @param num 减去的天数
     * @return str
     */
    public static String datecalculByDay(String date,int num){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date dt= null;
        try {
            dt = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(dt);
        rightNow.add(Calendar.DAY_OF_YEAR,num);
        Date dt1=rightNow.getTime();
        return  sdf.format(dt1);

    }

    /**
     * 获取今天的日期string
     * @return
     */
    public static String todayStr(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date());
    }
}
