<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href='<c:url  value="resources/CSS/trainer.css"></c:url>'/>
<script src='<c:url value="resources/JS/validation.js"/>' type="text/javascript"></script>

</head>
<body>
<jsp:include page="AdminDashBoard.jsp"></jsp:include>

 
<div class="v">
<input type="Search" name="name" value="" placeholder="enter the Traniner name" onkeyup="searchTrainer(this.value)">
<span id="p">
<table>
<tr>
<th>Id</th>
<th>Trainer Name</th>
<th>Update</th>
<th>Disable</th>
</tr>
<c:forEach var="v"  items="${Subjects}">
<tr>
<td>${v.getId()}</td>
<td>${v.getName()}</td>
<td><a href="update?id=${v.getId()}&Name=${v.getName()}">Update</a></td>
<td><a href="disable?id=${v.getId()}">Disable</a></td>
</tr>
</c:forEach>
</table>
</span>
</div>
</div>
</div>
</div>
</div>
</body>
</html>