package com.javase.day07;

import java.util.ArrayList;

/**
 * @author xulia
 * @create 2019-07-16 21:59
 */
public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangSan");
        list.add("lissi");


        System.out.println(list.get(1));

        boolean lissi = list.remove("lissi");
        System.out.println("lissi = " + lissi);

        System.out.println(list.size());


    }
}