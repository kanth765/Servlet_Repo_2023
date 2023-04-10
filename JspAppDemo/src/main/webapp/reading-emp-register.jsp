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

	out.println("ëmp id: " + id + "<br>");
	out.println("ëmp name: " + name + "<br>");
	out.println("ëmp salary: " + salary + "<br>");
	out.println("ëmp email: " + email);

	String country = request.getParameter("country");
	out.println("ëmp country " + country);

	String[] params = request.getParameterValues("fl");
	for (String param : params) {
		out.println(param + "<br>");
	}
	%>

</body>
</html>