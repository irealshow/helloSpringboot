package com.ding.test.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class parallelTest {
	/*public static void main(String[] args) {
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		IntStream.range(0,10).boxed().forEach(n->{
			System.out.println(n);
		});
		
		System.out.println("=========================");
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		numbers.parallelStream().forEach(n->{
			System.out.println(Thread.currentThread().getName());
		});
	}*/
	
	public static void main121(String[] args) {
		for (int i = 0; i < 10; i++) {
            // the initial capacity is must
			List<Integer> list = new ArrayList<Integer>(10000);
//            List<Integer> list = Collections.synchronizedList(new ArrayList<>());
//			Stream.of("a","b","c").parallel().forEach(System.out::println);
            IntStream.range(0, 10000)
                    .boxed()
                    .parallel()
                    .forEachOrdered(data -> list.add(data));
//            .forEach(System.out::println);
            System.out.println("NO." + i + ": " + list.stream().sorted().collect(Collectors.toList()));
        }
	}
	
	public static void main(String[] args) {
//		 List<String> list = Collections.synchronizedList(new ArrayList<>());
		testParallel1();
//		testThread();
		
	}
	
	//主线程执行是否影响子线程执行
	private static void testThread() {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(()-> {
			 try {
					Thread.sleep(5000);
					System.out.println(Thread.currentThread().getName());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		});
//		t1.setDaemon(true);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"主线程");
	}
	
	//并行流导致的线程不安全问题（1、线程安全的list 2、按顺序foreach）
	private static void testParallel() {
		List<String> list = Collections.synchronizedList(new ArrayList<>());
//		 List<String> list = new ArrayList<>();
		 IntStream.range(0, 10).parallel().forEach(n->{
//	     IntStream.range(0, 10).parallel().forEachOrdered(n->{
			 try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 list.add(UUID.randomUUID().toString());
		 });
		 System.out.println("生成订单数："+list.size());
		 List<String> filterOrderNos = list.stream().distinct().collect(Collectors.toList());
        System.out.println("过滤重复后订单数："+filterOrderNos.size());
        System.out.println("重复订单数："+(list.size()-filterOrderNos.size()));
	}


	private static void testParallel1() {
		List<Integer> listOfIntegers =
				new ArrayList<>();
		for (int i = 0; i <1000000; i++) {
			listOfIntegers.add(i);
		}
//		 List<String> list = new ArrayList<>();
		listOfIntegers.stream().filter(n->n.equals(1000));
		listOfIntegers.parallelStream().forEach(n->{
//	     IntStream.range(0, 10).parallel().forEachOrdered(n->{
			System.out.println("11111111");
		});
		System.out.println("生成订单数");
	}
	
	
}
