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

	empId:
	<p>${param.id}</p>
	empName:
	<p>${param.name}</p>
	empSalary:
	<p>${param.salary}</p>
	empEmail:
	<p>${param.email}</p>

	<%

	%>

	empId:
	<p>${employee.id}</p>
	empName:
	<p>${employee.name}</p>
	empSalary:
	<p>${employee.salary}</p>

</body>
</html>