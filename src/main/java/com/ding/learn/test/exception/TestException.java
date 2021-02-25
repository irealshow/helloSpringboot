package com.ding.learn.test.exception;

import java.util.Arrays;

public class TestException {
    public static void main(String[] args) {
//        test1();
        int[] nums = new int[]{2,7,11,15};
//        twoSum(nums,9);
//        test2();
        test3();
    }

    private static void test3() {
        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"?
    }

    private static void test2() {
        int[] ns = new int[5];
        ns[0] = 68;
        ns[1] = 79;
        ns[2] = 91;
        Arrays.stream(ns).forEach(n-> System.out.println(n));
    }

    private static void test1() {
        try {
            throw new Exception("323");
        } catch (RuntimeException e) {
            System.out.println("this is a RuntimeException");
        } catch (Exception e) {
            System.out.println("this is a Exception");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums.length;j++) {
                if(nums[i] + nums[j] == target && i!=j) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        Arrays.stream(result).forEach(n-> System.out.println(n));
        return result;
    }

    public class TestException1{

    }
}
