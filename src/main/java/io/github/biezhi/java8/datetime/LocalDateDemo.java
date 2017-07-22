package io.github.biezhi.java8.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateDemo {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("当前日期: " + localDate);

        LocalDate.of(2017, 07, 20);
        LocalDate.parse("2017-07-20");

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("tomorrow: " + tomorrow);

        LocalDate prevMonth = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("prevMonth: " + prevMonth);

        DayOfWeek thursday = LocalDate.parse("2017-07-20").getDayOfWeek();
        System.out.println("周四: " + thursday);

        int twenty = LocalDate.parse("2017-07-20").getDayOfMonth();
        System.out.println("twenty: " + twenty);

        boolean leapYear = LocalDate.now().isLeapYear();
        System.out.println("是否闰年: " + leapYear);

        boolean notBefore = LocalDate.parse("2017-07-20")
                .isBefore(LocalDate.parse("2017-07-22"));
        System.out.println("notBefore: " + notBefore);

        boolean isAfter = LocalDate.parse("2017-07-20").isAfter(LocalDate.parse("2017-07-22"));
        System.out.println("isAfter: " + isAfter);

        LocalDate firstDayOfMonth = LocalDate.parse("2017-07-20")
                .with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("这个月的第一天: " + firstDayOfMonth);

        firstDayOfMonth = firstDayOfMonth.withDayOfMonth(1);
        System.out.println("这个月的第一天: " + firstDayOfMonth);

        LocalDate birthday = LocalDate.of(2009, 07, 20);
        MonthDay birthdayMd = MonthDay.of(birthday.getMonth(), birthday.getDayOfMonth());
        MonthDay today = MonthDay.from(LocalDate.now());
        System.out.println("今天是否是我的生日: " + today.equals(birthdayMd));

    }

}
