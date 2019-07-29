package com.javase2.day03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author xulia
 * @create 2019-07-23 21:33
 */
public class Demo1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("key01", "value01");
        map.put("key02", "value02");
        map.put("key03", "value03");
        map.put("key04", "value04");

        Set<String> keySet = map.keySet();
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println("key: " + key + "value: " + map.get(key));
        }

        System.out.println("===================1");
        for (String key : keySet) {
            System.out.println("key: " + key + "value: " + map.get(key));
        }
        System.out.println("===================2");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> it1 = entrySet.iterator();
        while (it1.hasNext()) {
            Map.Entry<String, String> entry = it1.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key: " + key + "value: " + value);
        }
        System.out.println("===================3");


        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key: " + key + "value: " + value);
            System.out.println("===================4");
        }

    }

}