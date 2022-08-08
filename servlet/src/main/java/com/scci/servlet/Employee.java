package com.scci.servlet;
public class Employee {
	private String empNm;
	private String empNo;
	private String deptNo;
	private String deptNm;
	private String startDate;
	public Employee(String empNm, String empNo, String deptNo, String deptNm, String startDate) {
		super();
		this.empNm = empNm;
		this.empNo = empNo;
		this.deptNo = deptNo;
		this.deptNm = deptNm;
		this.startDate = startDate;
	}
	public String getEmpNm() {
		return empNm;
	}
	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
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
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
}