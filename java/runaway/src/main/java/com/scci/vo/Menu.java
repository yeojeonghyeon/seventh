package com.scci.vo;

public class Menu {
	private String value;
	private String name;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Menu(String value, String name) {
		this.value = value;
		this.name = name;
	}
}
