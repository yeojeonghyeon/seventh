package com.scci.inheritance2;

public class A {
	public interface NestedInterface {
		// 추상함수
		public void method();
	}
}

class Derived implements A.NestedInterface{
	@Override
	public void method() {
		
	}
}
