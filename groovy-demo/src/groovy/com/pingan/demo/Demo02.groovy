package com.pingan.demo
/**
 * 闭包
 */
class Demo02 {

    public static void main(String[] args) {
        def clos = { println "hello world" };
        //调用call方法执行闭包的代码
        clos.call();
    }
}
