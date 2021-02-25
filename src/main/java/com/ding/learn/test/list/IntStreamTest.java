package com.ding.learn.test.list;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamTest {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        IntStream.range(1,7).forEach(System.out::println);

    }
}
