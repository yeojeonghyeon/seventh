<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- pageContext.setAttribute("title", "jstl action tag")  -->
<c:set var="title" value="jstl action tag" scope="page" />
<!--
Student student = request.getAttibute("student");
student.setName("smith");
student.setAddr("new york");
student.setBirth(2005);
-->
<c:set target="${student}" property="name" value="smith" />
<c:set target="${student}" property="addr" value="new york" />
<c:set target="${student}" property="birth" value="2005" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl action tag library</title>
</head>
<body>
	<header>
		<h3>
			<c:out value="${title}" />
		</h3>
	</header>
	<main>
		<section>
			<article>
				<c:if test="${not empty employees}">
					<ul>
						<c:forEach var="employee" items="${employees}">
							<li>${employee.empNm}${employee.empNo} ${employee.deptNo}
								${employee.startDate}</li>
						</c:forEach>
					</ul>
				</c:if>
			</article>
			<article>
				<c:if test="${not empty departments}">
					<ul>
						<c:forEach var="department" items="${departments}">
							<li>${department.deptNo}${department.deptNm}</li>
						</c:forEach>
					</ul>
				</c:if>
			</article>
			<article>
				<h4>forTokens</h4>
				<ul>
					<c:forTokens var="token" items="${tokens}" delims="|" >
						<li><c:out value="${token}" /></li>
					</c:forTokens>
				</ul>
			</article>
			<article>
				<p>${requestScope.student.name} ${requestScope.student.addr} ${requestScope.student.birth}</p>
			</article>			
			<article>
				<c:choose>
					<c:when test="${param.searchType eq 'signer'}">
						<p>가수목록</p>
					</c:when>
					<c:when test="${param.searchType eq 'actor'}">
						<p>배우목록</p>
					</c:when>
					<c:when test="${param.searchType eq 'all'}">
						<p>모두</p>
					</c:when>
				</c:choose>
			</article>			
		</section>
	</main>
</body>
</html>