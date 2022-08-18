<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home.jsp</title>
<!-- pageContext.request.contextPath => http://localhost:8080/runaway -->
<script src="${pageContext.request.contextPath}/static/jQuery/jquery-3.6.0.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/common.js"></script>
<link href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.css"></link>
</head>
<body>
	<h3>${requestScope.title}</h3>
</body>
</html>