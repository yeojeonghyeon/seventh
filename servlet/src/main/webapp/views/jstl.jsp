<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="title" value="jstl action tag" scope="page" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl action tag library</title>
</head>
<body>
	<header>
		<h3><c:out value="${title}" /></h3>
	</header>
	<main>
		<section>
			<article>
				<c:if test="${not empty employees}">
					<ul>
						<c:forEach var="employee" items="${employees}">
							<li>${employee.empNm} ${employee.empNo} ${employee.deptNo} ${employee.startDate}</li>
						</c:forEach>
					</ul>
				</c:if>
			</article>
			<article>
				<c:if test="${not empty departments}">
					<ul>
						<c:forEach var="department" items="${departments}">
							<li>${department.deptNo} ${department.deptNm}</li>
						</c:forEach>
					</ul>
				</c:if>
			</article>
		</section>
	</main>
</body>
</html>