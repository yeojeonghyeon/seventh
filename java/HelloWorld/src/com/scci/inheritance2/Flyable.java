package com.scci.inheritance2;

public interface Flyable {
	public void fly();
}

interface Movable {
	public void move();
}

interface Vehicle extends Flyable, Movable {
	public void startEngine();
}

class Plane implements Flyable {
	public void fly() {
		System.out.println("Plane's fly");
	}
}
class Car implements Movable {
	public void move() {
		System.out.println("Car's move");
	}
}
class Helicopter implements Vehicle {
	@Override
	public void fly() {
		System.out.println("Helicopter's fly");	
	}
	@Override
	public void move() {
		System.out.println("Helicopter's fly");	
	}
	@Override
	public void startEngine() {
		System.out.println("Helicopter's startEngine");	
	}
}

class InterfaceDemo{
	public static void main(String[] args) {
		Car car = new Car();
		Plane plane = new Plane();
		Helicopter copter = new Helicopter();
		car.move();
		plane.fly();
		copter.startEngine();
		copter.move();
		copter.fly();
		
		Flyable f = plane;
		Movable m = car;
		Vehicle v = copter;
		f.fly();
		m.move();
		v.fly();
		v.move();
		v.startEngine();
	}
}