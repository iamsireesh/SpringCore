package com.iamsireesh.helloworld;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {

	private ApplicationContext context;

	@Before
	public void setUp() throws Exception {
		context=new ClassPathXmlApplicationContext("Spring.xml");
	}

	@Test
	public void test() {
		HelloWorld helloWorld=(HelloWorld) context.getBean("hello");
		assertEquals("Hello World", helloWorld.getMessage());
	}

}
