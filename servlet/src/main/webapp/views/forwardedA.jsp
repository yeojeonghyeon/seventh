<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forwardedA page</title>
<script>
document.addEventListener("DOMContentLoaded", function(){
	var cookies = document.cookie;
	document.querySelector("#cookieArea").innerText = cookies;
});
</script>
</head>
<body>
	<header><h3>forwarded A</h3></header>
	<div class=container>
		<input type="text" value="${param.whatPage}">
		<input type="text" value="${requestScope.key}">
		<lable>cookie</lable>
		<textarea id="cookieArea" multiple></textarea>
	</div>
	<div>
		  <%Cookie[] cookies = request.getCookies();
			for(Cookie cookie : cookies){%>
				<p><%=cookie.getName()%> : <%=cookie.getValue()%></p> 
		  <%}%>
	</div>
</body>
</html>