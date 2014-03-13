package com.iamsireesh.ci.multipleparametrized;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CIMultipleClient {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("Spring.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		ConstructorMultiple obj = (ConstructorMultiple) factory.getBean("cimultiple");
		System.out.println(obj.toString());
	}
}
