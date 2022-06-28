package com.scci.inheritance;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Animal> list = new ArrayList<Animal>();
		//상위 클래스 타입의 변수에 하위 클래스 타입의 변수를 할당 할 수 있다.
		//다형성
		Animal a = new Cat("cat kind");
		Animal b = new Dog("dog kind", "poodle", FoodType.BOTH);
		Animal c = new Animal("animal kind");
		// 야래 코드는 is a 관계가 아니기 때문에 불가
		//Cat cat = new Dog("dog kind", "poodle", FoodType.BOTH);
		
		list.add(a); // a변수가 가지고 있는 객체의 레퍼런스를 복사 해 줌.
		list.add(b);
		list.add(c);
		
		// animal 변수는 for 문을 벗어나면 접근 불가, scope가 for block
		for(Animal animal : list) {
			if ( animal.canEatType == FoodType.BOTH ) {
				System.out.println(animal.species);
			}
		}
		
		a.eat();
		b.eat(); // dog 클래스는 eat 함수를 overrding 해 놓았기 때문에, 객체가 가지고 있는 함수 eat이 실행 됨
		c.eat();
	}
}
