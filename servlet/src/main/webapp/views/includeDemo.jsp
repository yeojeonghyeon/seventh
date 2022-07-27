<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- jsp 포함 시키면, 서블릿으로 변환할 때 같이 포함 됨. jsp 내장객체가 아닌
식별자 정보(변수, 함수)가 사용 되었을 때 including 하는 자원을 살펴 봐야 함.  -->
<%@ include file="header.jsp"%>
<main>
	<section class="container">
		<h4>본문 <%=today%></h4>
		<article>
			<p>동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세 무궁화 삼천리 화려강사 대한사람 대한으로 길이 보전하세</p>
		<%
			out.println("<p>out.println</p>");
			String name = request.getParameter("name");
		%>
			<p><%=name%></p>
		</article>
	</section>
</main>
</body>
</html>