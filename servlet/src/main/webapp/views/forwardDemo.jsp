<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String whatPage = request.getParameter("whatPage");
	RequestDispatcher rd = request.getRequestDispatcher(whatPage);
	request.setAttribute("key", "from forwardDemo");
	rd.forward(request, response);
%>