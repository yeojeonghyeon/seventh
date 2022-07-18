package com.scci.generic4;

public class WildCardDemo {
	public static void main(String[] args) {
		GBox<A> ggBoxA;
		GBox<B> ggBoxB;
		GBox<C> ggBoxC;
		// 공변성, covariant
		GBox<?> gBoxW = null;
		GBox<? extends A> gBoxA = null;
		GBox<? extends B> gBoxB = null;
		GBox<? extends C> gBoxC = null;
		
		gBoxA = gBoxB;
		gBoxB = gBoxC;
		gBoxA = gBoxC;
		
		gBoxW = gBoxA;
		
		// 반공변성, contravariant
		GBox<? super C> gLowerC = null;
		GBox<? super B> gLowerB = null;
		GBox<? super A> gLowerA = null;
		gLowerC = gLowerB;
		gLowerC = gLowerA;
		gLowerB = gLowerA;
		
		gBoxW = gLowerA;
	}
}

class A {
	
}
class B extends A{
	
}
class C extends B{
	
}