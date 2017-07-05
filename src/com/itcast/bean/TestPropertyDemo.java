package com.itcast.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPropertyDemo {
	@Test
	public void testPropertyDemo1(){
		//1.���������ļ�
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		//2.�õ������ļ������Ķ���
		PropertyDemo1 propertydemo1 = (PropertyDemo1)context.getBean("propertydemo1");
		System.out.println(propertydemo1);
		propertydemo1.add();
	}
	@Test
	public void testPropertyDemo2(){
		//1.���������ļ�
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		//2.�õ������ļ������Ķ���
		PropertyDemo2 propertydemo2 = (PropertyDemo2)context.getBean("propertydemo2");
		System.out.println(propertydemo2);
		propertydemo2.add();
	}
}
