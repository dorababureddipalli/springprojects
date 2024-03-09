<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login Form</title>
<style>
body {
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
	background-color: #f8f9fa;
	margin: 0;
	display: flex;
	align-items: center;
	justify-content: center;
	height: 100vh;
}

.login-container {
	background-color: #ffffff;
	box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
	border-radius: 8px;
	overflow: hidden;
	width: 300px;
	text-align: center;
	padding: 20px;
}

table {
	width: 100%;
	border-collapse: separate;
	border-spacing: 0;
}

td {
	padding: 13px;
}

.msg {
	padding: 3px;
}

th {
	background-color: #007bff;
	color: white;
	text-align: center;
	border-radius: 8px;
	opacity: 0.5;
}

td {
	border-bottom: 1px solid #e0e0e0;
}

.inputs {
	width: 100%;
	padding: 10px;
	box-sizing: border-box;
	margin-bottom: 10px;
	border: 1px solid #ced4da;
	border-radius: 8px;
	font-size: 14px;
}

.button {
	width: 100%;
	padding: 12px;
	box-sizing: border-box;
	background-color: #28a745;
	color: white;
	border: none;
	border-radius: 7px;
	cursor: pointer;
	font-size: 16px;
}

.button:hover {
	background-color: #218838;
}
</style>
</head>
<body>

	<div class="login-container">
		<c:form action="/loginHandler" method="post" modelAttribute="hisCredentials">
			<table>
				<tr>
					<td class="msg" colspan="2"><font size=4px color=red>${credRslt}</font></td>
				</tr>
				<tr>
					<th colspan="2"><h2>Login Form</h2></th>
				</tr>
				<tr>
					<td><label for="username">Email:</label></td>
					<td><input class="inputs" type="email" id="username"
						name="eMail" autocomplete="off" required></td>
				</tr>
				<tr>
					<td><label for="password">Password:</label></td>
					<td><input class="inputs" type="password" id="password"
						name="password" autocomplete="off" required></td>
				</tr>
				<tr>
					<td colspan="2">
						<!-- <button type="submit">Login</button> --> <input
						class="button" type="submit" value="Login">
					</td>
				</tr>
			</table>
		</c:form>
	</div>

</body>
</html>
