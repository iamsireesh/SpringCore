package com.iamsireesh.autowiring.autodetect;

public class ExampleBean implements ExampleInterface {
	private TestBean tb;
	
	//Constructor
	public ExampleBean(){
		
	}
	
	//Parameterized Constructor
	public ExampleBean(TestBean tb) {
		this.tb = tb;
	}
	
	public String show() {
		return "Hi " + " " + tb.getMessage();
	}
}
