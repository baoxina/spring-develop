package com.baoxina.spring.annotation;

import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAO {
	public void add(){
		System.out.println("userDAO....");
	}
}
