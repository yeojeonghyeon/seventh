<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%

%>
<body>
	<div>
		<table>
			<thead>
				<tr>
					<th>이름</th>
					<th>부서</th>
					<th>직급</th>
					<th>차량소유여부</th>
				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>
	</div>
</body>
</html>
<%!
	final static double PI = 3.14;

	public int sum(int x, int y){
		return x+y;
	}
	static final class Employee{
		String name;
		String department;
		String jobPosition;
		boolean isCarOwner;
		Employee(String name, String department, String jobPosition, boolean isCarOwner){
			this.name = name;
			this.department = department;
			this.jobPosition = jobPosition;
			this.isCarOwner = isCarOwner;
		}
	}
%>