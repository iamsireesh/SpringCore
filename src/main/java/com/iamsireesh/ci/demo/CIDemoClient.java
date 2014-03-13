package com.iamsireesh.ci.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CIDemoClient {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("Spring.xml");
		
		BeanFactory factory=new XmlBeanFactory(resource);
		ConstructorDemo cdemo=(ConstructorDemo)factory.getBean("cidemo");
		System.out.println(cdemo.wish());
	}

}
