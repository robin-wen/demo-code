package com.itcast.demo;

/**
 * Debug调试
 */
public class DebugDemo {

    public static void main(String[] args) {
        getSum(100);
    }

    //求n以内偶数和的方法
    public static void getSum(Integer n) {

        Integer sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
