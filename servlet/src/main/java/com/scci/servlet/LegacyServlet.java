package com.scci.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// class 자동추가, ctrl + shift + o
public class LegacyServlet extends HttpServlet{
	// form method="GET"
	// parameter를 url에 붙여서 보내는 방식, http://localhost:8080/HelloWeb/StudentServlet?clsType=kor
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String showType = request.getParameter("showType");
		String firstOperand = request.getParameter("firstOperand");
		String secondOperand = request.getParameter("secondOperand");
		
		int result = Integer.parseInt(firstOperand) + Integer.parseInt(secondOperand);
		
		if ( showType.equals("stream") ) {
			PrintWriter pw = response.getWriter();
			String contents = "<!DOCTYPE html>";
			contents += "<html>";
			contents += "	<body>";
			contents += "		<span>"+firstOperand+"+"+secondOperand+"="+result+"</span>";
			contents += "	</body>";
			contents += "</html>";
			pw.print(contents);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("views/legacy.jsp");
			rd.forward(request, response);
		}
	}
	// form method="POST"
	// header 추가, 본문에 추가
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		doGet(request, response);
	}
}
