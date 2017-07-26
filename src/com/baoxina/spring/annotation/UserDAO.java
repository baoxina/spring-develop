package com.baoxina.spring.annotation;

import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAO implements BaseDAO{
	@Override
	public void add(){
		System.out.println("userDAO add....");
	}
}
