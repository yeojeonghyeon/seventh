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
	<div class="container">
		<div class="d-flex justify-content-center">
			<div class="searchbar">
				<form action="./search" method="post">
					<input class="search_input" type="text" name="content" placeholder="Search..." value="${param.content}"> 
						<button class="search_icon"></button>
				</form>
			</div>
		</div>
	</div>
	
	<section class="container">
		<article>
			<h4 class="mb-3">bootstrap table</h4>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>주문일</th>
						<th>주문가격</th>
						<th>서적명</th>
						<th>출판사</th>
						<th>주문고객명</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="order" items="${orders}">
						<tr>
							<td>${order.ORD_DT}</td>
							<td>${order.SALES_PRICE}</td>
							<td>${order.BOOK_NM}</td>
							<td>${order.PUBLISHER}</td>
							<td>${order.CUST_NM}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</article>
	</section>
</body>
</html>