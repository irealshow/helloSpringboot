package com.ding.learn.test.list;

import com.ding.learn.test.dto.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        IntStream.range(1,32).forEach(n->list.add(n));
        System.out.println(list);
        int pageSize = 10;
        IntStream.range(0,(list.size() + pageSize - 1)/pageSize).forEach(n->{
            List<Integer> aModelSubList =  list.stream().skip(n*pageSize).limit(pageSize).collect(Collectors.toList());
            System.out.println(aModelSubList+"****");
        });
//        Stream.iterate(0, n->n+1)
//                .limit(10).forEach(System.out::print);
        /*Stream.iterate(0, n->n+1)
                .limit(10).parallel().map(n->list.stream().skip(n*10).limit(10).parallel().collect(Collectors.toList())).forEach(
                n-> System.out.println(n)
        );*/
       /* Stream.iterate(0, n->n+1)
                .limit(10).map(n->list.stream().skip(n*10).limit(10).collect(Collectors.toList()))
                .forEach(n-> {
                    System.out.println(n+"****");
              }
        );*/
    }

    public static void main1(String[] args) {
        IntStream.range(0,3).forEach(n-> {
            if(n == 0) {
                throw new RuntimeException("异常");
            }
            System.out.println(n);
        });
    }
}
