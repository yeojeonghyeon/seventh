<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--
pageContext.setAttribute("now", new Date());
Date now = new Date(); // 지역 변수, jsp > servlet > service 함수의 지역변수로 생성
-->
<%
Date now = new Date();
%>
<c:set var="now" value="<%=new Date()%>" scope="page" />
<c:set var="str" value="java javascript android" scope="page" />
<p><fmt:formatDate type="time" value="${pageScope.now}"/></p>
<p><fmt:formatDate type="time" value="<%=now%>"/></p>
<p><fmt:formatDate type="date" value="${pageScope.now}"/></p>
<p><fmt:formatDate type="both" value="${pageScope.now}"/></p>
<p><fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss" value="${pageScope.now}"/></p>
<hr>
<p>${fn:substring(str, 0, 4)}</p>
<p>${fn:substring(str, 5, 15)}</p>
<p>${fn:substring(str, 16, 23)}</p>
<c:if test="${fn:contains(str, 'java')}">
	<p>java is exists</p>
</c:if>
<c:if test="${fn:contains(str, 'database')}">
	<p>database is exists</p>
</c:if>
</body>
</html>