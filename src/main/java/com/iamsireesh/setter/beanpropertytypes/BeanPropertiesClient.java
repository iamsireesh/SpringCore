package com.iamsireesh.setter.beanpropertytypes;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanPropertiesClient {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("Spring.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		BeanPropInterface beanprop=(BeanPropImpl)factory.getBean("beanprops");
		System.out.println(beanprop.showProperties());
	}
}
