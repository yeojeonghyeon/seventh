package com.scci.variable;

public class Vehicle {
	private int speed;
	private String ownerName;
	private boolean isVeteran;
	public Vehicle(int speed, String ownerName, boolean isVeteran) {
		this.speed = speed;
		this.ownerName = ownerName;
		this.isVeteran = isVeteran;
	}
	public boolean speedUp(int speed) {
		this.speed = this.speed + speed;
		return true;
	}
	public boolean speedDown(int speed) {
		this.speed = this.speed - speed;
		return true;
	}
	// 인스턴스(객체) 함수 : 인스턴스 변수, 인스턴스 함수, 클래스 변수, 클래스 함수 접근 가능
	public void showInfo() {
		System.out.println("============================");
		System.out.println("owerName " + ownerName);
		System.out.println("speed " + speed);
		System.out.println("isVeteran " + isVeteran);
		System.out.println("============================");
	}
}
