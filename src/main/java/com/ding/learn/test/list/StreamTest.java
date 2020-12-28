package com.ding.learn.test.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        IntStream.range(0,100).forEach(n->list.add(n));
        System.out.println(list);

        Stream.iterate(0, n->n+1)
                .limit(10).parallel().map(n->list.stream().skip(n*10).limit(10).parallel().collect(Collectors.toList())).forEach(
                n-> System.out.println(n)
        );
    }
}
