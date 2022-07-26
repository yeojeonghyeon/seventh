<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
span {
	color: brown;
}
</style>
</head>
<body>
	<div>
		<span>${param.firstOperand}&#43;${param.secondOperand}&#61;${param.firstOperand+param.secondOperand}</span>
	</div>
</body>
</html>