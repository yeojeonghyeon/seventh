<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="helloBean" class="com.scci.bean.HelloBean" scope="request"/>
<jsp:setProperty name="helloBean" property="name" value="홍길동" />
<jsp:setProperty name="helloBean" property="birth" value="1977" />

<jsp:useBean id="beanFromParameter" class="com.scci.bean.HelloBean" scope="request"/>
<jsp:setProperty name="beanFromParameter" property="*" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:getProperty name="helloBean" property="name" />
	<p>${helloBean.name}</p>
	<p>${beanFromParameter.name} ${beanFromParameter.birth}</p>
</body>
</html>