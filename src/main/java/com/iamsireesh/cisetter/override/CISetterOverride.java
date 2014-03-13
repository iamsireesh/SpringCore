package com.iamsireesh.cisetter.override;

public class CISetterOverride {
	private String name;
	private String age;
	private String salery;
	
	

	public CISetterOverride() {
	}

	// Constructor
	public CISetterOverride(String name, String age, String salery) {
		super();
		this.name = name;
		this.age = age;
		this.salery = salery;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setSalery(String salery) {
		this.salery = salery;
	}

	public String toString() {
		return "CISetterOverride [name=" + name + ", age=" + age + ", salery="
				+ salery + "]";
	}

}
