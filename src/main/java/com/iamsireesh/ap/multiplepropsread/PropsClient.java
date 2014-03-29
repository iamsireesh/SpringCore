package com.iamsireesh.ap.multiplepropsread;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropsClient {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		PropsInterface bean=(PropsImpl)context.getBean("multiprops");
		System.out.println(bean.show());
	}

}
