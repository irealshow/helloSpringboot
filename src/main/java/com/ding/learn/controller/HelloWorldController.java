package com.ding.learn.controller;

import com.ding.learn.config.MyLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }


    @RequestMapping("/ResouceA")
    public String ResouceA() {
        return "你正在访问A资源";
    }

    @MyLog
    @RequestMapping("/ResouceB")
    public String ResouceB() {
        System.out.println("323");
        return "你正在访问B资源";
    }

    @MyLog
    @GetMapping("/sourceC/{source_name}")
    public String sourceC(@PathVariable("source_name") String sourceName){
        return "你正在访问sourceC资源";
    }

}
