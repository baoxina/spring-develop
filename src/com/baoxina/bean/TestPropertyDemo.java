package com.itcast.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPropertyDemo {
	@Test
	public void testPropertyDemo1(){
		//1.加载配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		//2.得到配置文件创建的对象
		PropertyDemo1 propertydemo1 = (PropertyDemo1)context.getBean("propertydemo1");
		System.out.println(propertydemo1);
		propertydemo1.add();
	}
	@Test
	public void testPropertyDemo2(){
		//1.加载配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		//2.得到配置文件创建的对象
		PropertyDemo2 propertydemo2 = (PropertyDemo2)context.getBean("propertydemo2");
		System.out.println(propertydemo2);
		propertydemo2.add();
	}
}
