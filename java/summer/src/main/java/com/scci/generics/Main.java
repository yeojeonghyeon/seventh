package com.scci.generics;

import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		Main.foo(new Consumer<Child>() {
			public void accept(Child t) {
				
			}
		}, new Child());
		
		Main.foo((t)->{}, new Child());
	}
	// void accept(T t)
	// Consumer<? super Child>'s sub types are
	// Consumer<Child>, Consumer<Parent>, Consumer<Object>
	public static void foo(Consumer<? super Child> op, Child child) {
		op.accept(child);
	}
	public static void zoo(Consumer<? extends Parent> op, Parent parent) {
		//
	}
}
