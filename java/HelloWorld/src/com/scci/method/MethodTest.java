package com.scci.method;

import java.util.List;
import java.util.ArrayList;

public class MethodTest {
	// entry point 시작점, 진입점
	public static void main(String[] args) {
		Person p = new Person(1999, "smith");
		Person p1 = new Person(2005, "david");
		List<Person> lst = new ArrayList<Person>();
		lst.add(p);
		lst.add(p1);
		
		MethodTest.showInfo(lst);
	}
	// static 클래스 함수
	// void 반환타입이 없음
	// Person을 접근 할수 있는 이유는 같은 package 안에서 선언 되었기 때문.
	public static void showInfo(List<Person> list) {
		for(Person p : list) {
			System.out.println(p.getInfo());
		}
	}
}
