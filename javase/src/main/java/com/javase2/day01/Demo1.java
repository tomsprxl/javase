package com.javase2.day01;

import java.util.Objects;

/**
 * @author xulia
 * @create 2019-07-20 11:23
 */
public class Demo1 {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "hello";
        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        System.out.println("Objects.equals(str1,str2) = " + Objects.equals(str1, str2));
    }
}