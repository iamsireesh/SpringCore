package com.iamsireesh.ap.propsfileread;

public class PropsImpl implements PropsInterface {

	private String name, gender;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String show() {
		return "PropsImpl [name=" + name + ", gender=" + gender + ", age="
				+ age + "]";
	}

	

}
