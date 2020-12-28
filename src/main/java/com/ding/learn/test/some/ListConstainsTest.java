package com.ding.learn.test.some;

import com.ding.learn.test.dto.Student;

import java.util.Arrays;
import java.util.List;

public class ListConstainsTest {
	public static void main(String[] args) {
		Student s1 = new Student(1, "zhangsan", "111");
		Student s2 = new Student(2, "xiaohong", "222");
		Student s3 = new Student(3, "lisi", "333");
		List<Student> stuLists = Arrays.asList(s1,s2,s3);
		Student s5 = new Student(6, "zhangsan", "111");
		System.out.println(stuLists.contains(s5));
		System.out.println(s1.equals(s1));
		
		String a1 = "123";  //常量池，a1和a2指向一个常量池
		String a2 = "123";
//		System.out.println(a1 == a2);
	}
}
