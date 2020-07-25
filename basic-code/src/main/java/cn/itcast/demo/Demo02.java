package cn.itcast.demo;

public class Demo02 {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getNewInstance();
        Singleton s2 = Singleton.getNewInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);

        System.out.println(s1.equals(s2));

        int i = s1.hashCode();
        int j = s2.hashCode();
        System.out.println(i);
        System.out.println(j);
    }
}
