<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="${pageContext.request.contextPath}/static/jQuery/jquery-3.6.0.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/common.js"></script>
<link
	href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.css"
	rel="stylesheet"></link>
<!-- fontawesome 추가 -->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
	integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU"
	crossorigin="anonymous">
<!-- member.css 추가 -->
<link href="${pageContext.request.contextPath}/static/css/member.css"
	rel="stylesheet"></link>
</head>
<body>
	<div class="container h-100">
		<div class="d-flex justify-content-center h-100">
			<div class="searchbar">
				<select name="eletronicType">
					<c:forEach var="product" items="${menu}">
						<option value="${product.value}">${product.name}</option>
					</c:forEach>
				</select>
				<input class="search_input" type="text" name="" placeholder="Search...">
					<a href="#" class="search_icon"><i class="fas fa-search"></i></a>
			</div>
		</div>
	</div>
</body>
</html>