<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="Error404.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Registration</h1>
	<form action="reading_form_EL.jsp">
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


				<td>Select Country: <select name="country">
						<option>India</option>
						<option>US</option>
						<option>Russia</option>
						<option>Australia</option>
						<option>Canada</option>
				</select> <br> <br>
				</td>

				<td>Choose Favourite Language: <input type="checkbox" name="fl"
					value="Java">Java <input type="checkbox" name="fl"
					value="Python">Python <input type="checkbox" name="fl"
					value="Angular">Angular <input type="checkbox" name="fl"
					value="PLSQL">PLSQL
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Save"></td>
				<td><input type="reset"></td>
			</tr>
		</table>


	</form>


</body>
</html>