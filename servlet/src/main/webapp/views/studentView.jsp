<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보를 보여주는 페이지!</title>
</head>
<body>
	<div>
		<table>
			<thead>
				<tr>
					<th>이름</th>
					<th>주소</th>
					<th>생년월일</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="student" items="${result}">
					<tr>
						<td>${student.name}</td><td>${student.addr}</td><td>${student.birth}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>