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
  
  
    <div class="container p-5 m-3 text-center">
    <caption><h2>Available Vehicles For RENT</h2></caption>
        <table class="table my-5">
            
            <tr>
                <th>Vehicle name</th>
                <th>Vehicle Type</th>
                <th>Active</th>
                <th>Rent/Hour</th>
                <th></th>
                
            </tr>
            <c:forEach var="vehicle" items="${vehicles}">
                <tr>
                    <td><c:out value="${vehicle.name}" /></td>
                    <td><c:out value="${vehicle.type}" /></td>
                    <td><c:out value="${vehicle.active}" /></td>
                    <td><c:out value="${vehicle.rentPerHour}" /></td>
                    <td><a href="${pageContext.request.contextPath}/vehicles/${vehicle.id}/showBookingForm" class="btn btn-outline-primary btn-sm">Book Now</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>