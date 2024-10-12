<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Loginservlet" method="get">
<label>Enter the email:</label>
<input type="text" name="email">
<br>
<br>
<label>enter the password:</label>
<input type="text"  name="passwords">
<br>
<br>
<br>
<input type="submit">

</form>
<%
String message=(String)request.getAttribute("message");
if(message!=null){
	out.println(message);
}

%>
</body>
</html>