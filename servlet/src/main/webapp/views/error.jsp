<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러 페이지</title>
</head>
<body>
	<div class="container">
		<p>에러가 발생했습니다. 관리자에게 문의 하세요.</p>
		<label>에러 코드 :</label>
		<p>${pageContext.exception.message}</p>
		<p><%=exception.getMessage()%></p>
	</div>
</body>
</html>