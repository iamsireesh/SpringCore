package com.iamsireesh.innerbeans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class InnerBeanClient {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("Spring.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Object object=factory.getBean("innerbean");
		Second second=(Second)object;
		System.out.println(second);
	}

}
