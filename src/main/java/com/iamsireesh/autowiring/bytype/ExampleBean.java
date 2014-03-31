package com.iamsireesh.autowiring.bytype;

public class ExampleBean implements ExampleInterface {
	
	//Bean Id of test bean is tbxyz and the bean property is tb
	//ByType:: Here data type TestBean is same
	private TestBean tb;
	private String name;
	
	
	//Constructor
	public ExampleBean(){
		
	}
	
	//Parameterized Constructor
	public ExampleBean(TestBean tb, String name) {
		this.tb = tb;
		this.name = name;
	}

	public void setTb(TestBean tb) {
		this.tb = tb;
	}

	

	public void setName(String name) {
		this.name = name;
	}

	public String show() {
		return "Hi " + name + " " + tb.getMessage();
	}
}
