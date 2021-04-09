package com.ding.learn.test.list;

import com.ding.learn.test.dto.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamTest {
    public static void main(String[] args) {
        test1();
    }
    //Java出于安全性等因素考虑将某些类如：String、基本类型的包装类、BigInteger、BigDecimal设计成为不可变类。
    private static void test1() {
        List<Integer> list = IntStream.of(3,6,8).boxed().collect(Collectors.toList());
        List<Integer> listnew =  new ArrayList<>();
//        List<Integer> listnew = Collections.synchronizedList(new ArrayList<Integer>());
        System.out.println(list.get(2));
        list.stream().forEach(n->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            n=300;
        });
        System.out.println("123");
        System.out.println(list);
    }
    private static void test2() {
        List<Student> listnew =  new ArrayList<>();
        Student stu = new Student();
        stu.setIntage(2);
        Student stu1 = new Student();
        stu1.setIntage(5);
        Student stu2 = new Student();
        stu2.setIntage(8);
        listnew.add(stu);
        listnew.add(stu1);
        listnew.add(stu2);
        listnew.parallelStream().forEach(n->{
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            n.setIntage(n.getIntage()+2);
        });
        System.out.println("123");
        System.out.println(listnew);
    }

    private static void test3() {
        List<String> listnew =  Stream.of("ab","bc","ef").collect(Collectors.toList());
        listnew.parallelStream().forEach(n->{
            System.out.println(n.replaceAll("b","*"));
        });
        System.out.println("123");
        System.out.println(listnew);
    }
}
