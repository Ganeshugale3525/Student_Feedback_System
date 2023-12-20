<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href='<c:url  value="resources/CSS/Subject.css"></c:url>'>
<script src='<c:url value="resources/JS/validation.js"/>'
	type="text/javascript"></script>
</head>
<body>
	<jsp:include page="AdminDashBoard.jsp"></jsp:include>
	<form name="frm" action="addnewsub" method="get">
		<div class="v">
			<h2>Add New Subject....</h2>
			<input type="text" name="name" value=""
				placeholder="Enter the Subject Name"
				onkeyup="subvalidate(this.value)"> <span id="s"></span><br>
			<input type="submit" name="sb" value="Add Subject">
			<h1 id="msg">${msg}</h1>
		</div>
	</form>
</body>
</html>