package com.baoxina.spring.xmlanno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	@Test
	public void testBookService() {
		ApplicationContext context = new ClassPathXmlApplicationContext("xmlannotation_config.xml");
		BookService bookService = (BookService)context.getBean("bookService");
		bookService.add();
	}
}
