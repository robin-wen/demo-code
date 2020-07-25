package com.pingan.demo
/**
 * 列表的遍历
 */
class Demo03 {

    public static void main(String[] args) {
        def list = [9, 20, 21, 23, 24, 34, 2];
        list.each { print(it) };
    }
}
