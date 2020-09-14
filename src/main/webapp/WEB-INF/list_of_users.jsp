<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>

  <h2>Users</h2>
    <div align="left">
        <table border="1" cellpadding="5">
            <caption><h2>List of Users</h2></caption>
            <tr>
                
                <th>User name</th>
                <th>Email</th>
                <th>Address</th>
                <th>Gender</th>
                <th>Phone Number</th>
                <th></th>
                <th></th>
            </tr>
            <c:forEach var="user" items="${listOfusers}">
                <tr>
                    <td><c:out value="${user.name}" /></td>
                    <td><c:out value="${user.email}" /></td>
                    <td><c:out value="${user.address}" /></td>
                    <td><c:out value="${user.gender}" /></td>
                    <td><c:out value="${user.phoneNo}" /></td>
                    <td><a href="showEditForm/${user.id}">Update</a></td>
                    <td><a href="deleteUser/${user.id}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>