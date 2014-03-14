package com.iamsireesh.factorymethod;

import java.util.Calendar;

class FactoryDemoImpl implements FactoryDemoIntr{
	
	private Calendar cl=null;
	private FactoryBean fl=null;
	
	public void setCl(Calendar cl) {
		this.cl = cl;
	}
	public void setFl(FactoryBean fl) {
		this.fl = fl;
	}
	
	
	public String sayHello() {
		return cl.toString() +",\n"+ fl.toString();
	}

}
