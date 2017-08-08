package com.baoxina.spring.aop_level_one;

import org.aspectj.lang.ProceedingJoinPoint;

public class BookProxy {

	public void beforeAdd(){
		System.out.println("before Book.add()....");
	}
	public void afterAdd(){
		System.out.println("after Book.add()....");
	}
	public void aroundAdd(ProceedingJoinPoint joinPoint){
		System.out.println("aroundBefore Book.add()....");
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}finally{
			System.out.println("aroundAfter Book.add()....");
		}
	}
}
