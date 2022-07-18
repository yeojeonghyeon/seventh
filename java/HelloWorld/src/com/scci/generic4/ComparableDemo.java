package com.scci.generic4;

public class ComparableDemo {
	public static void main(String[] args) {
		Integer[] numArr = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Integer basis = 5;
		
		int result = ComparableDemo.countGreaterThan(numArr, basis);
		System.out.println(result);
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
