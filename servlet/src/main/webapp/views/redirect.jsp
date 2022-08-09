<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 형식을 지정 할 때 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>redirect.jsp</title>
</head>
<body>
<p>${param.param1} ${param.param2}</p>
<!--  컨텐츠가 문자열로 인식 되어야 할 때  -->
<p><c:out value="<strong>hello sidney</strong>" escapeXml="true" /></p>
<!-- database나 레파지토리에 저장된 데이터가 html문서 포맷의 문자열일 때 컨텐츠를 그대로(html 형식을 적용 시켜서) 보여지게 할 때  -->
<p><c:out value="<strong>hello sidney</strong>" escapeXml="false" /></p>

<fmt:formatNumber var="num1" value="123456789" type="number" />
<fmt:formatNumber var="num2" value="123456789" type="currency" currencySymbol="$" />
<fmt:formatNumber var="num3" value="123.456789" type="number" pattern="0000.00000000" />
<fmt:formatNumber var="num4" value="123.456789" type="number" pattern="00.00000000" />
<fmt:formatNumber var="num5" value="123.456789" type="number" pattern="####.########" />
<fmt:formatNumber var="num6" value="123.456789" type="number" pattern="##.########" />
<fmt:formatNumber var="num7" value="1.1" type="percent" />
<fmt:formatNumber var="num8" value="0.456789" type="number" pattern="#.########" />
<fmt:formatNumber var="num9" value="0.456789" type="number" pattern="#.########" />
<p>${num1}</p>
<p>${num2}</p>
<p>${num3}</p>
<p>${num4}</p>
<p>${num5}</p>
<p>${num6}</p>
<p>${num7}</p>
<p>${num8}</p>
<p>${num9}</p>
</body>
</html>