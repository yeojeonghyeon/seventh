<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>    
<%
	session.setAttribute("bloodType", request.getParameter("bloodType"));
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<article>
		<h4>final step</h4>
	  <%Enumeration<String> names = session.getAttributeNames();
		while(names.hasMoreElements()){
			String name = names.nextElement();
			String value = (String)session.getAttribute(name);%>
			<p><%=name%> : <%=value%></p>
	  <%}%>
	</article>	
</body>
</html>