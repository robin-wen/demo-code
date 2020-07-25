package com.itcast.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期类
 */
public class APIDemo02 {

    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        String formatDate = sdf.format(date);

        System.out.println(formatDate);
    }
}
