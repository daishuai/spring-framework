package com.daishuai.demo;

import com.daishuai.demo.config.DemoConfig;
import com.daishuai.demo.service.RoleService;
import com.daishuai.demo.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Daishuai
 */
public class Application {

	public static void main(String[] args) {
		// 配置类
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		UserService userService = context.getBean(UserService.class);
		System.out.println("UserService 实例: " + userService);

		// xml配置文件
		ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		RoleService roleService = xmlContext.getBean(RoleService.class);
		System.out.println(roleService);
	}
}
