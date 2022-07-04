package com.scci.inheritance;

public class StaticMethod {
	public static void main(String[] args) {
		Person p = new Person();
		Student pp = new Student();
		p.method(); // 혼선을 가지고 오는 코드
		pp.method(); // 
		// 클래스 함수는 인스턴스 변수, 인스턴스 함수 접근 불가
		Person.method(); // static way, 가독성이 좋은 코드
		Student.method(); // static way
	}
}

class Person{
	public static void method() {
		System.out.println("Person's method called");
	}
}

class Student extends Person{
	public static void method() {
		System.out.println("Student's method called");
	}
}
