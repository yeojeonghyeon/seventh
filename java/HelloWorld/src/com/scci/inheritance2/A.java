package com.scci.inheritance2;

public class A {
	public interface NestedInterface {
		// μΆμν¨μ
		public void method();
	}
}

class Derived implements A.NestedInterface{
	@Override
	public void method() {
		
	}
}
