package com.iamsireesh.ap.multiconfigread;

public class FirstBean {
public String name;
public int age;
private SecondBean second;

public void setName(String name) {
	this.name = name;
}
public void setAge(int age) {
	this.age = age;
}
public void setSecond(SecondBean second) {
	this.second = second;
}
@Override
public String toString() {
	return "FirstBean [name=" + name + ", age=" + age + ", second=" + second
			+ "]";
}

}
