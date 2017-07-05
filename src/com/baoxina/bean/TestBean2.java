package com.itcast.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean2 {
	@Test
	public void testUer(){
		//1.加载配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		//2.得到配置文件创建的对象
		Bean2 bean2 = (Bean2)context.getBean("bean2");
		System.out.println(bean2);
		bean2.add();
	}
}
