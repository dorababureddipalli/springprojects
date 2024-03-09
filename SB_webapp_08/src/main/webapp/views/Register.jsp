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
		<h2>Student Registration Form</h2>
		<form:form action="student" method="post" modelAttribute="students">
			<table>
				<tr>
					<td>FirstName :</td>
					<td><form:input path="fName" /></td>
				</tr>
				<tr>
					<td>LastName :</td>
					<td><form:input path="lName" /></td>
				</tr>
				<tr>
					<td>Email :</td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td>Gender :</td>
					<td>
						<%-- <form:radiobutton path="gender" value="M" />Male <form:radiobutton
							path="gender" value="F" />Female --%> <form:radiobuttons
							path="gender" items="${gender}" />
					</td>
				</tr>
				<tr>
					<td>Course :</td>
					<td><form:select path="course">
							<form:options items="${course}" />
							<%-- <form:option value="">-select-</form:option>
							<form:option value="java">JAVA</form:option>
							<form:option value="python">PYTHON</form:option>
							<form:option value="react">REACT</form:option>
							<form:option value="springboot">SPRINGBOOT</form:option> --%>
						</form:select></td>
				</tr>
				<tr>
					<td>Timings :</td>
					<td>
						<%-- <form:checkbox path="timings" value="morning" />Morning <form:checkbox
							path="timings" value="afternoon" />Afternoon <form:checkbox
							path="timings" value="Evening" />Evening --%> <form:checkboxes
							items="${timings}" path="timings" />
					</td>
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