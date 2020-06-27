<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Test</title>
</head>
<body>
	<h3>Testing JSPs</h3>
	<%!public int add(int a, int b) {
		return a + b;
	}%>

	<%
		int a = 10, b = 20;
		int k = a + b;
	%>

	The value of K is
	<%=k%>
	<br> The modified value of K is
	<%=add(2367, 87892)%>
	<br>
	<%!int t = -1;%>
	<%
		if (t < 0)
	%>
	<%@include file="Error.jsp"%>

</body>
</html>