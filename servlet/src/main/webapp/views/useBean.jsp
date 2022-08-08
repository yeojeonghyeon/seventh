<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="student" class="com.scci.servlet.Student" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div.container {
		color: brown;
	}
	div.container article {
		background-color: hotpink;
	}
</style>
</head>
<body>
	<div class="container">
		<article>
			<jsp:getProperty name="student" property="name" />
			<jsp:getProperty name="student" property="addr" />
			<jsp:getProperty name="student" property="birth" />
		</article>
		<article>
			${student.name}
			${student.addr}
			${student.birth}
		</article>
	</div>
</body>
</html>