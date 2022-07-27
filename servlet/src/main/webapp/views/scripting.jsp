<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"></link>
<script src="${pageContext.request.contextPath}/js/scripting.js" defer></script>
</head>
<%
	/* jsp 내부에 클래스를 사용하기 위해서는 import 해야 함  */
	List<Employee> list;
	Employee[] employees = new Employee[]{
			new Employee("방탄소년단", "여성청소년계", "경사", true),
			new Employee("아이유", "경리과", "부장", true),
			new Employee("이승환", "경로우대과", "상무", false),
			new Employee("유지태", "방송부", "경사", true),
			new Employee("이달의소녀", "홍보부", "경사", false),
	};
%>
<body>
	<div class="container">
		<h4>사원 정보 테이블</h4>
		<table class="mainTable">
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
			%>		
					<tr>
						<td><%=emp.name%></td>
						<td><%=emp.department%></td>
						<td><%=emp.jobPosition%></td>
						<td><%=emp.isCarOwner%></td>
					</tr>	
			<%	}
			%>	
			</tbody>
		</table>
	</div>
	<div>
		<input type=text value="<%=request.getParameter("showType")%>">
		<input type=text value="<%=request.getParameter("firstOperand")%>">
		<input type=text value="<%=request.getParameter("secondOperand")%>">
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