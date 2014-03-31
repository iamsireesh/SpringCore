package com.iamsireesh.autowiring.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByNameClient {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("BeanWiring.xml");
		Object object=context.getBean("byname");
		ExampleInterface result=(ExampleBean)object;
		System.out.println(result.show());
		
		
		//Setter Injection Always dominate Constructor Injection
		System.out.println("*************************");
		Object object1=context.getBean("sidominateci");
		ExampleInterface result1=(ExampleBean)object1;
		System.out.println(result1.show());
		
		//Explicit Wiring dominates autowiring when either both are using setter or constructor injection
		System.out.println("*************************");
		Object object2=context.getBean("exdominateaw");
		ExampleInterface result2=(ExampleBean)object2;
		System.out.println(result2.show());
		
		//Output of All 3
		//Hi Sireesh Have a nice day
		//*************************
		//Hi CI::Sireesh Have a nice day
		//*************************
		//Hi Sireesh Have a nice day DUDE

	}

}
