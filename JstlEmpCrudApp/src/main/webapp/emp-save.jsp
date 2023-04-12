<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Employee save</h1>
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
</body>
</html>