<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<meta charset="ISO-8859-1">
<title>Contact Form</title>
<style>
body {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
}

form {
	text-align: center;
}

label {
	display: block;
	margin-bottom: 5px;
}

input {
	padding: 8px;
	margin-bottom: 10px;
	width: 300px;
}
.error {
            color: red;
        }
</style>
</head>
<body>

	<form:form action="add" method="post" modelAttribute="contact">
		<label for="contactName">Name:</label>
		<input type="text" id="contactName" name="contactName" required>
		<label for="contactEmail">Email:</label>
		<font id="emailError" class="error"></font><br>
		<input type="email" id="contactEmail" name="contactEmail" required><br>
		 
		<label for="contactMobileNo">Mobile Number:</label>
		<input type="tel" id="contactMobileNo" name="contactMobileNO" required>
		<br>
		<input type="submit" value="Submit">
	</form:form>
	<script>
        $(document).ready(function(){
            $("#contactEmail").blur(function(event){
			$("#emailError").html("");
              var email = $("#contactEmail").val();

                // Make an AJAX request to the server to check if the email exists
                $.ajax({
                    type: "GET",
                    url: "/emailvalidate",
                    data: { email: email },
                    success: function(response){
                        if (response === "Duplicate") {
                            $("#emailError").html("Email already exists.");
                            $("#contactEmail").focus();
                        } /* else {
                            $("#emailError").text("Email is valid.");
                        } */
                    },
                    error: function(){
                        console.error("Error in AJAX request");
                    }
                });
            });
        });
    </script>
</body>
</html>