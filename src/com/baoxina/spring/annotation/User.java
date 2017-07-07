package com.baoxina.spring.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * ����������4��ע��
 * Spring���ṩ@Component��3������ע�⣺��Ŀǰ����������һ���ģ�
 * @Controller  web��
 * @Service     ҵ���
 * @Repository  �־ò�
 */
@Component(value="user") //��ͬ��<bean id="user" class="com.baoxina.spring.annotation.User"/>
@Scope(value="prototype")//��ͬ��<bean id="user" class="com.baoxina.spring.annotation.User" scope="prototype"/>  Ĭ��ֵΪsingleton����
public class User {
	public void add(){
		System.out.println("add....");
	}
}
