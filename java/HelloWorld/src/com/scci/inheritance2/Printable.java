package com.scci.inheritance2;

public interface Printable {
	// 인터페이스의 default 함수는 반드시 override 하지 않아도 됨.
	default public void print(String contents) {
		System.out.println("default print " + contents);
	}
}

class Printer implements Printable {
}
class MultiFuncProduct implements Printable {
	@Override
	public void print(String contents) {
		System.out.println("MultiFuncProduct's print : " + contents);
	}
}

class PrintableDemo {
	public static void main(String[] args) {
		Printer p = new Printer();
		p.print("i envy you");
		Printable mul = new MultiFuncProduct();
		mul.print("i like you!");
	}
}
