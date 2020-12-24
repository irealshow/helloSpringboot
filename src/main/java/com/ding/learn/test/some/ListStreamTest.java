package com.ding.learn.test.some;

import com.ding.test.dto.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListStreamTest {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println(filtered.toString());
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		List<Integer> mapNumbers = numbers.stream().map(n->n*n).distinct().collect(Collectors.toList());
		System.out.println(mapNumbers);
		
		
		Student s1 = new Student(1, "zhangsan", "111");
		Student s2 = new Student(2, "xiaohong", "222");
		Student s3 = new Student(3, "lisi", "333");
		List<Student> stuLists = Arrays.asList(s1,s2,s3);
//		List<String> mstuLists = stuLists.stream().map(i->i.getName()).collect(Collectors.toList());
		Map<String,String> map = stuLists.stream().collect(Collectors.toMap(Student::getName,Student::getSex,(key1, key2) -> key2));
		stuLists.stream().collect(Collectors.groupingBy(Student::getName));
		System.out.println(map);
		
		List<String> strings1 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		// 获取空字符串的数量
		int count = (int) strings1.parallelStream().filter(string -> string.isEmpty()).count();
		System.out.println(count);
		
		
		List<String>strings2 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered2 = strings2.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("筛选列表: " + filtered2);
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("合并字符串: " + mergedString);
		
		//skip方法是一个中间操作，跳过stream中的前n个元素，n不能为负值。如果n大于stream的大小，则返回空stream。
		//获取流中的偶数，并跳过前两个
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
		.filter(i -> i % 2 == 0)
		.skip(2)
		.forEach(i -> System.out.print(i + " "));
		
		 Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
		.filter(i -> i % 2 == 0)
		.limit(2)
		.forEach(i -> System.out.print(i + " "));
		 
		 System.out.println("==========");
		 
		 //达到分页效果  offset,limit
		 Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
		 .skip(4)
		 .limit(2)
		 .forEach(i -> System.out.print(i + " "));
		 
		 System.out.println("==========");
		 //分页动态操作
		 List<Integer> listNum = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		 int page = listNum.size()/3;
		 for (int j = 0; j < page+1; j++) {
			 List<Integer> listTemp =  listNum.stream().skip((j)*3).limit(3).collect(Collectors.toList());
			 if(listTemp.isEmpty()) {
				 break;
			 }
			 System.out.println(listTemp);
		}
	}
}
