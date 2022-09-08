<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문 정보 조회</title>
<link href="<c:url value='/static/css/common.css'/>" rel="stylesheet"></link>
</head>
<body>
	<header></header>
	<section class="searchSection">
		<article>
			<form class="searchForm" action="<c:url value="/book/inQty"/>" method="get" >
				<input name="bookNm" class="searchIpt" value="${param.bookNm}"/>
				<button class="searchBtn">검색</button>
			</form>
		</article>
	</section>
	<section class="container">
		<article class="content">
			<h3>입고처, 서적별 입고 정보</h3>
			<table class="tbl">
				<thead>
					<tr>
						<th>입고처명</th>
						<th>서적명</th>
						<th>입고량</th>
						<th>입고금액</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${item}" var="results">
						<tr>
							<td>${item.selNm}</td>
							<td>${item.bookNm}</td>
							<td>${item.qty}</td>
							<td>${item.cost}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</article>
	</section>
</body>
</html>