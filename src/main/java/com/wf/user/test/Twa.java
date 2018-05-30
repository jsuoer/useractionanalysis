package com.wf.user.test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Twa {


    public static void main(String[] args) throws Exception {
        String startday = "2018-05-25";
        String endday = "2018-06-02";
        List<String> list = new ArrayList();
        if(startday.equals(endday)){
            list.add(startday);
            return;
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        list.add(startday);
        while (true) {
            Date date = simpleDateFormat.parse(startday);
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            startday = simpleDateFormat.format(calendar.getTime());
            list.add(startday);
            if(startday.equals(endday)){
                break;
            }
        }

        System.out.println(list.toString());


    }

}
