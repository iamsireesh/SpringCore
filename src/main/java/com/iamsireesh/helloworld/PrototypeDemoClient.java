package com.iamsireesh.helloworld;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class PrototypeDemoClient {

	public static void main(String[] args) {
		        // By Default all objects in spring are singleton and if we set it to prototype any
				//number of objects will be created per container
				// This demo will print the different hash code of each object instance
				Resource res = new ClassPathResource("Spring.xml");

				BeanFactory factory = new XmlBeanFactory(res);
				HelloWorld obj = (HelloWorld) factory.getBean("hello1");
				System.out.println(obj.getMessage() + " This is my First Spring App");
				System.out.println(obj.hashCode());
				System.out.println("**********************");

				HelloWorld obj1 = (HelloWorld) factory.getBean("hello1");
				System.out.println(obj1.getMessage() + " This is my First Spring App");
				System.out.println(obj1.hashCode());
				System.out.println("**********************");

				HelloWorld obj2 = (HelloWorld) factory.getBean("hello1");
				System.out.println(obj2.getMessage() + " This is my First Spring App");
				System.out.println(obj2.hashCode());

	}

}
