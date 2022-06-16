package com.scci.operator;

public class IfElseDemo {
	// 클래스 함수
	public static void main(String[] args) {
		int testScore = 80;
		char grade;
		if ( testScore >= 90 ) {
			grade = 'A';
		}else if( testScore >= 80 ) {
			grade = 'B';
		}else if( testScore >= 70 ) {
			grade = 'C';
		}else if( testScore >= 60 ) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println(grade);
		
		IfElseDemo.switchTest();
		IfElseDemo.testLoop();
		IfElseDemo.testWhile();
	}
	
	public static void switchTest() {
		char grade = 'A';
		switch(grade) {
		// case 블럭 내부에 break 문이 없으면 다음 case 블럭을 실행
		case 'A':
			System.out.println("A");
//			break;
		case 'B':
			System.out.println("B");
			break;
		case 'C':
			System.out.println("A");
			break;
		default:
			System.out.println("Default");
		}
		
		int birthYear = 2005;
		// 1999, 2000, 2001, 2002인 경우 case 2002의 코드가 실행 됨.
		switch(birthYear) {
		case 1999:
		case 2000:
		case 2001:
		case 2002:
			System.out.println("Accepted");
			break;
		default:
			System.out.println("Rejected");
		}
	}
	
	public static void testLoop() {
		int[] scoreArr = new int[] {65, 75, 88, 100};
		char grade;
		for(int i=0; i<scoreArr.length; i++) {
			if ( scoreArr[i] >= 90 ) {
				grade = 'A';
			}else if ( scoreArr[i] >= 80 ) {
				grade = 'B';
			}else if ( scoreArr[i] >= 70 ) {
				grade = 'C';
			}else if ( scoreArr[i] >= 60 ) {
				grade = 'D';
			}else {
				grade = 'F';
			}// if 문의 끝
			System.out.println(grade);
		}
	}
	
	public static void testWhile() {
		int[] scoreArr = new int[] {65, 75, 88, 100};
		char grade;
		int index = 0;
		while(index<scoreArr.length) {
			if ( scoreArr[index] >= 90 ) {
				grade = 'A';
			}else if ( scoreArr[index] >= 80 ) {
				grade = 'B';
			}else if ( scoreArr[index] >= 70 ) {
				grade = 'C';
			}else if ( scoreArr[index] >= 60 ) {
				grade = 'D';
			}else {
				grade = 'F';
			}// if 문의 끝
			index++;
			System.out.println(grade);
		}
		
		do {
			System.out.println(index);
			index++;
			if ( index > 50 ) break;
		}while(true);
	}
}
