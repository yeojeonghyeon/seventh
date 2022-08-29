<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예외 처리 발생시 여기로!!!!</title>
</head>
<body>
<p>${pageContext.exception.message}</p>
</body>
</html>