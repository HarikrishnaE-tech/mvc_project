<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User List</title>
</head>
<body>

<table border="1">
    <thead>
        <tr>
            <th>Userid</th>
            <th>Username</th>
            <th>Email</th>
            <th>Gender</th>
            <th>State</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${userlist}" var="user">
            <tr>
                <td>${user.userid}</td>
                <td>${user.username}</td>
                <td>${user.email}</td>
                <td>${user.gender}</td>
                <td>${user.state}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>
