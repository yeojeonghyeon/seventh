package com.scci.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InitParamServlet extends HttpServlet {
	private String encoding;
	@Override
	public void init() throws ServletException {
		encoding = getInitParameter("encoding");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter pw = response.getWriter();
		pw.print("encoding"+encoding);
	}
}
