<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c' %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
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
