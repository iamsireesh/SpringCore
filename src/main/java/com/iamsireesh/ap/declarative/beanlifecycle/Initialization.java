package com.iamsireesh.ap.declarative.beanlifecycle;


public class Initialization{
	private String message;
	
	public Initialization(){
		System.out.println("Constructor is executed");
	}
	
	public void setMessage(String message) {
		System.out.println("In setter method");
		this.message = message;
	}
	
	public void init(){
		System.out.println("Init method with declarative approach");
	}
}
