package com.itcast.demo;

/**
 * 测试类
 */
public class TestDemo {
    public static void main(String[] args) {
        /*Singleton s1 = Singleton.getNewInstance();
        Singleton s2 = Singleton.getNewInstance();

        System.out.println(s1);
        System.out.println(s2);*/

        Singleton s1 = Singleton.getNewInstance();
        Singleton s2 = Singleton.getNewInstance();
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1==s2);
    }
}
