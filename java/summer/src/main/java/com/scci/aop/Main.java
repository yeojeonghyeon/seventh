package com.scci.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scci.beans.Computer;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Computer computer = (Computer)context.getBean("computer");
		computer.setManufacture("hp");
		computer.getManufacture();
		Fruit fruit = (Fruit)context.getBean("fruit");
		fruit.exception();
	}
}
