<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudetnLogin</title>
 <link rel="stylesheet" href='<c:url  value="resources/CSS/admin.css"></c:url>'>
        <style>
        body{
 background-image: url("resources/img/natu.jpg");
  background-position: center; 
  background-repeat: no-repeat; 
  background-size: cover;
  height:430px;
}
        </style>
</head>
<body>

    <form name="frm" action="log" method="get">
       <div class="adminf">
       <h1>Login Here....</h1>
       <input type="text" name="email" value="" id='s' placeholder="Enter the username">
       <input type="password" name="password" value="" id='h'placeholder="Enter the password" >
       <input type="submit" name="s" value="Submit">
       </div>
       </form>
</body>
</html>