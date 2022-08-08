package com.scci.servlet;

public class Department {
	private String deptNo;
	private String deptNm;
	public Department(String deptNo, String deptNm) {
		super();
		this.deptNo = deptNo;
		this.deptNm = deptNm;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptNm() {
		return deptNm;
	}
	public void setDeptNm(String deptNm) {
		this.deptNm = deptNm;
	}
	
}
