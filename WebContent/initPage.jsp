<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Using JSPInits</title>
</head>
<body>
	<%!public void jspInit() {
		String defaultUser = getServletConfig().getInitParameter("defaultUser");
		ServletContext context = getServletContext();
		context.setAttribute("defaultUser", defaultUser);
	}%>
	<br>The default user from servlet config is:
	<%=getServletConfig().getInitParameter("defaultUser")%>

	<br>The default user from servlet context is:
	<%=getServletContext().getAttribute("defaultUser")%>

</body>
</html>