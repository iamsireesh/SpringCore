package com.iamsireesh.helloworld;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class HelloWorldClient {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	//Bean Factory Container
	Resource res=new ClassPathResource("Spring.xml");
	
	BeanFactory factory=new XmlBeanFactory(res);
	HelloWorld obj=(HelloWorld) factory.getBean("hello");
	System.out.println(obj.getMessage()+" This is my First Spring App");
	System.out.println(obj.wish("Sireesh"));
	System.out.println("*****************************************");
	
	
	//Application Context Container
	ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
	HelloWorld obj1=(HelloWorld) context.getBean("hello");
	System.out.println(obj1.getMessage()+" This is my First Spring App");
	System.out.println(obj.wish("Sireesh"));
}
}
