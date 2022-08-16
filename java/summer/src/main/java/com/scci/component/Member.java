package com.scci.component;

public class Member {
	private String name;
	private String grade;
	private String registerDt;
	public Member(String name, String grade, String registerDt) {
		this.name = name;
		this.grade = grade;
		this.registerDt = registerDt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getRegisterDt() {
		return registerDt;
	}
	public void setRegisterDt(String registerDt) {
		this.registerDt = registerDt;
	}
}
