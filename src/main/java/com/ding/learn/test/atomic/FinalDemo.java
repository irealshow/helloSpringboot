package com.ding.learn.test.atomic;

import java.util.*;

/**
 * 3、由此可见：
 *
 * 用了map、list、数组、StringBuilder 、StringBuffer .它们的内容是可以修改的。
 * String和基本数据类型修饰的变量。同样final表示地址不能修改，但是地址的存储跟常量的值有关，给他重新赋值会指向另外一个对象，地址就改变了。
 * 总结
 * 被final修饰的变量，不可变的是变量的引用，而不是变量的内容
 *
 * 当然，final还有其他作用，比如：
 *
 * 被final修饰的常量，在编译阶段会存入调用类的常量池中
 * 这一块暂时不先探讨，现在自己水平还没到。还需要继续努力。
 */
public class FinalDemo {
    private static final Map<String, Object> NAME = new HashMap<>(16);
    private static final List<String> LIST = new ArrayList<>(10);
    private static final String[] TYPE = new String[15];
    private static final StringBuilder SB = new StringBuilder("22");
    private static final StringBuffer SBU = new StringBuffer("22");
    private static final String S = "44";
    private static final int num = 44;
    private static final String S1 = new String();



    public void setName() {
        NAME.put("1", "maomao");
        LIST.add("11");
        TYPE[0] = "1";
        SB.append("12");
        SBU.append("32");
        System.out.println(NAME);
        System.out.println(LIST);
        System.out.println(Arrays.asList(TYPE));
        System.out.println(SB.toString());
        System.out.println(SBU.toString());
    }

    public static void main(String[] args) {
        /*FinalDemo finalDemo = new FinalDemo();
        finalDemo.setName();*/
        NAME.put("1", "maomao");
        LIST.add("11");
        TYPE[0] = "1";
        SB.append("12");
        SBU.append("32");
        String newS =S.concat("ewew");
        System.out.println(NAME);
        System.out.println(LIST);
        System.out.println(Arrays.asList(TYPE));
        System.out.println(SB.toString());
        System.out.println(SBU.toString());
        System.out.println(S);
        System.out.println(newS);
    }

}
