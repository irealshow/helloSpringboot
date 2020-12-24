package com.ding.learn.test.some;

public class TEstString {
	/*public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		int listSize = list.size();
		int batchSize = 2;
		if(listSize > 0) {
			if(list.size() > batchSize) {
				int page = listSize/batchSize;
				int last = listSize%batchSize;
				
				for (int i = 0; i < page; i++) {
					List<String> batchList = list.subList(i*batchSize, (i+1)*batchSize);
					System.out.println(batchList.toString());
				}
				if(last>0) {
					List<String> batchList = list.subList(page*batchSize, listSize);
					System.out.println(batchList.toString());
				}
				
			}else {
				System.out.println(list.toString());
			}
		}
	} */
	

	/*public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) + 1);
		// 时
		calendar.set(Calendar.HOUR_OF_DAY, 3);
		// 分
		calendar.set(Calendar.MINUTE, 0);
		// 秒
		calendar.set(Calendar.SECOND, 0);
		
		Date time = calendar.getTime();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = df.format(time);
		System.out.println(format);
	}*/
	
	public static void main(String[] args) {
		/*int a = 0;
		if(a == 1) {
			System.out.println(11);
		}*/
		int c = 12;
		Integer b = new Integer(1200);
		System.out.println(c);
		System.out.println(b);
	}
}
