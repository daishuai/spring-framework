package com.daishuai.demo;

import com.daishuai.demo.config.DemoConfig;
import com.daishuai.demo.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		UserService userService = context.getBean(UserService.class);
		System.out.println("UserService 实例: " + userService);
	}
}
