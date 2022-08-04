<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>	
<%@ page import="java.util.ArrayList" %>	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
// 이런 형식으로는 사용하는 빈도가 거의 제로에 가까움.
public static final class Person{
	private String name;
	public Person(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
%>
	<%
	// scriptlet
	// java code 로직을 작성 할 때
	request.setAttribute("person", new Person("김삼순"));
	int cnt = 1;
	pageContext.setAttribute("prop", 20);
	request.setAttribute("prop", 11);
	List<String> names = new ArrayList<String>();
	names.add("a");
	names.add("b");
	names.add("c");
	names.add("d");
	request.setAttribute("names", names);
	request.setAttribute("prop", 11);
	%>
	<p><%=cnt%></p>
	<!-- jsp에서 pageContext, attribute추가 -->
	<c:set var="cnt" value="10" scope="page" />
	<p>${cnt}</p>
	<!-- pageScope > requestScope > sessionScope > applicationScope -->
	<p>${pageScope.prop}</p>
	<p>${requestScope.prop}</p>
	<!-- http://localhost:8080/HelloWeb/views/el.jsp?name=hong&score=10  -->
	<p>${param.name}</p>
	<p>${param.score}</p>
	<ul>
		<c:forEach var="fileName" items="${requestScope.names}">
			<li>${fileName}</li>
		</c:forEach>
	</ul>
	<!--  pojo 클래스의 맴버에 접근 할 때는 getter를 이용, getter 없으면 접근 불가능  -->
	<p>${requestScope.person.name}</p>
</body>
</html>