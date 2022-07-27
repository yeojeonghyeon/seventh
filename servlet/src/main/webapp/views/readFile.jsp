<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.BufferedReader" %>    
<%@ page import="java.io.FileReader" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 읽기 예제</title>
</head>
<body>
<%
	String path = application.getRealPath("/WEB-INF/example.txt");
	BufferedReader br = new BufferedReader(new FileReader(path));
	while(true){
		String line = br.readLine();
		if ( line == null ) break;%>
		<p><%=line%></p>
  <%}%>
</body>
</html>