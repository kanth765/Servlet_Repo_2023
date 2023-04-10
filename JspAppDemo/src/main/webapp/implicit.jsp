<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Implicit Objects Demo</h1>

	<%
	pageContext.setAttribute("attr", "attr_value", PageContext.APPLICATION_SCOPE);
	String app = (String) application.getAttribute("appScope");
	String user = config.getInitParameter("user");
	String aps = application.getInitParameter("applicationScope");
	String season=(String)session.getAttribute("season");
	pageContext.getAttribute("attr");
	%>


	<p><%=app%></p>
	<p><%=user%></p>
	<p><%=aps%></p>
	<p><%=season%></p>



	<%-- 	<p>${weather}</p> --%>

	<%-- 	<p>${session.season}</p> --%>

	<%-- 	<p>${application.application-scope}</p> --%>
</body>
</html>