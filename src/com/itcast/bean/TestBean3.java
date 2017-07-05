package com.itcast.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean3 {
	@Test
	public void testUer(){
		//1.加载配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		//2.得到配置文件创建的对象
		Bean3 bean3 = (Bean3)context.getBean("bean3");
		System.out.println(bean3);
		bean3.add();
	}
}
