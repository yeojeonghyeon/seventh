<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="menu/menu">
		<input type=text name="id" value="heygirl"> <input
			type=password name="pwd" value="pwd">
		<button>menu로 고고!!!</button>
	</form>
	<form action="errorPage">
		<button>/error로 고고!!!</button>
	</form>
	<form action="actors">
		<button>/actors gogo!</button>
	</form>
	<form action="customer">
		<input type=text name="custId" value="2016000001">
		<button>/customer gogo!</button>
	</form>
	<form action="insertCustomer" method="post">
		<input type=text name="custId" value="2016000006">
		<input type=text name="custNm" value="차디찬">
		<input type=text name="address" value="서울특별시">
		<input type=text name="phone" value="01077891234">
		<button>/customer gogo!</button>
	</form>
</body>
</html>