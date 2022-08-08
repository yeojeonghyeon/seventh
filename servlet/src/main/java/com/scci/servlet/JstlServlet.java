package com.scci.servlet;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JstlServlet")
public class JstlServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		doPost(request, response);
	}
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		String searchType = request.getParameter("searchType");
		List<Employee> empList = null;
		List<Department> deptList = null;
		switch(searchType) {
		case "employees":
			empList = JstlServlet.getEmployees();
			break;
		case "departments":
			deptList = JstlServlet.getDepartments();
			break;
		}
		request.setAttribute("employees", empList);
		request.setAttribute("departments", deptList);
	}
	
	private static List<Employee> getEmployees(){
		List<Employee> list = new ArrayList<Employee>();
		return list;
	}
	private static List<Department> getDepartments(){
		List<Department> list = new ArrayList<Department>();
		return list;
	}
}
