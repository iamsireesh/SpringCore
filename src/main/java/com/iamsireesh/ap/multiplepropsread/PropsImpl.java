package com.iamsireesh.ap.multiplepropsread;

public class PropsImpl implements PropsInterface {

	private String name, gender, profession;
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
	
	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String show() {
		return "PropsImpl [name=" + name + ", gender=" + gender + ", age="
				+ age + ",profession="+profession+"]";
	}

	

}
