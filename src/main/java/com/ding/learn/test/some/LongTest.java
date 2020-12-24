package com.ding.learn.test.some;

import java.util.HashMap;
import java.util.Map;

public class LongTest {
	/*public static void main(String[] args) {
		Long a = null;
		if(a == 1) {
			System.out.println(123);
		}
		
	}*/
	
	public static void main(String[] args) {
		Map<String,Integer> preMergeCountMap=new HashMap<String, Integer>();
		preMergeCountMap.put("121", preMergeCountMap.get("121"));
		System.out.println(preMergeCountMap.get("121")+3);
	}
}
