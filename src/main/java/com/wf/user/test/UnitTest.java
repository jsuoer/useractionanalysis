package com.wf.user.test;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UnitTest {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String str="2011-08-01";
        Date dt=sdf.parse(str);
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(dt);
        rightNow.add(Calendar.DAY_OF_YEAR,-1);
        Date dt1=rightNow.getTime();
        String reStr = sdf.format(dt1);
        System.out.println(reStr);

    }
}
