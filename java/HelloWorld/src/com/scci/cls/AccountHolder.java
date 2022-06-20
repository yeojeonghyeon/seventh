package com.scci.cls;

public class AccountHolder {
	private String addr;
	private String name;
	private String celPhone;
	public AccountHolder(String name, String addr, String celPhone) {
		this.name = name;
		this.addr = addr;
		this.celPhone = celPhone;
	}
	// getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
