package com.baoxina.spring.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 创建对象有4个注解
 * Spring中提供@Component的3个衍生注解：（目前来看功能是一样的）
 * @Controller  web层
 * @Service     业务层
 * @Repository  持久层
 */
@Component(value="user") //等同于<bean id="user" class="com.baoxina.spring.annotation.User"/>
@Scope(value="prototype")//等同于<bean id="user" class="com.baoxina.spring.annotation.User" scope="prototype"/>  默认值为singleton单例
public class User {
	public void add(){
		System.out.println("add....");
	}
}
