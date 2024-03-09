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
		<h3>Product Added Successfully..</h3>
		<table>
			<tr>
				<td>ProductId :</td>
				<td>${prdctObj.productId}</td>
			</tr>
			<tr>
				<td>ProductName :</td>
				<td>${prdctObj.productName}</td>
			</tr>
			<tr>
				<td>ProductPrice :</td>
				<td>${prdctObj.productPrice}</td>
			</tr>
			<tr>
				<td></td>
				<td><a href="pform">Back</a></td>
			</tr>
		</table>
	</div>

</body>
</html>