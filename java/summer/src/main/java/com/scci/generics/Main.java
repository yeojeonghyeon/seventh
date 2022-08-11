package com.scci.generics;

import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		Main.foo(new Consumer<Child>() {
			public void accept(Child t) {
				
			}
		}, new Child());
		
		Main.foo((t)->{}, new Child());
		
		// 1. anonymouse inner class를 사용,
		// 2. lambda 사용해서 zoo 함수를 호출
		Main.zoo(new Consumer<Parent>() {
			public void accept(Parent t) {
				
			}
		}, new Parent());
		
		Main.zoo((t)->{}, new Parent());
	}
	// void accept(T t)
	// Consumer<? super Child>'s sub types are
	// Consumer<Child>, Consumer<Parent>, Consumer<Object>, Consumer<? super Parent>
	public static void foo(Consumer<? super Child> op, Child child) {
		op.accept(child);
	}
	// Consumer<? extends Parent>'s sub types are
	// Consumer<Parent>, Consumer<Child>, Consumer<? extends Child>
	// 
	public static void zoo(Consumer<? extends Parent> op, Parent parent) {
		//
	}
}
