package com.scci.method;
// 접근지시자가 없는 경우 default 접근지시자
public class Person {
	int birthYear;
	String name;
	// 생성자 함수, 객체를 생성시 호출되는 함수
	public Person(int birthYear, String name) {
		this.birthYear = birthYear;
		this.name = name;
	}
	// 인스턴스 함수
	public String getInfo() {
		return birthYear + " " + name;
	}
}
