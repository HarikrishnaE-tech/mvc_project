<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>

<div class="container  mt-2 border border-3px black ">
<h1 align="center" style="color:blue;">REGISTRATION FORM</h1>
<form align="center" action="Registrationservlet" method="post" >
<label>Username :</label>
<input class="form-control" type="text" name="username" placeholder="enter the name">
<br>
<label>Password:</label>
<input class="form-control" type="password" name="passwords" placeholder="enter the password">
<br>
<label>Email</label>
<input  class="form-control" type="text" name="email" placeholder="enter the email">
<br>
<label>Gender</label>
<input type="radio" value="male" name="gender">Male
<input  type="radio" value="female" name="gender">female
<br>
<br>

<select name="state">
<option class="form-control" value="Kerala">kerala</option>
<option  class="form-control" value="tamilnadu">Tamilnadu</option>
<option class="form-control"  value="goa">Goa</option>
</select>
<br>
<br>
<input type="submit">





</form>

</div>
</body>
</html>