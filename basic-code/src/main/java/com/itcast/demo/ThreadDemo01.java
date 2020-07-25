package com.itcast.demo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(3);
        //提交线程并获取返回值
        Future<String> f01 = es.submit(new MyCallable());
        Future<String> f02 = es.submit(new MyCallable());
        Future<String> f03 = es.submit(new MyCallable());
        Future<String> f04 = es.submit(new MyCallable());
        Future<String> f05 = es.submit(new MyCallable());
        //获取返回值
        String s01 = f01.get();
        String s02 = f02.get();
        String s03 = f03.get();
        String s04 = f04.get();
        String s05 = f05.get();

        System.out.println(s01);
        System.out.println(s02);
        System.out.println(s03);
        System.out.println(s04);
        System.out.println(s05);
    }
}
