package com.ding.learn.test.dto;

public class NullTest {
	public static void main(String[] args) {
		Student stu = new Student();
		if("wew".equals(stu.getName())) {
			System.out.println("1212");
		}
		if(1== stu.getId()) {
			System.out.println("333");
		}
//		if(stu.getName().equals("wew")) {
//			System.out.println("1212");
//		}
		System.out.println("test git");
	}
}
