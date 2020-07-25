package com.itcast.demo;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    public String call() {

        return "a啊哈哈！！！";
    }
}
