package com.iamsireesh.ci.beanpropertytypes;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CIBeanPropsClient {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("Spring.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		CIBeanProperties props=(CIBeanProperties)factory.getBean("cibeanprops");
		System.out.println(props.showProperties());
	}

}
