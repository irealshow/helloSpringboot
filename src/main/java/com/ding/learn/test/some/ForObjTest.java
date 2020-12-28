package com.ding.learn.test.some;


import com.ding.learn.test.dto.Student;

import java.util.ArrayList;
import java.util.List;

public class ForObjTest {
	public static void main(String[] args) {
		List<Student> lists = new ArrayList<Student>();
		Student t;
		for (int i = 0; i < 10; i++) {
			t = new Student();
			t.setName("name"+i);
			System.out.println(t);
			lists.add(t);
		}
		System.out.println(lists);
	}
}
