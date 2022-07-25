package com.scci.servlet;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		String clsType = request.getParameter("clsType");
		
		switch(clsType) {
		case "kor" :
		case "eng" :
			default:
		}
	}
	
	protected List<Student> getStudents(String clsType){
		
	}
}
