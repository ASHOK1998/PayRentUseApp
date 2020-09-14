<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
	
    <!-- NAVBAR WITH DROPDOWN -->
    <nav class="navbar navbar-expand-sm navbar-light bg-light mb-3">
        <div class="container">
            <a class="navbar-brand" href="">PayRentUseApp</a>
            <ul class="navbar-nav">
                
                <li class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Login</a>
                    <div class="dropdown-menu">
                        <a href="${pageContext.request.contextPath}/showLoginAdminForm" class="dropdown-item">Admin</a>
                        <a href="${pageContext.request.contextPath}/showLoginVendorForm" class="dropdown-item">Vendor</a>
                        <a href="${pageContext.request.contextPath}/showLoginUserForm" class="dropdown-item">User</a>
                    </div>
                </li>
                
            </ul>
        </div>
    </nav>
<div class="container">
<h3>About</h3>
<p>PayRentUseApp is the world's leading provider of Vehicle Hire Software designed for all size of vehicle rental companies. 
For the more than 10 years we have been selling affordable solutions for auto rental businesses to increase efficiency and
 profitability at a very low cost. </p>

<p>Our software has the latest technologies and is designed for global small-to-large rental businesses. Our software products are
 used by hundreds of car rental companies all around the world demanding advanced features in their operations. You can be sure 
 that your daily rental operations will run smoothly.</p>


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