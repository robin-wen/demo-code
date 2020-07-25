package cn.itcast.demo;

import org.apache.commons.lang3.StringUtils;

public class ArgsDemo {
    public static void main(String[] args) {
        String str = "张三";

        if(StringUtils.isNotEmpty(str)){

            System.out.println("你好！"+str+"，恭喜登陆成功！");
        }
    }

}
