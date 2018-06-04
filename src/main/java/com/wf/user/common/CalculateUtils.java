package com.wf.user.common;

import sun.applet.Main;

import java.text.DecimalFormat;

public class CalculateUtils {


    /**
     * 计算num1在num2中的比例
     * @param num1
     * @param num2
     * @return string   format'0.00'
     */
    public static String numRate(int num1,int num2){
        double result = (double) num1/(double) num2;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(result);
    }

//    public static void main(String[] args) {
//        System.out.println(CalculateUtils.numRate(5,13));
//    }

}
