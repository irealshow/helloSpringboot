package com.ding.learn.test.some;

import com.ding.test.dto.Student;

public class ObjectTest {
	public static void main(String[] args) {
		Student stu = null;
		try {
			for (int i = 0; i < args.length; i++) {
				stu = new Student();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
