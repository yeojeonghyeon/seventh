<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객 정보 조회</title>
</head>
<body>
	<header></header>
	<section class="searchSection">
		<article>
			<form class="searchForm" action="${pageContext.request.contextPath}/customer/list" method="post" >
				<input name="custNm" class="searchIpt" value="${param.custNm}"/>
				<button class="searchBtn">검색</button>
			</form>
		</article>
	</section>
	<section class="container">
		<article class="content">
			<h3>고객 리스트</h3>
			<table>
				<thead>
					<tr>
						<th>고객ID</th>
						<th>고객명</th>
						<th>주소</th>
						<th>전화번호</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${members}" var="member">
						<tr>
							<td>${member.custId}</td>
							<td>${member.custNm}</td>
							<td>${member.address}</td>
							<td>${member.phone}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</article>
	</section>
</body>
</html>