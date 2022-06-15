package com.scci.operator;

public class ArithOp {
	public static void main(String[] args) {
		ArithOp.testOperator();
	}
	
	// public : 접근지시자
	// static 이 붙으면 객체 단위가 아닌, 클래스 고유영역에 한번만 정의된 함수, 클래스 함수
	// void : 반환값이 없다는 의미, return 문이 없음
	// testOperator : 함수명
	// 클래스 함수는 객체(인스턴흐 함수)함수에서 호출 가능,
	// 클래스 함수 내부에서 클래스 변수 접근 가능, 클래스 함수를 호출 가능
	// 클래스 함수 내에서 객체 함수를 호출 할 수는 없음.
	// 클래스 함수, 클래스 변수를 접근 할 때는 변수나 함수 앞에 클래스명.변수(함수)
	public static void testOperator() {
		int x, y;
		x = 5;
		y = 10;
		// 5
		System.out.println(x++); // x++ => x = x+1; 식에서 x값이 평가된 후 x값 증가
		y++; // y = y+1;
		
		int z = ++x;
		System.out.println(z);
		
		// 7
		System.out.println(++x); // x = x+1; // ++x > x = x+1; x값이 먼저 증가 하고 값이 평가
		++y; // y = y+1;
		// 제어문
		if ( x == y ) {
			System.out.println("equal");
		}else if( x != y ) {
			System.out.println("different");
		}
		
		if ( x > 1 && x > 6 ) {
			System.out.println("true");
		}
		// 조건문에서 실행블럭이 단일 행이면 { } 중괄호가 생략 될 수 있음.
		if ( y > 1 || y > 13 ) System.out.println("true");
		
		while(true) {
			System.out.println(x++);
			if (x>100) {
				break;
			}
		}
		
		x = x+1;
		x += 1; // 자주 나오는 표현
	}
}
