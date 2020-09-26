<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Student Registration Form</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
			
			First Name: <form:input path="firstName" />
			
			<br><br>
			
			Last Name: <form:input path="lastName" />
			
			<br><br>
			
			Country:
			<form:select path="country">
				<form:option value="Mexico" label="Mexico" />
				<form:option value="Italy" label="Italy" />
				<form:option value="Argentina" label="Argentina" />
				<form:option value="Netherlands" label="Netherlands" />
			</form:select>
			
			<br><br>
			
			<input type="submit" value="Submit" />
			
		</form:form>
		
	</body>
</html>