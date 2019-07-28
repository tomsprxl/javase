package com.javase2.day01;

/**
 * @author xulia
 * @create 2019-07-22 15:30
 */
public class Demo4 {
    public static void main(String[] args) {
        String str ="78jjnn94jfs9hhggfdffdd0";
        String result = "";

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
               if (chars[i]>=48&&chars[i]<=57){
                   result+=chars[i];
               }
        }

        System.out.println("result = " + result);

    }

}