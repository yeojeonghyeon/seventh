package com.scci.pkg;

// Parent 다른 패키지에서 접근 가능
// public 어디든지 접근 가능한 클래스
public class Parent {
	protected String id;
	protected String name;
	// private same class에서만 접근 가능
	private String uniqueKey;
	public Parent(String id, String name, String uniqueKey) {
		this.id = id;
		this.name = name;
		this.uniqueKey = uniqueKey;
	}
}
// class 명 앞에 접근지정자가 없으면 디폴트 지정자
// package-private
// 다른 패키지에서 접근 불가능
class Child extends Parent {
	private int age;
	public Child(String id, String name, String uniqueKey, int age) {
		// 상속관계에서 자식 생성자에서는 부모 생성자를 먼저 호출
		super(id, name, uniqueKey);
		this.age = age;
	}
	// default access modifier (기본 접근지정자)
	String getInfo() {
		return id + " " + name;
	}
}