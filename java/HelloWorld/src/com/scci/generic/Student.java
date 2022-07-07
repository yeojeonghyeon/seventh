package com.scci.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class StudentDemo {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(Arrays.asList(new ClassInfo("math", "david", 5),
										   new ClassInfo("poetry", "smith", 2))));
		list.add(new Student(Arrays.asList(new ClassInfo("math", "david", 5),
										   new ClassInfo("chemical", "holy", 5))));
		list.add(new Student(Arrays.asList(new ClassInfo("english", "sam", 4),
				   						   new ClassInfo("chemical", "holy", 4))));
		// 함수 호출해서 결과를 받음
		List<Student> resultList = StudentDemo.test(list, (student)->{
			return student.getLst().stream().anyMatch((clsInfo)->clsInfo.getClsName().equals("chemical"));
		});
		
		resultList.forEach((student)->{
			student.getLst().forEach((clsInfo)->System.out.println(clsInfo.getInfo()));
		});
	}
	// API
	public static List<Student> test(List<Student> lst, Predicate<Student> p){
		return lst.stream().filter(p).collect(Collectors.toList());
	}
}

public class Student {
	List<ClassInfo> lst;
	public Student(List<ClassInfo> lst) {
		this.lst = lst;
	}
	public List<ClassInfo> getLst(){
		return lst;
	}
}

class ClassInfo {
	private String clsName;
	private String professor;
	private int timesOfWeek;
	public ClassInfo(String clsName, String professor, int timesOfWeek) {
		this.clsName = clsName;
		this.professor = professor;
		this.timesOfWeek = timesOfWeek;
	}
	public String getInfo() {
		return clsName + " " + professor + " " + timesOfWeek;
	}
	public String getClsName() {
		return clsName;
	}
	public void setClsName(String clsName) {
		this.clsName = clsName;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public int getTimesOfWeek() {
		return timesOfWeek;
	}
	public void setTimesOfWeek(int timesOfWeek) {
		this.timesOfWeek = timesOfWeek;
	}
	
}
