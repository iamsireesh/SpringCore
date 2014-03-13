package com.iamsireesh.cisetter.override;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CISetterClient {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("Spring.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		//Setter method overrides the values injected through the constructor
		//Because Setter will get executed after the constructor 
		//Constructor will get executed at the time of object creation
	    //Setter will get executed after the object creation
		CISetterOverride obj=(CISetterOverride)factory.getBean("cisetteroverride");
		System.out.println(obj.toString());
	}

}
