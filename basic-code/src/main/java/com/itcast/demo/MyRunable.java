package com.itcast.demo;

public class MyRunable implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程提交了……");
    }
}
