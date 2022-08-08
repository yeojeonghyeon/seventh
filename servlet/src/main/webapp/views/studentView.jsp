<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="com.scci.servlet.Student" %>
<jsp:useBean id="helloBean" class="com.scci.bean.HelloBean" scope="request"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보를 보여주는 페이지!</title>
</head>
<body>
	<jsp:getProperty name="helloBean" property="name" />
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
			<!-- 스크립팅 요소 중 scriptlet <%%>  -->
			<%List<Student> lst = (List<Student>)request.getAttribute("result");
			  for(Student student : lst){
			%>
				<tr>
				<!-- 스크립팅 요소 중 expression -->
					<td><%=student.getName()%></td>
					<td><%=student.getAddr()%></td>
					<td><%=student.getBirth()%></td>
				</tr>
			<%	  
			  }
			%>
			</tbody>
		</table>
	</div>
</body>
</html>