package com.javase2.day01;

import java.util.Calendar;

/**
 * @author xulia
 * @create 2019-07-20 12:08
 */
public class Demo3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("year= " + year + "month" + month + "day = " + day);

    }

}