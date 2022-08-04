<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h2>${message}</h2>
    <ul>
    	<c:forEach var="fileName" items="${requestScope.files}">
    		<li>${fileName}</li>
    	</c:forEach>
    </ul>
</body>
</html>