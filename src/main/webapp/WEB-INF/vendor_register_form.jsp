<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PayRentUseApp</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<style type="text/css">
label {
	display: inline-block;
	width: 200px;
	margin: 5px;
	text-align: left;
}

input[type=text], input[type=password], select {
	width: 200px;
}

input[type=radio] {
	display: inline-block;
	margin-left: 45px;
}

input[type=checkbox] {
	display: inline-block;
	margin-right: 190px;
}

button {
	padding: 10px;
	margin: 10px;
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-sm navbar-light bg-light m-3">
		<div class="container">
			<a class="navbar-brand" href="#">PayRentUseApp</a>
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/getVendors">Vendors</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/logout">Logout</a></li>

			</ul>
		</div>
	</nav>
	<div align="center">
		<h2>Add a New Vendor</h2>
		<form:form action="${pageContext.request.contextPath}/vendorRegister"
			method="post" modelAttribute="vendor" class="m-4">
			<form:label path="name">Full name:</form:label>
			<form:input path="name" class="form-control-sm my-2"/>
			<br />

			<form:label path="email">E-mail:</form:label>
			<form:input path="email" class="form-control-sm my-2"/>
			<br />

			<form:label path="password">Password:</form:label>
			<form:password path="password" class="form-control-sm my-2"/>
			<br />



			<form:label path="gender">Gender:</form:label>
			<form:radiobutton path="gender" value="Male" class="form-control-sm my-2"/>Male
            <form:radiobutton path="gender" value="Female" class="form-control-sm my-2"/>Female<br />


			<form:label path="phoneNumber">Phone No.</form:label>
			<form:input path="phoneNumber" class="form-control-sm my-2" />
			<br />

			<form:label path="address">Address:</form:label>
			<form:textarea path="address" cols="25" rows="5" class="form-control-sm my-2"/>
			<br />

			<form:button class="btn btn-outline-primary">Add Vendor</form:button>
		</form:form>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
		integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
		crossorigin="anonymous"></script>
</body>
</html>