package com.scci.method;

import java.util.List;
import java.util.ArrayList;

public class MethodTest {
	// entry point 시작점, 진입점
	public static void main(String[] args) {
		Person p = new Person(1999, "smith");
		Person p1 = new Person(2005, "david");
		
		// List가 ArrayList의 상위 타입
		// 상위타입 변수에 하위 타입 변수를 대입(형변환 없이) 할 수 있음.
		// List에 담으려고 하는 데이터 타입이 Person이라고 명시적으로 선언
		List<Person> lst = new ArrayList<Person>();
		lst.add(p);
		lst.add(p1);
		
		MethodTest.showInfo(lst);
	}
	// static 클래스 함수
	// void 반환타입이 없음
	// Person을 접근 할수 있는 이유는 같은 package 안에서 선언 되었기 때문.
	public static void showInfo(List<Person> list) {
		for(int i=0; i<list.size(); i++) {
			Person p = list.get(i);
			System.out.println(p.getInfo());
			p.birthYear = p.birthYear + 1;
		}
		
		{
			// 지역변수의 특징 : 자신이 선언된 블럭을 벗어나면 접근 불가
			int j = 1;
		}
		//j++; 접근 불가
		
		// advanced for 문
		for(Person p : list) {
			System.out.println(p.getInfo());
		}
	}
}
