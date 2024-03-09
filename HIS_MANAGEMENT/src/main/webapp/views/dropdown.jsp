<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/byRole/{role}" method="get">
		<label for="role">Select Role:</label> <select name="role" id="role">
			<option value="admin">Admin</option>
			<option value="caseworker">Caseworker</option>
			<!-- Add more options as needed -->
		</select> <input type="submit" value="Submit">
	</form>
</body>
</html>