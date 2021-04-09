package com.ding.learn.test.date;

import org.apache.tomcat.jni.Local;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class NewDateTest {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
        test5();
    }


    private static void test5() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.minusDays(1).with(LocalTime.MIN).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println(localDateTime.minusDays(1).with(LocalTime.MAX).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        LocalDate date = LocalDate.parse("2021-03-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(date.toString());
    }

    private static void test4() {
        System.out.println(Instant.now());
        LocalDateTime todayDateTime = LocalDateTime.now();
        System.out.println("=====================================");
        System.out.println(todayDateTime.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println(todayDateTime.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println(todayDateTime.with(TemporalAdjusters.firstDayOfYear()));
        System.out.println(todayDateTime.with(TemporalAdjusters.lastDayOfYear()));
    }


    private static void test3() {
        System.out.println(LocalDate.now().minusDays(2).toString());
        LocalDate startDate = LocalDate.parse("2021-01-17", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate endDate = LocalDate.parse("2021-01-19", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(startDate.until(endDate).getDays());
        System.out.println(endDate.minusDays(14).toString());
    }

    private static void test2() {
        LocalDate start = LocalDate.now().minusDays(0);
        Instant instant3 = start.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        Date date3 = Date.from(instant3);
        System.out.println(start.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println(date3);


        LocalDateTime today_start = LocalDateTime.of(LocalDate.now().minusDays(1), LocalTime.MIN);
        LocalDateTime today_end = LocalDateTime.of(LocalDate.now().minusDays(1), LocalTime.MAX);
        System.out.println(today_start.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println(today_end.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    private static void test1() {
        LocalDate localDate = LocalDate.now();
        localDate = localDate.minusDays(7);
        System.out.println(localDate);

        LocalDateTime localDateTime =  LocalDateTime.now();
        String  dataTime = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.out.println(localDateTime.toString());
        System.out.println(dataTime);

        //取2016年10月的第1天
        LocalDate firstDay = localDate.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDay);

        System.out.println("===============");
        Instant instant  = Instant.now();
        System.out.println(instant);
        Date date = Date.from(instant);
        System.out.println(date);
        Instant instant2 = date.toInstant();

    }
}
