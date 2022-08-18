package com.scci.vo;

public class Member {
	private String name;
	private String addr;
	private String cellNo;
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
	public String getCellNo() {
		return cellNo;
	}
	public void setCellNo(String cellNo) {
		this.cellNo = cellNo;
	}
	public Member(String name, String addr, String cellNo) {
		super();
		this.name = name;
		this.addr = addr;
		this.cellNo = cellNo;
	}
}
