package com.baoxina.spring.xmlanno;

import javax.annotation.Resource;

public class BookService {

	@Resource(name="bookDAO")
	private BookDAO bookDao;
	@Resource(name="orderDAO")
	private OrderDAO orderDao;
	
	public void add(){
		orderDao.buy();
		System.out.println("bookservice...");
		bookDao.book();
	}
}
