package com.itcast.bean;

public class UserService {
	//1.����dao��������
	private UserDao userDao;
	public UserDao getUserDao() {
		return userDao;
	}
	//����set����
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void add(){
		System.out.println("service.........");
		getUserDao().add();
	}	
}
