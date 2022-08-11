package com.scci.summer;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scci.beans.Books;
import com.scci.beans.Computer;
import com.scci.beans.Person;
import com.scci.beans.TextEditor;

// ctrl + d : 선택 영역 지우기; 라인 단위
// ctrl + shift + f : 정렬
// ctrl + shift + o : 자동 import
// alt + 위, 아래 방향키 : 코드 이동
// ctrl + m : 화면 최대화, 원래대로
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		System.out.println(helloWorld);
		Computer computer = (Computer) context.getBean("computer");
		System.out.println(computer.getManufacture());
		System.out.println(computer.getSerialNo());

		TextEditor editor = (TextEditor)context.getBean("textEditor");
		System.out.println(editor.getSpellChecker().getLanguage());
		Person person = (Person)context.getBean("person");
		System.out.println(person.getAge());
		
		Books books = (Books)context.getBean("books");
		for(String book : books.getMyList()) {
			System.out.println(book);
		}
		// Consumer<? extends String>
		// Consumer<String>
		books.getMyList().stream().forEach(System.out::println);
		Map<String, String> myMap = books.getMyMap();
		myMap.forEach((k, v)->{
			System.out.println(k+" "+v);
		});
		
		myMap.forEach(App::print);
	}
	public static void print(String k, String v) {
		System.out.println(k+" "+v);
	}
}
