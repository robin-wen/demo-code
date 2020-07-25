package cn.itcast.demo;

/**
 * 懒汉式单例设计模式
 */
public class Singleton02 {
    //1.私有构造方法
    private Singleton02() {
    }
    //2.私有成员变量
    private static Singleton02 s;
    //3.提供公共对外访问的方法
    public static Singleton02 getNewInstance(){
        if(s == null){
            s = new Singleton02();
        }
        return s;
    }

}
