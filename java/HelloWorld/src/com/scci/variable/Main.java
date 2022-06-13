package com.scci.variable;

public class Main {
	// entry point, 실행 시작점
	// 클래스 함수
	public static void main(String[] args) {
		// 객체를 생성 할 때는 new 생성자();
		Variable v1 = new Variable("v1");
		Variable v2 = new Variable("v2");
		v1.showName();
		v2.showName();
		
		Vehicle vc1 = new Vehicle(0, "hong", true);
		Vehicle vc2 = new Vehicle(0, "lim", false);
		int speed1 = 50;
		int speed2 = 25;
		Main.reference(vc1, speed1);
		Main.reference(vc2, speed2);
		
		vc1.showInfo();
		vc2.showInfo();
	}
	// 클래스 함수
	public static void reference(Vehicle refType, int speed) {
		refType.speedUp(speed);
		speed = speed + 1;
	}
}