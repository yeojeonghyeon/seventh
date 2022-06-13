package com.scci.variable;

public class Variable {
	//생성자 함수
	// name: String
	// this는 인스턴스 자신(자체)을 의미함.
	public Variable(String name) {
		this.name = name;
	}
	// 인스턴스(객체)변수
	public String name;
	// 클래스 변수
	public static String className = "Variable";
	
	// 인스턴스(객체) 함수
	// 객체(인스턴스)가 붙은 변수, 함수 접근 가능
	// 클래스가 붙은 변수, 함수도 접근 가능
	public void showName() {
		int i = 0;
		// 초기화블럭1, 조건2, 증감문3
		// 초기화블럭 실행 -> 조건 판단 -> 실행(블럭) -> 증감문 -> 조건판단 -> 실행(블록)
		for(i=0; i<3; i++) {
			System.out.println(i + " " + Variable.className + name);
		}
		
	}
}
