package com.ding.learn.test.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		/*String a = "aabaaccdd";
		System.out.println(a.toString());
		List<String> list = Arrays.asList(a.split(""));
		System.out.println(list);                                               //n->n
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(String::toString,Collectors.counting()));
		System.out.println(collect);
		
		Stream.of(a.split(""));*/

		List<Integer> list = new ArrayList<Integer>();
		IntStream.range(0,100).forEach(n->list.add(n));
		System.out.println(list);
		Stream.iterate(0,n->n+1)
				.limit(10).parallel().map(n->list.stream().skip(n*10).limit(10).parallel().collect(Collectors.toList())).forEach(
						n-> System.out.println(n)
		);

	}
}
