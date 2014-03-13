package com.iamsireesh.ci.multipleparametrized;

public class ConstructorMultiple {
	private String name;
	private int age;
	private double salary;

	public ConstructorMultiple() {
	}

	public ConstructorMultiple(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String toString() {
		return "ConstructorMultiple [name=" + name + ", age=" + age
				+ ", salary=" + salary + "]";
	}

}
