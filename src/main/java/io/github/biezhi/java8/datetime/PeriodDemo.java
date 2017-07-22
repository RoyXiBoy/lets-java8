package io.github.biezhi.java8.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDemo {

    public static void main(String[] args) {
        LocalDate initialDate = LocalDate.parse("2017-07-20");
        LocalDate finalDate   = initialDate.plus(Period.ofDays(5));
        System.out.println("初始化日期: " + initialDate);
        System.out.println("加日期之后: " + finalDate);

        long between = ChronoUnit.DAYS.between(initialDate, finalDate);
        System.out.println("差距天数: " + between);
    }

}
