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
		//1.加载配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		//2.得到配置文件创建的对象
		ComplexObject complexObject = (ComplexObject)context.getBean("complexObject");
		complexObject.test1();
	}
}
