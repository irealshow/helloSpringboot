package com.ding.learn.test.some;

public class HashCodeTest {
	public static void main(String[] args) {
		String sname = "ding";
		byte[] bytes = sname.getBytes();
		char[] chars = sname.toCharArray();
		System.out.println(bytes);
		System.out.println(chars);
//		String a = "54329c8f-bad9-4db7-83aa-67b916f6ab9c";
////		String a = "06fa616f-d4ae-4fd5-b0f5-c64dd5a325c6";
//		String b = "a49213fa-80ad-49c5-85c4-a56d71d2f235";
//		String c = "8054a23f-56db-4e10-b7c9-83f0ef810d7a";
		System.out.println(sname.hashCode());
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
//		System.out.println(c.hashCode());
//		System.out.println(c.hashCode()%10);
	}

}
