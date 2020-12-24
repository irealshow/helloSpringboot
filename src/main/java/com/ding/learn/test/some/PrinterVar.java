package com.ding.learn.test.some;

public class PrinterVar<T> {

    //该方法接收一个T类型的变量，打印并返回该变量
    public <T> T print(T var) {
        System.out.println(var);
        return var;
    }

    public static void main(String[] args) {
        PrinterVar<String> printerVar = new PrinterVar();
        String var = printerVar.print("aa");//String类型
        Integer var1 = printerVar.print(12);//int类型
        System.out.println(var + " " + var1);
    }
}