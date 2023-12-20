<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h1 {
	text-shadow: 2px 2px darkviolet;
	padding: 100px;
}


div {
  	width: 640px;
	height: 300px;
  background: red;
  position: relative;
  animation: myfirst 9s 2;
  animation-direction: alternate;
  border-radius:50%;
}

@keyframes myfirst {
  0%   {background: red; left: 0px; top: 0px; border-radius:0px;}
  25%  {background: yellow; left: 890px; top: 0px;border-radius:50%;}
  50%  {background: blue; left: 0px; top: 200px;border-radius:90px 0px;}
  75%  {background: green; left: 890px; top: 400px;border-radius:0px 90px;}
  100% {background: red; left: 0px; top: 400px;border-radius:20px;}
}
</style>
</head>
<body>
	<div>
		<h1>${msg}</h1>
	</div>
</body>
</html>