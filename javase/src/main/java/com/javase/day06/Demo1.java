package com.javase.day06;

/**
 * @author xulia
 * @create 2019-07-16 21:53
 */
public class Demo1 {
    public Demo1(int a, int b, int c) {
        this(a, b);
        System.out.println("" + a + b + c);
    }

    public Demo1(int a, int b) {
        System.out.println("" + a + b);
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1(6, 7, 8);
    }

}