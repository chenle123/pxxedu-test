package com.test.date.list;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName TimeTest
 * @Description TODO
 * @Author bianliang
 * @Date 2020/1/6 17:53
 * @Version 1.0
 */

public class TimeTest {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = sdf.parse("2020-01-08 13:50:10");

        long time = date.getTime();

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = sdf.parse("2020-01-08 13:50:15");
        long time1 = date1.getTime();

        System.out.println(time1-time);

        System.out.println(time);

        long l = 1578462610000l+10000;
        System.out.println(new Date(l));

        System.out.println(new Date(1578478815l));
    }
}
