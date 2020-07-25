package com.itcast.demo;

/**
 *
 * System类
 */
public class APIDemo {

    public static void main(String[] args) {
        //开始时间
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }

        //结束时间
        long end = System.currentTimeMillis();

        System.out.println("程序耗时："+(end-start)+"毫秒");
    }
}
