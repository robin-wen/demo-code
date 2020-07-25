package com.itcast.demo;

/**
 * 常用的API
 */
public class StringDemo {

    public static void main(String[] args) {
        String str01 = "1 2 3 4 5 6";
        String str02 = "1-2";
        String str03 = "hello world";

        String s01 = str01.substring(2);
        System.out.println(s01);
        String[] s02 = str02.split("-");
        System.out.println(s02);
        String[] s03 = str03.split(" ");
        System.out.println(s03);
    }
}
