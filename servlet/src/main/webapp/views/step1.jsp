<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	HttpSession session = request.getSession();
	session.setAttribute("gender", request.getParameter("gender"));
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<article>
		<h4>step2</h4>
		<form action="step2.jsp" method="GET">
			<!--  서버로 보낼 때 속성은 name 속성 값으로 구별 -->
			<select name="hobby">
				<option value="reading">독서</option>
				<option value="sports">스포츠</option>
				<option value="coding">코딩</option>
			</select>
			<button type="submit"> go step3!!</button>
		</form>
	</article>	
</body>
</html>