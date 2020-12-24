package com.ding.learn.test.some;


import com.ding.test.dto.Student;

import java.util.*;
import java.util.stream.Collectors;


public class ListTest {
	/*public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student(1, "zhangsan", "��");
		Student s2 = new Student(2, "xiaohong", "Ů");
		list.add(s1);
		list.add(s2);
		Map<String, Integer> collectMap = list.parallelStream()
                .collect(Collectors.toMap(Student::getName
                        , Student::getId, (key1, key2) -> key2));
		System.out.println(collectMap.toString());
	}*/
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student(1, "zhangsan", "111");
		Student s2 = new Student(2, "xiaohong", "111");
		Student s3 = new Student(2, "zhangsan", "111");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		//去重
		List<Student> lists = list.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(
				() -> new TreeSet<>(Comparator.comparing(o -> o.getName() + "#" + o.getSex()))), ArrayList::new));
		//排序
		Collections.sort(list, (t1,t2) -> t1.getName().compareTo(t2.getName()));
		for (Student student : lists) {
			System.out.println(student.toString());
		}
	}
}
