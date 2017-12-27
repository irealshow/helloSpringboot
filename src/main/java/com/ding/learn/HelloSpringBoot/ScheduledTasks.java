package com.ding.learn.HelloSpringBoot;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
	@Scheduled(fixedRate = 5000)
	public void dataInit() {
		System.out.println("dingxuan");
	}
}
