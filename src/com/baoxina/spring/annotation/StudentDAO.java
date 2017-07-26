package com.baoxina.spring.annotation;

import org.springframework.stereotype.Repository;

@Repository("studentDAO")
public class StudentDAO implements BaseDAO{

	@Override
	public void add() {
		System.out.println("studentdao add...");
	}
}
