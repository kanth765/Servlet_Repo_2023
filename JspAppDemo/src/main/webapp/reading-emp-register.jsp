<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String salary = request.getParameter("salary");
	String email = request.getParameter("email");

	out.println("�mp id: " + id + "<br>");
	out.println("�mp name: " + name + "<br>");
	out.println("�mp salary: " + salary + "<br>");
	out.println("�mp email: " + email);

	String country = request.getParameter("country");
	out.println("�mp country " + country);

	String[] params = request.getParameterValues("fl");
	for (String param : params) {
		out.println(param + "<br>");
	}
	%>

</body>
</html>