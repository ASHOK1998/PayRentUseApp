<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>PayRentUseApp</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
</head>
<body>
<div class="container">
	
  
  
    <nav class="navbar navbar-expand-sm navbar-light bg-light mx-3">
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
  
  <a href="showVendorForm" class="btn btn-outline-primary btn-sm m-3">create Vendor</a>
    <div class="text-center">
    <caption><h2>List of Vendors</h2></caption>
        <table border="1" cellpadding="5" class="table">
            
            <tr >
                
                <th>User name</th>
                <th>Email</th>
                <th>Address</th>
                <th>Gender</th>
                <th>Phone Number</th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
            </tr>
            <c:forEach var="vendor" items="${vendors}">
                <tr>
                    <td><c:out value="${vendor.name}" /></td>
                    <td><c:out value="${vendor.email}" /></td>
                    <td><c:out value="${vendor.address}" /></td>
                    <td><c:out value="${vendor.gender}" /></td>
                    <td><c:out value="${vendor.phoneNumber}" /></td>
                    <td><a href="vendors/${vendor.id}/showVehicleForm" class="btn btn-outline-primary btn-sm">Add Vehicle</a></td>
                    <td><a href="vendors/${vendor.id}/getVehicles" class="btn btn-outline-success btn-sm">Get Vehicles</a></td>
                    <td><a href="showVendorEditForm/${vendor.id}" class="btn btn-outline-warning btn-sm">Update</a></td>
                    <td><a href="deleteVendor/${vendor.id}" class="btn btn-outline-danger btn-sm">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    
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