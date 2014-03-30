package com.iamsireesh.ap.programmatic.beanlifecycle;

import org.springframework.beans.factory.InitializingBean;

public class Initialization implements InitializingBean {
	private String message;
	
	public Initialization(){
		System.out.println("Constructor is executed");
	}
	
	public void setMessage(String message) {
		System.out.println("In setter method");
		this.message = message;
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("In after properties set::"+message);

	}

}
