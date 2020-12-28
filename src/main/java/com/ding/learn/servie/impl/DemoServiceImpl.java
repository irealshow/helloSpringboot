package com.ding.learn.servie.impl;

import com.ding.learn.servie.IDemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DemoServiceImpl implements IDemoService {
    @Override
    @Async
    public String handle01() {
        log.info("[execute01]");
        sleep(10);
        return "1";
    }

    @Override
    @Async
    public String handle02() {
        log.info("[execute02]");
        sleep(5);
        return "2";
    }

    private static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
