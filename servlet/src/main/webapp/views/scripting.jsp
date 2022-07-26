<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	Employee[] employees = new Employee[]{
			new Employee("방탄소년단", "여성청소년계", "경사", true),
			new Employee("아이유", "경리과", "부장", true),
			new Employee("이승환", "경로우대과", "상무", false),
			new Employee("유지태", "방송부", "경사", true),
			new Employee("이달의소녀", "홍보부", "경사", false),
	};
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
			<%
				for(Employee emp : employees){
					
				}
			%>	
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