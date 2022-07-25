package com.scci.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String clsType = request.getParameter("clsType");
		List<Student> result = getStudents(clsType);
		// "result"이름으로 result를 저장 
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("views/studentView.jsp");
		rd.forward(request, response);
	}
	
	protected List<Student> getStudents(String clsType){
		List<Student> result = new ArrayList<Student>();
		switch(clsType) {
		case "kor" :
			result.add(new Student("홍길동", "대한민국", 1503));
			result.add(new Student("임꺽정", "대한민국", 1437));
			result.add(new Student("일지매", "대한민국", 1601));
			break;
		case "eng" :
			result.add(new Student("smith", "usa", 1831));
			result.add(new Student("david", "uk", 1137));
			result.add(new Student("johnadan", "uk", 2981));
			break;
		default:
		}
		return result;
	}
}
