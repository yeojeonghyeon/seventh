package com.scci.bean;

public class HelloBean {
	private String name;
	private String birth;
	public HelloBean() {}
	public HelloBean(String name, String birth) {
		this.name = name;
		this.birth = birth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
}
