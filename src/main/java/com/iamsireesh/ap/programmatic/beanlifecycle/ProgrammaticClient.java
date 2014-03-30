package com.iamsireesh.ap.programmatic.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProgrammaticClient {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//Init Method Demo
		 Object object=context.getBean("initbean");
		 Initialization in=(Initialization)object;
		 System.out.println(in);
		
		//Destroy method Demo
		DestroyBean destroy=(DestroyBean)context.getBean("destroybean");
		System.out.println(destroy);

	}

}
