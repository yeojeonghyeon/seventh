package com.scci.exception;

public class ExceptionDemo {
	public static void main(String[] args) {
		methodA(); // 
		System.out.println("after calling methodA");
	}
	static void methodA() {
		try {
			methodB(); // <- 예외 전파, 예외처리가 있음 
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	static void methodB() {
		methodC(); // <- 예외 전파
	}
	static void methodC() {
		int i = 5;
		int j = i / 0; // 예외가 발생, 예외가 발생된 코드가 예외처리기에 감싸져 있지 않음, 예외를 처리할 예외처리기가 없음.
	}
}
