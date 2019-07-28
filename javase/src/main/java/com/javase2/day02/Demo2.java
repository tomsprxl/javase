package com.javase2.day02;

import java.util.ArrayList;

/**
 * @author xulia
 * @create 2019-07-22 16:09
 */
public class Demo2 {
    public static void main(String[] args) {
//        - public boolean add(E e)：  把给定的对象添加到当前集合中 。
        ArrayList<String> strings = new ArrayList<>();
        strings.add("13");
        System.out.println("strings = " + strings);
//        - public void clear() :清空集合中所有的元素。
        strings.clear();
        System.out.println("strings = " + strings);
//        - public boolean remove(E e): 把给定的对象在当前集合中删除。
        strings.add("14");
        System.out.println("strings = " + strings);
        strings.remove("14");
        System.out.println("strings = " + strings);
//        - public boolean contains(E e): 判断当前集合中是否包含给定的对象。
//        - public boolean isEmpty(): 判断当前集合是否为空。
//        - public int size(): 返回集合中元素的个数。
//        - public Object[] toArray(): 把集合中的元素，存储到数组中。


    }

}