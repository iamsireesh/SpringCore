package com.iamsireesh.ap.declarative.beanlifecycle;


public class DestroyBean{
	
	private String destroyMessage;
	
	public DestroyBean(){
		System.out.println("Constructor is executed:: DestroyBean");
	}
	
	public void setDestroyMessage(String destroyMessage) {
		System.out.println("In setter method");
		this.destroyMessage = destroyMessage;
		System.out.println("The message is::"+destroyMessage);
	}

	public void destroy(){
		System.out.println("In destroy method::"+destroyMessage);
	}
}
