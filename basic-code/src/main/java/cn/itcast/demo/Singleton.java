package cn.itcast.demo;

/**
 * 恶汉式单例模式
 */
public class Singleton {
    //1.私有构造方法
    private Singleton(){
    }
    //2.私有成员变量
    private static  Singleton s = new Singleton();
    //3.提供公共的对外的get方法
    public static Singleton getNewInstance (){
        return s;
    }
}
