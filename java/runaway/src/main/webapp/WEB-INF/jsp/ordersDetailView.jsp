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
			<form class="searchForm" action="<c:url value="/book/ordersDetail"/>" method="post" >
				<select name="publisher" class="">
					<c:forEach items="${publishers}" var="publisher">
						<option value="${publisher.PUBLISHER}" ${param.publisher eq publisher.PUBLISHER ? "selected" : ""}>${publisher.PUBLISHER}</option>
					</c:forEach>
				</select>
				<input name="bookNm" class="searchIpt" value="${param.bookNm}"/>
				<button class="searchBtn">검색</button>
			</form>
		</article>
	</section>
	<section class="container">
		<article class="content">
			<h3>주문 상세 리스트</h3>
			<table class="tbl">
				<thead>
					<tr>
						<th>주문ID</th>
						<th>판매가격</th>
						<th>주문일자</th>
						<th>책ID</th>
						<th>책단가</th>
						<th>주문수량</th>
						<th>책이름</th>
						<th>출판사</th>
						<th>고객ID</th>
						<th>고객명</th>
						<th>주소</th>
						<th>전화번호</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${orders}" var="order">
						<tr>
							<td>${order.ordId}</td>
							<td>${order.salesPrice}</td>
							<td>${order.ordDt}</td>
							<td>${order.bookId}</td>
							<td>${order.unitPrice}</td>
							<td>${order.qty}</td>
							<td>${order.bookNm}</td>
							<td>${order.publisher}</td>
							<td>${order.custId}</td>
							<td>${order.custNm}</td>
							<td>${order.address}</td>
							<td>${order.phone}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</article>
	</section>
</body>
</html>