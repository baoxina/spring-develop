package com.itcast.bean;

public class UserService {
	//1.定义dao类型属性
	private UserDao userDao;
	public UserDao getUserDao() {
		return userDao;
	}
	//生成set方法
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void add(){
		System.out.println("service.........");
		getUserDao().add();
	}	
}
