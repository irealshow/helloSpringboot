package com.ding.learn.test.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListRemoveTest {
    private  static  int sum = 0;
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
        test5();
//        int[] sums = {1,1,2};
//        System.out.println(removeDuplicates(sums));
    }

    private static void test5() {
        System.out.println(huidiao(0));
    }

    private static int huidiao(int i) {
        System.out.println("1234"+"** "+ sum++);
        while (i<10) {
            i++;
            huidiao(i);
        }
        return i;
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(Arrays.toString(nums));
        return i + 1;
    }

    private static void test4() {
        int[] sums = new int[] {4, 5, 6, 7};
        int[] newAums = new int[3];
        int a = 0;
        for (int i=0;i<sums.length;i++) {
            if(sums[i] == 6) {
            } else {
                newAums[a] = sums[i];
                a++;
            }
        }
        System.out.println(Arrays.toString(newAums));
    }

    private static void test2() {
        int[] sums = new int[]{1,3,7};
        Arrays.asList(sums);
        for (int i=0;i<sums.length;i++) {
            System.out.println(sums[i]);
            if(sums[i] == 3) {

            }
        }
    }

    private static void test3() {
        int[] array1 = new int[] {4, 5, 6, 7};
        int num = 2;
        int[] newArray = new int[array1.length-1];

        for(int i=0;i<newArray.length; i++) {
            // 判断元素是否越界
            if (num < 0 || num >= array1.length) {
                throw new RuntimeException("元素越界... ");
            }
            //
            if(array1[i] == 6) {
                array1[i] = array1[i+1];
            }
            /*if(i<num) {
                newArray[i] = array1[i];
            }
            else {
                newArray[i] = array1[i+1];
            }*/
        }
        // 打印输出数组内容
        System.out.println(Arrays.toString(array1));
        array1 = newArray;
        System.out.println(Arrays.toString(array1));
    }

    private static void test1() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("d");
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//            if(iterator.next().equals("b")) {
//                iterator.remove();
//            }
//        }
        list.removeIf(n->n.equals("b"));
        /*for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
            if(list.get(i).equals("b")) {
                list.remove(i);
//                i--;
            }
        }*/
        System.out.println(list);
    }
}
