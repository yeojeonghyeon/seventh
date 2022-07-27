<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.GregorianCalendar" %>    
<%
// 주석
/*
주석1
주석2
*/
	GregorianCalendar now = new GregorianCalendar();
	String today = String.format("%TY년 %Tm월 %Td일", now, now, now);
%>    
<header>
	<%-- jsp 주석 --%>
	<!-- html 주석  -->
	<h3>업무 시스템 개발 Header, Today : <%=today%></h3>
</header>