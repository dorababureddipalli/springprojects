<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.GFG {
	border: 1px solid lightgrey;
	border-radius:2px;
	color: black;
	padding: 1px 5px;
	text-align: center;
	display: inline-block;
	font-size: 15px;
	margin: 10px 30px;
	
}
</style>
</head>
<body>
	<div align="center">
	<h2>Added Successfully..</h2>
		<table>
			<tr>
				<td>EmpName :</td>
				<td>${empObj.empName}</td>
			</tr>
			<tr>
				<td>EmpMail :</td>
				<td>${empObj.empMail}</td>
			</tr>
			<tr>
				<td>empMobile</td>
				<td>${empObj.empMobileNo}</td>
			</tr>
			<tr>
			
			
			<td><a href="input"><button class="GFG">
								go back</button></a></td>
			</tr>

		</table>
	</div>
</body>
</html>