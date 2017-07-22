package io.github.biezhi.java8.datetime;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeDemo {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("现在: " + now);

        LocalDateTime.of(2017, Month.JULY, 20, 15, 18);
        LocalDateTime.parse("2017-07-20T15:18:00");

        LocalDateTime tomorrow = now.plusDays(1);
        System.out.println("明天的这个时间: " + tomorrow);

        LocalDateTime minusTowHour = now.minusHours(2);
        System.out.println("两小时前: " + minusTowHour);

        Month month = now.getMonth();
        System.out.println("当前月份: " + month);
    }

}
