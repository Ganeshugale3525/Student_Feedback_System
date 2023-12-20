<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href='<c:url  value="resources/CSS/AdminDashboard1.css"></c:url>'>
	<link rel="stylesheet" href="resources/CSS/main.css">
<link rel="sylesheet" href="AdminDashboard1.css">
        <link rel="icon" href="img/Screenshot (4).png">
<style>
body {
	background-image: url("resources/img/LACK.webp");
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
	height:auto;
}
</style>

</head>
<body>


 <!-- Navigation Bar -->
    <ul class="navbar">
        <li class="navitem"><a href="admin1">AdminDashBoard</a></li>
        <li class="navitem"><a href="Student">Student</a></li>
        <li class="navitem"><a href="add">Trainer</a></li>
        <li class="navitem"><a href="contact.html">Contact Us</a></li>
        <li class="navitem"><a href="skills.html">Skills</a></li>
        <li class="navitem"><a href="coursse.html">Cource</a></li>

        </ul>
        
        
	<div class="componant">
		<div class="AdminPanal">
			<div class="Admin">
				<table>

					<c:forEach var="d" items="${data}">
						<tr>
							<td>NAME &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:
								&nbsp;${d.getName()}</td>
						</tr>
						<tr>
							<td>UserName : &nbsp;${d.getEmail()}</td>
						</tr>


					</c:forEach>
				</table>
			</div>
			<br> <br>
			<div>

				<h1>Subject Master</h1>
				<ul>
					<li><h3>
							&nbsp;&nbsp;<a href="addsub">New Subject</a>
						</h3></li>
					<li><h3>
							&nbsp;&nbsp;<a href="viewsub">View Subject</a>
						</h3></li>
					<ul>
						<li><h3>
								&nbsp;&nbsp;<a href="ENS" style="font-size: 14px">Enable
									Subject</a>
							</h3></li>
					</ul>

				</ul>
			</div>
			<br> <br> <br>
			<div>
				<h1>Trainer Master</h1>
				<ul>
					<li><h3>
							&nbsp;&nbsp;<a href="add">New Trainer</a>
						</h3></li>
					<li><h3>
							&nbsp;&nbsp;<a href="viewTrainer">View Trainer</a>
						</h3></li>
						<ul>
						<li><h3>
								&nbsp;&nbsp;<a href="ENST"style="font-size: 14px">Enable
									Trainer</a>
							</h3></li>
					</ul>
				</ul>
			</div>
			<div>
				<h1>Student</h1>
				<ul>
					<h3>
						&nbsp;&nbsp;<a href="stud"> New Student</a>
					</h3>
				</ul>
				<ul>
					<h3>
						&nbsp;&nbsp;<a href="">View Student</a>
					</h3>
					
				</ul>
			</div>
			</div>
			<div class="SystemPanal">
				<h1>Wel-Come In Feedback System</h1>

	
			
		
</body>
</html>