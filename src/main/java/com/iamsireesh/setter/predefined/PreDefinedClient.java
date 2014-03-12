package com.iamsireesh.setter.predefined;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class PreDefinedClient {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("Spring.xml");
		
		BeanFactory factory=new XmlBeanFactory(res);
		
		DemoInterface inter=(DemoInterImpl) factory.getBean("predefined");
		inter.show();
	}

}
