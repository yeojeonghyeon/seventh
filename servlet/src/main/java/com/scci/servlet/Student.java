package com.scci.servlet;

public class Student {
	private String name;
	private String addr;
	private int birth;
	public Student() {}
	public Student(String name, String addr, int birth) {
		this.name = name;
		this.addr = addr;
		this.birth = birth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
}
