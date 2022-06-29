package com.scci.inheritance2;

public class Animal {
	public void move() {
		System.out.println("Animal move");
	}
}
class Dog extends Animal {
	@Override
	public void move() {
		System.out.println("Dog's move");
	}
	public void bark() {
		System.out.println("bark bark");
	}
}
class Cat extends Animal {
	@Override
	public void move() {
		System.out.println("Cat's move");
	}
}

class Demo{
	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		animal.move();
		// dog변수의 타입은 Animal이지만 실제 담고 있는 객체 타입은 Dog이고, 
		// move 함수는 오버라이딩 되어 있기 때문에, 오버라이딩 되어 있는 함수 Dog 객체의 move 함수가 실행 된다
		dog.move();
		// Animal 클래스 타입에 bark라는 함수가 없기 때문에 호출 불가능
//		dog.bark();
		// cat변수의 타입은 Animal이지만 실제 담고 있는 객체 타입은 Cat이고, 
		// move 함수는 오버라이딩 되어 있기 때문에, 오버라이딩 되어 있는 함수 Cat 객체의 move 함수가 실행 된다
		cat.move();
	}
}

