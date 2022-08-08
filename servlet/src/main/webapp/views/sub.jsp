<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- scriptlet 이용 -->    
<%
String tableType = request.getParameter("tableType");
if ( "singer".equals(tableType) ){
%>    
<table>
	<thead>
		<tr>
			<th>순번</th>
			<th>가수</th>
			<th>곡명</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>1</td>
			<td>BTS</td>
			<td>다이너마이트</td>
		</tr>
		<tr>
			<td>2</td>
			<td>아이유</td>
			<td>좋은 날</td>
		</tr>
		<tr>
			<td>3</td>
			<td>이승환</td>
			<td>덩크슛</td>
		</tr>
	</tbody>
</table>
<%
}else if ( "actor".equals(tableType) ){%>
<table>
	<thead>
		<tr>
			<th>순번</th>
			<th>배우</th>
			<th>작품명</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>1</td>
			<td>송강호</td>
			<td>기생충</td>
		</tr>
		<tr>
			<td>2</td>
			<td>주원</td>
			<td>카터</td>
		</tr>
		<tr>
			<td>3</td>
			<td>변요한</td>
			<td>한산</td>
		</tr>
	</tbody>
</table>
<%
}
%>