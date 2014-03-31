package com.iamsireesh.autowiring.byname;

public class ExampleBean implements ExampleInterface {
	
	//Bean Id of test bean and the property name should be same.
	//If it doesn't matches then it will raise NullpointerException
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
