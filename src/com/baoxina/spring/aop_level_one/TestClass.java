package com.baoxina.spring.aop_level_one;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	@Test
	public void testBook(){
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		Book book = (Book)context.getBean("book");
		book.add();
	}
}
