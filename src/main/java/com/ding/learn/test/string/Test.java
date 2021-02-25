package com.ding.learn.test.string;

public class Test {
    public static void main(String[] args) {
        String str = "%";
        String str1 = "_";
        System.out.println(str.replace("%","\\%").replace("_","\\_"));
        System.out.println(str1.replace("%","\\%").replace("_","\\_"));
    }
}
