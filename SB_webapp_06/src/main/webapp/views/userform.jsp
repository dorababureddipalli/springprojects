<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
a:link {
	color: black;
	text-decoration: none;
}

a:hover {
	text-decoration: none;
	color: blue;
}
</style>
</head>
<body>
	<div align=center>
		<h3>Adding Employee form</h3>
		<form action="response" method="post">
			<table>
				<tr>
					<td>EmpName :</td>
					<td><input type="text" name="empName"></td>
				</tr>
				<tr>
					<td>EmpMail :</td>
					<td><input type="email" name="empMail"></td>
				</tr>
				<tr>
					<td>empMobile</td>
					<td><input type="text" name="empMobileNo"></td>
				</tr>
				<tr>
				<td>&#160</td>
				<td>&#160</td>
				</tr>
				<tr>
					<td><input type="reset"></td>
					<td><input type="submit" value=ADD></td>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>