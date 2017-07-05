package com.itcast;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itcast.bean.ComplexObject;
import com.itcast.bean.Person;
import com.itcast.bean.UserService;

public class TestIOC {

	@Test
	public void testUer(){
		//1.���������ļ�
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		//2.�õ������ļ������Ķ���
		ComplexObject complexObject = (ComplexObject)context.getBean("complexObject");
		complexObject.test1();
	}
}
