<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li>${param.id}</li>
		<li>${param.pwd}</li>
	</ul>
	<ul>
		<c:forEach var="actor" items="${results}">
			<li>${actor.actor_id} ${actor.first_name} ${actor.last_name}</li>
		</c:forEach>
	</ul>
</body>
</html>