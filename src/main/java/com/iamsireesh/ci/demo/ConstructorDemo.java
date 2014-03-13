package com.iamsireesh.ci.demo;

public class ConstructorDemo {
	private String message;

	public ConstructorDemo() {
		System.out.println("Default Constructor");
	}

	public ConstructorDemo(String message) {
		this.message = message;
	}

	public String wish() {
		return message;
	}
}
