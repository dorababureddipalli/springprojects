<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Registration Form</title>
<!-- Include Bootstrap CSS (Ensure you have Bootstrap included in your project) -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body {
	display: flex;
	align-items: center;
	justify-content: center;
	height: 100vh;
	margin: 0;
}

.form-container {
	width: 400px;
	border: 1px solid #ced4da;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	padding: 20px;
	margin-top: 30px;
}
</style>
</head>
<body>
	<div class="form-container">
		<font color=lightgreen>${msg}</font>
		<h2 class="text-center">Registration Form</h2>
		<c:form action="/registerHandler" method="post"
			modelAttribute="hisRegistration">
			<!-- Rest of the form fields remain unchanged -->
			<!-- First Name -->
			<div class="mb-3">
				<label for="firstName" class="form-label">First Name:</label> <input
					type="text" class="form-control" id="firstName" name="firstName"
					required>
			</div>

			<!-- Last Name -->
			<div class="mb-3">
				<label for="lastName" class="form-label">Last Name:</label> <input
					type="text" class="form-control" id="lastName" name="lastName"
					required>
			</div>

			<!-- Date of Birth -->
			<div class="mb-3">
				<label for="dob" class="form-label">Date of Birth:</label> <input
					type="date" class="form-control" id="dob" name="dob" required>
			</div>

			<!-- Gender -->
			<div class="mb-3">
				<label class="form-label">Gender:</label>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="gender"
						id="male" value="Male" required> <label
						class="form-check-label" for="male">Male</label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="gender"
						id="female" value="Female" required> <label
						class="form-check-label" for="female">Female</label>
				</div>
			</div>

			<!-- SSN -->
			<div class="mb-3">
				<label for="ssn" class="form-label">SSN:</label> <input type="text"
					class="form-control" id="ssn" name="ssn" pattern="[0-9]{12}"
					title="SSN must be a 12-digit number" required>
			</div>

			<!-- Phone Number -->
			<div class="mb-3">
				<label for="phoneNo" class="form-label">Phone Number:</label> <input
					type="tel" class="form-control" id="phoneNo" name="phoneNo"
					pattern="[0-9]{10}" title="Phone number must be a 10-digit number"
					required>
			</div>

			<!-- Email -->
			<div class="mb-3">
				<label for="email" class="form-label">Email:</label> <input
					type="email" class="form-control" id="email" name="email" required>
			</div>
			<!-- Submit Button -->
			<div class="mb-3 text-center">
				<button type="submit" class="btn btn-primary">Submit</button>
			</div>
		</c:form>
	</div>
	<!-- Include Bootstrap JS (Ensure you have Bootstrap included in your project) -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>