package com.baoxina.spring.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class TestSpringAnnotation {

	@Test
	public void testUser() {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation_config.xml");
		User user = (User)context.getBean("user");
		Component annotation = user.getClass().getAnnotation(Component.class);
		System.out.println(annotation.value());
		System.out.println(user);
		user.add();
	}
	@Test
	public void testUserService(){
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation_config.xml");
		UserService userService = (UserService)context.getBean("userService");
		System.out.println(userService);
		userService.add();
	}
}
