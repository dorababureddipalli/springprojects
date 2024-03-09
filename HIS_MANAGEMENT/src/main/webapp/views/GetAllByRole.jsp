<%@page import="com.entities.HIS_CaseWorker"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>User List</title>
</head>
<body>

	<h2>User List</h2>

	<!-- <form action="/byRole/{role}" method="get">
		<label for="role">Select Role:</label> <select name="role" id="role">
			<option value="admin">Admin</option>
			<option value="caseworker">Caseworker</option>
			Add more options as needed
		</select> <input type="submit" value="Submit">
	</form>
				
				 -->

	<br>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Password</th>
			<th>Email</th>
			<th>Gender</th>
			<th>Role</th>
			<th>Account Status</th>
			<th>Soft Delete</th>
		</tr>
		<%
		List<HIS_CaseWorker> list = (List<HIS_CaseWorker>) request.getAttribute("role");
		for (HIS_CaseWorker hc : list) {
		%>

		<tr>


			<td><%=hc.getId()%></td>
			<td><%=hc.getFirstName()%></td>
			<td><%=hc.getLastName()%></td>
			<td><%=hc.getPassword()%></td>
			<td><%=hc.getEMail()%></td>
			<td><%=hc.getGender()%></td>
			<td><%=hc.getRole()%></td>
			<td><%=hc.getAccStatus()%></td>
			<td><%=hc.getSftDlt()%></td>
		</tr>
		<%
		}
		%>
	</table>

</body>
</html>