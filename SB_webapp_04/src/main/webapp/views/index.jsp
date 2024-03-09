<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>Save product Details</h2>
		<form action="saveProduct" method="post">
			<table>
				<tr>
					<td>product ID:</td>
					<td><input type="text" name="pid"></td>
				</tr>
				<tr>
					<td>product Name:</td>
					<td><input type="text" name="pname"></td>
				</tr>
				<tr>
					<td>product Price:</td>
					<td><input type="text" name="price"></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" value="Submit"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>