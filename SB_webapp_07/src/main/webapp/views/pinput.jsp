<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>Adding Product</h2>
		<form:form action="presult" method="post" modelAttribute="prdctObj">
			<table>
				<tr>
					<td>ProductId :</td>
					<td><form:input path="productId" /></td>
				</tr>
				<tr>
					<td>ProductName :</td>
					<td><form:input path="productName" /></td>
				</tr>
				<tr>
					<td>ProductPrice</td>
					<td><form:input path="productPrice" /></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset" /></td>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>