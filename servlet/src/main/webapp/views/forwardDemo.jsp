<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String whatPage = request.getParameter("whatPage");
	RequestDispatcher rd = request.getRequestDispatcher(whatPage);
	request.setAttribute("key", "from forwardDemo");
	/* 쿠키 생성 */
	Cookie ck1 = new Cookie("cookie1", "12345");
	Cookie ck2 = new Cookie("cookie2", "cookie world");
	Cookie ck3 = new Cookie("whatPage", whatPage);
	response.addCookie(ck1);
	response.addCookie(ck2);
	response.addCookie(ck3);
	rd.forward(request, response);
%>