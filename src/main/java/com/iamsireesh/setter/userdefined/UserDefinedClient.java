package com.iamsireesh.setter.userdefined;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class UserDefinedClient {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("Spring.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		UserDefinedImpl user = (UserDefinedImpl) factory.getBean("userdefined");
		user.show();

	}

}
