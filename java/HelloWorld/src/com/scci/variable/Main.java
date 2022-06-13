package com.scci.variable;

public class Main {
	// entry point, 실행 시작점
	public static void main(String[] args) {
		// 객체를 생성 할 때는 new 생성자();
		Variable v1 = new Variable("v1");
		Variable v2 = new Variable("v2");
		v1.showName();
		v2.showName();
		
		Vehicle vc1 = new Vehicle(0, "hong", true);
		Vehicle vc2 = new Vehicle(0, "lim", false);
	}
	
	public static void reference(Vehicle refType, int speed) {
		refType.speedUp(speed);
	}
}