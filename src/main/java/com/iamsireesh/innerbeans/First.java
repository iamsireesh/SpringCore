package com.iamsireesh.innerbeans;

public class First {
private String name, age;

public void setName(String name) {
	this.name = name;
}

public void setAge(String age) {
	this.age = age;
}

@Override
public String toString() {
	return "First [name=" + name + ", age=" + age + "]";
}

}
