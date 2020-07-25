package cn.itcast.demo;

import java.util.Scanner;

public class Demo01 {

    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);
        StringBuilder reverse = sb.reverse();

        System.out.println("输出的字符串是：" + reverse);
    }
}
