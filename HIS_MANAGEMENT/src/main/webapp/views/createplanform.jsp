<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Create Plan</title>

<!-- Add Bootstrap CSS link -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<style>
body {
	font-family: 'Arial', sans-serif;
	background-color: #f8f9fa;
	padding: 20px;
}

h2 {
	color: #007bff;
}

label {
	font-weight: bold;
	margin-top: 10px;
}

input, textarea, button {
	width: 100%;
	padding: 10px;
	margin-top: 5px;
	margin-bottom: 15px;
	border: 1px solid #ced4da;
	border-radius: 4px;
	box-sizing: border-box;
}

button {
	background-color: #007bff;
	color: #fff;
	cursor: pointer;
}

button:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>

	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-6">

				<h2>Create Plan</h2>

				<form:form action="/createPlan" method="post"
					modelAttribute="createPlan">

					<div class="form-group">
						<label for="planName">Plan Name:</label> <input type="text"
							class="form-control" id="planName" name="planName" required>
					</div>

					<div class="form-group">
						<label for="planDesc">Plan Description:</label>
						<textarea class="form-control" id="planDesc" name="planDesc"
							rows="4" required></textarea>
					</div>

					<div class="form-group">
						<label for="startDate">Start Date:</label> <input type="date"
							class="form-control" id="startDate" name="startDate" required>
					</div>

					<div class="form-group">
						<label for="endDate">End Date:</label> <input type="date"
							class="form-control" id="endDate" name="endDate" required>
					</div>

					<button type="submit" class="btn btn-primary">Create Plan</button>

				</form:form>

			</div>
		</div>
	</div>

	<!-- Add Bootstrap JS and Popper.js links if needed -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
