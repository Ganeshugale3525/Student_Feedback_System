<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href='<c:url  value="resources/CSS/Subject.css"></c:url>' />

</head>
<body>
	<jsp:include page="AdminDashBoard.jsp"></jsp:include>

	<from name="frm" action="Std" method="Get">
	 Enter the name:<input type="text" placeholder="Enter the name 0f student"> 
		Enter the Student Subject:<input type="text"placeholder="Enter the subject of the Student"> 
		Enter theStudent qualification:<input type="text"placeholder="Enter the qualification of the Student">
		 Enter the Student TeachersName:<input type="text"placeholder="Enter the Student Techer number">
	 LogIn Allerady ragisterd Student:<input type="button" value="LogIn">
	<a hreaf="url"></a> </from>
	</div>
	</div>

</body>
</html>