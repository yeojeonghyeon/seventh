<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- pageContext.request.contextPath http://localhost:8080/HelloWeb -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"></link>
</head>
<body>
	<div class="container">
		<span>${param.firstOperand}&#43;${param.secondOperand}&#61;${param.firstOperand+param.secondOperand}</span>
	</div>
</body>
</html>