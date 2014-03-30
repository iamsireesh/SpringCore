package com.iamsireesh.ap.declarative.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeclarativeClient {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//Init Method Demo
		 Object object=context.getBean("declarativeinitbean");
		 Initialization in=(Initialization)object;
		 System.out.println(in);
		
		//Destroy method Demo
		DestroyBean destroy=(DestroyBean)context.getBean("declarativedestroybean");
		System.out.println(destroy);
	}

}
