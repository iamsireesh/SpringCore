package com.iamsireesh.ap.programmatic.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;

public class DestroyBean implements DisposableBean {
	
	private String destroyMessage;
	
	public DestroyBean(){
		System.out.println("Constructor is executed:: DestroyBean");
	}
	
	public void setDestroyMessage(String destroyMessage) {
		System.out.println("In setter method");
		this.destroyMessage = destroyMessage;
		System.out.println("The message is::"+destroyMessage);
	}

	public void destroy() throws Exception {
		System.out.println("In destroy method");
	}
}
