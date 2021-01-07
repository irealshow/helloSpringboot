package com.ding.learn.test.list;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ForeEachOrderedTest {
    public static void main(String[] args) {
        //forEach 与 foreEachOrdered 的区别 主要的区别在并行流的处理上
       /* Stream.of("A","B","C","D","E","F","G").parallel().forEach(System.out::print);
        System.out.println("");
        Stream.of("A","B","C","D","E","F","G").parallel().forEachOrdered(System.out::print);*/

        long start = System.currentTimeMillis();
        IntStream.range(0,1000).forEach(n->{
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(System.currentTimeMillis()-start);
        long start1 = System.currentTimeMillis();
        IntStream.range(0,1000).parallel().forEach(n->{
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(System.currentTimeMillis()-start1);
    }
}
