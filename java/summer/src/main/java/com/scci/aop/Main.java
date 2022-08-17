package com.scci.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scci.beans.Computer;
import com.scci.summer.HelloWorld;

public class Main {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Computer computer = (Computer)context.getBean("computer");
		computer.setManufacture("hp");
		computer.getManufacture();
		Fruit fruit = (Fruit)context.getBean("fruit");
		try {
			fruit.exception();
		}catch(Exception e) {
		}
		HelloWorld hw = (HelloWorld)context.getBean("helloWorld");
		hw.setMessage("hello world!");
	}
}
