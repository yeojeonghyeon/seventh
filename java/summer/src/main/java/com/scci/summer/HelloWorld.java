package com.scci.summer;

public class HelloWorld {
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HelloWorld() {}
	
	@Override
	public String toString() {
		return "HelloWorld message : " + message;
	}
}
