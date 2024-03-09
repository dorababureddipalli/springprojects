<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table {
	justify-content: center;
}
</style>

</head>
<body>
	<table>
		<form:form action="/send-mail" modelAttribute="mailAttributes" method="POST">
			<tr>
				<td>Enter Mail :</td>
				<td><input type="email" name="sendTo" /></td>
			</tr>
			<tr>
				<td>Enter subject :</td>
				<td><input type="text" name="mailSubject" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</form:form>
	</table>
</body>
</html>