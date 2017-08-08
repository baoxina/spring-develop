package com.baoxina.spring.aop_level_two;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("aopanno.xml");
		Book book = (Book)context.getBean("book");
		book.add();
	}
}
