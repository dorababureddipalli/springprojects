<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>

<style>
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
}

h2 {
	background-color: #333;
	color: white;
	text-align: center;
	padding: 15px;
	margin: 0;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #f1f1f1;
}

li {
	float: left;
}

li a, .dropdown-content a {
	display: block;
	color: #333;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover, .dropdown-content a:hover {
	background-color: #ddd;
}

.dropdown {
	display: inline-block;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f9f9f9;
	box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

.dropdown:hover .dropdown-content {
	display: block;
}
</style>
</head>
<body>

	<h2>Welcome to the Health Insurance of New Jersey</h2>

	<ul>
    
    	<li class="dropdown"><a href="#" class="dropbtn">Application Registration
				&#9662;</a>
			<div class="dropdown-content">
				<a href="/registerform">Application Registration</a>
                <a href="#">View Applications</a> 
			</div></li>
        
        <li class="dropdown"><a href="#" class="dropbtn">Data Collection
				&#9662;</a>
			<div class="dropdown-content">
				<a href="#">Create Case</a>
                <a href="#">View Cases</a> 
			</div></li>
        
		<li class="dropdown"><a href="#" class="dropbtn">Admin
				&#9662;</a>
			<div class="dropdown-content">
				<a href="/create">Create Account</a> <a href="/byRole/{role}">view Accounts</a>
                <a href="/showForm">Create Plan</a> 
                 <a href="GetAllByRole.jsp">view Plans</a>
			</div></li>
            
            <li><a href="#">Logout</a></li>
	</ul>

</body>
</html>
