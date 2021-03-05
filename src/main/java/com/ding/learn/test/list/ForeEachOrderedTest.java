package com.ding.learn.test.list;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ForeEachOrderedTest {
    public static void main(String[] args) throws Exception {
        try {
//            IntStream.range(-5,5).forEach(n-> System.out.println(n));
            IntStream.range(-5,10).parallel().forEach(n->{
                try {
                    int result = 10/n;
                    System.out.println(result+":"+Thread.currentThread().getName());
                } catch (Exception e) {
                    throw new RuntimeException("并行流执行出错");
                }
            });
        } catch (Exception e) {
            System.out.println(e.getMessage()+Thread.currentThread().getName());
        }
    }


    public static void main1(String[] args) {
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
