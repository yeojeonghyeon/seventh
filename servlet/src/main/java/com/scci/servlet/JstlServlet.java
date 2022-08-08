package com.scci.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JstlServlet")
public class JstlServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		RequestDispatcher rd = request.getRequestDispatcher("views/jstl.jsp");
		rd.forward(request, response);
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
