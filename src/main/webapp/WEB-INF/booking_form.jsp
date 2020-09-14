<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
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
                
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/logout">Logout</a>
                </li>
                
            </ul>
        </div>
    </nav>
    <div align="center">
        <h2>Booking Vehicle</h2>
        <form:form action="${pageContext.request.contextPath}/calculateTotal" method="post" modelAttribute="booking" class="m-4">
        		
        		<form:hidden path="vehicleId"/>
        	
            <form:label path="vehicleId.name" >Vehicle name:</form:label>
            <form:input path="vehicleId.name" readonly="true" class="form-control-sm my-3"/><br/>
             
            <form:label path="vehicleId.type">Vehicle Type:</form:label>
            <form:input path="vehicleId.type" readonly="true" class="form-control-sm my-3"/><br/>
            
             
            <form:label path="vehicleId.rentPerHour">Rent/Hour:</form:label>
            <form:input path="vehicleId.rentPerHour" readonly="true" class="form-control-sm my-3"/><br/>
 			
             <form:label path="noOfHours">No of Hours:</form:label>
            <form:input path="noOfHours" class="form-control-sm my-3"/><br/>
            
            
            
             
            
                 
            <form:button class="btn btn-outline-primary">Proceed To Payment</form:button>
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