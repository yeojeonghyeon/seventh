package com.scci.generic4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ComparableDemo {
	public static void main(String[] args) {
		Integer[] numArr = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Integer basis = 5;
		
		int result = ComparableDemo.countGreaterThan(numArr, basis);
		System.out.println(result);
		
		Person[] pArr = new Person[] {
				new Person(1953),
				new Person(1977),
				new Person(1533),
				new Person(1399)
		};
		Person pBasis = new Person(1733);
		
		result = ComparableDemo.countGreaterThan(pArr, pBasis);
		System.out.println(result);
		// 배열의 요소로 Student 객체의 레퍼런스를 담는 배열 선언
		// 클래스 타입 배열 선언
		Student[] sArr = new Student[] {
				new Student('A'),
				new Student('B'),
				new Student('C'),
				new Student('A'),
				new Student('F')
		};
		// 'D'
		Student sBasis = new Student('D');
		result = ComparableDemo.countGreaterThan(sArr, sBasis);
		System.out.println(result);
		
		List<Person> personLst = new ArrayList<Person>(Arrays.asList(
				new Person(1953),
				new Person(1555),
				new Person(1933),
				new Person(1333),
				new Person(2021),
				new Person(2017)
				));
		Predicate<Person> predicate = (p) -> {
			return p.birth > 1500 && p.birth < 2022;
		};
		
		List<Person> resultLst = ComparableDemo.test(personLst, predicate);
		// resultLst, enhanced for를 사용하여 각 요소의 birth를 출력 하라
	}
	
	public static <T extends Comparable<T>> int countGreaterThan(T[] arr, T basis){
		int count = 0;
		for(Comparable<T> ele : arr) {
			if ( ele.compareTo(basis) > 0 ) {
				count++;
			}
		}
		return count;
	}
	
	public static <T> List<T> test(List<T> src, Predicate<T> predicate){
		List<T> result = new ArrayList<T>();
		for(T ele : src) {
			if ( predicate.test(ele) ) {
				result.add(ele);
			}
		}
		return result;
	}
}

class Person implements Comparable<Person> {
	int birth;
	public Person(int birth) {
		this.birth = birth;
	}
	@Override
	public int compareTo(Person o) {
		return this.birth - o.birth;
	}
}

class Student implements Comparable<Student>{
	char grade;
	public Student(char grade) {
		this.grade = grade;
	}
	@Override
	public int compareTo(Student o) {
		return o.grade - this.grade;
	}
}
