package com.ding.learn.test.some;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class WhichDay {
	public static void main(String[] args) {
		 //获取系统时间
		Date date =new Date();
		//%tj表示一年中的第几天
		String strDate =String.format("今天是今年的第 %tj 天!",date);
		
//		System.out.println(strDate); 
		getWhichWeek();
//		getIndexName();
	}
	
	public static void getWhichWeek() {
		Calendar c = Calendar.getInstance();
		int week = c.get(Calendar.WEEK_OF_YEAR);
		System.out.println(week);
	}
	
	private static Set<String> getIndexName() {
		Set<String> indexNames = new HashSet<String>(); 
		Calendar c = Calendar.getInstance();
		c.setFirstDayOfWeek(Calendar.MONDAY);
		int calWeekCount = 3;
		for (int i = 0; i < calWeekCount; i++) {
			c.setTime(new Date());
			c.add(Calendar.DATE, - i*7);
			int week = c.get(Calendar.WEEK_OF_YEAR);
			int year = c.get(Calendar.YEAR);
			String indexName = "routewaybill_" + year + week;
			indexNames.add(indexName);
		}
		Calendar last = Calendar.getInstance();
		last.setTime(new Date());
		int preYear = last.get(Calendar.YEAR)-1;
		int curYear = last.get(Calendar.YEAR);
		indexNames.add("routewaybill_" + preYear +"1");
		indexNames.add("routewaybill_" + curYear +"1");
		return indexNames;
	}
}
