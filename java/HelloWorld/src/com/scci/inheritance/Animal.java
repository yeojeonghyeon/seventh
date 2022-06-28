package com.scci.inheritance;

public class Animal {
	protected String species;
	protected FoodType canEatType = FoodType.MEAT;
	// 생성자 함수를 생성하게 되면
	// 기본 생성자 함수가 자동으로 만들어 지지지 않음
	public Animal(String species) {
		this.species = species;
	}
	public void eat() {
		System.out.println("Animal's eat called");
	}
}

class Cat extends Animal{
	// 클래스를 상속하게 되면 부모쪽 생성자 함수를 자신의 생성자 함수에서 호출 해 줘야 함
	// 동일 클래스 내부에 이름이 같은 생성자 함수(파라메터의 갯수가 다름)를 복수개 선언 할 수 있는 것 ( 함수 오버로딩(overloading) )
	public Cat(String species) {
		super(species);
	}
	// bad case
	public Cat() {
		super("Cat's constructor");
	}
}

class Dog extends Animal{
	private String kind;
	public Dog(String species, String kind, FoodType canEatType) {
		super(species);
		this.kind = kind;
		this.canEatType = canEatType;
	}
	// 함수 오버라이딩(overriding), 부모 클래스의 함수를 자식 클래스에서 재정의 하는 것
	public void eat() {
		String result = "";
		switch(canEatType) {
			case MEAT:
				result = "Dog's eat : MEAT";
				break;
			case VEGETABLE:
				result = "Dog's eat : Vegetable";
				break;
			case BOTH:
				result = "Dog's eat : Both";
				break;
			default:
		}
		System.out.println(result);
	}
}

class Cow {
	protected String name;
	public Cow(String name) {
		this.name = name;
	}
}

enum FoodType{
	MEAT,
	VEGETABLE,
	BOTH
}
