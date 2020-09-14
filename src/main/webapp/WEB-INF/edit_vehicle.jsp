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

input[type=text], input[type=select], select {
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
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/getVendors">Vendors</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/logout">Logout</a>
                </li>
                
            </ul>
        </div>
    </nav>
	<div align="center">
		<h2>Edit Vehicle</h2>
		<form:form action="${pageContext.request.contextPath}/editVehicle"
			method="post" modelAttribute="vehicle">

			<form:hidden path="id" />
			<form:hidden path="vendor" />

			<form:label path="name">Vehicle name:</form:label>
			<form:input path="name" class="form-control-sm my-3"/>
			<br />

			<form:label path="type">Vehicle Type:</form:label>
			<form:select path="type" class="form-control-sm my-3">
				<form:option value="Car" label="Car" />
				<form:option value="Bike" label="Bike" />
				<form:option value="Truck" label="Truck" />
			</form:select>
			<br />
			<form:label path="rentPerHour">Rent/Hour</form:label>
			<form:input path="rentPerHour" class="form-control-sm my-3"/>
			<br />

			<form:label path="active">Active:</form:label>
			<form:checkbox path="active" class="form-control-sm my-3" />
			<br />

			<form:button class="btn btn-outline-primary">Save</form:button>
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