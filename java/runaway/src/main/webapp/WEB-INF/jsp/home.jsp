<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home.jsp</title>
<!-- pageContext.request.contextPath => http://localhost:8080/runaway -->
<script	src="${pageContext.request.contextPath}/static/jQuery/jquery-3.6.0.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/common.js"></script>
<link href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.css" rel="stylesheet"></link>
</head>
<body>
	<header>
		<!-- Navbar -->
		<nav class="navbar navbar-expand-lg navbar-light bg-white">
			<div class="container-fluid">
				<button class="navbar-toggler" type="button"
					data-mdb-toggle="collapse" data-mdb-target="#navbarExample01"
					aria-controls="navbarExample01" aria-expanded="false"
					aria-label="Toggle navigation">
					<i class="fas fa-bars"></i>
				</button>
				<div class="collapse navbar-collapse" id="navbarExample01">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item active"><a class="nav-link"
							aria-current="page" href="#">Home</a></li>
						<li class="nav-item"><a class="nav-link" href="./member/init">Member</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="./book/init">Book</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="#">About</a></li>
					</ul>
				</div>
			</div>
		</nav>
		<!-- Navbar -->

		<!-- Jumbotron -->
		<div class="p-5 text-center bg-light">
			<h1 class="mb-3">${requestScope.title}</h1>
			<h4 class="mb-3">${requestScope.title}</h4>
			<a class="btn btn-primary" href="" role="button">Call to action</a>
		</div>
		<!-- Jumbotron -->
	</header>
	<section class="container">
		<article>
			<h4 class="mb-3">bootstrap table</h4>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>이름</th>
						<th>주소</th>
						<th>전화번호</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="member" items="${members}">
						<tr>
							<td>${member.name}</td>
							<td>${member.addr}</td>
							<td>${member.cellNo}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</article>
	</section>
</body>
</html>