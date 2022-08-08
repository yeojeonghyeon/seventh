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
		// searchType 'all'일 경우 empList, deptList를 모두 채워라
		switch(searchType) {
		case "employees":
			empList = JstlServlet.getEmployees();
			break;
		case "departments":
			deptList = JstlServlet.getDepartments();
			break;
		case "all":
			empList = JstlServlet.getEmployees();
			deptList = JstlServlet.getDepartments();
		}
		request.setAttribute("employees", empList);
		request.setAttribute("departments", deptList);
		RequestDispatcher rd = request.getRequestDispatcher("views/jstl.jsp");
		rd.forward(request, response);
	}
	
	private static List<Employee> getEmployees(){
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("가나다","100","101","총무과","2016"));
		list.add(new Employee("김술집","101","101","총무과","1996"));
		list.add(new Employee("니나노","102","101","총무과","1987"));
		list.add(new Employee("분식집","103","101","총무과","2020"));
		list.add(new Employee("맛있다","104","101","총무과","2022"));
		return list;
	}
	private static List<Department> getDepartments(){
		List<Department> list = new ArrayList<Department>();
		list.add(new Department("101","총무과"));
		list.add(new Department("102","경리과"));
		list.add(new Department("103","홍보과"));
		list.add(new Department("104","기획과"));
		list.add(new Department("105","산림과"));
		return list;
	}
}
