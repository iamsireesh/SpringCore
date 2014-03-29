package com.iamsireesh.ap.multiconfigread;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		String cfg[]={"AC1.xml","AC2.xml"};
		ApplicationContext context=new ClassPathXmlApplicationContext(cfg);
		FirstBean bean=(FirstBean)context.getBean("first");
		System.out.println(bean.toString());

	}

}
