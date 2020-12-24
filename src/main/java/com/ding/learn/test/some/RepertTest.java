package com.ding.learn.test.some;

public class RepertTest {
	public static boolean duplicate(int[] nums, int length, int[] duplication) {
	    if (nums == null || length <= 0)
	        return false;
	    for (int i = 0; i < length; i++) {
	        while (nums[i] != i) {
	            if (nums[i] == nums[nums[i]]) {
	                duplication[0] = nums[i];
	                return true;
	            }
	            swap(nums, i, nums[i]);
	        }
	    }
	    return false;
	}

	private static void swap(int[] nums, int i, int j) {
	    int t = nums[i];
	    nums[i] = nums[j];
	    nums[j] = t;
	}
	
	public static void main(String[] args) {
		boolean b= testRet();
//		System.out.println(b);
		/*int[] a = {2, 3, 1, 0, 2, 5};
		int[] b = new int[1];
		duplicate(a, 5, b);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
	    }*/
	}

	private static boolean testRet() {
		int i = 0;
		/*for (int j = 0; j < 10; j++) {
			if(j == 2) {
				continue;
			}
			System.out.println("*****"+j);
		}*/
		while(i<=10) {
			i++;
			if(i == 2) {
				continue;
//				break;
			}
			System.out.println("*****"+i);
		}
		return false;
	}
}
