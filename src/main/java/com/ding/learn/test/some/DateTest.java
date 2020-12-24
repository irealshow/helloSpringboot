package com.ding.learn.test.some;

import java.util.Date;

public class DateTest {
	/*public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//		searchParam.put("startTime", df.format(new Date(new Date().getTime() -  30* 24 * 60 * 60 * 1000L))+" 00:00:00");
		System.out.println(df.format(new Date(new Date().getTime() -  30* 24 * 60 * 60 * 1000L))+" 00:00:00");
		System.out.println(new Date().getTime());
	}*/
	
	/*public static void main(String[] args) {
		Date dateLong = new Date(1585892281);
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String timeStr = date.format(1585892281*1000L);
		System.out.println(timeStr);
	}*/
	
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		
		Date time = new Date();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(time);
	}
}
