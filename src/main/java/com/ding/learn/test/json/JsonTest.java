package com.ding.learn.test.json;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ding.learn.test.dto.Student;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
public class JsonTest {
    public static void main(String[] args) {
        JSONObject jsonObj = new JSONObject();

        jsonObj.put("sex", "男");
        jsonObj.put("name","张三");
        jsonObj.put("create_Time",1599554195000L);
        System.out.println(jsonObj);
        Student stu = JSONObject.parseObject(jsonObj.toJSONString(), Student.class);
//        String date = DateFormatUtils.format(stu.getCreateTime(),"yyyy-MM-dd HH:mm:ss");
        System.out.println(stu);
    }

    public static void main1(String[] args) {
        Student stu = new Student();
        stu.setName("zhangsan");
        stu.setCreateTime(new Date());
        log.info(JSONObject.toJSONString(stu));
    }
}
