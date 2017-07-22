package io.github.biezhi.java8.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("现在的时间: " + now);

        LocalTime nowTime = LocalTime.parse("15:02");
        System.out.println("时间是: " + nowTime);

        nowTime = LocalTime.of(15, 02);
        System.out.println("时间是: " + nowTime);

        LocalTime nextHour = LocalTime.parse("15:02").plus(1, ChronoUnit.HOURS);
        System.out.println("下一个小时: " + nextHour);

        int hour = LocalTime.parse("15:02").getHour();
        System.out.println("小时: " + hour);
        int minute = LocalTime.parse("15:02").getMinute();
        System.out.println("分钟: " + minute);

        boolean isBefore = LocalTime.parse("15:02").isBefore(LocalTime.parse("16:02"));
        boolean isAfter = LocalTime.parse("15:02").isAfter(LocalTime.parse("16:02"));
        System.out.println("isBefore: " + isBefore);
        System.out.println("isAfter: " + isAfter);

        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
    }

}
