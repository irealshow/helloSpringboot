package com.ding.learn.test.some;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.util.StringUtils;

public class LogTest {
	/*public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(LogTest.class);
		logger.info("hello {}",new Date());
		
		String a = "你好，颠三倒四。";
		String sellwords = "[\"" + a + "\"]";
		System.out.println(sellwords);
		String orderId = "4674879753452679241A";
		String curOrderId = orderId.substring(0,orderId.indexOf("A"));
		System.out.println(curOrderId);
		
		Student stu = new Student();
		Long age = stu.getAge();
		if(age != null && age != 1) {
			System.out.println("12121");
		}
		if("1".equals(stu.getName())) {
			System.out.println("222");
		}
	}*/
	
	public static void main(String[] args) {
		String curOrderId = "1234523A2";
		if(curOrderId.endsWith("A")) {
			curOrderId = curOrderId.substring(0,curOrderId.indexOf("A"));
		}
		System.out.println(curOrderId);
	}
}
