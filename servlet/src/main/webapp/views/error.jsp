<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jsp 내에서 error가 발생 했을 때 error.jsp로 요청을 전환하기 위해서 아래와 같이 등록 해 준다 -->    
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러 페이지</title>
</head>
<body>
	<div class="container">
		<p>에러가 발생했습니다. 관리자에게 문의 하세요.</p>
		<label>에러 코드 :</label>
		<!-- jsp el (expression language  -->
		<p>${pageContext.exception.message}</p>
		<!-- jsp scripting element 중 expression -->
		<p><%=exception.getMessage()%></p>
	</div>
</body>
</html>