package io.github.biezhi.java8.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatDemo {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("默认格式化: " + now);
        System.out.println("自定义格式化: " + now.format(dateTimeFormatter));

        LocalDateTime localDateTime = LocalDateTime.parse("2017-07-20 15:27:44", dateTimeFormatter);
        System.out.println("字符串转LocalDateTime: " + localDateTime);

        dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateString = dateTimeFormatter.format(LocalDate.now());
        System.out.println("日期转字符串: " + dateString);

    }

}
