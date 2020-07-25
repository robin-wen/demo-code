package com.itcast.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间类
 */
public class DateDemo {
    public static void main(String[] args) {

        Date date = new Date();
        long millis = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //String formatDate = sdf.format(date);
        String formatDate02 = sdf.format(millis);
        System.out.println(formatDate02);

        //System.out.println(formatDate);
    }
}
