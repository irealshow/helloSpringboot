package com.ding.learn.test.list;

import com.ding.learn.test.dto.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main1(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        IntStream.range(0,9).forEach(n->list.add(n));
        System.out.println(list);

        /*Stream.iterate(0, n->n+1)
                .limit(10).parallel().map(n->list.stream().skip(n*10).limit(10).parallel().collect(Collectors.toList())).forEach(
                n-> System.out.println(n)
        );*/
        Student stu = new Student();
        Stream.iterate(0, n->n+1)
                .limit(10).parallel().map(n->list.stream().skip(n*10).limit(10).parallel().collect(Collectors.toList()))
                .forEach(n-> {
                  n.parallelStream().forEach(m->{
                      stu.setAge(Long.valueOf(m));
                      System.out.println(stu.getAge()+": "+m);
                  });
              }
        );
    }

    public static void main(String[] args) {
        IntStream.range(0,3).forEach(n-> {
            if(n == 0) {
                throw new RuntimeException("异常");
            }
            System.out.println(n);
        });
    }
}
