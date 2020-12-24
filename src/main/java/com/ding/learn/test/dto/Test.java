package com.ding.learn.test.dto;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		String a = "aabaaccdd";
		System.out.println(a.toString());
		List<String> list = Arrays.asList(a.split(""));
		System.out.println(list);                                               //n->n
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(String::toString,Collectors.counting()));
		System.out.println(collect);
		
		Stream.of(a.split(""));
	}
}
