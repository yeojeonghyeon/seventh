package com.scci.swag.noxml;
public class MyFileSystemBean {

	@Override
	public String toString() {
		return "MyFileSystemBean"+this.hashCode();
	}
	
	public void init() {
		System.out.println("init method called");
	}
	
	public void destroy() {
		System.out.println("destroy method called");
	}
}