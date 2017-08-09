package com.baoxina.spring.aop_level_two;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class BookProxy {
	//在方法上面使用注解完成增强操作
	@Before("execution(* com.baoxina.spring.aop_level_two.Book.add(..))")
	public void beforeAdd(){
		System.out.println("before add......");
	}
	@After("execution(* com.baoxina.spring.aop_level_two.Book.add(..))")
	public void afterAdd(){
		System.out.println("after add......");
	}
	
	@Around(value = "execution(* com.baoxina.spring.aop_level_two.Book.add(..))")
	public void aroundAdd(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("around before add......");
		joinPoint.proceed();
		System.out.println("around after add......");
	}
	
}
