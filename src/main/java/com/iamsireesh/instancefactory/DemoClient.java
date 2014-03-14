package com.iamsireesh.instancefactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class DemoClient {
	public static void main(String[] args) {
		ClassPathResource res = new ClassPathResource("Spring.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		DemoBean d1 = (DemoBean) factory.getBean("db");
		System.out.print(d1.sayHello());
	}

}
