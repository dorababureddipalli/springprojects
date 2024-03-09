<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Account Updation</h2>

	<form action="/unlock" method="post">
		<table>
			<%-- <tr>
				<td><h4>${hisCaseWorker.eMail}</h4></td>
			</tr> --%>
			<%-- <tr>
				<td><input type="hidden" name="email" value="${email}"></td>
			</tr> --%>
			<tr>
				<td>Temporary Password:</td>
				<td><input type="password" name="temporaryPassword" required></td>
			</tr>
			<tr>
				<td>New Password:</td>
				<td><input type="password" name="password" id="password"
					required></td>
			</tr>
			<tr>
				<td>Confirm Password:</td>
				<td><input type="password" name="confirmPassword"
					id="confirmPassword" required></td>
			</tr>
		</table>

		<br> <input type="submit" value="submit">
	</form>
</body>
</html>