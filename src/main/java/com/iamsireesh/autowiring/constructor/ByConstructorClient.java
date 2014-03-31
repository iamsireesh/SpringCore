package com.iamsireesh.autowiring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByConstructorClient {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("BeanWiring.xml");
		Object object=context.getBean("byconstructor");
		ExampleInterface result=(ExampleBean)object;
		System.out.println(result.show());
		

	}

}
