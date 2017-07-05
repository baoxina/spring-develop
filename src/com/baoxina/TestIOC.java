package com.baoxina;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baoxina.bean.ComplexObject;
import com.baoxina.bean.Person;
import com.baoxina.bean.UserService;

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
