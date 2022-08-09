<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url var="redirectUrl" value="redirect.jsp">
	<c:param name="param1" value="smith" />
	<c:param name="param2" value="new york" />
</c:url>
<c:redirect url="${redirectUrl}" />