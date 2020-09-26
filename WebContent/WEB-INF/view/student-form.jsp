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
				<form:options items="${student.countries}" />
			</form:select>
			
			<br><br>
			
			Favorite Language:
			
			<%-- Java <form:radiobutton path="favoriteLanguage" value="Java" />
			Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
			JavaScript <form:radiobutton path="favoriteLanguage" value="JavaScript" />
			C++ <form:radiobutton path="favoriteLanguage" value="C++" /> --%>
			
			<br><br>
			
			<input type="submit" value="Submit" />
			
		</form:form>
		
	</body>
</html>