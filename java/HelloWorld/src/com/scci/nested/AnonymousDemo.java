package com.scci.nested;

public class AnonymousDemo {
	// 사용자 정의 생성자를 정의하지 않았음
	// 기본 생성자가 자동으로 생성 된다
	public String contents;
	public void print(Printable p) {
		p.print(contents);
	}
}
// SAM, FunctionalInterface 형태
interface Printable {
	// consumer 형태
	void print(String contents);
}

class Demo {
	public static void main(String[] args) {
		AnonymousDemo a = new AnonymousDemo();
		a.contents = "it is good day to die";
		Printable p = new Printable() {
			@Override
			public void print(String contents) {
				System.out.print("Anonymouse's " + contents);
			}
			
		};
		a.print(p);
		a.print(new Printable() {
			@Override
			public void print(String contents) {
				System.out.print("Anonymouse's without identifier" + contents);
			}
			
		});
		// SAM single abstract method, 인터페이스가 추상함수 하나를 가지고 있으면
		// 해당 함수는 lambda 타입으로 정의가 가능 ( 객체 생성 )
		a.print(contents->System.out.println(contents));
		// 
		a.print(System.out::println);
	}
}