package com.scci.nested;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		// Interface Consumer<T>
		// void	accept(T t)
		list.forEach(new Consumer<String>(){
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		// Consumer 인터페이스는 추상함수가 1개, 람바로 표현
		list.forEach(t->System.out.println(t));
		// :: 함수의 레퍼런스
		list.forEach(System.out::println);
		
		list.forEach(MethodReference::method);
	}
	static void method(String t) {
		System.out.println("class's method " + t);
	}
}
