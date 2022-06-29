package com.scci.inheritance2;

public interface DoIt {
	void doSomething(int i, double x);
	int doSomethingElse(String s);
	default boolean didItWork(int i, double x, String s) {
		// do something
		System.out.println("DoIt");
		return true;
	}
}

interface DoItPlus extends DoIt {
	default boolean didItWork(int i, double x, String s) {
		DoIt.super.didItWork(i, x, s);
		System.out.println("DoItPlus");
		return true;
	}
}

class DoSomething implements DoItPlus {
	@Override
	public void doSomething(int i, double x) {
		// TODO Auto-generated method stub
		System.out.println("doSomething");
	}
	@Override
	public int doSomethingElse(String s) {
		System.out.println("doSomethingElse");
		return 0;
	}
}

class DoSomethingDemo {
	public static void main(String[] args) {
		DoItPlus doItPlus = new DoSomething();
		DoIt doIt = doItPlus;
		doIt.doSomething(1, 1);
		doIt.doSomethingElse("11");
		doIt.didItWork(1, 1, "DoIt");
	}
}
