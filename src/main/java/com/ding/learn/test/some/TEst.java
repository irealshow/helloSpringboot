package com.ding.learn.test.some;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.Random;

public class TEst {
	public static void main(String[] args) {
//		Arrays.asList("1,2,3".split(","));
		/*List list = Arrays.asList("1","2","3");
		Map<String, Integer> pageVisits = new HashMap<>();            
	     
	    String page = "https://agiledeveloper.com";
	     
	    incrementPageVisit(pageVisits, page);
	    incrementPageVisit(pageVisits, page);
	     
	    System.out.println(pageVisits.get(page));
	    list.forEach((n)-> System.out.print(n));*/
	    long la = 1596087036848l;
//	    Date data1 = new Date();
//	    System.out.println(data1.getTime());
	    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	    System.out.println( dateFormat.format(la));
	    
	    Random r = new Random(1);
	   	for (int i = 0; i < 5; i++) {
	   		int ran1 = r.nextInt(10);
	   		System.out.println(ran1);
		}
	}
	
	public static void incrementPageVisit(Map<String, Integer> pageVisits, String page) {
	    pageVisits.merge(page, 1, (oldValue, value) -> oldValue + value); 
	}
}
