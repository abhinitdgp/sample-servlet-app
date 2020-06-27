<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scopes and Contexts</title>
</head>
<body>

	<%
		String username = request.getParameter("name");
		if (username != null && !username.isEmpty()) {
			request.setAttribute("requestUsername", username);
			session.setAttribute("sessionUsername", username);
			application.setAttribute("applicationUsername", username);
			pageContext.setAttribute("pageUsername", username, PageContext.APPLICATION_SCOPE);
		}
	%>
	<br> The user name in request scope is:
	<%=request.getAttribute("requestUsername")%>

	<br> The user name in session scope is:
	<%=session.getAttribute("sessionUsername")%>

	<br> The user name in application scope is:
	<%=application.getAttribute("applicationUsername")%>

	<br> The user name in application scope is:
	<%=pageContext.getAttribute("pageUsername")%>

</body>
</html>