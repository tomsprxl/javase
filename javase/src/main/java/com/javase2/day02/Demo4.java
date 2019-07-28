package com.javase2.day02;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author xulia
 * @create 2019-07-22 18:09
 */
public class Demo4 {

    private int id;



    public Demo4(int id){
        this.id=id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Demo4 demo4 = (Demo4) o;
        return id == demo4.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        Demo4 key1 = new Demo4(1);
        Demo4 key2 = new Demo4(1);

        HashMap<Demo4, String> map = new HashMap<>();
        map.put(key1,"hello");
        System.out.println(map.get(key2));
    }
}