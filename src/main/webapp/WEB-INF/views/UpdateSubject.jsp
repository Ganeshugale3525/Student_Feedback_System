<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href='<c:url  value="resources/CSS/Subject.css"></c:url>'/>
<script src='<c:url value="resources/JS/validation.js"/>' type="text/javascript"></script>


</head>
<body>
<jsp:include page="AdminDashBoard.jsp"></jsp:include>
<div class="updateSub">
<h2>Update Subject</h2>
<form name="frm" action="upd" method="get">
<input type="hidden"name ="id"value="${id}">
<input type="text"name="name" value="${n}" onkeyup="subvalidate(this.value)">
<span id="s"></span><br>
<input type="submit" name="s" value="Update Subject">
<h2>${msg}</h2>
</form>
</div>
</div>
</div>
</body>
</html>