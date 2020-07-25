package com.itcast.demo;

/**
 * 恶汉式单例模式
 */
public class Singleton {
   /* //1.私有化构造方法
    private Singleton(){
    }
    //2.私有属性
    private static Singleton s = new Singleton();

    //3.提供对外的访问方法
    public static Singleton getNewInstance(){
        return s;
    }*/

    /**
     * 懒汉式单例模式
     */
   //1.私有化构造方法
    private Singleton(){
    }
    //2.私有化成员变量
    private static Singleton s;

    //.3提供公共对外访问方法
    public static Singleton getNewInstance(){
        if (s == null){
            s = new Singleton();
        }
        return s;
    }
}
