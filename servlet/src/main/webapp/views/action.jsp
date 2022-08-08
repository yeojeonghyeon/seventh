<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  jsp 표준 action tag include사용 -->
<jsp:include page="sub.jsp">
	<jsp:param name="tableType" value="${param.tableType}" />
</jsp:include>
<jsp:include page="subChoose.jsp">
	<jsp:param name="tableType" value="${param.tableType}" />
</jsp:include>
</body>
</html>