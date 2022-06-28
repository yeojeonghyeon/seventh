package com.scci.inheritance;

public class StaticMethod {
	public static void main(String[] args) {
		Person p = new Person();
		Student pp = new Student();
		p.method(); // 혼선을 가지고 오는 코드
		pp.method(); // 
		
		Person.method(); // static way
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
