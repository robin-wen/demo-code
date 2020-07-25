package com.itcast.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {

    public static void main(String[] args) {
        //使用工厂类创建线线程池对象,返回线程池执行接口实现类
        ExecutorService es = Executors.newFixedThreadPool(5);
        //调用提交方法获取线程池中的线程
        es.submit(new MyRunable());
        es.submit(new MyRunable());
        es.submit(new MyRunable());
        es.submit(new MyRunable());
        es.submit(new MyRunable());
        es.submit(new MyRunable());
        es.submit(new MyRunable());
        es.submit(new MyRunable());
        es.submit(new MyRunable());
        es.submit(new MyRunable());
        //关闭线程池，一般不用
        //es.shutdown();
    }
}
