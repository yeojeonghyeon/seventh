package com.scci.swag.bean;

public class Proto {
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Proto(String message) {
		System.out.println("Proto's constructor");
		this.message = message;
	}
}
