package com.scci.aop;

public class Fruit {
	public Fruit() {
	}

	public void exception() {
		System.out.println("Exception raised");
		throw new IllegalArgumentException();
	}
	
	public void method() {
		System.out.println("Exception raised");
		throw new RuntimeException();
	}
}
