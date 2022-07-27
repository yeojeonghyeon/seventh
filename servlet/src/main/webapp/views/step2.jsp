<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.setAttribute("hobby", request.getParameter("hobby"));
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<article>
		<h4>step3</h4>
		<form action="step3.jsp" method="GET">
			<!--  서버로 보낼 때 속성은 name 속성 값으로 구별 -->
			<select name="bloodType">
				<option value="AB">AB</option>
				<option value="A">A</option>
				<option value="B">B</option>
				<option value="O">O</option>
			</select>
			<button type="submit"> go final step!!</button>
		</form>
	</article>	
</body>
</html>