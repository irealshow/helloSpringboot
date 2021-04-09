package com.ding.learn.test.date;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class TestSUm1 {
    public static void main(String[] args) {
        String name = "ding";
        System.out.println(new StringBuffer(name).reverse().toString());

        String shopName = "K99903209-黄天天";
        System.out.println(shopName.substring(0,shopName.indexOf("-")));

        try {
            double sum = getDouble();
            System.out.println(sum);
        } catch (Exception e) {
            log.info("异常：{}", e.getMessage());
        }
    }

    private static Double getDouble() {
        return null;
    }
}