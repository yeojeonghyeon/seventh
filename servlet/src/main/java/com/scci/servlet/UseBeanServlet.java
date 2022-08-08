package com.scci.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UseBeanServlet")
public class UseBeanServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Student stu = new Student("김가연", "서울 특별시 종로구", 2002);
		request.setAttribute("student", stu);
		RequestDispatcher rd = request.getRequestDispatcher("views/useBean.jsp");
		rd.forward(request, response);
	}
}
