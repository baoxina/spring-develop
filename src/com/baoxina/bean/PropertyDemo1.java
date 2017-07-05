package com.baoxina.bean;

public class PropertyDemo1 {

	private String username;
	
	public PropertyDemo1(String username) {
		this.username = username;
	}
	
	public void add(){
		System.out.println(username + " add.........");
	}
}
