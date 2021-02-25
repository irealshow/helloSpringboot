package com.ding.learn.test.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {
    private static final AtomicInteger  sign = new AtomicInteger(100);

    public static void main(String[] args) {
//        test1();
        test2();
    }

    private static void test2() {
        AtomicInteger ytoCount = new AtomicInteger();
        System.out.println(ytoCount.get());
        ytoCount.set(ytoCount.get() + 3);
        ytoCount.set(ytoCount.get() + 2);
        System.out.println(ytoCount);
    }

    private static void test1() {
        System.out.println(sign.getAndIncrement());
        System.out.println(sign.getAndSet(688));
        System.out.println(sign);
    }
}
