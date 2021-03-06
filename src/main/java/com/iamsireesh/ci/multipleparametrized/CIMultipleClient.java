package com.iamsireesh.ci.multipleparametrized;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CIMultipleClient {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("Spring.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		//Type 1: Arguments In Sequence
		ConstructorMultiple obj = (ConstructorMultiple) factory.getBean("cimultiple");
		System.out.println(obj.toString());
		
		//Type2: Arguments by using data type
		ConstructorMultiple obj1 = (ConstructorMultiple) factory.getBean("cimultiple1");
		System.out.println(obj1.toString());
		
		//Type3: Arguments by using index
		ConstructorMultiple obj2 = (ConstructorMultiple) factory.getBean("cimultiple2");
		System.out.println(obj2.toString());
		
		//Type4: Using all the above three types
		ConstructorMultiple obj3 = (ConstructorMultiple) factory.getBean("cimultiple3");
		System.out.println(obj3.toString());
	}
}
