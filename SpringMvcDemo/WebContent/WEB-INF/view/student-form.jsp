<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>

<title> student registration form</title>

</head>

<body>



<form:form action="processForm" modelAttribute="student">
First Name : <form:input path="firstName" />

<br> <br>

Last Name : <form:input path="lastName" />

<br> <br>

Country : <form:select path="country">
 <form:options items="${student.countryList}"/>
 </form:select>
 
 <br> <br>
 
 Favourite Language : 
 
 <form:radiobuttons path="favouriteLanguage" items="${student.favouriteLanguageList}"/>
 
  <br> <br>
  
  Operating Systems : 
  
  <form:checkboxes items="${student.operatingSystemList}" path="operatingSystem"/>
 


<br> <br>

<input type="submit" value = "submit" />

</form:form>




</body>




</html>