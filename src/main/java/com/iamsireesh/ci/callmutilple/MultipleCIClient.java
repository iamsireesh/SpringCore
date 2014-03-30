package com.iamsireesh.ci.callmutilple;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MultipleCIClient {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("Spring.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		//Calls two parameterized constructor
		MultipleCI ci=(MultipleCI)factory.getBean("first");
		System.out.println(ci);
		//Calls three parameterized constructor
		MultipleCI ci1=(MultipleCI)factory.getBean("second");
		System.out.println(ci1);
		

	}

}
