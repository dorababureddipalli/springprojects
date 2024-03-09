<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center" >
		<c:form action="stockresponse" modelAttribute="stock" method="get">
			<h1>Stock Market</h1>
			<table>
				<tr>
					<td>CompanyName :</td>
					<td><select name="stockCompanyName">
							<option value="TCS">TCS</option>
							<option value="wipro">wipro</option>
							<option value="MRF">MRF</option>
							<option value="Infosys">Infosys</option>
					</select></td>
				</tr>
				<tr>
					<td>Quantity :</td>
					<td><input type="number" name="stockQuantity"
						placeholder="enter the quantity"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="check"></td>
				</tr>
			</table>
		</c:form>
	</div>
</body>
</html>