<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<h3>${requestScope.title}</h3>
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
						<li class="nav-item"><a class="nav-link" href="#">Features</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="#">Pricing</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="#">About</a></li>
					</ul>
				</div>
			</div>
		</nav>
		<!-- Navbar -->

		<!-- Jumbotron -->
		<div class="p-5 text-center bg-light">
			<h1 class="mb-3">Heading</h1>
			<h4 class="mb-3">Subheading</h4>
			<a class="btn btn-primary" href="" role="button">Call to action</a>
		</div>
		<!-- Jumbotron -->
	</header>
</body>
</html>