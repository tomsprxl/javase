package com.javase2.day02;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author xulia
 * @create 2019-07-22 17:02
 */
public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("001");
        list.add("002");
        list.add("003");
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println("s = " + s);
        }
    }


}