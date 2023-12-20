<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href='<c:url  value="resources/CSS/trainer.css"></c:url>'>
<script src='<c:url value="resources/JS/validation.js"/>'
	type="text/javascript"></script>

</head>
<body>
	<jsp:include page="AdminDashBoard.jsp"></jsp:include>
	<form action="addneawTrainer" method="Get">
		<div class='t'>
			<h2>Add New Trainer</h2>
			<input type='text' placeholder='Enter Name' /> <input type='text'
				placeholder='Enter Email' /> <input type='text'
				placeholder='Enter Contact' /> <input type='date'
				placeholder='Enter DOB' /> <input type='number'
				placeholder='Enter Experience' /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

			<!-- <label>Qualification</label> -->
			<select name="Qualifications"
				style="height: 40px; width: 240px; border-radius: 20px;">
				<option value="">SELECT QUALIFICATION</option>
				<option value="">BE</option>
				<option value="">ME</option>
				<option value="">HSC</option>
			</select><input type='button' name="b" value="+" onclick="addqul()"
				style="height: 40px; width: 40px;"><br>&nbsp;&nbsp;


			<!--<label>SKILLS</label> -->
			<select name="Skills"
				style="height: 40px; width: 240px; border-radius: 20px;">
				<option value="">SELECT SKILLS</option>
				<option value="">C</option>
				<option value="">CPP</option>
				<option value="">JAVA</option>
				<option value="">Adv Java</option>
			</select><input type='button' name="b" value="+"
				style="height: 40px; width: 40px;">


			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

			<!--<label>University</label> -->
			<select name="Univercity"
				style="height: 40px; width: 250px; border-radius: 20px;">
				<option value="">SELECT UNIVERSITY</option>
				<option value="">SBPP</option>
				<option value="">BAMU</option>
				<option value="">BATU</option>
			</select><input type='button' name="b" value="+"
				style="height: 40px; width: 40px;">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;


			<!--<label>College</label> -->
			<select name="colleges"
				style="height: 40px; width: 240px; border-radius: 20px;">
				<option value="">SELECT COLLEGE</option>

				<option value="">DITMS</option>
				<option value="">SSPM</option>
				<option value="">Zeal</option>
				<option value="">Sinhagad</option>
			</select><input type='button' name="b" value="+"
				style="height: 40px; width: 40px;">
			<center>
				<p>
					<input type='Submit' name='T' value='Add New Trainer' />
				</p>
				<center>
					<div id="s1"></div>
					<div id="sd"></div>
		</div>
	</form>
	</div>
	</div>
	</div>
</body>
</html>