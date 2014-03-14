package com.iamsireesh.factorymethod;

public class FactoryBean {
private String message;

private FactoryBean(){
	
}

private FactoryBean(String message){
	this.message=message;
}

public static FactoryBean getFactoryBeanObject(String message){
	return new FactoryBean(message);
}

@Override
public String toString() {
	return "FactoryBean [message=" + message + "]";
}

}
