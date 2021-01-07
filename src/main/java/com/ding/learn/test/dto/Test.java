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

		/*List<Integer> list = new ArrayList<Integer>();
		IntStream.range(0,100).forEach(n->list.add(n));
		System.out.println(list);
		Stream.iterate(0,n->n+1)
				.limit(10).parallel().map(n->list.stream().skip(n*10).limit(10).parallel().collect(Collectors.toList())).forEach(
						n-> System.out.println(n)
		);*/

		String phone = "1519146934";
//		System.out.println(phone.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2"));
		String email = "2344@qq.com";
		System.out.println(email.substring(0,email.indexOf("@")));
//		System.out.println(email.substring(0,email.indexOf("@")).replaceAll("(\\d{3})\\d{4}(\\d{2})", "$1****$2"));


//手机号脱敏处理
		phone = phone.replaceAll("(^\\d{3})\\d.*(\\d{4})", "$1****$2");
//邮箱脱敏处理
		email = email.replaceAll("(^\\w)[^@]*(@.*$)", "$1****$2");
		System.out.println(email.contains("**4**"));
//		email = email.replaceAll("(^\\w{3})[^@]*(@.*$)", "$1****$2");

		System.out.println(phone);
		System.out.println(email);
	}
}
