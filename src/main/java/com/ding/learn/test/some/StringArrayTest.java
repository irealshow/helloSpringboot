package com.ding.learn.test.some;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrayTest {
	public static void main(String[] args) {
		String name = "上海、 北京 、    田径 、 西安";
		List<String> lists = Arrays.asList(name.split("、"));
		List<String> names = new ArrayList<String>();
		for (String a : lists) {
			names.add(a.trim());
		}
//		String result = String.join(",", names);
		
		lists.forEach(n -> 
			System.out.println(n));
//		System.out.println(result);
	}
}
