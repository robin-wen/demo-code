package cn.itcast.demo;

public class Demo03 {

    public static void main(String[] args) {
        Singleton02 s1 = Singleton02.getNewInstance();
        Singleton02 s2 = Singleton02.getNewInstance();

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1==s2);
    }
}
