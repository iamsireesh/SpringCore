package com.iamsireesh.setter.predefined;

import java.util.Date;

public class DemoInterImpl implements DemoInterface {
	
	private String message;
	private Date date;
	
	public DemoInterImpl(){
		System.out.println("Constructor is executed");
	}
	
	//Setters for the properties
	public void setMessage(String message) {
		this.message = message;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	public void show() {
		System.out.println("Message is::"+message);
		System.out.println("Date is::"+date);

	}

}
