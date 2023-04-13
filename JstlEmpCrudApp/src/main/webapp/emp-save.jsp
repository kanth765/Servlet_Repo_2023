<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>	
<title>Insert title here</title>
</head>
<body>
<h1> Employee save</h1>
<%-- <%@ include file="home.jsp" %> --%>
<form action="save" method="post">
		<table>
			<tr>
				<td>Eno</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>Ename</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Esal</td>
				<td><input type="text" name="salary"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Save"></td>
				<td><input type="reset"></td>
			</tr>
		</table>
	</form>
	<%@ include file="footer.jsp" %>
</body>
</html>