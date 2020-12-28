package com.ding.learn.test.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionsTest {
    public static void main(String[] args) {
        String a = "战三颠三倒四8";
        System.out.println(a.length());
        if(a.length() > 6) {
            System.out.println(a.substring(0,6));
        }

        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("23");
        list1.add("3");
        list1.add("433");
        list1.add("33");

        List<String> list2 = new ArrayList<>();
        list2.add("2");
        list2.add("3");
        list2.add("6");
        list2.add("7");
        
        list1.stream().map(n->n+"").collect(Collectors.toList());
//        System.out.println(abc+"@");
        /*// 交集
        List<String> intersection = list1.stream().filter(item -> list2.contains(item)).collect(Collectors.toList());
        System.out.println("---交集 intersection---");
        intersection.parallelStream().forEach(System.out::println);

        // 差集 (list1 - list2)
        List<String> reduce1 = list1.stream().filter(item -> !list2.contains(item)).collect(Collectors.toList());
        System.out.println("---差集 reduce1 (list1 - list2)---");
        reduce1.parallelStream().forEach(System.out::println);

        // 差集 (list2 - list1)
        List<String> reduce2 = list2.stream().filter(item -> !list1.contains(item)).collect(Collectors.toList());
        System.out.println("---差集 reduce2 (list2 - list1)---");
        reduce2.parallelStream().forEach(System.out::println);

        // 并集
        List<String> listAll = list1.parallelStream().collect(Collectors.toList());
        List<String> listAll2 = list2.parallelStream().collect(Collectors.toList());
        listAll.addAll(listAll2);
        System.out.println("---并集 listAll---");
        listAll.parallelStream().forEachOrdered(System.out::println);

        // 去重并集
        List<String> listAllDistinct = listAll.stream().distinct().collect(Collectors.toList());
        System.out.println("---得到去重并集 listAllDistinct---");
        listAllDistinct.parallelStream().forEachOrdered(System.out::println);*/

        System.out.println(list1.parallelStream().map(n->n.concat("m")).collect(Collectors.toList()));

        Map<Integer, List<String>> peopleByCity = list1.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(peopleByCity);
    }

}
