package com.iamsireesh.autowiring.autodetect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoDetectClient {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("BeanWiring.xml");
		Object object=context.getBean("byautodetect");
		ExampleInterface result=(ExampleBean)object;
		System.out.println(result.show());

	}

}
