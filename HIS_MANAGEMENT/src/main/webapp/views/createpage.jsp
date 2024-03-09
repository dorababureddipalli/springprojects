<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<meta charset="ISO-8859-1">
<style>
.error {
	color: red;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>Create User</h2>

		<form action="/createHandler" method="post">
			<font size=4px color=lightgreen>${successMsg}</font>
			<table>
				<tr>
					<td><font id="emailError" class="error"></font></td>
				</tr>

				<tr>
					<td><label for="firstname">First Name:</label></td>
					<td><input type="text" id="firstname" name="firstName"
						required></td>
				</tr>
				<tr>
					<td><label for="lastname">Last Name:</label></td>
					<td><input type="text" id="lastname" name="lastName" required></td>
				</tr>
				<tr>
					<!-- <td><label for="contactEmail">Email:</label>
				<font id="emailError" class="error"></font><br>
				<input type="email" id="contactEmail" name="contactEmail" required><br></td> -->


					<td><label for="contactEmail">Email:</label></td>
					<!--  <td><font id="emailError" class="error"></font></td> -->
					<td><input type="email" id="contactEmail" name="eMail"
						required></td>

				</tr>

				<tr>
					<td><label for="gender">Gender:</label></td>
					<td><input type="radio" id="male" name="gender" value="male"
						required> <label for="male">Male</label> <input
						type="radio" id="female" name="gender" value="female" required>
						<label for="female">Female</label></td>
				</tr>
				<tr>
					<td><label for="role">Role:</label></td>
					<td><select id="role" name="role" required>
							<option value="admin">Admin</option>
							<option value="caseworker">CaseWorker</option>
					</select></td>
				</tr>
			</table>

			<br> <input type="submit" value="Create">
		</form>

		<script>
			$(document).ready(function() {
				$("#myForm").submit(function() {
					// Clear form fields after submission
					$(this).find('input[type=text], textarea').val('');
				});
			});
		</script>

		<script>
			$(document).ready(function() {
				$("#contactEmail").blur(function(event) {
					$("#emailError").html("");
					var email = $("#contactEmail").val();

					// Make an AJAX request to the server to check if the email exists
					$.ajax({
						type : "GET",
						url : "/emailvalidate",
						data : {
							email : email
						},
						success : function(response) {
							if (response === "Duplicate") {
								$("#emailError").html("Email already exists.");
								$("#contactEmail").focus();
							} /* else {
																																				                           $("#emailError").text("Email is valid.");
																																				                       } */
						},
						error : function() {
							console.error("Error in AJAX request");
						}
					});
				});
			});
		</script>
	</div>
</body>

</html>