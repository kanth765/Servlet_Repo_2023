<%@page import="com.ciq.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>scriptlet element with class</h1>

	<%
	out.println(new Employee(1, "anil", 22000.00));
	%>

</body>
</html>