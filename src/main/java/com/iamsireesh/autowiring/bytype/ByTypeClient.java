package com.iamsireesh.autowiring.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iamsireesh.autowiring.bytype.ExampleBean;
import com.iamsireesh.autowiring.bytype.ExampleInterface;

public class ByTypeClient {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("BeanWiring.xml");
		Object object=context.getBean("bytype");
		ExampleInterface result=(ExampleBean)object;
		System.out.println(result.show());

	}

}
