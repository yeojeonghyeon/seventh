package com.scci.summer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
		System.out.println(helloWorld);
	}
}
