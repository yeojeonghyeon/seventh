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
		didItWork(1, 1.1, "a");
	}
	@Override
	public int doSomethingElse(String s) {
		// TODO Auto-generated method stub
		return 0;
	}
}
