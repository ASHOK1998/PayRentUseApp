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

  <nav class="navbar navbar-expand-sm navbar-light bg-light mx-3">
        <div class="container">
            <a class="navbar-brand" href="#">PayRentUseApp</a>
            <ul class="navbar-nav">
                
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/logout">Logout</a>
                </li>
                
            </ul>
        </div>
    </nav>

    <div class="container">
    <caption><h2>List of Bookings</h2></caption>
        <table border="1" cellpadding="5" class="table">
            
            <tr>
                <th>ID</th>
                <th>user name</th>
                <th>Vehicle Name</th>
                <th>No of Hours</th>
                <th>Total Amount</th>
                
            </tr>
            <c:forEach var="booking" items="${bookings}">
                <tr>
                    <td><c:out value="${booking.id}" /></td>
                    <td><c:out value="${booking.userId.name}" /></td>
                    <td><c:out value="${booking.vehicleId.name}" /></td>
                    <td><c:out value="${booking.noOfHours}" /></td>
                    <td><c:out value="${booking.totalAmount}" /></td>
                    
                </tr>
            </c:forEach>
        </table>
        
        <a href="${pageContext.request.contextPath}/vendors/${vendorId}/getVehicles" class="btn btn-outline-primary">Go Back To Vehicles</a>
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