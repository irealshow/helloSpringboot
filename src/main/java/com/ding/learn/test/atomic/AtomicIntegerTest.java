package com.ding.learn.test.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {
    private static final AtomicInteger  sign = new AtomicInteger(100);

    public static void main(String[] args) {
        System.out.println(sign.getAndIncrement());
        System.out.println(sign.getAndSet(688));
        System.out.println(sign);
    }
}
