<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forwardedA page</title>
</head>
<body>
	<header><h3>forwarded A</h3></header>
	<div class=container>
		<input type="text" value="${param.whatPage}">
		<input type="text" value="${requestScope.key}">
	</div>
</body>
</html>