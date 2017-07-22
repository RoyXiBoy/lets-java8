package io.github.biezhi.java8.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ConvertDate {

    public static void main(String[] args) {
        Date date = Date.from(Instant.now());
        Instant instant = date.toInstant();

        LocalDateTime localDateTime = LocalDateTime.from(date.toInstant());
        System.out.println(localDateTime);

        date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

        date = Date.from(LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

}
