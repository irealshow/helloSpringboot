package com.ding.learn.test.json;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ding.learn.test.dto.AutoRechargeAModeRequest;
import com.ding.learn.test.dto.Student;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
public class JsonTest {
    public static void main(String[] args) {
        test1();
//        test2();
        test3();
    }


    private static void test1() {
        JSONObject jsonObj = new JSONObject();

        jsonObj.put("sex", "男");
        jsonObj.put("name","张三");
        jsonObj.put("kcode","K1234");
        jsonObj.put("create_Time",1599554195000L);
        System.out.println(JSONObject.toJSON(jsonObj));
        System.out.println(JSONObject.toJSONString(jsonObj));
        Student stu = JSONObject.parseObject(jsonObj.toJSONString(), Student.class);
//        String date = DateFormatUtils.format(stu.getCreateTime(),"yyyy-MM-dd HH:mm:ss");
//        System.out.println(stu);
    }

    private static void test2() {
        Student stu = new Student();
        stu.setName("zhangsan");
        stu.setCreateTime(new Date());
        log.info(JSONObject.toJSONString(stu));
    }

    private static void test3() {
        String request = "{\"kcodeName\":\"贵州五鸣电子商务有限公司\",\"totalAmount\":50000,\"rechargeThermalPaperInfo\":{\"amount\":2200,\"unitPrice\":0.11,\"rechargeNum\":20000,\"thermalPaperName\":\"一联面单纸\",\"thermalPaperCode\":\"10020051\"},\"rechargeShopInfoList\":[{\"amount\":47800,\"platformName\":\"圆通电子面单\",\"platformCode\":\"YTO\",\"rechargeNum\":20000,\"unitPrice\":2.3900000000000001,\"shopName\":\"K85424323-贵州五鸣电子商务有限公司\"}],\"mdmOrgCustomerInfoId\":\"3e23c1eb8cc84ab89d758d02026d7021\",\"kcode\":\"K85424323\",\"totalNum\":20000}";
        AutoRechargeAModeRequest obj = JSON.parseObject(request,AutoRechargeAModeRequest.class);
        System.out.println(JSONObject.toJSON(obj));
        System.out.println(JSONObject.toJSONString(obj));
    }
}
