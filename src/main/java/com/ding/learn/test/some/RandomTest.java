package com.ding.learn.test.some;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
//		System.out.println(getRandomStr(3));
		getRandomStr1();
	}
	
	private static void getRandomStr1() {
		Random random = new Random();
		random.ints().limit(5).forEach(System.out::println);
	}

	//获取随机数
	private static String getRandomStr(int len) {
		String val = "";
		Random random = new Random();
		for (int i = 0; i < len; i++) {
			val += String.valueOf(random.nextInt(10));
		}
		return val;
	}
	
	
}
