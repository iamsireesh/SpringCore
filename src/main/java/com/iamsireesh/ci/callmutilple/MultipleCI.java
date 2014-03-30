package com.iamsireesh.ci.callmutilple;

public class MultipleCI {
private String name, gender, age;
public MultipleCI(){
	
}
public MultipleCI(String name, String age) {
	super();
	this.name = name;
	this.age = age;
}
public MultipleCI(String name, String gender, String age) {
	super();
	this.name = name;
	this.gender = gender;
	this.age = age;
}
@Override
public String toString() {
	return "MultipleCI [name=" + name + ", gender=" + gender + ", age=" + age
			+ "]";
}
}
